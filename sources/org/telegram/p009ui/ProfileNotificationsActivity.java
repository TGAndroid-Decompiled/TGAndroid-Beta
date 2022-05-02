package org.telegram.p009ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1006ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Cells.HeaderCell;
import org.telegram.p009ui.Cells.RadioCell;
import org.telegram.p009ui.Cells.ShadowSectionCell;
import org.telegram.p009ui.Cells.TextCheckBoxCell;
import org.telegram.p009ui.Cells.TextCheckCell;
import org.telegram.p009ui.Cells.TextColorCell;
import org.telegram.p009ui.Cells.TextInfoPrivacyCell;
import org.telegram.p009ui.Cells.TextSettingsCell;
import org.telegram.p009ui.Cells.UserCell2;
import org.telegram.p009ui.Components.AlertsCreator;
import org.telegram.p009ui.Components.ChatAvatarContainer;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.NotificationsSettingsActivity;
import org.telegram.p009ui.ProfileNotificationsActivity;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_peerNotifySettings;
import org.telegram.tgnet.TLRPC$User;

public class ProfileNotificationsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private ListAdapter adapter;
    private boolean addingException;
    private AnimatorSet animatorSet;
    ChatAvatarContainer avatarContainer;
    private int avatarRow;
    private int avatarSectionRow;
    private int callsRow;
    private int callsVibrateRow;
    private int colorRow;
    private boolean customEnabled;
    private int customInfoRow;
    private int customRow;
    private ProfileNotificationsActivityDelegate delegate;
    private long dialogId;
    private int enableRow;
    private int generalRow;
    private int ledInfoRow;
    private int ledRow;
    private RecyclerListView listView;
    private boolean notificationsEnabled;
    private int popupDisabledRow;
    private int popupEnabledRow;
    private int popupInfoRow;
    private int popupRow;
    private int previewRow;
    private int priorityInfoRow;
    private int priorityRow;
    private int ringtoneInfoRow;
    private int ringtoneRow;
    private int rowCount;
    private int smartRow;
    private int soundRow;
    private int vibrateRow;

    public interface ProfileNotificationsActivityDelegate {
        void didCreateNewException(NotificationsSettingsActivity.NotificationException notificationException);
    }

    public ProfileNotificationsActivity(Bundle bundle) {
        super(bundle);
        this.dialogId = bundle.getLong("dialog_id");
        this.addingException = bundle.getBoolean("exception", false);
    }

    @Override
    public boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ProfileNotificationsActivity.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(C0952R.C0953drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new C1006ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    if (!ProfileNotificationsActivity.this.addingException && ProfileNotificationsActivity.this.notificationsEnabled && ProfileNotificationsActivity.this.customEnabled) {
                        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).edit();
                        edit.putInt("notify2_" + ProfileNotificationsActivity.this.dialogId, 0).commit();
                    }
                } else if (i == 1) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount);
                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                    edit2.putBoolean("custom_" + ProfileNotificationsActivity.this.dialogId, true);
                    TLRPC$Dialog tLRPC$Dialog = MessagesController.getInstance(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).dialogs_dict.get(ProfileNotificationsActivity.this.dialogId);
                    if (ProfileNotificationsActivity.this.notificationsEnabled) {
                        edit2.putInt("notify2_" + ProfileNotificationsActivity.this.dialogId, 0);
                        MessagesStorage.getInstance(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).setDialogFlags(ProfileNotificationsActivity.this.dialogId, 0L);
                        if (tLRPC$Dialog != null) {
                            tLRPC$Dialog.notify_settings = new TLRPC$TL_peerNotifySettings();
                        }
                    } else {
                        edit2.putInt("notify2_" + ProfileNotificationsActivity.this.dialogId, 2);
                        NotificationsController.getInstance(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).removeNotificationsForDialog(ProfileNotificationsActivity.this.dialogId);
                        MessagesStorage.getInstance(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).setDialogFlags(ProfileNotificationsActivity.this.dialogId, 1L);
                        if (tLRPC$Dialog != null) {
                            TLRPC$TL_peerNotifySettings tLRPC$TL_peerNotifySettings = new TLRPC$TL_peerNotifySettings();
                            tLRPC$Dialog.notify_settings = tLRPC$TL_peerNotifySettings;
                            tLRPC$TL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                    }
                    edit2.commit();
                    NotificationsController.getInstance(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).updateServerNotificationsSettings(ProfileNotificationsActivity.this.dialogId);
                    if (ProfileNotificationsActivity.this.delegate != null) {
                        NotificationsSettingsActivity.NotificationException notificationException = new NotificationsSettingsActivity.NotificationException();
                        notificationException.did = ProfileNotificationsActivity.this.dialogId;
                        notificationException.hasCustom = true;
                        int i2 = notificationsSettings.getInt("notify2_" + ProfileNotificationsActivity.this.dialogId, 0);
                        notificationException.notify = i2;
                        if (i2 != 0) {
                            notificationException.muteUntil = notificationsSettings.getInt("notifyuntil_" + ProfileNotificationsActivity.this.dialogId, 0);
                        }
                        ProfileNotificationsActivity.this.delegate.didCreateNewException(notificationException);
                    }
                }
                ProfileNotificationsActivity.this.finishFragment();
            }
        });
        ChatAvatarContainer chatAvatarContainer = new ChatAvatarContainer(context, null, false);
        this.avatarContainer = chatAvatarContainer;
        chatAvatarContainer.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.avatarContainer, 0, LayoutHelper.createFrame(-2, -1.0f, 51, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
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
        if (this.addingException) {
            this.avatarContainer.setSubtitle(LocaleController.getString("NotificationsNewException", C0952R.string.NotificationsNewException));
            this.actionBar.createMenu().addItem(1, LocaleController.getString("Done", C0952R.string.Done).toUpperCase());
        } else {
            this.avatarContainer.setSubtitle(LocaleController.getString("CustomNotifications", C0952R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        frameLayout2.addView(recyclerListView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView2 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.adapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        this.listView.setItemAnimator(null);
        this.listView.setLayoutAnimation(null);
        this.listView.setLayoutManager(new LinearLayoutManager(this, context) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        });
        this.listView.setOnItemClickListener(new C34573());
        return this.fragmentView;
    }

    public class C34573 implements RecyclerListView.OnItemClickListener {
        C34573() {
        }

        @Override
        public void onItemClick(View view, int i) {
            TextCheckCell textCheckCell;
            if (i == ProfileNotificationsActivity.this.customRow && (view instanceof TextCheckCell)) {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount);
                ProfileNotificationsActivity profileNotificationsActivity = ProfileNotificationsActivity.this;
                profileNotificationsActivity.customEnabled = true ^ profileNotificationsActivity.customEnabled;
                ProfileNotificationsActivity profileNotificationsActivity2 = ProfileNotificationsActivity.this;
                profileNotificationsActivity2.notificationsEnabled = profileNotificationsActivity2.customEnabled;
                notificationsSettings.edit().putBoolean("custom_" + ProfileNotificationsActivity.this.dialogId, ProfileNotificationsActivity.this.customEnabled).apply();
                TextCheckCell textCheckCell2 = (TextCheckCell) view;
                textCheckCell2.setChecked(ProfileNotificationsActivity.this.customEnabled);
                int color = Theme.getColor(ProfileNotificationsActivity.this.customEnabled ? "windowBackgroundChecked" : "windowBackgroundUnchecked");
                if (ProfileNotificationsActivity.this.customEnabled) {
                    textCheckCell2.setBackgroundColorAnimated(ProfileNotificationsActivity.this.customEnabled, color);
                } else {
                    textCheckCell2.setBackgroundColorAnimatedReverse(color);
                }
                ProfileNotificationsActivity.this.checkRowsEnabled();
            } else if (ProfileNotificationsActivity.this.customEnabled && view.isEnabled()) {
                if (i == ProfileNotificationsActivity.this.soundRow) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", ProfileNotificationsActivity.this.dialogId);
                    ProfileNotificationsActivity.this.presentFragment(new NotificationsSoundActivity(bundle));
                } else if (i == ProfileNotificationsActivity.this.ringtoneRow) {
                    try {
                        Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                        intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                        intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                        intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                        intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                        SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount);
                        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                        String path = uri != null ? uri.getPath() : null;
                        String string = notificationsSettings2.getString("ringtone_path_" + ProfileNotificationsActivity.this.dialogId, path);
                        if (string == null || string.equals("NoSound")) {
                            uri = null;
                        } else if (!string.equals(path)) {
                            uri = Uri.parse(string);
                        }
                        intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", uri);
                        ProfileNotificationsActivity.this.startActivityForResult(intent, 13);
                    } catch (Exception e) {
                        FileLog.m30e(e);
                    }
                } else if (i == ProfileNotificationsActivity.this.vibrateRow) {
                    ProfileNotificationsActivity profileNotificationsActivity3 = ProfileNotificationsActivity.this;
                    profileNotificationsActivity3.showDialog(AlertsCreator.createVibrationSelectDialog(profileNotificationsActivity3.getParentActivity(), ProfileNotificationsActivity.this.dialogId, false, false, new Runnable() {
                        @Override
                        public final void run() {
                            ProfileNotificationsActivity.C34573.this.lambda$onItemClick$0();
                        }
                    }));
                } else if (i == ProfileNotificationsActivity.this.enableRow) {
                    ProfileNotificationsActivity.this.notificationsEnabled = !textCheckCell.isChecked();
                    ((TextCheckCell) view).setChecked(ProfileNotificationsActivity.this.notificationsEnabled);
                    ProfileNotificationsActivity.this.checkRowsEnabled();
                } else if (i == ProfileNotificationsActivity.this.previewRow) {
                    TextCheckCell textCheckCell3 = (TextCheckCell) view;
                    MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).edit().putBoolean("content_preview_" + ProfileNotificationsActivity.this.dialogId, !textCheckCell3.isChecked()).commit();
                    textCheckCell3.setChecked(textCheckCell3.isChecked() ^ true);
                } else if (i == ProfileNotificationsActivity.this.callsVibrateRow) {
                    ProfileNotificationsActivity profileNotificationsActivity4 = ProfileNotificationsActivity.this;
                    profileNotificationsActivity4.showDialog(AlertsCreator.createVibrationSelectDialog(profileNotificationsActivity4.getParentActivity(), ProfileNotificationsActivity.this.dialogId, "calls_vibrate_" + ProfileNotificationsActivity.this.dialogId, new Runnable() {
                        @Override
                        public final void run() {
                            ProfileNotificationsActivity.C34573.this.lambda$onItemClick$1();
                        }
                    }));
                } else if (i == ProfileNotificationsActivity.this.priorityRow) {
                    ProfileNotificationsActivity profileNotificationsActivity5 = ProfileNotificationsActivity.this;
                    profileNotificationsActivity5.showDialog(AlertsCreator.createPrioritySelectDialog(profileNotificationsActivity5.getParentActivity(), ProfileNotificationsActivity.this.dialogId, -1, new Runnable() {
                        @Override
                        public final void run() {
                            ProfileNotificationsActivity.C34573.this.lambda$onItemClick$2();
                        }
                    }));
                } else {
                    int i2 = 2;
                    if (i == ProfileNotificationsActivity.this.smartRow) {
                        if (ProfileNotificationsActivity.this.getParentActivity() != null) {
                            ProfileNotificationsActivity.this.getParentActivity();
                            SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount);
                            int i3 = notificationsSettings3.getInt("smart_max_count_" + ProfileNotificationsActivity.this.dialogId, 2);
                            int i4 = notificationsSettings3.getInt("smart_delay_" + ProfileNotificationsActivity.this.dialogId, 180);
                            if (i3 != 0) {
                                i2 = i3;
                            }
                            AlertsCreator.createSoundFrequencyPickerDialog(ProfileNotificationsActivity.this.getParentActivity(), i2, i4, new AlertsCreator.SoundFrequencyDelegate() {
                                @Override
                                public final void didSelectValues(int i5, int i6) {
                                    ProfileNotificationsActivity.C34573.this.lambda$onItemClick$3(i5, i6);
                                }
                            });
                        }
                    } else if (i == ProfileNotificationsActivity.this.colorRow) {
                        if (ProfileNotificationsActivity.this.getParentActivity() != null) {
                            ProfileNotificationsActivity profileNotificationsActivity6 = ProfileNotificationsActivity.this;
                            profileNotificationsActivity6.showDialog(AlertsCreator.createColorSelectDialog(profileNotificationsActivity6.getParentActivity(), ProfileNotificationsActivity.this.dialogId, -1, new Runnable() {
                                @Override
                                public final void run() {
                                    ProfileNotificationsActivity.C34573.this.lambda$onItemClick$4();
                                }
                            }));
                        }
                    } else if (i == ProfileNotificationsActivity.this.popupEnabledRow) {
                        MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).edit().putInt("popup_" + ProfileNotificationsActivity.this.dialogId, 1).commit();
                        ((RadioCell) view).setChecked(true, true);
                        View findViewWithTag = ProfileNotificationsActivity.this.listView.findViewWithTag(2);
                        if (findViewWithTag != null) {
                            ((RadioCell) findViewWithTag).setChecked(false, true);
                        }
                    } else if (i == ProfileNotificationsActivity.this.popupDisabledRow) {
                        MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).edit().putInt("popup_" + ProfileNotificationsActivity.this.dialogId, 2).commit();
                        ((RadioCell) view).setChecked(true, true);
                        View findViewWithTag2 = ProfileNotificationsActivity.this.listView.findViewWithTag(1);
                        if (findViewWithTag2 != null) {
                            ((RadioCell) findViewWithTag2).setChecked(false, true);
                        }
                    }
                }
            }
        }

        public void lambda$onItemClick$0() {
            if (ProfileNotificationsActivity.this.adapter != null) {
                ProfileNotificationsActivity.this.adapter.notifyItemChanged(ProfileNotificationsActivity.this.vibrateRow);
            }
        }

        public void lambda$onItemClick$1() {
            if (ProfileNotificationsActivity.this.adapter != null) {
                ProfileNotificationsActivity.this.adapter.notifyItemChanged(ProfileNotificationsActivity.this.callsVibrateRow);
            }
        }

        public void lambda$onItemClick$2() {
            if (ProfileNotificationsActivity.this.adapter != null) {
                ProfileNotificationsActivity.this.adapter.notifyItemChanged(ProfileNotificationsActivity.this.priorityRow);
            }
        }

        public void lambda$onItemClick$3(int i, int i2) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).edit();
            SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + ProfileNotificationsActivity.this.dialogId, i);
            putInt.putInt("smart_delay_" + ProfileNotificationsActivity.this.dialogId, i2).apply();
            if (ProfileNotificationsActivity.this.adapter != null) {
                ProfileNotificationsActivity.this.adapter.notifyItemChanged(ProfileNotificationsActivity.this.smartRow);
            }
        }

        public void lambda$onItemClick$4() {
            if (ProfileNotificationsActivity.this.adapter != null) {
                ProfileNotificationsActivity.this.adapter.notifyItemChanged(ProfileNotificationsActivity.this.colorRow);
            }
        }
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        Ringtone ringtone;
        if (i2 == -1 && intent != null) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            String str = null;
            if (!(uri == null || (ringtone = RingtoneManager.getRingtone(ApplicationLoader.applicationContext, uri)) == null)) {
                if (i == 13) {
                    if (uri.equals(Settings.System.DEFAULT_RINGTONE_URI)) {
                        str = LocaleController.getString("DefaultRingtone", C0952R.string.DefaultRingtone);
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = LocaleController.getString("SoundDefault", C0952R.string.SoundDefault);
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            }
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            if (i == 12) {
                if (str != null) {
                    edit.putString("sound_" + this.dialogId, str);
                    edit.putString("sound_path_" + this.dialogId, uri.toString());
                } else {
                    edit.putString("sound_" + this.dialogId, "NoSound");
                    edit.putString("sound_path_" + this.dialogId, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.dialogId);
            } else if (i == 13) {
                if (str != null) {
                    edit.putString("ringtone_" + this.dialogId, str);
                    edit.putString("ringtone_path_" + this.dialogId, uri.toString());
                } else {
                    edit.putString("ringtone_" + this.dialogId, "NoSound");
                    edit.putString("ringtone_path_" + this.dialogId, "NoSound");
                }
            }
            edit.commit();
            ListAdapter listAdapter = this.adapter;
            if (listAdapter != null) {
                listAdapter.notifyItemChanged(i == 13 ? this.ringtoneRow : this.soundRow);
            }
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.adapter.notifyDataSetChanged();
            } catch (Exception unused) {
            }
        }
    }

    public void setDelegate(ProfileNotificationsActivityDelegate profileNotificationsActivityDelegate) {
        this.delegate = profileNotificationsActivityDelegate;
    }

    public void checkRowsEnabled() {
        int childCount = this.listView.getChildCount();
        ArrayList<Animator> arrayList = new ArrayList<>();
        for (int i = 0; i < childCount; i++) {
            RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.getChildViewHolder(this.listView.getChildAt(i));
            int itemViewType = holder.getItemViewType();
            int adapterPosition = holder.getAdapterPosition();
            if (!(adapterPosition == this.customRow || adapterPosition == this.enableRow)) {
                boolean z = true;
                if (itemViewType == 0) {
                    HeaderCell headerCell = (HeaderCell) holder.itemView;
                    if (!this.customEnabled || !this.notificationsEnabled) {
                        z = false;
                    }
                    headerCell.setEnabled(z, arrayList);
                } else if (itemViewType == 1) {
                    TextSettingsCell textSettingsCell = (TextSettingsCell) holder.itemView;
                    if (!this.customEnabled || !this.notificationsEnabled) {
                        z = false;
                    }
                    textSettingsCell.setEnabled(z, arrayList);
                } else if (itemViewType == 2) {
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) holder.itemView;
                    if (!this.customEnabled || !this.notificationsEnabled) {
                        z = false;
                    }
                    textInfoPrivacyCell.setEnabled(z, arrayList);
                } else if (itemViewType == 3) {
                    TextColorCell textColorCell = (TextColorCell) holder.itemView;
                    if (!this.customEnabled || !this.notificationsEnabled) {
                        z = false;
                    }
                    textColorCell.setEnabled(z, arrayList);
                } else if (itemViewType == 4) {
                    RadioCell radioCell = (RadioCell) holder.itemView;
                    if (!this.customEnabled || !this.notificationsEnabled) {
                        z = false;
                    }
                    radioCell.setEnabled(z, arrayList);
                } else if (itemViewType == 8 && adapterPosition == this.previewRow) {
                    TextCheckCell textCheckCell = (TextCheckCell) holder.itemView;
                    if (!this.customEnabled || !this.notificationsEnabled) {
                        z = false;
                    }
                    textCheckCell.setEnabled(z, arrayList);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            AnimatorSet animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animatorSet = animatorSet2;
            animatorSet2.playTogether(arrayList);
            this.animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (animator.equals(ProfileNotificationsActivity.this.animatorSet)) {
                        ProfileNotificationsActivity.this.animatorSet = null;
                    }
                }
            });
            this.animatorSet.setDuration(150L);
            this.animatorSet.start();
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;

        public ListAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getItemCount() {
            return ProfileNotificationsActivity.this.rowCount;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            switch (viewHolder.getItemViewType()) {
                case 0:
                case 2:
                case 6:
                case 7:
                    return false;
                case 1:
                case 3:
                case 4:
                    return ProfileNotificationsActivity.this.customEnabled && ProfileNotificationsActivity.this.notificationsEnabled;
                case 5:
                default:
                    return true;
                case 8:
                    TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                    if (viewHolder.getAdapterPosition() == ProfileNotificationsActivity.this.previewRow) {
                        return ProfileNotificationsActivity.this.customEnabled && ProfileNotificationsActivity.this.notificationsEnabled;
                    }
                    return true;
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ShadowSectionCell shadowSectionCell;
            View view;
            switch (i) {
                case 0:
                    view = new HeaderCell(this.context);
                    view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                    shadowSectionCell = view;
                    break;
                case 1:
                    view = new TextSettingsCell(this.context);
                    view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                    shadowSectionCell = view;
                    break;
                case 2:
                    shadowSectionCell = new TextInfoPrivacyCell(this.context);
                    break;
                case 3:
                    view = new TextColorCell(this.context);
                    view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                    shadowSectionCell = view;
                    break;
                case 4:
                    view = new RadioCell(this.context);
                    view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                    shadowSectionCell = view;
                    break;
                case 5:
                    TextCheckCell textCheckCell = new TextCheckCell(this.context);
                    textCheckCell.setHeight(56);
                    textCheckCell.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                    textCheckCell.setColors("windowBackgroundCheckText", "switchTrackBlue", "switchTrackBlueChecked", "switchTrackBlueThumb", "switchTrackBlueThumbChecked");
                    shadowSectionCell = textCheckCell;
                    break;
                case 6:
                    view = new UserCell2(this.context, 4, 0);
                    view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                    shadowSectionCell = view;
                    break;
                case 7:
                    shadowSectionCell = new ShadowSectionCell(this.context);
                    break;
                default:
                    view = new TextCheckCell(this.context);
                    view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                    shadowSectionCell = view;
                    break;
            }
            shadowSectionCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(shadowSectionCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            boolean z = false;
            boolean z2 = true;
            switch (viewHolder.getItemViewType()) {
                case 0:
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    if (i == ProfileNotificationsActivity.this.generalRow) {
                        headerCell.setText(LocaleController.getString("General", C0952R.string.General));
                        return;
                    } else if (i == ProfileNotificationsActivity.this.popupRow) {
                        headerCell.setText(LocaleController.getString("ProfilePopupNotification", C0952R.string.ProfilePopupNotification));
                        return;
                    } else if (i == ProfileNotificationsActivity.this.ledRow) {
                        headerCell.setText(LocaleController.getString("NotificationsLed", C0952R.string.NotificationsLed));
                        return;
                    } else if (i == ProfileNotificationsActivity.this.callsRow) {
                        headerCell.setText(LocaleController.getString("VoipNotificationSettings", C0952R.string.VoipNotificationSettings));
                        return;
                    } else {
                        return;
                    }
                case 1:
                    TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount);
                    if (i == ProfileNotificationsActivity.this.soundRow) {
                        String string = notificationsSettings.getString("sound_" + ProfileNotificationsActivity.this.dialogId, LocaleController.getString("SoundDefault", C0952R.string.SoundDefault));
                        long j = notificationsSettings.getLong("sound_document_id_" + ProfileNotificationsActivity.this.dialogId, 0L);
                        if (j != 0) {
                            TLRPC$Document document = ProfileNotificationsActivity.this.getMediaDataController().ringtoneDataStore.getDocument(j);
                            if (document == null) {
                                string = LocaleController.getString("CustomSound", C0952R.string.CustomSound);
                            } else {
                                string = NotificationsSoundActivity.trimTitle(document, document.file_name_fixed);
                            }
                        } else if (string.equals("NoSound")) {
                            string = LocaleController.getString("NoSound", C0952R.string.NoSound);
                        } else if (string.equals("Default")) {
                            string = LocaleController.getString("SoundDefault", C0952R.string.SoundDefault);
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("Sound", C0952R.string.Sound), string, true);
                        return;
                    } else if (i == ProfileNotificationsActivity.this.ringtoneRow) {
                        String string2 = notificationsSettings.getString("ringtone_" + ProfileNotificationsActivity.this.dialogId, LocaleController.getString("DefaultRingtone", C0952R.string.DefaultRingtone));
                        if (string2.equals("NoSound")) {
                            string2 = LocaleController.getString("NoSound", C0952R.string.NoSound);
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("VoipSettingsRingtone", C0952R.string.VoipSettingsRingtone), string2, false);
                        return;
                    } else if (i == ProfileNotificationsActivity.this.vibrateRow) {
                        int i3 = notificationsSettings.getInt("vibrate_" + ProfileNotificationsActivity.this.dialogId, 0);
                        if (i3 == 0 || i3 == 4) {
                            String string3 = LocaleController.getString("Vibrate", C0952R.string.Vibrate);
                            String string4 = LocaleController.getString("VibrationDefault", C0952R.string.VibrationDefault);
                            if (!(ProfileNotificationsActivity.this.smartRow == -1 && ProfileNotificationsActivity.this.priorityRow == -1)) {
                                z = true;
                            }
                            textSettingsCell.setTextAndValue(string3, string4, z);
                            return;
                        } else if (i3 == 1) {
                            String string5 = LocaleController.getString("Vibrate", C0952R.string.Vibrate);
                            String string6 = LocaleController.getString("Short", C0952R.string.Short);
                            if (!(ProfileNotificationsActivity.this.smartRow == -1 && ProfileNotificationsActivity.this.priorityRow == -1)) {
                                z = true;
                            }
                            textSettingsCell.setTextAndValue(string5, string6, z);
                            return;
                        } else if (i3 == 2) {
                            String string7 = LocaleController.getString("Vibrate", C0952R.string.Vibrate);
                            String string8 = LocaleController.getString("VibrationDisabled", C0952R.string.VibrationDisabled);
                            if (!(ProfileNotificationsActivity.this.smartRow == -1 && ProfileNotificationsActivity.this.priorityRow == -1)) {
                                z = true;
                            }
                            textSettingsCell.setTextAndValue(string7, string8, z);
                            return;
                        } else if (i3 == 3) {
                            String string9 = LocaleController.getString("Vibrate", C0952R.string.Vibrate);
                            String string10 = LocaleController.getString("Long", C0952R.string.Long);
                            if (!(ProfileNotificationsActivity.this.smartRow == -1 && ProfileNotificationsActivity.this.priorityRow == -1)) {
                                z = true;
                            }
                            textSettingsCell.setTextAndValue(string9, string10, z);
                            return;
                        } else {
                            return;
                        }
                    } else if (i == ProfileNotificationsActivity.this.priorityRow) {
                        int i4 = notificationsSettings.getInt("priority_" + ProfileNotificationsActivity.this.dialogId, 3);
                        if (i4 == 0) {
                            textSettingsCell.setTextAndValue(LocaleController.getString("NotificationsImportance", C0952R.string.NotificationsImportance), LocaleController.getString("NotificationsPriorityHigh", C0952R.string.NotificationsPriorityHigh), false);
                            return;
                        } else if (i4 == 1 || i4 == 2) {
                            textSettingsCell.setTextAndValue(LocaleController.getString("NotificationsImportance", C0952R.string.NotificationsImportance), LocaleController.getString("NotificationsPriorityUrgent", C0952R.string.NotificationsPriorityUrgent), false);
                            return;
                        } else if (i4 == 3) {
                            textSettingsCell.setTextAndValue(LocaleController.getString("NotificationsImportance", C0952R.string.NotificationsImportance), LocaleController.getString("NotificationsPrioritySettings", C0952R.string.NotificationsPrioritySettings), false);
                            return;
                        } else if (i4 == 4) {
                            textSettingsCell.setTextAndValue(LocaleController.getString("NotificationsImportance", C0952R.string.NotificationsImportance), LocaleController.getString("NotificationsPriorityLow", C0952R.string.NotificationsPriorityLow), false);
                            return;
                        } else if (i4 == 5) {
                            textSettingsCell.setTextAndValue(LocaleController.getString("NotificationsImportance", C0952R.string.NotificationsImportance), LocaleController.getString("NotificationsPriorityMedium", C0952R.string.NotificationsPriorityMedium), false);
                            return;
                        } else {
                            return;
                        }
                    } else if (i == ProfileNotificationsActivity.this.smartRow) {
                        int i5 = notificationsSettings.getInt("smart_max_count_" + ProfileNotificationsActivity.this.dialogId, 2);
                        int i6 = notificationsSettings.getInt("smart_delay_" + ProfileNotificationsActivity.this.dialogId, 180);
                        if (i5 == 0) {
                            String string11 = LocaleController.getString("SmartNotifications", C0952R.string.SmartNotifications);
                            String string12 = LocaleController.getString("SmartNotificationsDisabled", C0952R.string.SmartNotificationsDisabled);
                            if (ProfileNotificationsActivity.this.priorityRow != -1) {
                                z = true;
                            }
                            textSettingsCell.setTextAndValue(string11, string12, z);
                            return;
                        }
                        String formatPluralString = LocaleController.formatPluralString("Minutes", i6 / 60);
                        String string13 = LocaleController.getString("SmartNotifications", C0952R.string.SmartNotifications);
                        String formatString = LocaleController.formatString("SmartNotificationsInfo", C0952R.string.SmartNotificationsInfo, Integer.valueOf(i5), formatPluralString);
                        if (ProfileNotificationsActivity.this.priorityRow != -1) {
                            z = true;
                        }
                        textSettingsCell.setTextAndValue(string13, formatString, z);
                        return;
                    } else if (i == ProfileNotificationsActivity.this.callsVibrateRow) {
                        int i7 = notificationsSettings.getInt("calls_vibrate_" + ProfileNotificationsActivity.this.dialogId, 0);
                        if (i7 == 0 || i7 == 4) {
                            textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", C0952R.string.Vibrate), LocaleController.getString("VibrationDefault", C0952R.string.VibrationDefault), true);
                            return;
                        } else if (i7 == 1) {
                            textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", C0952R.string.Vibrate), LocaleController.getString("Short", C0952R.string.Short), true);
                            return;
                        } else if (i7 == 2) {
                            textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", C0952R.string.Vibrate), LocaleController.getString("VibrationDisabled", C0952R.string.VibrationDisabled), true);
                            return;
                        } else if (i7 == 3) {
                            textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", C0952R.string.Vibrate), LocaleController.getString("Long", C0952R.string.Long), true);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 2:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    if (i == ProfileNotificationsActivity.this.popupInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString("ProfilePopupNotificationInfo", C0952R.string.ProfilePopupNotificationInfo));
                        textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.context, (int) C0952R.C0953drawable.greydivider, "windowBackgroundGrayShadow"));
                        return;
                    } else if (i == ProfileNotificationsActivity.this.ledInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString("NotificationsLedInfo", C0952R.string.NotificationsLedInfo));
                        textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.context, (int) C0952R.C0953drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
                        return;
                    } else if (i == ProfileNotificationsActivity.this.priorityInfoRow) {
                        if (ProfileNotificationsActivity.this.priorityRow == -1) {
                            textInfoPrivacyCell.setText("");
                        } else {
                            textInfoPrivacyCell.setText(LocaleController.getString("PriorityInfo", C0952R.string.PriorityInfo));
                        }
                        textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.context, (int) C0952R.C0953drawable.greydivider, "windowBackgroundGrayShadow"));
                        return;
                    } else if (i == ProfileNotificationsActivity.this.customInfoRow) {
                        textInfoPrivacyCell.setText(null);
                        textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.context, (int) C0952R.C0953drawable.greydivider, "windowBackgroundGrayShadow"));
                        return;
                    } else if (i == ProfileNotificationsActivity.this.ringtoneInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString("VoipRingtoneInfo", C0952R.string.VoipRingtoneInfo));
                        textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.context, (int) C0952R.C0953drawable.greydivider, "windowBackgroundGrayShadow"));
                        return;
                    } else {
                        return;
                    }
                case 3:
                    TextColorCell textColorCell = (TextColorCell) viewHolder.itemView;
                    SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount);
                    if (notificationsSettings2.contains("color_" + ProfileNotificationsActivity.this.dialogId)) {
                        i2 = notificationsSettings2.getInt("color_" + ProfileNotificationsActivity.this.dialogId, -16776961);
                    } else if (DialogObject.isChatDialog(ProfileNotificationsActivity.this.dialogId)) {
                        i2 = notificationsSettings2.getInt("GroupLed", -16776961);
                    } else {
                        i2 = notificationsSettings2.getInt("MessagesLed", -16776961);
                    }
                    int i8 = 0;
                    while (true) {
                        if (i8 < 9) {
                            if (TextColorCell.colorsToSave[i8] == i2) {
                                i2 = TextColorCell.colors[i8];
                            } else {
                                i8++;
                            }
                        }
                    }
                    textColorCell.setTextAndColor(LocaleController.getString("NotificationsLedColor", C0952R.string.NotificationsLedColor), i2, false);
                    return;
                case 4:
                    RadioCell radioCell = (RadioCell) viewHolder.itemView;
                    SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount);
                    int i9 = notificationsSettings3.getInt("popup_" + ProfileNotificationsActivity.this.dialogId, 0);
                    if (i9 == 0) {
                        i9 = notificationsSettings3.getInt(DialogObject.isChatDialog(ProfileNotificationsActivity.this.dialogId) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                    }
                    if (i == ProfileNotificationsActivity.this.popupEnabledRow) {
                        String string14 = LocaleController.getString("PopupEnabled", C0952R.string.PopupEnabled);
                        if (i9 == 1) {
                            z = true;
                        }
                        radioCell.setText(string14, z, true);
                        radioCell.setTag(1);
                        return;
                    } else if (i == ProfileNotificationsActivity.this.popupDisabledRow) {
                        String string15 = LocaleController.getString("PopupDisabled", C0952R.string.PopupDisabled);
                        if (i9 != 2) {
                            z2 = false;
                        }
                        radioCell.setText(string15, z2, false);
                        radioCell.setTag(2);
                        return;
                    } else {
                        return;
                    }
                case 5:
                    TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                    textCheckCell.setBackgroundColor(Theme.getColor((!ProfileNotificationsActivity.this.customEnabled || !ProfileNotificationsActivity.this.notificationsEnabled) ? "windowBackgroundUnchecked" : "windowBackgroundChecked"));
                    String string16 = LocaleController.getString("NotificationsEnableCustom", C0952R.string.NotificationsEnableCustom);
                    if (!ProfileNotificationsActivity.this.customEnabled || !ProfileNotificationsActivity.this.notificationsEnabled) {
                        z2 = false;
                    }
                    textCheckCell.setTextAndCheck(string16, z2, false);
                    return;
                case 6:
                    ((UserCell2) viewHolder.itemView).setData(DialogObject.isUserDialog(ProfileNotificationsActivity.this.dialogId) ? MessagesController.getInstance(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).getUser(Long.valueOf(ProfileNotificationsActivity.this.dialogId)) : MessagesController.getInstance(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).getChat(Long.valueOf(-ProfileNotificationsActivity.this.dialogId)), null, null, 0);
                    return;
                case 7:
                default:
                    return;
                case 8:
                    TextCheckCell textCheckCell2 = (TextCheckCell) viewHolder.itemView;
                    SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount);
                    if (i == ProfileNotificationsActivity.this.enableRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("Notifications", C0952R.string.Notifications), ProfileNotificationsActivity.this.notificationsEnabled, true);
                        return;
                    } else if (i == ProfileNotificationsActivity.this.previewRow) {
                        String string17 = LocaleController.getString("MessagePreview", C0952R.string.MessagePreview);
                        textCheckCell2.setTextAndCheck(string17, notificationsSettings4.getBoolean("content_preview_" + ProfileNotificationsActivity.this.dialogId, true), true);
                        return;
                    } else {
                        return;
                    }
            }
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            boolean z = false;
            if (itemViewType == 0) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (ProfileNotificationsActivity.this.customEnabled && ProfileNotificationsActivity.this.notificationsEnabled) {
                    z = true;
                }
                headerCell.setEnabled(z, null);
            } else if (itemViewType == 1) {
                TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                if (ProfileNotificationsActivity.this.customEnabled && ProfileNotificationsActivity.this.notificationsEnabled) {
                    z = true;
                }
                textSettingsCell.setEnabled(z, null);
            } else if (itemViewType == 2) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                if (ProfileNotificationsActivity.this.customEnabled && ProfileNotificationsActivity.this.notificationsEnabled) {
                    z = true;
                }
                textInfoPrivacyCell.setEnabled(z, null);
            } else if (itemViewType == 3) {
                TextColorCell textColorCell = (TextColorCell) viewHolder.itemView;
                if (ProfileNotificationsActivity.this.customEnabled && ProfileNotificationsActivity.this.notificationsEnabled) {
                    z = true;
                }
                textColorCell.setEnabled(z, null);
            } else if (itemViewType == 4) {
                RadioCell radioCell = (RadioCell) viewHolder.itemView;
                if (ProfileNotificationsActivity.this.customEnabled && ProfileNotificationsActivity.this.notificationsEnabled) {
                    z = true;
                }
                radioCell.setEnabled(z, null);
            } else if (itemViewType == 8) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                if (viewHolder.getAdapterPosition() == ProfileNotificationsActivity.this.previewRow) {
                    if (ProfileNotificationsActivity.this.customEnabled && ProfileNotificationsActivity.this.notificationsEnabled) {
                        z = true;
                    }
                    textCheckCell.setEnabled(z, null);
                    return;
                }
                textCheckCell.setEnabled(true, null);
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (i == ProfileNotificationsActivity.this.generalRow || i == ProfileNotificationsActivity.this.popupRow || i == ProfileNotificationsActivity.this.ledRow || i == ProfileNotificationsActivity.this.callsRow) {
                return 0;
            }
            if (i == ProfileNotificationsActivity.this.soundRow || i == ProfileNotificationsActivity.this.vibrateRow || i == ProfileNotificationsActivity.this.priorityRow || i == ProfileNotificationsActivity.this.smartRow || i == ProfileNotificationsActivity.this.ringtoneRow || i == ProfileNotificationsActivity.this.callsVibrateRow) {
                return 1;
            }
            if (i == ProfileNotificationsActivity.this.popupInfoRow || i == ProfileNotificationsActivity.this.ledInfoRow || i == ProfileNotificationsActivity.this.priorityInfoRow || i == ProfileNotificationsActivity.this.customInfoRow || i == ProfileNotificationsActivity.this.ringtoneInfoRow) {
                return 2;
            }
            if (i == ProfileNotificationsActivity.this.colorRow) {
                return 3;
            }
            if (i == ProfileNotificationsActivity.this.popupEnabledRow || i == ProfileNotificationsActivity.this.popupDisabledRow) {
                return 4;
            }
            if (i == ProfileNotificationsActivity.this.customRow) {
                return 5;
            }
            if (i == ProfileNotificationsActivity.this.avatarRow) {
                return 6;
            }
            if (i == ProfileNotificationsActivity.this.avatarSectionRow) {
                return 7;
            }
            return (i == ProfileNotificationsActivity.this.enableRow || i == ProfileNotificationsActivity.this.previewRow) ? 8 : 0;
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ThemeDescription.ThemeDescriptionDelegate profileNotificationsActivity$$ExternalSyntheticLambda0 = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ProfileNotificationsActivity.this.lambda$getThemeDescriptions$0();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{HeaderCell.class, TextSettingsCell.class, TextColorCell.class, RadioCell.class, UserCell2.class, TextCheckCell.class, TextCheckBoxCell.class}, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, "divider"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueHeader"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteValueText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText4"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextColorCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{RadioCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{RadioCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "radioBackground"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{RadioCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "radioBackgroundChecked"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switchTrack"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switchTrackChecked"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, new String[]{"statusColor"}, (Paint[]) null, (Drawable[]) null, profileNotificationsActivity$$ExternalSyntheticLambda0, "windowBackgroundWhiteGrayText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, new String[]{"statusOnlineColor"}, (Paint[]) null, (Drawable[]) null, profileNotificationsActivity$$ExternalSyntheticLambda0, "windowBackgroundWhiteBlueText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, null, Theme.avatarDrawables, null, "avatar_text"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, profileNotificationsActivity$$ExternalSyntheticLambda0, "avatar_backgroundRed"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, profileNotificationsActivity$$ExternalSyntheticLambda0, "avatar_backgroundOrange"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, profileNotificationsActivity$$ExternalSyntheticLambda0, "avatar_backgroundViolet"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, profileNotificationsActivity$$ExternalSyntheticLambda0, "avatar_backgroundGreen"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, profileNotificationsActivity$$ExternalSyntheticLambda0, "avatar_backgroundCyan"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, profileNotificationsActivity$$ExternalSyntheticLambda0, "avatar_backgroundBlue"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, profileNotificationsActivity$$ExternalSyntheticLambda0, "avatar_backgroundPink"));
        return arrayList;
    }

    public void lambda$getThemeDescriptions$0() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof UserCell2) {
                    ((UserCell2) childAt).update(0);
                }
            }
        }
    }
}
