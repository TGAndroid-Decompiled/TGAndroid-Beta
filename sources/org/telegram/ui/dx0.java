package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dx0 extends org.telegram.ui.Components.tj0 {
    public final Context f46490c;
    public final fx0 d;

    public dx0(fx0 fx0Var, Context context) {
        this.d = fx0Var;
        this.f46490c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int b10 = e1Var.b();
        fx0 fx0Var = this.d;
        if (b10 == fx0Var.G) {
            return fx0Var.f47217r;
        }
        if (e1Var.b() == fx0Var.Y) {
            return true;
        }
        switch (e1Var.f58539f) {
            case 0:
            case 2:
            case 5:
            case 6:
                return false;
            case 1:
            case 3:
            case 4:
                return fx0Var.f47217r;
            default:
                return true;
        }
    }

    @Override
    public final int b() {
        return this.d.f47209a0;
    }

    @Override
    public final int d(int i7) {
        fx0 fx0Var = this.d;
        if (i7 == fx0Var.f47220x || i7 == fx0Var.M || i7 == fx0Var.V || i7 == fx0Var.R) {
            return 0;
        }
        if (i7 != fx0Var.H && i7 != fx0Var.I && i7 != fx0Var.K && i7 != fx0Var.J && i7 != fx0Var.S && i7 != fx0Var.T && i7 != fx0Var.Y) {
            if (i7 != fx0Var.P && i7 != fx0Var.X && i7 != fx0Var.L && i7 != fx0Var.U) {
                if (i7 == fx0Var.W) {
                    return 3;
                }
                if (i7 != fx0Var.N && i7 != fx0Var.O) {
                    if (i7 == fx0Var.f47221y) {
                        return 5;
                    }
                    if (i7 != fx0Var.E && i7 != fx0Var.Z) {
                        if (i7 != fx0Var.F && i7 != fx0Var.G && i7 != fx0Var.Q) {
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
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int i14;
        TLObject M0;
        int i15;
        boolean z10;
        int i16;
        fx0 fx0Var = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = fx0Var.f47214e;
        long j3 = fx0Var.h;
        long j10 = fx0Var.f47215f;
        int i17 = e1Var.f58539f;
        View view = e1Var.f58535a;
        boolean z11 = true;
        boolean z12 = false;
        switch (i17) {
            case 0:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 == fx0Var.f47220x) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131750474, null));
                    return;
                } else if (i7 == fx0Var.M) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131746639, null));
                    return;
                } else if (i7 == fx0Var.V) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131747904, null));
                    return;
                } else if (i7 == fx0Var.R) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131743279, null));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                String v = org.telegram.messenger.at.v(j10, j3, false);
                i10 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
                SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(i10).f25273e7;
                if (i7 == fx0Var.Y) {
                    v9Var.b(org.telegram.messenger.hd.M0(2131746104, null), false);
                    org.telegram.ui.ActionBar.q6.U(v9Var.getTextView(), org.telegram.ui.ActionBar.j6.f29090q7, e6Var);
                    return;
                }
                org.telegram.ui.ActionBar.q6.U(v9Var.getTextView(), org.telegram.ui.ActionBar.j6.G6, e6Var);
                if (i7 == fx0Var.H) {
                    String string = sharedPreferences.getString(r.b.k("sound_", v), org.telegram.messenger.hd.M0(2131745280, null));
                    long j11 = sharedPreferences.getLong("sound_document_id_" + v, 0L);
                    if (j11 != 0) {
                        TLRPC.Document c10 = fx0Var.getMediaDataController().A0.c(j11);
                        if (c10 == null) {
                            string = org.telegram.messenger.hd.M0(2131751679, null);
                        } else {
                            string = uh0.g0(c10, c10.file_name_fixed);
                        }
                    } else if (string.equals("NoSound")) {
                        string = org.telegram.messenger.hd.M0(2131748151, null);
                    } else if (string.equals("Default")) {
                        string = org.telegram.messenger.hd.M0(2131745280, null);
                    }
                    v9Var.c(org.telegram.messenger.hd.M0(2131745283, null), string, false, true);
                    return;
                } else if (i7 == fx0Var.S) {
                    String string2 = sharedPreferences.getString(r.b.k("ringtone_", v), org.telegram.messenger.hd.M0(2131751599, null));
                    if (string2.equals("NoSound")) {
                        string2 = org.telegram.messenger.hd.M0(2131748151, null);
                    }
                    v9Var.c(org.telegram.messenger.hd.M0(2131743241, null), string2, false, false);
                    return;
                } else if (i7 == fx0Var.I) {
                    int c11 = org.telegram.messenger.k5.c("vibrate_", v, sharedPreferences, 0);
                    if (c11 != 0 && c11 != 4) {
                        if (c11 == 1) {
                            String M02 = org.telegram.messenger.hd.M0(2131743614, null);
                            String M03 = org.telegram.messenger.hd.M0(2131745366, null);
                            if (fx0Var.J == -1 && fx0Var.K == -1) {
                                z11 = false;
                            }
                            v9Var.c(M02, M03, false, z11);
                            return;
                        } else if (c11 == 2) {
                            String M04 = org.telegram.messenger.hd.M0(2131743614, null);
                            String M05 = org.telegram.messenger.hd.M0(2131743612, null);
                            if (fx0Var.J == -1 && fx0Var.K == -1) {
                                z11 = false;
                            }
                            v9Var.c(M04, M05, false, z11);
                            return;
                        } else if (c11 == 3) {
                            String M06 = org.telegram.messenger.hd.M0(2131743614, null);
                            String M07 = org.telegram.messenger.hd.M0(2131748723, null);
                            if (fx0Var.J == -1 && fx0Var.K == -1) {
                                z11 = false;
                            }
                            v9Var.c(M06, M07, false, z11);
                            return;
                        } else {
                            return;
                        }
                    }
                    String M08 = org.telegram.messenger.hd.M0(2131743614, null);
                    String M09 = org.telegram.messenger.hd.M0(2131743613, null);
                    if (fx0Var.J == -1 && fx0Var.K == -1) {
                        z11 = false;
                    }
                    v9Var.c(M08, M09, false, z11);
                    return;
                } else if (i7 == fx0Var.K) {
                    int c12 = org.telegram.messenger.k5.c("priority_", v, sharedPreferences, 3);
                    if (c12 == 0) {
                        v9Var.c(org.telegram.messenger.hd.M0(2131747906, null), org.telegram.messenger.hd.M0(2131747883, null), false, false);
                        return;
                    } else if (c12 != 1 && c12 != 2) {
                        if (c12 == 3) {
                            v9Var.c(org.telegram.messenger.hd.M0(2131747906, null), org.telegram.messenger.hd.M0(2131747880, null), false, false);
                            return;
                        } else if (c12 == 4) {
                            v9Var.c(org.telegram.messenger.hd.M0(2131747906, null), org.telegram.messenger.hd.M0(2131747882, null), false, false);
                            return;
                        } else if (c12 == 5) {
                            v9Var.c(org.telegram.messenger.hd.M0(2131747906, null), org.telegram.messenger.hd.M0(2131747881, null), false, false);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        v9Var.c(org.telegram.messenger.hd.M0(2131747906, null), org.telegram.messenger.hd.M0(2131747879, null), false, false);
                        return;
                    }
                } else if (i7 == fx0Var.J) {
                    int c13 = org.telegram.messenger.k5.c("smart_max_count_", v, sharedPreferences, 2);
                    int c14 = org.telegram.messenger.k5.c("smart_delay_", v, sharedPreferences, 180);
                    if (c13 == 0) {
                        String M010 = org.telegram.messenger.hd.M0(2131745300, null);
                        String M011 = org.telegram.messenger.hd.M0(2131745299, null);
                        if (fx0Var.K == -1) {
                            z11 = false;
                        }
                        v9Var.c(M010, M011, false, z11);
                        return;
                    }
                    String G = org.telegram.messenger.hd.G(c14 / 60, "Minutes", new Object[0]);
                    String M012 = org.telegram.messenger.hd.M0(2131745300, null);
                    String a02 = org.telegram.messenger.hd.a0("SmartNotificationsInfo", null, 2131745298, Integer.valueOf(c13), G);
                    if (fx0Var.K == -1) {
                        z11 = false;
                    }
                    v9Var.c(M012, a02, false, z11);
                    return;
                } else if (i7 == fx0Var.T) {
                    int c15 = org.telegram.messenger.k5.c("calls_vibrate_", v, sharedPreferences, 0);
                    if (c15 != 0 && c15 != 4) {
                        if (c15 == 1) {
                            v9Var.c(org.telegram.messenger.hd.M0(2131743614, null), org.telegram.messenger.hd.M0(2131745366, null), false, true);
                            return;
                        } else if (c15 == 2) {
                            v9Var.c(org.telegram.messenger.hd.M0(2131743614, null), org.telegram.messenger.hd.M0(2131743612, null), false, true);
                            return;
                        } else if (c15 == 3) {
                            v9Var.c(org.telegram.messenger.hd.M0(2131743614, null), org.telegram.messenger.hd.M0(2131748723, null), false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    v9Var.c(org.telegram.messenger.hd.M0(2131743614, null), org.telegram.messenger.hd.M0(2131743613, null), false, true);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                y8Var.setFixedSize(0);
                if (i7 == fx0Var.P) {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131746638, null));
                    return;
                } else if (i7 == fx0Var.X) {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131747902, null));
                    return;
                } else if (i7 == fx0Var.L) {
                    if (fx0Var.K == -1) {
                        y8Var.setText("");
                        return;
                    } else {
                        y8Var.setText(org.telegram.messenger.hd.M0(2131746869, null));
                        return;
                    }
                } else if (i7 == fx0Var.U) {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131743244, null));
                    return;
                } else {
                    return;
                }
            case 3:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                String v10 = org.telegram.messenger.at.v(j10, j3, false);
                i11 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
                SharedPreferences sharedPreferences2 = org.telegram.messenger.np.s1(i11).f25273e7;
                if (sharedPreferences2.contains("color_" + v10)) {
                    i12 = org.telegram.messenger.k5.c("color_", v10, sharedPreferences2, -16776961);
                } else if (org.telegram.messenger.m5.z(j10)) {
                    i12 = sharedPreferences2.getInt("GroupLed", -16776961);
                } else {
                    i12 = sharedPreferences2.getInt("MessagesLed", -16776961);
                }
                int i18 = 0;
                while (true) {
                    if (i18 < 9) {
                        if (org.telegram.ui.Cells.s8.f31430f[i18] == i12) {
                            i12 = org.telegram.ui.Cells.s8.f31429e[i18];
                        } else {
                            i18++;
                        }
                    }
                }
                s8Var.b(i12, org.telegram.messenger.hd.M0(2131747903, null), false);
                return;
            case 4:
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                i13 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
                SharedPreferences sharedPreferences3 = org.telegram.messenger.np.s1(i13).f25273e7;
                int c16 = org.telegram.messenger.k5.c("popup_", org.telegram.messenger.at.v(j10, j3, false), sharedPreferences3, 0);
                if (c16 == 0) {
                    if (org.telegram.messenger.m5.z(j10)) {
                        str = "popupGroup";
                    } else {
                        str = "popupAll";
                    }
                    if (sharedPreferences3.getInt(str, 0) != 0) {
                        c16 = 1;
                    } else {
                        c16 = 2;
                    }
                }
                if (i7 == fx0Var.N) {
                    String M013 = org.telegram.messenger.hd.M0(2131747099, null);
                    if (c16 == 1) {
                        z12 = true;
                    }
                    h6Var.c(M013, z12, true);
                    h6Var.setTag(1);
                    return;
                } else if (i7 == fx0Var.O) {
                    String M014 = org.telegram.messenger.hd.M0(2131747100, null);
                    if (c16 != 2) {
                        z11 = false;
                    }
                    h6Var.c(M014, z11, false);
                    h6Var.setTag(2);
                    return;
                } else {
                    return;
                }
            case 5:
                org.telegram.ui.Cells.oa oaVar = (org.telegram.ui.Cells.oa) view;
                if (org.telegram.messenger.m5.E(j10)) {
                    i15 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
                    M0 = org.telegram.messenger.np.s1(i15).a2(Long.valueOf(j10));
                } else {
                    i14 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
                    M0 = org.telegram.messenger.np.s1(i14).M0(Long.valueOf(-j10));
                }
                oaVar.a(null, M0);
                return;
            case 6:
                org.telegram.ui.Cells.x6 x6Var = (org.telegram.ui.Cells.x6) view;
                if (i7 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i7 >= fx0Var.f47209a0 - 1) {
                    z11 = false;
                }
                if (x6Var.f32042c != z10 || x6Var.d != z11) {
                    x6Var.f32042c = z10;
                    x6Var.d = z11;
                    int i19 = x6Var.f32041b;
                    if (i19 == 0) {
                        x6Var.setBackground(null);
                        return;
                    } else {
                        x6Var.setBackgroundColor(i19);
                        return;
                    }
                }
                return;
            case 7:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                i16 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
                SharedPreferences sharedPreferences4 = org.telegram.messenger.np.s1(i16).f25273e7;
                if (i7 == fx0Var.F) {
                    q8Var.f(org.telegram.messenger.hd.M0(2131747924, null), fx0Var.f47217r, true);
                    return;
                } else if (i7 == fx0Var.G) {
                    String v11 = org.telegram.messenger.at.v(j10, j3, false);
                    q8Var.f(org.telegram.messenger.hd.M0(2131748537, null), sharedPreferences4.getBoolean("content_preview_" + v11, true), true);
                    return;
                } else if (i7 == fx0Var.Q) {
                    String k10 = r.b.k("stories_", org.telegram.messenger.at.v(j10, j3, false));
                    if (fx0Var.f47211b0 || (sharedPreferences4.contains("EnableAllStories") && sharedPreferences4.getBoolean("EnableAllStories", true))) {
                        z12 = true;
                    }
                    q8Var.f(org.telegram.messenger.hd.M0(2131744744, null), sharedPreferences4.getBoolean(k10, z12), true);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View n4Var;
        org.telegram.ui.ActionBar.e6 e6Var = this.d.f47214e;
        Context context = this.f46490c;
        switch (i7) {
            case 0:
                n4Var = new org.telegram.ui.Cells.n4(context, e6Var);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, n4Var, e6Var);
                break;
            case 1:
                n4Var = new org.telegram.ui.Cells.v9(0, context, e6Var);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, n4Var, e6Var);
                break;
            case 2:
                n4Var = new org.telegram.ui.Cells.y8(context, e6Var);
                break;
            case 3:
                n4Var = new org.telegram.ui.Cells.s8(context, e6Var);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, n4Var, e6Var);
                break;
            case 4:
                n4Var = new org.telegram.ui.Cells.h6(context, e6Var);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, n4Var, e6Var);
                break;
            case 5:
                n4Var = new org.telegram.ui.Cells.oa(context, e6Var);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, n4Var, e6Var);
                break;
            case 6:
                n4Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
                break;
            default:
                n4Var = new org.telegram.ui.Cells.q8(context, e6Var);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, n4Var, e6Var);
                break;
        }
        return i5.c.q(n4Var, n4Var, -1, -2);
    }

    @Override
    public final void y(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        View view = e1Var.f58535a;
        fx0 fx0Var = this.d;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 7) {
                                return;
                            }
                            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                            if (e1Var.b() == fx0Var.G) {
                                q8Var.e(null, fx0Var.f47217r);
                                return;
                            } else if (e1Var.b() == fx0Var.Q) {
                                q8Var.e(null, fx0Var.f47217r);
                                return;
                            } else {
                                q8Var.e(null, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.h6) view).b(null, fx0Var.f47217r);
                        return;
                    }
                    ((org.telegram.ui.Cells.s8) view).a(null, fx0Var.f47217r);
                    return;
                }
                ((org.telegram.ui.Cells.y8) view).c(null, fx0Var.f47217r);
                return;
            }
            org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
            if (e1Var.b() == fx0Var.Y) {
                v9Var.a(null, true);
                return;
            } else {
                v9Var.a(null, fx0Var.f47217r);
                return;
            }
        }
        ((org.telegram.ui.Cells.n4) view).a(null, fx0Var.f47217r);
    }
}
