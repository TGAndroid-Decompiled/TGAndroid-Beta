package org.telegram.ui.Components;

import android.view.View;
public final class wq0 implements View.OnClickListener {
    public final int f30337a;
    public final yu0 f30338b;

    public wq0(yu0 yu0Var, int i10) {
        this.f30337a = i10;
        this.f30338b = yu0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30337a) {
            case 0:
                this.f30338b.L(true);
                return;
            case 1:
                this.f30338b.C0(102, view);
                return;
            case 2:
                this.f30338b.C0(100, view);
                return;
            case 3:
                this.f30338b.C0(103, view);
                return;
            case 4:
                this.f30338b.C0(104, view);
                return;
            case 5:
                this.f30338b.C0(101, view);
                return;
            case 6:
                yu0 yu0Var = this.f30338b;
                sr0 sr0Var = yu0Var.T;
                or0 or0Var = yu0Var.S;
                if (yu0Var.f31142n0.getAlpha() >= 0.1f) {
                    if (or0Var != null && or0Var.g()) {
                        or0Var.i();
                    }
                    if (sr0Var != null && sr0Var.f37280w) {
                        xu0 i12 = yu0Var.i1(yu0Var.h1(yu0Var.getClosestTab()));
                        qt0 W = yu0Var.W(i12.f30717a);
                        if (W != null) {
                            sr0Var.setReorderingAlbums(false);
                            wr0 wr0Var = W.h;
                            for (int i10 = 0; i10 < wr0Var.getChildCount(); i10++) {
                                View childAt = wr0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.q7) {
                                    ((org.telegram.ui.Cells.q7) childAt).l(false, true);
                                }
                            }
                            wu0 wu0Var = i12.f30719c;
                            if (wu0Var != null && wu0Var.f30057x) {
                                wu0Var.f30057x = false;
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
                org.telegram.ui.ActionBar.p2 p2Var = this.f30338b.f31155s1;
                p2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ph.da.E(p2Var.getParentActivity(), p2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
