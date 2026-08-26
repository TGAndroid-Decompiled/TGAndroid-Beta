package org.telegram.ui;

import android.content.ClipData;
import android.content.Context;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import com.google.android.gms.internal.mlkit_vision_common.zzki;
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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline1;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.ringtone.RingtoneDataStore;
import org.telegram.messenger.ringtone.RingtoneUploader;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.AlertDialog;
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

public class NotificationsSoundActivity extends BaseFragment implements ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate, NotificationCenter.NotificationCenterDelegate {
    private static final int deleteId = 1;
    private static final int shareId = 2;
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

    public class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        final Context val$context;

        public AnonymousClass1(Context context) {
            this.val$context = context;
        }

        private void deleteSelectedMessages() {
            RingtoneUploader ringtoneUploader;
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < NotificationsSoundActivity.this.selectedTones.size(); i++) {
                Tone toneValueAt = NotificationsSoundActivity.this.selectedTones.valueAt(i);
                TLRPC.Document document = toneValueAt.document;
                if (document != null) {
                    arrayList.add(document);
                    RingtoneDataStore ringtoneDataStore = NotificationsSoundActivity.this.getMediaDataController().ringtoneDataStore;
                    TLRPC.Document document2 = toneValueAt.document;
                    if (document2 != null) {
                        if (!ringtoneDataStore.loaded) {
                            ringtoneDataStore.loadFromPrefs(true);
                            ringtoneDataStore.loaded = true;
                        }
                        int i2 = 0;
                        while (true) {
                            ArrayList arrayList2 = ringtoneDataStore.userRingtones;
                            if (i2 >= arrayList2.size()) {
                                break;
                            }
                            if (((RingtoneDataStore.CachedTone) arrayList2.get(i2)).document != null && ((RingtoneDataStore.CachedTone) arrayList2.get(i2)).document.id == document2.id) {
                                arrayList2.remove(i2);
                                break;
                            }
                            i2++;
                        }
                    } else {
                        ringtoneDataStore.getClass();
                    }
                }
                if (toneValueAt.uri != null && (ringtoneUploader = NotificationsSoundActivity.this.getMediaDataController().ringtoneUploaderHashMap.get(toneValueAt.uri)) != null) {
                    ringtoneUploader.canceled = true;
                    int i3 = ringtoneUploader.currentAccount;
                    NotificationCenter.getInstance(i3).removeObserver(ringtoneUploader, NotificationCenter.fileUploaded);
                    NotificationCenter.getInstance(i3).removeObserver(ringtoneUploader, NotificationCenter.fileUploadFailed);
                    FileLoader fileLoader = FileLoader.getInstance(i3);
                    String str = ringtoneUploader.filePath;
                    fileLoader.cancelFileUpload(str, false);
                    MediaDataController.getInstance(i3).onRingtoneUploaded(str, null, true);
                }
                NotificationsSoundActivity notificationsSoundActivity = NotificationsSoundActivity.this;
                if (toneValueAt == notificationsSoundActivity.selectedTone) {
                    notificationsSoundActivity.startSelectedTone = null;
                    NotificationsSoundActivity notificationsSoundActivity2 = NotificationsSoundActivity.this;
                    notificationsSoundActivity2.selectedTone = notificationsSoundActivity2.systemTones.get(0);
                    NotificationsSoundActivity.this.selectedToneChanged = true;
                }
                NotificationsSoundActivity.this.serverTones.remove(toneValueAt);
                NotificationsSoundActivity.this.uploadingTones.remove(toneValueAt);
            }
            NotificationsSoundActivity.this.getMediaDataController().ringtoneDataStore.saveTones();
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i4);
                TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                saveringtone.id = tL_inputDocument;
                tL_inputDocument.id = document3.id;
                tL_inputDocument.access_hash = document3.access_hash;
                byte[] bArr = document3.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                saveringtone.unsave = true;
                NotificationsSoundActivity.this.getConnectionsManager().sendRequest(saveringtone, new PassportActivity$$ExternalSyntheticLambda3(3));
            }
            NotificationsSoundActivity.this.hideActionMode();
            NotificationsSoundActivity.this.updateRows();
            NotificationsSoundActivity.this.adapter.notifyDataSetChanged();
        }

        public static void lambda$deleteSelectedMessages$2(TLObject tLObject, TLRPC.TL_error tL_error) {
        }

        public void lambda$onItemClick$1(AlertDialog alertDialog, int i) {
            deleteSelectedMessages();
            alertDialog.dismiss();
        }

        @Override
        public void onItemClick(int i) {
            if (i == -1) {
                if (((BaseFragment) NotificationsSoundActivity.this).actionBar.isActionModeShowed()) {
                    NotificationsSoundActivity.this.hideActionMode();
                    return;
                } else {
                    NotificationsSoundActivity.this.finishFragment();
                    return;
                }
            }
            if (i == 1) {
                AlertDialog.Builder builder = new AlertDialog.Builder(NotificationsSoundActivity.this.getParentActivity(), 0, NotificationsSoundActivity.this.resourcesProvider);
                builder.setTitle(LocaleController.formatPluralString("DeleteTones", NotificationsSoundActivity.this.selectedTones.size(), new Object[0]));
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", NotificationsSoundActivity.this.selectedTones.size(), new Object[0])));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ChatActivity$$ExternalSyntheticLambda49(5));
                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new PhotoViewer$55$$ExternalSyntheticLambda2(this, 15));
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
    }

    public class Adapter extends RecyclerListView.SelectionAdapter {
        private Adapter() {
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
        public int getItemCount() {
            return NotificationsSoundActivity.this.rowCount;
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
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0 || viewHolder.getItemViewType() == 2;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                ToneCell toneCell = (ToneCell) viewHolder.itemView;
                NotificationsSoundActivity notificationsSoundActivity = NotificationsSoundActivity.this;
                int i2 = notificationsSoundActivity.systemTonesStartRow;
                Tone tone = (i < i2 || i >= notificationsSoundActivity.systemTonesEndRow) ? null : notificationsSoundActivity.systemTones.get(i - i2);
                NotificationsSoundActivity notificationsSoundActivity2 = NotificationsSoundActivity.this;
                int i3 = notificationsSoundActivity2.serverTonesStartRow;
                if (i >= i3 && i < notificationsSoundActivity2.serverTonesEndRow) {
                    tone = notificationsSoundActivity2.serverTones.get(i - i3);
                }
                if (tone != null) {
                    boolean z = toneCell.tone == tone;
                    NotificationsSoundActivity notificationsSoundActivity3 = NotificationsSoundActivity.this;
                    boolean z2 = tone == notificationsSoundActivity3.selectedTone;
                    boolean z3 = notificationsSoundActivity3.selectedTones.get(tone.stableId) != null;
                    toneCell.tone = tone;
                    toneCell.textView.setText(tone.title);
                    toneCell.needDivider = i != NotificationsSoundActivity.this.systemTonesEndRow - 1;
                    toneCell.radioButton.setChecked(z2, z);
                    toneCell.checkBox.setChecked(z3, z);
                    return;
                }
                return;
            }
            if (itemViewType == 1) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                NotificationsSoundActivity notificationsSoundActivity4 = NotificationsSoundActivity.this;
                if (i == notificationsSoundActivity4.serverTonesHeaderRow) {
                    headerCell.setText(LocaleController.getString(R.string.TelegramTones));
                    return;
                } else {
                    if (i == notificationsSoundActivity4.systemTonesHeaderRow) {
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
            CombinedDrawable combinedDrawable = new CombinedDrawable(drawable, drawable2);
            creationTextCell.textView.setText(LocaleController.getString(R.string.UploadSound));
            creationTextCell.imageView.setImageDrawable(combinedDrawable);
            creationTextCell.divider = false;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            Context context = viewGroup.getContext();
            if (i == 0) {
                ToneCell toneCell = new ToneCell(context, NotificationsSoundActivity.this.resourcesProvider);
                toneCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, NotificationsSoundActivity.this.resourcesProvider));
                shadowSectionCell = toneCell;
            } else if (i == 2) {
                CreationTextCell creationTextCell = new CreationTextCell(context, 70, NotificationsSoundActivity.this.resourcesProvider);
                creationTextCell.startPadding = 61;
                creationTextCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, NotificationsSoundActivity.this.resourcesProvider));
                shadowSectionCell = creationTextCell;
            } else if (i != 3) {
                HeaderCell headerCell = new HeaderCell(context, NotificationsSoundActivity.this.resourcesProvider);
                headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, NotificationsSoundActivity.this.resourcesProvider));
                shadowSectionCell = headerCell;
            } else {
                shadowSectionCell = new ShadowSectionCell(context, NotificationsSoundActivity.this.resourcesProvider, 0);
            }
            return zzkd.m(shadowSectionCell, shadowSectionCell, -2);
        }

        public Adapter(NotificationsSoundActivity notificationsSoundActivity, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class Tone {
        TLRPC.Document document;
        public boolean fromServer;
        boolean isSystemDefault;
        boolean isSystemNoSound;
        int localId;
        int stableId;
        String title;
        String uri;

        private Tone() {
        }

        public Uri getUriForShare(int i) {
            if (!TextUtils.isEmpty(this.uri)) {
                return Uri.fromFile(new File(this.uri));
            }
            TLRPC.Document document = this.document;
            if (document == null) {
                return null;
            }
            String strM = document.file_name_fixed;
            String documentExtension = FileLoader.getDocumentExtension(document);
            if (documentExtension == null) {
                return null;
            }
            String lowerCase = documentExtension.toLowerCase();
            if (!strM.endsWith(lowerCase)) {
                strM = zziq.m(strM, ".", lowerCase);
            }
            File file = new File(AndroidUtilities.getCacheDir(), strM);
            if (!file.exists()) {
                try {
                    AndroidUtilities.copyFile(FileLoader.getInstance(i).getPathToAttach(this.document), file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return Uri.fromFile(file);
        }

        public Tone(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class ToneCell extends FrameLayout {
        private CheckBox2 checkBox;
        private boolean needDivider;
        private RadioButton radioButton;
        private TextView textView;
        Tone tone;
        public TextView valueTextView;

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
            CheckBox2 checkBox3 = this.checkBox;
            boolean z2 = LocaleController.isRTL;
            addView(checkBox3, LayoutHelper.createFrame(26, 26.0f, (z2 ? 5 : 3) | 16, z2 ? 0 : 18, 0.0f, z2 ? 18 : 0, 0.0f));
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
        public void onDraw(Canvas canvas) {
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

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }
    }

    public NotificationsSoundActivity(Bundle bundle) {
        this(bundle, null);
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

    public void hideActionMode() {
        this.selectedTones.clear();
        Adapter adapter = this.adapter;
        adapter.notifyItemRangeChanged(0, adapter.getItemCount());
        updateActionMode();
    }

    public static boolean lambda$createView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$createView$1(Context context, View view, int i) {
        NotificationsSoundActivity notificationsSoundActivity;
        Context context2;
        File pathToAttach;
        if (i == this.uploadRow) {
            notificationsSoundActivity = this;
            context2 = context;
            ChatAttachAlert chatAttachAlert = new ChatAttachAlert(context2, notificationsSoundActivity, false, false, true, this.resourcesProvider);
            notificationsSoundActivity.chatAttachAlert = chatAttachAlert;
            chatAttachAlert.setSoundPicker();
            notificationsSoundActivity.chatAttachAlert.init();
            notificationsSoundActivity.chatAttachAlert.show();
        } else {
            notificationsSoundActivity = this;
            context2 = context;
        }
        if (view instanceof ToneCell) {
            ToneCell toneCell = (ToneCell) view;
            if (notificationsSoundActivity.actionBar.isActionModeShowed() || toneCell.tone == null) {
                checkSelection(toneCell.tone);
                return;
            }
            Ringtone ringtone = notificationsSoundActivity.lastPlayedRingtone;
            if (ringtone != null) {
                ringtone.stop();
            }
            try {
                Tone tone = toneCell.tone;
                if (tone.isSystemDefault) {
                    Ringtone ringtone2 = RingtoneManager.getRingtone(context2.getApplicationContext(), RingtoneManager.getDefaultUri(2));
                    ringtone2.setStreamType(4);
                    notificationsSoundActivity.lastPlayedRingtone = ringtone2;
                    ringtone2.play();
                } else {
                    String str = tone.uri;
                    if (str != null && !tone.fromServer) {
                        Ringtone ringtone3 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(toneCell.tone.uri));
                        ringtone3.setStreamType(4);
                        notificationsSoundActivity.lastPlayedRingtone = ringtone3;
                        ringtone3.play();
                    } else if (tone.fromServer) {
                        if (TextUtils.isEmpty(str)) {
                            pathToAttach = null;
                        } else {
                            pathToAttach = new File(toneCell.tone.uri);
                            if (!pathToAttach.exists()) {
                                pathToAttach = null;
                            }
                        }
                        if (pathToAttach == null) {
                            pathToAttach = getFileLoader().getPathToAttach(toneCell.tone.document);
                        }
                        if (pathToAttach == null || !pathToAttach.exists()) {
                            FileLoader fileLoader = getFileLoader();
                            TLRPC.Document document = toneCell.tone.document;
                            fileLoader.loadFile(document, document, 3, 0);
                        } else {
                            Ringtone ringtone4 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(pathToAttach.toString()));
                            ringtone4.setStreamType(4);
                            notificationsSoundActivity.lastPlayedRingtone = ringtone4;
                            ringtone4.play();
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            notificationsSoundActivity.startSelectedTone = null;
            notificationsSoundActivity.selectedTone = toneCell.tone;
            notificationsSoundActivity.selectedToneChanged = true;
            Adapter adapter = notificationsSoundActivity.adapter;
            adapter.notifyItemRangeChanged(0, adapter.getItemCount());
        }
    }

    public boolean lambda$createView$2(View view, int i) {
        if (view instanceof ToneCell) {
            ToneCell toneCell = (ToneCell) view;
            checkSelection(toneCell.tone);
            toneCell.performHapticFeedback(0);
        }
        return false;
    }

    private void loadTones() {
        AnonymousClass1 anonymousClass1;
        TLRPC.Document document;
        TLRPC.Document document2;
        getMediaDataController().ringtoneDataStore.loadUserRingtones(false);
        this.serverTones.clear();
        this.systemTones.clear();
        int i = 0;
        while (true) {
            anonymousClass1 = null;
            if (i >= getMediaDataController().ringtoneDataStore.userRingtones.size()) {
                break;
            }
            RingtoneDataStore.CachedTone cachedTone = (RingtoneDataStore.CachedTone) getMediaDataController().ringtoneDataStore.userRingtones.get(i);
            Tone tone = new Tone(anonymousClass1);
            int i2 = this.stableIds;
            this.stableIds = i2 + 1;
            tone.stableId = i2;
            tone.fromServer = true;
            tone.localId = cachedTone.localId;
            TLRPC.Document document3 = cachedTone.document;
            tone.title = document3.file_name_fixed;
            tone.document = document3;
            trimTitle(tone);
            tone.uri = cachedTone.localUri;
            Tone tone2 = this.startSelectedTone;
            if (tone2 != null && (document = tone2.document) != null && (document2 = cachedTone.document) != null && document.id == document2.id) {
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
        if (getMediaDataController().ringtoneDataStore.loaded && this.selectedTone == null) {
            this.selectedTone = tone4;
            this.selectedToneChanged = true;
        }
        updateRows();
    }

    private void trimTitle(Tone tone) {
        tone.title = trimTitle(tone.document, tone.title);
    }

    private void updateActionMode() {
        if (this.selectedTones.size() <= 0) {
            this.actionBar.hideActionMode();
        } else {
            this.selectedTonesCountTextView.setNumber(this.selectedTones.size(), this.actionBar.isActionModeShowed());
            this.actionBar.showActionMode();
        }
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
            int size = this.serverTones.size() + i;
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
            int size2 = this.systemTones.size() + i4;
            this.rowCount = size2;
            this.systemTonesEndRow = size2;
        }
        int i5 = this.rowCount;
        this.rowCount = i5 + 1;
        this.dividerRow2 = i5;
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_avatar_actionBarSelectorBlue, this.resourcesProvider), false);
        this.actionBar.setItemsColor(Theme.getColor(Theme.key_actionBarDefaultIcon, this.resourcesProvider), false);
        zzki.m(this.actionBar);
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
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.dialogId));
                if (user != null) {
                    this.avatarContainer.setUserAvatar(user);
                    this.avatarContainer.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            } else if (this.topicId != 0) {
                TLRPC.TL_forumTopic tL_forumTopicFindTopic = getMessagesController().getTopicsController().findTopic(-this.dialogId, this.topicId);
                ForumUtilities.setTopicIcon(this.avatarContainer.getAvatarImageView(), tL_forumTopicFindTopic, false, true, this.resourcesProvider);
                this.avatarContainer.setTitle(tL_forumTopicFindTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
                this.avatarContainer.setChatAvatar(chat);
                this.avatarContainer.setTitle(chat.title);
            }
            this.avatarContainer.setSubtitle(LocaleController.getString(R.string.NotificationsSound));
        }
        ActionBarMenu actionBarMenuCreateActionMode = this.actionBar.createActionMode();
        NumberTextView numberTextView = new NumberTextView(actionBarMenuCreateActionMode.getContext());
        this.selectedTonesCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedTonesCountTextView.setTypeface(AndroidUtilities.bold());
        this.selectedTonesCountTextView.setTextColor(Theme.getColor(Theme.key_actionBarActionModeDefaultIcon, this.resourcesProvider));
        actionBarMenuCreateActionMode.addView(this.selectedTonesCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, 72, 0, 0, 0));
        this.selectedTonesCountTextView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda59(20));
        actionBarMenuCreateActionMode.addItemWithWidth(2, R.drawable.msg_forward, LocaleController.getString(R.string.ShareFile), AndroidUtilities.dp(54.0f));
        actionBarMenuCreateActionMode.addItemWithWidth(1, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        Adapter adapter = new Adapter(this, anonymousClass1);
        this.adapter = adapter;
        adapter.setHasStableIds(true);
        this.listView.setAdapter(this.adapter);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setSupportsChangeAnimations(false);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(false);
        CacheChatsExceptionsFragment$$ExternalSyntheticOutline0.m(1, this.listView, false);
        this.listView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda5(11, this, context));
        this.listView.setOnItemLongClickListener(new TodoItemMenu$$ExternalSyntheticLambda3(this, 8));
        loadTones();
        updateRows();
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.Document document;
        TLRPC.Document document2;
        if (i == NotificationCenter.onUserRingtonesUpdated) {
            HashMap map = new HashMap();
            for (int i3 = 0; i3 < this.serverTones.size(); i3++) {
                map.put(Integer.valueOf(this.serverTones.get(i3).localId), this.serverTones.get(i3));
            }
            this.serverTones.clear();
            int i4 = 0;
            while (true) {
                AnonymousClass1 anonymousClass1 = null;
                if (i4 >= getMediaDataController().ringtoneDataStore.userRingtones.size()) {
                    break;
                }
                RingtoneDataStore.CachedTone cachedTone = (RingtoneDataStore.CachedTone) getMediaDataController().ringtoneDataStore.userRingtones.get(i4);
                Tone tone = new Tone(anonymousClass1);
                Tone tone2 = (Tone) map.get(Integer.valueOf(cachedTone.localId));
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
                TLRPC.Document document3 = cachedTone.document;
                if (document3 != null) {
                    tone.title = document3.file_name_fixed;
                } else {
                    tone.title = new File(cachedTone.localUri).getName();
                }
                tone.document = cachedTone.document;
                trimTitle(tone);
                tone.uri = cachedTone.localUri;
                Tone tone3 = this.startSelectedTone;
                if (tone3 != null && (document = tone3.document) != null && (document2 = cachedTone.document) != null && document.id == document2.id) {
                    this.startSelectedTone = null;
                    this.selectedTone = tone;
                }
                this.serverTones.add(tone);
                i4++;
            }
            updateRows();
            this.adapter.notifyDataSetChanged();
            if (getMediaDataController().ringtoneDataStore.loaded && this.selectedTone == null && this.systemTones.size() > 0) {
                this.startSelectedTone = null;
                this.selectedTone = this.systemTones.get(0);
            }
        }
    }

    @Override
    public void didSelectFiles(ArrayList<String> arrayList, String str, ArrayList<TLRPC.MessageEntity> arrayList2, ArrayList<MessageObject> arrayList3, boolean z, int i, int i2, long j, boolean z2, long j2) {
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            getMediaDataController().uploadRingtone(arrayList.get(i3));
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
    }

    @Override
    public final void didSelectPhotos(ArrayList arrayList, boolean z, int i, int i2, long j) {
        ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate.CC.$default$didSelectPhotos(this, arrayList, z, i, i2, j);
    }

    @Override
    public Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i != 21 || intent == null || this.chatAttachAlert == null) {
            return;
        }
        boolean z = true;
        if (intent.getData() != null) {
            String path = AndroidUtilities.getPath(intent.getData());
            if (path == null) {
                z = false;
            } else {
                if (path.startsWith("content://")) {
                    path = MediaController.copyFileToCache(intent.getData(), "mp3");
                }
                if (this.chatAttachAlert.getDocumentLayout().isRingtone(new File(path))) {
                    getMediaDataController().uploadRingtone(path);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                } else {
                    z = false;
                }
            }
        } else if (intent.getClipData() != null) {
            ClipData clipData = intent.getClipData();
            boolean z2 = false;
            for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                Uri uri = clipData.getItemAt(i3).getUri();
                String string = uri.toString();
                if (string.startsWith("content://")) {
                    string = MediaController.copyFileToCache(uri, "mp3");
                }
                if (this.chatAttachAlert.getDocumentLayout().isRingtone(new File(string))) {
                    getMediaDataController().uploadRingtone(string);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                    z2 = true;
                }
            }
            z = z2;
        } else {
            z = false;
        }
        if (z) {
            this.chatAttachAlert.lambda$showGiftOfferSheet$15();
        }
    }

    @Override
    public boolean onFragmentCreate() {
        String strM;
        String strM2;
        if (getArguments() != null) {
            this.dialogId = getArguments().getLong("dialog_id", 0L);
            this.topicId = getArguments().getLong("topic_id", 0L);
            this.currentType = getArguments().getInt("type", -1);
        }
        long j = this.dialogId;
        if (j != 0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j, this.topicId);
            strM2 = zzii.m("sound_document_id_", sharedPrefKey);
            strM = zzii.m("sound_path_", sharedPrefKey);
        } else {
            int i = this.currentType;
            if (i == 1) {
                strM = "GlobalSoundPath";
                strM2 = "GlobalSoundDocId";
            } else if (i == 0) {
                strM = "GroupSoundPath";
                strM2 = "GroupSoundDocId";
            } else if (i == 2) {
                strM = "ChannelSoundPath";
                strM2 = "ChannelSoundDocId";
            } else if (i == 3) {
                strM = "StoriesSoundPath";
                strM2 = "StoriesSoundDocId";
            } else {
                if (i != 4 && i != 5) {
                    throw new RuntimeException("Unsupported type");
                }
                strM = "ReactionSoundPath";
                strM2 = "ReactionSoundDocId";
            }
        }
        SharedPreferences notificationsSettings = getNotificationsSettings();
        long j2 = notificationsSettings.getLong(strM2, 0L);
        String string = notificationsSettings.getString(strM, "NoSound");
        Tone tone = new Tone(null);
        this.startSelectedTone = tone;
        if (j2 != 0) {
            tone.document = new TLRPC.TL_document();
            this.startSelectedTone.document.id = j2;
        } else {
            tone.uri = string;
        }
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        String strM;
        String strM2;
        String strM3;
        TLRPC.Document document;
        super.onFragmentDestroy();
        if (this.selectedTone == null || !this.selectedToneChanged) {
            return;
        }
        SharedPreferences.Editor editorEdit = getNotificationsSettings().edit();
        if (this.dialogId != 0) {
            strM = MessagesController$$ExternalSyntheticOutline1.m(this.dialogId, this.topicId, new StringBuilder("sound_"));
            strM2 = MessagesController$$ExternalSyntheticOutline1.m(this.dialogId, this.topicId, new StringBuilder("sound_path_"));
            strM3 = MessagesController$$ExternalSyntheticOutline1.m(this.dialogId, this.topicId, new StringBuilder("sound_document_id_"));
            editorEdit.putBoolean(MessagesController$$ExternalSyntheticOutline1.m(this.dialogId, this.topicId, new StringBuilder("sound_enabled_")), true);
        } else {
            int i = this.currentType;
            if (i == 1) {
                strM = "GlobalSound";
                strM2 = "GlobalSoundPath";
                strM3 = "GlobalSoundDocId";
            } else if (i == 0) {
                strM = "GroupSound";
                strM2 = "GroupSoundPath";
                strM3 = "GroupSoundDocId";
            } else if (i == 2) {
                strM = "ChannelSound";
                strM2 = "ChannelSoundPath";
                strM3 = "ChannelSoundDocId";
            } else if (i == 3) {
                strM = "StoriesSound";
                strM2 = "StoriesSoundPath";
                strM3 = "StoriesSoundDocId";
            } else {
                if (i != 5 && i != 4) {
                    throw new RuntimeException("Unsupported type");
                }
                strM = "ReactionSound";
                strM2 = "ReactionSoundPath";
                strM3 = "ReactionSoundDocId";
            }
        }
        Tone tone = this.selectedTone;
        if (tone.fromServer && (document = tone.document) != null) {
            editorEdit.putLong(strM3, document.id);
            editorEdit.putString(strM, this.selectedTone.title);
            editorEdit.putString(strM2, "NoSound");
        } else if (tone.uri != null) {
            editorEdit.putString(strM, tone.title);
            editorEdit.putString(strM2, this.selectedTone.uri);
            editorEdit.remove(strM3);
        } else if (tone.isSystemDefault) {
            editorEdit.putString(strM, "Default");
            editorEdit.putString(strM2, "Default");
            editorEdit.remove(strM3);
        } else {
            editorEdit.putString(strM, "NoSound");
            editorEdit.putString(strM2, "NoSound");
            editorEdit.remove(strM3);
        }
        editorEdit.apply();
        if (this.dialogId != 0) {
            getNotificationsController().updateServerNotificationsSettings(this.dialogId, this.topicId);
        } else {
            getNotificationsController().updateServerNotificationsSettings(this.currentType);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
        }
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setClipToPadding(false);
        this.listView.setPadding(0, 0, 0, i4);
    }

    @Override
    public void onPause() {
        super.onPause();
        getNotificationCenter().removeObserver(this, NotificationCenter.onUserRingtonesUpdated);
    }

    @Override
    public void onResume() {
        super.onResume();
        getNotificationCenter().addObserver(this, NotificationCenter.onUserRingtonesUpdated);
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
    public final void startMusicSelectActivity() {
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

    public static String trimTitle(TLRPC.Document document, String str) {
        int iLastIndexOf;
        if (str != null && (iLastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, iLastIndexOf);
        }
        return (!TextUtils.isEmpty(str) || document == null) ? str : LocaleController.formatString("SoundNameEmpty", R.string.SoundNameEmpty, LocaleController.formatDateChat(document.date, true));
    }
}
