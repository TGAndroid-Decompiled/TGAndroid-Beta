package org.telegram.ui.Components;

import android.view.View;
public final class qr0 implements View.OnClickListener {
    public final int f29696a;
    public final uv0 f29697b;

    public qr0(uv0 uv0Var, int i10) {
        this.f29696a = i10;
        this.f29697b = uv0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29696a) {
            case 0:
                this.f29697b.L(true);
                return;
            case 1:
                this.f29697b.E0(102, view);
                return;
            case 2:
                this.f29697b.E0(100, view);
                return;
            case 3:
                this.f29697b.E0(103, view);
                return;
            case 4:
                this.f29697b.E0(104, view);
                return;
            case 5:
                this.f29697b.E0(101, view);
                return;
            case 6:
                uv0 uv0Var = this.f29697b;
                ps0 ps0Var = uv0Var.W;
                ks0 ks0Var = uv0Var.V;
                if (uv0Var.f31062q0.getAlpha() >= 0.1f) {
                    if (ks0Var != null && ks0Var.g()) {
                        ks0Var.i();
                    }
                    if (ps0Var != null && ps0Var.f36526w) {
                        tv0 k12 = uv0Var.k1(uv0Var.j1(uv0Var.getClosestTab()));
                        nu0 W = uv0Var.W(k12.f30685a);
                        if (W != null) {
                            ps0Var.setReorderingAlbums(false);
                            ts0 ts0Var = W.h;
                            for (int i10 = 0; i10 < ts0Var.getChildCount(); i10++) {
                                View childAt = ts0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.s7) {
                                    ((org.telegram.ui.Cells.s7) childAt).l(false, true);
                                }
                            }
                            sv0 sv0Var = k12.f30687c;
                            if (sv0Var != null && sv0Var.f30032x) {
                                sv0Var.f30032x = false;
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
                org.telegram.ui.ActionBar.n2 n2Var = this.f29697b.f31075v1;
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ei.vb.D(n2Var.getParentActivity(), n2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
