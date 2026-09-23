package org.telegram.ui.Components;

import android.view.View;
public final class sq0 implements View.OnClickListener {
    public final int f27970a;
    public final yu0 f27971b;

    public sq0(yu0 yu0Var, int i10) {
        this.f27970a = i10;
        this.f27971b = yu0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27970a) {
            case 0:
                this.f27971b.L(true);
                return;
            case 1:
                this.f27971b.C0(102, view);
                return;
            case 2:
                this.f27971b.C0(100, view);
                return;
            case 3:
                this.f27971b.C0(103, view);
                return;
            case 4:
                this.f27971b.C0(104, view);
                return;
            case 5:
                this.f27971b.C0(101, view);
                return;
            case 6:
                yu0 yu0Var = this.f27971b;
                tr0 tr0Var = yu0Var.W;
                nr0 nr0Var = yu0Var.V;
                if (yu0Var.f30437q0.getAlpha() >= 0.1f) {
                    if (nr0Var != null && nr0Var.g()) {
                        nr0Var.i();
                    }
                    if (tr0Var != null && tr0Var.f37874w) {
                        xu0 i12 = yu0Var.i1(yu0Var.h1(yu0Var.getClosestTab()));
                        rt0 W = yu0Var.W(i12.f30064a);
                        if (W != null) {
                            tr0Var.setReorderingAlbums(false);
                            xr0 xr0Var = W.h;
                            for (int i10 = 0; i10 < xr0Var.getChildCount(); i10++) {
                                View childAt = xr0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            wu0 wu0Var = i12.f30066c;
                            if (wu0Var != null && wu0Var.f29396x) {
                                wu0Var.f29396x = false;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = this.f27971b.f30450v1;
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.lc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
