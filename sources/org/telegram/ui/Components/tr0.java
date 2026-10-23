package org.telegram.ui.Components;

import android.view.View;
public final class tr0 implements View.OnClickListener {
    public final int f30896a;
    public final xv0 f30897b;

    public tr0(xv0 xv0Var, int i10) {
        this.f30896a = i10;
        this.f30897b = xv0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30896a) {
            case 0:
                this.f30897b.M(true);
                return;
            case 1:
                this.f30897b.F0(102, view);
                return;
            case 2:
                this.f30897b.F0(100, view);
                return;
            case 3:
                this.f30897b.F0(103, view);
                return;
            case 4:
                this.f30897b.F0(104, view);
                return;
            case 5:
                this.f30897b.F0(101, view);
                return;
            case 6:
                xv0 xv0Var = this.f30897b;
                ss0 ss0Var = xv0Var.W;
                ns0 ns0Var = xv0Var.V;
                if (xv0Var.f32698q0.getAlpha() >= 0.1f) {
                    if (ns0Var != null && ns0Var.g()) {
                        ns0Var.i();
                    }
                    if (ss0Var != null && ss0Var.f38040w) {
                        wv0 l1 = xv0Var.l1(xv0Var.k1(xv0Var.getClosestTab()));
                        qu0 X = xv0Var.X(l1.f32355a);
                        if (X != null) {
                            ss0Var.setReorderingAlbums(false);
                            ws0 ws0Var = X.h;
                            for (int i10 = 0; i10 < ws0Var.getChildCount(); i10++) {
                                View childAt = ws0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.s7) {
                                    ((org.telegram.ui.Cells.s7) childAt).l(false, true);
                                }
                            }
                            vv0 vv0Var = l1.f32357c;
                            if (vv0Var != null && vv0Var.f31225x) {
                                vv0Var.f31225x = false;
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
                org.telegram.ui.ActionBar.o2 o2Var = this.f30897b.f32711v1;
                o2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ei.vb.D(o2Var.getParentActivity(), o2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
