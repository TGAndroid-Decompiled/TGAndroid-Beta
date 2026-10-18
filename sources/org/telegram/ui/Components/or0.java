package org.telegram.ui.Components;

import android.view.View;
public final class or0 implements View.OnClickListener {
    public final int f29061a;
    public final sv0 f29062b;

    public or0(sv0 sv0Var, int i10) {
        this.f29061a = i10;
        this.f29062b = sv0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29061a) {
            case 0:
                this.f29062b.L(true);
                return;
            case 1:
                this.f29062b.E0(102, view);
                return;
            case 2:
                this.f29062b.E0(100, view);
                return;
            case 3:
                this.f29062b.E0(103, view);
                return;
            case 4:
                this.f29062b.E0(104, view);
                return;
            case 5:
                this.f29062b.E0(101, view);
                return;
            case 6:
                sv0 sv0Var = this.f29062b;
                ns0 ns0Var = sv0Var.W;
                is0 is0Var = sv0Var.V;
                if (sv0Var.f30382q0.getAlpha() >= 0.1f) {
                    if (is0Var != null && is0Var.g()) {
                        is0Var.i();
                    }
                    if (ns0Var != null && ns0Var.f37081w) {
                        rv0 k12 = sv0Var.k1(sv0Var.j1(sv0Var.getClosestTab()));
                        lu0 W = sv0Var.W(k12.f30065a);
                        if (W != null) {
                            ns0Var.setReorderingAlbums(false);
                            rs0 rs0Var = W.h;
                            for (int i10 = 0; i10 < rs0Var.getChildCount(); i10++) {
                                View childAt = rs0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.s7) {
                                    ((org.telegram.ui.Cells.s7) childAt).l(false, true);
                                }
                            }
                            qv0 qv0Var = k12.f30067c;
                            if (qv0Var != null && qv0Var.f29444x) {
                                qv0Var.f29444x = false;
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
                org.telegram.ui.ActionBar.n2 n2Var = this.f29062b.f30395v1;
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ei.vb.D(n2Var.getParentActivity(), n2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
