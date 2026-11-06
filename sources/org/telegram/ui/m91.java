package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class m91 extends rg.b {
    public final v91 d;

    public m91(v91 v91Var) {
        this.d = v91Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f56931f;
        if (i7 != 0 && i7 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        v91 v91Var = this.d;
        v91Var.getClass();
        return v91Var.f50622b;
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
        return ((n91) this.d.f50622b.get(i7)).f54415a;
    }

    @Override
    public final void f() {
        this.d.f50625c = b();
        super.f();
    }

    @Override
    public final void t(v4.d1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m91.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        boolean z9;
        int i10;
        int i11;
        int i12;
        v91 v91Var = this.d;
        if (i7 != 0 && i7 != 3) {
            if (i7 == 2) {
                l91 l91Var = new l91(this, v91Var.getParentActivity());
                v91Var.E0 = l91Var;
                return new v4.d1(l91Var);
            }
            org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(viewGroup.getContext(), null);
            lzVar.setViewType(24);
            lzVar.setIsSingleCell(true);
            lzVar.f35802x = true;
            return new v4.d1(lzVar);
        }
        s91 s91Var = new s91(v91Var, viewGroup.getContext(), false);
        if (i7 == 3) {
            i10 = ((org.telegram.ui.ActionBar.f2) v91Var).currentAccount;
            boolean v = org.telegram.messenger.t10.v(org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(-v91Var.f50619a)));
            s91Var.setForumIcon(qg.d.d(qg.a.f53994k[0], ""));
            if (!v) {
                i11 = 2131753066;
            } else {
                i11 = 2131753068;
            }
            s91Var.setTitleOverride(org.telegram.messenger.hd.M0(i11, null));
            if (!v) {
                i12 = 2131753067;
            } else {
                i12 = 2131753069;
            }
            s91Var.setCustomMessage(org.telegram.messenger.hd.M0(i12, null));
        }
        z9 = ((org.telegram.ui.ActionBar.f2) v91Var).inPreviewMode;
        s91Var.f30434k0 = z9;
        s91Var.setArchivedPullAnimation(v91Var.f50664x);
        return new v4.d1(s91Var);
    }
}
