package org.telegram.ui;

import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a71 implements org.telegram.ui.Components.lq {
    public final x71 f45526a;

    public a71(x71 x71Var) {
        this.f45526a = x71Var;
    }

    @Override
    public final void a(boolean z10) {
        int i7;
        int i10;
        x71 x71Var = this.f45526a;
        org.telegram.ui.ActionBar.j6 j6Var = x71Var.f53771w;
        if (z10) {
            if (j6Var.f29108r == null) {
                x71Var.finishFragment();
                i10 = ((org.telegram.ui.ActionBar.g2) x71Var).currentAccount;
                org.telegram.messenger.mp.u1(i10).H4(j6Var.f29094b, j6Var);
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25236v4, j6Var.f29094b, j6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i7 = ((org.telegram.ui.ActionBar.g2) x71Var).currentAccount;
            sb2.append(org.telegram.messenger.mp.u1(i7).X2);
            sb2.append("/addtheme/");
            sb2.append(j6Var.f29108r.slug);
            String sb3 = sb2.toString();
            x71Var.showDialog(new org.telegram.ui.Components.ap0(x71Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.c5.T(x71Var, 1, null, null);
    }

    @Override
    public final void b() {
        x71 x71Var = this.f45526a;
        if (x71Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x71Var.getParentActivity());
            String N0 = org.telegram.messenger.gd.N0(2131751472, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.N0(2131751473, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new qi0(this, 19));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            x71Var.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29619q7, x71Var.f53711a);
            }
        }
    }

    @Override
    public final void c(int i7, int i10, boolean z10) {
        x71 x71Var = this.f45526a;
        if (x71Var.f53715b == 2) {
            x71Var.f1(i7, i10, true);
            return;
        }
        Runnable runnable = x71Var.f53712a0;
        org.telegram.ui.ActionBar.j6 j6Var = x71Var.f53771w;
        if (i10 == -1) {
            int i11 = x71Var.f53751n;
            if (i11 == 1 || i11 == 2) {
                long j3 = x71Var.K;
                if (j3 != 0) {
                    j6Var.f29100j = j3;
                } else {
                    j6Var.f29100j = 0L;
                }
                long j10 = x71Var.L;
                if (j10 != 0) {
                    j6Var.f29101k = j10;
                } else {
                    j6Var.f29101k = 0L;
                }
                long j11 = x71Var.M;
                if (j11 != 0) {
                    j6Var.f29102l = j11;
                } else {
                    j6Var.f29102l = 0L;
                }
                long j12 = x71Var.N;
                if (j12 != 0) {
                    j6Var.f29103m = j12;
                } else {
                    j6Var.f29103m = 0L;
                }
                j6Var.f29104n = x71Var.Q;
                if (i11 == 2) {
                    int E0 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Ee);
                    int E02 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Fe);
                    int E03 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Ge);
                    int E04 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.He);
                    int i12 = (int) j6Var.f29101k;
                    int i13 = (int) j6Var.f29102l;
                    int i14 = (int) j6Var.f29103m;
                    int i15 = (int) j6Var.f29100j;
                    org.telegram.ui.Components.mq mqVar = x71Var.X;
                    if (i14 != 0) {
                        E04 = i14;
                    }
                    mqVar.e(E04, 3);
                    org.telegram.ui.Components.mq mqVar2 = x71Var.X;
                    if (i13 != 0) {
                        E03 = i13;
                    }
                    mqVar2.e(E03, 2);
                    org.telegram.ui.Components.mq mqVar3 = x71Var.X;
                    if (i12 != 0) {
                        E02 = i12;
                    }
                    mqVar3.e(E02, 1);
                    org.telegram.ui.Components.mq mqVar4 = x71Var.X;
                    if (i15 != 0) {
                        E0 = i15;
                    }
                    mqVar4.e(E0, 0);
                }
            }
            int i16 = x71Var.f53751n;
            if (i16 == 1 || i16 == 3) {
                int i17 = x71Var.F;
                if (i17 != 0) {
                    j6Var.f29096e = i17;
                } else {
                    j6Var.f29096e = 0;
                }
                int i18 = x71Var.G;
                if (i18 != 0) {
                    j6Var.f29097f = i18;
                } else {
                    j6Var.f29097f = 0;
                }
                int i19 = x71Var.H;
                if (i19 != 0) {
                    j6Var.f29098g = i19;
                } else {
                    j6Var.f29098g = 0;
                }
                int i20 = x71Var.I;
                if (i20 != 0) {
                    j6Var.h = i20;
                } else {
                    j6Var.h = 0;
                }
                if (i16 == 3) {
                    x71Var.X.e(j6Var.h, 3);
                    x71Var.X.e(j6Var.f29098g, 2);
                    x71Var.X.e(j6Var.f29097f, 1);
                    org.telegram.ui.Components.mq mqVar5 = x71Var.X;
                    int i21 = j6Var.f29096e;
                    if (i21 == 0) {
                        i21 = j6Var.f29095c;
                    }
                    mqVar5.e(i21, 0);
                }
            }
            org.telegram.ui.ActionBar.m6.t1(false, false);
            x71Var.f53772w0.g1();
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
        } else if (!x71Var.f53716b0) {
            x71Var.f53716b0 = true;
            x71Var.fragmentView.postDelayed(runnable, 16L);
        }
    }

    @Override
    public final int d(int i7) {
        org.telegram.ui.ActionBar.j6 j6Var;
        x71 x71Var = this.f45526a;
        if (x71Var.f53751n == 3) {
            org.telegram.ui.ActionBar.l6 l6Var = x71Var.f53733g0;
            if (l6Var.T && i7 == 0 && (j6Var = (org.telegram.ui.ActionBar.j6) l6Var.f29232b0.get(org.telegram.ui.ActionBar.m6.f29554n)) != null) {
                return j6Var.f29096e;
            }
            return 0;
        }
        return 0;
    }
}
