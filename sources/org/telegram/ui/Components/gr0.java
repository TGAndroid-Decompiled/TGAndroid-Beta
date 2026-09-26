package org.telegram.ui.Components;

import android.view.View;
public final class gr0 implements View.OnClickListener {
    public final int f24574a;
    public final kv0 f24575b;

    public gr0(kv0 kv0Var, int i10) {
        this.f24574a = i10;
        this.f24575b = kv0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24574a) {
            case 0:
                this.f24575b.L(true);
                return;
            case 1:
                this.f24575b.C0(102, view);
                return;
            case 2:
                this.f24575b.C0(100, view);
                return;
            case 3:
                this.f24575b.C0(103, view);
                return;
            case 4:
                this.f24575b.C0(104, view);
                return;
            case 5:
                this.f24575b.C0(101, view);
                return;
            case 6:
                kv0 kv0Var = this.f24575b;
                fs0 fs0Var = kv0Var.W;
                as0 as0Var = kv0Var.V;
                if (kv0Var.f25853q0.getAlpha() >= 0.1f) {
                    if (as0Var != null && as0Var.g()) {
                        as0Var.i();
                    }
                    if (fs0Var != null && fs0Var.f37568w) {
                        jv0 i12 = kv0Var.i1(kv0Var.h1(kv0Var.getClosestTab()));
                        du0 W = kv0Var.W(i12.f25528a);
                        if (W != null) {
                            fs0Var.setReorderingAlbums(false);
                            js0 js0Var = W.h;
                            for (int i10 = 0; i10 < js0Var.getChildCount(); i10++) {
                                View childAt = js0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            iv0 iv0Var = i12.f25530c;
                            if (iv0Var != null && iv0Var.f24876x) {
                                iv0Var.f24876x = false;
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
                org.telegram.ui.ActionBar.m2 m2Var = this.f24575b.f25866v1;
                m2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.lc.E(m2Var.getParentActivity(), m2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
