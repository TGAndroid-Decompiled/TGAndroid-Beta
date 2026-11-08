package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class n91 extends rg.b {
    public final w91 d;

    public n91(w91 w91Var) {
        this.d = w91Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57048f;
        if (i7 != 0 && i7 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        w91 w91Var = this.d;
        w91Var.getClass();
        return w91Var.f50995b;
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
        return ((o91) this.d.f50995b.get(i7)).f54532a;
    }

    @Override
    public final void f() {
        this.d.f50998c = b();
        super.f();
    }

    @Override
    public final void t(v4.d1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n91.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        boolean z9;
        int i10;
        int i11;
        int i12;
        w91 w91Var = this.d;
        if (i7 != 0 && i7 != 3) {
            if (i7 == 2) {
                m91 m91Var = new m91(this, w91Var.getParentActivity());
                w91Var.E0 = m91Var;
                return new v4.d1(m91Var);
            }
            org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(viewGroup.getContext(), null);
            mzVar.setViewType(24);
            mzVar.setIsSingleCell(true);
            mzVar.f36172x = true;
            return new v4.d1(mzVar);
        }
        t91 t91Var = new t91(w91Var, viewGroup.getContext(), false);
        if (i7 == 3) {
            i10 = ((org.telegram.ui.ActionBar.f2) w91Var).currentAccount;
            boolean v = org.telegram.messenger.t10.v(org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(-w91Var.f50992a)));
            t91Var.setForumIcon(qg.d.d(qg.a.f54112k[0], ""));
            if (!v) {
                i11 = 2131753066;
            } else {
                i11 = 2131753068;
            }
            t91Var.setTitleOverride(org.telegram.messenger.id.M0(i11, null));
            if (!v) {
                i12 = 2131753067;
            } else {
                i12 = 2131753069;
            }
            t91Var.setCustomMessage(org.telegram.messenger.id.M0(i12, null));
        }
        z9 = ((org.telegram.ui.ActionBar.f2) w91Var).inPreviewMode;
        t91Var.f30439k0 = z9;
        t91Var.setArchivedPullAnimation(w91Var.f51037x);
        return new v4.d1(t91Var);
    }
}
