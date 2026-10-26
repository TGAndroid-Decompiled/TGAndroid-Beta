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
public final class f11 extends org.telegram.ui.Components.lm0 {
    public final Context f39238c;
    public final h11 d;

    public f11(h11 h11Var, Context context) {
        this.d = h11Var;
        this.f39238c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int b10 = e1Var.b();
        h11 h11Var = this.d;
        if (b10 == h11Var.F) {
            return h11Var.f39860r;
        }
        if (e1Var.b() == h11Var.X) {
            return true;
        }
        switch (e1Var.f47741f) {
            case 0:
            case 2:
            case 5:
            case 6:
                return false;
            case 1:
            case 3:
            case 4:
                return h11Var.f39860r;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        return this.d.Z;
    }

    @Override
    public final int j(int i10) {
        h11 h11Var = this.d;
        if (i10 == h11Var.f39862w || i10 == h11Var.L || i10 == h11Var.U || i10 == h11Var.Q) {
            return 0;
        }
        if (i10 != h11Var.G && i10 != h11Var.H && i10 != h11Var.J && i10 != h11Var.I && i10 != h11Var.R && i10 != h11Var.S && i10 != h11Var.X) {
            if (i10 != h11Var.O && i10 != h11Var.W && i10 != h11Var.K && i10 != h11Var.T) {
                if (i10 == h11Var.V) {
                    return 3;
                }
                if (i10 != h11Var.M && i10 != h11Var.N) {
                    if (i10 == h11Var.f39863x) {
                        return 5;
                    }
                    if (i10 != h11Var.f39864y && i10 != h11Var.Y) {
                        if (i10 != h11Var.E && i10 != h11Var.F && i10 != h11Var.P) {
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
    public final void v(s4.e1 e1Var, int i10) {
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
        h11 h11Var = this.d;
        org.telegram.ui.ActionBar.u6 u6Var = h11Var.e;
        long j10 = h11Var.h;
        long j11 = h11Var.f39858f;
        int i18 = e1Var.f47741f;
        View view = e1Var.f47738a;
        boolean z11 = true;
        boolean z12 = false;
        switch (i18) {
            case 0:
                org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                if (i10 == h11Var.f39862w) {
                    q4Var.setText(LocaleController.getString(R.string.General));
                    return;
                } else if (i10 == h11Var.L) {
                    q4Var.setText(LocaleController.getString(R.string.ProfilePopupNotification));
                    return;
                } else if (i10 == h11Var.U) {
                    q4Var.setText(LocaleController.getString(R.string.NotificationsLed));
                    return;
                } else if (i10 == h11Var.Q) {
                    q4Var.setText(LocaleController.getString(R.string.VoipNotificationSettings));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, j10);
                i11 = ((org.telegram.ui.ActionBar.r2) h11Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 == h11Var.X) {
                    gaVar.b(LocaleController.getString(R.string.ResetCustomNotifications), false);
                    org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), org.telegram.ui.ActionBar.y6.f23598q7, u6Var);
                    return;
                }
                org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), org.telegram.ui.ActionBar.y6.G6, u6Var);
                if (i10 == h11Var.G) {
                    String string = notificationsSettings.getString(org.telegram.ui.Components.b10.j("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                    long j12 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                    if (j12 != 0) {
                        TLRPC.Document c10 = h11Var.getMediaDataController().ringtoneDataStore.c(j12);
                        if (c10 == null) {
                            string = LocaleController.getString(R.string.CustomSound);
                        } else {
                            string = tk0.c0(c10, c10.file_name_fixed);
                        }
                    } else if (string.equals("NoSound")) {
                        string = LocaleController.getString(R.string.NoSound);
                    } else if (string.equals("Default")) {
                        string = LocaleController.getString(R.string.SoundDefault);
                    }
                    gaVar.c(LocaleController.getString(R.string.Sound), string, false, true);
                    return;
                } else if (i10 == h11Var.R) {
                    String string2 = notificationsSettings.getString(org.telegram.ui.Components.b10.j("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                    if (string2.equals("NoSound")) {
                        string2 = LocaleController.getString(R.string.NoSound);
                    }
                    gaVar.c(LocaleController.getString(R.string.VoipSettingsRingtone), string2, false, false);
                    return;
                } else if (i10 == h11Var.H) {
                    int d = org.telegram.messenger.t.d("vibrate_", sharedPrefKey, notificationsSettings, 0);
                    if (d != 0 && d != 4) {
                        if (d == 1) {
                            String string3 = LocaleController.getString(R.string.Vibrate);
                            String string4 = LocaleController.getString(R.string.Short);
                            if (h11Var.I == -1 && h11Var.J == -1) {
                                z11 = false;
                            }
                            gaVar.c(string3, string4, false, z11);
                            return;
                        } else if (d == 2) {
                            String string5 = LocaleController.getString(R.string.Vibrate);
                            String string6 = LocaleController.getString(R.string.VibrationDisabled);
                            if (h11Var.I == -1 && h11Var.J == -1) {
                                z11 = false;
                            }
                            gaVar.c(string5, string6, false, z11);
                            return;
                        } else if (d == 3) {
                            String string7 = LocaleController.getString(R.string.Vibrate);
                            String string8 = LocaleController.getString(R.string.Long);
                            if (h11Var.I == -1 && h11Var.J == -1) {
                                z11 = false;
                            }
                            gaVar.c(string7, string8, false, z11);
                            return;
                        } else {
                            return;
                        }
                    }
                    String string9 = LocaleController.getString(R.string.Vibrate);
                    String string10 = LocaleController.getString(R.string.VibrationDefault);
                    if (h11Var.I == -1 && h11Var.J == -1) {
                        z11 = false;
                    }
                    gaVar.c(string9, string10, false, z11);
                    return;
                } else if (i10 == h11Var.J) {
                    int d10 = org.telegram.messenger.t.d("priority_", sharedPrefKey, notificationsSettings, 3);
                    if (d10 == 0) {
                        gaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                        return;
                    } else if (d10 != 1 && d10 != 2) {
                        if (d10 == 3) {
                            gaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                            return;
                        } else if (d10 == 4) {
                            gaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                            return;
                        } else if (d10 == 5) {
                            gaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        gaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                        return;
                    }
                } else if (i10 == h11Var.I) {
                    int d11 = org.telegram.messenger.t.d("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                    int d12 = org.telegram.messenger.t.d("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                    if (d11 == 0) {
                        String string11 = LocaleController.getString(R.string.SmartNotifications);
                        String string12 = LocaleController.getString(R.string.SmartNotificationsDisabled);
                        if (h11Var.J == -1) {
                            z11 = false;
                        }
                        gaVar.c(string11, string12, false, z11);
                        return;
                    }
                    String formatPluralString = LocaleController.formatPluralString("Minutes", d12 / 60, new Object[0]);
                    String string13 = LocaleController.getString(R.string.SmartNotifications);
                    String formatString = LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(d11), formatPluralString);
                    if (h11Var.J == -1) {
                        z11 = false;
                    }
                    gaVar.c(string13, formatString, false, z11);
                    return;
                } else if (i10 == h11Var.S) {
                    int d13 = org.telegram.messenger.t.d("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                    if (d13 != 0 && d13 != 4) {
                        if (d13 == 1) {
                            gaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                            return;
                        } else if (d13 == 2) {
                            gaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                            return;
                        } else if (d13 == 3) {
                            gaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    gaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                i9Var.setFixedSize(0);
                if (i10 == h11Var.O) {
                    i9Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    return;
                } else if (i10 == h11Var.W) {
                    i9Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                    return;
                } else if (i10 == h11Var.K) {
                    if (h11Var.J == -1) {
                        i9Var.setText("");
                        return;
                    } else {
                        i9Var.setText(LocaleController.getString(R.string.PriorityInfo));
                        return;
                    }
                } else if (i10 == h11Var.T) {
                    i9Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j11, j10);
                i12 = ((org.telegram.ui.ActionBar.r2) h11Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i12);
                if (notificationsSettings2.contains("color_" + sharedPrefKey2)) {
                    i13 = org.telegram.messenger.t.d("color_", sharedPrefKey2, notificationsSettings2, -16776961);
                } else if (DialogObject.isChatDialog(j11)) {
                    i13 = notificationsSettings2.getInt("GroupLed", -16776961);
                } else {
                    i13 = notificationsSettings2.getInt("MessagesLed", -16776961);
                }
                int i19 = 0;
                while (true) {
                    if (i19 < 9) {
                        if (org.telegram.ui.Cells.c9.f23944f[i19] == i13) {
                            i13 = org.telegram.ui.Cells.c9.e[i19];
                        } else {
                            i19++;
                        }
                    }
                }
                c9Var.b(i13, LocaleController.getString(R.string.NotificationsLedColor), false);
                return;
            case 4:
                org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) view;
                i14 = ((org.telegram.ui.ActionBar.r2) h11Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i14);
                int d14 = org.telegram.messenger.t.d("popup_", NotificationsController.getSharedPrefKey(j11, j10), notificationsSettings3, 0);
                if (d14 == 0) {
                    if (DialogObject.isChatDialog(j11)) {
                        str = "popupGroup";
                    } else {
                        str = "popupAll";
                    }
                    if (notificationsSettings3.getInt(str, 0) != 0) {
                        d14 = 1;
                    } else {
                        d14 = 2;
                    }
                }
                if (i10 == h11Var.M) {
                    String string14 = LocaleController.getString(R.string.PopupEnabled);
                    if (d14 == 1) {
                        z12 = true;
                    }
                    o6Var.c(string14, z12, true);
                    o6Var.setTag(1);
                    return;
                } else if (i10 == h11Var.N) {
                    String string15 = LocaleController.getString(R.string.PopupDisabled);
                    if (d14 != 2) {
                        z11 = false;
                    }
                    o6Var.c(string15, z11, false);
                    o6Var.setTag(2);
                    return;
                } else {
                    return;
                }
            case 5:
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
                if (DialogObject.isUserDialog(j11)) {
                    i16 = ((org.telegram.ui.ActionBar.r2) h11Var).currentAccount;
                    chat = MessagesController.getInstance(i16).getUser(Long.valueOf(j11));
                } else {
                    i15 = ((org.telegram.ui.ActionBar.r2) h11Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getChat(Long.valueOf(-j11));
                }
                zaVar.a(chat, null);
                return;
            case 6:
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 >= h11Var.Z - 1) {
                    z11 = false;
                }
                if (f7Var.f24077c != z10 || f7Var.d != z11) {
                    f7Var.f24077c = z10;
                    f7Var.d = z11;
                    int i20 = f7Var.f24076b;
                    if (i20 == 0) {
                        f7Var.setBackground(null);
                        return;
                    } else {
                        f7Var.setBackgroundColor(i20);
                        return;
                    }
                }
                return;
            case 7:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                i17 = ((org.telegram.ui.ActionBar.r2) h11Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i17);
                if (i10 == h11Var.E) {
                    a9Var.f(LocaleController.getString(R.string.Notifications), h11Var.f39860r, true);
                    return;
                } else if (i10 == h11Var.F) {
                    String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j11, j10);
                    a9Var.f(LocaleController.getString(R.string.MessagePreview), notificationsSettings4.getBoolean("content_preview_" + sharedPrefKey3, true), true);
                    return;
                } else if (i10 == h11Var.P) {
                    String j13 = org.telegram.ui.Components.b10.j("stories_", NotificationsController.getSharedPrefKey(j11, j10));
                    if (h11Var.f39854a0 || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                        z12 = true;
                    }
                    a9Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(j13, z12), true);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View q4Var;
        org.telegram.ui.ActionBar.u6 u6Var = this.d.e;
        Context context = this.f39238c;
        switch (i10) {
            case 0:
                q4Var = new org.telegram.ui.Cells.q4(context, u6Var);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, q4Var, u6Var);
                break;
            case 1:
                q4Var = new org.telegram.ui.Cells.ga(context, 0, u6Var);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, q4Var, u6Var);
                break;
            case 2:
                q4Var = new org.telegram.ui.Cells.i9(context, u6Var);
                break;
            case 3:
                q4Var = new org.telegram.ui.Cells.c9(context, u6Var);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, q4Var, u6Var);
                break;
            case 4:
                q4Var = new org.telegram.ui.Cells.o6(context, u6Var);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, q4Var, u6Var);
                break;
            case 5:
                q4Var = new org.telegram.ui.Cells.za(context, u6Var);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, q4Var, u6Var);
                break;
            case 6:
                q4Var = new org.telegram.ui.Cells.f7(context, (d3) null);
                break;
            default:
                q4Var = new org.telegram.ui.Cells.a9(context, u6Var);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, q4Var, u6Var);
                break;
        }
        return ic.a.n(q4Var, q4Var, -1, -2);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        int i10 = e1Var.f47741f;
        View view = e1Var.f47738a;
        h11 h11Var = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 7) {
                                return;
                            }
                            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                            if (e1Var.b() == h11Var.F) {
                                a9Var.e(null, h11Var.f39860r);
                                return;
                            } else if (e1Var.b() == h11Var.P) {
                                a9Var.e(null, h11Var.f39860r);
                                return;
                            } else {
                                a9Var.e(null, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.o6) view).b(null, h11Var.f39860r);
                        return;
                    }
                    ((org.telegram.ui.Cells.c9) view).a(null, h11Var.f39860r);
                    return;
                }
                ((org.telegram.ui.Cells.i9) view).c(null, h11Var.f39860r);
                return;
            }
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
            if (e1Var.b() == h11Var.X) {
                gaVar.a(null, true);
                return;
            } else {
                gaVar.a(null, h11Var.f39860r);
                return;
            }
        }
        ((org.telegram.ui.Cells.q4) view).a(null, h11Var.f39860r);
    }
}
