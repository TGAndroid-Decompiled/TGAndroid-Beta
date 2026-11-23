package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class p91 extends rg.b {
    public final y91 d;

    public p91(y91 y91Var) {
        this.d = y91Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59169f;
        if (i7 != 0 && i7 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        y91 y91Var = this.d;
        y91Var.getClass();
        return y91Var.f54102b;
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
        return ((q91) this.d.f54102b.get(i7)).f56634a;
    }

    @Override
    public final void f() {
        this.d.f54105c = b();
        super.f();
    }

    @Override
    public final void t(v4.f1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p91.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        y91 y91Var = this.d;
        if (i7 != 0 && i7 != 3) {
            if (i7 == 2) {
                o91 o91Var = new o91(this, y91Var.getParentActivity());
                y91Var.F0 = o91Var;
                return new v4.f1(o91Var);
            }
            org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(viewGroup.getContext(), null);
            yzVar.setViewType(24);
            yzVar.setIsSingleCell(true);
            yzVar.f42605x = true;
            return new v4.f1(yzVar);
        }
        v91 v91Var = new v91(y91Var, viewGroup.getContext(), false);
        if (i7 == 3) {
            i10 = ((org.telegram.ui.ActionBar.g2) y91Var).currentAccount;
            boolean w10 = org.telegram.messenger.p10.w(org.telegram.messenger.np.u1(i10).c2(Long.valueOf(-y91Var.f54099a)));
            v91Var.setForumIcon(qg.c.e(qg.a.f56177k[0], ""));
            if (!w10) {
                i11 = 2131753063;
            } else {
                i11 = 2131753065;
            }
            v91Var.setTitleOverride(org.telegram.messenger.hd.N0(i11, null));
            if (!w10) {
                i12 = 2131753064;
            } else {
                i12 = 2131753066;
            }
            v91Var.setCustomMessage(org.telegram.messenger.hd.N0(i12, null));
        }
        z10 = ((org.telegram.ui.ActionBar.g2) y91Var).inPreviewMode;
        v91Var.f31977l0 = z10;
        v91Var.setArchivedPullAnimation(y91Var.f54146x);
        return new v4.f1(v91Var);
    }
}
