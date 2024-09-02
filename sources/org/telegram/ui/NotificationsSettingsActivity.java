package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_account_setContactSignUpNotification;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextDetailSettingsCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;

public class NotificationsSettingsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private int accountsAllRow;
    private int accountsInfoRow;
    private int accountsSectionRow;
    private ListAdapter adapter;
    private int androidAutoAlertRow;
    private int badgeNumberMessagesRow;
    private int badgeNumberMutedRow;
    private int badgeNumberSection;
    private int badgeNumberSection2Row;
    private int badgeNumberShowRow;
    private int callsRingtoneRow;
    private int callsSection2Row;
    private int callsSectionRow;
    private int callsVibrateRow;
    private int channelsRow;
    private int contactJoinedRow;
    private int eventsSection2Row;
    private int eventsSectionRow;
    private int groupRow;
    private int inappPreviewRow;
    private int inappPriorityRow;
    private int inappSectionRow;
    private int inappSoundRow;
    private int inappVibrateRow;
    private int inchatSoundRow;
    private LinearLayoutManager layoutManager;
    private RecyclerListView listView;
    private int notificationsSection2Row;
    private int notificationsSectionRow;
    private int notificationsServiceConnectionRow;
    private int notificationsServiceRow;
    private int otherSection2Row;
    private int otherSectionRow;
    private int pinnedMessageRow;
    private int privateRow;
    private int reactionsRow;
    private int repeatRow;
    private int resetNotificationsRow;
    private int resetNotificationsSectionRow;
    private int resetSection2Row;
    private int resetSectionRow;
    private int storiesRow;
    private boolean updateRepeatNotifications;
    private boolean updateRingtone;
    private boolean updateVibrate;
    private boolean reseting = false;
    private ArrayList<NotificationException> exceptionUsers = null;
    private ArrayList<NotificationException> exceptionChats = null;
    private ArrayList<NotificationException> exceptionChannels = null;
    private ArrayList<NotificationException> exceptionStories = null;
    private ArrayList<NotificationException> exceptionAutoStories = null;
    private int rowCount = 0;

    public static class NotificationException {
        public boolean auto;
        public long did;
        public boolean hasCustom;
        public int muteUntil;
        public int notify;
        public boolean story;
    }

    public static void lambda$createView$7(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    @Override
    public boolean onFragmentCreate() {
        MessagesController.getInstance(this.currentAccount).loadSignUpNotificationsSettings();
        loadExceptions();
        if (UserConfig.getActivatedAccountsCount() > 1) {
            int i = this.rowCount;
            this.accountsSectionRow = i;
            this.accountsAllRow = i + 1;
            this.rowCount = i + 3;
            this.accountsInfoRow = i + 2;
        } else {
            this.accountsSectionRow = -1;
            this.accountsAllRow = -1;
            this.accountsInfoRow = -1;
        }
        int i2 = this.rowCount;
        this.notificationsSectionRow = i2;
        this.privateRow = i2 + 1;
        this.groupRow = i2 + 2;
        this.channelsRow = i2 + 3;
        this.storiesRow = i2 + 4;
        this.reactionsRow = i2 + 5;
        this.notificationsSection2Row = i2 + 6;
        this.callsSectionRow = i2 + 7;
        this.callsVibrateRow = i2 + 8;
        this.callsRingtoneRow = i2 + 9;
        this.eventsSection2Row = i2 + 10;
        this.badgeNumberSection = i2 + 11;
        this.badgeNumberShowRow = i2 + 12;
        this.badgeNumberMutedRow = i2 + 13;
        this.badgeNumberMessagesRow = i2 + 14;
        this.badgeNumberSection2Row = i2 + 15;
        this.inappSectionRow = i2 + 16;
        this.inappSoundRow = i2 + 17;
        this.inappVibrateRow = i2 + 18;
        this.inappPreviewRow = i2 + 19;
        int i3 = i2 + 21;
        this.rowCount = i3;
        this.inchatSoundRow = i2 + 20;
        if (Build.VERSION.SDK_INT >= 21) {
            this.rowCount = i2 + 22;
            this.inappPriorityRow = i3;
        } else {
            this.inappPriorityRow = -1;
        }
        int i4 = this.rowCount;
        this.callsSection2Row = i4;
        this.eventsSectionRow = i4 + 1;
        this.contactJoinedRow = i4 + 2;
        this.pinnedMessageRow = i4 + 3;
        this.otherSection2Row = i4 + 4;
        this.otherSectionRow = i4 + 5;
        this.notificationsServiceRow = i4 + 6;
        this.notificationsServiceConnectionRow = i4 + 7;
        this.androidAutoAlertRow = -1;
        this.repeatRow = i4 + 8;
        this.resetSection2Row = i4 + 9;
        this.resetSectionRow = i4 + 10;
        this.resetNotificationsRow = i4 + 11;
        this.rowCount = i4 + 13;
        this.resetNotificationsSectionRow = i4 + 12;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getMessagesController().reloadReactionsNotifySettings();
        return super.onFragmentCreate();
    }

    private void loadExceptions() {
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        final ArrayList arrayList = new ArrayList(MediaDataController.getInstance(this.currentAccount).hints);
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsSettingsActivity.this.lambda$loadExceptions$2(arrayList);
            }
        });
    }

    public void lambda$loadExceptions$2(java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.lambda$loadExceptions$2(java.util.ArrayList):void");
    }

    public void lambda$loadExceptions$1(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        MessagesController.getInstance(this.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(this.currentAccount).putChats(arrayList2, true);
        MessagesController.getInstance(this.currentAccount).putEncryptedChats(arrayList3, true);
        this.exceptionUsers = arrayList4;
        this.exceptionChats = arrayList5;
        this.exceptionChannels = arrayList6;
        this.exceptionStories = arrayList7;
        this.exceptionAutoStories = arrayList8;
        this.adapter.notifyItemChanged(this.privateRow);
        this.adapter.notifyItemChanged(this.groupRow);
        this.adapter.notifyItemChanged(this.channelsRow);
        this.adapter.notifyItemChanged(this.storiesRow);
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString("NotificationsAndSounds", R.string.NotificationsAndSounds));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    NotificationsSettingsActivity.this.lambda$onBackPressed$308();
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setItemAnimator(null);
        this.listView.setLayoutAnimation(null);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        };
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        this.listView.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView3 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.adapter = listAdapter;
        recyclerListView3.setAdapter(listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view, int i) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
            }

            @Override
            public void onDoubleTap(View view, int i, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
            }

            @Override
            public final void onItemClick(View view, int i, float f, float f2) {
                NotificationsSettingsActivity.this.lambda$createView$10(view, i, f, f2);
            }
        });
        return this.fragmentView;
    }

    public void lambda$createView$10(View view, final int i, float f, float f2) {
        ArrayList<NotificationException> arrayList;
        boolean isGlobalNotificationsEnabled;
        r3 = false;
        r3 = false;
        r3 = false;
        r3 = false;
        r3 = false;
        r3 = false;
        boolean z = false;
        final int i2 = 0;
        if (getParentActivity() == null) {
            return;
        }
        int i3 = this.privateRow;
        Parcelable parcelable = null;
        parcelable = null;
        if (i == i3 || i == this.groupRow || i == this.channelsRow || i == this.storiesRow || i == this.reactionsRow) {
            ArrayList<NotificationException> arrayList2 = null;
            if (i == i3) {
                arrayList = this.exceptionUsers;
                isGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(1);
                i2 = 1;
            } else if (i == this.groupRow) {
                arrayList = this.exceptionChats;
                isGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(0);
            } else if (i == this.storiesRow) {
                ArrayList<NotificationException> arrayList3 = this.exceptionStories;
                ArrayList<NotificationException> arrayList4 = this.exceptionAutoStories;
                isGlobalNotificationsEnabled = getNotificationsSettings().getBoolean("EnableAllStories", false);
                i2 = 3;
                arrayList = arrayList3;
                arrayList2 = arrayList4;
            } else if (i == this.reactionsRow) {
                arrayList = null;
                isGlobalNotificationsEnabled = getNotificationsSettings().getBoolean("EnableReactionsMessages", true) || getNotificationsSettings().getBoolean("EnableReactionsStories", true);
                i2 = 4;
            } else {
                arrayList = this.exceptionChannels;
                isGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(2);
                i2 = 2;
            }
            if (arrayList == null && i2 != 4) {
                return;
            }
            final NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) view;
            if ((LocaleController.isRTL && f <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                final boolean z2 = isGlobalNotificationsEnabled;
                showExceptionsAlert(i, new Runnable() {
                    @Override
                    public final void run() {
                        NotificationsSettingsActivity.this.lambda$createView$3(i2, z2, notificationsCheckCell, i);
                    }
                });
            } else {
                presentFragment(new NotificationsCustomSettingsActivity(i2, arrayList, arrayList2));
            }
            z = isGlobalNotificationsEnabled;
        } else if (i == this.callsRingtoneRow) {
            try {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
                Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
                String path = uri != null ? uri.getPath() : null;
                String string = notificationsSettings.getString("CallsRingtonePath", path);
                if (string != null && !string.equals("NoSound")) {
                    parcelable = string.equals(path) ? uri : Uri.parse(string);
                }
                intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                startActivityForResult(intent, i);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i == this.resetNotificationsRow) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString("ResetNotificationsAlertTitle", R.string.ResetNotificationsAlertTitle));
            builder.setMessage(LocaleController.getString("ResetNotificationsAlert", R.string.ResetNotificationsAlert));
            builder.setPositiveButton(LocaleController.getString("Reset", R.string.Reset), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    NotificationsSettingsActivity.this.lambda$createView$6(dialogInterface, i4);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            AlertDialog create = builder.create();
            showDialog(create);
            TextView textView = (TextView) create.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            }
        } else if (i == this.inappSoundRow) {
            SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(this.currentAccount);
            SharedPreferences.Editor edit = notificationsSettings2.edit();
            z = notificationsSettings2.getBoolean("EnableInAppSounds", true);
            edit.putBoolean("EnableInAppSounds", !z);
            edit.commit();
        } else if (i == this.inappVibrateRow) {
            SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(this.currentAccount);
            SharedPreferences.Editor edit2 = notificationsSettings3.edit();
            z = notificationsSettings3.getBoolean("EnableInAppVibrate", true);
            edit2.putBoolean("EnableInAppVibrate", !z);
            edit2.commit();
        } else if (i == this.inappPreviewRow) {
            SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(this.currentAccount);
            SharedPreferences.Editor edit3 = notificationsSettings4.edit();
            z = notificationsSettings4.getBoolean("EnableInAppPreview", true);
            edit3.putBoolean("EnableInAppPreview", !z);
            edit3.commit();
        } else if (i == this.inchatSoundRow) {
            SharedPreferences notificationsSettings5 = MessagesController.getNotificationsSettings(this.currentAccount);
            SharedPreferences.Editor edit4 = notificationsSettings5.edit();
            z = notificationsSettings5.getBoolean("EnableInChatSound", true);
            boolean z3 = !z;
            edit4.putBoolean("EnableInChatSound", z3);
            edit4.commit();
            getNotificationsController().setInChatSoundEnabled(z3);
        } else if (i == this.inappPriorityRow) {
            SharedPreferences notificationsSettings6 = MessagesController.getNotificationsSettings(this.currentAccount);
            SharedPreferences.Editor edit5 = notificationsSettings6.edit();
            z = notificationsSettings6.getBoolean("EnableInAppPriority", false);
            edit5.putBoolean("EnableInAppPriority", !z);
            edit5.commit();
        } else if (i == this.contactJoinedRow) {
            SharedPreferences notificationsSettings7 = MessagesController.getNotificationsSettings(this.currentAccount);
            SharedPreferences.Editor edit6 = notificationsSettings7.edit();
            z = notificationsSettings7.getBoolean("EnableContactJoined", true);
            boolean z4 = !z;
            MessagesController.getInstance(this.currentAccount).enableJoined = z4;
            edit6.putBoolean("EnableContactJoined", z4);
            edit6.commit();
            TLRPC$TL_account_setContactSignUpNotification tLRPC$TL_account_setContactSignUpNotification = new TLRPC$TL_account_setContactSignUpNotification();
            tLRPC$TL_account_setContactSignUpNotification.silent = z;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_account_setContactSignUpNotification, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    NotificationsSettingsActivity.lambda$createView$7(tLObject, tLRPC$TL_error);
                }
            });
        } else if (i == this.pinnedMessageRow) {
            SharedPreferences notificationsSettings8 = MessagesController.getNotificationsSettings(this.currentAccount);
            SharedPreferences.Editor edit7 = notificationsSettings8.edit();
            z = notificationsSettings8.getBoolean("PinnedMessages", true);
            edit7.putBoolean("PinnedMessages", !z);
            edit7.commit();
        } else if (i == this.androidAutoAlertRow) {
            SharedPreferences notificationsSettings9 = MessagesController.getNotificationsSettings(this.currentAccount);
            SharedPreferences.Editor edit8 = notificationsSettings9.edit();
            z = notificationsSettings9.getBoolean("EnableAutoNotifications", false);
            edit8.putBoolean("EnableAutoNotifications", !z);
            edit8.commit();
        } else if (i == this.badgeNumberShowRow) {
            SharedPreferences.Editor edit9 = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            z = getNotificationsController().showBadgeNumber;
            getNotificationsController().showBadgeNumber = !z;
            edit9.putBoolean("badgeNumber", getNotificationsController().showBadgeNumber);
            edit9.commit();
            getNotificationsController().updateBadge();
        } else if (i == this.badgeNumberMutedRow) {
            SharedPreferences.Editor edit10 = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            z = getNotificationsController().showBadgeMuted;
            getNotificationsController().showBadgeMuted = !z;
            edit10.putBoolean("badgeNumberMuted", getNotificationsController().showBadgeMuted);
            edit10.commit();
            getNotificationsController().updateBadge();
            getMessagesStorage().updateMutedDialogsFiltersCounters();
        } else if (i == this.badgeNumberMessagesRow) {
            SharedPreferences.Editor edit11 = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            z = getNotificationsController().showBadgeMessages;
            getNotificationsController().showBadgeMessages = !z;
            edit11.putBoolean("badgeNumberMessages", getNotificationsController().showBadgeMessages);
            edit11.commit();
            getNotificationsController().updateBadge();
        } else if (i == this.notificationsServiceConnectionRow) {
            SharedPreferences notificationsSettings10 = MessagesController.getNotificationsSettings(this.currentAccount);
            boolean z5 = notificationsSettings10.getBoolean("pushConnection", getMessagesController().backgroundConnection);
            SharedPreferences.Editor edit12 = notificationsSettings10.edit();
            edit12.putBoolean("pushConnection", !z5);
            edit12.commit();
            if (!z5) {
                ConnectionsManager.getInstance(this.currentAccount).setPushConnectionEnabled(true);
            } else {
                ConnectionsManager.getInstance(this.currentAccount).setPushConnectionEnabled(false);
            }
            z = z5;
        } else if (i == this.accountsAllRow) {
            SharedPreferences globalNotificationsSettings = MessagesController.getGlobalNotificationsSettings();
            boolean z6 = globalNotificationsSettings.getBoolean("AllAccounts", true);
            SharedPreferences.Editor edit13 = globalNotificationsSettings.edit();
            boolean z7 = !z6;
            edit13.putBoolean("AllAccounts", z7);
            edit13.commit();
            SharedConfig.showNotificationsForAllAccounts = z7;
            for (int i4 = 0; i4 < 4; i4++) {
                if (SharedConfig.showNotificationsForAllAccounts) {
                    NotificationsController.getInstance(i4).showNotifications();
                } else if (i4 == this.currentAccount) {
                    NotificationsController.getInstance(i4).showNotifications();
                } else {
                    NotificationsController.getInstance(i4).hideNotifications();
                }
            }
            z = z6;
        } else if (i == this.notificationsServiceRow) {
            SharedPreferences notificationsSettings11 = MessagesController.getNotificationsSettings(this.currentAccount);
            z = notificationsSettings11.getBoolean("pushService", getMessagesController().keepAliveService);
            SharedPreferences.Editor edit14 = notificationsSettings11.edit();
            edit14.putBoolean("pushService", !z);
            edit14.commit();
            ApplicationLoader.startPushService();
        } else if (i == this.callsVibrateRow) {
            if (getParentActivity() == null) {
                return;
            } else {
                showDialog(AlertsCreator.createVibrationSelectDialog(getParentActivity(), 0L, 0L, i == this.callsVibrateRow ? "vibrate_calls" : null, new Runnable() {
                    @Override
                    public final void run() {
                        NotificationsSettingsActivity.this.lambda$createView$8(i);
                    }
                }));
            }
        } else if (i == this.repeatRow) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity());
            builder2.setTitle(LocaleController.getString("RepeatNotifications", R.string.RepeatNotifications));
            builder2.setItems(new CharSequence[]{LocaleController.getString("RepeatDisabled", R.string.RepeatDisabled), LocaleController.formatPluralString("Minutes", 5, new Object[0]), LocaleController.formatPluralString("Minutes", 10, new Object[0]), LocaleController.formatPluralString("Minutes", 30, new Object[0]), LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Hours", 2, new Object[0]), LocaleController.formatPluralString("Hours", 4, new Object[0])}, new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    NotificationsSettingsActivity.this.lambda$createView$9(i, dialogInterface, i5);
                }
            });
            builder2.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            showDialog(builder2.create());
        }
        if (view instanceof TextCheckCell) {
            ((TextCheckCell) view).setChecked(!z);
        }
    }

    public void lambda$createView$3(int i, boolean z, NotificationsCheckCell notificationsCheckCell, int i2) {
        if (i == 3) {
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            if (z) {
                edit.remove("EnableAllStories");
            } else {
                edit.putBoolean("EnableAllStories", true);
            }
            edit.apply();
            getNotificationsController().updateServerNotificationsSettings(i);
        } else if (i == 4 || i == 5) {
            SharedPreferences.Editor edit2 = getNotificationsSettings().edit();
            if (z) {
                edit2.putBoolean("EnableReactionsMessages", false);
                edit2.putBoolean("EnableReactionsStories", false);
            } else {
                edit2.putBoolean("EnableReactionsMessages", true);
                edit2.putBoolean("EnableReactionsStories", true);
            }
            edit2.apply();
            getNotificationsController().updateServerNotificationsSettings(i);
            getNotificationsController().deleteNotificationChannelGlobal(i);
        } else {
            getNotificationsController().setGlobalNotificationsEnabled(i, !z ? 0 : Integer.MAX_VALUE);
        }
        notificationsCheckCell.setChecked(!z, 0);
        this.adapter.notifyItemChanged(i2);
    }

    public void lambda$createView$6(DialogInterface dialogInterface, int i) {
        if (this.reseting) {
            return;
        }
        this.reseting = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i2, boolean z) {
                return TLRPC$Bool.TLdeserialize(abstractSerializedData, i2, z);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(-612493497);
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                NotificationsSettingsActivity.this.lambda$createView$5(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$createView$5(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NotificationsSettingsActivity.this.lambda$createView$4();
            }
        });
    }

    public void lambda$createView$4() {
        getMessagesController().enableJoined = true;
        this.reseting = false;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
        edit.clear();
        edit.commit();
        this.exceptionChats.clear();
        this.exceptionUsers.clear();
        this.adapter.notifyDataSetChanged();
        if (getParentActivity() != null) {
            Toast.makeText(getParentActivity(), LocaleController.getString("ResetNotificationsText", R.string.ResetNotificationsText), 0).show();
        }
        getMessagesStorage().updateMutedDialogsFiltersCounters();
    }

    public void lambda$createView$8(int i) {
        this.updateVibrate = true;
        this.adapter.notifyItemChanged(i);
    }

    public void lambda$createView$9(int i, DialogInterface dialogInterface, int i2) {
        MessagesController.getNotificationsSettings(this.currentAccount).edit().putInt("repeat_messages", i2 != 1 ? i2 == 2 ? 10 : i2 == 3 ? 30 : i2 == 4 ? 60 : i2 == 5 ? 120 : i2 == 6 ? 240 : 0 : 5).commit();
        this.updateRepeatNotifications = true;
        this.adapter.notifyItemChanged(i);
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i2 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri == null || (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) == null) {
                str = null;
            } else {
                if (i == this.callsRingtoneRow) {
                    if (uri.equals(Settings.System.DEFAULT_RINGTONE_URI)) {
                        str = LocaleController.getString("DefaultRingtone", R.string.DefaultRingtone);
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = LocaleController.getString("SoundDefault", R.string.SoundDefault);
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            }
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            if (i == this.callsRingtoneRow) {
                if (str != null && uri != null) {
                    edit.putString("CallsRingtone", str);
                    edit.putString("CallsRingtonePath", uri.toString());
                } else {
                    edit.putString("CallsRingtone", "NoSound");
                    edit.putString("CallsRingtonePath", "NoSound");
                }
                this.updateRingtone = true;
            }
            edit.commit();
            this.adapter.notifyItemChanged(i);
        }
    }

    private void showExceptionsAlert(int i, final Runnable runnable) {
        final ArrayList<NotificationException> arrayList;
        String formatPluralString;
        final ArrayList<NotificationException> arrayList2;
        String str = null;
        if (i == this.storiesRow) {
            arrayList = this.exceptionStories;
            arrayList2 = this.exceptionAutoStories;
            if (arrayList != null && !arrayList.isEmpty()) {
                str = LocaleController.formatPluralString("ChatsException", arrayList.size(), new Object[0]);
            }
        } else if (i == this.privateRow) {
            arrayList = this.exceptionUsers;
            if (arrayList != null && !arrayList.isEmpty()) {
                formatPluralString = LocaleController.formatPluralString("ChatsException", arrayList.size(), new Object[0]);
                str = formatPluralString;
                arrayList2 = null;
            }
            arrayList2 = null;
        } else if (i == this.groupRow) {
            arrayList = this.exceptionChats;
            if (arrayList != null && !arrayList.isEmpty()) {
                formatPluralString = LocaleController.formatPluralString("Groups", arrayList.size(), new Object[0]);
                str = formatPluralString;
                arrayList2 = null;
            }
            arrayList2 = null;
        } else {
            if (i == this.reactionsRow) {
                runnable.run();
                return;
            }
            arrayList = this.exceptionChannels;
            if (arrayList != null && !arrayList.isEmpty()) {
                formatPluralString = LocaleController.formatPluralString("Channels", arrayList.size(), new Object[0]);
                str = formatPluralString;
                arrayList2 = null;
            }
            arrayList2 = null;
        }
        if (str == null) {
            runnable.run();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        if (arrayList.size() == 1) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsExceptionsSingleAlert", R.string.NotificationsExceptionsSingleAlert, str)));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsExceptionsAlert", R.string.NotificationsExceptionsAlert, str)));
        }
        builder.setTitle(LocaleController.getString("NotificationsExceptions", R.string.NotificationsExceptions));
        builder.setNeutralButton(LocaleController.getString("ViewExceptions", R.string.ViewExceptions), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                NotificationsSettingsActivity.this.lambda$showExceptionsAlert$11(arrayList, arrayList2, dialogInterface, i2);
            }
        });
        builder.setNegativeButton(LocaleController.getString("OK", R.string.OK), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                runnable.run();
            }
        });
        showDialog(builder.create());
    }

    public void lambda$showExceptionsAlert$11(ArrayList arrayList, ArrayList arrayList2, DialogInterface dialogInterface, int i) {
        presentFragment(new NotificationsCustomSettingsActivity(-1, arrayList, arrayList2));
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.notificationsSettingsUpdated) {
            this.adapter.notifyDataSetChanged();
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            return (adapterPosition == NotificationsSettingsActivity.this.notificationsSectionRow || adapterPosition == NotificationsSettingsActivity.this.notificationsSection2Row || adapterPosition == NotificationsSettingsActivity.this.inappSectionRow || adapterPosition == NotificationsSettingsActivity.this.eventsSectionRow || adapterPosition == NotificationsSettingsActivity.this.otherSectionRow || adapterPosition == NotificationsSettingsActivity.this.resetSectionRow || adapterPosition == NotificationsSettingsActivity.this.badgeNumberSection || adapterPosition == NotificationsSettingsActivity.this.otherSection2Row || adapterPosition == NotificationsSettingsActivity.this.resetSection2Row || adapterPosition == NotificationsSettingsActivity.this.callsSection2Row || adapterPosition == NotificationsSettingsActivity.this.callsSectionRow || adapterPosition == NotificationsSettingsActivity.this.badgeNumberSection2Row || adapterPosition == NotificationsSettingsActivity.this.accountsSectionRow || adapterPosition == NotificationsSettingsActivity.this.accountsInfoRow || adapterPosition == NotificationsSettingsActivity.this.resetNotificationsSectionRow || adapterPosition == NotificationsSettingsActivity.this.eventsSection2Row) ? false : true;
        }

        @Override
        public int getItemCount() {
            return NotificationsSettingsActivity.this.rowCount;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View headerCell;
            if (i == 0) {
                headerCell = new HeaderCell(this.mContext, ((BaseFragment) NotificationsSettingsActivity.this).resourceProvider);
                headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            } else if (i == 1) {
                headerCell = new TextCheckCell(this.mContext, ((BaseFragment) NotificationsSettingsActivity.this).resourceProvider);
                headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            } else if (i == 2) {
                headerCell = new TextDetailSettingsCell(this.mContext);
                headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            } else if (i == 3) {
                headerCell = new NotificationsCheckCell(this.mContext, 21, 64, true, ((BaseFragment) NotificationsSettingsActivity.this).resourceProvider);
                headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            } else if (i == 4) {
                headerCell = new ShadowSectionCell(this.mContext, ((BaseFragment) NotificationsSettingsActivity.this).resourceProvider);
            } else if (i == 5) {
                headerCell = new TextSettingsCell(this.mContext, ((BaseFragment) NotificationsSettingsActivity.this).resourceProvider);
                headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            } else {
                headerCell = new TextInfoPrivacyCell(this.mContext, ((BaseFragment) NotificationsSettingsActivity.this).resourceProvider);
                headerCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            }
            return new RecyclerListView.Holder(headerCell);
        }

        @Override
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r21, int r22) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsSettingsActivity.ListAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override
        public int getItemViewType(int i) {
            if (i == NotificationsSettingsActivity.this.eventsSectionRow || i == NotificationsSettingsActivity.this.otherSectionRow || i == NotificationsSettingsActivity.this.resetSectionRow || i == NotificationsSettingsActivity.this.callsSectionRow || i == NotificationsSettingsActivity.this.badgeNumberSection || i == NotificationsSettingsActivity.this.inappSectionRow || i == NotificationsSettingsActivity.this.notificationsSectionRow || i == NotificationsSettingsActivity.this.accountsSectionRow) {
                return 0;
            }
            if (i == NotificationsSettingsActivity.this.inappSoundRow || i == NotificationsSettingsActivity.this.inappVibrateRow || i == NotificationsSettingsActivity.this.notificationsServiceConnectionRow || i == NotificationsSettingsActivity.this.inappPreviewRow || i == NotificationsSettingsActivity.this.contactJoinedRow || i == NotificationsSettingsActivity.this.pinnedMessageRow || i == NotificationsSettingsActivity.this.notificationsServiceRow || i == NotificationsSettingsActivity.this.badgeNumberMutedRow || i == NotificationsSettingsActivity.this.badgeNumberMessagesRow || i == NotificationsSettingsActivity.this.badgeNumberShowRow || i == NotificationsSettingsActivity.this.inappPriorityRow || i == NotificationsSettingsActivity.this.inchatSoundRow || i == NotificationsSettingsActivity.this.androidAutoAlertRow || i == NotificationsSettingsActivity.this.accountsAllRow) {
                return 1;
            }
            if (i == NotificationsSettingsActivity.this.resetNotificationsRow) {
                return 2;
            }
            if (i == NotificationsSettingsActivity.this.privateRow || i == NotificationsSettingsActivity.this.groupRow || i == NotificationsSettingsActivity.this.channelsRow || i == NotificationsSettingsActivity.this.storiesRow || i == NotificationsSettingsActivity.this.reactionsRow) {
                return 3;
            }
            if (i == NotificationsSettingsActivity.this.eventsSection2Row || i == NotificationsSettingsActivity.this.notificationsSection2Row || i == NotificationsSettingsActivity.this.otherSection2Row || i == NotificationsSettingsActivity.this.resetSection2Row || i == NotificationsSettingsActivity.this.callsSection2Row || i == NotificationsSettingsActivity.this.badgeNumberSection2Row || i == NotificationsSettingsActivity.this.resetNotificationsSectionRow) {
                return 4;
            }
            return i == NotificationsSettingsActivity.this.accountsInfoRow ? 6 : 5;
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{HeaderCell.class, TextCheckCell.class, TextDetailSettingsCell.class, TextSettingsCell.class, NotificationsCheckCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        ActionBar actionBar = this.actionBar;
        int i = ThemeDescription.FLAG_BACKGROUND;
        int i2 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, i, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        int i4 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        int i5 = Theme.key_switchTrack;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        int i6 = Theme.key_switchTrackChecked;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i6));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i6));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteValueText));
        int i7 = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LINKCOLOR, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteLinkText));
        return arrayList;
    }
}
