package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SharedAudioCell;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

public class SelectAudioAlert extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    private UniversalAdapter adapter;
    private MessageObject downloadingMessageObject;
    private Runnable loadSharedAudioRunnable;
    private boolean loadingLocalAudio;
    private boolean loadingSharedAudio;
    private final boolean local;
    private final ArrayList localAudio;
    private int nextSearchRate;
    private final Utilities.Callback onAudioSelected;
    private final SelectAudioAlert parentAlert;
    private String query;
    private final MessagesController.SavedMusicList savedMusicList;
    private final FrameLayout searchField;
    private final FrameLayout searchFieldContainer;
    private final EditTextCaption searchFieldEditText;
    private final ArrayList sharedAudio;
    private boolean sharedAudioHasMore;
    private final int tag;

    @Override
    public void onFailedDownload(String str, boolean z) {
    }

    @Override
    public void onProgressDownload(String str, long j, long j2) {
    }

    @Override
    public void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    public SelectAudioAlert(Context context, Utilities.Callback callback) {
        this(context, false, null, callback);
    }

    public SelectAudioAlert(Context context, final boolean z, SelectAudioAlert selectAudioAlert, final Utilities.Callback callback) {
        super(context, null, true, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, new DarkThemeResourceProvider());
        this.localAudio = new ArrayList();
        this.sharedAudio = new ArrayList();
        this.loadSharedAudioRunnable = new Runnable() {
            @Override
            public final void run() {
                SelectAudioAlert.this.loadSharedAudio();
            }
        };
        this.topPadding = 0.35f;
        fixNavigationBar();
        setSlidingActionBar();
        this.headerPaddingTop = AndroidUtilities.dp(4.0f);
        this.headerPaddingBottom = AndroidUtilities.dp(-10.0f);
        this.local = z;
        this.tag = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        this.parentAlert = selectAudioAlert;
        this.onAudioSelected = callback;
        FrameLayout frameLayout = new FrameLayout(context);
        this.searchFieldContainer = frameLayout;
        int i = this.backgroundPaddingLeft;
        frameLayout.setPadding(i, 0, i, 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.searchField = frameLayout2;
        frameLayout2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(36.0f), getThemedColor(Theme.key_graySection)));
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, -2.0f, 119, 8.0f, 6.0f, 8.0f, 6.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_browser_search);
        int i2 = Theme.key_graySectionText;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i2), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout2.addView(imageView, LayoutHelper.createFrame(36, 36.0f, 19, 4.0f, 0.0f, 0.0f, 0.0f));
        EditTextCaption editTextCaption = new EditTextCaption(context, this.resourcesProvider);
        this.searchFieldEditText = editTextCaption;
        editTextCaption.setTextSize(1, 15.0f);
        editTextCaption.setTextColor(-1);
        editTextCaption.setHintTextColor(getThemedColor(i2));
        editTextCaption.setHint(LocaleController.getString(R.string.Search));
        editTextCaption.setBackground(null);
        editTextCaption.setLines(1);
        editTextCaption.setMaxLines(1);
        editTextCaption.setSingleLine();
        editTextCaption.setGravity(19);
        editTextCaption.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        frameLayout2.addView(editTextCaption, LayoutHelper.createFrame(-1, 36.0f, 16, 40.0f, 0.0f, 10.0f, 0.0f));
        editTextCaption.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String str = SelectAudioAlert.this.query;
                SelectAudioAlert.this.query = editable.toString();
                if (!z) {
                    SelectAudioAlert.this.sharedAudio.clear();
                    if (TextUtils.isEmpty(str) || !TextUtils.isEmpty(SelectAudioAlert.this.query)) {
                        SelectAudioAlert.this.loadSharedAudioDelayed();
                    } else {
                        SelectAudioAlert.this.loadSharedAudio();
                    }
                }
                SelectAudioAlert.this.adapter.update(true);
            }
        });
        RecyclerListView recyclerListView = this.recyclerListView;
        int i3 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i3, 0, i3, 0);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        if (!z) {
            int i4 = this.currentAccount;
            MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(i4, UserConfig.getInstance(i4).getClientUserId());
            this.savedMusicList = savedMusicList;
            savedMusicList.load();
            loadSharedAudio();
        } else {
            this.savedMusicList = null;
            loadLocalAudio();
        }
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i5) {
                SelectAudioAlert.this.lambda$new$0(callback, view, i5);
            }
        });
    }

    public void lambda$new$0(Utilities.Callback callback, View view, int i) {
        if (view instanceof SharedAudioCell) {
            MessageObject message = ((SharedAudioCell) view).getMessage();
            if (message == null) {
                return;
            }
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            if (this.downloadingMessageObject != null) {
                FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.downloadingMessageObject.getDocument());
                this.downloadingMessageObject = null;
            }
            if (!message.attachPathExists && !message.mediaExists) {
                String fileName = message.getFileName();
                if (TextUtils.isEmpty(fileName)) {
                    return;
                }
                this.downloadingMessageObject = message;
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(fileName, message, this);
                FileLoader.getInstance(this.currentAccount).loadFile(message.getDocument(), message, 1, 0);
                return;
            }
            done(message);
            return;
        }
        UItem item = this.adapter.getItem(i - 1);
        if (item != null && item.id == 1) {
            new SelectAudioAlert(getContext(), true, this, callback).show();
            return;
        }
        if (item != null && item.id == 2) {
            this.savedMusicList.load();
        } else {
            if (item == null || item.id != 3) {
                return;
            }
            loadSharedAudio();
        }
    }

    private void done(MessageObject messageObject) {
        this.onAudioSelected.run(messageObject);
        SelectAudioAlert selectAudioAlert = this.parentAlert;
        if (selectAudioAlert != null) {
            selectAudioAlert.lambda$new$0();
        }
        lambda$new$0();
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.StoryMusicTitle);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.musicListLoaded) {
            this.adapter.update(true);
        }
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                SelectAudioAlert.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asCustom(this.searchFieldContainer));
        if (!this.local) {
            arrayList.add(UItem.asButton(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles)).accent());
        }
        if (!this.local) {
            if (this.savedMusicList != null) {
                addSection(arrayList, LocaleController.getString(R.string.StoryMusicProfileMusic), this.savedMusicList.list);
                MessagesController.SavedMusicList savedMusicList = this.savedMusicList;
                if (!savedMusicList.endReached) {
                    arrayList.add(UItem.asButton(2, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore)).accent());
                } else if (savedMusicList.list.isEmpty()) {
                    arrayList.add(UItem.asShadow(null));
                }
            }
            addSection(arrayList, LocaleController.getString(R.string.StoryMusicSearchMusic), this.sharedAudio);
            ArrayList arrayList2 = this.sharedAudio;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                if (this.sharedAudioHasMore) {
                    arrayList.add(UItem.asButton(3, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore)).accent());
                } else {
                    arrayList.add(UItem.asShadow(null));
                }
            }
        } else {
            addSection(arrayList, LocaleController.getString(R.string.StoryMusicLocalMusic), this.localAudio);
            arrayList.add(UItem.asShadow(null));
        }
        if (TextUtils.isEmpty(this.query)) {
            return;
        }
        arrayList.add(UItem.asShadow(null));
        arrayList.add(UItem.asSpace(AndroidUtilities.dp(500.0f)));
    }

    private void addSection(ArrayList arrayList, String str, ArrayList arrayList2) {
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        String str2 = this.query;
        String lowerCase = str2 == null ? null : str2.toLowerCase();
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            MessageObject messageObject = (MessageObject) it.next();
            if (TextUtils.isEmpty(lowerCase) || arrayList2 == this.sharedAudio) {
                messageObject.setQuery(null);
                arrayList3.add(messageObject);
            } else {
                String musicTitle = messageObject.getMusicTitle();
                String musicAuthor = messageObject.getMusicAuthor();
                if (matches(lowerCase, translitSafe, musicTitle) || matches(lowerCase, translitSafe, musicAuthor)) {
                    messageObject.setQuery(this.query);
                    arrayList3.add(messageObject);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        arrayList.add(UItem.asGraySection(str));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList.add(SharedAudioCell.Factory.as((MessageObject) it2.next()));
        }
    }

    private boolean matches(String str, String str2, String str3) {
        if (str3 == null) {
            return false;
        }
        String lowerCase = str3.toLowerCase();
        if (!lowerCase.startsWith(str)) {
            if (!lowerCase.contains(" " + str)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                if (!translitSafe.startsWith(str2)) {
                    if (!translitSafe.contains(" " + str2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void loadSharedAudioDelayed() {
        AndroidUtilities.cancelRunOnUIThread(this.loadSharedAudioRunnable);
        AndroidUtilities.runOnUIThread(this.loadSharedAudioRunnable, 400L);
    }

    public void loadSharedAudio() {
        if (this.local || this.loadingSharedAudio) {
            return;
        }
        if (this.sharedAudio.isEmpty() || this.sharedAudioHasMore) {
            this.loadingSharedAudio = true;
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
            tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
            String str = this.query;
            if (str == null) {
                str = "";
            }
            tL_messages_searchGlobal.q = str;
            tL_messages_searchGlobal.limit = 20;
            ArrayList arrayList = this.sharedAudio;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = this.sharedAudio;
                MessageObject messageObject = (MessageObject) arrayList2.get(arrayList2.size() - 1);
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                tL_messages_searchGlobal.offset_rate = this.nextSearchRate;
                tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
            } else {
                tL_messages_searchGlobal.offset_rate = 0;
                tL_messages_searchGlobal.offset_id = 0;
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    SelectAudioAlert.this.lambda$loadSharedAudio$2(tLObject, tL_error);
                }
            });
        }
    }

    public void lambda$loadSharedAudio$2(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SelectAudioAlert.this.lambda$loadSharedAudio$1(tLObject);
            }
        });
    }

    public void lambda$loadSharedAudio$1(TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
            Iterator<TLRPC.Message> it = messages_messages.messages.iterator();
            while (it.hasNext()) {
                this.sharedAudio.add(new MessageObject(this.currentAccount, it.next(), false, true));
            }
            this.sharedAudioHasMore = (messages_messages instanceof TLRPC.TL_messages_messagesSlice) && this.sharedAudio.size() < messages_messages.count;
            this.nextSearchRate = messages_messages.next_rate;
            this.loadingSharedAudio = false;
            this.adapter.update(true);
        }
    }

    private void loadLocalAudio() {
        if (this.local && !this.loadingLocalAudio) {
            this.loadingLocalAudio = true;
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    SelectAudioAlert.this.lambda$loadLocalAudio$4();
                }
            });
        }
    }

    public void lambda$loadLocalAudio$4() {
        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
        final ArrayList arrayList = new ArrayList();
        try {
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
            int i = -2000000000;
            while (query.moveToNext()) {
                try {
                    MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                    audioEntry.id = query.getInt(0);
                    audioEntry.author = query.getString(1);
                    audioEntry.title = query.getString(2);
                    audioEntry.path = query.getString(3);
                    audioEntry.duration = (int) (query.getLong(4) / 1000);
                    audioEntry.genre = query.getString(5);
                    File file = new File(audioEntry.path);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.out = true;
                    tL_message.id = i;
                    tL_message.peer_id = new TLRPC.TL_peerUser();
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.from_id = tL_peerUser;
                    TLRPC.Peer peer = tL_message.peer_id;
                    long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                    tL_peerUser.user_id = clientUserId;
                    peer.user_id = clientUserId;
                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                    tL_message.message = "";
                    tL_message.attachPath = audioEntry.path;
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.flags |= 3;
                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                    tL_message.flags |= 768;
                    String fileExtension = FileLoader.getFileExtension(file);
                    TLRPC.Document document = tL_message.media.document;
                    document.id = 0L;
                    document.access_hash = 0L;
                    document.file_reference = new byte[0];
                    document.date = tL_message.date;
                    StringBuilder sb = new StringBuilder();
                    sb.append("audio/");
                    if (fileExtension.length() <= 0) {
                        fileExtension = "mp3";
                    }
                    sb.append(fileExtension);
                    document.mime_type = sb.toString();
                    tL_message.media.document.size = (int) file.length();
                    tL_message.media.document.dc_id = 0;
                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                    tL_documentAttributeAudio.duration = audioEntry.duration;
                    tL_documentAttributeAudio.title = audioEntry.title;
                    tL_documentAttributeAudio.performer = audioEntry.author;
                    tL_documentAttributeAudio.flags = 3 | tL_documentAttributeAudio.flags;
                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_documentAttributeFilename.file_name = file.getName();
                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                    MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, false, true);
                    audioEntry.messageObject = messageObject;
                    arrayList.add(messageObject);
                    i--;
                } finally {
                }
            }
            query.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SelectAudioAlert.this.lambda$loadLocalAudio$3(arrayList);
            }
        });
    }

    public void lambda$loadLocalAudio$3(ArrayList arrayList) {
        this.loadingLocalAudio = false;
        this.localAudio.addAll(arrayList);
        this.adapter.update(true);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override
    public void onSuccessDownload(String str) {
        MessageObject messageObject = this.downloadingMessageObject;
        if (messageObject == null || !TextUtils.equals(messageObject.getFileName(), str)) {
            return;
        }
        done(this.downloadingMessageObject);
    }

    @Override
    public int getObserverTag() {
        return this.tag;
    }
}
