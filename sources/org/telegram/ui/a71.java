package org.telegram.ui;

import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a71 implements org.telegram.ui.Components.up {
    public final w71 f43635a;

    public a71(w71 w71Var) {
        this.f43635a = w71Var;
    }

    @Override
    public final void a(boolean z9) {
        int i7;
        int i10;
        w71 w71Var = this.f43635a;
        org.telegram.ui.ActionBar.i6 i6Var = w71Var.f50961w;
        if (z9) {
            if (i6Var.f27586r == null) {
                w71Var.finishFragment();
                i10 = ((org.telegram.ui.ActionBar.f2) w71Var).currentAccount;
                org.telegram.messenger.qp.s1(i10).y4(i6Var.f27572b, i6Var);
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25075s4, i6Var.f27572b, i6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i7 = ((org.telegram.ui.ActionBar.f2) w71Var).currentAccount;
            sb2.append(org.telegram.messenger.qp.s1(i7).U2);
            sb2.append("/addtheme/");
            sb2.append(i6Var.f27586r.slug);
            String sb3 = sb2.toString();
            w71Var.showDialog(new org.telegram.ui.Components.no0(w71Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.v4.T(w71Var, 1, null, null);
    }

    @Override
    public final void b() {
        w71 w71Var = this.f43635a;
        if (w71Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w71Var.getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131751484, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131751485, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new ni0(this, 19));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            w71Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, w71Var.f50902a);
            }
        }
    }

    @Override
    public final void c(int i7, int i10, boolean z9) {
        w71 w71Var = this.f43635a;
        if (w71Var.f50906b == 2) {
            w71Var.f1(i7, i10, true);
            return;
        }
        Runnable runnable = w71Var.Z;
        org.telegram.ui.ActionBar.i6 i6Var = w71Var.f50961w;
        if (i10 == -1) {
            int i11 = w71Var.f50941n;
            if (i11 == 1 || i11 == 2) {
                long j3 = w71Var.J;
                if (j3 != 0) {
                    i6Var.f27578j = j3;
                } else {
                    i6Var.f27578j = 0L;
                }
                long j10 = w71Var.K;
                if (j10 != 0) {
                    i6Var.f27579k = j10;
                } else {
                    i6Var.f27579k = 0L;
                }
                long j11 = w71Var.L;
                if (j11 != 0) {
                    i6Var.f27580l = j11;
                } else {
                    i6Var.f27580l = 0L;
                }
                long j12 = w71Var.M;
                if (j12 != 0) {
                    i6Var.f27581m = j12;
                } else {
                    i6Var.f27581m = 0L;
                }
                i6Var.f27582n = w71Var.P;
                if (i11 == 2) {
                    int E0 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.Be);
                    int E02 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.Ce);
                    int E03 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.De);
                    int E04 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.Ee);
                    int i12 = (int) i6Var.f27579k;
                    int i13 = (int) i6Var.f27580l;
                    int i14 = (int) i6Var.f27581m;
                    int i15 = (int) i6Var.f27578j;
                    org.telegram.ui.Components.vp vpVar = w71Var.W;
                    if (i14 != 0) {
                        E04 = i14;
                    }
                    vpVar.e(E04, 3);
                    org.telegram.ui.Components.vp vpVar2 = w71Var.W;
                    if (i13 != 0) {
                        E03 = i13;
                    }
                    vpVar2.e(E03, 2);
                    org.telegram.ui.Components.vp vpVar3 = w71Var.W;
                    if (i12 != 0) {
                        E02 = i12;
                    }
                    vpVar3.e(E02, 1);
                    org.telegram.ui.Components.vp vpVar4 = w71Var.W;
                    if (i15 != 0) {
                        E0 = i15;
                    }
                    vpVar4.e(E0, 0);
                }
            }
            int i16 = w71Var.f50941n;
            if (i16 == 1 || i16 == 3) {
                int i17 = w71Var.E;
                if (i17 != 0) {
                    i6Var.f27574e = i17;
                } else {
                    i6Var.f27574e = 0;
                }
                int i18 = w71Var.F;
                if (i18 != 0) {
                    i6Var.f27575f = i18;
                } else {
                    i6Var.f27575f = 0;
                }
                int i19 = w71Var.G;
                if (i19 != 0) {
                    i6Var.f27576g = i19;
                } else {
                    i6Var.f27576g = 0;
                }
                int i20 = w71Var.H;
                if (i20 != 0) {
                    i6Var.h = i20;
                } else {
                    i6Var.h = 0;
                }
                if (i16 == 3) {
                    w71Var.W.e(i6Var.h, 3);
                    w71Var.W.e(i6Var.f27576g, 2);
                    w71Var.W.e(i6Var.f27575f, 1);
                    org.telegram.ui.Components.vp vpVar5 = w71Var.W;
                    int i21 = i6Var.f27574e;
                    if (i21 == 0) {
                        i21 = i6Var.f27573c;
                    }
                    vpVar5.e(i21, 0);
                }
            }
            org.telegram.ui.ActionBar.l6.t1(false, false);
            w71Var.f50959v0.g1();
            return;
        }
        int i22 = w71Var.Y;
        if (i22 != -1 && i22 != i10) {
            runnable.run();
        }
        w71Var.X = i7;
        w71Var.Y = i10;
        if (z9) {
            runnable.run();
        } else if (!w71Var.f50903a0) {
            w71Var.f50903a0 = true;
            w71Var.fragmentView.postDelayed(runnable, 16L);
        }
    }

    @Override
    public final int d(int i7) {
        org.telegram.ui.ActionBar.i6 i6Var;
        w71 w71Var = this.f43635a;
        if (w71Var.f50941n == 3) {
            org.telegram.ui.ActionBar.k6 k6Var = w71Var.f50921f0;
            if (k6Var.S && i7 == 0 && (i6Var = (org.telegram.ui.ActionBar.i6) k6Var.f27737a0.get(org.telegram.ui.ActionBar.l6.f28041n)) != null) {
                return i6Var.f27574e;
            }
            return 0;
        }
        return 0;
    }
}
