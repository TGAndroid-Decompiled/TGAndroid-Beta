package org.telegram.ui.Components;

import android.view.View;
public final class zr0 implements View.OnClickListener {
    public final int f33642a;
    public final dw0 f33643b;

    public zr0(dw0 dw0Var, int i10) {
        this.f33642a = i10;
        this.f33643b = dw0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33642a) {
            case 0:
                this.f33643b.L(true);
                return;
            case 1:
                this.f33643b.C0(102, view);
                return;
            case 2:
                this.f33643b.C0(100, view);
                return;
            case 3:
                this.f33643b.C0(103, view);
                return;
            case 4:
                this.f33643b.C0(104, view);
                return;
            case 5:
                this.f33643b.C0(101, view);
                return;
            case 6:
                dw0 dw0Var = this.f33643b;
                ys0 ys0Var = dw0Var.W;
                ts0 ts0Var = dw0Var.V;
                if (dw0Var.f25722q0.getAlpha() >= 0.1f) {
                    if (ts0Var != null && ts0Var.g()) {
                        ts0Var.i();
                    }
                    if (ys0Var != null && ys0Var.f44559w) {
                        cw0 i12 = dw0Var.i1(dw0Var.h1(dw0Var.getClosestTab()));
                        wu0 W = dw0Var.W(i12.f25332a);
                        if (W != null) {
                            ys0Var.setReorderingAlbums(false);
                            ct0 ct0Var = W.h;
                            for (int i10 = 0; i10 < ct0Var.getChildCount(); i10++) {
                                View childAt = ct0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            bw0 bw0Var = i12.f25334c;
                            if (bw0Var != null && bw0Var.f24610x) {
                                bw0Var.f24610x = false;
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
                org.telegram.ui.ActionBar.m2 m2Var = this.f33643b.f25735v1;
                m2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.lc.D(m2Var.getParentActivity(), m2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
