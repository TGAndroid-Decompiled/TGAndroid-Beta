package org.telegram.ui;

import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class b71 implements org.telegram.ui.Components.up {
    public final x71 f43976a;

    public b71(x71 x71Var) {
        this.f43976a = x71Var;
    }

    @Override
    public final void a(boolean z9) {
        int i7;
        int i10;
        x71 x71Var = this.f43976a;
        org.telegram.ui.ActionBar.j6 j6Var = x71Var.f51620w;
        if (z9) {
            if (j6Var.f27624r == null) {
                x71Var.finishFragment();
                i10 = ((org.telegram.ui.ActionBar.f2) x71Var).currentAccount;
                org.telegram.messenger.qp.s1(i10).y4(j6Var.f27610b, j6Var);
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25079s4, j6Var.f27610b, j6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i7 = ((org.telegram.ui.ActionBar.f2) x71Var).currentAccount;
            sb2.append(org.telegram.messenger.qp.s1(i7).U2);
            sb2.append("/addtheme/");
            sb2.append(j6Var.f27624r.slug);
            String sb3 = sb2.toString();
            x71Var.showDialog(new org.telegram.ui.Components.mo0(x71Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.u4.T(x71Var, 1, null, null);
    }

    @Override
    public final void b() {
        x71 x71Var = this.f43976a;
        if (x71Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x71Var.getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131751484, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131751485, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new oi0(this, 19));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            x71Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, x71Var.f51561a);
            }
        }
    }

    @Override
    public final void c(int i7, int i10, boolean z9) {
        x71 x71Var = this.f43976a;
        if (x71Var.f51565b == 2) {
            x71Var.f1(i7, i10, true);
            return;
        }
        Runnable runnable = x71Var.Z;
        org.telegram.ui.ActionBar.j6 j6Var = x71Var.f51620w;
        if (i10 == -1) {
            int i11 = x71Var.f51600n;
            if (i11 == 1 || i11 == 2) {
                long j3 = x71Var.J;
                if (j3 != 0) {
                    j6Var.f27616j = j3;
                } else {
                    j6Var.f27616j = 0L;
                }
                long j10 = x71Var.K;
                if (j10 != 0) {
                    j6Var.f27617k = j10;
                } else {
                    j6Var.f27617k = 0L;
                }
                long j11 = x71Var.L;
                if (j11 != 0) {
                    j6Var.f27618l = j11;
                } else {
                    j6Var.f27618l = 0L;
                }
                long j12 = x71Var.M;
                if (j12 != 0) {
                    j6Var.f27619m = j12;
                } else {
                    j6Var.f27619m = 0L;
                }
                j6Var.f27620n = x71Var.P;
                if (i11 == 2) {
                    int E0 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Be);
                    int E02 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Ce);
                    int E03 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.De);
                    int E04 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Ee);
                    int i12 = (int) j6Var.f27617k;
                    int i13 = (int) j6Var.f27618l;
                    int i14 = (int) j6Var.f27619m;
                    int i15 = (int) j6Var.f27616j;
                    org.telegram.ui.Components.vp vpVar = x71Var.W;
                    if (i14 != 0) {
                        E04 = i14;
                    }
                    vpVar.e(E04, 3);
                    org.telegram.ui.Components.vp vpVar2 = x71Var.W;
                    if (i13 != 0) {
                        E03 = i13;
                    }
                    vpVar2.e(E03, 2);
                    org.telegram.ui.Components.vp vpVar3 = x71Var.W;
                    if (i12 != 0) {
                        E02 = i12;
                    }
                    vpVar3.e(E02, 1);
                    org.telegram.ui.Components.vp vpVar4 = x71Var.W;
                    if (i15 != 0) {
                        E0 = i15;
                    }
                    vpVar4.e(E0, 0);
                }
            }
            int i16 = x71Var.f51600n;
            if (i16 == 1 || i16 == 3) {
                int i17 = x71Var.E;
                if (i17 != 0) {
                    j6Var.f27612e = i17;
                } else {
                    j6Var.f27612e = 0;
                }
                int i18 = x71Var.F;
                if (i18 != 0) {
                    j6Var.f27613f = i18;
                } else {
                    j6Var.f27613f = 0;
                }
                int i19 = x71Var.G;
                if (i19 != 0) {
                    j6Var.f27614g = i19;
                } else {
                    j6Var.f27614g = 0;
                }
                int i20 = x71Var.H;
                if (i20 != 0) {
                    j6Var.h = i20;
                } else {
                    j6Var.h = 0;
                }
                if (i16 == 3) {
                    x71Var.W.e(j6Var.h, 3);
                    x71Var.W.e(j6Var.f27614g, 2);
                    x71Var.W.e(j6Var.f27613f, 1);
                    org.telegram.ui.Components.vp vpVar5 = x71Var.W;
                    int i21 = j6Var.f27612e;
                    if (i21 == 0) {
                        i21 = j6Var.f27611c;
                    }
                    vpVar5.e(i21, 0);
                }
            }
            org.telegram.ui.ActionBar.m6.t1(false, false);
            x71Var.f51618v0.g1();
            return;
        }
        int i22 = x71Var.Y;
        if (i22 != -1 && i22 != i10) {
            runnable.run();
        }
        x71Var.X = i7;
        x71Var.Y = i10;
        if (z9) {
            runnable.run();
        } else if (!x71Var.f51562a0) {
            x71Var.f51562a0 = true;
            x71Var.fragmentView.postDelayed(runnable, 16L);
        }
    }

    @Override
    public final int d(int i7) {
        org.telegram.ui.ActionBar.j6 j6Var;
        x71 x71Var = this.f43976a;
        if (x71Var.f51600n == 3) {
            org.telegram.ui.ActionBar.l6 l6Var = x71Var.f51580f0;
            if (l6Var.S && i7 == 0 && (j6Var = (org.telegram.ui.ActionBar.j6) l6Var.f27766a0.get(org.telegram.ui.ActionBar.m6.f28066n)) != null) {
                return j6Var.f27612e;
            }
            return 0;
        }
        return 0;
    }
}
