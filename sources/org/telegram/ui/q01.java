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
public final class q01 extends org.telegram.ui.Components.vk0 {
    public final Context f41644c;
    public final s01 d;

    public q01(s01 s01Var, Context context) {
        this.d = s01Var;
        this.f41644c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int b10 = q1Var.b();
        s01 s01Var = this.d;
        if (b10 == s01Var.A) {
            return s01Var.f42524n;
        }
        if (q1Var.b() == s01Var.S) {
            return true;
        }
        switch (q1Var.f5505f) {
            case 0:
            case 2:
            case 5:
            case 6:
                return false;
            case 1:
            case 3:
            case 4:
                return s01Var.f42524n;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        return this.d.U;
    }

    @Override
    public final int j(int i9) {
        s01 s01Var = this.d;
        if (i9 == s01Var.v || i9 == s01Var.G || i9 == s01Var.P || i9 == s01Var.L) {
            return 0;
        }
        if (i9 != s01Var.B && i9 != s01Var.C && i9 != s01Var.E && i9 != s01Var.D && i9 != s01Var.M && i9 != s01Var.N && i9 != s01Var.S) {
            if (i9 != s01Var.J && i9 != s01Var.R && i9 != s01Var.F && i9 != s01Var.O) {
                if (i9 == s01Var.Q) {
                    return 3;
                }
                if (i9 != s01Var.H && i9 != s01Var.I) {
                    if (i9 == s01Var.f42527w) {
                        return 5;
                    }
                    if (i9 != s01Var.f42528x && i9 != s01Var.T) {
                        if (i9 != s01Var.f42529y && i9 != s01Var.A && i9 != s01Var.K) {
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
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int i14;
        TLObject chat;
        int i15;
        boolean z10;
        int i16;
        s01 s01Var = this.d;
        long j10 = s01Var.f42523f;
        long j11 = s01Var.f42522e;
        int i17 = q1Var.f5505f;
        View view = q1Var.f5501a;
        boolean z11 = true;
        boolean z12 = false;
        switch (i17) {
            case 0:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i9 == s01Var.v) {
                    m4Var.setText(LocaleController.getString(R.string.General));
                    return;
                } else if (i9 == s01Var.G) {
                    m4Var.setText(LocaleController.getString(R.string.ProfilePopupNotification));
                    return;
                } else if (i9 == s01Var.P) {
                    m4Var.setText(LocaleController.getString(R.string.NotificationsLed));
                    return;
                } else if (i9 == s01Var.L) {
                    m4Var.setText(LocaleController.getString(R.string.VoipNotificationSettings));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, j10);
                i10 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
                if (i9 == s01Var.S) {
                    baVar.b(LocaleController.getString(R.string.ResetCustomNotifications), false);
                    baVar.setTextColor(s01Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7));
                    return;
                }
                baVar.setTextColor(s01Var.getThemedColor(org.telegram.ui.ActionBar.f6.G6));
                if (i9 == s01Var.B) {
                    String string = notificationsSettings.getString(ta.b.d("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                    long j12 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                    if (j12 != 0) {
                        TLRPC.Document c10 = s01Var.getMediaDataController().ringtoneDataStore.c(j12);
                        if (c10 == null) {
                            string = LocaleController.getString(R.string.CustomSound);
                        } else {
                            string = kk0.Z(c10, c10.file_name_fixed);
                        }
                    } else if (string.equals("NoSound")) {
                        string = LocaleController.getString(R.string.NoSound);
                    } else if (string.equals("Default")) {
                        string = LocaleController.getString(R.string.SoundDefault);
                    }
                    baVar.c(LocaleController.getString(R.string.Sound), string, false, true);
                    return;
                } else if (i9 == s01Var.M) {
                    String string2 = notificationsSettings.getString(ta.b.d("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                    if (string2.equals("NoSound")) {
                        string2 = LocaleController.getString(R.string.NoSound);
                    }
                    baVar.c(LocaleController.getString(R.string.VoipSettingsRingtone), string2, false, false);
                    return;
                } else if (i9 == s01Var.C) {
                    int c11 = org.telegram.messenger.l0.c("vibrate_", sharedPrefKey, notificationsSettings, 0);
                    if (c11 != 0 && c11 != 4) {
                        if (c11 == 1) {
                            String string3 = LocaleController.getString(R.string.Vibrate);
                            String string4 = LocaleController.getString(R.string.Short);
                            if (s01Var.D == -1 && s01Var.E == -1) {
                                z11 = false;
                            }
                            baVar.c(string3, string4, false, z11);
                            return;
                        } else if (c11 == 2) {
                            String string5 = LocaleController.getString(R.string.Vibrate);
                            String string6 = LocaleController.getString(R.string.VibrationDisabled);
                            if (s01Var.D == -1 && s01Var.E == -1) {
                                z11 = false;
                            }
                            baVar.c(string5, string6, false, z11);
                            return;
                        } else if (c11 == 3) {
                            String string7 = LocaleController.getString(R.string.Vibrate);
                            String string8 = LocaleController.getString(R.string.Long);
                            if (s01Var.D == -1 && s01Var.E == -1) {
                                z11 = false;
                            }
                            baVar.c(string7, string8, false, z11);
                            return;
                        } else {
                            return;
                        }
                    }
                    String string9 = LocaleController.getString(R.string.Vibrate);
                    String string10 = LocaleController.getString(R.string.VibrationDefault);
                    if (s01Var.D == -1 && s01Var.E == -1) {
                        z11 = false;
                    }
                    baVar.c(string9, string10, false, z11);
                    return;
                } else if (i9 == s01Var.E) {
                    int c12 = org.telegram.messenger.l0.c("priority_", sharedPrefKey, notificationsSettings, 3);
                    if (c12 == 0) {
                        baVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                        return;
                    } else if (c12 != 1 && c12 != 2) {
                        if (c12 == 3) {
                            baVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                            return;
                        } else if (c12 == 4) {
                            baVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                            return;
                        } else if (c12 == 5) {
                            baVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        baVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                        return;
                    }
                } else if (i9 == s01Var.D) {
                    int c13 = org.telegram.messenger.l0.c("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                    int c14 = org.telegram.messenger.l0.c("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                    if (c13 == 0) {
                        String string11 = LocaleController.getString(R.string.SmartNotifications);
                        String string12 = LocaleController.getString(R.string.SmartNotificationsDisabled);
                        if (s01Var.E == -1) {
                            z11 = false;
                        }
                        baVar.c(string11, string12, false, z11);
                        return;
                    }
                    String formatPluralString = LocaleController.formatPluralString("Minutes", c14 / 60, new Object[0]);
                    String string13 = LocaleController.getString(R.string.SmartNotifications);
                    String formatString = LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(c13), formatPluralString);
                    if (s01Var.E == -1) {
                        z11 = false;
                    }
                    baVar.c(string13, formatString, false, z11);
                    return;
                } else if (i9 == s01Var.N) {
                    int c15 = org.telegram.messenger.l0.c("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                    if (c15 != 0 && c15 != 4) {
                        if (c15 == 1) {
                            baVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                            return;
                        } else if (c15 == 2) {
                            baVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                            return;
                        } else if (c15 == 3) {
                            baVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    baVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                b9Var.setFixedSize(0);
                if (i9 == s01Var.J) {
                    b9Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    return;
                } else if (i9 == s01Var.R) {
                    b9Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                    return;
                } else if (i9 == s01Var.F) {
                    if (s01Var.E == -1) {
                        b9Var.setText("");
                        return;
                    } else {
                        b9Var.setText(LocaleController.getString(R.string.PriorityInfo));
                        return;
                    }
                } else if (i9 == s01Var.O) {
                    b9Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j11, j10);
                i11 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i11);
                if (notificationsSettings2.contains("color_" + sharedPrefKey2)) {
                    i12 = org.telegram.messenger.l0.c("color_", sharedPrefKey2, notificationsSettings2, -16776961);
                } else if (DialogObject.isChatDialog(j11)) {
                    i12 = notificationsSettings2.getInt("GroupLed", -16776961);
                } else {
                    i12 = notificationsSettings2.getInt("MessagesLed", -16776961);
                }
                int i18 = 0;
                while (true) {
                    if (i18 < 9) {
                        if (org.telegram.ui.Cells.v8.f25800f[i18] == i12) {
                            i12 = org.telegram.ui.Cells.v8.f25799e[i18];
                        } else {
                            i18++;
                        }
                    }
                }
                v8Var.b(i12, LocaleController.getString(R.string.NotificationsLedColor), false);
                return;
            case 4:
                org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
                i13 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i13);
                int c16 = org.telegram.messenger.l0.c("popup_", NotificationsController.getSharedPrefKey(j11, j10), notificationsSettings3, 0);
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
                if (i9 == s01Var.H) {
                    String string14 = LocaleController.getString(R.string.PopupEnabled);
                    if (c16 == 1) {
                        z12 = true;
                    }
                    j6Var.c(string14, z12, true);
                    j6Var.setTag(1);
                    return;
                } else if (i9 == s01Var.I) {
                    String string15 = LocaleController.getString(R.string.PopupDisabled);
                    if (c16 != 2) {
                        z11 = false;
                    }
                    j6Var.c(string15, z11, false);
                    j6Var.setTag(2);
                    return;
                } else {
                    return;
                }
            case 5:
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
                if (DialogObject.isUserDialog(j11)) {
                    i15 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getUser(Long.valueOf(j11));
                } else {
                    i14 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
                    chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-j11));
                }
                uaVar.a(chat, null);
                return;
            case 6:
                org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) view;
                if (i9 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i9 >= s01Var.U - 1) {
                    z11 = false;
                }
                if (z6Var.f26034c != z10 || z6Var.d != z11) {
                    z6Var.f26034c = z10;
                    z6Var.d = z11;
                    int i19 = z6Var.f26033b;
                    if (i19 == 0) {
                        z6Var.setBackground(null);
                        return;
                    } else {
                        z6Var.setBackgroundColor(i19);
                        return;
                    }
                }
                return;
            case 7:
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                i16 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i16);
                if (i9 == s01Var.f42529y) {
                    t8Var.f(LocaleController.getString(R.string.Notifications), s01Var.f42524n, true);
                    return;
                } else if (i9 == s01Var.A) {
                    String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j11, j10);
                    String string16 = LocaleController.getString(R.string.MessagePreview);
                    t8Var.f(string16, notificationsSettings4.getBoolean("content_preview_" + sharedPrefKey3, true), true);
                    return;
                } else if (i9 == s01Var.K) {
                    String d = ta.b.d("stories_", NotificationsController.getSharedPrefKey(j11, j10));
                    if (s01Var.V || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                        z12 = true;
                    }
                    t8Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(d, z12), true);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View m4Var;
        s01 s01Var = this.d;
        org.telegram.ui.ActionBar.b6 b6Var = s01Var.d;
        Context context = this.f41644c;
        switch (i9) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(context, b6Var);
                m4Var.setBackgroundColor(s01Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                break;
            case 1:
                m4Var = new org.telegram.ui.Cells.ba(context, 0, b6Var);
                m4Var.setBackgroundColor(s01Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.b9(context, b6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.v8(context, b6Var);
                m4Var.setBackgroundColor(s01Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                break;
            case 4:
                m4Var = new org.telegram.ui.Cells.j6(context, b6Var);
                m4Var.setBackgroundColor(s01Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                break;
            case 5:
                m4Var = new org.telegram.ui.Cells.ua(context, b6Var);
                m4Var.setBackgroundColor(s01Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                break;
            default:
                m4Var = new org.telegram.ui.Cells.t8(context, b6Var);
                m4Var.setBackgroundColor(s01Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                break;
        }
        return j3.r0.s(m4Var, m4Var, -1, -2);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        View view = q1Var.f5501a;
        s01 s01Var = this.d;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 != 7) {
                                return;
                            }
                            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                            if (q1Var.b() == s01Var.A) {
                                t8Var.e(null, s01Var.f42524n);
                                return;
                            } else if (q1Var.b() == s01Var.K) {
                                t8Var.e(null, s01Var.f42524n);
                                return;
                            } else {
                                t8Var.e(null, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.j6) view).b(null, s01Var.f42524n);
                        return;
                    }
                    ((org.telegram.ui.Cells.v8) view).a(null, s01Var.f42524n);
                    return;
                }
                ((org.telegram.ui.Cells.b9) view).c(null, s01Var.f42524n);
                return;
            }
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
            if (q1Var.b() == s01Var.S) {
                baVar.a(null, true);
                return;
            } else {
                baVar.a(null, s01Var.f42524n);
                return;
            }
        }
        ((org.telegram.ui.Cells.m4) view).a(null, s01Var.f42524n);
    }
}
