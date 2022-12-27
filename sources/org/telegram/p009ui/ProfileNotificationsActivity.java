package org.telegram.p009ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1133ActionBar;
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
import org.telegram.p009ui.Components.Forum.ForumUtilities;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.NotificationsSettingsActivity;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
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
    private int customResetRow;
    private int customResetShadowRow;
    private ProfileNotificationsActivityDelegate delegate;
    private long dialogId;
    private int enableRow;
    private int generalRow;
    private int ledInfoRow;
    private int ledRow;
    private RecyclerListView listView;
    private boolean needReset;
    private boolean notificationsEnabled;
    private int popupDisabledRow;
    private int popupEnabledRow;
    private int popupInfoRow;
    private int popupRow;
    private int previewRow;
    private int priorityInfoRow;
    private int priorityRow;
    private Theme.ResourcesProvider resourcesProvider;
    private int ringtoneInfoRow;
    private int ringtoneRow;
    private int rowCount;
    private int smartRow;
    private int soundRow;
    private int topicId;
    private int vibrateRow;

    public interface ProfileNotificationsActivityDelegate {

        public final class CC {
            public static void $default$didRemoveException(ProfileNotificationsActivityDelegate profileNotificationsActivityDelegate, long j) {
            }
        }

        void didCreateNewException(NotificationsSettingsActivity.NotificationException notificationException);

        void didRemoveException(long j);
    }

    public ProfileNotificationsActivity(Bundle bundle) {
        this(bundle, null);
    }

    public ProfileNotificationsActivity(Bundle bundle, Theme.ResourcesProvider resourcesProvider) {
        super(bundle);
        this.resourcesProvider = resourcesProvider;
        this.dialogId = bundle.getLong("dialog_id");
        this.topicId = bundle.getInt("topic_id");
        this.addingException = bundle.getBoolean("exception", false);
    }

    @Override
    public boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ProfileNotificationsActivity.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.needReset) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.dialogId, this.topicId);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    @Override
    public View createView(final Context context) {
        this.actionBar.setItemsBackgroundColor(Theme.getColor("avatar_actionBarSelectorBlue", this.resourcesProvider), false);
        this.actionBar.setItemsColor(Theme.getColor("actionBarDefaultIcon", this.resourcesProvider), false);
        this.actionBar.setBackButtonImage(C1072R.C1073drawable.ic_ab_back);
        final String sharedPrefKey = NotificationsController.getSharedPrefKey(this.dialogId, this.topicId);
        this.actionBar.setActionBarMenuOnItemClick(new C1133ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    if (!ProfileNotificationsActivity.this.addingException && ProfileNotificationsActivity.this.notificationsEnabled) {
                        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).edit();
                        edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey, 0).apply();
                    }
                } else if (i == 1) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount);
                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                    edit2.putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + sharedPrefKey, true);
                    TLRPC$Dialog tLRPC$Dialog = MessagesController.getInstance(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).dialogs_dict.get(ProfileNotificationsActivity.this.dialogId);
                    if (ProfileNotificationsActivity.this.notificationsEnabled) {
                        edit2.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey, 0);
                        if (ProfileNotificationsActivity.this.topicId == 0) {
                            MessagesStorage.getInstance(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).setDialogFlags(ProfileNotificationsActivity.this.dialogId, 0L);
                            if (tLRPC$Dialog != null) {
                                tLRPC$Dialog.notify_settings = new TLRPC$TL_peerNotifySettings();
                            }
                        }
                    } else {
                        edit2.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey, 2);
                        if (ProfileNotificationsActivity.this.topicId == 0) {
                            NotificationsController.getInstance(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).removeNotificationsForDialog(ProfileNotificationsActivity.this.dialogId);
                            MessagesStorage.getInstance(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).setDialogFlags(ProfileNotificationsActivity.this.dialogId, 1L);
                            if (tLRPC$Dialog != null) {
                                TLRPC$TL_peerNotifySettings tLRPC$TL_peerNotifySettings = new TLRPC$TL_peerNotifySettings();
                                tLRPC$Dialog.notify_settings = tLRPC$TL_peerNotifySettings;
                                tLRPC$TL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            }
                        }
                    }
                    edit2.apply();
                    NotificationsController.getInstance(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).updateServerNotificationsSettings(ProfileNotificationsActivity.this.dialogId, ProfileNotificationsActivity.this.topicId);
                    if (ProfileNotificationsActivity.this.delegate != null) {
                        NotificationsSettingsActivity.NotificationException notificationException = new NotificationsSettingsActivity.NotificationException();
                        notificationException.did = ProfileNotificationsActivity.this.dialogId;
                        notificationException.hasCustom = true;
                        int i2 = notificationsSettings.getInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey, 0);
                        notificationException.notify = i2;
                        if (i2 != 0) {
                            notificationException.muteUntil = notificationsSettings.getInt(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + sharedPrefKey, 0);
                        }
                        ProfileNotificationsActivity.this.delegate.didCreateNewException(notificationException);
                    }
                }
                ProfileNotificationsActivity.this.finishFragment();
            }
        });
        ChatAvatarContainer chatAvatarContainer = new ChatAvatarContainer(context, null, false, this.resourcesProvider);
        this.avatarContainer = chatAvatarContainer;
        chatAvatarContainer.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.avatarContainer, 0, LayoutHelper.createFrame(-2, -1.0f, 51, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (this.dialogId < 0) {
            if (this.topicId != 0) {
                TLRPC$TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.dialogId, this.topicId);
                ForumUtilities.setTopicIcon(this.avatarContainer.getAvatarImageView(), findTopic, false, true, this.resourcesProvider);
                this.avatarContainer.setTitle(findTopic.title);
            } else {
                TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
                this.avatarContainer.setChatAvatar(chat);
                this.avatarContainer.setTitle(chat.title);
            }
        } else {
            TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.dialogId));
            if (user != null) {
                this.avatarContainer.setUserAvatar(user);
                this.avatarContainer.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.addingException) {
            this.avatarContainer.setSubtitle(LocaleController.getString("NotificationsNewException", C1072R.string.NotificationsNewException));
            this.actionBar.createMenu().addItem(1, LocaleController.getString("Done", C1072R.string.Done).toUpperCase());
        } else {
            this.avatarContainer.setSubtitle(LocaleController.getString("CustomNotifications", C1072R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(Theme.getColor("windowBackgroundGray", this.resourcesProvider));
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
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                ProfileNotificationsActivity.this.lambda$createView$6(context, sharedPrefKey, view, i);
            }
        });
        return this.fragmentView;
    }

    public void lambda$createView$6(Context context, final String str, View view, int i) {
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i == this.customResetRow) {
                AlertDialog create = new AlertDialog.Builder(context, this.resourcesProvider).setTitle(LocaleController.getString(C1072R.string.ResetCustomNotificationsAlertTitle)).setMessage(LocaleController.getString(C1072R.string.ResetCustomNotificationsAlert)).setPositiveButton(LocaleController.getString(C1072R.string.Reset), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        ProfileNotificationsActivity.this.lambda$createView$0(str, dialogInterface, i2);
                    }
                }).setNegativeButton(LocaleController.getString(C1072R.string.Cancel), null).create();
                showDialog(create);
                TextView textView = (TextView) create.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor("dialogTextRed2"));
                }
            } else if (i == this.soundRow) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.dialogId);
                bundle.putInt("topic_id", this.topicId);
                presentFragment(new NotificationsSoundActivity(bundle, this.resourcesProvider));
            } else if (i == this.ringtoneRow) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    String path = uri != null ? uri.getPath() : null;
                    String string = notificationsSettings.getString("ringtone_path_" + str, path);
                    if (string != null && !string.equals("NoSound")) {
                        parcelable = string.equals(path) ? uri : Uri.parse(string);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    startActivityForResult(intent, 13);
                } catch (Exception e) {
                    FileLog.m31e(e);
                }
            } else if (i == this.vibrateRow) {
                showDialog(AlertsCreator.createVibrationSelectDialog(getParentActivity(), this.dialogId, this.topicId, false, false, new Runnable() {
                    @Override
                    public final void run() {
                        ProfileNotificationsActivity.this.lambda$createView$1();
                    }
                }, this.resourcesProvider));
            } else if (i == this.enableRow) {
                TextCheckCell textCheckCell = (TextCheckCell) view;
                boolean z = !textCheckCell.isChecked();
                this.notificationsEnabled = z;
                textCheckCell.setChecked(z);
                checkRowsEnabled();
            } else if (i == this.previewRow) {
                TextCheckCell textCheckCell2 = (TextCheckCell) view;
                MessagesController.getNotificationsSettings(this.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW + str, !textCheckCell2.isChecked()).apply();
                textCheckCell2.setChecked(textCheckCell2.isChecked() ^ true);
            } else if (i == this.callsVibrateRow) {
                showDialog(AlertsCreator.createVibrationSelectDialog(getParentActivity(), this.dialogId, this.topicId, "calls_vibrate_" + str, new Runnable() {
                    @Override
                    public final void run() {
                        ProfileNotificationsActivity.this.lambda$createView$2();
                    }
                }, this.resourcesProvider));
            } else if (i == this.priorityRow) {
                showDialog(AlertsCreator.createPrioritySelectDialog(getParentActivity(), this.dialogId, this.topicId, -1, new Runnable() {
                    @Override
                    public final void run() {
                        ProfileNotificationsActivity.this.lambda$createView$3();
                    }
                }, this.resourcesProvider));
            } else {
                if (i == this.smartRow) {
                    if (getParentActivity() == null) {
                        return;
                    }
                    SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(this.currentAccount);
                    int i2 = notificationsSettings2.getInt("smart_max_count_" + str, 2);
                    AlertsCreator.createSoundFrequencyPickerDialog(getParentActivity(), i2 != 0 ? i2 : 2, notificationsSettings2.getInt("smart_delay_" + str, 180), new AlertsCreator.SoundFrequencyDelegate() {
                        @Override
                        public final void didSelectValues(int i3, int i4) {
                            ProfileNotificationsActivity.this.lambda$createView$4(str, i3, i4);
                        }
                    }, this.resourcesProvider);
                } else if (i == this.colorRow) {
                    if (getParentActivity() == null) {
                        return;
                    }
                    showDialog(AlertsCreator.createColorSelectDialog(getParentActivity(), this.dialogId, this.topicId, -1, new Runnable() {
                        @Override
                        public final void run() {
                            ProfileNotificationsActivity.this.lambda$createView$5();
                        }
                    }, this.resourcesProvider));
                } else if (i == this.popupEnabledRow) {
                    MessagesController.getNotificationsSettings(this.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((RadioCell) view).setChecked(true, true);
                    View findViewWithTag = this.listView.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((RadioCell) findViewWithTag).setChecked(false, true);
                    }
                } else if (i == this.popupDisabledRow) {
                    MessagesController.getNotificationsSettings(this.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((RadioCell) view).setChecked(true, true);
                    View findViewWithTag2 = this.listView.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((RadioCell) findViewWithTag2).setChecked(false, true);
                    }
                }
            }
        }
    }

    public void lambda$createView$0(String str, DialogInterface dialogInterface, int i) {
        this.needReset = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + str, false);
        putBoolean.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + str).apply();
        finishFragment();
        ProfileNotificationsActivityDelegate profileNotificationsActivityDelegate = this.delegate;
        if (profileNotificationsActivityDelegate != null) {
            profileNotificationsActivityDelegate.didRemoveException(this.dialogId);
        }
    }

    public void lambda$createView$1() {
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.notifyItemChanged(this.vibrateRow);
        }
    }

    public void lambda$createView$2() {
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.notifyItemChanged(this.callsVibrateRow);
        }
    }

    public void lambda$createView$3() {
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.notifyItemChanged(this.priorityRow);
        }
    }

    public void lambda$createView$4(String str, int i, int i2) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i);
        putInt.putInt("smart_delay_" + str, i2).apply();
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.notifyItemChanged(this.smartRow);
        }
    }

    public void lambda$createView$5() {
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.notifyItemChanged(this.colorRow);
        }
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        Ringtone ringtone;
        if (i2 != -1 || intent == null) {
            return;
        }
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
        String str = null;
        if (uri != null && (ringtone = RingtoneManager.getRingtone(ApplicationLoader.applicationContext, uri)) != null) {
            if (i == 13) {
                if (uri.equals(Settings.System.DEFAULT_RINGTONE_URI)) {
                    str = LocaleController.getString("DefaultRingtone", C1072R.string.DefaultRingtone);
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
            } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                str = LocaleController.getString("SoundDefault", C1072R.string.SoundDefault);
            } else {
                str = ringtone.getTitle(getParentActivity());
            }
            ringtone.stop();
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.dialogId, this.topicId);
        if (i == 12) {
            if (str != null) {
                edit.putString("sound_" + sharedPrefKey, str);
                edit.putString("sound_path_" + sharedPrefKey, uri.toString());
            } else {
                edit.putString("sound_" + sharedPrefKey, "NoSound");
                edit.putString("sound_path_" + sharedPrefKey, "NoSound");
            }
            getNotificationsController().deleteNotificationChannel(this.dialogId, this.topicId);
        } else if (i == 13) {
            if (str != null) {
                edit.putString("ringtone_" + sharedPrefKey, str);
                edit.putString("ringtone_path_" + sharedPrefKey, uri.toString());
            } else {
                edit.putString("ringtone_" + sharedPrefKey, "NoSound");
                edit.putString("ringtone_path_" + sharedPrefKey, "NoSound");
            }
        }
        edit.apply();
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.notifyItemChanged(i == 13 ? this.ringtoneRow : this.soundRow);
        }
    }

    @Override
    @SuppressLint({"NotifyDataSetChanged"})
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

    private void checkRowsEnabled() {
        int childCount = this.listView.getChildCount();
        ArrayList<Animator> arrayList = new ArrayList<>();
        for (int i = 0; i < childCount; i++) {
            RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.getChildViewHolder(this.listView.getChildAt(i));
            int itemViewType = holder.getItemViewType();
            int adapterPosition = holder.getAdapterPosition();
            if (adapterPosition != this.enableRow && adapterPosition != this.customResetRow) {
                if (itemViewType == 0) {
                    ((HeaderCell) holder.itemView).setEnabled(this.notificationsEnabled, arrayList);
                } else if (itemViewType == 1) {
                    ((TextSettingsCell) holder.itemView).setEnabled(this.notificationsEnabled, arrayList);
                } else if (itemViewType == 2) {
                    ((TextInfoPrivacyCell) holder.itemView).setEnabled(this.notificationsEnabled, arrayList);
                } else if (itemViewType == 3) {
                    ((TextColorCell) holder.itemView).setEnabled(this.notificationsEnabled, arrayList);
                } else if (itemViewType == 4) {
                    ((RadioCell) holder.itemView).setEnabled(this.notificationsEnabled, arrayList);
                } else if (itemViewType == 7 && adapterPosition == this.previewRow) {
                    ((TextCheckCell) holder.itemView).setEnabled(this.notificationsEnabled, arrayList);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
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

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;

        public ListAdapter(Context context) {
            ProfileNotificationsActivity.this = r1;
            this.context = context;
        }

        @Override
        public int getItemCount() {
            return ProfileNotificationsActivity.this.rowCount;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getAdapterPosition() == ProfileNotificationsActivity.this.previewRow) {
                return ProfileNotificationsActivity.this.notificationsEnabled;
            }
            if (viewHolder.getAdapterPosition() == ProfileNotificationsActivity.this.customResetRow) {
                return true;
            }
            switch (viewHolder.getItemViewType()) {
                case 0:
                case 2:
                case 5:
                case 6:
                    return false;
                case 1:
                case 3:
                case 4:
                    return ProfileNotificationsActivity.this.notificationsEnabled;
                default:
                    return true;
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View headerCell;
            View textInfoPrivacyCell;
            switch (i) {
                case 0:
                    headerCell = new HeaderCell(this.context, ProfileNotificationsActivity.this.resourcesProvider);
                    headerCell.setBackgroundColor(ProfileNotificationsActivity.this.getThemedColor("windowBackgroundWhite"));
                    textInfoPrivacyCell = headerCell;
                    break;
                case 1:
                    headerCell = new TextSettingsCell(this.context, ProfileNotificationsActivity.this.resourcesProvider);
                    headerCell.setBackgroundColor(ProfileNotificationsActivity.this.getThemedColor("windowBackgroundWhite"));
                    textInfoPrivacyCell = headerCell;
                    break;
                case 2:
                    textInfoPrivacyCell = new TextInfoPrivacyCell(this.context, ProfileNotificationsActivity.this.resourcesProvider);
                    break;
                case 3:
                    headerCell = new TextColorCell(this.context, ProfileNotificationsActivity.this.resourcesProvider);
                    headerCell.setBackgroundColor(ProfileNotificationsActivity.this.getThemedColor("windowBackgroundWhite"));
                    textInfoPrivacyCell = headerCell;
                    break;
                case 4:
                    headerCell = new RadioCell(this.context, ProfileNotificationsActivity.this.resourcesProvider);
                    headerCell.setBackgroundColor(ProfileNotificationsActivity.this.getThemedColor("windowBackgroundWhite"));
                    textInfoPrivacyCell = headerCell;
                    break;
                case 5:
                    headerCell = new UserCell2(this.context, 4, 0, ProfileNotificationsActivity.this.resourcesProvider);
                    headerCell.setBackgroundColor(ProfileNotificationsActivity.this.getThemedColor("windowBackgroundWhite"));
                    textInfoPrivacyCell = headerCell;
                    break;
                case 6:
                    textInfoPrivacyCell = new ShadowSectionCell(this.context, ProfileNotificationsActivity.this.resourcesProvider);
                    break;
                default:
                    headerCell = new TextCheckCell(this.context, ProfileNotificationsActivity.this.resourcesProvider);
                    headerCell.setBackgroundColor(ProfileNotificationsActivity.this.getThemedColor("windowBackgroundWhite"));
                    textInfoPrivacyCell = headerCell;
                    break;
            }
            textInfoPrivacyCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(textInfoPrivacyCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (i != ProfileNotificationsActivity.this.generalRow) {
                    if (i != ProfileNotificationsActivity.this.popupRow) {
                        if (i != ProfileNotificationsActivity.this.ledRow) {
                            if (i == ProfileNotificationsActivity.this.callsRow) {
                                headerCell.setText(LocaleController.getString("VoipNotificationSettings", C1072R.string.VoipNotificationSettings));
                                return;
                            }
                            return;
                        }
                        headerCell.setText(LocaleController.getString("NotificationsLed", C1072R.string.NotificationsLed));
                        return;
                    }
                    headerCell.setText(LocaleController.getString("ProfilePopupNotification", C1072R.string.ProfilePopupNotification));
                    return;
                }
                headerCell.setText(LocaleController.getString("General", C1072R.string.General));
                return;
            }
            if (itemViewType != 1) {
                if (itemViewType == 2) {
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    if (i != ProfileNotificationsActivity.this.popupInfoRow) {
                        if (i != ProfileNotificationsActivity.this.ledInfoRow) {
                            if (i == ProfileNotificationsActivity.this.priorityInfoRow) {
                                if (ProfileNotificationsActivity.this.priorityRow == -1) {
                                    textInfoPrivacyCell.setText("");
                                } else {
                                    textInfoPrivacyCell.setText(LocaleController.getString("PriorityInfo", C1072R.string.PriorityInfo));
                                }
                                textInfoPrivacyCell.setBackground(Theme.getThemedDrawable(this.context, C1072R.C1073drawable.greydivider, "windowBackgroundGrayShadow"));
                                return;
                            } else if (i == ProfileNotificationsActivity.this.ringtoneInfoRow) {
                                textInfoPrivacyCell.setText(LocaleController.getString("VoipRingtoneInfo", C1072R.string.VoipRingtoneInfo));
                                textInfoPrivacyCell.setBackground(Theme.getThemedDrawable(this.context, C1072R.C1073drawable.greydivider, "windowBackgroundGrayShadow"));
                                return;
                            } else {
                                return;
                            }
                        }
                        textInfoPrivacyCell.setText(LocaleController.getString("NotificationsLedInfo", C1072R.string.NotificationsLedInfo));
                        textInfoPrivacyCell.setBackground(Theme.getThemedDrawable(this.context, C1072R.C1073drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
                        return;
                    }
                    textInfoPrivacyCell.setText(LocaleController.getString("ProfilePopupNotificationInfo", C1072R.string.ProfilePopupNotificationInfo));
                    textInfoPrivacyCell.setBackground(Theme.getThemedDrawable(this.context, C1072R.C1073drawable.greydivider, "windowBackgroundGrayShadow"));
                    return;
                } else if (itemViewType == 3) {
                    TextColorCell textColorCell = (TextColorCell) viewHolder.itemView;
                    String sharedPrefKey = NotificationsController.getSharedPrefKey(ProfileNotificationsActivity.this.dialogId, ProfileNotificationsActivity.this.topicId);
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount);
                    if (!notificationsSettings.contains("color_" + sharedPrefKey)) {
                        if (DialogObject.isChatDialog(ProfileNotificationsActivity.this.dialogId)) {
                            i2 = notificationsSettings.getInt("GroupLed", -16776961);
                        } else {
                            i2 = notificationsSettings.getInt("MessagesLed", -16776961);
                        }
                    } else {
                        i2 = notificationsSettings.getInt("color_" + sharedPrefKey, -16776961);
                    }
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 9) {
                            break;
                        } else if (TextColorCell.colorsToSave[i3] == i2) {
                            i2 = TextColorCell.colors[i3];
                            break;
                        } else {
                            i3++;
                        }
                    }
                    textColorCell.setTextAndColor(LocaleController.getString("NotificationsLedColor", C1072R.string.NotificationsLedColor), i2, false);
                    return;
                } else if (itemViewType == 4) {
                    RadioCell radioCell = (RadioCell) viewHolder.itemView;
                    SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount);
                    int i4 = notificationsSettings2.getInt("popup_" + NotificationsController.getSharedPrefKey(ProfileNotificationsActivity.this.dialogId, ProfileNotificationsActivity.this.topicId), 0);
                    if (i4 == 0) {
                        i4 = notificationsSettings2.getInt(DialogObject.isChatDialog(ProfileNotificationsActivity.this.dialogId) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                    }
                    if (i != ProfileNotificationsActivity.this.popupEnabledRow) {
                        if (i == ProfileNotificationsActivity.this.popupDisabledRow) {
                            radioCell.setText(LocaleController.getString("PopupDisabled", C1072R.string.PopupDisabled), i4 == 2, false);
                            radioCell.setTag(2);
                            return;
                        }
                        return;
                    }
                    radioCell.setText(LocaleController.getString("PopupEnabled", C1072R.string.PopupEnabled), i4 == 1, true);
                    radioCell.setTag(1);
                    return;
                } else if (itemViewType == 5) {
                    ((UserCell2) viewHolder.itemView).setData(DialogObject.isUserDialog(ProfileNotificationsActivity.this.dialogId) ? MessagesController.getInstance(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).getUser(Long.valueOf(ProfileNotificationsActivity.this.dialogId)) : MessagesController.getInstance(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).getChat(Long.valueOf(-ProfileNotificationsActivity.this.dialogId)), null, null, 0);
                    return;
                } else if (itemViewType != 7) {
                    return;
                } else {
                    TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                    SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount);
                    if (i == ProfileNotificationsActivity.this.enableRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString("Notifications", C1072R.string.Notifications), ProfileNotificationsActivity.this.notificationsEnabled, true);
                        return;
                    } else if (i == ProfileNotificationsActivity.this.previewRow) {
                        String sharedPrefKey2 = NotificationsController.getSharedPrefKey(ProfileNotificationsActivity.this.dialogId, ProfileNotificationsActivity.this.topicId);
                        textCheckCell.setTextAndCheck(LocaleController.getString("MessagePreview", C1072R.string.MessagePreview), notificationsSettings3.getBoolean(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW + sharedPrefKey2, true), true);
                        return;
                    } else {
                        return;
                    }
                }
            }
            TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
            String sharedPrefKey3 = NotificationsController.getSharedPrefKey(ProfileNotificationsActivity.this.dialogId, ProfileNotificationsActivity.this.topicId);
            SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount);
            if (i == ProfileNotificationsActivity.this.customResetRow) {
                textSettingsCell.setText(LocaleController.getString(C1072R.string.ResetCustomNotifications), false);
                textSettingsCell.setTextColor(ProfileNotificationsActivity.this.getThemedColor("dialogTextRed"));
                return;
            }
            textSettingsCell.setTextColor(ProfileNotificationsActivity.this.getThemedColor("windowBackgroundWhiteBlackText"));
            if (i != ProfileNotificationsActivity.this.soundRow) {
                if (i != ProfileNotificationsActivity.this.ringtoneRow) {
                    if (i != ProfileNotificationsActivity.this.vibrateRow) {
                        if (i != ProfileNotificationsActivity.this.priorityRow) {
                            if (i != ProfileNotificationsActivity.this.smartRow) {
                                if (i == ProfileNotificationsActivity.this.callsVibrateRow) {
                                    int i5 = notificationsSettings4.getInt("calls_vibrate_" + sharedPrefKey3, 0);
                                    if (i5 == 0 || i5 == 4) {
                                        textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", C1072R.string.Vibrate), LocaleController.getString("VibrationDefault", C1072R.string.VibrationDefault), true);
                                        return;
                                    } else if (i5 == 1) {
                                        textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", C1072R.string.Vibrate), LocaleController.getString("Short", C1072R.string.Short), true);
                                        return;
                                    } else if (i5 == 2) {
                                        textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", C1072R.string.Vibrate), LocaleController.getString("VibrationDisabled", C1072R.string.VibrationDisabled), true);
                                        return;
                                    } else if (i5 == 3) {
                                        textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", C1072R.string.Vibrate), LocaleController.getString("Long", C1072R.string.Long), true);
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            }
                            int i6 = notificationsSettings4.getInt("smart_max_count_" + sharedPrefKey3, 2);
                            int i7 = notificationsSettings4.getInt("smart_delay_" + sharedPrefKey3, 180);
                            if (i6 == 0) {
                                textSettingsCell.setTextAndValue(LocaleController.getString("SmartNotifications", C1072R.string.SmartNotifications), LocaleController.getString("SmartNotificationsDisabled", C1072R.string.SmartNotificationsDisabled), ProfileNotificationsActivity.this.priorityRow != -1);
                                return;
                            }
                            textSettingsCell.setTextAndValue(LocaleController.getString("SmartNotifications", C1072R.string.SmartNotifications), LocaleController.formatString("SmartNotificationsInfo", C1072R.string.SmartNotificationsInfo, Integer.valueOf(i6), LocaleController.formatPluralString("Minutes", i7 / 60, new Object[0])), ProfileNotificationsActivity.this.priorityRow != -1);
                            return;
                        }
                        int i8 = notificationsSettings4.getInt("priority_" + sharedPrefKey3, 3);
                        if (i8 == 0) {
                            textSettingsCell.setTextAndValue(LocaleController.getString("NotificationsImportance", C1072R.string.NotificationsImportance), LocaleController.getString("NotificationsPriorityHigh", C1072R.string.NotificationsPriorityHigh), false);
                            return;
                        } else if (i8 == 1 || i8 == 2) {
                            textSettingsCell.setTextAndValue(LocaleController.getString("NotificationsImportance", C1072R.string.NotificationsImportance), LocaleController.getString("NotificationsPriorityUrgent", C1072R.string.NotificationsPriorityUrgent), false);
                            return;
                        } else if (i8 == 3) {
                            textSettingsCell.setTextAndValue(LocaleController.getString("NotificationsImportance", C1072R.string.NotificationsImportance), LocaleController.getString("NotificationsPrioritySettings", C1072R.string.NotificationsPrioritySettings), false);
                            return;
                        } else if (i8 == 4) {
                            textSettingsCell.setTextAndValue(LocaleController.getString("NotificationsImportance", C1072R.string.NotificationsImportance), LocaleController.getString("NotificationsPriorityLow", C1072R.string.NotificationsPriorityLow), false);
                            return;
                        } else if (i8 == 5) {
                            textSettingsCell.setTextAndValue(LocaleController.getString("NotificationsImportance", C1072R.string.NotificationsImportance), LocaleController.getString("NotificationsPriorityMedium", C1072R.string.NotificationsPriorityMedium), false);
                            return;
                        } else {
                            return;
                        }
                    }
                    int i9 = notificationsSettings4.getInt("vibrate_" + sharedPrefKey3, 0);
                    if (i9 == 0 || i9 == 4) {
                        textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", C1072R.string.Vibrate), LocaleController.getString("VibrationDefault", C1072R.string.VibrationDefault), (ProfileNotificationsActivity.this.smartRow == -1 && ProfileNotificationsActivity.this.priorityRow == -1) ? true : true);
                        return;
                    } else if (i9 == 1) {
                        textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", C1072R.string.Vibrate), LocaleController.getString("Short", C1072R.string.Short), (ProfileNotificationsActivity.this.smartRow == -1 && ProfileNotificationsActivity.this.priorityRow == -1) ? true : true);
                        return;
                    } else if (i9 == 2) {
                        textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", C1072R.string.Vibrate), LocaleController.getString("VibrationDisabled", C1072R.string.VibrationDisabled), (ProfileNotificationsActivity.this.smartRow == -1 && ProfileNotificationsActivity.this.priorityRow == -1) ? true : true);
                        return;
                    } else if (i9 == 3) {
                        textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", C1072R.string.Vibrate), LocaleController.getString("Long", C1072R.string.Long), (ProfileNotificationsActivity.this.smartRow == -1 && ProfileNotificationsActivity.this.priorityRow == -1) ? true : true);
                        return;
                    } else {
                        return;
                    }
                }
                String string = notificationsSettings4.getString("ringtone_" + sharedPrefKey3, LocaleController.getString("DefaultRingtone", C1072R.string.DefaultRingtone));
                if (string.equals("NoSound")) {
                    string = LocaleController.getString("NoSound", C1072R.string.NoSound);
                }
                textSettingsCell.setTextAndValue(LocaleController.getString("VoipSettingsRingtone", C1072R.string.VoipSettingsRingtone), string, false);
                return;
            }
            int i10 = C1072R.string.SoundDefault;
            String string2 = notificationsSettings4.getString("sound_" + sharedPrefKey3, LocaleController.getString("SoundDefault", i10));
            long j = notificationsSettings4.getLong("sound_document_id_" + sharedPrefKey3, 0L);
            if (j != 0) {
                TLRPC$Document document = ProfileNotificationsActivity.this.getMediaDataController().ringtoneDataStore.getDocument(j);
                if (document == null) {
                    string2 = LocaleController.getString("CustomSound", C1072R.string.CustomSound);
                } else {
                    string2 = NotificationsSoundActivity.trimTitle(document, document.file_name_fixed);
                }
            } else if (string2.equals("NoSound")) {
                string2 = LocaleController.getString("NoSound", C1072R.string.NoSound);
            } else if (string2.equals("Default")) {
                string2 = LocaleController.getString("SoundDefault", i10);
            }
            textSettingsCell.setTextAndValue(LocaleController.getString("Sound", C1072R.string.Sound), string2, true);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                ((HeaderCell) viewHolder.itemView).setEnabled(ProfileNotificationsActivity.this.notificationsEnabled, null);
            } else if (itemViewType == 1) {
                TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                if (viewHolder.getAdapterPosition() != ProfileNotificationsActivity.this.customResetRow) {
                    textSettingsCell.setEnabled(ProfileNotificationsActivity.this.notificationsEnabled, null);
                } else {
                    textSettingsCell.setEnabled(true, null);
                }
            } else if (itemViewType == 2) {
                ((TextInfoPrivacyCell) viewHolder.itemView).setEnabled(ProfileNotificationsActivity.this.notificationsEnabled, null);
            } else if (itemViewType == 3) {
                ((TextColorCell) viewHolder.itemView).setEnabled(ProfileNotificationsActivity.this.notificationsEnabled, null);
            } else if (itemViewType == 4) {
                ((RadioCell) viewHolder.itemView).setEnabled(ProfileNotificationsActivity.this.notificationsEnabled, null);
            } else if (itemViewType != 7) {
            } else {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                if (viewHolder.getAdapterPosition() == ProfileNotificationsActivity.this.previewRow) {
                    textCheckCell.setEnabled(ProfileNotificationsActivity.this.notificationsEnabled, null);
                } else {
                    textCheckCell.setEnabled(true, null);
                }
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (i == ProfileNotificationsActivity.this.generalRow || i == ProfileNotificationsActivity.this.popupRow || i == ProfileNotificationsActivity.this.ledRow || i == ProfileNotificationsActivity.this.callsRow) {
                return 0;
            }
            if (i == ProfileNotificationsActivity.this.soundRow || i == ProfileNotificationsActivity.this.vibrateRow || i == ProfileNotificationsActivity.this.priorityRow || i == ProfileNotificationsActivity.this.smartRow || i == ProfileNotificationsActivity.this.ringtoneRow || i == ProfileNotificationsActivity.this.callsVibrateRow || i == ProfileNotificationsActivity.this.customResetRow) {
                return 1;
            }
            if (i == ProfileNotificationsActivity.this.popupInfoRow || i == ProfileNotificationsActivity.this.ledInfoRow || i == ProfileNotificationsActivity.this.priorityInfoRow || i == ProfileNotificationsActivity.this.ringtoneInfoRow) {
                return 2;
            }
            if (i == ProfileNotificationsActivity.this.colorRow) {
                return 3;
            }
            if (i == ProfileNotificationsActivity.this.popupEnabledRow || i == ProfileNotificationsActivity.this.popupDisabledRow) {
                return 4;
            }
            if (i == ProfileNotificationsActivity.this.avatarRow) {
                return 5;
            }
            if (i == ProfileNotificationsActivity.this.avatarSectionRow || i == ProfileNotificationsActivity.this.customResetShadowRow) {
                return 6;
            }
            return (i == ProfileNotificationsActivity.this.enableRow || i == ProfileNotificationsActivity.this.previewRow) ? 7 : 0;
        }
    }

    @Override
    public int getNavigationBarColor() {
        return getThemedColor("windowBackgroundGray");
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ProfileNotificationsActivity.this.lambda$getThemeDescriptions$7();
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
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, new String[]{"statusColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, "windowBackgroundWhiteGrayText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, new String[]{"statusOnlineColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, "windowBackgroundWhiteBlueText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, null, Theme.avatarDrawables, null, "avatar_text"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundRed"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundOrange"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundViolet"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundGreen"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundCyan"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundBlue"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundPink"));
        return arrayList;
    }

    public void lambda$getThemeDescriptions$7() {
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
