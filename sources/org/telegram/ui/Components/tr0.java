package org.telegram.ui.Components;

import android.view.View;
public final class tr0 implements View.OnClickListener {
    public final int f29182a;
    public final xv0 f29183b;

    public tr0(xv0 xv0Var, int i10) {
        this.f29182a = i10;
        this.f29183b = xv0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29182a) {
            case 0:
                this.f29183b.L(true);
                return;
            case 1:
                this.f29183b.D0(102, view);
                return;
            case 2:
                this.f29183b.D0(100, view);
                return;
            case 3:
                this.f29183b.D0(103, view);
                return;
            case 4:
                this.f29183b.D0(104, view);
                return;
            case 5:
                this.f29183b.D0(101, view);
                return;
            case 6:
                xv0 xv0Var = this.f29183b;
                ss0 ss0Var = xv0Var.W;
                ns0 ns0Var = xv0Var.V;
                if (xv0Var.f31056q0.getAlpha() >= 0.1f) {
                    if (ns0Var != null && ns0Var.g()) {
                        ns0Var.i();
                    }
                    if (ss0Var != null && ss0Var.f36378w) {
                        wv0 j12 = xv0Var.j1(xv0Var.i1(xv0Var.getClosestTab()));
                        qu0 W = xv0Var.W(j12.f30672a);
                        if (W != null) {
                            ss0Var.setReorderingAlbums(false);
                            ws0 ws0Var = W.h;
                            for (int i10 = 0; i10 < ws0Var.getChildCount(); i10++) {
                                View childAt = ws0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            vv0 vv0Var = j12.f30674c;
                            if (vv0Var != null && vv0Var.f29454x) {
                                vv0Var.f29454x = false;
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
                org.telegram.ui.ActionBar.m2 m2Var = this.f29183b.f31069v1;
                m2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                di.kc.D(m2Var.getParentActivity(), m2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
