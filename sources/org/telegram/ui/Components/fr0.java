package org.telegram.ui.Components;

import android.view.View;
public final class fr0 implements View.OnClickListener {
    public final int f24156a;
    public final jv0 f24157b;

    public fr0(jv0 jv0Var, int i10) {
        this.f24156a = i10;
        this.f24157b = jv0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24156a) {
            case 0:
                this.f24157b.L(true);
                return;
            case 1:
                this.f24157b.C0(102, view);
                return;
            case 2:
                this.f24157b.C0(100, view);
                return;
            case 3:
                this.f24157b.C0(103, view);
                return;
            case 4:
                this.f24157b.C0(104, view);
                return;
            case 5:
                this.f24157b.C0(101, view);
                return;
            case 6:
                jv0 jv0Var = this.f24157b;
                es0 es0Var = jv0Var.W;
                yr0 yr0Var = jv0Var.V;
                if (jv0Var.f25515q0.getAlpha() >= 0.1f) {
                    if (yr0Var != null && yr0Var.g()) {
                        yr0Var.i();
                    }
                    if (es0Var != null && es0Var.f31966w) {
                        iv0 i12 = jv0Var.i1(jv0Var.h1(jv0Var.getClosestTab()));
                        cu0 W = jv0Var.W(i12.f25136a);
                        if (W != null) {
                            es0Var.setReorderingAlbums(false);
                            is0 is0Var = W.h;
                            for (int i10 = 0; i10 < is0Var.getChildCount(); i10++) {
                                View childAt = is0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.u7) {
                                    ((org.telegram.ui.Cells.u7) childAt).l(false, true);
                                }
                            }
                            hv0 hv0Var = i12.f25138c;
                            if (hv0Var != null && hv0Var.f24462x) {
                                hv0Var.f24462x = false;
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
                org.telegram.ui.ActionBar.n2 n2Var = this.f24157b.f25528v1;
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.oc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
