package org.telegram.ui.Components;

import android.view.View;
public final class fr0 implements View.OnClickListener {
    public final int f24245a;
    public final jv0 f24246b;

    public fr0(jv0 jv0Var, int i10) {
        this.f24245a = i10;
        this.f24246b = jv0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24245a) {
            case 0:
                this.f24246b.L(true);
                return;
            case 1:
                this.f24246b.C0(102, view);
                return;
            case 2:
                this.f24246b.C0(100, view);
                return;
            case 3:
                this.f24246b.C0(103, view);
                return;
            case 4:
                this.f24246b.C0(104, view);
                return;
            case 5:
                this.f24246b.C0(101, view);
                return;
            case 6:
                jv0 jv0Var = this.f24246b;
                es0 es0Var = jv0Var.W;
                zr0 zr0Var = jv0Var.V;
                if (jv0Var.f25530q0.getAlpha() >= 0.1f) {
                    if (zr0Var != null && zr0Var.g()) {
                        zr0Var.i();
                    }
                    if (es0Var != null && es0Var.f37554w) {
                        iv0 i12 = jv0Var.i1(jv0Var.h1(jv0Var.getClosestTab()));
                        cu0 W = jv0Var.W(i12.f25147a);
                        if (W != null) {
                            es0Var.setReorderingAlbums(false);
                            is0 is0Var = W.h;
                            for (int i10 = 0; i10 < is0Var.getChildCount(); i10++) {
                                View childAt = is0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            hv0 hv0Var = i12.f25149c;
                            if (hv0Var != null && hv0Var.f24532x) {
                                hv0Var.f24532x = false;
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
                org.telegram.ui.ActionBar.m2 m2Var = this.f24246b.f25543v1;
                m2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.lc.E(m2Var.getParentActivity(), m2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
