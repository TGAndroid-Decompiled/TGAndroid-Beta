package org.telegram.ui.Components;

import android.view.View;
public final class kr0 implements View.OnClickListener {
    public final int f28188a;
    public final pv0 f28189b;

    public kr0(pv0 pv0Var, int i10) {
        this.f28188a = i10;
        this.f28189b = pv0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28188a) {
            case 0:
                this.f28189b.L(true);
                return;
            case 1:
                this.f28189b.C0(102, view);
                return;
            case 2:
                this.f28189b.C0(100, view);
                return;
            case 3:
                this.f28189b.C0(103, view);
                return;
            case 4:
                this.f28189b.C0(104, view);
                return;
            case 5:
                this.f28189b.C0(101, view);
                return;
            case 6:
                pv0 pv0Var = this.f28189b;
                ks0 ks0Var = pv0Var.W;
                fs0 fs0Var = pv0Var.V;
                if (pv0Var.f29788q0.getAlpha() >= 0.1f) {
                    if (fs0Var != null && fs0Var.g()) {
                        fs0Var.i();
                    }
                    if (ks0Var != null && ks0Var.f40671w) {
                        ov0 i12 = pv0Var.i1(pv0Var.h1(pv0Var.getClosestTab()));
                        iu0 W = pv0Var.W(i12.f29455a);
                        if (W != null) {
                            ks0Var.setReorderingAlbums(false);
                            os0 os0Var = W.h;
                            for (int i10 = 0; i10 < os0Var.getChildCount(); i10++) {
                                View childAt = os0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            nv0 nv0Var = i12.f29457c;
                            if (nv0Var != null && nv0Var.f28732x) {
                                nv0Var.f28732x = false;
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
                org.telegram.ui.ActionBar.n2 n2Var = this.f28189b.f29801v1;
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.kc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
