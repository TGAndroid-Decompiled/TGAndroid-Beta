package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class p91 extends rg.b {
    public final y91 d;

    public p91(y91 y91Var) {
        this.d = y91Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57060f;
        if (i7 != 0 && i7 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        y91 y91Var = this.d;
        y91Var.getClass();
        return y91Var.f52016b;
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
        return ((q91) this.d.f52016b.get(i7)).f54544a;
    }

    @Override
    public final void f() {
        this.d.f52019c = b();
        super.f();
    }

    @Override
    public final void t(v4.d1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p91.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        boolean z9;
        int i10;
        int i11;
        int i12;
        y91 y91Var = this.d;
        if (i7 != 0 && i7 != 3) {
            if (i7 == 2) {
                o91 o91Var = new o91(this, y91Var.getParentActivity());
                y91Var.E0 = o91Var;
                return new v4.d1(o91Var);
            }
            org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(viewGroup.getContext(), null);
            mzVar.setViewType(24);
            mzVar.setIsSingleCell(true);
            mzVar.f36181x = true;
            return new v4.d1(mzVar);
        }
        v91 v91Var = new v91(y91Var, viewGroup.getContext(), false);
        if (i7 == 3) {
            i10 = ((org.telegram.ui.ActionBar.f2) y91Var).currentAccount;
            boolean v = org.telegram.messenger.t10.v(org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(-y91Var.f52013a)));
            v91Var.setForumIcon(qg.d.d(qg.a.f54124k[0], ""));
            if (!v) {
                i11 = 2131753066;
            } else {
                i11 = 2131753068;
            }
            v91Var.setTitleOverride(org.telegram.messenger.id.M0(i11, null));
            if (!v) {
                i12 = 2131753067;
            } else {
                i12 = 2131753069;
            }
            v91Var.setCustomMessage(org.telegram.messenger.id.M0(i12, null));
        }
        z9 = ((org.telegram.ui.ActionBar.f2) y91Var).inPreviewMode;
        v91Var.f30443k0 = z9;
        v91Var.setArchivedPullAnimation(y91Var.f52058x);
        return new v4.d1(v91Var);
    }
}
