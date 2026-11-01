package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class eb1 extends hg.c {
    public final nb1 d;

    public eb1(nb1 nb1Var) {
        this.d = nb1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        nb1 nb1Var = this.d;
        nb1Var.getClass();
        return nb1Var.f39800b;
    }

    @Override
    public final int b() {
        return F().size() + 1;
    }

    @Override
    public final int d(int i10) {
        if (i10 == b() - 1) {
            return 2;
        }
        return ((fb1) this.d.f39800b.get(i10)).f7681a;
    }

    @Override
    public final void f() {
        this.d.f39803c = b();
        super.f();
    }

    @Override
    public final void t(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eb1.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        nb1 nb1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                db1 db1Var = new db1(this, nb1Var.getParentActivity());
                nb1Var.E0 = db1Var;
                return new s4.c1(db1Var);
            }
            org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(viewGroup.getContext(), null);
            zzVar.setViewType(24);
            zzVar.setIsSingleCell(true);
            zzVar.f33280x = true;
            return new s4.c1(zzVar);
        }
        kb1 kb1Var = new kb1(nb1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.k2) nb1Var).currentAccount;
            boolean v = org.telegram.messenger.i20.v(org.telegram.messenger.wp.r1(i11).Z1(Long.valueOf(-nb1Var.f39797a)));
            kb1Var.setForumIcon(gg.e.d(gg.a.f7493k[0], ""));
            if (!v) {
                i12 = 2131753066;
            } else {
                i12 = 2131753068;
            }
            kb1Var.setTitleOverride(org.telegram.messenger.dd.L0(i12, null));
            if (!v) {
                i13 = 2131753067;
            } else {
                i13 = 2131753069;
            }
            kb1Var.setCustomMessage(org.telegram.messenger.dd.L0(i13, null));
        }
        z10 = ((org.telegram.ui.ActionBar.k2) nb1Var).inPreviewMode;
        kb1Var.f23224k0 = z10;
        kb1Var.setArchivedPullAnimation(nb1Var.f39842x);
        return new s4.c1(kb1Var);
    }
}
