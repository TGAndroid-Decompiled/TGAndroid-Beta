package org.telegram.ui.Components;

import android.view.View;
public final class dr0 implements View.OnClickListener {
    public final int f22470a;
    public final iv0 f22471b;

    public dr0(iv0 iv0Var, int i10) {
        this.f22470a = i10;
        this.f22471b = iv0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22470a) {
            case 0:
                this.f22471b.L(true);
                return;
            case 1:
                this.f22471b.C0(102, view);
                return;
            case 2:
                this.f22471b.C0(100, view);
                return;
            case 3:
                this.f22471b.C0(103, view);
                return;
            case 4:
                this.f22471b.C0(104, view);
                return;
            case 5:
                this.f22471b.C0(101, view);
                return;
            case 6:
                iv0 iv0Var = this.f22471b;
                cs0 cs0Var = iv0Var.W;
                wr0 wr0Var = iv0Var.V;
                if (iv0Var.f24118q0.getAlpha() >= 0.1f) {
                    if (wr0Var != null && wr0Var.g()) {
                        wr0Var.i();
                    }
                    if (cs0Var != null && cs0Var.f33253w) {
                        hv0 i12 = iv0Var.i1(iv0Var.h1(iv0Var.getClosestTab()));
                        au0 W = iv0Var.W(i12.f23765a);
                        if (W != null) {
                            cs0Var.setReorderingAlbums(false);
                            gs0 gs0Var = W.h;
                            for (int i10 = 0; i10 < gs0Var.getChildCount(); i10++) {
                                View childAt = gs0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.u7) {
                                    ((org.telegram.ui.Cells.u7) childAt).l(false, true);
                                }
                            }
                            gv0 gv0Var = i12.f23767c;
                            if (gv0Var != null && gv0Var.f23091x) {
                                gv0Var.f23091x = false;
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
                org.telegram.ui.ActionBar.p2 p2Var = this.f22471b.f24131v1;
                p2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                bi.ce.E(p2Var.getParentActivity(), p2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
