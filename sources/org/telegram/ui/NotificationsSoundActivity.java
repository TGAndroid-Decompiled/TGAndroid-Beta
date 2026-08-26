package org.telegram.ui;

import android.app.Activity;
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
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import com.google.android.gms.internal.mlkit_language_id_common.zzit;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
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
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline1;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.ringtone.RingtoneDataStore;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CreationTextCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.RecyclerListView;

public final class NotificationsSoundActivity extends BaseFragment implements ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate, NotificationCenter.NotificationCenterDelegate {
    public Adapter adapter;
    public ChatAvatarContainer avatarContainer;
    public ChatAttachAlert chatAttachAlert;
    public int currentType;
    public long dialogId;
    public int dividerRow;
    public int dividerRow2;
    public Ringtone lastPlayedRingtone;
    public RecyclerListView listView;
    public final Theme.ResourcesProvider resourcesProvider;
    public int rowCount;
    public Tone selectedTone;
    public boolean selectedToneChanged;
    public final SparseArray selectedTones;
    public NumberTextView selectedTonesCountTextView;
    public final ArrayList serverTones;
    public int serverTonesEndRow;
    public int serverTonesStartRow;
    public int stableIds;
    public Tone startSelectedTone;
    public final ArrayList systemTones;
    public int systemTonesEndRow;
    public int systemTonesHeaderRow;
    public int systemTonesStartRow;
    public long topicId;
    public int uploadRow;
    public final ArrayList uploadingTones;

    public final class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        public final Context val$context;

        public AnonymousClass1(Context context) {
            this.val$context = context;
        }

        @Override
        public final void onItemClick(int i) {
            NotificationsSoundActivity notificationsSoundActivity = NotificationsSoundActivity.this;
            if (i == -1) {
                if (((BaseFragment) notificationsSoundActivity).actionBar.isActionModeShowed()) {
                    NotificationsSoundActivity.access$200(notificationsSoundActivity);
                    return;
                } else {
                    notificationsSoundActivity.finishFragment();
                    return;
                }
            }
            SparseArray sparseArray = notificationsSoundActivity.selectedTones;
            if (i == 1) {
                Activity parentActivity = notificationsSoundActivity.getParentActivity();
                Theme.ResourcesProvider resourcesProvider = notificationsSoundActivity.resourcesProvider;
                AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity, 0, resourcesProvider);
                String pluralString = LocaleController.formatPluralString("DeleteTones", sparseArray.size(), new Object[0]);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = pluralString;
                alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", sparseArray.size(), new Object[0]));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new PhotoViewer$$ExternalSyntheticLambda97(13));
                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new PhotoViewer$$ExternalSyntheticLambda115(this, 15));
                TextView textView = (TextView) builder.show().getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider));
                    return;
                }
                return;
            }
            if (i == 2) {
                int size = sparseArray.size();
                Context context = this.val$context;
                if (size == 1) {
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.setAction("android.intent.action.SEND");
                    Uri uriForShare = ((Tone) sparseArray.valueAt(0)).getUriForShare(((BaseFragment) notificationsSoundActivity).currentAccount);
                    if (uriForShare != null) {
                        intent.putExtra("android.intent.extra.STREAM", uriForShare);
                        context.startActivity(intent);
                    }
                } else {
                    Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent2.setAction("android.intent.action.SEND_MULTIPLE");
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                        Uri uriForShare2 = ((Tone) sparseArray.valueAt(i2)).getUriForShare(((BaseFragment) notificationsSoundActivity).currentAccount);
                        if (uriForShare2 != null) {
                            arrayList.add(uriForShare2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                        context.startActivity(intent2);
                    }
                }
                NotificationsSoundActivity.access$200(notificationsSoundActivity);
                notificationsSoundActivity.updateRows$10();
                notificationsSoundActivity.adapter.mObservable.notifyChanged();
            }
        }
    }

    public final class Adapter extends RecyclerListView.SelectionAdapter {
        public Adapter() {
        }

        @Override
        public final int getItemCount() {
            return NotificationsSoundActivity.this.rowCount;
        }

        @Override
        public final long getItemId(int i) {
            Tone tone;
            NotificationsSoundActivity notificationsSoundActivity = NotificationsSoundActivity.this;
            int i2 = notificationsSoundActivity.systemTonesStartRow;
            if (i < i2 || i >= notificationsSoundActivity.systemTonesEndRow) {
                int i3 = notificationsSoundActivity.serverTonesStartRow;
                tone = (i < i3 || i >= notificationsSoundActivity.serverTonesEndRow) ? null : (Tone) notificationsSoundActivity.serverTones.get(i - i3);
            } else {
                tone = (Tone) notificationsSoundActivity.systemTones.get(i - i2);
            }
            if (tone != null) {
                return tone.stableId;
            }
            notificationsSoundActivity.getClass();
            if (i == 0) {
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
        public final int getItemViewType(int i) {
            NotificationsSoundActivity notificationsSoundActivity = NotificationsSoundActivity.this;
            if (i >= notificationsSoundActivity.systemTonesStartRow && i < notificationsSoundActivity.systemTonesEndRow) {
                return 0;
            }
            if (i == 0 || i == notificationsSoundActivity.systemTonesHeaderRow) {
                return 1;
            }
            if (i == notificationsSoundActivity.uploadRow) {
                return 2;
            }
            return (i == notificationsSoundActivity.dividerRow || i == notificationsSoundActivity.dividerRow2) ? 3 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return i == 0 || i == 2;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = viewHolder.mItemViewType;
            NotificationsSoundActivity notificationsSoundActivity = NotificationsSoundActivity.this;
            View view = viewHolder.itemView;
            if (i2 == 0) {
                ToneCell toneCell = (ToneCell) view;
                int i3 = notificationsSoundActivity.systemTonesStartRow;
                Tone tone = (i < i3 || i >= notificationsSoundActivity.systemTonesEndRow) ? null : (Tone) notificationsSoundActivity.systemTones.get(i - i3);
                int i4 = notificationsSoundActivity.serverTonesStartRow;
                if (i >= i4 && i < notificationsSoundActivity.serverTonesEndRow) {
                    tone = (Tone) notificationsSoundActivity.serverTones.get(i - i4);
                }
                if (tone != null) {
                    boolean z = toneCell.tone == tone;
                    boolean z2 = tone == notificationsSoundActivity.selectedTone;
                    boolean z3 = notificationsSoundActivity.selectedTones.get(tone.stableId) != null;
                    toneCell.tone = tone;
                    toneCell.textView.setText(tone.title);
                    toneCell.needDivider = i != notificationsSoundActivity.systemTonesEndRow - 1;
                    toneCell.radioButton.setChecked(z2, z);
                    toneCell.checkBox.checkBoxBase.setChecked(-1, z3, z);
                    return;
                }
                return;
            }
            if (i2 == 1) {
                HeaderCell headerCell = (HeaderCell) view;
                if (i == 0) {
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
            if (i2 != 2) {
                return;
            }
            CreationTextCell creationTextCell = (CreationTextCell) view;
            Drawable drawable = creationTextCell.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = creationTextCell.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
            int i5 = Theme.key_switchTrackChecked;
            Theme.ResourcesProvider resourcesProvider = notificationsSoundActivity.resourcesProvider;
            int color = Theme.getColor(i5, resourcesProvider);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_checkboxCheck, resourcesProvider), mode));
            CombinedDrawable combinedDrawable = new CombinedDrawable(drawable, drawable2);
            creationTextCell.textView.setText(LocaleController.getString(R.string.UploadSound), false);
            creationTextCell.imageView.setImageDrawable(combinedDrawable);
            creationTextCell.divider = false;
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            Context context = viewGroup.getContext();
            Theme.ResourcesProvider resourcesProvider = NotificationsSoundActivity.this.resourcesProvider;
            if (i == 0) {
                ToneCell toneCell = new ToneCell(context, resourcesProvider);
                toneCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
                shadowSectionCell = toneCell;
            } else if (i == 2) {
                CreationTextCell creationTextCell = new CreationTextCell(context, 70, resourcesProvider);
                creationTextCell.startPadding = 61;
                creationTextCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
                shadowSectionCell = creationTextCell;
            } else if (i != 3) {
                HeaderCell headerCell = new HeaderCell(context, resourcesProvider);
                headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
                shadowSectionCell = headerCell;
            } else {
                shadowSectionCell = new ShadowSectionCell(context, (Object) null);
            }
            return zzkl.m(shadowSectionCell, shadowSectionCell);
        }
    }

    public final class Tone {
        public TLRPC.Document document;
        public boolean fromServer;
        public boolean isSystemDefault;
        public int localId;
        public int stableId;
        public String title;
        public String uri;

        public final Uri getUriForShare(int i) {
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
                strM = zzit.m(strM, ".", lowerCase);
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
    }

    public final class ToneCell extends FrameLayout {
        public final CheckBox2 checkBox;
        public boolean needDivider;
        public final RadioButton radioButton;
        public final TextView textView;
        public Tone tone;

        public ToneCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            RadioButton radioButton = new RadioButton(context);
            this.radioButton = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            int color = Theme.getColor(Theme.key_radioBackground, resourcesProvider);
            int color2 = Theme.getColor(Theme.key_radioBackgroundChecked, resourcesProvider);
            radioButton.color = color;
            radioButton.checkedColor = color2;
            radioButton.invalidate();
            boolean z = LocaleController.isRTL;
            addView(radioButton, LayoutHelper.createFrame(22, 22.0f, (z ? 5 : 3) | 16, z ? 0 : 20, 0.0f, z ? 20 : 0, 0.0f));
            CheckBox2 checkBox2 = new CheckBox2(context, 24, resourcesProvider);
            this.checkBox = checkBox2;
            int i = Theme.key_windowBackgroundWhite;
            int i2 = Theme.key_checkboxCheck;
            CheckBoxBase checkBoxBase = checkBox2.checkBoxBase;
            checkBoxBase.setColor(-1, i, i2);
            checkBox2.setDrawUnchecked(false);
            checkBox2.setDrawBackgroundAsArc(3);
            boolean z2 = LocaleController.isRTL;
            addView(checkBox2, LayoutHelper.createFrame(26, 26.0f, (z2 ? 5 : 3) | 16, z2 ? 0 : 18, 0.0f, z2 ? 18 : 0, 0.0f));
            checkBoxBase.setChecked(-1, true, false);
            TextView textView = new TextView(context);
            this.textView = textView;
            OKLCH.m(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider, textView, 16.0f);
            textView.setLines(1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z3 = LocaleController.isRTL;
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, (z3 ? 5 : 3) | 16, z3 ? 23 : 61, 0.0f, z3 ? 61 : 23, 0.0f));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            if (this.needDivider) {
                canvas.drawLine(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 60.0f), getHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 60.0f : 0.0f), getHeight() - 1, Theme.dividerPaint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.RadioButton");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.radioButton.isChecked);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }
    }

    public NotificationsSoundActivity(Bundle bundle, Theme.ResourcesProvider resourcesProvider) {
        super(bundle);
        this.serverTones = new ArrayList();
        this.systemTones = new ArrayList();
        this.uploadingTones = new ArrayList();
        this.stableIds = 100;
        this.selectedTones = new SparseArray();
        this.currentType = -1;
        this.topicId = 0L;
        this.resourcesProvider = resourcesProvider;
    }

    public static void access$200(NotificationsSoundActivity notificationsSoundActivity) {
        SparseArray sparseArray = notificationsSoundActivity.selectedTones;
        sparseArray.clear();
        Adapter adapter = notificationsSoundActivity.adapter;
        adapter.mObservable.notifyItemRangeChanged(0, NotificationsSoundActivity.this.rowCount, null);
        if (sparseArray.size() <= 0) {
            notificationsSoundActivity.actionBar.hideActionMode$1();
        } else {
            notificationsSoundActivity.selectedTonesCountTextView.setNumber(sparseArray.size(), notificationsSoundActivity.actionBar.isActionModeShowed());
            notificationsSoundActivity.actionBar.showActionMode(null, null);
        }
    }

    public static String trimTitle(TLRPC.Document document, String str) {
        int iLastIndexOf;
        if (str != null && (iLastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, iLastIndexOf);
        }
        return (!TextUtils.isEmpty(str) || document == null) ? str : LocaleController.formatString("SoundNameEmpty", R.string.SoundNameEmpty, LocaleController.formatDateChat(document.date, true));
    }

    @Override
    public final View createView(Context context) {
        TLRPC.Document document;
        TLRPC.Document document2;
        this.actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_avatar_actionBarSelectorBlue, this.resourcesProvider), false);
        this.actionBar.setItemsColor(Theme.getColor(Theme.key_actionBarDefaultIcon, this.resourcesProvider), false);
        zzkt.m(this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1(context));
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
        ActionBar.AnonymousClass1 anonymousClass1CreateActionMode = this.actionBar.createActionMode(null);
        NumberTextView numberTextView = new NumberTextView(anonymousClass1CreateActionMode.getContext());
        this.selectedTonesCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedTonesCountTextView.setTypeface(AndroidUtilities.bold());
        this.selectedTonesCountTextView.setTextColor(Theme.getColor(Theme.key_actionBarActionModeDefaultIcon, this.resourcesProvider));
        anonymousClass1CreateActionMode.addView(this.selectedTonesCountTextView, LayoutHelper.createLinear(1.0f, 0, -1, 72, 0, 0));
        this.selectedTonesCountTextView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
        anonymousClass1CreateActionMode.addItemWithWidth(2, R.drawable.msg_forward, LocaleController.getString(R.string.ShareFile), AndroidUtilities.dp(54.0f));
        anonymousClass1CreateActionMode.addItemWithWidth(1, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider));
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        adapter.setHasStableIds(true);
        this.listView.setAdapter(this.adapter);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).mSupportsChangeAnimations = false;
        ((DefaultItemAnimator) this.listView.getItemAnimator()).delayAnimations = false;
        zzku.m(this.listView);
        this.listView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(19, this, context));
        this.listView.setOnItemLongClickListener(new PhotoViewer$$ExternalSyntheticLambda115(this, 14));
        getMediaDataController().ringtoneDataStore.loadUserRingtones(false);
        this.serverTones.clear();
        this.systemTones.clear();
        for (int i2 = 0; i2 < getMediaDataController().ringtoneDataStore.userRingtones.size(); i2++) {
            RingtoneDataStore.CachedTone cachedTone = (RingtoneDataStore.CachedTone) getMediaDataController().ringtoneDataStore.userRingtones.get(i2);
            Tone tone = new Tone();
            int i3 = this.stableIds;
            this.stableIds = i3 + 1;
            tone.stableId = i3;
            tone.fromServer = true;
            tone.localId = cachedTone.localId;
            TLRPC.Document document3 = cachedTone.document;
            String str = document3.file_name_fixed;
            tone.title = str;
            tone.document = document3;
            tone.title = trimTitle(document3, str);
            tone.uri = cachedTone.localUri;
            Tone tone2 = this.startSelectedTone;
            if (tone2 != null && (document = tone2.document) != null && (document2 = cachedTone.document) != null && document.id == document2.id) {
                this.startSelectedTone = null;
                this.selectedTone = tone;
            }
            this.serverTones.add(tone);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        Tone tone3 = new Tone();
        int i4 = this.stableIds;
        this.stableIds = i4 + 1;
        tone3.stableId = i4;
        tone3.title = LocaleController.getString(R.string.NoSound);
        this.systemTones.add(tone3);
        Tone tone4 = new Tone();
        int i5 = this.stableIds;
        this.stableIds = i5 + 1;
        tone4.stableId = i5;
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
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            Tone tone7 = new Tone();
            int i6 = this.stableIds;
            this.stableIds = i6 + 1;
            tone7.stableId = i6;
            tone7.title = string;
            tone7.uri = str2;
            Tone tone8 = this.startSelectedTone;
            if (tone8 != null && tone8.document == null && tone8.uri.equals(str2)) {
                this.startSelectedTone = null;
                this.selectedTone = tone7;
            }
            this.systemTones.add(tone7);
        }
        if (getMediaDataController().ringtoneDataStore.loaded && this.selectedTone == null) {
            this.selectedTone = tone4;
            this.selectedToneChanged = true;
        }
        updateRows$10();
        updateRows$10();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList arrayList;
        TLRPC.Document document;
        TLRPC.Document document2;
        if (i == NotificationCenter.onUserRingtonesUpdated) {
            HashMap map = new HashMap();
            int i3 = 0;
            while (true) {
                arrayList = this.serverTones;
                if (i3 >= arrayList.size()) {
                    break;
                }
                map.put(Integer.valueOf(((Tone) arrayList.get(i3)).localId), (Tone) arrayList.get(i3));
                i3++;
            }
            arrayList.clear();
            for (int i4 = 0; i4 < getMediaDataController().ringtoneDataStore.userRingtones.size(); i4++) {
                RingtoneDataStore.CachedTone cachedTone = (RingtoneDataStore.CachedTone) getMediaDataController().ringtoneDataStore.userRingtones.get(i4);
                Tone tone = new Tone();
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
                TLRPC.Document document4 = cachedTone.document;
                tone.document = document4;
                tone.title = trimTitle(document4, tone.title);
                tone.uri = cachedTone.localUri;
                Tone tone3 = this.startSelectedTone;
                if (tone3 != null && (document = tone3.document) != null && (document2 = cachedTone.document) != null && document.id == document2.id) {
                    this.startSelectedTone = null;
                    this.selectedTone = tone;
                }
                arrayList.add(tone);
            }
            updateRows$10();
            this.adapter.mObservable.notifyChanged();
            if (getMediaDataController().ringtoneDataStore.loaded && this.selectedTone == null) {
                ArrayList arrayList2 = this.systemTones;
                if (arrayList2.size() > 0) {
                    this.startSelectedTone = null;
                    this.selectedTone = (Tone) arrayList2.get(0);
                }
            }
        }
    }

    @Override
    public final void didSelectFiles(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            getMediaDataController().uploadRingtone((String) arrayList.get(i2));
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
    }

    @Override
    public final void didSelectPhotos(long j, ArrayList arrayList, boolean z, int i) {
    }

    @Override
    public final Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$createView$1(Context context, View view, int i) {
        NotificationsSoundActivity notificationsSoundActivity;
        Context context2;
        File pathToAttach;
        if (i == this.uploadRow) {
            notificationsSoundActivity = this;
            context2 = context;
            ChatAttachAlert chatAttachAlert = new ChatAttachAlert(context2, notificationsSoundActivity, false, false, true, this.resourcesProvider);
            notificationsSoundActivity.chatAttachAlert = chatAttachAlert;
            chatAttachAlert.isSoundPicker = true;
            chatAttachAlert.buttonsRecyclerViewWrapper.setVisibility(8);
            chatAttachAlert.selectedTextView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            notificationsSoundActivity.chatAttachAlert.init();
            notificationsSoundActivity.chatAttachAlert.show();
        } else {
            notificationsSoundActivity = this;
            context2 = context;
        }
        if (view instanceof ToneCell) {
            ToneCell toneCell = (ToneCell) view;
            if (notificationsSoundActivity.actionBar.isActionModeShowed() || toneCell.tone == null) {
                Tone tone = toneCell.tone;
                SparseArray sparseArray = notificationsSoundActivity.selectedTones;
                if (sparseArray.get(tone.stableId) != null) {
                    sparseArray.remove(tone.stableId);
                } else if (!tone.fromServer) {
                    return;
                } else {
                    sparseArray.put(tone.stableId, tone);
                }
                if (sparseArray.size() > 0) {
                    notificationsSoundActivity.selectedTonesCountTextView.setNumber(sparseArray.size(), notificationsSoundActivity.actionBar.isActionModeShowed());
                    notificationsSoundActivity.actionBar.showActionMode(null, null);
                } else {
                    notificationsSoundActivity.actionBar.hideActionMode$1();
                }
                Adapter adapter = notificationsSoundActivity.adapter;
                adapter.mObservable.notifyItemRangeChanged(0, NotificationsSoundActivity.this.rowCount, null);
                return;
            }
            Ringtone ringtone = notificationsSoundActivity.lastPlayedRingtone;
            if (ringtone != null) {
                ringtone.stop();
            }
            try {
                Tone tone2 = toneCell.tone;
                if (tone2.isSystemDefault) {
                    Ringtone ringtone2 = RingtoneManager.getRingtone(context2.getApplicationContext(), RingtoneManager.getDefaultUri(2));
                    ringtone2.setStreamType(4);
                    notificationsSoundActivity.lastPlayedRingtone = ringtone2;
                    ringtone2.play();
                } else {
                    String str = tone2.uri;
                    if (str != null && !tone2.fromServer) {
                        Ringtone ringtone3 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(toneCell.tone.uri));
                        ringtone3.setStreamType(4);
                        notificationsSoundActivity.lastPlayedRingtone = ringtone3;
                        ringtone3.play();
                    } else if (tone2.fromServer) {
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
            Adapter adapter2 = notificationsSoundActivity.adapter;
            adapter2.mObservable.notifyItemRangeChanged(0, NotificationsSoundActivity.this.rowCount, null);
        }
    }

    public final void lambda$createView$2$1(View view) {
        if (view instanceof ToneCell) {
            ToneCell toneCell = (ToneCell) view;
            Tone tone = toneCell.tone;
            SparseArray sparseArray = this.selectedTones;
            if (sparseArray.get(tone.stableId) == null) {
                if (tone.fromServer) {
                    sparseArray.put(tone.stableId, tone);
                }
                toneCell.performHapticFeedback(0);
            }
            sparseArray.remove(tone.stableId);
            if (sparseArray.size() > 0) {
                this.selectedTonesCountTextView.setNumber(sparseArray.size(), this.actionBar.isActionModeShowed());
                this.actionBar.showActionMode(null, null);
            } else {
                this.actionBar.hideActionMode$1();
            }
            Adapter adapter = this.adapter;
            adapter.mObservable.notifyItemRangeChanged(0, NotificationsSoundActivity.this.rowCount, null);
            toneCell.performHapticFeedback(0);
        }
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
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
                if (this.chatAttachAlert.documentLayout.isRingtone(new File(path))) {
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
                if (this.chatAttachAlert.documentLayout.isRingtone(new File(string))) {
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
    public final boolean onFragmentCreate() {
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
            strM2 = zzil.m("sound_document_id_", sharedPrefKey);
            strM = zzil.m("sound_path_", sharedPrefKey);
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
        Tone tone = new Tone();
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
    public final void onFragmentDestroy() {
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
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setClipToPadding(false);
        this.listView.setPadding(0, 0, 0, i4);
    }

    @Override
    public final void onPause() {
        super.onPause();
        getNotificationCenter().removeObserver(this, NotificationCenter.onUserRingtonesUpdated);
    }

    @Override
    public final void onResume() {
        super.onResume();
        getNotificationCenter().addObserver(this, NotificationCenter.onUserRingtonesUpdated);
    }

    @Override
    public final void startDocumentSelectActivity() {
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
    }

    public final void updateRows$10() {
        this.serverTonesStartRow = -1;
        this.serverTonesEndRow = -1;
        this.uploadRow = -1;
        this.dividerRow = -1;
        this.systemTonesHeaderRow = -1;
        this.systemTonesStartRow = -1;
        this.systemTonesEndRow = -1;
        this.rowCount = 1;
        ArrayList arrayList = this.serverTones;
        if (!arrayList.isEmpty()) {
            int i = this.rowCount;
            this.serverTonesStartRow = i;
            int size = arrayList.size() + i;
            this.rowCount = size;
            this.serverTonesEndRow = size;
        }
        int i2 = this.rowCount;
        this.uploadRow = i2;
        this.rowCount = i2 + 2;
        this.dividerRow = i2 + 1;
        ArrayList arrayList2 = this.systemTones;
        if (!arrayList2.isEmpty()) {
            int i3 = this.rowCount;
            int i4 = i3 + 1;
            this.rowCount = i4;
            this.systemTonesHeaderRow = i3;
            this.systemTonesStartRow = i4;
            int size2 = arrayList2.size() + i4;
            this.rowCount = size2;
            this.systemTonesEndRow = size2;
        }
        int i5 = this.rowCount;
        this.rowCount = i5 + 1;
        this.dividerRow2 = i5;
    }
}
