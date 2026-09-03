package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j11 extends org.telegram.ui.Components.ql0 {
    public final Context f35064c;
    public final l11 d;

    public j11(l11 l11Var, Context context) {
        this.d = l11Var;
        this.f35064c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int b10 = l1Var.b();
        l11 l11Var = this.d;
        if (b10 == l11Var.B) {
            return l11Var.f35622n;
        }
        if (l1Var.b() == l11Var.T) {
            return true;
        }
        switch (l1Var.f5777f) {
            case 0:
            case 2:
            case 5:
            case 6:
                return false;
            case 1:
            case 3:
            case 4:
                return l11Var.f35622n;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        return this.d.V;
    }

    @Override
    public final int j(int i10) {
        l11 l11Var = this.d;
        if (i10 == l11Var.v || i10 == l11Var.H || i10 == l11Var.Q || i10 == l11Var.M) {
            return 0;
        }
        if (i10 != l11Var.C && i10 != l11Var.D && i10 != l11Var.F && i10 != l11Var.E && i10 != l11Var.N && i10 != l11Var.O && i10 != l11Var.T) {
            if (i10 != l11Var.K && i10 != l11Var.S && i10 != l11Var.G && i10 != l11Var.P) {
                if (i10 == l11Var.R) {
                    return 3;
                }
                if (i10 != l11Var.I && i10 != l11Var.J) {
                    if (i10 == l11Var.f35625w) {
                        return 5;
                    }
                    if (i10 != l11Var.f35626x && i10 != l11Var.U) {
                        if (i10 != l11Var.f35627y && i10 != l11Var.B && i10 != l11Var.L) {
                            return 0;
                        }
                        return 7;
                    }
                    return 6;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        int i15;
        TLObject chat;
        int i16;
        boolean z4;
        int i17;
        l11 l11Var = this.d;
        long j10 = l11Var.f35621f;
        long j11 = l11Var.e;
        int i18 = l1Var.f5777f;
        View view = l1Var.f5774a;
        boolean z10 = true;
        boolean z11 = false;
        switch (i18) {
            case 0:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 == l11Var.v) {
                    l4Var.setText(LocaleController.getString(R.string.General));
                    return;
                } else if (i10 == l11Var.H) {
                    l4Var.setText(LocaleController.getString(R.string.ProfilePopupNotification));
                    return;
                } else if (i10 == l11Var.Q) {
                    l4Var.setText(LocaleController.getString(R.string.NotificationsLed));
                    return;
                } else if (i10 == l11Var.M) {
                    l4Var.setText(LocaleController.getString(R.string.VoipNotificationSettings));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, j10);
                i11 = ((org.telegram.ui.ActionBar.p2) l11Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 == l11Var.T) {
                    z9Var.b(LocaleController.getString(R.string.ResetCustomNotifications), false);
                    z9Var.setTextColor(l11Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20116q7));
                    return;
                }
                z9Var.setTextColor(l11Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                if (i10 == l11Var.C) {
                    String string = notificationsSettings.getString(vh.w2.e("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                    long j12 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                    if (j12 != 0) {
                        TLRPC.Document c3 = l11Var.getMediaDataController().ringtoneDataStore.c(j12);
                        if (c3 == null) {
                            string = LocaleController.getString(R.string.CustomSound);
                        } else {
                            string = qk0.a0(c3, c3.file_name_fixed);
                        }
                    } else if (string.equals("NoSound")) {
                        string = LocaleController.getString(R.string.NoSound);
                    } else if (string.equals("Default")) {
                        string = LocaleController.getString(R.string.SoundDefault);
                    }
                    z9Var.c(LocaleController.getString(R.string.Sound), string, false, true);
                    return;
                } else if (i10 == l11Var.N) {
                    String string2 = notificationsSettings.getString(vh.w2.e("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                    if (string2.equals("NoSound")) {
                        string2 = LocaleController.getString(R.string.NoSound);
                    }
                    z9Var.c(LocaleController.getString(R.string.VoipSettingsRingtone), string2, false, false);
                    return;
                } else if (i10 == l11Var.D) {
                    int c10 = org.telegram.messenger.y3.c("vibrate_", sharedPrefKey, notificationsSettings, 0);
                    if (c10 != 0 && c10 != 4) {
                        if (c10 == 1) {
                            String string3 = LocaleController.getString(R.string.Vibrate);
                            String string4 = LocaleController.getString(R.string.Short);
                            if (l11Var.E == -1 && l11Var.F == -1) {
                                z10 = false;
                            }
                            z9Var.c(string3, string4, false, z10);
                            return;
                        } else if (c10 == 2) {
                            String string5 = LocaleController.getString(R.string.Vibrate);
                            String string6 = LocaleController.getString(R.string.VibrationDisabled);
                            if (l11Var.E == -1 && l11Var.F == -1) {
                                z10 = false;
                            }
                            z9Var.c(string5, string6, false, z10);
                            return;
                        } else if (c10 == 3) {
                            String string7 = LocaleController.getString(R.string.Vibrate);
                            String string8 = LocaleController.getString(R.string.Long);
                            if (l11Var.E == -1 && l11Var.F == -1) {
                                z10 = false;
                            }
                            z9Var.c(string7, string8, false, z10);
                            return;
                        } else {
                            return;
                        }
                    }
                    String string9 = LocaleController.getString(R.string.Vibrate);
                    String string10 = LocaleController.getString(R.string.VibrationDefault);
                    if (l11Var.E == -1 && l11Var.F == -1) {
                        z10 = false;
                    }
                    z9Var.c(string9, string10, false, z10);
                    return;
                } else if (i10 == l11Var.F) {
                    int c11 = org.telegram.messenger.y3.c("priority_", sharedPrefKey, notificationsSettings, 3);
                    if (c11 == 0) {
                        z9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                        return;
                    } else if (c11 != 1 && c11 != 2) {
                        if (c11 == 3) {
                            z9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                            return;
                        } else if (c11 == 4) {
                            z9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                            return;
                        } else if (c11 == 5) {
                            z9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        z9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                        return;
                    }
                } else if (i10 == l11Var.E) {
                    int c12 = org.telegram.messenger.y3.c("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                    int c13 = org.telegram.messenger.y3.c("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                    if (c12 == 0) {
                        String string11 = LocaleController.getString(R.string.SmartNotifications);
                        String string12 = LocaleController.getString(R.string.SmartNotificationsDisabled);
                        if (l11Var.F == -1) {
                            z10 = false;
                        }
                        z9Var.c(string11, string12, false, z10);
                        return;
                    }
                    String formatPluralString = LocaleController.formatPluralString("Minutes", c13 / 60, new Object[0]);
                    String string13 = LocaleController.getString(R.string.SmartNotifications);
                    String formatString = LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(c12), formatPluralString);
                    if (l11Var.F == -1) {
                        z10 = false;
                    }
                    z9Var.c(string13, formatString, false, z10);
                    return;
                } else if (i10 == l11Var.O) {
                    int c14 = org.telegram.messenger.y3.c("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                    if (c14 != 0 && c14 != 4) {
                        if (c14 == 1) {
                            z9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                            return;
                        } else if (c14 == 2) {
                            z9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                            return;
                        } else if (c14 == 3) {
                            z9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    z9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.setFixedSize(0);
                if (i10 == l11Var.K) {
                    z8Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    return;
                } else if (i10 == l11Var.S) {
                    z8Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                    return;
                } else if (i10 == l11Var.G) {
                    if (l11Var.F == -1) {
                        z8Var.setText("");
                        return;
                    } else {
                        z8Var.setText(LocaleController.getString(R.string.PriorityInfo));
                        return;
                    }
                } else if (i10 == l11Var.P) {
                    z8Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j11, j10);
                i12 = ((org.telegram.ui.ActionBar.p2) l11Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i12);
                if (notificationsSettings2.contains("color_" + sharedPrefKey2)) {
                    i13 = org.telegram.messenger.y3.c("color_", sharedPrefKey2, notificationsSettings2, -16776961);
                } else if (DialogObject.isChatDialog(j11)) {
                    i13 = notificationsSettings2.getInt("GroupLed", -16776961);
                } else {
                    i13 = notificationsSettings2.getInt("MessagesLed", -16776961);
                }
                int i19 = 0;
                while (true) {
                    if (i19 < 9) {
                        if (org.telegram.ui.Cells.t8.f22347f[i19] == i13) {
                            i13 = org.telegram.ui.Cells.t8.e[i19];
                        } else {
                            i19++;
                        }
                    }
                }
                t8Var.b(i13, LocaleController.getString(R.string.NotificationsLedColor), false);
                return;
            case 4:
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                i14 = ((org.telegram.ui.ActionBar.p2) l11Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i14);
                int c15 = org.telegram.messenger.y3.c("popup_", NotificationsController.getSharedPrefKey(j11, j10), notificationsSettings3, 0);
                if (c15 == 0) {
                    if (DialogObject.isChatDialog(j11)) {
                        str = "popupGroup";
                    } else {
                        str = "popupAll";
                    }
                    if (notificationsSettings3.getInt(str, 0) != 0) {
                        c15 = 1;
                    } else {
                        c15 = 2;
                    }
                }
                if (i10 == l11Var.I) {
                    String string14 = LocaleController.getString(R.string.PopupEnabled);
                    if (c15 == 1) {
                        z11 = true;
                    }
                    i6Var.c(string14, z11, true);
                    i6Var.setTag(1);
                    return;
                } else if (i10 == l11Var.J) {
                    String string15 = LocaleController.getString(R.string.PopupDisabled);
                    if (c15 != 2) {
                        z10 = false;
                    }
                    i6Var.c(string15, z10, false);
                    i6Var.setTag(2);
                    return;
                } else {
                    return;
                }
            case 5:
                org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) view;
                if (DialogObject.isUserDialog(j11)) {
                    i16 = ((org.telegram.ui.ActionBar.p2) l11Var).currentAccount;
                    chat = MessagesController.getInstance(i16).getUser(Long.valueOf(j11));
                } else {
                    i15 = ((org.telegram.ui.ActionBar.p2) l11Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getChat(Long.valueOf(-j11));
                }
                taVar.a(chat, null);
                return;
            case 6:
                org.telegram.ui.Cells.y6 y6Var = (org.telegram.ui.Cells.y6) view;
                if (i10 > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i10 >= l11Var.V - 1) {
                    z10 = false;
                }
                if (y6Var.f22597c != z4 || y6Var.d != z10) {
                    y6Var.f22597c = z4;
                    y6Var.d = z10;
                    int i20 = y6Var.f22596b;
                    if (i20 == 0) {
                        y6Var.setBackground(null);
                        return;
                    } else {
                        y6Var.setBackgroundColor(i20);
                        return;
                    }
                }
                return;
            case 7:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                i17 = ((org.telegram.ui.ActionBar.p2) l11Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i17);
                if (i10 == l11Var.f35627y) {
                    r8Var.f(LocaleController.getString(R.string.Notifications), l11Var.f35622n, true);
                    return;
                } else if (i10 == l11Var.B) {
                    String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j11, j10);
                    String string16 = LocaleController.getString(R.string.MessagePreview);
                    r8Var.f(string16, notificationsSettings4.getBoolean("content_preview_" + sharedPrefKey3, true), true);
                    return;
                } else if (i10 == l11Var.L) {
                    String e = vh.w2.e("stories_", NotificationsController.getSharedPrefKey(j11, j10));
                    if (l11Var.W || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                        z11 = true;
                    }
                    r8Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(e, z11), true);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View l4Var;
        l11 l11Var = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = l11Var.d;
        Context context = this.f35064c;
        switch (i10) {
            case 0:
                l4Var = new org.telegram.ui.Cells.l4(context, f6Var);
                l4Var.setBackgroundColor(l11Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
                break;
            case 1:
                l4Var = new org.telegram.ui.Cells.z9(context, 0, f6Var);
                l4Var.setBackgroundColor(l11Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
                break;
            case 2:
                l4Var = new org.telegram.ui.Cells.z8(context, f6Var);
                break;
            case 3:
                l4Var = new org.telegram.ui.Cells.t8(context, f6Var);
                l4Var.setBackgroundColor(l11Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
                break;
            case 4:
                l4Var = new org.telegram.ui.Cells.i6(context, f6Var);
                l4Var.setBackgroundColor(l11Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
                break;
            case 5:
                l4Var = new org.telegram.ui.Cells.ta(context, f6Var);
                l4Var.setBackgroundColor(l11Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
                break;
            case 6:
                l4Var = new org.telegram.ui.Cells.y6(context, (b) null);
                break;
            default:
                l4Var = new org.telegram.ui.Cells.r8(context, f6Var);
                l4Var.setBackgroundColor(l11Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
                break;
        }
        return ai.n(l4Var, l4Var, -1, -2);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        View view = l1Var.f5774a;
        l11 l11Var = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 7) {
                                return;
                            }
                            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                            if (l1Var.b() == l11Var.B) {
                                r8Var.e(null, l11Var.f35622n);
                                return;
                            } else if (l1Var.b() == l11Var.L) {
                                r8Var.e(null, l11Var.f35622n);
                                return;
                            } else {
                                r8Var.e(null, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.i6) view).b(null, l11Var.f35622n);
                        return;
                    }
                    ((org.telegram.ui.Cells.t8) view).a(null, l11Var.f35622n);
                    return;
                }
                ((org.telegram.ui.Cells.z8) view).c(null, l11Var.f35622n);
                return;
            }
            org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view;
            if (l1Var.b() == l11Var.T) {
                z9Var.a(null, true);
                return;
            } else {
                z9Var.a(null, l11Var.f35622n);
                return;
            }
        }
        ((org.telegram.ui.Cells.l4) view).a(null, l11Var.f35622n);
    }
}
