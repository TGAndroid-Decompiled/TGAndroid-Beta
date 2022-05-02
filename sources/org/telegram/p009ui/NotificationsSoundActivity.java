package org.telegram.p009ui;

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
import android.os.Build;
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
import org.telegram.messenger.C0952R;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.ringtone.RingtoneDataStore;
import org.telegram.messenger.ringtone.RingtoneUploader;
import org.telegram.p009ui.ActionBar.ActionBarMenu;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BackDrawable;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1006ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Cells.CreationTextCell;
import org.telegram.p009ui.Cells.HeaderCell;
import org.telegram.p009ui.Cells.ShadowSectionCell;
import org.telegram.p009ui.Components.ChatAttachAlert;
import org.telegram.p009ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.p009ui.Components.ChatAvatarContainer;
import org.telegram.p009ui.Components.CheckBox2;
import org.telegram.p009ui.Components.CombinedDrawable;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.NumberTextView;
import org.telegram.p009ui.Components.RadioButton;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.NotificationsSoundActivity;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_account_saveRingtone;
import org.telegram.tgnet.TLRPC$TL_document;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputDocument;
import org.telegram.tgnet.TLRPC$User;

public class NotificationsSoundActivity extends BaseFragment implements ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate, NotificationCenter.NotificationCenterDelegate {
    Adapter adapter;
    ChatAvatarContainer avatarContainer;
    ChatAttachAlert chatAttachAlert;
    long dialogId;
    int dividerRow;
    int dividerRow2;
    Ringtone lastPlayedRingtone;
    RecyclerListView listView;
    int rowCount;
    Tone selectedTone;
    boolean selectedToneChanged;
    NumberTextView selectedTonesCountTextView;
    int serverTonesEndRow;
    int serverTonesHeaderRow;
    int serverTonesStartRow;
    private Tone startSelectedTone;
    int systemTonesEndRow;
    int systemTonesHeaderRow;
    int systemTonesStartRow;
    int uploadRow;
    ArrayList<Tone> serverTones = new ArrayList<>();
    ArrayList<Tone> systemTones = new ArrayList<>();
    ArrayList<Tone> uploadingTones = new ArrayList<>();
    private int stableIds = 100;
    SparseArray<Tone> selectedTones = new SparseArray<>();
    int currentType = -1;

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

    public NotificationsSoundActivity(Bundle bundle) {
        super(bundle);
    }

    @Override
    public boolean onFragmentCreate() {
        String str;
        String str2;
        if (getArguments() != null) {
            this.dialogId = getArguments().getLong("dialog_id", 0L);
            this.currentType = getArguments().getInt("type", -1);
        }
        if (this.dialogId != 0) {
            str2 = "sound_document_id_" + this.dialogId;
            str = "sound_path_" + this.dialogId;
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
            } else {
                throw new RuntimeException("Unsupported type");
            }
        }
        SharedPreferences notificationsSettings = getNotificationsSettings();
        long j = notificationsSettings.getLong(str2, 0L);
        String string = notificationsSettings.getString(str, "NoSound");
        Tone tone = new Tone(null);
        this.startSelectedTone = tone;
        if (j != 0) {
            tone.document = new TLRPC$TL_document();
            this.startSelectedTone.document.f861id = j;
        } else {
            tone.uri = string;
        }
        return super.onFragmentCreate();
    }

    @Override
    public View createView(final Context context) {
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new C31571(context));
        if (this.dialogId == 0) {
            int i = this.currentType;
            if (i == 1) {
                this.actionBar.setTitle(LocaleController.getString("NotificationsSoundPrivate", C0952R.string.NotificationsSoundPrivate));
            } else if (i == 0) {
                this.actionBar.setTitle(LocaleController.getString("NotificationsSoundGroup", C0952R.string.NotificationsSoundGroup));
            } else if (i == 2) {
                this.actionBar.setTitle(LocaleController.getString("NotificationsSoundChannels", C0952R.string.NotificationsSoundChannels));
            }
        } else {
            ChatAvatarContainer chatAvatarContainer = new ChatAvatarContainer(context, null, false);
            this.avatarContainer = chatAvatarContainer;
            chatAvatarContainer.setOccupyStatusBar(!AndroidUtilities.isTablet());
            this.actionBar.addView(this.avatarContainer, 0, LayoutHelper.createFrame(-2, -1.0f, 51, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f));
            if (this.dialogId < 0) {
                TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
                this.avatarContainer.setChatAvatar(chat);
                this.avatarContainer.setTitle(chat.title);
            } else {
                TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.dialogId));
                if (user != null) {
                    this.avatarContainer.setUserAvatar(user);
                    this.avatarContainer.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            }
            this.avatarContainer.setSubtitle(LocaleController.getString("NotificationsSound", C0952R.string.NotificationsSound));
        }
        ActionBarMenu createActionMode = this.actionBar.createActionMode();
        NumberTextView numberTextView = new NumberTextView(createActionMode.getContext());
        this.selectedTonesCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedTonesCountTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.selectedTonesCountTextView.setTextColor(Theme.getColor("actionBarActionModeDefaultIcon"));
        createActionMode.addView(this.selectedTonesCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, 72, 0, 0, 0));
        this.selectedTonesCountTextView.setOnTouchListener(NotificationsSoundActivity$$ExternalSyntheticLambda0.INSTANCE);
        createActionMode.addItemWithWidth(2, C0952R.C0953drawable.msg_forward, AndroidUtilities.m34dp(54.0f), LocaleController.getString("ShareFile", C0952R.string.ShareFile));
        createActionMode.addItemWithWidth(1, C0952R.C0953drawable.msg_delete, AndroidUtilities.m34dp(54.0f), LocaleController.getString("Delete", C0952R.string.Delete));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        frameLayout2.addView(recyclerListView, LayoutHelper.createFrame(-1, -1.0f));
        Adapter adapter = new Adapter(this, null);
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

    public class C31571 extends C1006ActionBar.ActionBarMenuOnItemClick {
        final Context val$context;

        public static void lambda$deleteSelectedMessages$2(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        }

        C31571(Context context) {
            this.val$context = context;
        }

        @Override
        public void onItemClick(int i) {
            if (i == -1) {
                if (((BaseFragment) NotificationsSoundActivity.this).actionBar.isActionModeShowed()) {
                    NotificationsSoundActivity.this.hideActionMode();
                } else {
                    NotificationsSoundActivity.this.finishFragment();
                }
            } else if (i == 1) {
                AlertDialog.Builder builder = new AlertDialog.Builder(NotificationsSoundActivity.this.getParentActivity());
                builder.setTitle(LocaleController.formatPluralString("DeleteTones", NotificationsSoundActivity.this.selectedTones.size()));
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", NotificationsSoundActivity.this.selectedTones.size())));
                builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), NotificationsSoundActivity$1$$ExternalSyntheticLambda1.INSTANCE);
                builder.setPositiveButton(LocaleController.getString("Delete", C0952R.string.Delete), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        NotificationsSoundActivity.C31571.this.lambda$onItemClick$1(dialogInterface, i2);
                    }
                });
                TextView textView = (TextView) builder.show().getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor("dialogTextRed2"));
                }
            } else if (i == 2) {
                if (NotificationsSoundActivity.this.selectedTones.size() == 1) {
                    Intent intent = new Intent(this.val$context, LaunchActivity.class);
                    intent.setAction("android.intent.action.SEND");
                    Uri uriForShare = NotificationsSoundActivity.this.selectedTones.valueAt(0).getUriForShare(((BaseFragment) NotificationsSoundActivity.this).currentAccount);
                    if (uriForShare != null) {
                        intent.putExtra("android.intent.extra.STREAM", uriForShare);
                        this.val$context.startActivity(intent);
                    }
                } else {
                    Intent intent2 = new Intent(this.val$context, LaunchActivity.class);
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
                if (!(valueAt.uri == null || (ringtoneUploader = NotificationsSoundActivity.this.getMediaDataController().ringtoneUploaderHashMap.get(valueAt.uri)) == null)) {
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
                tLRPC$TL_account_saveRingtone.f887id = tLRPC$TL_inputDocument;
                tLRPC$TL_inputDocument.f869id = tLRPC$Document2.f861id;
                tLRPC$TL_inputDocument.access_hash = tLRPC$Document2.access_hash;
                byte[] bArr = tLRPC$Document2.file_reference;
                tLRPC$TL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tLRPC$TL_inputDocument.file_reference = new byte[0];
                }
                tLRPC$TL_account_saveRingtone.unsave = true;
                NotificationsSoundActivity.this.getConnectionsManager().sendRequest(tLRPC$TL_account_saveRingtone, NotificationsSoundActivity$1$$ExternalSyntheticLambda2.INSTANCE);
            }
            NotificationsSoundActivity.this.hideActionMode();
            NotificationsSoundActivity.this.updateRows();
            NotificationsSoundActivity.this.adapter.notifyDataSetChanged();
        }
    }

    public void lambda$createView$1(android.content.Context r7, android.view.View r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.NotificationsSoundActivity.lambda$createView$1(android.content.Context, android.view.View, int):void");
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
        boolean z = true;
        if (this.selectedTones.get(tone.stableId) != null) {
            this.selectedTones.remove(tone.stableId);
        } else if (tone.fromServer) {
            this.selectedTones.put(tone.stableId, tone);
        } else {
            z = false;
        }
        if (z) {
            updateActionMode();
            Adapter adapter = this.adapter;
            adapter.notifyItemRangeChanged(0, adapter.getItemCount());
        }
    }

    private void updateActionMode() {
        if (this.selectedTones.size() > 0) {
            this.selectedTonesCountTextView.setNumber(this.selectedTones.size(), this.actionBar.isActionModeShowed());
            this.actionBar.showActionMode();
            return;
        }
        this.actionBar.hideActionMode();
    }

    private void loadTones() {
        TLRPC$Document tLRPC$Document;
        TLRPC$Document tLRPC$Document2;
        getMediaDataController().ringtoneDataStore.lambda$new$0();
        this.serverTones.clear();
        this.systemTones.clear();
        for (int i = 0; i < getMediaDataController().ringtoneDataStore.userRingtones.size(); i++) {
            RingtoneDataStore.CachedTone cachedTone = getMediaDataController().ringtoneDataStore.userRingtones.get(i);
            Tone tone = new Tone(null);
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
            if (!(tone2 == null || (tLRPC$Document = tone2.document) == null || (tLRPC$Document2 = cachedTone.document) == null || tLRPC$Document.f861id != tLRPC$Document2.f861id)) {
                this.startSelectedTone = null;
                this.selectedTone = tone;
            }
            this.serverTones.add(tone);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        Tone tone3 = new Tone(null);
        int i3 = this.stableIds;
        this.stableIds = i3 + 1;
        tone3.stableId = i3;
        tone3.title = LocaleController.getString("NoSound", C0952R.string.NoSound);
        this.systemTones.add(tone3);
        Tone tone4 = new Tone(null);
        int i4 = this.stableIds;
        this.stableIds = i4 + 1;
        tone4.stableId = i4;
        tone4.title = LocaleController.getString("DefaultRingtone", C0952R.string.DefaultRingtone);
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
            Tone tone7 = new Tone(null);
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

    public void updateRows() {
        this.serverTonesHeaderRow = -1;
        this.serverTonesStartRow = -1;
        this.serverTonesEndRow = -1;
        this.uploadRow = -1;
        this.dividerRow = -1;
        this.systemTonesHeaderRow = -1;
        this.systemTonesStartRow = -1;
        this.systemTonesEndRow = -1;
        this.rowCount = 0;
        this.rowCount = 0 + 1;
        this.serverTonesHeaderRow = 0;
        if (!this.serverTones.isEmpty()) {
            int i = this.rowCount;
            this.serverTonesStartRow = i;
            int size = i + this.serverTones.size();
            this.rowCount = size;
            this.serverTonesEndRow = size;
        }
        int i2 = this.rowCount;
        int i3 = i2 + 1;
        this.rowCount = i3;
        this.uploadRow = i2;
        this.rowCount = i3 + 1;
        this.dividerRow = i3;
        if (!this.systemTones.isEmpty()) {
            int i4 = this.rowCount;
            int i5 = i4 + 1;
            this.rowCount = i5;
            this.systemTonesHeaderRow = i4;
            this.systemTonesStartRow = i5;
            int size2 = i5 + this.systemTones.size();
            this.rowCount = size2;
            this.systemTonesEndRow = size2;
        }
        int i6 = this.rowCount;
        this.rowCount = i6 + 1;
        this.dividerRow2 = i6;
    }

    @Override
    public void didSelectFiles(ArrayList<String> arrayList, String str, ArrayList<MessageObject> arrayList2, boolean z, int i) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            getMediaDataController().uploadRingtone(arrayList.get(i2));
        }
        getNotificationCenter().postNotificationName(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
    }

    public class Adapter extends RecyclerListView.SelectionAdapter {
        private Adapter() {
        }

        Adapter(NotificationsSoundActivity notificationsSoundActivity, C31571 r2) {
            this();
        }

        @Override
        public long getItemId(int i) {
            Tone tone = getTone(i);
            if (tone != null) {
                return tone.stableId;
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
            HeaderCell headerCell;
            Context context = viewGroup.getContext();
            if (i == 0) {
                ToneCell toneCell = new ToneCell(context);
                toneCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                headerCell = toneCell;
            } else if (i == 2) {
                CreationTextCell creationTextCell = new CreationTextCell(context);
                creationTextCell.startPadding = 61;
                creationTextCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                headerCell = creationTextCell;
            } else if (i != 3) {
                HeaderCell headerCell2 = new HeaderCell(context);
                headerCell2.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                headerCell = headerCell2;
            } else {
                headerCell = new ShadowSectionCell(context);
            }
            headerCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(headerCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            boolean z = false;
            if (itemViewType == 0) {
                ToneCell toneCell = (ToneCell) viewHolder.itemView;
                Tone tone = null;
                NotificationsSoundActivity notificationsSoundActivity = NotificationsSoundActivity.this;
                int i2 = notificationsSoundActivity.systemTonesStartRow;
                if (i >= i2 && i < notificationsSoundActivity.systemTonesEndRow) {
                    tone = notificationsSoundActivity.systemTones.get(i - i2);
                }
                NotificationsSoundActivity notificationsSoundActivity2 = NotificationsSoundActivity.this;
                int i3 = notificationsSoundActivity2.serverTonesStartRow;
                if (i >= i3 && i < notificationsSoundActivity2.serverTonesEndRow) {
                    tone = notificationsSoundActivity2.serverTones.get(i - i3);
                }
                if (tone != null) {
                    boolean z2 = toneCell.tone == tone;
                    NotificationsSoundActivity notificationsSoundActivity3 = NotificationsSoundActivity.this;
                    boolean z3 = tone == notificationsSoundActivity3.selectedTone;
                    boolean z4 = notificationsSoundActivity3.selectedTones.get(tone.stableId) != null;
                    toneCell.tone = tone;
                    toneCell.textView.setText(tone.title);
                    if (i != NotificationsSoundActivity.this.systemTonesEndRow - 1) {
                        z = true;
                    }
                    toneCell.needDivider = z;
                    toneCell.radioButton.setChecked(z3, z2);
                    toneCell.checkBox.setChecked(z4, z2);
                }
            } else if (itemViewType == 1) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                NotificationsSoundActivity notificationsSoundActivity4 = NotificationsSoundActivity.this;
                if (i == notificationsSoundActivity4.serverTonesHeaderRow) {
                    headerCell.setText(LocaleController.getString("TelegramTones", C0952R.string.TelegramTones));
                } else if (i == notificationsSoundActivity4.systemTonesHeaderRow) {
                    headerCell.setText(LocaleController.getString("SystemTones", C0952R.string.SystemTones));
                }
            } else if (itemViewType == 2) {
                CreationTextCell creationTextCell = (CreationTextCell) viewHolder.itemView;
                Drawable drawable = creationTextCell.getContext().getResources().getDrawable(C0952R.C0953drawable.poll_add_circle);
                Drawable drawable2 = creationTextCell.getContext().getResources().getDrawable(C0952R.C0953drawable.poll_add_plus);
                drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor("switchTrackChecked"), PorterDuff.Mode.MULTIPLY));
                drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor("checkboxCheck"), PorterDuff.Mode.MULTIPLY));
                creationTextCell.setTextAndIcon(LocaleController.getString("UploadSound", C0952R.string.UploadSound), new CombinedDrawable(drawable, drawable2), false);
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

        public ToneCell(Context context) {
            super(context);
            RadioButton radioButton = new RadioButton(context);
            this.radioButton = radioButton;
            radioButton.setSize(AndroidUtilities.m34dp(20.0f));
            this.radioButton.setColor(Theme.getColor("radioBackground"), Theme.getColor("radioBackgroundChecked"));
            RadioButton radioButton2 = this.radioButton;
            boolean z = LocaleController.isRTL;
            int i = 5;
            addView(radioButton2, LayoutHelper.createFrame(22, 22.0f, (z ? 5 : 3) | 16, z ? 0 : 20, 0.0f, !z ? 0 : 20, 0.0f));
            CheckBox2 checkBox2 = new CheckBox2(context, 24);
            this.checkBox = checkBox2;
            checkBox2.setColor(null, "windowBackgroundWhite", "checkboxCheck");
            this.checkBox.setDrawUnchecked(false);
            this.checkBox.setDrawBackgroundAsArc(3);
            CheckBox2 checkBox22 = this.checkBox;
            boolean z2 = LocaleController.isRTL;
            addView(checkBox22, LayoutHelper.createFrame(26, 26.0f, (z2 ? 5 : 3) | 16, z2 ? 0 : 18, 0.0f, !z2 ? 0 : 18, 0.0f));
            this.checkBox.setChecked(true, false);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.textView.setTextSize(1, 16.0f);
            this.textView.setLines(1);
            this.textView.setMaxLines(1);
            this.textView.setSingleLine(true);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            TextView textView2 = this.textView;
            boolean z3 = LocaleController.isRTL;
            addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (!z3 ? 3 : i) | 16, z3 ? 23 : 61, 0.0f, z3 ? 61 : 23, 0.0f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(50.0f), 1073741824));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.needDivider) {
                float f = 0.0f;
                float dp = AndroidUtilities.m34dp(LocaleController.isRTL ? 0.0f : 60.0f);
                float height = getHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (LocaleController.isRTL) {
                    f = 60.0f;
                }
                canvas.drawLine(dp, height, measuredWidth - AndroidUtilities.m34dp(f), getHeight() - 1, Theme.dividerPaint);
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
            for (int i4 = 0; i4 < getMediaDataController().ringtoneDataStore.userRingtones.size(); i4++) {
                RingtoneDataStore.CachedTone cachedTone = getMediaDataController().ringtoneDataStore.userRingtones.get(i4);
                Tone tone = new Tone(null);
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
                if (!(tone3 == null || (tLRPC$Document = tone3.document) == null || (tLRPC$Document2 = cachedTone.document) == null || tLRPC$Document.f861id != tLRPC$Document2.f861id)) {
                    this.startSelectedTone = null;
                    this.selectedTone = tone;
                }
                this.serverTones.add(tone);
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
        if (!(str == null || (lastIndexOf = str.lastIndexOf(46)) == -1)) {
            str = str.substring(0, lastIndexOf);
        }
        return (!TextUtils.isEmpty(str) || tLRPC$Document == null) ? str : LocaleController.formatString("SoundNameEmpty", C0952R.string.SoundNameEmpty, LocaleController.formatDateChat(tLRPC$Document.date, true));
    }

    @Override
    public void onFragmentDestroy() {
        String str;
        String str2;
        String str3;
        TLRPC$Document tLRPC$Document;
        super.onFragmentDestroy();
        if (this.selectedTone != null && this.selectedToneChanged) {
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            if (this.dialogId != 0) {
                str3 = "sound_" + this.dialogId;
                str2 = "sound_path_" + this.dialogId;
                str = "sound_document_id_" + this.dialogId;
                edit.putBoolean("sound_enabled_" + this.dialogId, true);
            } else {
                int i = this.currentType;
                if (i == 1) {
                    str3 = "GlobalSound";
                    str2 = "GlobalSoundPath";
                    str = "GlobalSoundDocId";
                } else if (i == 0) {
                    str3 = "GroupSound";
                    str2 = "GroupSoundPath";
                    str = "GroupSoundDocId";
                } else if (i == 2) {
                    str3 = "ChannelSound";
                    str2 = "ChannelSoundPath";
                    str = "ChannelSoundDocId";
                } else {
                    throw new RuntimeException("Unsupported type");
                }
            }
            Tone tone = this.selectedTone;
            if (tone.fromServer && (tLRPC$Document = tone.document) != null) {
                edit.putLong(str, tLRPC$Document.f861id);
                edit.putString(str3, this.selectedTone.title);
                edit.putString(str2, "NoSound");
            } else if (tone.uri != null) {
                edit.putString(str3, tone.title);
                edit.putString(str2, this.selectedTone.uri);
                edit.remove(str);
            } else if (tone.isSystemDefault) {
                edit.putString(str3, "Default");
                edit.putString(str2, "Default");
                edit.remove(str);
            } else {
                edit.putString(str3, "NoSound");
                edit.putString(str2, "NoSound");
                edit.remove(str);
            }
            edit.apply();
            if (this.dialogId != 0) {
                getNotificationsController().updateServerNotificationsSettings(this.dialogId);
                return;
            }
            getNotificationsController().updateServerNotificationsSettings(this.currentType);
            getNotificationCenter().postNotificationName(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
        }
    }

    @Override
    public void startDocumentSelectActivity() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            if (Build.VERSION.SDK_INT >= 18) {
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            }
            intent.setType("audio/mpeg");
            startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.m30e(e);
        }
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        if (!(i != 21 || intent == null || this.chatAttachAlert == null)) {
            boolean z = true;
            boolean z2 = false;
            if (intent.getData() != null) {
                String path = AndroidUtilities.getPath(intent.getData());
                if (path != null) {
                    if (this.chatAttachAlert.getDocumentLayout().isRingtone(new File(path))) {
                        getMediaDataController().uploadRingtone(path);
                        getNotificationCenter().postNotificationName(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        z2 = z;
                    }
                }
                z = false;
                z2 = z;
            } else if (intent.getClipData() != null) {
                ClipData clipData = intent.getClipData();
                boolean z3 = false;
                for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                    String uri = clipData.getItemAt(i3).getUri().toString();
                    if (this.chatAttachAlert.getDocumentLayout().isRingtone(new File(uri))) {
                        getMediaDataController().uploadRingtone(uri);
                        getNotificationCenter().postNotificationName(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                this.chatAttachAlert.dismiss();
            }
        }
    }

    public static class Tone {
        TLRPC$Document document;
        public boolean fromServer;
        boolean isSystemDefault;
        int localId;
        int stableId;
        String title;
        String uri;

        private Tone() {
        }

        Tone(C31571 r1) {
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
