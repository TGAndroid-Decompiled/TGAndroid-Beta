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
public final class n11 extends org.telegram.ui.Components.ll0 {
    public final Context f35420c;
    public final p11 d;

    public n11(p11 p11Var, Context context) {
        this.d = p11Var;
        this.f35420c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        p11 p11Var = this.d;
        if (b10 == p11Var.E) {
            return p11Var.f36003n;
        }
        if (c1Var.b() == p11Var.W) {
            return true;
        }
        switch (c1Var.f42630f) {
            case 0:
            case 2:
            case 5:
            case 6:
                return false;
            case 1:
            case 3:
            case 4:
                return p11Var.f36003n;
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
        p11 p11Var = this.d;
        if (i10 == p11Var.v || i10 == p11Var.K || i10 == p11Var.T || i10 == p11Var.P) {
            return 0;
        }
        if (i10 != p11Var.F && i10 != p11Var.G && i10 != p11Var.I && i10 != p11Var.H && i10 != p11Var.Q && i10 != p11Var.R && i10 != p11Var.W) {
            if (i10 != p11Var.N && i10 != p11Var.V && i10 != p11Var.J && i10 != p11Var.S) {
                if (i10 == p11Var.U) {
                    return 3;
                }
                if (i10 != p11Var.L && i10 != p11Var.M) {
                    if (i10 == p11Var.f36006w) {
                        return 5;
                    }
                    if (i10 != p11Var.f36007x && i10 != p11Var.X) {
                        if (i10 != p11Var.f36008y && i10 != p11Var.E && i10 != p11Var.O) {
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
    public final void v(s4.c1 c1Var, int i10) {
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
        p11 p11Var = this.d;
        long j3 = p11Var.f36002f;
        long j10 = p11Var.e;
        int i18 = c1Var.f42630f;
        View view = c1Var.f42627a;
        boolean z11 = true;
        boolean z12 = false;
        switch (i18) {
            case 0:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == p11Var.v) {
                    m4Var.setText(LocaleController.getString(R.string.General));
                    return;
                } else if (i10 == p11Var.K) {
                    m4Var.setText(LocaleController.getString(R.string.ProfilePopupNotification));
                    return;
                } else if (i10 == p11Var.T) {
                    m4Var.setText(LocaleController.getString(R.string.NotificationsLed));
                    return;
                } else if (i10 == p11Var.P) {
                    m4Var.setText(LocaleController.getString(R.string.VoipNotificationSettings));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j3);
                i11 = ((org.telegram.ui.ActionBar.n2) p11Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 == p11Var.W) {
                    faVar.b(LocaleController.getString(R.string.ResetCustomNotifications), false);
                    faVar.setTextColor(p11Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19026q7));
                    return;
                }
                faVar.setTextColor(p11Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                if (i10 == p11Var.F) {
                    String string = notificationsSettings.getString(org.telegram.ui.Cells.q3.i("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                    long j11 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                    if (j11 != 0) {
                        TLRPC.Document c10 = p11Var.getMediaDataController().ringtoneDataStore.c(j11);
                        if (c10 == null) {
                            string = LocaleController.getString(R.string.CustomSound);
                        } else {
                            string = sk0.a0(c10, c10.file_name_fixed);
                        }
                    } else if (string.equals("NoSound")) {
                        string = LocaleController.getString(R.string.NoSound);
                    } else if (string.equals("Default")) {
                        string = LocaleController.getString(R.string.SoundDefault);
                    }
                    faVar.c(LocaleController.getString(R.string.Sound), string, false, true);
                    return;
                } else if (i10 == p11Var.Q) {
                    String string2 = notificationsSettings.getString(org.telegram.ui.Cells.q3.i("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                    if (string2.equals("NoSound")) {
                        string2 = LocaleController.getString(R.string.NoSound);
                    }
                    faVar.c(LocaleController.getString(R.string.VoipSettingsRingtone), string2, false, false);
                    return;
                } else if (i10 == p11Var.G) {
                    int c11 = org.telegram.messenger.z0.c("vibrate_", sharedPrefKey, notificationsSettings, 0);
                    if (c11 != 0 && c11 != 4) {
                        if (c11 == 1) {
                            String string3 = LocaleController.getString(R.string.Vibrate);
                            String string4 = LocaleController.getString(R.string.Short);
                            if (p11Var.H == -1 && p11Var.I == -1) {
                                z11 = false;
                            }
                            faVar.c(string3, string4, false, z11);
                            return;
                        } else if (c11 == 2) {
                            String string5 = LocaleController.getString(R.string.Vibrate);
                            String string6 = LocaleController.getString(R.string.VibrationDisabled);
                            if (p11Var.H == -1 && p11Var.I == -1) {
                                z11 = false;
                            }
                            faVar.c(string5, string6, false, z11);
                            return;
                        } else if (c11 == 3) {
                            String string7 = LocaleController.getString(R.string.Vibrate);
                            String string8 = LocaleController.getString(R.string.Long);
                            if (p11Var.H == -1 && p11Var.I == -1) {
                                z11 = false;
                            }
                            faVar.c(string7, string8, false, z11);
                            return;
                        } else {
                            return;
                        }
                    }
                    String string9 = LocaleController.getString(R.string.Vibrate);
                    String string10 = LocaleController.getString(R.string.VibrationDefault);
                    if (p11Var.H == -1 && p11Var.I == -1) {
                        z11 = false;
                    }
                    faVar.c(string9, string10, false, z11);
                    return;
                } else if (i10 == p11Var.I) {
                    int c12 = org.telegram.messenger.z0.c("priority_", sharedPrefKey, notificationsSettings, 3);
                    if (c12 == 0) {
                        faVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                        return;
                    } else if (c12 != 1 && c12 != 2) {
                        if (c12 == 3) {
                            faVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                            return;
                        } else if (c12 == 4) {
                            faVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                            return;
                        } else if (c12 == 5) {
                            faVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        faVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                        return;
                    }
                } else if (i10 == p11Var.H) {
                    int c13 = org.telegram.messenger.z0.c("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                    int c14 = org.telegram.messenger.z0.c("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                    if (c13 == 0) {
                        String string11 = LocaleController.getString(R.string.SmartNotifications);
                        String string12 = LocaleController.getString(R.string.SmartNotificationsDisabled);
                        if (p11Var.I == -1) {
                            z11 = false;
                        }
                        faVar.c(string11, string12, false, z11);
                        return;
                    }
                    String formatPluralString = LocaleController.formatPluralString("Minutes", c14 / 60, new Object[0]);
                    String string13 = LocaleController.getString(R.string.SmartNotifications);
                    String formatString = LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(c13), formatPluralString);
                    if (p11Var.I == -1) {
                        z11 = false;
                    }
                    faVar.c(string13, formatString, false, z11);
                    return;
                } else if (i10 == p11Var.R) {
                    int c15 = org.telegram.messenger.z0.c("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                    if (c15 != 0 && c15 != 4) {
                        if (c15 == 1) {
                            faVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                            return;
                        } else if (c15 == 2) {
                            faVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                            return;
                        } else if (c15 == 3) {
                            faVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    faVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                f9Var.setFixedSize(0);
                if (i10 == p11Var.N) {
                    f9Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    return;
                } else if (i10 == p11Var.V) {
                    f9Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                    return;
                } else if (i10 == p11Var.J) {
                    if (p11Var.I == -1) {
                        f9Var.setText("");
                        return;
                    } else {
                        f9Var.setText(LocaleController.getString(R.string.PriorityInfo));
                        return;
                    }
                } else if (i10 == p11Var.S) {
                    f9Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j10, j3);
                i12 = ((org.telegram.ui.ActionBar.n2) p11Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i12);
                if (notificationsSettings2.contains("color_" + sharedPrefKey2)) {
                    i13 = org.telegram.messenger.z0.c("color_", sharedPrefKey2, notificationsSettings2, -16776961);
                } else if (DialogObject.isChatDialog(j10)) {
                    i13 = notificationsSettings2.getInt("GroupLed", -16776961);
                } else {
                    i13 = notificationsSettings2.getInt("MessagesLed", -16776961);
                }
                int i19 = 0;
                while (true) {
                    if (i19 < 9) {
                        if (org.telegram.ui.Cells.z8.f21681f[i19] == i13) {
                            i13 = org.telegram.ui.Cells.z8.e[i19];
                        } else {
                            i19++;
                        }
                    }
                }
                z8Var.b(i13, LocaleController.getString(R.string.NotificationsLedColor), false);
                return;
            case 4:
                org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
                i14 = ((org.telegram.ui.ActionBar.n2) p11Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i14);
                int c16 = org.telegram.messenger.z0.c("popup_", NotificationsController.getSharedPrefKey(j10, j3), notificationsSettings3, 0);
                if (c16 == 0) {
                    if (DialogObject.isChatDialog(j10)) {
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
                if (i10 == p11Var.L) {
                    String string14 = LocaleController.getString(R.string.PopupEnabled);
                    if (c16 == 1) {
                        z12 = true;
                    }
                    k6Var.c(string14, z12, true);
                    k6Var.setTag(1);
                    return;
                } else if (i10 == p11Var.M) {
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
                org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
                if (DialogObject.isUserDialog(j10)) {
                    i16 = ((org.telegram.ui.ActionBar.n2) p11Var).currentAccount;
                    chat = MessagesController.getInstance(i16).getUser(Long.valueOf(j10));
                } else {
                    i15 = ((org.telegram.ui.ActionBar.n2) p11Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getChat(Long.valueOf(-j10));
                }
                abVar.a(chat, null);
                return;
            case 6:
                org.telegram.ui.Cells.a7 a7Var = (org.telegram.ui.Cells.a7) view;
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 >= p11Var.Y - 1) {
                    z11 = false;
                }
                if (a7Var.f19762c != z10 || a7Var.d != z11) {
                    a7Var.f19762c = z10;
                    a7Var.d = z11;
                    int i20 = a7Var.f19761b;
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
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                i17 = ((org.telegram.ui.ActionBar.n2) p11Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i17);
                if (i10 == p11Var.f36008y) {
                    x8Var.f(LocaleController.getString(R.string.Notifications), p11Var.f36003n, true);
                    return;
                } else if (i10 == p11Var.E) {
                    String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j10, j3);
                    String string16 = LocaleController.getString(R.string.MessagePreview);
                    x8Var.f(string16, notificationsSettings4.getBoolean("content_preview_" + sharedPrefKey3, true), true);
                    return;
                } else if (i10 == p11Var.O) {
                    String i21 = org.telegram.ui.Cells.q3.i("stories_", NotificationsController.getSharedPrefKey(j10, j3));
                    if (p11Var.Z || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                        z12 = true;
                    }
                    x8Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(i21, z12), true);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        p11 p11Var = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = p11Var.d;
        Context context = this.f35420c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(context, d6Var);
                m4Var.setBackgroundColor(p11Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                break;
            case 1:
                m4Var = new org.telegram.ui.Cells.fa(context, 0, d6Var);
                m4Var.setBackgroundColor(p11Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.f9(context, d6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.z8(context, d6Var);
                m4Var.setBackgroundColor(p11Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                break;
            case 4:
                m4Var = new org.telegram.ui.Cells.k6(context, d6Var);
                m4Var.setBackgroundColor(p11Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                break;
            case 5:
                m4Var = new org.telegram.ui.Cells.ab(context, d6Var);
                m4Var.setBackgroundColor(p11Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                break;
            default:
                m4Var = new org.telegram.ui.Cells.x8(context, d6Var);
                m4Var.setBackgroundColor(p11Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(m4Var, m4Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f42630f;
        View view = c1Var.f42627a;
        p11 p11Var = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 7) {
                                return;
                            }
                            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                            if (c1Var.b() == p11Var.E) {
                                x8Var.e(null, p11Var.f36003n);
                                return;
                            } else if (c1Var.b() == p11Var.O) {
                                x8Var.e(null, p11Var.f36003n);
                                return;
                            } else {
                                x8Var.e(null, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.k6) view).b(null, p11Var.f36003n);
                        return;
                    }
                    ((org.telegram.ui.Cells.z8) view).a(null, p11Var.f36003n);
                    return;
                }
                ((org.telegram.ui.Cells.f9) view).c(null, p11Var.f36003n);
                return;
            }
            org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view;
            if (c1Var.b() == p11Var.W) {
                faVar.a(null, true);
                return;
            } else {
                faVar.a(null, p11Var.f36003n);
                return;
            }
        }
        ((org.telegram.ui.Cells.m4) view).a(null, p11Var.f36003n);
    }
}
