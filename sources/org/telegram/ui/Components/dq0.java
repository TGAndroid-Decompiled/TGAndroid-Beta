package org.telegram.ui.Components;

import android.view.View;

public final class dq0 implements View.OnClickListener {

    public final int f27830a;

    public final hu0 f27831b;

    public dq0(hu0 hu0Var, int i10) {
        this.f27830a = i10;
        this.f27831b = hu0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27830a) {
            case 0:
                this.f27831b.L(true);
                break;
            case 1:
                this.f27831b.C0(102, view);
                break;
            case 2:
                this.f27831b.C0(100, view);
                break;
            case 3:
                this.f27831b.C0(103, view);
                break;
            case 4:
                this.f27831b.C0(104, view);
                break;
            case 5:
                this.f27831b.C0(101, view);
                break;
            case 6:
                hu0 hu0Var = this.f27831b;
                ar0 ar0Var = hu0Var.S;
                wq0 wq0Var = hu0Var.R;
                if (hu0Var.m0.getAlpha() >= 0.1f) {
                    if (wq0Var != null && wq0Var.g()) {
                        wq0Var.i();
                    }
                    if (ar0Var != null && ar0Var.f44658w) {
                        gu0 gu0VarI1 = hu0Var.i1(hu0Var.h1(hu0Var.getClosestTab()));
                        zs0 zs0VarW = hu0Var.W(gu0VarI1.f28825a);
                        if (zs0VarW != null) {
                            ar0Var.setReorderingAlbums(false);
                            er0 er0Var = zs0VarW.h;
                            for (int i10 = 0; i10 < er0Var.getChildCount(); i10++) {
                                View childAt = er0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.o7) {
                                    ((org.telegram.ui.Cells.o7) childAt).l(false, true);
                                }
                            }
                            fu0 fu0Var = gu0VarI1.f28827c;
                            if (fu0Var != null && fu0Var.f28157x) {
                                fu0Var.f28157x = false;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = this.f27831b.f29145r1;
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                lh.sb.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                break;
        }
    }
}
