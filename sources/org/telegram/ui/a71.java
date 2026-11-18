package org.telegram.ui;

import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a71 implements org.telegram.ui.Components.jq {
    public final x71 f45486a;

    public a71(x71 x71Var) {
        this.f45486a = x71Var;
    }

    @Override
    public final void a(boolean z10) {
        int i7;
        int i10;
        x71 x71Var = this.f45486a;
        org.telegram.ui.ActionBar.k6 k6Var = x71Var.f53730w;
        if (z10) {
            if (k6Var.f29183r == null) {
                x71Var.finishFragment();
                i10 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
                org.telegram.messenger.mp.u1(i10).H4(k6Var.f29169b, k6Var);
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25208v4, k6Var.f29169b, k6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i7 = ((org.telegram.ui.ActionBar.h2) x71Var).currentAccount;
            sb2.append(org.telegram.messenger.mp.u1(i7).X2);
            sb2.append("/addtheme/");
            sb2.append(k6Var.f29183r.slug);
            String sb3 = sb2.toString();
            x71Var.showDialog(new org.telegram.ui.Components.yo0(x71Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.b5.T(x71Var, 1, null, null);
    }

    @Override
    public final void b() {
        x71 x71Var = this.f45486a;
        if (x71Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x71Var.getParentActivity());
            String M0 = org.telegram.messenger.gd.M0(2131751473, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.gd.M0(2131751474, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new qi0(this, 19));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            x71Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29635q7, x71Var.f53670a);
            }
        }
    }

    @Override
    public final void c(int i7, int i10, boolean z10) {
        x71 x71Var = this.f45486a;
        if (x71Var.f53674b == 2) {
            x71Var.f1(i7, i10, true);
            return;
        }
        Runnable runnable = x71Var.f53671a0;
        org.telegram.ui.ActionBar.k6 k6Var = x71Var.f53730w;
        if (i10 == -1) {
            int i11 = x71Var.f53710n;
            if (i11 == 1 || i11 == 2) {
                long j3 = x71Var.K;
                if (j3 != 0) {
                    k6Var.f29175j = j3;
                } else {
                    k6Var.f29175j = 0L;
                }
                long j10 = x71Var.L;
                if (j10 != 0) {
                    k6Var.f29176k = j10;
                } else {
                    k6Var.f29176k = 0L;
                }
                long j11 = x71Var.M;
                if (j11 != 0) {
                    k6Var.f29177l = j11;
                } else {
                    k6Var.f29177l = 0L;
                }
                long j12 = x71Var.N;
                if (j12 != 0) {
                    k6Var.f29178m = j12;
                } else {
                    k6Var.f29178m = 0L;
                }
                k6Var.f29179n = x71Var.Q;
                if (i11 == 2) {
                    int E0 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.Ee);
                    int E02 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.Fe);
                    int E03 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.Ge);
                    int E04 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.He);
                    int i12 = (int) k6Var.f29176k;
                    int i13 = (int) k6Var.f29177l;
                    int i14 = (int) k6Var.f29178m;
                    int i15 = (int) k6Var.f29175j;
                    org.telegram.ui.Components.kq kqVar = x71Var.X;
                    if (i14 != 0) {
                        E04 = i14;
                    }
                    kqVar.e(E04, 3);
                    org.telegram.ui.Components.kq kqVar2 = x71Var.X;
                    if (i13 != 0) {
                        E03 = i13;
                    }
                    kqVar2.e(E03, 2);
                    org.telegram.ui.Components.kq kqVar3 = x71Var.X;
                    if (i12 != 0) {
                        E02 = i12;
                    }
                    kqVar3.e(E02, 1);
                    org.telegram.ui.Components.kq kqVar4 = x71Var.X;
                    if (i15 != 0) {
                        E0 = i15;
                    }
                    kqVar4.e(E0, 0);
                }
            }
            int i16 = x71Var.f53710n;
            if (i16 == 1 || i16 == 3) {
                int i17 = x71Var.F;
                if (i17 != 0) {
                    k6Var.f29171e = i17;
                } else {
                    k6Var.f29171e = 0;
                }
                int i18 = x71Var.G;
                if (i18 != 0) {
                    k6Var.f29172f = i18;
                } else {
                    k6Var.f29172f = 0;
                }
                int i19 = x71Var.H;
                if (i19 != 0) {
                    k6Var.f29173g = i19;
                } else {
                    k6Var.f29173g = 0;
                }
                int i20 = x71Var.I;
                if (i20 != 0) {
                    k6Var.h = i20;
                } else {
                    k6Var.h = 0;
                }
                if (i16 == 3) {
                    x71Var.X.e(k6Var.h, 3);
                    x71Var.X.e(k6Var.f29173g, 2);
                    x71Var.X.e(k6Var.f29172f, 1);
                    org.telegram.ui.Components.kq kqVar5 = x71Var.X;
                    int i21 = k6Var.f29171e;
                    if (i21 == 0) {
                        i21 = k6Var.f29170c;
                    }
                    kqVar5.e(i21, 0);
                }
            }
            org.telegram.ui.ActionBar.n6.t1(false, false);
            x71Var.f53731w0.g1();
            return;
        }
        int i22 = x71Var.Z;
        if (i22 != -1 && i22 != i10) {
            runnable.run();
        }
        x71Var.Y = i7;
        x71Var.Z = i10;
        if (z10) {
            runnable.run();
        } else if (!x71Var.f53675b0) {
            x71Var.f53675b0 = true;
            x71Var.fragmentView.postDelayed(runnable, 16L);
        }
    }

    @Override
    public final int d(int i7) {
        org.telegram.ui.ActionBar.k6 k6Var;
        x71 x71Var = this.f45486a;
        if (x71Var.f53710n == 3) {
            org.telegram.ui.ActionBar.m6 m6Var = x71Var.f53692g0;
            if (m6Var.T && i7 == 0 && (k6Var = (org.telegram.ui.ActionBar.k6) m6Var.f29250b0.get(org.telegram.ui.ActionBar.n6.f29570n)) != null) {
                return k6Var.f29171e;
            }
            return 0;
        }
        return 0;
    }
}
