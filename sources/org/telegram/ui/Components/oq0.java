package org.telegram.ui.Components;

import android.view.View;
public final class oq0 implements View.OnClickListener {
    public final int f31454a;
    public final qu0 f31455b;

    public oq0(qu0 qu0Var, int i10) {
        this.f31454a = i10;
        this.f31455b = qu0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31454a) {
            case 0:
                this.f31455b.L(true);
                return;
            case 1:
                this.f31455b.C0(102, view);
                return;
            case 2:
                this.f31455b.C0(100, view);
                return;
            case 3:
                this.f31455b.C0(103, view);
                return;
            case 4:
                this.f31455b.C0(104, view);
                return;
            case 5:
                this.f31455b.C0(101, view);
                return;
            case 6:
                qu0 qu0Var = this.f31455b;
                kr0 kr0Var = qu0Var.S;
                gr0 gr0Var = qu0Var.R;
                if (qu0Var.m0.getAlpha() >= 0.1f) {
                    if (gr0Var != null && gr0Var.g()) {
                        gr0Var.i();
                    }
                    if (kr0Var != null && kr0Var.f44689w) {
                        pu0 i12 = qu0Var.i1(qu0Var.h1(qu0Var.getClosestTab()));
                        it0 W = qu0Var.W(i12.f31773a);
                        if (W != null) {
                            kr0Var.setReorderingAlbums(false);
                            or0 or0Var = W.h;
                            for (int i10 = 0; i10 < or0Var.getChildCount(); i10++) {
                                View childAt = or0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.p7) {
                                    ((org.telegram.ui.Cells.p7) childAt).l(false, true);
                                }
                            }
                            ou0 ou0Var = i12.f31775c;
                            if (ou0Var != null && ou0Var.f31153x) {
                                ou0Var.f31153x = false;
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
                org.telegram.ui.ActionBar.o2 o2Var = this.f31455b.f32093r1;
                o2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                nh.gb.E(o2Var.getParentActivity(), o2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
