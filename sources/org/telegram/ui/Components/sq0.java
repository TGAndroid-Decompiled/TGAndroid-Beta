package org.telegram.ui.Components;

import android.view.View;
public final class sq0 implements View.OnClickListener {
    public final int f30399a;
    public final xu0 f30400b;

    public sq0(xu0 xu0Var, int i10) {
        this.f30399a = i10;
        this.f30400b = xu0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30399a) {
            case 0:
                this.f30400b.L(true);
                return;
            case 1:
                this.f30400b.C0(102, view);
                return;
            case 2:
                this.f30400b.C0(100, view);
                return;
            case 3:
                this.f30400b.C0(103, view);
                return;
            case 4:
                this.f30400b.C0(104, view);
                return;
            case 5:
                this.f30400b.C0(101, view);
                return;
            case 6:
                xu0 xu0Var = this.f30400b;
                sr0 sr0Var = xu0Var.W;
                nr0 nr0Var = xu0Var.V;
                if (xu0Var.f32713q0.getAlpha() >= 0.1f) {
                    if (nr0Var != null && nr0Var.g()) {
                        nr0Var.i();
                    }
                    if (sr0Var != null && sr0Var.f35629w) {
                        wu0 i12 = xu0Var.i1(xu0Var.h1(xu0Var.getClosestTab()));
                        qt0 W = xu0Var.W(i12.f32342a);
                        if (W != null) {
                            sr0Var.setReorderingAlbums(false);
                            wr0 wr0Var = W.h;
                            for (int i10 = 0; i10 < wr0Var.getChildCount(); i10++) {
                                View childAt = wr0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            vu0 vu0Var = i12.f32344c;
                            if (vu0Var != null && vu0Var.f30986x) {
                                vu0Var.f30986x = false;
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
                org.telegram.ui.ActionBar.n2 n2Var = this.f30400b.f32726v1;
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                di.pc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
