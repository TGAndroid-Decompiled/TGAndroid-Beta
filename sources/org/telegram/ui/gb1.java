package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class gb1 extends hg.c {
    public final pb1 d;

    public gb1(pb1 pb1Var) {
        this.d = pb1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        pb1 pb1Var = this.d;
        pb1Var.getClass();
        return pb1Var.f40569b;
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
        return ((hb1) this.d.f40569b.get(i10)).f7680a;
    }

    @Override
    public final void f() {
        this.d.f40572c = b();
        super.f();
    }

    @Override
    public final void t(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gb1.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        pb1 pb1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                fb1 fb1Var = new fb1(this, pb1Var.getParentActivity());
                pb1Var.E0 = fb1Var;
                return new s4.c1(fb1Var);
            }
            org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(viewGroup.getContext(), null);
            zzVar.setViewType(24);
            zzVar.setIsSingleCell(true);
            zzVar.f33274x = true;
            return new s4.c1(zzVar);
        }
        mb1 mb1Var = new mb1(pb1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.k2) pb1Var).currentAccount;
            boolean v = org.telegram.messenger.h20.v(org.telegram.messenger.vp.r1(i11).Z1(Long.valueOf(-pb1Var.f40566a)));
            mb1Var.setForumIcon(gg.e.d(gg.a.f7492k[0], ""));
            if (!v) {
                i12 = 2131753066;
            } else {
                i12 = 2131753068;
            }
            mb1Var.setTitleOverride(org.telegram.messenger.cd.L0(i12, null));
            if (!v) {
                i13 = 2131753067;
            } else {
                i13 = 2131753069;
            }
            mb1Var.setCustomMessage(org.telegram.messenger.cd.L0(i13, null));
        }
        z10 = ((org.telegram.ui.ActionBar.k2) pb1Var).inPreviewMode;
        mb1Var.f23223k0 = z10;
        mb1Var.setArchivedPullAnimation(pb1Var.f40611x);
        return new s4.c1(mb1Var);
    }
}
