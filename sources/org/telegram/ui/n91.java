package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class n91 extends rg.b {
    public final w91 d;

    public n91(w91 w91Var) {
        this.d = w91Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 != 0 && i7 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        w91 w91Var = this.d;
        w91Var.getClass();
        return w91Var.f53219b;
    }

    @Override
    public final int b() {
        return F().size() + 1;
    }

    @Override
    public final int d(int i7) {
        if (i7 == b() - 1) {
            return 2;
        }
        return ((o91) this.d.f53219b.get(i7)).f56712a;
    }

    @Override
    public final void f() {
        this.d.f53222c = b();
        super.f();
    }

    @Override
    public final void t(v4.f1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n91.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        w91 w91Var = this.d;
        if (i7 != 0 && i7 != 3) {
            if (i7 == 2) {
                m91 m91Var = new m91(this, w91Var.getParentActivity());
                w91Var.F0 = m91Var;
                return new v4.f1(m91Var);
            }
            org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(viewGroup.getContext(), null);
            vzVar.setViewType(24);
            vzVar.setIsSingleCell(true);
            vzVar.f41457x = true;
            return new v4.f1(vzVar);
        }
        t91 t91Var = new t91(w91Var, viewGroup.getContext(), false);
        if (i7 == 3) {
            i10 = ((org.telegram.ui.ActionBar.g2) w91Var).currentAccount;
            boolean w10 = org.telegram.messenger.n10.w(org.telegram.messenger.mp.u1(i10).c2(Long.valueOf(-w91Var.f53216a)));
            t91Var.setForumIcon(qg.c.e(qg.a.f56255k[0], ""));
            if (!w10) {
                i11 = 2131753063;
            } else {
                i11 = 2131753065;
            }
            t91Var.setTitleOverride(org.telegram.messenger.gd.N0(i11, null));
            if (!w10) {
                i12 = 2131753064;
            } else {
                i12 = 2131753066;
            }
            t91Var.setCustomMessage(org.telegram.messenger.gd.N0(i12, null));
        }
        z10 = ((org.telegram.ui.ActionBar.g2) w91Var).inPreviewMode;
        t91Var.f32027l0 = z10;
        t91Var.setArchivedPullAnimation(w91Var.f53263x);
        return new v4.f1(t91Var);
    }
}
