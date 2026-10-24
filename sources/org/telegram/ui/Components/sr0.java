package org.telegram.ui.Components;

import android.view.View;
public final class sr0 implements View.OnClickListener {
    public final int f30616a;
    public final wv0 f30617b;

    public sr0(wv0 wv0Var, int i10) {
        this.f30616a = i10;
        this.f30617b = wv0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30616a) {
            case 0:
                this.f30617b.M(true);
                return;
            case 1:
                this.f30617b.F0(102, view);
                return;
            case 2:
                this.f30617b.F0(100, view);
                return;
            case 3:
                this.f30617b.F0(103, view);
                return;
            case 4:
                this.f30617b.F0(104, view);
                return;
            case 5:
                this.f30617b.F0(101, view);
                return;
            case 6:
                wv0 wv0Var = this.f30617b;
                rs0 rs0Var = wv0Var.W;
                ms0 ms0Var = wv0Var.V;
                if (wv0Var.f32397q0.getAlpha() >= 0.1f) {
                    if (ms0Var != null && ms0Var.g()) {
                        ms0Var.i();
                    }
                    if (rs0Var != null && rs0Var.f37717w) {
                        vv0 l1 = wv0Var.l1(wv0Var.k1(wv0Var.getClosestTab()));
                        pu0 X = wv0Var.X(l1.f32053a);
                        if (X != null) {
                            rs0Var.setReorderingAlbums(false);
                            vs0 vs0Var = X.h;
                            for (int i10 = 0; i10 < vs0Var.getChildCount(); i10++) {
                                View childAt = vs0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.s7) {
                                    ((org.telegram.ui.Cells.s7) childAt).l(false, true);
                                }
                            }
                            uv0 uv0Var = l1.f32055c;
                            if (uv0Var != null && uv0Var.f30904x) {
                                uv0Var.f30904x = false;
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
                org.telegram.ui.ActionBar.o2 o2Var = this.f30617b.f32410v1;
                o2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ei.vb.D(o2Var.getParentActivity(), o2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
