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
public final class c11 extends org.telegram.ui.Components.rl0 {
    public final Context f33069c;
    public final e11 d;

    public c11(e11 e11Var, Context context) {
        this.d = e11Var;
        this.f33069c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int b10 = l1Var.b();
        e11 e11Var = this.d;
        if (b10 == e11Var.B) {
            return e11Var.f33855n;
        }
        if (l1Var.b() == e11Var.T) {
            return true;
        }
        switch (l1Var.f5788f) {
            case 0:
            case 2:
            case 5:
            case 6:
                return false;
            case 1:
            case 3:
            case 4:
                return e11Var.f33855n;
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
        e11 e11Var = this.d;
        if (i10 == e11Var.v || i10 == e11Var.H || i10 == e11Var.Q || i10 == e11Var.M) {
            return 0;
        }
        if (i10 != e11Var.C && i10 != e11Var.D && i10 != e11Var.F && i10 != e11Var.E && i10 != e11Var.N && i10 != e11Var.O && i10 != e11Var.T) {
            if (i10 != e11Var.K && i10 != e11Var.S && i10 != e11Var.G && i10 != e11Var.P) {
                if (i10 == e11Var.R) {
                    return 3;
                }
                if (i10 != e11Var.I && i10 != e11Var.J) {
                    if (i10 == e11Var.f33858w) {
                        return 5;
                    }
                    if (i10 != e11Var.f33859x && i10 != e11Var.U) {
                        if (i10 != e11Var.f33860y && i10 != e11Var.B && i10 != e11Var.L) {
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
        e11 e11Var = this.d;
        long j10 = e11Var.f33854f;
        long j11 = e11Var.e;
        int i18 = l1Var.f5788f;
        View view = l1Var.f5785a;
        boolean z10 = true;
        boolean z11 = false;
        switch (i18) {
            case 0:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == e11Var.v) {
                    m4Var.setText(LocaleController.getString(R.string.General));
                    return;
                } else if (i10 == e11Var.H) {
                    m4Var.setText(LocaleController.getString(R.string.ProfilePopupNotification));
                    return;
                } else if (i10 == e11Var.Q) {
                    m4Var.setText(LocaleController.getString(R.string.NotificationsLed));
                    return;
                } else if (i10 == e11Var.M) {
                    m4Var.setText(LocaleController.getString(R.string.VoipNotificationSettings));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, j10);
                i11 = ((org.telegram.ui.ActionBar.p2) e11Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 == e11Var.T) {
                    aaVar.b(LocaleController.getString(R.string.ResetCustomNotifications), false);
                    aaVar.setTextColor(e11Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20141q7));
                    return;
                }
                aaVar.setTextColor(e11Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                if (i10 == e11Var.C) {
                    String string = notificationsSettings.getString(vh.v2.e("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                    long j12 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                    if (j12 != 0) {
                        TLRPC.Document c3 = e11Var.getMediaDataController().ringtoneDataStore.c(j12);
                        if (c3 == null) {
                            string = LocaleController.getString(R.string.CustomSound);
                        } else {
                            string = ok0.a0(c3, c3.file_name_fixed);
                        }
                    } else if (string.equals("NoSound")) {
                        string = LocaleController.getString(R.string.NoSound);
                    } else if (string.equals("Default")) {
                        string = LocaleController.getString(R.string.SoundDefault);
                    }
                    aaVar.c(LocaleController.getString(R.string.Sound), string, false, true);
                    return;
                } else if (i10 == e11Var.N) {
                    String string2 = notificationsSettings.getString(vh.v2.e("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                    if (string2.equals("NoSound")) {
                        string2 = LocaleController.getString(R.string.NoSound);
                    }
                    aaVar.c(LocaleController.getString(R.string.VoipSettingsRingtone), string2, false, false);
                    return;
                } else if (i10 == e11Var.D) {
                    int c10 = org.telegram.messenger.y3.c("vibrate_", sharedPrefKey, notificationsSettings, 0);
                    if (c10 != 0 && c10 != 4) {
                        if (c10 == 1) {
                            String string3 = LocaleController.getString(R.string.Vibrate);
                            String string4 = LocaleController.getString(R.string.Short);
                            if (e11Var.E == -1 && e11Var.F == -1) {
                                z10 = false;
                            }
                            aaVar.c(string3, string4, false, z10);
                            return;
                        } else if (c10 == 2) {
                            String string5 = LocaleController.getString(R.string.Vibrate);
                            String string6 = LocaleController.getString(R.string.VibrationDisabled);
                            if (e11Var.E == -1 && e11Var.F == -1) {
                                z10 = false;
                            }
                            aaVar.c(string5, string6, false, z10);
                            return;
                        } else if (c10 == 3) {
                            String string7 = LocaleController.getString(R.string.Vibrate);
                            String string8 = LocaleController.getString(R.string.Long);
                            if (e11Var.E == -1 && e11Var.F == -1) {
                                z10 = false;
                            }
                            aaVar.c(string7, string8, false, z10);
                            return;
                        } else {
                            return;
                        }
                    }
                    String string9 = LocaleController.getString(R.string.Vibrate);
                    String string10 = LocaleController.getString(R.string.VibrationDefault);
                    if (e11Var.E == -1 && e11Var.F == -1) {
                        z10 = false;
                    }
                    aaVar.c(string9, string10, false, z10);
                    return;
                } else if (i10 == e11Var.F) {
                    int c11 = org.telegram.messenger.y3.c("priority_", sharedPrefKey, notificationsSettings, 3);
                    if (c11 == 0) {
                        aaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                        return;
                    } else if (c11 != 1 && c11 != 2) {
                        if (c11 == 3) {
                            aaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                            return;
                        } else if (c11 == 4) {
                            aaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                            return;
                        } else if (c11 == 5) {
                            aaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        aaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                        return;
                    }
                } else if (i10 == e11Var.E) {
                    int c12 = org.telegram.messenger.y3.c("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                    int c13 = org.telegram.messenger.y3.c("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                    if (c12 == 0) {
                        String string11 = LocaleController.getString(R.string.SmartNotifications);
                        String string12 = LocaleController.getString(R.string.SmartNotificationsDisabled);
                        if (e11Var.F == -1) {
                            z10 = false;
                        }
                        aaVar.c(string11, string12, false, z10);
                        return;
                    }
                    String formatPluralString = LocaleController.formatPluralString("Minutes", c13 / 60, new Object[0]);
                    String string13 = LocaleController.getString(R.string.SmartNotifications);
                    String formatString = LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(c12), formatPluralString);
                    if (e11Var.F == -1) {
                        z10 = false;
                    }
                    aaVar.c(string13, formatString, false, z10);
                    return;
                } else if (i10 == e11Var.O) {
                    int c14 = org.telegram.messenger.y3.c("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                    if (c14 != 0 && c14 != 4) {
                        if (c14 == 1) {
                            aaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                            return;
                        } else if (c14 == 2) {
                            aaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                            return;
                        } else if (c14 == 3) {
                            aaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    aaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                a9Var.setFixedSize(0);
                if (i10 == e11Var.K) {
                    a9Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    return;
                } else if (i10 == e11Var.S) {
                    a9Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                    return;
                } else if (i10 == e11Var.G) {
                    if (e11Var.F == -1) {
                        a9Var.setText("");
                        return;
                    } else {
                        a9Var.setText(LocaleController.getString(R.string.PriorityInfo));
                        return;
                    }
                } else if (i10 == e11Var.P) {
                    a9Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                org.telegram.ui.Cells.u8 u8Var = (org.telegram.ui.Cells.u8) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j11, j10);
                i12 = ((org.telegram.ui.ActionBar.p2) e11Var).currentAccount;
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
                        if (org.telegram.ui.Cells.u8.f22413f[i19] == i13) {
                            i13 = org.telegram.ui.Cells.u8.e[i19];
                        } else {
                            i19++;
                        }
                    }
                }
                u8Var.b(i13, LocaleController.getString(R.string.NotificationsLedColor), false);
                return;
            case 4:
                org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
                i14 = ((org.telegram.ui.ActionBar.p2) e11Var).currentAccount;
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
                if (i10 == e11Var.I) {
                    String string14 = LocaleController.getString(R.string.PopupEnabled);
                    if (c15 == 1) {
                        z11 = true;
                    }
                    j6Var.c(string14, z11, true);
                    j6Var.setTag(1);
                    return;
                } else if (i10 == e11Var.J) {
                    String string15 = LocaleController.getString(R.string.PopupDisabled);
                    if (c15 != 2) {
                        z10 = false;
                    }
                    j6Var.c(string15, z10, false);
                    j6Var.setTag(2);
                    return;
                } else {
                    return;
                }
            case 5:
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
                if (DialogObject.isUserDialog(j11)) {
                    i16 = ((org.telegram.ui.ActionBar.p2) e11Var).currentAccount;
                    chat = MessagesController.getInstance(i16).getUser(Long.valueOf(j11));
                } else {
                    i15 = ((org.telegram.ui.ActionBar.p2) e11Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getChat(Long.valueOf(-j11));
                }
                uaVar.a(chat, null);
                return;
            case 6:
                org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) view;
                if (i10 > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i10 >= e11Var.V - 1) {
                    z10 = false;
                }
                if (z6Var.f22661c != z4 || z6Var.d != z10) {
                    z6Var.f22661c = z4;
                    z6Var.d = z10;
                    int i20 = z6Var.f22660b;
                    if (i20 == 0) {
                        z6Var.setBackground(null);
                        return;
                    } else {
                        z6Var.setBackgroundColor(i20);
                        return;
                    }
                }
                return;
            case 7:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                i17 = ((org.telegram.ui.ActionBar.p2) e11Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i17);
                if (i10 == e11Var.f33860y) {
                    s8Var.f(LocaleController.getString(R.string.Notifications), e11Var.f33855n, true);
                    return;
                } else if (i10 == e11Var.B) {
                    String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j11, j10);
                    String string16 = LocaleController.getString(R.string.MessagePreview);
                    s8Var.f(string16, notificationsSettings4.getBoolean("content_preview_" + sharedPrefKey3, true), true);
                    return;
                } else if (i10 == e11Var.L) {
                    String e = vh.v2.e("stories_", NotificationsController.getSharedPrefKey(j11, j10));
                    if (e11Var.W || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                        z11 = true;
                    }
                    s8Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(e, z11), true);
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
        View m4Var;
        e11 e11Var = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = e11Var.d;
        Context context = this.f33069c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(context, f6Var);
                m4Var.setBackgroundColor(e11Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                break;
            case 1:
                m4Var = new org.telegram.ui.Cells.aa(context, 0, f6Var);
                m4Var.setBackgroundColor(e11Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.a9(context, f6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.u8(context, f6Var);
                m4Var.setBackgroundColor(e11Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                break;
            case 4:
                m4Var = new org.telegram.ui.Cells.j6(context, f6Var);
                m4Var.setBackgroundColor(e11Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                break;
            case 5:
                m4Var = new org.telegram.ui.Cells.ua(context, f6Var);
                m4Var.setBackgroundColor(e11Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            default:
                m4Var = new org.telegram.ui.Cells.s8(context, f6Var);
                m4Var.setBackgroundColor(e11Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                break;
        }
        return yh.o(m4Var, m4Var, -1, -2);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
        View view = l1Var.f5785a;
        e11 e11Var = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 7) {
                                return;
                            }
                            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                            if (l1Var.b() == e11Var.B) {
                                s8Var.e(null, e11Var.f33855n);
                                return;
                            } else if (l1Var.b() == e11Var.L) {
                                s8Var.e(null, e11Var.f33855n);
                                return;
                            } else {
                                s8Var.e(null, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.j6) view).b(null, e11Var.f33855n);
                        return;
                    }
                    ((org.telegram.ui.Cells.u8) view).a(null, e11Var.f33855n);
                    return;
                }
                ((org.telegram.ui.Cells.a9) view).c(null, e11Var.f33855n);
                return;
            }
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
            if (l1Var.b() == e11Var.T) {
                aaVar.a(null, true);
                return;
            } else {
                aaVar.a(null, e11Var.f33855n);
                return;
            }
        }
        ((org.telegram.ui.Cells.m4) view).a(null, e11Var.f33855n);
    }
}
