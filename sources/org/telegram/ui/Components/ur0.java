package org.telegram.ui.Components;

import android.view.View;
public final class ur0 implements View.OnClickListener {
    public final int f29762a;
    public final xv0 f29763b;

    public ur0(xv0 xv0Var, int i10) {
        this.f29762a = i10;
        this.f29763b = xv0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29762a) {
            case 0:
                this.f29763b.L(true);
                return;
            case 1:
                this.f29763b.C0(102, view);
                return;
            case 2:
                this.f29763b.C0(100, view);
                return;
            case 3:
                this.f29763b.C0(103, view);
                return;
            case 4:
                this.f29763b.C0(104, view);
                return;
            case 5:
                this.f29763b.C0(101, view);
                return;
            case 6:
                xv0 xv0Var = this.f29763b;
                ss0 ss0Var = xv0Var.W;
                ns0 ns0Var = xv0Var.V;
                if (xv0Var.f31375q0.getAlpha() >= 0.1f) {
                    if (ns0Var != null && ns0Var.g()) {
                        ns0Var.i();
                    }
                    if (ss0Var != null && ss0Var.f36588w) {
                        wv0 i12 = xv0Var.i1(xv0Var.h1(xv0Var.getClosestTab()));
                        qu0 W = xv0Var.W(i12.f30980a);
                        if (W != null) {
                            ss0Var.setReorderingAlbums(false);
                            ws0 ws0Var = W.h;
                            for (int i10 = 0; i10 < ws0Var.getChildCount(); i10++) {
                                View childAt = ws0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            vv0 vv0Var = i12.f30982c;
                            if (vv0Var != null && vv0Var.f29786x) {
                                vv0Var.f29786x = false;
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
                org.telegram.ui.ActionBar.m2 m2Var = this.f29763b.f31388v1;
                m2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                di.kc.D(m2Var.getParentActivity(), m2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
