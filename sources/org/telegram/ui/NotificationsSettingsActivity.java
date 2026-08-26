package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticLambda278;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
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
import org.telegram.ui.Stars.StarGiftPreviewSheet$$ExternalSyntheticLambda5;

public final class NotificationsSettingsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public int accountsAllRow;
    public int accountsInfoRow;
    public int accountsSectionRow;
    public ListAdapter adapter;
    public int androidAutoAlertRow;
    public int badgeNumberMessagesRow;
    public int badgeNumberMutedRow;
    public int badgeNumberSection;
    public int badgeNumberSection2Row;
    public int badgeNumberShowRow;
    public int callsRingtoneRow;
    public int callsSection2Row;
    public int callsSectionRow;
    public int callsVibrateRow;
    public int channelsRow;
    public int contactJoinedRow;
    public int eventsSection2Row;
    public int eventsSectionRow;
    public ArrayList exceptionAutoStories;
    public ArrayList exceptionChannels;
    public ArrayList exceptionChats;
    public ArrayList exceptionStories;
    public ArrayList exceptionUsers;
    public int groupRow;
    public int inappPreviewRow;
    public int inappPriorityRow;
    public int inappSectionRow;
    public int inappSoundRow;
    public int inappVibrateRow;
    public int inchatSoundRow;
    public RecyclerListView listView;
    public int notificationsSection2Row;
    public int notificationsSectionRow;
    public int notificationsServiceConnectionRow;
    public int notificationsServiceRow;
    public int otherSection2Row;
    public int otherSectionRow;
    public int pinnedMessageRow;
    public int privateRow;
    public int reactionsRow;
    public int repeatRow;
    public int resetNotificationsRow;
    public int resetNotificationsSectionRow;
    public int resetSection2Row;
    public int resetSectionRow;
    public boolean reseting;
    public int rowCount;
    public int storiesRow;
    public boolean updateRepeatNotifications;
    public boolean updateRingtone;
    public boolean updateVibrate;

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return NotificationsSettingsActivity.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            NotificationsSettingsActivity notificationsSettingsActivity = NotificationsSettingsActivity.this;
            if (i == notificationsSettingsActivity.eventsSectionRow || i == notificationsSettingsActivity.otherSectionRow || i == notificationsSettingsActivity.resetSectionRow || i == notificationsSettingsActivity.callsSectionRow || i == notificationsSettingsActivity.badgeNumberSection || i == notificationsSettingsActivity.inappSectionRow || i == notificationsSettingsActivity.notificationsSectionRow || i == notificationsSettingsActivity.accountsSectionRow) {
                return 0;
            }
            if (i == notificationsSettingsActivity.inappSoundRow || i == notificationsSettingsActivity.inappVibrateRow || i == notificationsSettingsActivity.notificationsServiceConnectionRow || i == notificationsSettingsActivity.inappPreviewRow || i == notificationsSettingsActivity.contactJoinedRow || i == notificationsSettingsActivity.pinnedMessageRow || i == notificationsSettingsActivity.notificationsServiceRow || i == notificationsSettingsActivity.badgeNumberMutedRow || i == notificationsSettingsActivity.badgeNumberMessagesRow || i == notificationsSettingsActivity.badgeNumberShowRow || i == notificationsSettingsActivity.inappPriorityRow || i == notificationsSettingsActivity.inchatSoundRow || i == notificationsSettingsActivity.androidAutoAlertRow || i == notificationsSettingsActivity.accountsAllRow) {
                return 1;
            }
            if (i == notificationsSettingsActivity.resetNotificationsRow) {
                return 2;
            }
            if (i == notificationsSettingsActivity.privateRow || i == notificationsSettingsActivity.groupRow || i == notificationsSettingsActivity.channelsRow || i == notificationsSettingsActivity.storiesRow || i == notificationsSettingsActivity.reactionsRow) {
                return 3;
            }
            if (i == notificationsSettingsActivity.eventsSection2Row || i == notificationsSettingsActivity.notificationsSection2Row || i == notificationsSettingsActivity.otherSection2Row || i == notificationsSettingsActivity.resetSection2Row || i == notificationsSettingsActivity.callsSection2Row || i == notificationsSettingsActivity.badgeNumberSection2Row || i == notificationsSettingsActivity.resetNotificationsSectionRow) {
                return 4;
            }
            return i == notificationsSettingsActivity.accountsInfoRow ? 6 : 5;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            NotificationsSettingsActivity notificationsSettingsActivity = NotificationsSettingsActivity.this;
            return (adapterPosition == notificationsSettingsActivity.notificationsSectionRow || adapterPosition == notificationsSettingsActivity.notificationsSection2Row || adapterPosition == notificationsSettingsActivity.inappSectionRow || adapterPosition == notificationsSettingsActivity.eventsSectionRow || adapterPosition == notificationsSettingsActivity.otherSectionRow || adapterPosition == notificationsSettingsActivity.resetSectionRow || adapterPosition == notificationsSettingsActivity.badgeNumberSection || adapterPosition == notificationsSettingsActivity.otherSection2Row || adapterPosition == notificationsSettingsActivity.resetSection2Row || adapterPosition == notificationsSettingsActivity.callsSection2Row || adapterPosition == notificationsSettingsActivity.callsSectionRow || adapterPosition == notificationsSettingsActivity.badgeNumberSection2Row || adapterPosition == notificationsSettingsActivity.accountsSectionRow || adapterPosition == notificationsSettingsActivity.accountsInfoRow || adapterPosition == notificationsSettingsActivity.resetNotificationsSectionRow || adapterPosition == notificationsSettingsActivity.eventsSection2Row) ? false : true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            ArrayList arrayList;
            int i2;
            int i3;
            int i4;
            ArrayList arrayList2;
            boolean z;
            int i5;
            StringBuilder sb;
            boolean z2;
            boolean z3;
            String pluralString;
            int i6 = viewHolder.mItemViewType;
            NotificationsSettingsActivity notificationsSettingsActivity = NotificationsSettingsActivity.this;
            View view = viewHolder.itemView;
            if (i6 == 0) {
                HeaderCell headerCell = (HeaderCell) view;
                if (i == notificationsSettingsActivity.notificationsSectionRow) {
                    headerCell.setText(LocaleController.getString("NotificationsForChats", R.string.NotificationsForChats));
                    return;
                }
                if (i == notificationsSettingsActivity.inappSectionRow) {
                    headerCell.setText(LocaleController.getString("InAppNotifications", R.string.InAppNotifications));
                    return;
                }
                if (i == notificationsSettingsActivity.eventsSectionRow) {
                    headerCell.setText(LocaleController.getString("Events", R.string.Events));
                    return;
                }
                if (i == notificationsSettingsActivity.otherSectionRow) {
                    headerCell.setText(LocaleController.getString("NotificationsOther", R.string.NotificationsOther));
                    return;
                }
                if (i == notificationsSettingsActivity.resetSectionRow) {
                    headerCell.setText(LocaleController.getString("Reset", R.string.Reset));
                    return;
                }
                if (i == notificationsSettingsActivity.callsSectionRow) {
                    headerCell.setText(LocaleController.getString("VoipNotificationSettings", R.string.VoipNotificationSettings));
                    return;
                } else if (i == notificationsSettingsActivity.badgeNumberSection) {
                    headerCell.setText(LocaleController.getString("BadgeNumber", R.string.BadgeNumber));
                    return;
                } else {
                    if (i == notificationsSettingsActivity.accountsSectionRow) {
                        headerCell.setText(LocaleController.getString("ShowNotificationsFor", R.string.ShowNotificationsFor));
                        return;
                    }
                    return;
                }
            }
            if (i6 == 1) {
                TextCheckCell textCheckCell = (TextCheckCell) view;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((BaseFragment) notificationsSettingsActivity).currentAccount);
                if (i == notificationsSettingsActivity.inappSoundRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.InAppSounds), notificationsSettings.getBoolean("EnableInAppSounds", true), true);
                    return;
                }
                if (i == notificationsSettingsActivity.inappVibrateRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.InAppVibrate), notificationsSettings.getBoolean("EnableInAppVibrate", true), true);
                    return;
                }
                if (i == notificationsSettingsActivity.inappPreviewRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.InAppPreview), notificationsSettings.getBoolean("EnableInAppPreview", true), true);
                    return;
                }
                if (i == notificationsSettingsActivity.inappPriorityRow) {
                    textCheckCell.setTextAndValueAndCheck(LocaleController.getString(R.string.InAppPopup), LocaleController.getString(R.string.InAppPopupInfo), notificationsSettings.getBoolean("EnableInAppPopup", true), true, false);
                    return;
                }
                if (i == notificationsSettingsActivity.contactJoinedRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("ContactJoined", R.string.ContactJoined), notificationsSettings.getBoolean("EnableContactJoined", true), true);
                    return;
                }
                if (i == notificationsSettingsActivity.pinnedMessageRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("PinnedMessages", R.string.PinnedMessages), notificationsSettings.getBoolean("PinnedMessages", true), false);
                    return;
                }
                if (i == notificationsSettingsActivity.androidAutoAlertRow) {
                    textCheckCell.setTextAndCheck("Android Auto", notificationsSettings.getBoolean("EnableAutoNotifications", false), true);
                    return;
                }
                if (i == notificationsSettingsActivity.notificationsServiceRow) {
                    textCheckCell.setTextAndValueAndCheck(LocaleController.getString("NotificationsService", R.string.NotificationsService), LocaleController.getString("NotificationsServiceInfo", R.string.NotificationsServiceInfo), notificationsSettings.getBoolean("pushService", notificationsSettingsActivity.getMessagesController().keepAliveService), true, true);
                    return;
                }
                if (i == notificationsSettingsActivity.notificationsServiceConnectionRow) {
                    textCheckCell.setTextAndValueAndCheck(LocaleController.getString("NotificationsServiceConnection", R.string.NotificationsServiceConnection), LocaleController.getString("NotificationsServiceConnectionInfo", R.string.NotificationsServiceConnectionInfo), notificationsSettings.getBoolean("pushConnection", notificationsSettingsActivity.getMessagesController().backgroundConnection), true, true);
                    return;
                }
                if (i == notificationsSettingsActivity.badgeNumberShowRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("BadgeNumberShow", R.string.BadgeNumberShow), notificationsSettingsActivity.getNotificationsController().showBadgeNumber, true);
                    return;
                }
                if (i == notificationsSettingsActivity.badgeNumberMutedRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("BadgeNumberMutedChats", R.string.BadgeNumberMutedChats), notificationsSettingsActivity.getNotificationsController().showBadgeMuted, true);
                    return;
                }
                if (i == notificationsSettingsActivity.badgeNumberMessagesRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("BadgeNumberUnread", R.string.BadgeNumberUnread), notificationsSettingsActivity.getNotificationsController().showBadgeMessages, false);
                    return;
                }
                if (i == notificationsSettingsActivity.inchatSoundRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("InChatSound", R.string.InChatSound), notificationsSettings.getBoolean("EnableInChatSound", true), true);
                    return;
                } else if (i == notificationsSettingsActivity.callsVibrateRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("Vibrate", R.string.Vibrate), notificationsSettings.getBoolean("EnableCallVibrate", true), true);
                    return;
                } else {
                    if (i == notificationsSettingsActivity.accountsAllRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString("AllAccounts", R.string.AllAccounts), MessagesController.getGlobalNotificationsSettings().getBoolean("AllAccounts", true), false);
                        return;
                    }
                    return;
                }
            }
            if (i6 == 2) {
                TextDetailSettingsCell textDetailSettingsCell = (TextDetailSettingsCell) view;
                textDetailSettingsCell.setMultilineDetail(true);
                if (i == notificationsSettingsActivity.resetNotificationsRow) {
                    textDetailSettingsCell.setTextAndValue(LocaleController.getString("ResetAllNotifications", R.string.ResetAllNotifications), LocaleController.getString("UndoAllCustom", R.string.UndoAllCustom), false);
                    return;
                }
                return;
            }
            if (i6 != 3) {
                if (i6 != 5) {
                    if (i6 != 6) {
                        return;
                    }
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                    if (i == notificationsSettingsActivity.accountsInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString("ShowNotificationsForInfo", R.string.ShowNotificationsForInfo));
                        return;
                    }
                    return;
                }
                TextSettingsCell textSettingsCell = (TextSettingsCell) view;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(((BaseFragment) notificationsSettingsActivity).currentAccount);
                if (i == notificationsSettingsActivity.callsRingtoneRow) {
                    String string2 = notificationsSettings2.getString("CallsRingtone", LocaleController.getString("DefaultRingtone", R.string.DefaultRingtone));
                    if (string2.equals("NoSound")) {
                        string2 = LocaleController.getString("NoSound", R.string.NoSound);
                    }
                    textSettingsCell.setTextAndValue(LocaleController.getString("VoipSettingsRingtone", R.string.VoipSettingsRingtone), string2, notificationsSettingsActivity.updateRingtone, false);
                    notificationsSettingsActivity.updateRingtone = false;
                    return;
                }
                if (i != notificationsSettingsActivity.callsVibrateRow) {
                    if (i == notificationsSettingsActivity.repeatRow) {
                        int i7 = notificationsSettings2.getInt("repeat_messages", 60);
                        if (i7 == 0) {
                            pluralString = LocaleController.getString("RepeatNotificationsNever", R.string.RepeatNotificationsNever);
                        } else {
                            pluralString = i7 < 60 ? LocaleController.formatPluralString("Minutes", i7, new Object[0]) : LocaleController.formatPluralString("Hours", i7 / 60, new Object[0]);
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("RepeatNotifications", R.string.RepeatNotifications), pluralString, notificationsSettingsActivity.updateRepeatNotifications, false);
                        notificationsSettingsActivity.updateRepeatNotifications = false;
                        return;
                    }
                    return;
                }
                int i8 = notificationsSettings2.getInt("vibrate_calls", 0);
                if (i8 == 0) {
                    textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("VibrationDefault", R.string.VibrationDefault), notificationsSettingsActivity.updateVibrate, true);
                } else if (i8 == 1) {
                    textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("Short", R.string.Short), notificationsSettingsActivity.updateVibrate, true);
                } else if (i8 == 2) {
                    textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("VibrationDisabled", R.string.VibrationDisabled), notificationsSettingsActivity.updateVibrate, true);
                } else if (i8 == 3) {
                    textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("Long", R.string.Long), notificationsSettingsActivity.updateVibrate, true);
                } else if (i8 == 4) {
                    textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("OnlyIfSilent", R.string.OnlyIfSilent), notificationsSettingsActivity.updateVibrate, true);
                }
                notificationsSettingsActivity.updateVibrate = false;
                return;
            }
            NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) view;
            SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(((BaseFragment) notificationsSettingsActivity).currentAccount);
            int currentTime = ConnectionsManager.getInstance(((BaseFragment) notificationsSettingsActivity).currentAccount).getCurrentTime();
            ArrayList arrayList3 = null;
            if (i == notificationsSettingsActivity.privateRow) {
                string = LocaleController.getString(R.string.NotificationsPrivateChats);
                arrayList = notificationsSettingsActivity.exceptionUsers;
                i2 = notificationsSettings3.getInt("EnableAll2", 0);
                i3 = R.drawable.msg_openprofile;
            } else {
                if (i != notificationsSettingsActivity.groupRow) {
                    if (i == notificationsSettingsActivity.storiesRow) {
                        string = LocaleController.getString(R.string.NotificationStories);
                        arrayList3 = notificationsSettingsActivity.exceptionStories;
                        arrayList2 = notificationsSettingsActivity.exceptionAutoStories;
                        i4 = notificationsSettings3.getBoolean("EnableAllStories", false) ? 0 : Integer.MAX_VALUE;
                        i3 = R.drawable.msg_menu_stories;
                    } else if (i == notificationsSettingsActivity.reactionsRow) {
                        string = LocaleController.getString(R.string.NotificationReactions);
                        int i9 = (notificationsSettings3.getBoolean("EnableReactionsMessages", true) || notificationsSettings3.getBoolean("EnableReactionsStories", true)) ? 0 : Integer.MAX_VALUE;
                        i3 = R.drawable.msg_reactions;
                        i4 = i9;
                        arrayList2 = null;
                    } else {
                        string = LocaleController.getString(R.string.NotificationsChannels);
                        arrayList = notificationsSettingsActivity.exceptionChannels;
                        i2 = notificationsSettings3.getInt("EnableChannel2", 0);
                        i3 = R.drawable.msg_channel;
                    }
                    if (i4 < currentTime) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && i4 - 31536000 < currentTime) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    String str = string;
                    sb = new StringBuilder();
                    if (i == notificationsSettingsActivity.reactionsRow) {
                        if (arrayList3 == null && !arrayList3.isEmpty()) {
                            z = i4 < currentTime;
                            if (z) {
                                sb.append(LocaleController.getString("NotificationsOn", R.string.NotificationsOn));
                            } else if (i4 - 31536000 >= currentTime) {
                                sb.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                            } else {
                                sb.append(LocaleController.formatString("NotificationsOffUntil", R.string.NotificationsOffUntil, LocaleController.stringForMessageListDate(i4)));
                            }
                            if (sb.length() != 0) {
                                sb.append(", ");
                            }
                            int size = arrayList3.size();
                            if (i == notificationsSettingsActivity.storiesRow && !notificationsSettings3.contains("EnableAllStories") && arrayList2 != null) {
                                size += arrayList2.size();
                            }
                            sb.append(LocaleController.formatPluralString("Exception", size, new Object[0]));
                        } else if (arrayList2 != null || arrayList2.isEmpty()) {
                            sb.append(LocaleController.getString("TapToChange", R.string.TapToChange));
                        } else {
                            if (i4 > 0) {
                                sb.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                            } else {
                                sb.append(LocaleController.getString("NotificationsOn", R.string.NotificationsOn));
                            }
                            if (!arrayList2.isEmpty() && !notificationsSettings3.contains("EnableAllStories")) {
                                sb.append(", ");
                                sb.append(LocaleController.formatPluralString("AutoException", arrayList2.size(), new Object[0]));
                            }
                        }
                        z2 = z;
                    } else if (i4 > 0) {
                        sb.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                        z2 = false;
                    } else {
                        if (notificationsSettings3.getBoolean("EnableReactionsMessages", true)) {
                            sb.append(LocaleController.getString(R.string.NotificationReactionsMessages));
                        }
                        if (notificationsSettings3.getBoolean("EnableReactionsStories", true)) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(LocaleController.getString(R.string.NotificationReactionsStories));
                        }
                        z2 = true;
                    }
                    if (i != notificationsSettingsActivity.reactionsRow) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    notificationsCheckCell.setTextAndValueAndIconAndCheck(str, sb, i3, z2, i5, false, z3, false);
                }
                string = LocaleController.getString(R.string.NotificationsGroups);
                arrayList = notificationsSettingsActivity.exceptionChats;
                i2 = notificationsSettings3.getInt("EnableGroup2", 0);
                i3 = R.drawable.msg_groups;
            }
            int i10 = i2;
            arrayList2 = null;
            arrayList3 = arrayList;
            i4 = i10;
            if (i4 < currentTime) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i5 = 0;
            } else {
                i5 = 2;
            }
            String str2 = string;
            sb = new StringBuilder();
            if (i == notificationsSettingsActivity.reactionsRow) {
                if (arrayList3 == null) {
                    if (arrayList2 != null) {
                        sb.append(LocaleController.getString("TapToChange", R.string.TapToChange));
                    } else {
                        sb.append(LocaleController.getString("TapToChange", R.string.TapToChange));
                    }
                } else if (arrayList2 != null) {
                    sb.append(LocaleController.getString("TapToChange", R.string.TapToChange));
                } else {
                    sb.append(LocaleController.getString("TapToChange", R.string.TapToChange));
                }
                z2 = z;
            } else if (i4 > 0) {
                sb.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                z2 = false;
            } else {
                if (notificationsSettings3.getBoolean("EnableReactionsMessages", true)) {
                    sb.append(LocaleController.getString(R.string.NotificationReactionsMessages));
                }
                if (notificationsSettings3.getBoolean("EnableReactionsStories", true)) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(LocaleController.getString(R.string.NotificationReactionsStories));
                }
                z2 = true;
            }
            if (i != notificationsSettingsActivity.reactionsRow) {
                z3 = true;
            } else {
                z3 = false;
            }
            notificationsCheckCell.setTextAndValueAndIconAndCheck(str2, sb, i3, z2, i5, false, z3, false);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View headerCell;
            NotificationsSettingsActivity notificationsSettingsActivity = NotificationsSettingsActivity.this;
            Context context = this.mContext;
            if (i == 0) {
                headerCell = new HeaderCell(context, ((BaseFragment) notificationsSettingsActivity).resourceProvider);
            } else if (i == 1) {
                headerCell = new TextCheckCell(21, context, ((BaseFragment) notificationsSettingsActivity).resourceProvider, false);
            } else if (i == 2) {
                headerCell = new TextDetailSettingsCell(context);
            } else if (i == 3) {
                headerCell = new NotificationsCheckCell(this.mContext, 21, 64, true, ((BaseFragment) notificationsSettingsActivity).resourceProvider);
            } else if (i != 4) {
                headerCell = i != 5 ? new TextInfoPrivacyCell(context, 24, ((BaseFragment) notificationsSettingsActivity).resourceProvider) : new TextSettingsCell(context, 0, ((BaseFragment) notificationsSettingsActivity).resourceProvider);
            } else {
                headerCell = new ShadowSectionCell(context, (Object) null);
            }
            return new RecyclerListView.Holder(headerCell);
        }
    }

    public final class NotificationException {
        public boolean auto;
        public long did;
        public boolean hasCustom;
        public int muteUntil;
        public int notify;
        public boolean story;
    }

    public NotificationsSettingsActivity() {
        super(null);
        this.reseting = false;
        this.exceptionUsers = null;
        this.exceptionChats = null;
        this.exceptionChannels = null;
        this.exceptionStories = null;
        this.exceptionAutoStories = null;
        this.rowCount = 0;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsAndSounds));
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 5));
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isRightLayout) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setItemAnimator(null);
        this.listView.setLayoutAnimation(null);
        this.listView.setLayoutManager(new PhotoViewer.AnonymousClass36(i, 13, false));
        this.listView.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        RecyclerListView recyclerListView2 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.adapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        this.listView.setOnItemClickListener(new NotificationsSettingsActivity$$ExternalSyntheticLambda0(this));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.notificationsSettingsUpdated) {
            this.adapter.mObservable.notifyChanged();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{HeaderCell.class, TextCheckCell.class, TextDetailSettingsCell.class, TextSettingsCell.class, NotificationsCheckCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        int i2 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i2));
        int i3 = Theme.key_switchTrack;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, i3));
        int i4 = Theme.key_switchTrackChecked;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, 2, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteLinkText));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$createView$10(View view, float f, int i) {
        boolean zIsGlobalNotificationsEnabled;
        ArrayList arrayList;
        int i2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String pluralString;
        ArrayList arrayList5;
        int i3 = 13;
        boolean z = false;
        z = false;
        int i4 = 1;
        if (getParentActivity() == null) {
            return;
        }
        int i5 = this.privateRow;
        Parcelable parcelable = null;
        parcelable = null;
        if (i == i5 || i == this.groupRow || i == this.channelsRow || i == this.storiesRow || i == this.reactionsRow) {
            if (i == i5) {
                ArrayList arrayList6 = this.exceptionUsers;
                zIsGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(1);
                arrayList = arrayList6;
                i2 = 1;
            } else if (i == this.groupRow) {
                ArrayList arrayList7 = this.exceptionChats;
                zIsGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(0);
                arrayList = arrayList7;
                i2 = 0;
            } else {
                if (i == this.storiesRow) {
                    ArrayList arrayList8 = this.exceptionStories;
                    arrayList2 = this.exceptionAutoStories;
                    zIsGlobalNotificationsEnabled = getNotificationsSettings().getBoolean("EnableAllStories", false);
                    arrayList = arrayList8;
                    i2 = 3;
                } else if (i == this.reactionsRow) {
                    zIsGlobalNotificationsEnabled = getNotificationsSettings().getBoolean("EnableReactionsMessages", true) || getNotificationsSettings().getBoolean("EnableReactionsStories", true);
                    i2 = 4;
                    arrayList = null;
                } else {
                    ArrayList arrayList9 = this.exceptionChannels;
                    zIsGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(2);
                    arrayList = arrayList9;
                    i2 = 2;
                }
                if (arrayList != null && i2 != 4) {
                    return;
                }
                arrayList3 = arrayList;
                NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) view;
                if ((LocaleController.isRTL || f > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                    presentFragment(new NotificationsCustomSettingsActivity(i2, arrayList3, arrayList2, false));
                } else {
                    boolean z2 = zIsGlobalNotificationsEnabled;
                    ChatActivity$$ExternalSyntheticLambda241 chatActivity$$ExternalSyntheticLambda241 = new ChatActivity$$ExternalSyntheticLambda241(this, i2, z2, notificationsCheckCell, i);
                    zIsGlobalNotificationsEnabled = z2;
                    if (i == this.storiesRow) {
                        arrayList4 = this.exceptionStories;
                        arrayList5 = this.exceptionAutoStories;
                        pluralString = (arrayList4 == null || arrayList4.isEmpty()) ? null : LocaleController.formatPluralString("ChatsException", arrayList4.size(), new Object[0]);
                    } else if (i == this.privateRow) {
                        arrayList4 = this.exceptionUsers;
                        if (arrayList4 == null || arrayList4.isEmpty()) {
                            pluralString = null;
                        } else {
                            pluralString = LocaleController.formatPluralString("ChatsException", arrayList4.size(), new Object[0]);
                        }
                        arrayList5 = null;
                    } else if (i == this.groupRow) {
                        arrayList4 = this.exceptionChats;
                        if (arrayList4 == null || arrayList4.isEmpty()) {
                            pluralString = null;
                        } else {
                            pluralString = LocaleController.formatPluralString("Groups", arrayList4.size(), new Object[0]);
                        }
                        arrayList5 = null;
                    } else if (i == this.reactionsRow) {
                        chatActivity$$ExternalSyntheticLambda241.run();
                    } else {
                        arrayList4 = this.exceptionChannels;
                        if (arrayList4 == null || arrayList4.isEmpty()) {
                            pluralString = null;
                        } else {
                            pluralString = LocaleController.formatPluralString("Channels", arrayList4.size(), new Object[0]);
                        }
                        arrayList5 = null;
                    }
                    if (pluralString == null) {
                        chatActivity$$ExternalSyntheticLambda241.run();
                    } else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                        int size = arrayList4.size();
                        AlertDialog alertDialog = builder.alertDialog;
                        if (size == 1) {
                            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.NotificationsExceptionsSingleAlert, pluralString));
                        } else {
                            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.NotificationsExceptionsAlert, pluralString));
                        }
                        alertDialog.title = LocaleController.getString("NotificationsExceptions", R.string.NotificationsExceptions);
                        builder.setNeutralButton(LocaleController.getString("ViewExceptions", R.string.ViewExceptions), new VoIPFragment$$ExternalSyntheticLambda42(this, arrayList4, arrayList5, i3));
                        builder.setNegativeButton(LocaleController.getString("OK", R.string.OK), new PhotoViewer$$ExternalSyntheticLambda115(chatActivity$$ExternalSyntheticLambda241, i3));
                        showDialog(alertDialog);
                    }
                }
                z = zIsGlobalNotificationsEnabled;
            }
            arrayList2 = null;
            if (arrayList != null) {
            }
            arrayList3 = arrayList;
            NotificationsCheckCell notificationsCheckCell2 = (NotificationsCheckCell) view;
            if (LocaleController.isRTL) {
                presentFragment(new NotificationsCustomSettingsActivity(i2, arrayList3, arrayList2, false));
            } else {
                presentFragment(new NotificationsCustomSettingsActivity(i2, arrayList3, arrayList2, false));
            }
            z = zIsGlobalNotificationsEnabled;
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
            AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), 0, null);
            String string2 = LocaleController.getString("ResetNotificationsAlertTitle", R.string.ResetNotificationsAlertTitle);
            AlertDialog alertDialog2 = builder2.alertDialog;
            alertDialog2.title = string2;
            alertDialog2.message = LocaleController.getString("ResetNotificationsAlert", R.string.ResetNotificationsAlert);
            builder2.setPositiveButton(LocaleController.getString("Reset", R.string.Reset), new NotificationsSettingsActivity$$ExternalSyntheticLambda0(this));
            builder2.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            showDialog(alertDialog2);
            TextView textView = (TextView) alertDialog2.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        } else if (i == this.inappSoundRow) {
            SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(this.currentAccount);
            SharedPreferences.Editor editorEdit = notificationsSettings2.edit();
            z = notificationsSettings2.getBoolean("EnableInAppSounds", true);
            editorEdit.putBoolean("EnableInAppSounds", !z);
            editorEdit.commit();
        } else if (i == this.inappVibrateRow) {
            SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(this.currentAccount);
            SharedPreferences.Editor editorEdit2 = notificationsSettings3.edit();
            z = notificationsSettings3.getBoolean("EnableInAppVibrate", true);
            editorEdit2.putBoolean("EnableInAppVibrate", !z);
            editorEdit2.commit();
        } else if (i == this.inappPreviewRow) {
            SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(this.currentAccount);
            SharedPreferences.Editor editorEdit3 = notificationsSettings4.edit();
            z = notificationsSettings4.getBoolean("EnableInAppPreview", true);
            editorEdit3.putBoolean("EnableInAppPreview", !z);
            editorEdit3.commit();
        } else if (i == this.inchatSoundRow) {
            SharedPreferences notificationsSettings5 = MessagesController.getNotificationsSettings(this.currentAccount);
            SharedPreferences.Editor editorEdit4 = notificationsSettings5.edit();
            z = notificationsSettings5.getBoolean("EnableInChatSound", true);
            boolean z3 = !z;
            editorEdit4.putBoolean("EnableInChatSound", z3);
            editorEdit4.commit();
            getNotificationsController().setInChatSoundEnabled(z3);
        } else if (i == this.inappPriorityRow) {
            SharedPreferences notificationsSettings6 = MessagesController.getNotificationsSettings(this.currentAccount);
            SharedPreferences.Editor editorEdit5 = notificationsSettings6.edit();
            z = notificationsSettings6.getBoolean("EnableInAppPopup", true);
            editorEdit5.putBoolean("EnableInAppPopup", !z);
            editorEdit5.commit();
        } else if (i == this.contactJoinedRow) {
            SharedPreferences notificationsSettings7 = MessagesController.getNotificationsSettings(this.currentAccount);
            SharedPreferences.Editor editorEdit6 = notificationsSettings7.edit();
            z = notificationsSettings7.getBoolean("EnableContactJoined", true);
            boolean z4 = !z;
            MessagesController.getInstance(this.currentAccount).enableJoined = z4;
            editorEdit6.putBoolean("EnableContactJoined", z4);
            editorEdit6.commit();
            TL_account.setContactSignUpNotification setcontactsignupnotification = new TL_account.setContactSignUpNotification();
            setcontactsignupnotification.silent = z;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(setcontactsignupnotification, new PassportActivity$$ExternalSyntheticLambda1(i4));
        } else if (i == this.pinnedMessageRow) {
            SharedPreferences notificationsSettings8 = MessagesController.getNotificationsSettings(this.currentAccount);
            SharedPreferences.Editor editorEdit7 = notificationsSettings8.edit();
            z = notificationsSettings8.getBoolean("PinnedMessages", true);
            editorEdit7.putBoolean("PinnedMessages", !z);
            editorEdit7.commit();
        } else if (i == this.androidAutoAlertRow) {
            SharedPreferences notificationsSettings9 = MessagesController.getNotificationsSettings(this.currentAccount);
            SharedPreferences.Editor editorEdit8 = notificationsSettings9.edit();
            z = notificationsSettings9.getBoolean("EnableAutoNotifications", false);
            editorEdit8.putBoolean("EnableAutoNotifications", !z);
            editorEdit8.commit();
        } else if (i == this.badgeNumberShowRow) {
            SharedPreferences.Editor editorEdit9 = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            z = getNotificationsController().showBadgeNumber;
            getNotificationsController().showBadgeNumber = !z;
            editorEdit9.putBoolean("badgeNumber", getNotificationsController().showBadgeNumber);
            editorEdit9.commit();
            getNotificationsController().updateBadge();
        } else if (i == this.badgeNumberMutedRow) {
            SharedPreferences.Editor editorEdit10 = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            z = getNotificationsController().showBadgeMuted;
            getNotificationsController().showBadgeMuted = !z;
            editorEdit10.putBoolean("badgeNumberMuted", getNotificationsController().showBadgeMuted);
            editorEdit10.commit();
            getNotificationsController().updateBadge();
            getMessagesStorage().updateMutedDialogsFiltersCounters();
        } else if (i == this.badgeNumberMessagesRow) {
            SharedPreferences.Editor editorEdit11 = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            z = getNotificationsController().showBadgeMessages;
            getNotificationsController().showBadgeMessages = !z;
            editorEdit11.putBoolean("badgeNumberMessages", getNotificationsController().showBadgeMessages);
            editorEdit11.commit();
            getNotificationsController().updateBadge();
        } else if (i == this.notificationsServiceConnectionRow) {
            SharedPreferences notificationsSettings10 = MessagesController.getNotificationsSettings(this.currentAccount);
            boolean z5 = notificationsSettings10.getBoolean("pushConnection", getMessagesController().backgroundConnection);
            SharedPreferences.Editor editorEdit12 = notificationsSettings10.edit();
            editorEdit12.putBoolean("pushConnection", !z5);
            editorEdit12.commit();
            if (z5) {
                ConnectionsManager.getInstance(this.currentAccount).setPushConnectionEnabled(false);
            } else {
                ConnectionsManager.getInstance(this.currentAccount).setPushConnectionEnabled(true);
            }
            z = z5;
        } else if (i == this.accountsAllRow) {
            SharedPreferences globalNotificationsSettings = MessagesController.getGlobalNotificationsSettings();
            boolean z6 = globalNotificationsSettings.getBoolean("AllAccounts", true);
            SharedPreferences.Editor editorEdit13 = globalNotificationsSettings.edit();
            boolean z7 = !z6;
            editorEdit13.putBoolean("AllAccounts", z7);
            editorEdit13.commit();
            SharedConfig.showNotificationsForAllAccounts = z7;
            for (int i6 = 0; i6 < 4; i6++) {
                if (SharedConfig.showNotificationsForAllAccounts) {
                    NotificationsController.getInstance(i6).showNotifications();
                } else if (i6 == this.currentAccount) {
                    NotificationsController.getInstance(i6).showNotifications();
                } else {
                    NotificationsController.getInstance(i6).hideNotifications();
                }
            }
            z = z6;
        } else if (i == this.notificationsServiceRow) {
            SharedPreferences notificationsSettings11 = MessagesController.getNotificationsSettings(this.currentAccount);
            z = notificationsSettings11.getBoolean("pushService", getMessagesController().keepAliveService);
            SharedPreferences.Editor editorEdit14 = notificationsSettings11.edit();
            editorEdit14.putBoolean("pushService", !z);
            editorEdit14.commit();
            ApplicationLoader.startPushService();
        } else if (i == this.callsVibrateRow) {
            if (getParentActivity() == null) {
                return;
            } else {
                showDialog(AlertsCreator.createVibrationSelectDialog(getParentActivity(), 0L, 0L, i == this.callsVibrateRow ? "vibrate_calls" : null, new OAuthSheet$$ExternalSyntheticLambda17(this, i, 18), null));
            }
        } else if (i == this.repeatRow) {
            AlertDialog.Builder builder3 = new AlertDialog.Builder(getParentActivity(), 0, null);
            String string3 = LocaleController.getString("RepeatNotifications", R.string.RepeatNotifications);
            AlertDialog alertDialog3 = builder3.alertDialog;
            alertDialog3.title = string3;
            builder3.setItems(new CharSequence[]{LocaleController.getString("RepeatDisabled", R.string.RepeatDisabled), LocaleController.formatPluralString("Minutes", 5, new Object[0]), LocaleController.formatPluralString("Minutes", 10, new Object[0]), LocaleController.formatPluralString("Minutes", 30, new Object[0]), LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Hours", 2, new Object[0]), LocaleController.formatPluralString("Hours", 4, new Object[0])}, new ThemeActivity$$ExternalSyntheticLambda14(this, i, 2));
            builder3.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            showDialog(alertDialog3);
        }
        if (view instanceof TextCheckCell) {
            ((TextCheckCell) view).setChecked(!z);
        }
    }

    public final void lambda$createView$4$1$2() {
        getMessagesController().enableJoined = true;
        this.reseting = false;
        SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
        editorEdit.clear();
        editorEdit.commit();
        this.exceptionChats.clear();
        this.exceptionUsers.clear();
        this.adapter.mObservable.notifyChanged();
        if (getParentActivity() != null) {
            Toast.makeText(getParentActivity(), LocaleController.getString("ResetNotificationsText", R.string.ResetNotificationsText), 0).show();
        }
        getMessagesStorage().updateMutedDialogsFiltersCounters();
    }

    public final void lambda$createView$6$11() {
        if (this.reseting) {
            return;
        }
        this.reseting = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resetNotifySettings(), new LinkManager$$ExternalSyntheticLambda3(this, 17));
    }

    public final void lambda$createView$9(int i, int i2) {
        int i3 = 5;
        if (i2 != 1) {
            if (i2 == 2) {
                i3 = 10;
            } else if (i2 == 3) {
                i3 = 30;
            } else if (i2 == 4) {
                i3 = 60;
            } else if (i2 == 5) {
                i3 = 120;
            } else {
                i3 = i2 == 6 ? 240 : 0;
            }
        }
        MessagesController.getNotificationsSettings(this.currentAccount).edit().putInt("repeat_messages", i3).commit();
        this.updateRepeatNotifications = true;
        this.adapter.notifyItemChanged(i);
    }

    public final void lambda$loadExceptions$1(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, OAuthSheet$$ExternalSyntheticLambda2 oAuthSheet$$ExternalSyntheticLambda2) {
        MessagesController.getInstance(this.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(this.currentAccount).putChats(arrayList2, true);
        MessagesController.getInstance(this.currentAccount).putEncryptedChats(arrayList3, true);
        this.exceptionUsers = arrayList4;
        this.exceptionChats = arrayList5;
        this.exceptionChannels = arrayList6;
        this.exceptionStories = arrayList7;
        this.exceptionAutoStories = arrayList8;
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.notifyItemChanged(this.privateRow);
            this.adapter.notifyItemChanged(this.groupRow);
            this.adapter.notifyItemChanged(this.channelsRow);
            this.adapter.notifyItemChanged(this.storiesRow);
        }
        if (oAuthSheet$$ExternalSyntheticLambda2 != null) {
            oAuthSheet$$ExternalSyntheticLambda2.run();
        }
    }

    public final void lambda$loadExceptions$2(ArrayList arrayList, OAuthSheet$$ExternalSyntheticLambda2 oAuthSheet$$ExternalSyntheticLambda2) {
        boolean z;
        ArrayList<TLRPC.Chat> arrayList2;
        ArrayList<TLRPC.User> arrayList3;
        ArrayList<TLRPC.EncryptedChat> arrayList4;
        int size;
        int i;
        ArrayList arrayList5;
        int size2;
        int i2;
        int size3;
        int i3;
        int size4;
        int i4;
        TLRPC.User user;
        TLRPC.Chat chat;
        ArrayList arrayList6;
        int i5;
        ArrayList arrayList7;
        ArrayList arrayList8;
        Integer num;
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList<Long> arrayList14 = new ArrayList<>();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList<TLRPC.User> arrayList17 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList18 = new ArrayList<>();
        ArrayList<TLRPC.EncryptedChat> arrayList19 = new ArrayList<>();
        long j = UserConfig.getInstance(this.currentAccount).clientUserId;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
        Map<String, ?> all = notificationsSettings.getAll();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (true) {
            arrayList18 = arrayList18;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            arrayList17 = arrayList17;
            if (key.startsWith("notify2_")) {
                ArrayList<TLRPC.EncryptedChat> arrayList20 = arrayList19;
                String strReplace = key.replace("notify2_", "");
                if (strReplace.contains("_")) {
                    arrayList19 = arrayList20;
                } else {
                    Long l = Utilities.parseLong(strReplace);
                    ArrayList arrayList21 = arrayList12;
                    ArrayList arrayList22 = arrayList13;
                    long jLongValue = l.longValue();
                    if (jLongValue == 0 || jLongValue == j) {
                        arrayList12 = arrayList21;
                        arrayList19 = arrayList20;
                        arrayList13 = arrayList22;
                    } else {
                        NotificationException notificationException = new NotificationException();
                        notificationException.did = jLongValue;
                        ArrayList arrayList23 = arrayList10;
                        notificationException.hasCustom = NotificationsController$$ExternalSyntheticOutline0.m("custom_", jLongValue, notificationsSettings, false);
                        int iIntValue = ((Integer) next.getValue()).intValue();
                        notificationException.notify = iIntValue;
                        if (iIntValue != 0 && (num = (Integer) all.get("notifyuntil_".concat(strReplace))) != null) {
                            notificationException.muteUntil = num.intValue();
                        }
                        if (DialogObject.isEncryptedDialog(jLongValue)) {
                            int encryptedChatId = DialogObject.getEncryptedChatId(jLongValue);
                            TLRPC.EncryptedChat encryptedChat = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(encryptedChatId));
                            if (encryptedChat == null) {
                                arrayList16.add(Integer.valueOf(encryptedChatId));
                                longSparseArray.put(jLongValue, notificationException);
                            } else {
                                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(encryptedChat.user_id));
                                if (user2 == null) {
                                    arrayList14.add(Long.valueOf(encryptedChat.user_id));
                                    longSparseArray.put(encryptedChat.user_id, notificationException);
                                } else if (!user2.deleted) {
                                }
                            }
                            arrayList9.add(notificationException);
                        } else if (DialogObject.isUserDialog(jLongValue)) {
                            TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(l);
                            if (user3 == null) {
                                arrayList14.add(l);
                                longSparseArray.put(jLongValue, notificationException);
                            } else if (!user3.deleted) {
                            }
                            arrayList9.add(notificationException);
                        } else {
                            long j2 = -jLongValue;
                            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j2));
                            if (chat2 == null) {
                                arrayList15.add(Long.valueOf(j2));
                                longSparseArray.put(jLongValue, notificationException);
                            } else if (!chat2.left && !chat2.kicked && chat2.migrated_to == null) {
                                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                                    arrayList10 = arrayList23;
                                    arrayList10.add(notificationException);
                                    arrayList19 = arrayList20;
                                    arrayList13 = arrayList22;
                                    arrayList12 = arrayList21;
                                } else {
                                    arrayList11.add(notificationException);
                                }
                            }
                        }
                        arrayList19 = arrayList20;
                        arrayList13 = arrayList22;
                        arrayList12 = arrayList21;
                        arrayList10 = arrayList23;
                    }
                }
            }
        }
        ArrayList arrayList24 = arrayList12;
        ArrayList arrayList25 = arrayList13;
        ArrayList<TLRPC.User> arrayList26 = arrayList17;
        ArrayList<TLRPC.EncryptedChat> arrayList27 = arrayList19;
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next2 = it2.next();
            String key2 = next2.getKey();
            if (key2.startsWith("stories_")) {
                try {
                    Long l2 = Utilities.parseLong(key2.substring(8));
                    long jLongValue2 = l2.longValue();
                    if (jLongValue2 != 0 && jLongValue2 != j) {
                        NotificationException notificationException2 = new NotificationException();
                        notificationException2.did = jLongValue2;
                        notificationException2.notify = ((Boolean) next2.getValue()).booleanValue() ? 0 : Integer.MAX_VALUE;
                        notificationException2.story = true;
                        if (DialogObject.isUserDialog(jLongValue2)) {
                            TLRPC.User user4 = getMessagesController().getUser(l2);
                            if (user4 == null) {
                                try {
                                    arrayList14.add(l2);
                                    longSparseArray.put(jLongValue2, notificationException2);
                                } catch (Exception unused) {
                                    arrayList8 = arrayList24;
                                }
                            } else if (user4.deleted) {
                            }
                            arrayList8 = arrayList24;
                            try {
                                arrayList8.add(notificationException2);
                                hashSet.add(l2);
                            } catch (Exception unused2) {
                            }
                            arrayList24 = arrayList8;
                        }
                    }
                } catch (Exception unused3) {
                    arrayList8 = arrayList24;
                }
            }
        }
        ArrayList arrayList28 = arrayList24;
        ArrayList arrayList29 = arrayList;
        Collections.sort(arrayList29, Comparator$CC.comparingDouble(new StarGiftPreviewSheet$$ExternalSyntheticLambda5(4)));
        int iMax = Math.max(0, arrayList29.size() - 5);
        while (iMax < arrayList29.size()) {
            long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList29.get(iMax)).peer);
            if (hashSet.contains(Long.valueOf(peerDialogId))) {
                i5 = iMax;
            } else {
                NotificationException notificationException3 = new NotificationException();
                notificationException3.did = peerDialogId;
                i5 = iMax;
                notificationException3.notify = 0;
                notificationException3.auto = z;
                notificationException3.story = z;
                if (DialogObject.isUserDialog(peerDialogId)) {
                    TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(peerDialogId));
                    if (user5 == null) {
                        arrayList14.add(Long.valueOf(peerDialogId));
                        longSparseArray.put(peerDialogId, notificationException3);
                    } else if (user5.deleted) {
                    }
                    arrayList7 = arrayList25;
                    arrayList7.add(0, notificationException3);
                    hashSet.add(Long.valueOf(peerDialogId));
                }
                arrayList25 = arrayList7;
                iMax = i5 + 1;
                z = true;
                arrayList29 = arrayList;
            }
            arrayList7 = arrayList25;
            arrayList25 = arrayList7;
            iMax = i5 + 1;
            z = true;
            arrayList29 = arrayList;
        }
        ArrayList arrayList30 = arrayList25;
        if (longSparseArray.size() != 0) {
            try {
                if (arrayList16.isEmpty()) {
                    arrayList4 = arrayList27;
                } else {
                    try {
                        arrayList4 = arrayList27;
                        try {
                            MessagesStorage.getInstance(this.currentAccount).getEncryptedChatsInternal(TextUtils.join(",", arrayList16), arrayList4, arrayList14);
                        } catch (Exception e) {
                            e = e;
                            arrayList2 = arrayList18;
                            arrayList3 = arrayList26;
                            FileLog.e(e);
                            size = arrayList2.size();
                            i = 0;
                            while (i < size) {
                                chat = arrayList2.get(i);
                                if (chat.left) {
                                    arrayList6 = arrayList30;
                                } else {
                                    arrayList6 = arrayList30;
                                }
                                i++;
                                arrayList30 = arrayList6;
                            }
                            arrayList5 = arrayList30;
                            size2 = arrayList3.size();
                            for (i2 = 0; i2 < size2; i2++) {
                                user = arrayList3.get(i2);
                                if (!user.deleted) {
                                    longSparseArray.remove(user.id);
                                }
                            }
                            size3 = arrayList4.size();
                            for (i3 = 0; i3 < size3; i3++) {
                                longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i3).id));
                            }
                            size4 = longSparseArray.size();
                            for (i4 = 0; i4 < size4; i4++) {
                                if (DialogObject.isChatDialog(longSparseArray.keyAt(i4))) {
                                    arrayList10.remove(longSparseArray.valueAt(i4));
                                    arrayList11.remove(longSparseArray.valueAt(i4));
                                } else {
                                    arrayList9.remove(longSparseArray.valueAt(i4));
                                }
                            }
                            AndroidUtilities.runOnUIThread(new MessagesController$$ExternalSyntheticLambda278(this, arrayList3, arrayList2, arrayList4, arrayList9, arrayList10, arrayList11, arrayList28, arrayList5, oAuthSheet$$ExternalSyntheticLambda2));
                        }
                    } catch (Exception e2) {
                        e = e2;
                        arrayList4 = arrayList27;
                        arrayList2 = arrayList18;
                        arrayList3 = arrayList26;
                        FileLog.e(e);
                        size = arrayList2.size();
                        i = 0;
                        while (i < size) {
                            chat = arrayList2.get(i);
                            if (chat.left) {
                                arrayList6 = arrayList30;
                            } else {
                                arrayList6 = arrayList30;
                            }
                            i++;
                            arrayList30 = arrayList6;
                        }
                        arrayList5 = arrayList30;
                        size2 = arrayList3.size();
                        while (i2 < size2) {
                            user = arrayList3.get(i2);
                            if (!user.deleted) {
                                longSparseArray.remove(user.id);
                            }
                        }
                        size3 = arrayList4.size();
                        while (i3 < size3) {
                            longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i3).id));
                        }
                        size4 = longSparseArray.size();
                        while (i4 < size4) {
                            if (DialogObject.isChatDialog(longSparseArray.keyAt(i4))) {
                                arrayList10.remove(longSparseArray.valueAt(i4));
                                arrayList11.remove(longSparseArray.valueAt(i4));
                            } else {
                                arrayList9.remove(longSparseArray.valueAt(i4));
                            }
                        }
                        AndroidUtilities.runOnUIThread(new MessagesController$$ExternalSyntheticLambda278(this, arrayList3, arrayList2, arrayList4, arrayList9, arrayList10, arrayList11, arrayList28, arrayList5, oAuthSheet$$ExternalSyntheticLambda2));
                    }
                }
                if (arrayList14.isEmpty()) {
                    arrayList3 = arrayList26;
                } else {
                    try {
                        arrayList3 = arrayList26;
                        try {
                            MessagesStorage.getInstance(this.currentAccount).getUsersInternal(arrayList14, arrayList3);
                        } catch (Exception e3) {
                            e = e3;
                            arrayList2 = arrayList18;
                            FileLog.e(e);
                            size = arrayList2.size();
                            i = 0;
                            while (i < size) {
                                chat = arrayList2.get(i);
                                if (chat.left) {
                                    arrayList6 = arrayList30;
                                } else {
                                    arrayList6 = arrayList30;
                                }
                                i++;
                                arrayList30 = arrayList6;
                            }
                            arrayList5 = arrayList30;
                            size2 = arrayList3.size();
                            while (i2 < size2) {
                                user = arrayList3.get(i2);
                                if (!user.deleted) {
                                    longSparseArray.remove(user.id);
                                }
                            }
                            size3 = arrayList4.size();
                            while (i3 < size3) {
                                longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i3).id));
                            }
                            size4 = longSparseArray.size();
                            while (i4 < size4) {
                                if (DialogObject.isChatDialog(longSparseArray.keyAt(i4))) {
                                    arrayList10.remove(longSparseArray.valueAt(i4));
                                    arrayList11.remove(longSparseArray.valueAt(i4));
                                } else {
                                    arrayList9.remove(longSparseArray.valueAt(i4));
                                }
                            }
                            AndroidUtilities.runOnUIThread(new MessagesController$$ExternalSyntheticLambda278(this, arrayList3, arrayList2, arrayList4, arrayList9, arrayList10, arrayList11, arrayList28, arrayList5, oAuthSheet$$ExternalSyntheticLambda2));
                        }
                    } catch (Exception e4) {
                        e = e4;
                        arrayList3 = arrayList26;
                        arrayList2 = arrayList18;
                        FileLog.e(e);
                        size = arrayList2.size();
                        i = 0;
                        while (i < size) {
                            chat = arrayList2.get(i);
                            if (chat.left) {
                                arrayList6 = arrayList30;
                            } else {
                                arrayList6 = arrayList30;
                            }
                            i++;
                            arrayList30 = arrayList6;
                        }
                        arrayList5 = arrayList30;
                        size2 = arrayList3.size();
                        while (i2 < size2) {
                            user = arrayList3.get(i2);
                            if (!user.deleted) {
                                longSparseArray.remove(user.id);
                            }
                        }
                        size3 = arrayList4.size();
                        while (i3 < size3) {
                            longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i3).id));
                        }
                        size4 = longSparseArray.size();
                        while (i4 < size4) {
                            if (DialogObject.isChatDialog(longSparseArray.keyAt(i4))) {
                                arrayList10.remove(longSparseArray.valueAt(i4));
                                arrayList11.remove(longSparseArray.valueAt(i4));
                            } else {
                                arrayList9.remove(longSparseArray.valueAt(i4));
                            }
                        }
                        AndroidUtilities.runOnUIThread(new MessagesController$$ExternalSyntheticLambda278(this, arrayList3, arrayList2, arrayList4, arrayList9, arrayList10, arrayList11, arrayList28, arrayList5, oAuthSheet$$ExternalSyntheticLambda2));
                    }
                }
                if (arrayList15.isEmpty()) {
                    arrayList2 = arrayList18;
                } else {
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
                    String strJoin = TextUtils.join(",", arrayList15);
                    arrayList2 = arrayList18;
                    try {
                        messagesStorage.getChatsInternal(strJoin, arrayList2);
                    } catch (Exception e5) {
                        e = e5;
                        FileLog.e(e);
                    }
                }
            } catch (Exception e6) {
                e = e6;
                arrayList2 = arrayList18;
                arrayList3 = arrayList26;
                arrayList4 = arrayList27;
            }
            size = arrayList2.size();
            i = 0;
            while (i < size) {
                chat = arrayList2.get(i);
                if (chat.left || chat.kicked || chat.migrated_to != null) {
                    arrayList6 = arrayList30;
                } else {
                    NotificationException notificationException4 = (NotificationException) longSparseArray.get(-chat.id);
                    arrayList6 = arrayList30;
                    longSparseArray.remove(-chat.id);
                    if (notificationException4 != null) {
                        if (!ChatObject.isChannel(chat) || chat.megagroup) {
                            arrayList10.add(notificationException4);
                        } else {
                            arrayList11.add(notificationException4);
                        }
                    }
                }
                i++;
                arrayList30 = arrayList6;
            }
            arrayList5 = arrayList30;
            size2 = arrayList3.size();
            while (i2 < size2) {
                user = arrayList3.get(i2);
                if (!user.deleted) {
                    longSparseArray.remove(user.id);
                }
            }
            size3 = arrayList4.size();
            while (i3 < size3) {
                longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i3).id));
            }
            size4 = longSparseArray.size();
            while (i4 < size4) {
                if (DialogObject.isChatDialog(longSparseArray.keyAt(i4))) {
                    arrayList10.remove(longSparseArray.valueAt(i4));
                    arrayList11.remove(longSparseArray.valueAt(i4));
                } else {
                    arrayList9.remove(longSparseArray.valueAt(i4));
                }
            }
        } else {
            arrayList5 = arrayList30;
            arrayList2 = arrayList18;
            arrayList3 = arrayList26;
            arrayList4 = arrayList27;
        }
        AndroidUtilities.runOnUIThread(new MessagesController$$ExternalSyntheticLambda278(this, arrayList3, arrayList2, arrayList4, arrayList9, arrayList10, arrayList11, arrayList28, arrayList5, oAuthSheet$$ExternalSyntheticLambda2));
    }

    public final void loadExceptions(OAuthSheet$$ExternalSyntheticLambda2 oAuthSheet$$ExternalSyntheticLambda2) {
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new LinkManager$$ExternalSyntheticLambda21(this, new ArrayList(MediaDataController.getInstance(this.currentAccount).hints), oAuthSheet$$ExternalSyntheticLambda2, 25));
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        String string;
        Ringtone ringtone;
        if (i2 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri == null || (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) == null) {
                string = null;
            } else {
                if (i == this.callsRingtoneRow) {
                    string = uri.equals(Settings.System.DEFAULT_RINGTONE_URI) ? LocaleController.getString("DefaultRingtone", R.string.DefaultRingtone) : ringtone.getTitle(getParentActivity());
                } else {
                    string = uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? LocaleController.getString("SoundDefault", R.string.SoundDefault) : ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            }
            SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            if (i == this.callsRingtoneRow) {
                if (string == null || uri == null) {
                    editorEdit.putString("CallsRingtone", "NoSound");
                    editorEdit.putString("CallsRingtonePath", "NoSound");
                } else {
                    editorEdit.putString("CallsRingtone", string);
                    editorEdit.putString("CallsRingtonePath", uri.toString());
                }
                this.updateRingtone = true;
            }
            editorEdit.commit();
            this.adapter.notifyItemChanged(i);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController.getInstance(this.currentAccount).loadSignUpNotificationsSettings();
        loadExceptions(null);
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
        this.inchatSoundRow = i2 + 20;
        this.inappPriorityRow = i2 + 21;
        this.callsSection2Row = i2 + 22;
        this.eventsSectionRow = i2 + 23;
        this.contactJoinedRow = i2 + 24;
        this.pinnedMessageRow = i2 + 25;
        this.otherSection2Row = i2 + 26;
        this.otherSectionRow = i2 + 27;
        this.notificationsServiceRow = i2 + 28;
        this.notificationsServiceConnectionRow = i2 + 29;
        this.androidAutoAlertRow = -1;
        this.repeatRow = i2 + 30;
        this.resetSection2Row = i2 + 31;
        this.resetSectionRow = i2 + 32;
        this.resetNotificationsRow = i2 + 33;
        this.rowCount = i2 + 35;
        this.resetNotificationsSectionRow = i2 + 34;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getMessagesController().reloadReactionsNotifySettings();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
    }
}
