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
public final class a21 extends org.telegram.ui.Components.lm0 {
    public final Context f33728c;
    public final c21 d;

    public a21(c21 c21Var, Context context) {
        this.d = c21Var;
        this.f33728c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        c21 c21Var = this.d;
        if (b10 == c21Var.E) {
            return c21Var.f34433n;
        }
        if (b1Var.b() == c21Var.W) {
            return true;
        }
        switch (b1Var.f44841f) {
            case 0:
            case 2:
            case 5:
            case 6:
                return false;
            case 1:
            case 3:
            case 4:
                return c21Var.f34433n;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        return this.d.Y;
    }

    @Override
    public final int j(int i10) {
        c21 c21Var = this.d;
        if (i10 == c21Var.v || i10 == c21Var.K || i10 == c21Var.T || i10 == c21Var.P) {
            return 0;
        }
        if (i10 != c21Var.F && i10 != c21Var.G && i10 != c21Var.I && i10 != c21Var.H && i10 != c21Var.Q && i10 != c21Var.R && i10 != c21Var.W) {
            if (i10 != c21Var.N && i10 != c21Var.V && i10 != c21Var.J && i10 != c21Var.S) {
                if (i10 == c21Var.U) {
                    return 3;
                }
                if (i10 != c21Var.L && i10 != c21Var.M) {
                    if (i10 == c21Var.f34436w) {
                        return 5;
                    }
                    if (i10 != c21Var.f34437x && i10 != c21Var.X) {
                        if (i10 != c21Var.f34438y && i10 != c21Var.E && i10 != c21Var.O) {
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
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        int i15;
        TLObject chat;
        int i16;
        boolean z10;
        int i17;
        c21 c21Var = this.d;
        long j10 = c21Var.f34432f;
        long j11 = c21Var.e;
        int i18 = b1Var.f44841f;
        View view = b1Var.f44838a;
        boolean z11 = true;
        boolean z12 = false;
        switch (i18) {
            case 0:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == c21Var.v) {
                    m4Var.setText(LocaleController.getString(R.string.General));
                    return;
                } else if (i10 == c21Var.K) {
                    m4Var.setText(LocaleController.getString(R.string.ProfilePopupNotification));
                    return;
                } else if (i10 == c21Var.T) {
                    m4Var.setText(LocaleController.getString(R.string.NotificationsLed));
                    return;
                } else if (i10 == c21Var.P) {
                    m4Var.setText(LocaleController.getString(R.string.VoipNotificationSettings));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, j10);
                i11 = ((org.telegram.ui.ActionBar.m2) c21Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 == c21Var.W) {
                    caVar.b(LocaleController.getString(R.string.ResetCustomNotifications), false);
                    caVar.setTextColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19839q7));
                    return;
                }
                caVar.setTextColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                if (i10 == c21Var.F) {
                    String string = notificationsSettings.getString(t8.b.h("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                    long j12 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                    if (j12 != 0) {
                        TLRPC.Document c10 = c21Var.getMediaDataController().ringtoneDataStore.c(j12);
                        if (c10 == null) {
                            string = LocaleController.getString(R.string.CustomSound);
                        } else {
                            string = el0.a0(c10, c10.file_name_fixed);
                        }
                    } else if (string.equals("NoSound")) {
                        string = LocaleController.getString(R.string.NoSound);
                    } else if (string.equals("Default")) {
                        string = LocaleController.getString(R.string.SoundDefault);
                    }
                    caVar.c(LocaleController.getString(R.string.Sound), string, false, true);
                    return;
                } else if (i10 == c21Var.Q) {
                    String string2 = notificationsSettings.getString(t8.b.h("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                    if (string2.equals("NoSound")) {
                        string2 = LocaleController.getString(R.string.NoSound);
                    }
                    caVar.c(LocaleController.getString(R.string.VoipSettingsRingtone), string2, false, false);
                    return;
                } else if (i10 == c21Var.G) {
                    int c11 = org.telegram.messenger.g0.c("vibrate_", sharedPrefKey, notificationsSettings, 0);
                    if (c11 != 0 && c11 != 4) {
                        if (c11 == 1) {
                            String string3 = LocaleController.getString(R.string.Vibrate);
                            String string4 = LocaleController.getString(R.string.Short);
                            if (c21Var.H == -1 && c21Var.I == -1) {
                                z11 = false;
                            }
                            caVar.c(string3, string4, false, z11);
                            return;
                        } else if (c11 == 2) {
                            String string5 = LocaleController.getString(R.string.Vibrate);
                            String string6 = LocaleController.getString(R.string.VibrationDisabled);
                            if (c21Var.H == -1 && c21Var.I == -1) {
                                z11 = false;
                            }
                            caVar.c(string5, string6, false, z11);
                            return;
                        } else if (c11 == 3) {
                            String string7 = LocaleController.getString(R.string.Vibrate);
                            String string8 = LocaleController.getString(R.string.Long);
                            if (c21Var.H == -1 && c21Var.I == -1) {
                                z11 = false;
                            }
                            caVar.c(string7, string8, false, z11);
                            return;
                        } else {
                            return;
                        }
                    }
                    String string9 = LocaleController.getString(R.string.Vibrate);
                    String string10 = LocaleController.getString(R.string.VibrationDefault);
                    if (c21Var.H == -1 && c21Var.I == -1) {
                        z11 = false;
                    }
                    caVar.c(string9, string10, false, z11);
                    return;
                } else if (i10 == c21Var.I) {
                    int c12 = org.telegram.messenger.g0.c("priority_", sharedPrefKey, notificationsSettings, 3);
                    if (c12 == 0) {
                        caVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                        return;
                    } else if (c12 != 1 && c12 != 2) {
                        if (c12 == 3) {
                            caVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                            return;
                        } else if (c12 == 4) {
                            caVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                            return;
                        } else if (c12 == 5) {
                            caVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        caVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                        return;
                    }
                } else if (i10 == c21Var.H) {
                    int c13 = org.telegram.messenger.g0.c("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                    int c14 = org.telegram.messenger.g0.c("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                    if (c13 == 0) {
                        String string11 = LocaleController.getString(R.string.SmartNotifications);
                        String string12 = LocaleController.getString(R.string.SmartNotificationsDisabled);
                        if (c21Var.I == -1) {
                            z11 = false;
                        }
                        caVar.c(string11, string12, false, z11);
                        return;
                    }
                    String formatPluralString = LocaleController.formatPluralString("Minutes", c14 / 60, new Object[0]);
                    String string13 = LocaleController.getString(R.string.SmartNotifications);
                    String formatString = LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(c13), formatPluralString);
                    if (c21Var.I == -1) {
                        z11 = false;
                    }
                    caVar.c(string13, formatString, false, z11);
                    return;
                } else if (i10 == c21Var.R) {
                    int c15 = org.telegram.messenger.g0.c("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                    if (c15 != 0 && c15 != 4) {
                        if (c15 == 1) {
                            caVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                            return;
                        } else if (c15 == 2) {
                            caVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                            return;
                        } else if (c15 == 3) {
                            caVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    caVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 == c21Var.N) {
                    e9Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    return;
                } else if (i10 == c21Var.V) {
                    e9Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                    return;
                } else if (i10 == c21Var.J) {
                    if (c21Var.I == -1) {
                        e9Var.setText("");
                        return;
                    } else {
                        e9Var.setText(LocaleController.getString(R.string.PriorityInfo));
                        return;
                    }
                } else if (i10 == c21Var.S) {
                    e9Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j11, j10);
                i12 = ((org.telegram.ui.ActionBar.m2) c21Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i12);
                if (notificationsSettings2.contains("color_" + sharedPrefKey2)) {
                    i13 = org.telegram.messenger.g0.c("color_", sharedPrefKey2, notificationsSettings2, -16776961);
                } else if (DialogObject.isChatDialog(j11)) {
                    i13 = notificationsSettings2.getInt("GroupLed", -16776961);
                } else {
                    i13 = notificationsSettings2.getInt("MessagesLed", -16776961);
                }
                int i19 = 0;
                while (true) {
                    if (i19 < 9) {
                        if (org.telegram.ui.Cells.y8.f22486f[i19] == i13) {
                            i13 = org.telegram.ui.Cells.y8.e[i19];
                        } else {
                            i19++;
                        }
                    }
                }
                y8Var.b(i13, LocaleController.getString(R.string.NotificationsLedColor), false);
                return;
            case 4:
                org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
                i14 = ((org.telegram.ui.ActionBar.m2) c21Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i14);
                int c16 = org.telegram.messenger.g0.c("popup_", NotificationsController.getSharedPrefKey(j11, j10), notificationsSettings3, 0);
                if (c16 == 0) {
                    if (DialogObject.isChatDialog(j11)) {
                        str = "popupGroup";
                    } else {
                        str = "popupAll";
                    }
                    if (notificationsSettings3.getInt(str, 0) != 0) {
                        c16 = 1;
                    } else {
                        c16 = 2;
                    }
                }
                if (i10 == c21Var.L) {
                    String string14 = LocaleController.getString(R.string.PopupEnabled);
                    if (c16 == 1) {
                        z12 = true;
                    }
                    k6Var.c(string14, z12, true);
                    k6Var.setTag(1);
                    return;
                } else if (i10 == c21Var.M) {
                    String string15 = LocaleController.getString(R.string.PopupDisabled);
                    if (c16 != 2) {
                        z11 = false;
                    }
                    k6Var.c(string15, z11, false);
                    k6Var.setTag(2);
                    return;
                } else {
                    return;
                }
            case 5:
                org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
                if (DialogObject.isUserDialog(j11)) {
                    i16 = ((org.telegram.ui.ActionBar.m2) c21Var).currentAccount;
                    chat = MessagesController.getInstance(i16).getUser(Long.valueOf(j11));
                } else {
                    i15 = ((org.telegram.ui.ActionBar.m2) c21Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getChat(Long.valueOf(-j11));
                }
                waVar.a(chat, null);
                return;
            case 6:
                org.telegram.ui.Cells.a7 a7Var = (org.telegram.ui.Cells.a7) view;
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 >= c21Var.Y - 1) {
                    z11 = false;
                }
                if (a7Var.f20616c != z10 || a7Var.d != z11) {
                    a7Var.f20616c = z10;
                    a7Var.d = z11;
                    int i20 = a7Var.f20615b;
                    if (i20 == 0) {
                        a7Var.setBackground(null);
                        return;
                    } else {
                        a7Var.setBackgroundColor(i20);
                        return;
                    }
                }
                return;
            case 7:
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                i17 = ((org.telegram.ui.ActionBar.m2) c21Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i17);
                if (i10 == c21Var.f34438y) {
                    w8Var.f(LocaleController.getString(R.string.Notifications), c21Var.f34433n, true);
                    return;
                } else if (i10 == c21Var.E) {
                    String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j11, j10);
                    w8Var.f(LocaleController.getString(R.string.MessagePreview), notificationsSettings4.getBoolean("content_preview_" + sharedPrefKey3, true), true);
                    return;
                } else if (i10 == c21Var.O) {
                    String h = t8.b.h("stories_", NotificationsController.getSharedPrefKey(j11, j10));
                    if (c21Var.Z || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                        z12 = true;
                    }
                    w8Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(h, z12), true);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        c21 c21Var = this.d;
        org.telegram.ui.ActionBar.c6 c6Var = c21Var.d;
        Context context = this.f33728c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(context, c6Var);
                m4Var.setBackgroundColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
                break;
            case 1:
                m4Var = new org.telegram.ui.Cells.ca(context, 0, c6Var);
                m4Var.setBackgroundColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.e9(context, c6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.y8(context, c6Var);
                m4Var.setBackgroundColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
                break;
            case 4:
                m4Var = new org.telegram.ui.Cells.k6(context, c6Var);
                m4Var.setBackgroundColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
                break;
            case 5:
                m4Var = new org.telegram.ui.Cells.wa(context, c6Var);
                m4Var.setBackgroundColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
                break;
            default:
                m4Var = new org.telegram.ui.Cells.w8(context, c6Var);
                m4Var.setBackgroundColor(c21Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(m4Var, m4Var, -1, -2);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        View view = b1Var.f44838a;
        c21 c21Var = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 7) {
                                return;
                            }
                            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                            if (b1Var.b() == c21Var.E) {
                                w8Var.e(null, c21Var.f34433n);
                                return;
                            } else if (b1Var.b() == c21Var.O) {
                                w8Var.e(null, c21Var.f34433n);
                                return;
                            } else {
                                w8Var.e(null, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.k6) view).b(null, c21Var.f34433n);
                        return;
                    }
                    ((org.telegram.ui.Cells.y8) view).a(null, c21Var.f34433n);
                    return;
                }
                ((org.telegram.ui.Cells.e9) view).c(null, c21Var.f34433n);
                return;
            }
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
            if (b1Var.b() == c21Var.W) {
                caVar.a(null, true);
                return;
            } else {
                caVar.a(null, c21Var.f34433n);
                return;
            }
        }
        ((org.telegram.ui.Cells.m4) view).a(null, c21Var.f34433n);
    }
}
