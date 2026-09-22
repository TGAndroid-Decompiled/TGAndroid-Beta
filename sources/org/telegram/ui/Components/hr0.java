package org.telegram.ui.Components;

import android.view.View;
public final class hr0 implements View.OnClickListener {
    public final int f24873a;
    public final lv0 f24874b;

    public hr0(lv0 lv0Var, int i10) {
        this.f24873a = i10;
        this.f24874b = lv0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24873a) {
            case 0:
                this.f24874b.L(true);
                return;
            case 1:
                this.f24874b.C0(102, view);
                return;
            case 2:
                this.f24874b.C0(100, view);
                return;
            case 3:
                this.f24874b.C0(103, view);
                return;
            case 4:
                this.f24874b.C0(104, view);
                return;
            case 5:
                this.f24874b.C0(101, view);
                return;
            case 6:
                lv0 lv0Var = this.f24874b;
                gs0 gs0Var = lv0Var.W;
                bs0 bs0Var = lv0Var.V;
                if (lv0Var.f26221q0.getAlpha() >= 0.1f) {
                    if (bs0Var != null && bs0Var.g()) {
                        bs0Var.i();
                    }
                    if (gs0Var != null && gs0Var.f31987w) {
                        kv0 i12 = lv0Var.i1(lv0Var.h1(lv0Var.getClosestTab()));
                        eu0 W = lv0Var.W(i12.f25825a);
                        if (W != null) {
                            gs0Var.setReorderingAlbums(false);
                            ks0 ks0Var = W.h;
                            for (int i10 = 0; i10 < ks0Var.getChildCount(); i10++) {
                                View childAt = ks0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.u7) {
                                    ((org.telegram.ui.Cells.u7) childAt).l(false, true);
                                }
                            }
                            jv0 jv0Var = i12.f25827c;
                            if (jv0Var != null && jv0Var.f25186x) {
                                jv0Var.f25186x = false;
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
                org.telegram.ui.ActionBar.n2 n2Var = this.f24874b.f26234v1;
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.oc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
