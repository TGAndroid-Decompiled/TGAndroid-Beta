package org.telegram.ui.Components;

import android.view.View;
public final class lr0 implements View.OnClickListener {
    public final int f28518a;
    public final qv0 f28519b;

    public lr0(qv0 qv0Var, int i10) {
        this.f28518a = i10;
        this.f28519b = qv0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28518a) {
            case 0:
                this.f28519b.L(true);
                return;
            case 1:
                this.f28519b.C0(102, view);
                return;
            case 2:
                this.f28519b.C0(100, view);
                return;
            case 3:
                this.f28519b.C0(103, view);
                return;
            case 4:
                this.f28519b.C0(104, view);
                return;
            case 5:
                this.f28519b.C0(101, view);
                return;
            case 6:
                qv0 qv0Var = this.f28519b;
                ls0 ls0Var = qv0Var.W;
                gs0 gs0Var = qv0Var.V;
                if (qv0Var.f30250q0.getAlpha() >= 0.1f) {
                    if (gs0Var != null && gs0Var.g()) {
                        gs0Var.i();
                    }
                    if (ls0Var != null && ls0Var.f40689w) {
                        pv0 i12 = qv0Var.i1(qv0Var.h1(qv0Var.getClosestTab()));
                        ju0 W = qv0Var.W(i12.f29850a);
                        if (W != null) {
                            ls0Var.setReorderingAlbums(false);
                            ps0 ps0Var = W.h;
                            for (int i10 = 0; i10 < ps0Var.getChildCount(); i10++) {
                                View childAt = ps0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            ov0 ov0Var = i12.f29852c;
                            if (ov0Var != null && ov0Var.f29160x) {
                                ov0Var.f29160x = false;
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
                org.telegram.ui.ActionBar.n2 n2Var = this.f28519b.f30263v1;
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.kc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
