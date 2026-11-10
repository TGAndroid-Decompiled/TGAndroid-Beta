package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class q91 extends rg.b {
    public final z91 d;

    public q91(z91 z91Var) {
        this.d = z91Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57056f;
        if (i7 != 0 && i7 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        z91 z91Var = this.d;
        z91Var.getClass();
        return z91Var.f52346b;
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
        return ((r91) this.d.f52346b.get(i7)).f54543a;
    }

    @Override
    public final void f() {
        this.d.f52349c = b();
        super.f();
    }

    @Override
    public final void t(v4.d1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q91.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        boolean z9;
        int i10;
        int i11;
        int i12;
        z91 z91Var = this.d;
        if (i7 != 0 && i7 != 3) {
            if (i7 == 2) {
                p91 p91Var = new p91(this, z91Var.getParentActivity());
                z91Var.E0 = p91Var;
                return new v4.d1(p91Var);
            }
            org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(viewGroup.getContext(), null);
            lzVar.setViewType(24);
            lzVar.setIsSingleCell(true);
            lzVar.f35774x = true;
            return new v4.d1(lzVar);
        }
        w91 w91Var = new w91(z91Var, viewGroup.getContext(), false);
        if (i7 == 3) {
            i10 = ((org.telegram.ui.ActionBar.f2) z91Var).currentAccount;
            boolean v = org.telegram.messenger.t10.v(org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(-z91Var.f52343a)));
            w91Var.setForumIcon(qg.d.d(qg.a.f54123k[0], ""));
            if (!v) {
                i11 = 2131753066;
            } else {
                i11 = 2131753068;
            }
            w91Var.setTitleOverride(org.telegram.messenger.id.M0(i11, null));
            if (!v) {
                i12 = 2131753067;
            } else {
                i12 = 2131753069;
            }
            w91Var.setCustomMessage(org.telegram.messenger.id.M0(i12, null));
        }
        z9 = ((org.telegram.ui.ActionBar.f2) z91Var).inPreviewMode;
        w91Var.f30454k0 = z9;
        w91Var.setArchivedPullAnimation(z91Var.f52388x);
        return new v4.d1(w91Var);
    }
}
