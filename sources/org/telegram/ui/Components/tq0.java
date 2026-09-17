package org.telegram.ui.Components;

import android.view.View;
public final class tq0 implements View.OnClickListener {
    public final int f28188a;
    public final zu0 f28189b;

    public tq0(zu0 zu0Var, int i10) {
        this.f28188a = i10;
        this.f28189b = zu0Var;
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
                zu0 zu0Var = this.f28189b;
                ur0 ur0Var = zu0Var.W;
                or0 or0Var = zu0Var.V;
                if (zu0Var.f30643q0.getAlpha() >= 0.1f) {
                    if (or0Var != null && or0Var.g()) {
                        or0Var.i();
                    }
                    if (ur0Var != null && ur0Var.f32648w) {
                        yu0 i12 = zu0Var.i1(zu0Var.h1(zu0Var.getClosestTab()));
                        st0 W = zu0Var.W(i12.f30325a);
                        if (W != null) {
                            ur0Var.setReorderingAlbums(false);
                            yr0 yr0Var = W.h;
                            for (int i10 = 0; i10 < yr0Var.getChildCount(); i10++) {
                                View childAt = yr0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            xu0 xu0Var = i12.f30327c;
                            if (xu0Var != null && xu0Var.f29754x) {
                                xu0Var.f29754x = false;
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
                org.telegram.ui.ActionBar.o2 o2Var = this.f28189b.f30656v1;
                o2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.oc.E(o2Var.getParentActivity(), o2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
