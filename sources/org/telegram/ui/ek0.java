package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

public final class ek0 extends org.telegram.ui.Components.yk0 {

    public final Context f37783c;
    public final NotificationsSettingsActivity d;

    public ek0(NotificationsSettingsActivity notificationsSettingsActivity, Context context) {
        this.d = notificationsSettingsActivity;
        this.f37783c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int iB = o1Var.b();
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        return (iB == notificationsSettingsActivity.f35566x || iB == notificationsSettingsActivity.f35567y || iB == notificationsSettingsActivity.A || iB == notificationsSettingsActivity.G || iB == notificationsSettingsActivity.I || iB == notificationsSettingsActivity.O || iB == notificationsSettingsActivity.J || iB == notificationsSettingsActivity.H || iB == notificationsSettingsActivity.N || iB == notificationsSettingsActivity.B || iB == notificationsSettingsActivity.C || iB == notificationsSettingsActivity.K || iB == notificationsSettingsActivity.f35563r || iB == notificationsSettingsActivity.f35564s || iB == notificationsSettingsActivity.P || iB == notificationsSettingsActivity.F) ? false : true;
    }

    @Override
    public final int h() {
        return this.d.Q;
    }

    @Override
    public final int j(int i10) {
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        if (i10 == notificationsSettingsActivity.G || i10 == notificationsSettingsActivity.I || i10 == notificationsSettingsActivity.O || i10 == notificationsSettingsActivity.C || i10 == notificationsSettingsActivity.J || i10 == notificationsSettingsActivity.A || i10 == notificationsSettingsActivity.f35566x || i10 == notificationsSettingsActivity.f35563r) {
            return 0;
        }
        if (i10 == notificationsSettingsActivity.inappSoundRow || i10 == notificationsSettingsActivity.inappVibrateRow || i10 == notificationsSettingsActivity.f35565w || i10 == notificationsSettingsActivity.inappPreviewRow || i10 == notificationsSettingsActivity.contactJoinedRow || i10 == notificationsSettingsActivity.pinnedMessageRow || i10 == notificationsSettingsActivity.v || i10 == notificationsSettingsActivity.badgeNumberMutedRow || i10 == notificationsSettingsActivity.badgeNumberMessagesRow || i10 == notificationsSettingsActivity.badgeNumberShowRow || i10 == notificationsSettingsActivity.inappPriorityRow || i10 == notificationsSettingsActivity.inchatSoundRow || i10 == notificationsSettingsActivity.L || i10 == notificationsSettingsActivity.accountsAllRow) {
            return 1;
        }
        if (i10 == notificationsSettingsActivity.resetNotificationsRow) {
            return 2;
        }
        if (i10 == notificationsSettingsActivity.privateRow || i10 == notificationsSettingsActivity.groupRow || i10 == notificationsSettingsActivity.channelsRow || i10 == notificationsSettingsActivity.storiesRow || i10 == notificationsSettingsActivity.reactionsRow) {
            return 3;
        }
        if (i10 == notificationsSettingsActivity.F || i10 == notificationsSettingsActivity.f35567y || i10 == notificationsSettingsActivity.H || i10 == notificationsSettingsActivity.N || i10 == notificationsSettingsActivity.B || i10 == notificationsSettingsActivity.K || i10 == notificationsSettingsActivity.P) {
            return 4;
        }
        return i10 == notificationsSettingsActivity.f35564s ? 6 : 5;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        String string;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList2;
        boolean z10;
        int i14;
        StringBuilder sb2;
        boolean z11;
        boolean z12;
        String pluralString;
        int i15 = o1Var.f5793f;
        View view = o1Var.f5789a;
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        if (i15 == 0) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (i10 == notificationsSettingsActivity.f35566x) {
                j4Var.setText(LocaleController.getString("NotificationsForChats", R.string.NotificationsForChats));
                return;
            }
            if (i10 == notificationsSettingsActivity.A) {
                j4Var.setText(LocaleController.getString("InAppNotifications", R.string.InAppNotifications));
                return;
            }
            if (i10 == notificationsSettingsActivity.G) {
                j4Var.setText(LocaleController.getString("Events", R.string.Events));
                return;
            }
            if (i10 == notificationsSettingsActivity.I) {
                j4Var.setText(LocaleController.getString("NotificationsOther", R.string.NotificationsOther));
                return;
            }
            if (i10 == notificationsSettingsActivity.O) {
                j4Var.setText(LocaleController.getString("Reset", R.string.Reset));
                return;
            }
            if (i10 == notificationsSettingsActivity.C) {
                j4Var.setText(LocaleController.getString("VoipNotificationSettings", R.string.VoipNotificationSettings));
                return;
            } else if (i10 == notificationsSettingsActivity.J) {
                j4Var.setText(LocaleController.getString("BadgeNumber", R.string.BadgeNumber));
                return;
            } else {
                if (i10 == notificationsSettingsActivity.f35563r) {
                    j4Var.setText(LocaleController.getString("ShowNotificationsFor", R.string.ShowNotificationsFor));
                    return;
                }
                return;
            }
        }
        if (i15 == 1) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).currentAccount);
            if (i10 == notificationsSettingsActivity.inappSoundRow) {
                p8Var.f(LocaleController.getString(R.string.InAppSounds), notificationsSettings.getBoolean("EnableInAppSounds", true), true);
                return;
            }
            if (i10 == notificationsSettingsActivity.inappVibrateRow) {
                p8Var.f(LocaleController.getString(R.string.InAppVibrate), notificationsSettings.getBoolean("EnableInAppVibrate", true), true);
                return;
            }
            if (i10 == notificationsSettingsActivity.inappPreviewRow) {
                p8Var.f(LocaleController.getString(R.string.InAppPreview), notificationsSettings.getBoolean("EnableInAppPreview", true), true);
                return;
            }
            if (i10 == notificationsSettingsActivity.inappPriorityRow) {
                p8Var.g(LocaleController.getString(R.string.InAppPopup), LocaleController.getString(R.string.InAppPopupInfo), notificationsSettings.getBoolean("EnableInAppPopup", true), true, false);
                return;
            }
            if (i10 == notificationsSettingsActivity.contactJoinedRow) {
                p8Var.f(LocaleController.getString("ContactJoined", R.string.ContactJoined), notificationsSettings.getBoolean("EnableContactJoined", true), true);
                return;
            }
            if (i10 == notificationsSettingsActivity.pinnedMessageRow) {
                p8Var.f(LocaleController.getString("PinnedMessages", R.string.PinnedMessages), notificationsSettings.getBoolean("PinnedMessages", true), false);
                return;
            }
            if (i10 == notificationsSettingsActivity.L) {
                p8Var.f("Android Auto", notificationsSettings.getBoolean("EnableAutoNotifications", false), true);
                return;
            }
            if (i10 == notificationsSettingsActivity.v) {
                p8Var.g(LocaleController.getString("NotificationsService", R.string.NotificationsService), LocaleController.getString("NotificationsServiceInfo", R.string.NotificationsServiceInfo), notificationsSettings.getBoolean("pushService", notificationsSettingsActivity.getMessagesController().keepAliveService), true, true);
                return;
            }
            if (i10 == notificationsSettingsActivity.f35565w) {
                p8Var.g(LocaleController.getString("NotificationsServiceConnection", R.string.NotificationsServiceConnection), LocaleController.getString("NotificationsServiceConnectionInfo", R.string.NotificationsServiceConnectionInfo), notificationsSettings.getBoolean("pushConnection", notificationsSettingsActivity.getMessagesController().backgroundConnection), true, true);
                return;
            }
            if (i10 == notificationsSettingsActivity.badgeNumberShowRow) {
                p8Var.f(LocaleController.getString("BadgeNumberShow", R.string.BadgeNumberShow), notificationsSettingsActivity.getNotificationsController().showBadgeNumber, true);
                return;
            }
            if (i10 == notificationsSettingsActivity.badgeNumberMutedRow) {
                p8Var.f(LocaleController.getString("BadgeNumberMutedChats", R.string.BadgeNumberMutedChats), notificationsSettingsActivity.getNotificationsController().showBadgeMuted, true);
                return;
            }
            if (i10 == notificationsSettingsActivity.badgeNumberMessagesRow) {
                p8Var.f(LocaleController.getString("BadgeNumberUnread", R.string.BadgeNumberUnread), notificationsSettingsActivity.getNotificationsController().showBadgeMessages, false);
                return;
            }
            if (i10 == notificationsSettingsActivity.inchatSoundRow) {
                p8Var.f(LocaleController.getString("InChatSound", R.string.InChatSound), notificationsSettings.getBoolean("EnableInChatSound", true), true);
                return;
            } else if (i10 == notificationsSettingsActivity.D) {
                p8Var.f(LocaleController.getString("Vibrate", R.string.Vibrate), notificationsSettings.getBoolean("EnableCallVibrate", true), true);
                return;
            } else {
                if (i10 == notificationsSettingsActivity.accountsAllRow) {
                    p8Var.f(LocaleController.getString("AllAccounts", R.string.AllAccounts), MessagesController.getGlobalNotificationsSettings().getBoolean("AllAccounts", true), false);
                    return;
                }
                return;
            }
        }
        if (i15 == 2) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            w8Var.setMultilineDetail(true);
            if (i10 == notificationsSettingsActivity.resetNotificationsRow) {
                w8Var.a(LocaleController.getString("ResetAllNotifications", R.string.ResetAllNotifications), LocaleController.getString("UndoAllCustom", R.string.UndoAllCustom), false);
                return;
            }
            return;
        }
        if (i15 != 3) {
            if (i15 != 5) {
                if (i15 != 6) {
                    return;
                }
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                if (i10 == notificationsSettingsActivity.f35564s) {
                    x8Var.setText(LocaleController.getString("ShowNotificationsForInfo", R.string.ShowNotificationsForInfo));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).currentAccount);
            if (i10 == notificationsSettingsActivity.E) {
                String string2 = notificationsSettings2.getString("CallsRingtone", LocaleController.getString("DefaultRingtone", R.string.DefaultRingtone));
                if (string2.equals("NoSound")) {
                    string2 = LocaleController.getString("NoSound", R.string.NoSound);
                }
                x9Var.c(LocaleController.getString("VoipSettingsRingtone", R.string.VoipSettingsRingtone), string2, notificationsSettingsActivity.S, false);
                notificationsSettingsActivity.S = false;
                return;
            }
            if (i10 != notificationsSettingsActivity.D) {
                if (i10 == notificationsSettingsActivity.M) {
                    int i16 = notificationsSettings2.getInt("repeat_messages", 60);
                    if (i16 == 0) {
                        pluralString = LocaleController.getString("RepeatNotificationsNever", R.string.RepeatNotificationsNever);
                    } else {
                        pluralString = i16 < 60 ? LocaleController.formatPluralString("Minutes", i16, new Object[0]) : LocaleController.formatPluralString("Hours", i16 / 60, new Object[0]);
                    }
                    x9Var.c(LocaleController.getString("RepeatNotifications", R.string.RepeatNotifications), pluralString, notificationsSettingsActivity.T, false);
                    notificationsSettingsActivity.T = false;
                    return;
                }
                return;
            }
            int i17 = notificationsSettings2.getInt("vibrate_calls", 0);
            if (i17 == 0) {
                x9Var.c(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("VibrationDefault", R.string.VibrationDefault), notificationsSettingsActivity.R, true);
            } else if (i17 == 1) {
                x9Var.c(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("Short", R.string.Short), notificationsSettingsActivity.R, true);
            } else if (i17 == 2) {
                x9Var.c(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("VibrationDisabled", R.string.VibrationDisabled), notificationsSettingsActivity.R, true);
            } else if (i17 == 3) {
                x9Var.c(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("Long", R.string.Long), notificationsSettingsActivity.R, true);
            } else if (i17 == 4) {
                x9Var.c(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("OnlyIfSilent", R.string.OnlyIfSilent), notificationsSettingsActivity.R, true);
            }
            notificationsSettingsActivity.R = false;
            return;
        }
        org.telegram.ui.Cells.g5 g5Var = (org.telegram.ui.Cells.g5) view;
        SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).currentAccount);
        int currentTime = ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).currentAccount).getCurrentTime();
        ArrayList arrayList3 = null;
        if (i10 == notificationsSettingsActivity.privateRow) {
            string = LocaleController.getString(R.string.NotificationsPrivateChats);
            arrayList = notificationsSettingsActivity.d;
            i11 = notificationsSettings3.getInt("EnableAll2", 0);
            i12 = R.drawable.msg_openprofile;
        } else {
            if (i10 != notificationsSettingsActivity.groupRow) {
                if (i10 == notificationsSettingsActivity.storiesRow) {
                    string = LocaleController.getString(R.string.NotificationStories);
                    arrayList3 = notificationsSettingsActivity.h;
                    arrayList2 = notificationsSettingsActivity.f35562n;
                    i13 = notificationsSettings3.getBoolean("EnableAllStories", false) ? 0 : Integer.MAX_VALUE;
                    i12 = R.drawable.msg_menu_stories;
                } else if (i10 == notificationsSettingsActivity.reactionsRow) {
                    string = LocaleController.getString(R.string.NotificationReactions);
                    int i18 = (notificationsSettings3.getBoolean("EnableReactionsMessages", true) || notificationsSettings3.getBoolean("EnableReactionsStories", true)) ? 0 : Integer.MAX_VALUE;
                    i12 = R.drawable.msg_reactions;
                    i13 = i18;
                    arrayList2 = null;
                } else {
                    string = LocaleController.getString(R.string.NotificationsChannels);
                    arrayList = notificationsSettingsActivity.f35561f;
                    i11 = notificationsSettings3.getInt("EnableChannel2", 0);
                    i12 = R.drawable.msg_channel;
                }
                if (i13 < currentTime) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && i13 - 31536000 < currentTime) {
                    i14 = 2;
                } else {
                    i14 = 0;
                }
                sb2 = new StringBuilder();
                if (i10 == notificationsSettingsActivity.reactionsRow) {
                    if (arrayList3 == null && !arrayList3.isEmpty()) {
                        z10 = i13 < currentTime;
                        if (z10) {
                            sb2.append(LocaleController.getString("NotificationsOn", R.string.NotificationsOn));
                        } else if (i13 - 31536000 >= currentTime) {
                            sb2.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                        } else {
                            sb2.append(LocaleController.formatString("NotificationsOffUntil", R.string.NotificationsOffUntil, LocaleController.stringForMessageListDate(i13)));
                        }
                        if (sb2.length() != 0) {
                            sb2.append(", ");
                        }
                        int size = arrayList3.size();
                        if (i10 == notificationsSettingsActivity.storiesRow && !notificationsSettings3.contains("EnableAllStories") && arrayList2 != null) {
                            size += arrayList2.size();
                        }
                        sb2.append(LocaleController.formatPluralString("Exception", size, new Object[0]));
                    } else if (arrayList2 != null || arrayList2.isEmpty()) {
                        sb2.append(LocaleController.getString("TapToChange", R.string.TapToChange));
                    } else {
                        if (i13 > 0) {
                            sb2.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                        } else {
                            sb2.append(LocaleController.getString("NotificationsOn", R.string.NotificationsOn));
                        }
                        if (!arrayList2.isEmpty() && !notificationsSettings3.contains("EnableAllStories")) {
                            sb2.append(", ");
                            sb2.append(LocaleController.formatPluralString("AutoException", arrayList2.size(), new Object[0]));
                        }
                    }
                    z11 = z10;
                } else if (i13 > 0) {
                    sb2.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                    z11 = false;
                } else {
                    if (notificationsSettings3.getBoolean("EnableReactionsMessages", true)) {
                        sb2.append(LocaleController.getString(R.string.NotificationReactionsMessages));
                    }
                    if (notificationsSettings3.getBoolean("EnableReactionsStories", true)) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(LocaleController.getString(R.string.NotificationReactionsStories));
                    }
                    z11 = true;
                }
                if (i10 != notificationsSettingsActivity.reactionsRow) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                g5Var.b(string, sb2, i12, z11, i14, false, z12, false);
            }
            string = LocaleController.getString(R.string.NotificationsGroups);
            arrayList = notificationsSettingsActivity.f35560e;
            i11 = notificationsSettings3.getInt("EnableGroup2", 0);
            i12 = R.drawable.msg_groups;
        }
        int i19 = i11;
        arrayList2 = null;
        arrayList3 = arrayList;
        i13 = i19;
        if (i13 < currentTime) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i14 = 0;
        } else {
            i14 = 2;
        }
        sb2 = new StringBuilder();
        if (i10 == notificationsSettingsActivity.reactionsRow) {
            if (arrayList3 == null) {
                if (arrayList2 != null) {
                    sb2.append(LocaleController.getString("TapToChange", R.string.TapToChange));
                } else {
                    sb2.append(LocaleController.getString("TapToChange", R.string.TapToChange));
                }
            } else if (arrayList2 != null) {
                sb2.append(LocaleController.getString("TapToChange", R.string.TapToChange));
            } else {
                sb2.append(LocaleController.getString("TapToChange", R.string.TapToChange));
            }
            z11 = z10;
        } else if (i13 > 0) {
            sb2.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
            z11 = false;
        } else {
            if (notificationsSettings3.getBoolean("EnableReactionsMessages", true)) {
                sb2.append(LocaleController.getString(R.string.NotificationReactionsMessages));
            }
            if (notificationsSettings3.getBoolean("EnableReactionsStories", true)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(LocaleController.getString(R.string.NotificationReactionsStories));
            }
            z11 = true;
        }
        if (i10 != notificationsSettingsActivity.reactionsRow) {
            z12 = true;
        } else {
            z12 = false;
        }
        g5Var.b(string, sb2, i12, z11, i14, false, z12, false);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View j4Var;
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        Context context = this.f37783c;
        if (i10 == 0) {
            j4Var = new org.telegram.ui.Cells.j4(context, ((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).resourceProvider);
        } else if (i10 == 1) {
            j4Var = new org.telegram.ui.Cells.p8(context, ((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).resourceProvider);
        } else if (i10 == 2) {
            j4Var = new org.telegram.ui.Cells.w8(context);
        } else if (i10 == 3) {
            j4Var = new org.telegram.ui.Cells.g5(21, 64, this.f37783c, ((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).resourceProvider, true);
        } else if (i10 != 4) {
            j4Var = i10 != 5 ? new org.telegram.ui.Cells.x8(context, ((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).resourceProvider) : new org.telegram.ui.Cells.x9(context, 0, ((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).resourceProvider);
        } else {
            j4Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
        }
        return new org.telegram.ui.Components.lk0(j4Var);
    }
}
