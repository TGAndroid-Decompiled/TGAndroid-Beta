package org.telegram.ui.Components;

import android.view.View;
public final class gr0 implements View.OnClickListener {
    public final int f24646a;
    public final lv0 f24647b;

    public gr0(lv0 lv0Var, int i10) {
        this.f24646a = i10;
        this.f24647b = lv0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24646a) {
            case 0:
                this.f24647b.L(true);
                return;
            case 1:
                this.f24647b.C0(102, view);
                return;
            case 2:
                this.f24647b.C0(100, view);
                return;
            case 3:
                this.f24647b.C0(103, view);
                return;
            case 4:
                this.f24647b.C0(104, view);
                return;
            case 5:
                this.f24647b.C0(101, view);
                return;
            case 6:
                lv0 lv0Var = this.f24647b;
                gs0 gs0Var = lv0Var.W;
                bs0 bs0Var = lv0Var.V;
                if (lv0Var.f26199q0.getAlpha() >= 0.1f) {
                    if (bs0Var != null && bs0Var.g()) {
                        bs0Var.i();
                    }
                    if (gs0Var != null && gs0Var.f37628w) {
                        kv0 i12 = lv0Var.i1(lv0Var.h1(lv0Var.getClosestTab()));
                        eu0 W = lv0Var.W(i12.f25862a);
                        if (W != null) {
                            gs0Var.setReorderingAlbums(false);
                            ks0 ks0Var = W.h;
                            for (int i10 = 0; i10 < ks0Var.getChildCount(); i10++) {
                                View childAt = ks0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            jv0 jv0Var = i12.f25864c;
                            if (jv0Var != null && jv0Var.f25235x) {
                                jv0Var.f25235x = false;
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
                org.telegram.ui.ActionBar.o2 o2Var = this.f24647b.f26212v1;
                o2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.kc.E(o2Var.getParentActivity(), o2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
