package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class d91 extends sg.b {
    public final m91 d;

    public d91(m91 m91Var) {
        this.d = m91Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 0 && i3 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        m91 m91Var = this.d;
        m91Var.getClass();
        return m91Var.f47578b;
    }

    @Override
    public final int b() {
        return F().size() + 1;
    }

    @Override
    public final int d(int i3) {
        if (i3 == b() - 1) {
            return 2;
        }
        return ((e91) this.d.f47578b.get(i3)).f54715a;
    }

    @Override
    public final void f() {
        this.d.f47581c = b();
        super.f();
    }

    @Override
    public final void t(u4.d1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d91.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        m91 m91Var = this.d;
        if (i3 != 0 && i3 != 3) {
            if (i3 == 2) {
                c91 c91Var = new c91(this, m91Var.getParentActivity());
                m91Var.F0 = c91Var;
                return new u4.d1(c91Var);
            }
            org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(viewGroup.getContext(), null);
            izVar.setViewType(24);
            izVar.setIsSingleCell(true);
            izVar.f34869x = true;
            return new u4.d1(izVar);
        }
        j91 j91Var = new j91(m91Var, viewGroup.getContext(), false);
        if (i3 == 3) {
            i10 = ((org.telegram.ui.ActionBar.d2) m91Var).currentAccount;
            boolean v = org.telegram.messenger.l10.v(org.telegram.messenger.hp.s1(i10).a2(Long.valueOf(-m91Var.f47575a)));
            j91Var.setForumIcon(rg.c.d(rg.a.f54504k[0], ""));
            if (!v) {
                i11 = 2131753066;
            } else {
                i11 = 2131753068;
            }
            j91Var.setTitleOverride(org.telegram.messenger.bd.M0(i11, null));
            if (!v) {
                i12 = 2131753067;
            } else {
                i12 = 2131753069;
            }
            j91Var.setCustomMessage(org.telegram.messenger.bd.M0(i12, null));
        }
        z10 = ((org.telegram.ui.ActionBar.d2) m91Var).inPreviewMode;
        j91Var.f30519l0 = z10;
        j91Var.setArchivedPullAnimation(m91Var.f47621x);
        return new u4.d1(j91Var);
    }
}
