package org.telegram.ui.Components;

import android.view.View;
public final class ir0 implements View.OnClickListener {
    public final int f25170a;
    public final mv0 f25171b;

    public ir0(mv0 mv0Var, int i10) {
        this.f25170a = i10;
        this.f25171b = mv0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25170a) {
            case 0:
                this.f25171b.L(true);
                return;
            case 1:
                this.f25171b.C0(102, view);
                return;
            case 2:
                this.f25171b.C0(100, view);
                return;
            case 3:
                this.f25171b.C0(103, view);
                return;
            case 4:
                this.f25171b.C0(104, view);
                return;
            case 5:
                this.f25171b.C0(101, view);
                return;
            case 6:
                mv0 mv0Var = this.f25171b;
                hs0 hs0Var = mv0Var.W;
                cs0 cs0Var = mv0Var.V;
                if (mv0Var.f26436q0.getAlpha() >= 0.1f) {
                    if (cs0Var != null && cs0Var.g()) {
                        cs0Var.i();
                    }
                    if (hs0Var != null && hs0Var.f37665w) {
                        lv0 i12 = mv0Var.i1(mv0Var.h1(mv0Var.getClosestTab()));
                        fu0 W = mv0Var.W(i12.f26126a);
                        if (W != null) {
                            hs0Var.setReorderingAlbums(false);
                            ls0 ls0Var = W.h;
                            for (int i10 = 0; i10 < ls0Var.getChildCount(); i10++) {
                                View childAt = ls0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            kv0 kv0Var = i12.f26128c;
                            if (kv0Var != null && kv0Var.f25555x) {
                                kv0Var.f25555x = false;
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
                org.telegram.ui.ActionBar.m2 m2Var = this.f25171b.f26449v1;
                m2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.lc.E(m2Var.getParentActivity(), m2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
