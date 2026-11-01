package org.telegram.ui;

import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class o81 implements org.telegram.ui.Components.bq {
    public final k91 f40104a;

    public o81(k91 k91Var) {
        this.f40104a = k91Var;
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        int i11;
        k91 k91Var = this.f40104a;
        org.telegram.ui.ActionBar.r6 r6Var = k91Var.f38771w;
        if (z10) {
            if (r6Var.f20745r == null) {
                k91Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
                org.telegram.messenger.wp.r1(i11).v4(r6Var.f20732b, r6Var);
                org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14784s4, r6Var.f20732b, r6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
            sb2.append(org.telegram.messenger.wp.r1(i10).U2);
            sb2.append("/addtheme/");
            sb2.append(r6Var.f20745r.slug);
            String sb3 = sb2.toString();
            k91Var.showDialog(new org.telegram.ui.Components.pp0(k91Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.s4.V(k91Var, 1, null, null);
    }

    @Override
    public final void b() {
        k91 k91Var = this.f40104a;
        if (k91Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k91Var.getParentActivity());
            String L0 = org.telegram.messenger.dd.L0(2131751485, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.dd.L0(2131751486, null);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new rj0(this, 20));
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
            k91Var.showDialog(x1Var);
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, k91Var.f38712a);
            }
        }
    }

    @Override
    public final void c(int i10, int i11, boolean z10) {
        k91 k91Var = this.f40104a;
        if (k91Var.f38715b == 2) {
            k91Var.f1(i10, i11, true);
            return;
        }
        Runnable runnable = k91Var.Z;
        org.telegram.ui.ActionBar.r6 r6Var = k91Var.f38771w;
        if (i11 == -1) {
            int i12 = k91Var.f38750n;
            if (i12 == 1 || i12 == 2) {
                long j10 = k91Var.J;
                if (j10 != 0) {
                    r6Var.f20737j = j10;
                } else {
                    r6Var.f20737j = 0L;
                }
                long j11 = k91Var.K;
                if (j11 != 0) {
                    r6Var.f20738k = j11;
                } else {
                    r6Var.f20738k = 0L;
                }
                long j12 = k91Var.L;
                if (j12 != 0) {
                    r6Var.f20739l = j12;
                } else {
                    r6Var.f20739l = 0L;
                }
                long j13 = k91Var.M;
                if (j13 != 0) {
                    r6Var.f20740m = j13;
                } else {
                    r6Var.f20740m = 0L;
                }
                r6Var.f20741n = k91Var.P;
                if (i12 == 2) {
                    int E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Be);
                    int E02 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ce);
                    int E03 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.De);
                    int E04 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ee);
                    int i13 = (int) r6Var.f20738k;
                    int i14 = (int) r6Var.f20739l;
                    int i15 = (int) r6Var.f20740m;
                    int i16 = (int) r6Var.f20737j;
                    org.telegram.ui.Components.cq cqVar = k91Var.W;
                    if (i15 != 0) {
                        E04 = i15;
                    }
                    cqVar.e(E04, 3);
                    org.telegram.ui.Components.cq cqVar2 = k91Var.W;
                    if (i14 != 0) {
                        E03 = i14;
                    }
                    cqVar2.e(E03, 2);
                    org.telegram.ui.Components.cq cqVar3 = k91Var.W;
                    if (i13 != 0) {
                        E02 = i13;
                    }
                    cqVar3.e(E02, 1);
                    org.telegram.ui.Components.cq cqVar4 = k91Var.W;
                    if (i16 != 0) {
                        E0 = i16;
                    }
                    cqVar4.e(E0, 0);
                }
            }
            int i17 = k91Var.f38750n;
            if (i17 == 1 || i17 == 3) {
                int i18 = k91Var.E;
                if (i18 != 0) {
                    r6Var.e = i18;
                } else {
                    r6Var.e = 0;
                }
                int i19 = k91Var.F;
                if (i19 != 0) {
                    r6Var.f20734f = i19;
                } else {
                    r6Var.f20734f = 0;
                }
                int i20 = k91Var.G;
                if (i20 != 0) {
                    r6Var.f20735g = i20;
                } else {
                    r6Var.f20735g = 0;
                }
                int i21 = k91Var.H;
                if (i21 != 0) {
                    r6Var.h = i21;
                } else {
                    r6Var.h = 0;
                }
                if (i17 == 3) {
                    k91Var.W.e(r6Var.h, 3);
                    k91Var.W.e(r6Var.f20735g, 2);
                    k91Var.W.e(r6Var.f20734f, 1);
                    org.telegram.ui.Components.cq cqVar5 = k91Var.W;
                    int i22 = r6Var.e;
                    if (i22 == 0) {
                        i22 = r6Var.f20733c;
                    }
                    cqVar5.e(i22, 0);
                }
            }
            org.telegram.ui.ActionBar.t6.t1(false, false);
            k91Var.f38769v0.g1();
            return;
        }
        int i23 = k91Var.Y;
        if (i23 != -1 && i23 != i11) {
            runnable.run();
        }
        k91Var.X = i10;
        k91Var.Y = i11;
        if (z10) {
            runnable.run();
        } else if (!k91Var.f38713a0) {
            k91Var.f38713a0 = true;
            k91Var.fragmentView.postDelayed(runnable, 16L);
        }
    }

    @Override
    public final int d(int i10) {
        org.telegram.ui.ActionBar.r6 r6Var;
        k91 k91Var = this.f40104a;
        if (k91Var.f38750n == 3) {
            org.telegram.ui.ActionBar.s6 s6Var = k91Var.f38730f0;
            if (s6Var.S && i10 == 0 && (r6Var = (org.telegram.ui.ActionBar.r6) s6Var.f20803a0.get(org.telegram.ui.ActionBar.t6.f21109n)) != null) {
                return r6Var.e;
            }
            return 0;
        }
        return 0;
    }
}
