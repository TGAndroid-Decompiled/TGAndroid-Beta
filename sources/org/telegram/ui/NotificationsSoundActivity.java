package org.telegram.ui;

import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.ringtone.RingtoneDataStore;
import org.telegram.messenger.ringtone.RingtoneUploader;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_account_saveRingtone;
import org.telegram.tgnet.TLRPC$TL_document;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.tgnet.TLRPC$TL_inputDocument;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CreationTextCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.NotificationsSoundActivity;

public class NotificationsSoundActivity extends BaseFragment implements ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate, NotificationCenter.NotificationCenterDelegate {
    Adapter adapter;
    ChatAvatarContainer avatarContainer;
    ChatAttachAlert chatAttachAlert;
    int currentType;
    long dialogId;
    int dividerRow;
    int dividerRow2;
    Ringtone lastPlayedRingtone;
    RecyclerListView listView;
    Theme.ResourcesProvider resourcesProvider;
    int rowCount;
    Tone selectedTone;
    boolean selectedToneChanged;
    SparseArray<Tone> selectedTones;
    NumberTextView selectedTonesCountTextView;
    ArrayList<Tone> serverTones;
    int serverTonesEndRow;
    int serverTonesHeaderRow;
    int serverTonesStartRow;
    private int stableIds;
    private Tone startSelectedTone;
    ArrayList<Tone> systemTones;
    int systemTonesEndRow;
    int systemTonesHeaderRow;
    int systemTonesStartRow;
    private final int tonesStreamType;
    long topicId;
    int uploadRow;
    ArrayList<Tone> uploadingTones;

    public static boolean lambda$createView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public void didSelectPhotos(ArrayList arrayList, boolean z, int i) {
        ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate.CC.$default$didSelectPhotos(this, arrayList, z, i);
    }

    @Override
    public void startMusicSelectActivity() {
        ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate.CC.$default$startMusicSelectActivity(this);
    }

    public NotificationsSoundActivity(Bundle bundle, Theme.ResourcesProvider resourcesProvider) {
        super(bundle);
        this.serverTones = new ArrayList<>();
        this.systemTones = new ArrayList<>();
        this.uploadingTones = new ArrayList<>();
        this.stableIds = 100;
        this.selectedTones = new SparseArray<>();
        this.currentType = -1;
        this.tonesStreamType = 4;
        this.topicId = 0L;
        this.resourcesProvider = resourcesProvider;
    }

    @Override
    public boolean onFragmentCreate() {
        String str;
        String str2;
        if (getArguments() != null) {
            this.dialogId = getArguments().getLong("dialog_id", 0L);
            this.topicId = getArguments().getLong("topic_id", 0L);
            this.currentType = getArguments().getInt("type", -1);
        }
        long j = this.dialogId;
        if (j != 0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j, this.topicId);
            str2 = "sound_document_id_" + sharedPrefKey;
            str = "sound_path_" + sharedPrefKey;
        } else {
            int i = this.currentType;
            if (i == 1) {
                str = "GlobalSoundPath";
                str2 = "GlobalSoundDocId";
            } else if (i == 0) {
                str = "GroupSoundPath";
                str2 = "GroupSoundDocId";
            } else if (i == 2) {
                str = "ChannelSoundPath";
                str2 = "ChannelSoundDocId";
            } else if (i == 3) {
                str = "StoriesSoundPath";
                str2 = "StoriesSoundDocId";
            } else if (i == 4 || i == 5) {
                str = "ReactionSoundPath";
                str2 = "ReactionSoundDocId";
            } else {
                throw new RuntimeException("Unsupported type");
            }
        }
        SharedPreferences notificationsSettings = getNotificationsSettings();
        long j2 = notificationsSettings.getLong(str2, 0L);
        String string = notificationsSettings.getString(str, "NoSound");
        Tone tone = new Tone(null);
        this.startSelectedTone = tone;
        if (j2 != 0) {
            tone.document = new TLRPC$TL_document();
            this.startSelectedTone.document.id = j2;
        } else {
            tone.uri = string;
        }
        return super.onFragmentCreate();
    }

    @Override
    public Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    @Override
    public View createView(final Context context) {
        this.actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_avatar_actionBarSelectorBlue, this.resourcesProvider), false);
        this.actionBar.setItemsColor(Theme.getColor(Theme.key_actionBarDefaultIcon, this.resourcesProvider), false);
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1(context));
        AnonymousClass1 anonymousClass1 = null;
        if (this.dialogId == 0) {
            int i = this.currentType;
            if (i == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundPrivate));
            } else if (i == 0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundGroup));
            } else if (i == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundChannels));
            } else if (i == 3) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundStories));
            } else if (i == 5 || i == 4) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundReactions));
            }
        } else {
            ChatAvatarContainer chatAvatarContainer = new ChatAvatarContainer(context, null, false, this.resourcesProvider);
            this.avatarContainer = chatAvatarContainer;
            chatAvatarContainer.setOccupyStatusBar(!AndroidUtilities.isTablet());
            this.actionBar.addView(this.avatarContainer, 0, LayoutHelper.createFrame(-2, -1.0f, 51, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f));
            if (this.dialogId >= 0) {
                TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.dialogId));
                if (user != null) {
                    this.avatarContainer.setUserAvatar(user);
                    this.avatarContainer.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            } else if (this.topicId != 0) {
                TLRPC$TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.dialogId, this.topicId);
                ForumUtilities.setTopicIcon(this.avatarContainer.getAvatarImageView(), findTopic, false, true, this.resourcesProvider);
                this.avatarContainer.setTitle(findTopic.title);
            } else {
                TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
                this.avatarContainer.setChatAvatar(chat);
                this.avatarContainer.setTitle(chat.title);
            }
            this.avatarContainer.setSubtitle(LocaleController.getString(R.string.NotificationsSound));
        }
        ActionBarMenu createActionMode = this.actionBar.createActionMode();
        NumberTextView numberTextView = new NumberTextView(createActionMode.getContext());
        this.selectedTonesCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedTonesCountTextView.setTypeface(AndroidUtilities.bold());
        this.selectedTonesCountTextView.setTextColor(Theme.getColor(Theme.key_actionBarActionModeDefaultIcon, this.resourcesProvider));
        createActionMode.addView(this.selectedTonesCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, 72, 0, 0, 0));
        this.selectedTonesCountTextView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$createView$0;
                lambda$createView$0 = NotificationsSoundActivity.lambda$createView$0(view, motionEvent);
                return lambda$createView$0;
            }
        });
        createActionMode.addItemWithWidth(2, R.drawable.msg_forward, AndroidUtilities.dp(54.0f), LocaleController.getString(R.string.ShareFile));
        createActionMode.addItemWithWidth(1, R.drawable.msg_delete, AndroidUtilities.dp(54.0f), LocaleController.getString(R.string.Delete));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        frameLayout.addView(recyclerListView, LayoutHelper.createFrame(-1, -1.0f));
        Adapter adapter = new Adapter(this, anonymousClass1);
        this.adapter = adapter;
        adapter.setHasStableIds(true);
        this.listView.setAdapter(this.adapter);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setSupportsChangeAnimations(false);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(false);
        this.listView.setLayoutManager(new LinearLayoutManager(context));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                NotificationsSoundActivity.this.lambda$createView$1(context, view, i2);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i2) {
                boolean lambda$createView$2;
                lambda$createView$2 = NotificationsSoundActivity.this.lambda$createView$2(view, i2);
                return lambda$createView$2;
            }
        });
        loadTones();
        updateRows();
        return this.fragmentView;
    }

    public class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        final Context val$context;

        public static void lambda$deleteSelectedMessages$2(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        }

        AnonymousClass1(Context context) {
            this.val$context = context;
        }

        @Override
        public void onItemClick(int i) {
            if (i == -1) {
                if (((BaseFragment) NotificationsSoundActivity.this).actionBar.isActionModeShowed()) {
                    NotificationsSoundActivity.this.hideActionMode();
                    return;
                } else {
                    NotificationsSoundActivity.this.lambda$onBackPressed$308();
                    return;
                }
            }
            if (i == 1) {
                AlertDialog.Builder builder = new AlertDialog.Builder(NotificationsSoundActivity.this.getParentActivity(), NotificationsSoundActivity.this.resourcesProvider);
                builder.setTitle(LocaleController.formatPluralString("DeleteTones", NotificationsSoundActivity.this.selectedTones.size(), new Object[0]));
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", NotificationsSoundActivity.this.selectedTones.size(), new Object[0])));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        dialogInterface.dismiss();
                    }
                });
                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        NotificationsSoundActivity.AnonymousClass1.this.lambda$onItemClick$1(dialogInterface, i2);
                    }
                });
                TextView textView = (TextView) builder.show().getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(Theme.key_text_RedBold, NotificationsSoundActivity.this.resourcesProvider));
                    return;
                }
                return;
            }
            if (i == 2) {
                if (NotificationsSoundActivity.this.selectedTones.size() == 1) {
                    Intent intent = new Intent(this.val$context, (Class<?>) LaunchActivity.class);
                    intent.setAction("android.intent.action.SEND");
                    Uri uriForShare = NotificationsSoundActivity.this.selectedTones.valueAt(0).getUriForShare(((BaseFragment) NotificationsSoundActivity.this).currentAccount);
                    if (uriForShare != null) {
                        intent.putExtra("android.intent.extra.STREAM", uriForShare);
                        this.val$context.startActivity(intent);
                    }
                } else {
                    Intent intent2 = new Intent(this.val$context, (Class<?>) LaunchActivity.class);
                    intent2.setAction("android.intent.action.SEND_MULTIPLE");
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    for (int i2 = 0; i2 < NotificationsSoundActivity.this.selectedTones.size(); i2++) {
                        Uri uriForShare2 = NotificationsSoundActivity.this.selectedTones.valueAt(i2).getUriForShare(((BaseFragment) NotificationsSoundActivity.this).currentAccount);
                        if (uriForShare2 != null) {
                            arrayList.add(uriForShare2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                        this.val$context.startActivity(intent2);
                    }
                }
                NotificationsSoundActivity.this.hideActionMode();
                NotificationsSoundActivity.this.updateRows();
                NotificationsSoundActivity.this.adapter.notifyDataSetChanged();
            }
        }

        public void lambda$onItemClick$1(DialogInterface dialogInterface, int i) {
            deleteSelectedMessages();
            dialogInterface.dismiss();
        }

        private void deleteSelectedMessages() {
            RingtoneUploader ringtoneUploader;
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < NotificationsSoundActivity.this.selectedTones.size(); i++) {
                Tone valueAt = NotificationsSoundActivity.this.selectedTones.valueAt(i);
                TLRPC$Document tLRPC$Document = valueAt.document;
                if (tLRPC$Document != null) {
                    arrayList.add(tLRPC$Document);
                    NotificationsSoundActivity.this.getMediaDataController().ringtoneDataStore.remove(valueAt.document);
                }
                if (valueAt.uri != null && (ringtoneUploader = NotificationsSoundActivity.this.getMediaDataController().ringtoneUploaderHashMap.get(valueAt.uri)) != null) {
                    ringtoneUploader.cancel();
                }
                NotificationsSoundActivity notificationsSoundActivity = NotificationsSoundActivity.this;
                if (valueAt == notificationsSoundActivity.selectedTone) {
                    notificationsSoundActivity.startSelectedTone = null;
                    NotificationsSoundActivity notificationsSoundActivity2 = NotificationsSoundActivity.this;
                    notificationsSoundActivity2.selectedTone = notificationsSoundActivity2.systemTones.get(0);
                    NotificationsSoundActivity.this.selectedToneChanged = true;
                }
                NotificationsSoundActivity.this.serverTones.remove(valueAt);
                NotificationsSoundActivity.this.uploadingTones.remove(valueAt);
            }
            NotificationsSoundActivity.this.getMediaDataController().ringtoneDataStore.saveTones();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLRPC$Document tLRPC$Document2 = (TLRPC$Document) arrayList.get(i2);
                TLRPC$TL_account_saveRingtone tLRPC$TL_account_saveRingtone = new TLRPC$TL_account_saveRingtone();
                TLRPC$TL_inputDocument tLRPC$TL_inputDocument = new TLRPC$TL_inputDocument();
                tLRPC$TL_account_saveRingtone.id = tLRPC$TL_inputDocument;
                tLRPC$TL_inputDocument.id = tLRPC$Document2.id;
                tLRPC$TL_inputDocument.access_hash = tLRPC$Document2.access_hash;
                byte[] bArr = tLRPC$Document2.file_reference;
                tLRPC$TL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tLRPC$TL_inputDocument.file_reference = new byte[0];
                }
                tLRPC$TL_account_saveRingtone.unsave = true;
                NotificationsSoundActivity.this.getConnectionsManager().sendRequest(tLRPC$TL_account_saveRingtone, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        NotificationsSoundActivity.AnonymousClass1.lambda$deleteSelectedMessages$2(tLObject, tLRPC$TL_error);
                    }
                });
            }
            NotificationsSoundActivity.this.hideActionMode();
            NotificationsSoundActivity.this.updateRows();
            NotificationsSoundActivity.this.adapter.notifyDataSetChanged();
        }
    }

    public void lambda$createView$1(android.content.Context r9, android.view.View r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSoundActivity.lambda$createView$1(android.content.Context, android.view.View, int):void");
    }

    public boolean lambda$createView$2(View view, int i) {
        if (view instanceof ToneCell) {
            ToneCell toneCell = (ToneCell) view;
            checkSelection(toneCell.tone);
            toneCell.performHapticFeedback(0);
        }
        return false;
    }

    public void hideActionMode() {
        this.selectedTones.clear();
        Adapter adapter = this.adapter;
        adapter.notifyItemRangeChanged(0, adapter.getItemCount());
        updateActionMode();
    }

    private void checkSelection(Tone tone) {
        if (this.selectedTones.get(tone.stableId) != null) {
            this.selectedTones.remove(tone.stableId);
        } else if (!tone.fromServer) {
            return;
        } else {
            this.selectedTones.put(tone.stableId, tone);
        }
        updateActionMode();
        Adapter adapter = this.adapter;
        adapter.notifyItemRangeChanged(0, adapter.getItemCount());
    }

    private void updateActionMode() {
        if (this.selectedTones.size() > 0) {
            this.selectedTonesCountTextView.setNumber(this.selectedTones.size(), this.actionBar.isActionModeShowed());
            this.actionBar.showActionMode();
        } else {
            this.actionBar.hideActionMode();
        }
    }

    private void loadTones() {
        AnonymousClass1 anonymousClass1;
        TLRPC$Document tLRPC$Document;
        TLRPC$Document tLRPC$Document2;
        getMediaDataController().ringtoneDataStore.loadUserRingtones(false);
        this.serverTones.clear();
        this.systemTones.clear();
        int i = 0;
        while (true) {
            anonymousClass1 = null;
            if (i >= getMediaDataController().ringtoneDataStore.userRingtones.size()) {
                break;
            }
            RingtoneDataStore.CachedTone cachedTone = getMediaDataController().ringtoneDataStore.userRingtones.get(i);
            Tone tone = new Tone(anonymousClass1);
            int i2 = this.stableIds;
            this.stableIds = i2 + 1;
            tone.stableId = i2;
            tone.fromServer = true;
            tone.localId = cachedTone.localId;
            TLRPC$Document tLRPC$Document3 = cachedTone.document;
            tone.title = tLRPC$Document3.file_name_fixed;
            tone.document = tLRPC$Document3;
            trimTitle(tone);
            tone.uri = cachedTone.localUri;
            Tone tone2 = this.startSelectedTone;
            if (tone2 != null && (tLRPC$Document = tone2.document) != null && (tLRPC$Document2 = cachedTone.document) != null && tLRPC$Document.id == tLRPC$Document2.id) {
                this.startSelectedTone = null;
                this.selectedTone = tone;
            }
            this.serverTones.add(tone);
            i++;
        }
        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        Tone tone3 = new Tone(anonymousClass1);
        int i3 = this.stableIds;
        this.stableIds = i3 + 1;
        tone3.stableId = i3;
        tone3.title = LocaleController.getString(R.string.NoSound);
        tone3.isSystemNoSound = true;
        this.systemTones.add(tone3);
        Tone tone4 = new Tone(anonymousClass1);
        int i4 = this.stableIds;
        this.stableIds = i4 + 1;
        tone4.stableId = i4;
        tone4.title = LocaleController.getString(R.string.DefaultRingtone);
        tone4.isSystemDefault = true;
        this.systemTones.add(tone4);
        Tone tone5 = this.startSelectedTone;
        if (tone5 != null && tone5.document == null && tone5.uri.equals("NoSound")) {
            this.startSelectedTone = null;
            this.selectedTone = tone3;
        }
        Tone tone6 = this.startSelectedTone;
        if (tone6 != null && tone6.document == null && tone6.uri.equals("Default")) {
            this.startSelectedTone = null;
            this.selectedTone = tone4;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str = cursor.getString(2) + "/" + cursor.getString(0);
            Tone tone7 = new Tone(anonymousClass1);
            int i5 = this.stableIds;
            this.stableIds = i5 + 1;
            tone7.stableId = i5;
            tone7.title = string;
            tone7.uri = str;
            Tone tone8 = this.startSelectedTone;
            if (tone8 != null && tone8.document == null && tone8.uri.equals(str)) {
                this.startSelectedTone = null;
                this.selectedTone = tone7;
            }
            this.systemTones.add(tone7);
        }
        if (getMediaDataController().ringtoneDataStore.isLoaded() && this.selectedTone == null) {
            this.selectedTone = tone4;
            this.selectedToneChanged = true;
        }
        updateRows();
    }

    public static String findRingtonePathByName(String str) {
        if (str == null) {
            return null;
        }
        try {
            RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
            ringtoneManager.setType(2);
            Cursor cursor = ringtoneManager.getCursor();
            while (cursor.moveToNext()) {
                String string = cursor.getString(1);
                String str2 = cursor.getString(2) + "/" + cursor.getString(0);
                if (str.equalsIgnoreCase(string)) {
                    return str2;
                }
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
        return null;
    }

    public void updateRows() {
        this.serverTonesStartRow = -1;
        this.serverTonesEndRow = -1;
        this.uploadRow = -1;
        this.dividerRow = -1;
        this.systemTonesHeaderRow = -1;
        this.systemTonesStartRow = -1;
        this.systemTonesEndRow = -1;
        this.rowCount = 1;
        this.serverTonesHeaderRow = 0;
        if (!this.serverTones.isEmpty()) {
            int i = this.rowCount;
            this.serverTonesStartRow = i;
            int size = i + this.serverTones.size();
            this.rowCount = size;
            this.serverTonesEndRow = size;
        }
        int i2 = this.rowCount;
        this.uploadRow = i2;
        this.rowCount = i2 + 2;
        this.dividerRow = i2 + 1;
        if (!this.systemTones.isEmpty()) {
            int i3 = this.rowCount;
            int i4 = i3 + 1;
            this.rowCount = i4;
            this.systemTonesHeaderRow = i3;
            this.systemTonesStartRow = i4;
            int size2 = i4 + this.systemTones.size();
            this.rowCount = size2;
            this.systemTonesEndRow = size2;
        }
        int i5 = this.rowCount;
        this.rowCount = i5 + 1;
        this.dividerRow2 = i5;
    }

    @Override
    public void didSelectFiles(ArrayList<String> arrayList, String str, ArrayList<MessageObject> arrayList2, boolean z, int i, long j, boolean z2) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            getMediaDataController().uploadRingtone(arrayList.get(i2));
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
    }

    public class Adapter extends RecyclerListView.SelectionAdapter {
        private Adapter() {
        }

        Adapter(NotificationsSoundActivity notificationsSoundActivity, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override
        public long getItemId(int i) {
            if (getTone(i) != null) {
                return r0.stableId;
            }
            NotificationsSoundActivity notificationsSoundActivity = NotificationsSoundActivity.this;
            if (i == notificationsSoundActivity.serverTonesHeaderRow) {
                return 1L;
            }
            if (i == notificationsSoundActivity.systemTonesHeaderRow) {
                return 2L;
            }
            if (i == notificationsSoundActivity.uploadRow) {
                return 3L;
            }
            if (i == notificationsSoundActivity.dividerRow) {
                return 4L;
            }
            if (i == notificationsSoundActivity.dividerRow2) {
                return 5L;
            }
            throw new RuntimeException();
        }

        private Tone getTone(int i) {
            NotificationsSoundActivity notificationsSoundActivity = NotificationsSoundActivity.this;
            int i2 = notificationsSoundActivity.systemTonesStartRow;
            if (i >= i2 && i < notificationsSoundActivity.systemTonesEndRow) {
                return notificationsSoundActivity.systemTones.get(i - i2);
            }
            int i3 = notificationsSoundActivity.serverTonesStartRow;
            if (i < i3 || i >= notificationsSoundActivity.serverTonesEndRow) {
                return null;
            }
            return notificationsSoundActivity.serverTones.get(i - i3);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            Context context = viewGroup.getContext();
            if (i == 0) {
                View toneCell = new ToneCell(context, NotificationsSoundActivity.this.resourcesProvider);
                toneCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, NotificationsSoundActivity.this.resourcesProvider));
                view = toneCell;
            } else if (i == 2) {
                CreationTextCell creationTextCell = new CreationTextCell(context, 70, NotificationsSoundActivity.this.resourcesProvider);
                creationTextCell.startPadding = 61;
                creationTextCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, NotificationsSoundActivity.this.resourcesProvider));
                view = creationTextCell;
            } else if (i != 3) {
                View headerCell = new HeaderCell(context, NotificationsSoundActivity.this.resourcesProvider);
                headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, NotificationsSoundActivity.this.resourcesProvider));
                view = headerCell;
            } else {
                view = new ShadowSectionCell(context, NotificationsSoundActivity.this.resourcesProvider);
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    NotificationsSoundActivity notificationsSoundActivity = NotificationsSoundActivity.this;
                    if (i == notificationsSoundActivity.serverTonesHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.TelegramTones));
                        return;
                    } else {
                        if (i == notificationsSoundActivity.systemTonesHeaderRow) {
                            headerCell.setText(LocaleController.getString(R.string.SystemTones));
                            return;
                        }
                        return;
                    }
                }
                if (itemViewType != 2) {
                    return;
                }
                CreationTextCell creationTextCell = (CreationTextCell) viewHolder.itemView;
                Drawable drawable = creationTextCell.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = creationTextCell.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                int color = Theme.getColor(Theme.key_switchTrackChecked, NotificationsSoundActivity.this.resourcesProvider);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_checkboxCheck, NotificationsSoundActivity.this.resourcesProvider), mode));
                creationTextCell.setTextAndIcon(LocaleController.getString(R.string.UploadSound), new CombinedDrawable(drawable, drawable2), false);
                return;
            }
            ToneCell toneCell = (ToneCell) viewHolder.itemView;
            NotificationsSoundActivity notificationsSoundActivity2 = NotificationsSoundActivity.this;
            int i2 = notificationsSoundActivity2.systemTonesStartRow;
            Tone tone = (i < i2 || i >= notificationsSoundActivity2.systemTonesEndRow) ? null : notificationsSoundActivity2.systemTones.get(i - i2);
            NotificationsSoundActivity notificationsSoundActivity3 = NotificationsSoundActivity.this;
            int i3 = notificationsSoundActivity3.serverTonesStartRow;
            if (i >= i3 && i < notificationsSoundActivity3.serverTonesEndRow) {
                tone = notificationsSoundActivity3.serverTones.get(i - i3);
            }
            if (tone != null) {
                boolean z = toneCell.tone == tone;
                NotificationsSoundActivity notificationsSoundActivity4 = NotificationsSoundActivity.this;
                boolean z2 = tone == notificationsSoundActivity4.selectedTone;
                boolean z3 = notificationsSoundActivity4.selectedTones.get(tone.stableId) != null;
                toneCell.tone = tone;
                toneCell.textView.setText(tone.title);
                toneCell.needDivider = i != NotificationsSoundActivity.this.systemTonesEndRow - 1;
                toneCell.radioButton.setChecked(z2, z);
                toneCell.checkBox.setChecked(z3, z);
            }
        }

        @Override
        public int getItemViewType(int i) {
            NotificationsSoundActivity notificationsSoundActivity = NotificationsSoundActivity.this;
            if (i >= notificationsSoundActivity.systemTonesStartRow && i < notificationsSoundActivity.systemTonesEndRow) {
                return 0;
            }
            if (i == notificationsSoundActivity.serverTonesHeaderRow || i == notificationsSoundActivity.systemTonesHeaderRow) {
                return 1;
            }
            if (i == notificationsSoundActivity.uploadRow) {
                return 2;
            }
            if (i == notificationsSoundActivity.dividerRow || i == notificationsSoundActivity.dividerRow2) {
                return 3;
            }
            return super.getItemViewType(i);
        }

        @Override
        public int getItemCount() {
            return NotificationsSoundActivity.this.rowCount;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0 || viewHolder.getItemViewType() == 2;
        }
    }

    public static class ToneCell extends FrameLayout {
        private CheckBox2 checkBox;
        private boolean needDivider;
        private RadioButton radioButton;
        private TextView textView;
        Tone tone;

        public ToneCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            RadioButton radioButton = new RadioButton(context);
            this.radioButton = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            this.radioButton.setColor(Theme.getColor(Theme.key_radioBackground, resourcesProvider), Theme.getColor(Theme.key_radioBackgroundChecked, resourcesProvider));
            RadioButton radioButton2 = this.radioButton;
            boolean z = LocaleController.isRTL;
            addView(radioButton2, LayoutHelper.createFrame(22, 22.0f, (z ? 5 : 3) | 16, z ? 0 : 20, 0.0f, z ? 20 : 0, 0.0f));
            CheckBox2 checkBox2 = new CheckBox2(context, 24, resourcesProvider);
            this.checkBox = checkBox2;
            checkBox2.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
            this.checkBox.setDrawUnchecked(false);
            this.checkBox.setDrawBackgroundAsArc(3);
            CheckBox2 checkBox22 = this.checkBox;
            boolean z2 = LocaleController.isRTL;
            addView(checkBox22, LayoutHelper.createFrame(26, 26.0f, (z2 ? 5 : 3) | 16, z2 ? 0 : 18, 0.0f, z2 ? 18 : 0, 0.0f));
            this.checkBox.setChecked(true, false);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            this.textView.setTextSize(1, 16.0f);
            this.textView.setLines(1);
            this.textView.setMaxLines(1);
            this.textView.setSingleLine(true);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            TextView textView2 = this.textView;
            boolean z3 = LocaleController.isRTL;
            addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (z3 ? 5 : 3) | 16, z3 ? 23 : 61, 0.0f, z3 ? 61 : 23, 0.0f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.needDivider) {
                canvas.drawLine(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 60.0f), getHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 60.0f : 0.0f), getHeight() - 1, Theme.dividerPaint);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.RadioButton");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.radioButton.isChecked());
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        getNotificationCenter().addObserver(this, NotificationCenter.onUserRingtonesUpdated);
    }

    @Override
    public void onPause() {
        super.onPause();
        getNotificationCenter().removeObserver(this, NotificationCenter.onUserRingtonesUpdated);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC$Document tLRPC$Document;
        TLRPC$Document tLRPC$Document2;
        if (i == NotificationCenter.onUserRingtonesUpdated) {
            HashMap hashMap = new HashMap();
            for (int i3 = 0; i3 < this.serverTones.size(); i3++) {
                hashMap.put(Integer.valueOf(this.serverTones.get(i3).localId), this.serverTones.get(i3));
            }
            this.serverTones.clear();
            int i4 = 0;
            while (true) {
                AnonymousClass1 anonymousClass1 = null;
                if (i4 >= getMediaDataController().ringtoneDataStore.userRingtones.size()) {
                    break;
                }
                RingtoneDataStore.CachedTone cachedTone = getMediaDataController().ringtoneDataStore.userRingtones.get(i4);
                Tone tone = new Tone(anonymousClass1);
                Tone tone2 = (Tone) hashMap.get(Integer.valueOf(cachedTone.localId));
                if (tone2 != null) {
                    if (tone2 == this.selectedTone) {
                        this.selectedTone = tone;
                    }
                    tone.stableId = tone2.stableId;
                } else {
                    int i5 = this.stableIds;
                    this.stableIds = i5 + 1;
                    tone.stableId = i5;
                }
                tone.fromServer = true;
                tone.localId = cachedTone.localId;
                TLRPC$Document tLRPC$Document3 = cachedTone.document;
                if (tLRPC$Document3 != null) {
                    tone.title = tLRPC$Document3.file_name_fixed;
                } else {
                    tone.title = new File(cachedTone.localUri).getName();
                }
                tone.document = cachedTone.document;
                trimTitle(tone);
                tone.uri = cachedTone.localUri;
                Tone tone3 = this.startSelectedTone;
                if (tone3 != null && (tLRPC$Document = tone3.document) != null && (tLRPC$Document2 = cachedTone.document) != null && tLRPC$Document.id == tLRPC$Document2.id) {
                    this.startSelectedTone = null;
                    this.selectedTone = tone;
                }
                this.serverTones.add(tone);
                i4++;
            }
            updateRows();
            this.adapter.notifyDataSetChanged();
            if (getMediaDataController().ringtoneDataStore.isLoaded() && this.selectedTone == null && this.systemTones.size() > 0) {
                this.startSelectedTone = null;
                this.selectedTone = this.systemTones.get(0);
            }
        }
    }

    private void trimTitle(Tone tone) {
        tone.title = trimTitle(tone.document, tone.title);
    }

    public static String trimTitle(TLRPC$Document tLRPC$Document, String str) {
        int lastIndexOf;
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, lastIndexOf);
        }
        return (!TextUtils.isEmpty(str) || tLRPC$Document == null) ? str : LocaleController.formatString("SoundNameEmpty", R.string.SoundNameEmpty, LocaleController.formatDateChat(tLRPC$Document.date, true));
    }

    @Override
    public void onFragmentDestroy() {
        String str;
        String str2;
        String str3;
        TLRPC$Document tLRPC$Document;
        super.onFragmentDestroy();
        if (this.selectedTone == null || !this.selectedToneChanged) {
            return;
        }
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        if (this.dialogId != 0) {
            str = "sound_" + NotificationsController.getSharedPrefKey(this.dialogId, this.topicId);
            str2 = "sound_path_" + NotificationsController.getSharedPrefKey(this.dialogId, this.topicId);
            str3 = "sound_document_id_" + NotificationsController.getSharedPrefKey(this.dialogId, this.topicId);
            edit.putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(this.dialogId, this.topicId), true);
        } else {
            int i = this.currentType;
            if (i == 1) {
                str = "GlobalSound";
                str2 = "GlobalSoundPath";
                str3 = "GlobalSoundDocId";
            } else if (i == 0) {
                str = "GroupSound";
                str2 = "GroupSoundPath";
                str3 = "GroupSoundDocId";
            } else if (i == 2) {
                str = "ChannelSound";
                str2 = "ChannelSoundPath";
                str3 = "ChannelSoundDocId";
            } else if (i == 3) {
                str = "StoriesSound";
                str2 = "StoriesSoundPath";
                str3 = "StoriesSoundDocId";
            } else if (i == 5 || i == 4) {
                str = "ReactionSound";
                str2 = "ReactionSoundPath";
                str3 = "ReactionSoundDocId";
            } else {
                throw new RuntimeException("Unsupported type");
            }
        }
        Tone tone = this.selectedTone;
        if (tone.fromServer && (tLRPC$Document = tone.document) != null) {
            edit.putLong(str3, tLRPC$Document.id);
            edit.putString(str, this.selectedTone.title);
            edit.putString(str2, "NoSound");
        } else if (tone.uri != null) {
            edit.putString(str, tone.title);
            edit.putString(str2, this.selectedTone.uri);
            edit.remove(str3);
        } else if (tone.isSystemDefault) {
            edit.putString(str, "Default");
            edit.putString(str2, "Default");
            edit.remove(str3);
        } else {
            edit.putString(str, "NoSound");
            edit.putString(str2, "NoSound");
            edit.remove(str3);
        }
        edit.apply();
        if (this.dialogId != 0) {
            getNotificationsController().updateServerNotificationsSettings(this.dialogId, this.topicId);
        } else {
            getNotificationsController().updateServerNotificationsSettings(this.currentType);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
        }
    }

    @Override
    public void startDocumentSelectActivity() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("audio/mpeg");
            startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i != 21 || intent == null || this.chatAttachAlert == null) {
            return;
        }
        boolean z = true;
        if (intent.getData() != null) {
            String path = AndroidUtilities.getPath(intent.getData());
            if (path != null) {
                if (this.chatAttachAlert.getDocumentLayout().isRingtone(new File(path))) {
                    getMediaDataController().uploadRingtone(path);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                }
            }
            z = false;
        } else {
            if (intent.getClipData() != null) {
                ClipData clipData = intent.getClipData();
                boolean z2 = false;
                for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                    String uri = clipData.getItemAt(i3).getUri().toString();
                    if (this.chatAttachAlert.getDocumentLayout().isRingtone(new File(uri))) {
                        getMediaDataController().uploadRingtone(uri);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        z2 = true;
                    }
                }
                z = z2;
            }
            z = false;
        }
        if (z) {
            this.chatAttachAlert.dismiss();
        }
    }

    public static class Tone {
        TLRPC$Document document;
        public boolean fromServer;
        boolean isSystemDefault;
        boolean isSystemNoSound;
        int localId;
        int stableId;
        String title;
        String uri;

        private Tone() {
        }

        Tone(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Uri getUriForShare(int i) {
            if (!TextUtils.isEmpty(this.uri)) {
                return Uri.fromFile(new File(this.uri));
            }
            TLRPC$Document tLRPC$Document = this.document;
            if (tLRPC$Document == null) {
                return null;
            }
            String str = tLRPC$Document.file_name_fixed;
            String documentExtension = FileLoader.getDocumentExtension(tLRPC$Document);
            if (documentExtension == null) {
                return null;
            }
            String lowerCase = documentExtension.toLowerCase();
            if (!str.endsWith(lowerCase)) {
                str = str + "." + lowerCase;
            }
            File file = new File(AndroidUtilities.getCacheDir(), str);
            if (!file.exists()) {
                try {
                    AndroidUtilities.copyFile(FileLoader.getInstance(i).getPathToAttach(this.document), file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return Uri.fromFile(file);
        }
    }
}
