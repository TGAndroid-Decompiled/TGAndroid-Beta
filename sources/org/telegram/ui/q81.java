package org.telegram.ui;

import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class q81 implements org.telegram.ui.Components.bq {
    public final m91 f40931a;

    public q81(m91 m91Var) {
        this.f40931a = m91Var;
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        int i11;
        m91 m91Var = this.f40931a;
        org.telegram.ui.ActionBar.r6 r6Var = m91Var.f39596w;
        if (z10) {
            if (r6Var.f20744r == null) {
                m91Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.k2) m91Var).currentAccount;
                org.telegram.messenger.vp.r1(i11).v4(r6Var.f20731b, r6Var);
                org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19688s4, r6Var.f20731b, r6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.k2) m91Var).currentAccount;
            sb2.append(org.telegram.messenger.vp.r1(i10).U2);
            sb2.append("/addtheme/");
            sb2.append(r6Var.f20744r.slug);
            String sb3 = sb2.toString();
            m91Var.showDialog(new org.telegram.ui.Components.op0(m91Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.s4.V(m91Var, 1, null, null);
    }

    @Override
    public final void b() {
        m91 m91Var = this.f40931a;
        if (m91Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m91Var.getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(2131751485, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131751486, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new tj0(this, 20));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            m91Var.showDialog(x1Var);
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, m91Var.f39537a);
            }
        }
    }

    @Override
    public final void c(int i10, int i11, boolean z10) {
        m91 m91Var = this.f40931a;
        if (m91Var.f39540b == 2) {
            m91Var.e1(i10, i11, true);
            return;
        }
        Runnable runnable = m91Var.Z;
        org.telegram.ui.ActionBar.r6 r6Var = m91Var.f39596w;
        if (i11 == -1) {
            int i12 = m91Var.f39575n;
            if (i12 == 1 || i12 == 2) {
                long j10 = m91Var.J;
                if (j10 != 0) {
                    r6Var.f20736j = j10;
                } else {
                    r6Var.f20736j = 0L;
                }
                long j11 = m91Var.K;
                if (j11 != 0) {
                    r6Var.f20737k = j11;
                } else {
                    r6Var.f20737k = 0L;
                }
                long j12 = m91Var.L;
                if (j12 != 0) {
                    r6Var.f20738l = j12;
                } else {
                    r6Var.f20738l = 0L;
                }
                long j13 = m91Var.M;
                if (j13 != 0) {
                    r6Var.f20739m = j13;
                } else {
                    r6Var.f20739m = 0L;
                }
                r6Var.f20740n = m91Var.P;
                if (i12 == 2) {
                    int E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Be);
                    int E02 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ce);
                    int E03 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.De);
                    int E04 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ee);
                    int i13 = (int) r6Var.f20737k;
                    int i14 = (int) r6Var.f20738l;
                    int i15 = (int) r6Var.f20739m;
                    int i16 = (int) r6Var.f20736j;
                    org.telegram.ui.Components.cq cqVar = m91Var.W;
                    if (i15 != 0) {
                        E04 = i15;
                    }
                    cqVar.e(E04, 3);
                    org.telegram.ui.Components.cq cqVar2 = m91Var.W;
                    if (i14 != 0) {
                        E03 = i14;
                    }
                    cqVar2.e(E03, 2);
                    org.telegram.ui.Components.cq cqVar3 = m91Var.W;
                    if (i13 != 0) {
                        E02 = i13;
                    }
                    cqVar3.e(E02, 1);
                    org.telegram.ui.Components.cq cqVar4 = m91Var.W;
                    if (i16 != 0) {
                        E0 = i16;
                    }
                    cqVar4.e(E0, 0);
                }
            }
            int i17 = m91Var.f39575n;
            if (i17 == 1 || i17 == 3) {
                int i18 = m91Var.E;
                if (i18 != 0) {
                    r6Var.e = i18;
                } else {
                    r6Var.e = 0;
                }
                int i19 = m91Var.F;
                if (i19 != 0) {
                    r6Var.f20733f = i19;
                } else {
                    r6Var.f20733f = 0;
                }
                int i20 = m91Var.G;
                if (i20 != 0) {
                    r6Var.f20734g = i20;
                } else {
                    r6Var.f20734g = 0;
                }
                int i21 = m91Var.H;
                if (i21 != 0) {
                    r6Var.h = i21;
                } else {
                    r6Var.h = 0;
                }
                if (i17 == 3) {
                    m91Var.W.e(r6Var.h, 3);
                    m91Var.W.e(r6Var.f20734g, 2);
                    m91Var.W.e(r6Var.f20733f, 1);
                    org.telegram.ui.Components.cq cqVar5 = m91Var.W;
                    int i22 = r6Var.e;
                    if (i22 == 0) {
                        i22 = r6Var.f20732c;
                    }
                    cqVar5.e(i22, 0);
                }
            }
            org.telegram.ui.ActionBar.t6.t1(false, false);
            m91Var.f39594v0.g1();
            return;
        }
        int i23 = m91Var.Y;
        if (i23 != -1 && i23 != i11) {
            runnable.run();
        }
        m91Var.X = i10;
        m91Var.Y = i11;
        if (z10) {
            runnable.run();
        } else if (!m91Var.f39538a0) {
            m91Var.f39538a0 = true;
            m91Var.fragmentView.postDelayed(runnable, 16L);
        }
    }

    @Override
    public final int d(int i10) {
        org.telegram.ui.ActionBar.r6 r6Var;
        m91 m91Var = this.f40931a;
        if (m91Var.f39575n == 3) {
            org.telegram.ui.ActionBar.s6 s6Var = m91Var.f39555f0;
            if (s6Var.S && i10 == 0 && (r6Var = (org.telegram.ui.ActionBar.r6) s6Var.f20802a0.get(org.telegram.ui.ActionBar.t6.f21108n)) != null) {
                return r6Var.e;
            }
            return 0;
        }
        return 0;
    }
}
