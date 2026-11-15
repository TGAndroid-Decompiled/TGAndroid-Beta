package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class l91 extends rg.b {
    public final u91 d;

    public l91(u91 u91Var) {
        this.d = u91Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 0 && i7 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        u91 u91Var = this.d;
        u91Var.getClass();
        return u91Var.f51837b;
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
        return ((m91) this.d.f51837b.get(i7)).f56015a;
    }

    @Override
    public final void f() {
        this.d.f51840c = b();
        super.f();
    }

    @Override
    public final void t(v4.e1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l91.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        u91 u91Var = this.d;
        if (i7 != 0 && i7 != 3) {
            if (i7 == 2) {
                k91 k91Var = new k91(this, u91Var.getParentActivity());
                u91Var.F0 = k91Var;
                return new v4.e1(k91Var);
            }
            org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(viewGroup.getContext(), null);
            pzVar.setViewType(24);
            pzVar.setIsSingleCell(true);
            pzVar.f38448x = true;
            return new v4.e1(pzVar);
        }
        r91 r91Var = new r91(u91Var, viewGroup.getContext(), false);
        if (i7 == 3) {
            i10 = ((org.telegram.ui.ActionBar.e2) u91Var).currentAccount;
            boolean v = org.telegram.messenger.q10.v(org.telegram.messenger.np.s1(i10).a2(Long.valueOf(-u91Var.f51834a)));
            r91Var.setForumIcon(qg.c.d(qg.a.f55558k[0], ""));
            if (!v) {
                i11 = 2131753066;
            } else {
                i11 = 2131753068;
            }
            r91Var.setTitleOverride(org.telegram.messenger.hd.M0(i11, null));
            if (!v) {
                i12 = 2131753067;
            } else {
                i12 = 2131753069;
            }
            r91Var.setCustomMessage(org.telegram.messenger.hd.M0(i12, null));
        }
        z10 = ((org.telegram.ui.ActionBar.e2) u91Var).inPreviewMode;
        r91Var.f31596l0 = z10;
        r91Var.setArchivedPullAnimation(u91Var.f51880x);
        return new v4.e1(r91Var);
    }
}
