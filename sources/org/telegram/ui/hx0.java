package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hx0 extends org.telegram.ui.Components.dk0 {
    public final Context f48539c;
    public final jx0 d;

    public hx0(jx0 jx0Var, Context context) {
        this.d = jx0Var;
        this.f48539c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int b10 = f1Var.b();
        jx0 jx0Var = this.d;
        if (b10 == jx0Var.G) {
            return jx0Var.f49126r;
        }
        if (f1Var.b() == jx0Var.Y) {
            return true;
        }
        switch (f1Var.f59165f) {
            case 0:
            case 2:
            case 5:
            case 6:
                return false;
            case 1:
            case 3:
            case 4:
                return jx0Var.f49126r;
            default:
                return true;
        }
    }

    @Override
    public final int b() {
        return this.d.f49118a0;
    }

    @Override
    public final int d(int i7) {
        jx0 jx0Var = this.d;
        if (i7 == jx0Var.f49129x || i7 == jx0Var.M || i7 == jx0Var.V || i7 == jx0Var.R) {
            return 0;
        }
        if (i7 != jx0Var.H && i7 != jx0Var.I && i7 != jx0Var.K && i7 != jx0Var.J && i7 != jx0Var.S && i7 != jx0Var.T && i7 != jx0Var.Y) {
            if (i7 != jx0Var.P && i7 != jx0Var.X && i7 != jx0Var.L && i7 != jx0Var.U) {
                if (i7 == jx0Var.W) {
                    return 3;
                }
                if (i7 != jx0Var.N && i7 != jx0Var.O) {
                    if (i7 == jx0Var.f49130y) {
                        return 5;
                    }
                    if (i7 != jx0Var.E && i7 != jx0Var.Z) {
                        if (i7 != jx0Var.F && i7 != jx0Var.G && i7 != jx0Var.Q) {
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
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int i14;
        TLObject O0;
        int i15;
        boolean z10;
        int i16;
        jx0 jx0Var = this.d;
        org.telegram.ui.ActionBar.h6 h6Var = jx0Var.f49123e;
        long j3 = jx0Var.h;
        long j10 = jx0Var.f49124f;
        int i17 = f1Var.f59165f;
        View view = f1Var.f59161a;
        boolean z11 = true;
        boolean z12 = false;
        switch (i17) {
            case 0:
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                if (i7 == jx0Var.f49129x) {
                    o4Var.setText(org.telegram.messenger.gd.N0(2131750457, null));
                    return;
                } else if (i7 == jx0Var.M) {
                    o4Var.setText(org.telegram.messenger.gd.N0(2131746443, null));
                    return;
                } else if (i7 == jx0Var.V) {
                    o4Var.setText(org.telegram.messenger.gd.N0(2131747710, null));
                    return;
                } else if (i7 == jx0Var.R) {
                    o4Var.setText(org.telegram.messenger.gd.N0(2131743036, null));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                String v = org.telegram.messenger.xs.v(j10, j3, false);
                i10 = ((org.telegram.ui.ActionBar.g2) jx0Var).currentAccount;
                SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i10).f25686g7;
                if (i7 == jx0Var.Y) {
                    x9Var.b(org.telegram.messenger.gd.N0(2131745908, null), false);
                    org.telegram.ui.ActionBar.t6.U(x9Var.getTextView(), org.telegram.ui.ActionBar.m6.f29619q7, h6Var);
                    return;
                }
                org.telegram.ui.ActionBar.t6.U(x9Var.getTextView(), org.telegram.ui.ActionBar.m6.G6, h6Var);
                if (i7 == jx0Var.H) {
                    String string = sharedPreferences.getString(p5.c.k("sound_", v), org.telegram.messenger.gd.N0(2131745084, null));
                    long j11 = sharedPreferences.getLong("sound_document_id_" + v, 0L);
                    if (j11 != 0) {
                        TLRPC.Document c10 = jx0Var.getMediaDataController().A0.c(j11);
                        if (c10 == null) {
                            string = org.telegram.messenger.gd.N0(2131751667, null);
                        } else {
                            string = yh0.g0(c10, c10.file_name_fixed);
                        }
                    } else if (string.equals("NoSound")) {
                        string = org.telegram.messenger.gd.N0(2131747958, null);
                    } else if (string.equals("Default")) {
                        string = org.telegram.messenger.gd.N0(2131745084, null);
                    }
                    x9Var.c(org.telegram.messenger.gd.N0(2131745087, null), string, false, true);
                    return;
                } else if (i7 == jx0Var.S) {
                    String string2 = sharedPreferences.getString(p5.c.k("ringtone_", v), org.telegram.messenger.gd.N0(2131751587, null));
                    if (string2.equals("NoSound")) {
                        string2 = org.telegram.messenger.gd.N0(2131747958, null);
                    }
                    x9Var.c(org.telegram.messenger.gd.N0(2131742998, null), string2, false, false);
                    return;
                } else if (i7 == jx0Var.I) {
                    int c11 = org.telegram.messenger.f3.c("vibrate_", v, sharedPreferences, 0);
                    if (c11 != 0 && c11 != 4) {
                        if (c11 == 1) {
                            String N0 = org.telegram.messenger.gd.N0(2131743371, null);
                            String N02 = org.telegram.messenger.gd.N0(2131745170, null);
                            if (jx0Var.J == -1 && jx0Var.K == -1) {
                                z11 = false;
                            }
                            x9Var.c(N0, N02, false, z11);
                            return;
                        } else if (c11 == 2) {
                            String N03 = org.telegram.messenger.gd.N0(2131743371, null);
                            String N04 = org.telegram.messenger.gd.N0(2131743369, null);
                            if (jx0Var.J == -1 && jx0Var.K == -1) {
                                z11 = false;
                            }
                            x9Var.c(N03, N04, false, z11);
                            return;
                        } else if (c11 == 3) {
                            String N05 = org.telegram.messenger.gd.N0(2131743371, null);
                            String N06 = org.telegram.messenger.gd.N0(2131748530, null);
                            if (jx0Var.J == -1 && jx0Var.K == -1) {
                                z11 = false;
                            }
                            x9Var.c(N05, N06, false, z11);
                            return;
                        } else {
                            return;
                        }
                    }
                    String N07 = org.telegram.messenger.gd.N0(2131743371, null);
                    String N08 = org.telegram.messenger.gd.N0(2131743370, null);
                    if (jx0Var.J == -1 && jx0Var.K == -1) {
                        z11 = false;
                    }
                    x9Var.c(N07, N08, false, z11);
                    return;
                } else if (i7 == jx0Var.K) {
                    int c12 = org.telegram.messenger.f3.c("priority_", v, sharedPreferences, 3);
                    if (c12 == 0) {
                        x9Var.c(org.telegram.messenger.gd.N0(2131747712, null), org.telegram.messenger.gd.N0(2131747689, null), false, false);
                        return;
                    } else if (c12 != 1 && c12 != 2) {
                        if (c12 == 3) {
                            x9Var.c(org.telegram.messenger.gd.N0(2131747712, null), org.telegram.messenger.gd.N0(2131747686, null), false, false);
                            return;
                        } else if (c12 == 4) {
                            x9Var.c(org.telegram.messenger.gd.N0(2131747712, null), org.telegram.messenger.gd.N0(2131747688, null), false, false);
                            return;
                        } else if (c12 == 5) {
                            x9Var.c(org.telegram.messenger.gd.N0(2131747712, null), org.telegram.messenger.gd.N0(2131747687, null), false, false);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        x9Var.c(org.telegram.messenger.gd.N0(2131747712, null), org.telegram.messenger.gd.N0(2131747685, null), false, false);
                        return;
                    }
                } else if (i7 == jx0Var.J) {
                    int c13 = org.telegram.messenger.f3.c("smart_max_count_", v, sharedPreferences, 2);
                    int c14 = org.telegram.messenger.f3.c("smart_delay_", v, sharedPreferences, 180);
                    if (c13 == 0) {
                        String N09 = org.telegram.messenger.gd.N0(2131745104, null);
                        String N010 = org.telegram.messenger.gd.N0(2131745103, null);
                        if (jx0Var.K == -1) {
                            z11 = false;
                        }
                        x9Var.c(N09, N010, false, z11);
                        return;
                    }
                    String G = org.telegram.messenger.gd.G(c14 / 60, "Minutes", new Object[0]);
                    String N011 = org.telegram.messenger.gd.N0(2131745104, null);
                    String a02 = org.telegram.messenger.gd.a0("SmartNotificationsInfo", null, 2131745102, Integer.valueOf(c13), G);
                    if (jx0Var.K == -1) {
                        z11 = false;
                    }
                    x9Var.c(N011, a02, false, z11);
                    return;
                } else if (i7 == jx0Var.T) {
                    int c15 = org.telegram.messenger.f3.c("calls_vibrate_", v, sharedPreferences, 0);
                    if (c15 != 0 && c15 != 4) {
                        if (c15 == 1) {
                            x9Var.c(org.telegram.messenger.gd.N0(2131743371, null), org.telegram.messenger.gd.N0(2131745170, null), false, true);
                            return;
                        } else if (c15 == 2) {
                            x9Var.c(org.telegram.messenger.gd.N0(2131743371, null), org.telegram.messenger.gd.N0(2131743369, null), false, true);
                            return;
                        } else if (c15 == 3) {
                            x9Var.c(org.telegram.messenger.gd.N0(2131743371, null), org.telegram.messenger.gd.N0(2131748530, null), false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    x9Var.c(org.telegram.messenger.gd.N0(2131743371, null), org.telegram.messenger.gd.N0(2131743370, null), false, true);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                a9Var.setFixedSize(0);
                if (i7 == jx0Var.P) {
                    a9Var.setText(org.telegram.messenger.gd.N0(2131746442, null));
                    return;
                } else if (i7 == jx0Var.X) {
                    a9Var.setText(org.telegram.messenger.gd.N0(2131747708, null));
                    return;
                } else if (i7 == jx0Var.L) {
                    if (jx0Var.K == -1) {
                        a9Var.setText("");
                        return;
                    } else {
                        a9Var.setText(org.telegram.messenger.gd.N0(2131746675, null));
                        return;
                    }
                } else if (i7 == jx0Var.U) {
                    a9Var.setText(org.telegram.messenger.gd.N0(2131743001, null));
                    return;
                } else {
                    return;
                }
            case 3:
                org.telegram.ui.Cells.u8 u8Var = (org.telegram.ui.Cells.u8) view;
                String v10 = org.telegram.messenger.xs.v(j10, j3, false);
                i11 = ((org.telegram.ui.ActionBar.g2) jx0Var).currentAccount;
                SharedPreferences sharedPreferences2 = org.telegram.messenger.mp.u1(i11).f25686g7;
                if (sharedPreferences2.contains("color_" + v10)) {
                    i12 = org.telegram.messenger.f3.c("color_", v10, sharedPreferences2, -16776961);
                } else if (org.telegram.messenger.n5.z(j10)) {
                    i12 = sharedPreferences2.getInt("GroupLed", -16776961);
                } else {
                    i12 = sharedPreferences2.getInt("MessagesLed", -16776961);
                }
                int i18 = 0;
                while (true) {
                    if (i18 < 9) {
                        if (org.telegram.ui.Cells.u8.f32069f[i18] == i12) {
                            i12 = org.telegram.ui.Cells.u8.f32068e[i18];
                        } else {
                            i18++;
                        }
                    }
                }
                u8Var.b(i12, org.telegram.messenger.gd.N0(2131747709, null), false);
                return;
            case 4:
                org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
                i13 = ((org.telegram.ui.ActionBar.g2) jx0Var).currentAccount;
                SharedPreferences sharedPreferences3 = org.telegram.messenger.mp.u1(i13).f25686g7;
                int c16 = org.telegram.messenger.f3.c("popup_", org.telegram.messenger.xs.v(j10, j3, false), sharedPreferences3, 0);
                if (c16 == 0) {
                    if (org.telegram.messenger.n5.z(j10)) {
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
                if (i7 == jx0Var.N) {
                    String N012 = org.telegram.messenger.gd.N0(2131746905, null);
                    if (c16 == 1) {
                        z12 = true;
                    }
                    j6Var.c(N012, z12, true);
                    j6Var.setTag(1);
                    return;
                } else if (i7 == jx0Var.O) {
                    String N013 = org.telegram.messenger.gd.N0(2131746906, null);
                    if (c16 != 2) {
                        z11 = false;
                    }
                    j6Var.c(N013, z11, false);
                    j6Var.setTag(2);
                    return;
                } else {
                    return;
                }
            case 5:
                org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) view;
                if (org.telegram.messenger.n5.E(j10)) {
                    i15 = ((org.telegram.ui.ActionBar.g2) jx0Var).currentAccount;
                    O0 = org.telegram.messenger.mp.u1(i15).c2(Long.valueOf(j10));
                } else {
                    i14 = ((org.telegram.ui.ActionBar.g2) jx0Var).currentAccount;
                    O0 = org.telegram.messenger.mp.u1(i14).O0(Long.valueOf(-j10));
                }
                qaVar.a(null, O0);
                return;
            case 6:
                org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) view;
                if (i7 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i7 >= jx0Var.f49118a0 - 1) {
                    z11 = false;
                }
                if (z6Var.f32548c != z10 || z6Var.d != z11) {
                    z6Var.f32548c = z10;
                    z6Var.d = z11;
                    int i19 = z6Var.f32547b;
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
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                i16 = ((org.telegram.ui.ActionBar.g2) jx0Var).currentAccount;
                SharedPreferences sharedPreferences4 = org.telegram.messenger.mp.u1(i16).f25686g7;
                if (i7 == jx0Var.F) {
                    s8Var.f(org.telegram.messenger.gd.N0(2131747730, null), jx0Var.f49126r, true);
                    return;
                } else if (i7 == jx0Var.G) {
                    String v11 = org.telegram.messenger.xs.v(j10, j3, false);
                    s8Var.f(org.telegram.messenger.gd.N0(2131748344, null), sharedPreferences4.getBoolean("content_preview_" + v11, true), true);
                    return;
                } else if (i7 == jx0Var.Q) {
                    String k10 = p5.c.k("stories_", org.telegram.messenger.xs.v(j10, j3, false));
                    if (jx0Var.f49120b0 || (sharedPreferences4.contains("EnableAllStories") && sharedPreferences4.getBoolean("EnableAllStories", true))) {
                        z12 = true;
                    }
                    s8Var.f(org.telegram.messenger.gd.N0(2131744503, null), sharedPreferences4.getBoolean(k10, z12), true);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View o4Var;
        org.telegram.ui.ActionBar.h6 h6Var = this.d.f49123e;
        Context context = this.f48539c;
        switch (i7) {
            case 0:
                o4Var = new org.telegram.ui.Cells.o4(context, h6Var);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29378d6, o4Var, h6Var);
                break;
            case 1:
                o4Var = new org.telegram.ui.Cells.x9(0, context, h6Var);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29378d6, o4Var, h6Var);
                break;
            case 2:
                o4Var = new org.telegram.ui.Cells.a9(context, h6Var);
                break;
            case 3:
                o4Var = new org.telegram.ui.Cells.u8(context, h6Var);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29378d6, o4Var, h6Var);
                break;
            case 4:
                o4Var = new org.telegram.ui.Cells.j6(context, h6Var);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29378d6, o4Var, h6Var);
                break;
            case 5:
                o4Var = new org.telegram.ui.Cells.qa(context, h6Var);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29378d6, o4Var, h6Var);
                break;
            case 6:
                o4Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                break;
            default:
                o4Var = new org.telegram.ui.Cells.s8(context, h6Var);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29378d6, o4Var, h6Var);
                break;
        }
        return i5.c.q(o4Var, o4Var, -1, -2);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        int i7 = f1Var.f59165f;
        View view = f1Var.f59161a;
        jx0 jx0Var = this.d;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 7) {
                                return;
                            }
                            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                            if (f1Var.b() == jx0Var.G) {
                                s8Var.e(null, jx0Var.f49126r);
                                return;
                            } else if (f1Var.b() == jx0Var.Q) {
                                s8Var.e(null, jx0Var.f49126r);
                                return;
                            } else {
                                s8Var.e(null, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.j6) view).b(null, jx0Var.f49126r);
                        return;
                    }
                    ((org.telegram.ui.Cells.u8) view).a(null, jx0Var.f49126r);
                    return;
                }
                ((org.telegram.ui.Cells.a9) view).c(null, jx0Var.f49126r);
                return;
            }
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            if (f1Var.b() == jx0Var.Y) {
                x9Var.a(null, true);
                return;
            } else {
                x9Var.a(null, jx0Var.f49126r);
                return;
            }
        }
        ((org.telegram.ui.Cells.o4) view).a(null, jx0Var.f49126r);
    }
}
