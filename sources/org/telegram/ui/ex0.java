package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ex0 extends org.telegram.ui.Components.oj0 {
    public final Context f45392c;
    public final gx0 d;

    public ex0(gx0 gx0Var, Context context) {
        this.d = gx0Var;
        this.f45392c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int b10 = d1Var.b();
        gx0 gx0Var = this.d;
        if (b10 == gx0Var.F) {
            return gx0Var.f46138r;
        }
        if (d1Var.b() == gx0Var.X) {
            return true;
        }
        switch (d1Var.f57048f) {
            case 0:
            case 2:
            case 5:
            case 6:
                return false;
            case 1:
            case 3:
            case 4:
                return gx0Var.f46138r;
            default:
                return true;
        }
    }

    @Override
    public final int b() {
        return this.d.Z;
    }

    @Override
    public final int d(int i7) {
        gx0 gx0Var = this.d;
        if (i7 == gx0Var.f46141x || i7 == gx0Var.L || i7 == gx0Var.U || i7 == gx0Var.Q) {
            return 0;
        }
        if (i7 != gx0Var.G && i7 != gx0Var.H && i7 != gx0Var.J && i7 != gx0Var.I && i7 != gx0Var.R && i7 != gx0Var.S && i7 != gx0Var.X) {
            if (i7 != gx0Var.O && i7 != gx0Var.W && i7 != gx0Var.K && i7 != gx0Var.T) {
                if (i7 == gx0Var.V) {
                    return 3;
                }
                if (i7 != gx0Var.M && i7 != gx0Var.N) {
                    if (i7 == gx0Var.f46142y) {
                        return 5;
                    }
                    if (i7 != gx0Var.D && i7 != gx0Var.Y) {
                        if (i7 != gx0Var.E && i7 != gx0Var.F && i7 != gx0Var.P) {
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
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int i14;
        TLObject M0;
        int i15;
        boolean z9;
        int i16;
        gx0 gx0Var = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = gx0Var.f46135e;
        long j3 = gx0Var.h;
        long j10 = gx0Var.f46136f;
        int i17 = d1Var.f57048f;
        View view = d1Var.f57044a;
        boolean z10 = true;
        boolean z11 = false;
        switch (i17) {
            case 0:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 == gx0Var.f46141x) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131750475, null));
                    return;
                } else if (i7 == gx0Var.L) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131746640, null));
                    return;
                } else if (i7 == gx0Var.U) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131747905, null));
                    return;
                } else if (i7 == gx0Var.Q) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131743282, null));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                String v = org.telegram.messenger.dt.v(j10, j3, false);
                i10 = ((org.telegram.ui.ActionBar.f2) gx0Var).currentAccount;
                SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i10).f24764d7;
                if (i7 == gx0Var.X) {
                    w9Var.b(org.telegram.messenger.id.M0(2131746107, null), false);
                    org.telegram.ui.ActionBar.r6.V(w9Var.getTextView(), org.telegram.ui.ActionBar.k6.f28093q7, f6Var);
                    return;
                }
                org.telegram.ui.ActionBar.r6.V(w9Var.getTextView(), org.telegram.ui.ActionBar.k6.G6, f6Var);
                if (i7 == gx0Var.G) {
                    String string = sharedPreferences.getString(rf.b.i("sound_", v), org.telegram.messenger.id.M0(2131745283, null));
                    long j11 = sharedPreferences.getLong("sound_document_id_" + v, 0L);
                    if (j11 != 0) {
                        TLRPC.Document c10 = gx0Var.getMediaDataController().f25857z0.c(j11);
                        if (c10 == null) {
                            string = org.telegram.messenger.id.M0(2131751680, null);
                        } else {
                            string = sh0.g0(c10, c10.file_name_fixed);
                        }
                    } else if (string.equals("NoSound")) {
                        string = org.telegram.messenger.id.M0(2131748152, null);
                    } else if (string.equals("Default")) {
                        string = org.telegram.messenger.id.M0(2131745283, null);
                    }
                    w9Var.c(org.telegram.messenger.id.M0(2131745286, null), string, false, true);
                    return;
                } else if (i7 == gx0Var.R) {
                    String string2 = sharedPreferences.getString(rf.b.i("ringtone_", v), org.telegram.messenger.id.M0(2131751600, null));
                    if (string2.equals("NoSound")) {
                        string2 = org.telegram.messenger.id.M0(2131748152, null);
                    }
                    w9Var.c(org.telegram.messenger.id.M0(2131743244, null), string2, false, false);
                    return;
                } else if (i7 == gx0Var.H) {
                    int c11 = org.telegram.messenger.k5.c("vibrate_", v, sharedPreferences, 0);
                    if (c11 != 0 && c11 != 4) {
                        if (c11 == 1) {
                            String M02 = org.telegram.messenger.id.M0(2131743617, null);
                            String M03 = org.telegram.messenger.id.M0(2131745369, null);
                            if (gx0Var.I == -1 && gx0Var.J == -1) {
                                z10 = false;
                            }
                            w9Var.c(M02, M03, false, z10);
                            return;
                        } else if (c11 == 2) {
                            String M04 = org.telegram.messenger.id.M0(2131743617, null);
                            String M05 = org.telegram.messenger.id.M0(2131743615, null);
                            if (gx0Var.I == -1 && gx0Var.J == -1) {
                                z10 = false;
                            }
                            w9Var.c(M04, M05, false, z10);
                            return;
                        } else if (c11 == 3) {
                            String M06 = org.telegram.messenger.id.M0(2131743617, null);
                            String M07 = org.telegram.messenger.id.M0(2131748724, null);
                            if (gx0Var.I == -1 && gx0Var.J == -1) {
                                z10 = false;
                            }
                            w9Var.c(M06, M07, false, z10);
                            return;
                        } else {
                            return;
                        }
                    }
                    String M08 = org.telegram.messenger.id.M0(2131743617, null);
                    String M09 = org.telegram.messenger.id.M0(2131743616, null);
                    if (gx0Var.I == -1 && gx0Var.J == -1) {
                        z10 = false;
                    }
                    w9Var.c(M08, M09, false, z10);
                    return;
                } else if (i7 == gx0Var.J) {
                    int c12 = org.telegram.messenger.k5.c("priority_", v, sharedPreferences, 3);
                    if (c12 == 0) {
                        w9Var.c(org.telegram.messenger.id.M0(2131747907, null), org.telegram.messenger.id.M0(2131747884, null), false, false);
                        return;
                    } else if (c12 != 1 && c12 != 2) {
                        if (c12 == 3) {
                            w9Var.c(org.telegram.messenger.id.M0(2131747907, null), org.telegram.messenger.id.M0(2131747881, null), false, false);
                            return;
                        } else if (c12 == 4) {
                            w9Var.c(org.telegram.messenger.id.M0(2131747907, null), org.telegram.messenger.id.M0(2131747883, null), false, false);
                            return;
                        } else if (c12 == 5) {
                            w9Var.c(org.telegram.messenger.id.M0(2131747907, null), org.telegram.messenger.id.M0(2131747882, null), false, false);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        w9Var.c(org.telegram.messenger.id.M0(2131747907, null), org.telegram.messenger.id.M0(2131747880, null), false, false);
                        return;
                    }
                } else if (i7 == gx0Var.I) {
                    int c13 = org.telegram.messenger.k5.c("smart_max_count_", v, sharedPreferences, 2);
                    int c14 = org.telegram.messenger.k5.c("smart_delay_", v, sharedPreferences, 180);
                    if (c13 == 0) {
                        String M010 = org.telegram.messenger.id.M0(2131745303, null);
                        String M011 = org.telegram.messenger.id.M0(2131745302, null);
                        if (gx0Var.J == -1) {
                            z10 = false;
                        }
                        w9Var.c(M010, M011, false, z10);
                        return;
                    }
                    String G = org.telegram.messenger.id.G(c14 / 60, "Minutes", new Object[0]);
                    String M012 = org.telegram.messenger.id.M0(2131745303, null);
                    String a02 = org.telegram.messenger.id.a0("SmartNotificationsInfo", null, 2131745301, Integer.valueOf(c13), G);
                    if (gx0Var.J == -1) {
                        z10 = false;
                    }
                    w9Var.c(M012, a02, false, z10);
                    return;
                } else if (i7 == gx0Var.S) {
                    int c15 = org.telegram.messenger.k5.c("calls_vibrate_", v, sharedPreferences, 0);
                    if (c15 != 0 && c15 != 4) {
                        if (c15 == 1) {
                            w9Var.c(org.telegram.messenger.id.M0(2131743617, null), org.telegram.messenger.id.M0(2131745369, null), false, true);
                            return;
                        } else if (c15 == 2) {
                            w9Var.c(org.telegram.messenger.id.M0(2131743617, null), org.telegram.messenger.id.M0(2131743615, null), false, true);
                            return;
                        } else if (c15 == 3) {
                            w9Var.c(org.telegram.messenger.id.M0(2131743617, null), org.telegram.messenger.id.M0(2131748724, null), false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    w9Var.c(org.telegram.messenger.id.M0(2131743617, null), org.telegram.messenger.id.M0(2131743616, null), false, true);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.setFixedSize(0);
                if (i7 == gx0Var.O) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131746639, null));
                    return;
                } else if (i7 == gx0Var.W) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131747903, null));
                    return;
                } else if (i7 == gx0Var.K) {
                    if (gx0Var.J == -1) {
                        z8Var.setText("");
                        return;
                    } else {
                        z8Var.setText(org.telegram.messenger.id.M0(2131746870, null));
                        return;
                    }
                } else if (i7 == gx0Var.T) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131743247, null));
                    return;
                } else {
                    return;
                }
            case 3:
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                String v10 = org.telegram.messenger.dt.v(j10, j3, false);
                i11 = ((org.telegram.ui.ActionBar.f2) gx0Var).currentAccount;
                SharedPreferences sharedPreferences2 = org.telegram.messenger.qp.s1(i11).f24764d7;
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
                        if (org.telegram.ui.Cells.t8.f30540f[i18] == i12) {
                            i12 = org.telegram.ui.Cells.t8.f30539e[i18];
                        } else {
                            i18++;
                        }
                    }
                }
                t8Var.b(i12, org.telegram.messenger.id.M0(2131747904, null), false);
                return;
            case 4:
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                i13 = ((org.telegram.ui.ActionBar.f2) gx0Var).currentAccount;
                SharedPreferences sharedPreferences3 = org.telegram.messenger.qp.s1(i13).f24764d7;
                int c16 = org.telegram.messenger.k5.c("popup_", org.telegram.messenger.dt.v(j10, j3, false), sharedPreferences3, 0);
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
                if (i7 == gx0Var.M) {
                    String M013 = org.telegram.messenger.id.M0(2131747100, null);
                    if (c16 == 1) {
                        z11 = true;
                    }
                    i6Var.c(M013, z11, true);
                    i6Var.setTag(1);
                    return;
                } else if (i7 == gx0Var.N) {
                    String M014 = org.telegram.messenger.id.M0(2131747101, null);
                    if (c16 != 2) {
                        z10 = false;
                    }
                    i6Var.c(M014, z10, false);
                    i6Var.setTag(2);
                    return;
                } else {
                    return;
                }
            case 5:
                org.telegram.ui.Cells.oa oaVar = (org.telegram.ui.Cells.oa) view;
                if (org.telegram.messenger.m5.E(j10)) {
                    i15 = ((org.telegram.ui.ActionBar.f2) gx0Var).currentAccount;
                    M0 = org.telegram.messenger.qp.s1(i15).a2(Long.valueOf(j10));
                } else {
                    i14 = ((org.telegram.ui.ActionBar.f2) gx0Var).currentAccount;
                    M0 = org.telegram.messenger.qp.s1(i14).M0(Long.valueOf(-j10));
                }
                oaVar.a(null, M0);
                return;
            case 6:
                org.telegram.ui.Cells.y6 y6Var = (org.telegram.ui.Cells.y6) view;
                if (i7 > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i7 >= gx0Var.Z - 1) {
                    z10 = false;
                }
                if (y6Var.f30933c != z9 || y6Var.d != z10) {
                    y6Var.f30933c = z9;
                    y6Var.d = z10;
                    int i19 = y6Var.f30932b;
                    if (i19 == 0) {
                        y6Var.setBackground(null);
                        return;
                    } else {
                        y6Var.setBackgroundColor(i19);
                        return;
                    }
                }
                return;
            case 7:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                i16 = ((org.telegram.ui.ActionBar.f2) gx0Var).currentAccount;
                SharedPreferences sharedPreferences4 = org.telegram.messenger.qp.s1(i16).f24764d7;
                if (i7 == gx0Var.E) {
                    r8Var.f(org.telegram.messenger.id.M0(2131747925, null), gx0Var.f46138r, true);
                    return;
                } else if (i7 == gx0Var.F) {
                    String v11 = org.telegram.messenger.dt.v(j10, j3, false);
                    r8Var.f(org.telegram.messenger.id.M0(2131748538, null), sharedPreferences4.getBoolean("content_preview_" + v11, true), true);
                    return;
                } else if (i7 == gx0Var.P) {
                    String i20 = rf.b.i("stories_", org.telegram.messenger.dt.v(j10, j3, false));
                    if (gx0Var.f46131a0 || (sharedPreferences4.contains("EnableAllStories") && sharedPreferences4.getBoolean("EnableAllStories", true))) {
                        z11 = true;
                    }
                    r8Var.f(org.telegram.messenger.id.M0(2131744747, null), sharedPreferences4.getBoolean(i20, z11), true);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View n4Var;
        org.telegram.ui.ActionBar.f6 f6Var = this.d.f46135e;
        Context context = this.f45392c;
        switch (i7) {
            case 0:
                n4Var = new org.telegram.ui.Cells.n4(context, f6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, n4Var, f6Var);
                break;
            case 1:
                n4Var = new org.telegram.ui.Cells.w9(0, context, f6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, n4Var, f6Var);
                break;
            case 2:
                n4Var = new org.telegram.ui.Cells.z8(context, f6Var);
                break;
            case 3:
                n4Var = new org.telegram.ui.Cells.t8(context, f6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, n4Var, f6Var);
                break;
            case 4:
                n4Var = new org.telegram.ui.Cells.i6(context, f6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, n4Var, f6Var);
                break;
            case 5:
                n4Var = new org.telegram.ui.Cells.oa(context, f6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, n4Var, f6Var);
                break;
            case 6:
                n4Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            default:
                n4Var = new org.telegram.ui.Cells.r8(context, f6Var);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, n4Var, f6Var);
                break;
        }
        return jg.g.r(n4Var, n4Var, -1, -2);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        int i7 = d1Var.f57048f;
        View view = d1Var.f57044a;
        gx0 gx0Var = this.d;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 7) {
                                return;
                            }
                            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                            if (d1Var.b() == gx0Var.F) {
                                r8Var.e(null, gx0Var.f46138r);
                                return;
                            } else if (d1Var.b() == gx0Var.P) {
                                r8Var.e(null, gx0Var.f46138r);
                                return;
                            } else {
                                r8Var.e(null, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.i6) view).b(null, gx0Var.f46138r);
                        return;
                    }
                    ((org.telegram.ui.Cells.t8) view).a(null, gx0Var.f46138r);
                    return;
                }
                ((org.telegram.ui.Cells.z8) view).c(null, gx0Var.f46138r);
                return;
            }
            org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
            if (d1Var.b() == gx0Var.X) {
                w9Var.a(null, true);
                return;
            } else {
                w9Var.a(null, gx0Var.f46138r);
                return;
            }
        }
        ((org.telegram.ui.Cells.n4) view).a(null, gx0Var.f46138r);
    }
}
