package org.telegram.ui;

import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class p61 implements org.telegram.ui.Components.up {
    public final l71 f48479a;

    public p61(l71 l71Var) {
        this.f48479a = l71Var;
    }

    @Override
    public final void a(boolean z10) {
        int i3;
        int i10;
        l71 l71Var = this.f48479a;
        org.telegram.ui.ActionBar.g6 g6Var = l71Var.f47201w;
        if (z10) {
            if (g6Var.f27540r == null) {
                l71Var.finishFragment();
                i10 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
                org.telegram.messenger.hp.s1(i10).y4(g6Var.f27526b, g6Var);
                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23303s4, g6Var.f27526b, g6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i3 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
            sb2.append(org.telegram.messenger.hp.s1(i3).V2);
            sb2.append("/addtheme/");
            sb2.append(g6Var.f27540r.slug);
            String sb3 = sb2.toString();
            l71Var.showDialog(new org.telegram.ui.Components.oo0(l71Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.t4.V(l71Var, 1, null, null);
    }

    @Override
    public final void b() {
        l71 l71Var = this.f48479a;
        if (l71Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l71Var.getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131751485, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131751486, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new ci0(this, 20));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            l71Var.showDialog(s1Var);
            TextView textView = (TextView) s1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, l71Var.f47141a);
            }
        }
    }

    @Override
    public final void c(int i3, int i10, boolean z10) {
        l71 l71Var = this.f48479a;
        if (l71Var.f47145b == 2) {
            l71Var.f1(i3, i10, true);
            return;
        }
        Runnable runnable = l71Var.f47142a0;
        org.telegram.ui.ActionBar.g6 g6Var = l71Var.f47201w;
        if (i10 == -1) {
            int i11 = l71Var.f47180n;
            if (i11 == 1 || i11 == 2) {
                long j10 = l71Var.K;
                if (j10 != 0) {
                    g6Var.f27532j = j10;
                } else {
                    g6Var.f27532j = 0L;
                }
                long j11 = l71Var.L;
                if (j11 != 0) {
                    g6Var.f27533k = j11;
                } else {
                    g6Var.f27533k = 0L;
                }
                long j12 = l71Var.M;
                if (j12 != 0) {
                    g6Var.f27534l = j12;
                } else {
                    g6Var.f27534l = 0L;
                }
                long j13 = l71Var.N;
                if (j13 != 0) {
                    g6Var.f27535m = j13;
                } else {
                    g6Var.f27535m = 0L;
                }
                g6Var.f27536n = l71Var.Q;
                if (i11 == 2) {
                    int E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Be);
                    int E02 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ce);
                    int E03 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                    int E04 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ee);
                    int i12 = (int) g6Var.f27533k;
                    int i13 = (int) g6Var.f27534l;
                    int i14 = (int) g6Var.f27535m;
                    int i15 = (int) g6Var.f27532j;
                    org.telegram.ui.Components.vp vpVar = l71Var.X;
                    if (i14 != 0) {
                        E04 = i14;
                    }
                    vpVar.e(E04, 3);
                    org.telegram.ui.Components.vp vpVar2 = l71Var.X;
                    if (i13 != 0) {
                        E03 = i13;
                    }
                    vpVar2.e(E03, 2);
                    org.telegram.ui.Components.vp vpVar3 = l71Var.X;
                    if (i12 != 0) {
                        E02 = i12;
                    }
                    vpVar3.e(E02, 1);
                    org.telegram.ui.Components.vp vpVar4 = l71Var.X;
                    if (i15 != 0) {
                        E0 = i15;
                    }
                    vpVar4.e(E0, 0);
                }
            }
            int i16 = l71Var.f47180n;
            if (i16 == 1 || i16 == 3) {
                int i17 = l71Var.F;
                if (i17 != 0) {
                    g6Var.f27528e = i17;
                } else {
                    g6Var.f27528e = 0;
                }
                int i18 = l71Var.G;
                if (i18 != 0) {
                    g6Var.f27529f = i18;
                } else {
                    g6Var.f27529f = 0;
                }
                int i19 = l71Var.H;
                if (i19 != 0) {
                    g6Var.f27530g = i19;
                } else {
                    g6Var.f27530g = 0;
                }
                int i20 = l71Var.I;
                if (i20 != 0) {
                    g6Var.h = i20;
                } else {
                    g6Var.h = 0;
                }
                if (i16 == 3) {
                    l71Var.X.e(g6Var.h, 3);
                    l71Var.X.e(g6Var.f27530g, 2);
                    l71Var.X.e(g6Var.f27529f, 1);
                    org.telegram.ui.Components.vp vpVar5 = l71Var.X;
                    int i21 = g6Var.f27528e;
                    if (i21 == 0) {
                        i21 = g6Var.f27527c;
                    }
                    vpVar5.e(i21, 0);
                }
            }
            org.telegram.ui.ActionBar.k6.t1(false, false);
            l71Var.f47202w0.g1();
            return;
        }
        int i22 = l71Var.Z;
        if (i22 != -1 && i22 != i10) {
            runnable.run();
        }
        l71Var.Y = i3;
        l71Var.Z = i10;
        if (z10) {
            runnable.run();
        } else if (!l71Var.f47146b0) {
            l71Var.f47146b0 = true;
            l71Var.fragmentView.postDelayed(runnable, 16L);
        }
    }

    @Override
    public final int d(int i3) {
        org.telegram.ui.ActionBar.g6 g6Var;
        l71 l71Var = this.f48479a;
        if (l71Var.f47180n == 3) {
            org.telegram.ui.ActionBar.j6 j6Var = l71Var.f47163g0;
            if (j6Var.T && i3 == 0 && (g6Var = (org.telegram.ui.ActionBar.g6) j6Var.f27678b0.get(org.telegram.ui.ActionBar.k6.f28056n)) != null) {
                return g6Var.f27528e;
            }
            return 0;
        }
        return 0;
    }
}
