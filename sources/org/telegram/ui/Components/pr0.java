package org.telegram.ui.Components;

import android.view.View;
public final class pr0 implements View.OnClickListener {
    public final int f29372a;
    public final tv0 f29373b;

    public pr0(tv0 tv0Var, int i10) {
        this.f29372a = i10;
        this.f29373b = tv0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29372a) {
            case 0:
                this.f29373b.L(true);
                return;
            case 1:
                this.f29373b.E0(102, view);
                return;
            case 2:
                this.f29373b.E0(100, view);
                return;
            case 3:
                this.f29373b.E0(103, view);
                return;
            case 4:
                this.f29373b.E0(104, view);
                return;
            case 5:
                this.f29373b.E0(101, view);
                return;
            case 6:
                tv0 tv0Var = this.f29373b;
                os0 os0Var = tv0Var.W;
                js0 js0Var = tv0Var.V;
                if (tv0Var.f30719q0.getAlpha() >= 0.1f) {
                    if (js0Var != null && js0Var.g()) {
                        js0Var.i();
                    }
                    if (os0Var != null && os0Var.f36515w) {
                        sv0 k12 = tv0Var.k1(tv0Var.j1(tv0Var.getClosestTab()));
                        mu0 W = tv0Var.W(k12.f30335a);
                        if (W != null) {
                            os0Var.setReorderingAlbums(false);
                            ss0 ss0Var = W.h;
                            for (int i10 = 0; i10 < ss0Var.getChildCount(); i10++) {
                                View childAt = ss0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.s7) {
                                    ((org.telegram.ui.Cells.s7) childAt).l(false, true);
                                }
                            }
                            rv0 rv0Var = k12.f30337c;
                            if (rv0Var != null && rv0Var.f29723x) {
                                rv0Var.f29723x = false;
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
                org.telegram.ui.ActionBar.n2 n2Var = this.f29373b.f30732v1;
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ei.vb.D(n2Var.getParentActivity(), n2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
