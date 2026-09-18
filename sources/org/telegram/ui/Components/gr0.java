package org.telegram.ui.Components;

import android.view.View;
public final class gr0 implements View.OnClickListener {
    public final int f24481a;
    public final kv0 f24482b;

    public gr0(kv0 kv0Var, int i10) {
        this.f24481a = i10;
        this.f24482b = kv0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24481a) {
            case 0:
                this.f24482b.L(true);
                return;
            case 1:
                this.f24482b.C0(102, view);
                return;
            case 2:
                this.f24482b.C0(100, view);
                return;
            case 3:
                this.f24482b.C0(103, view);
                return;
            case 4:
                this.f24482b.C0(104, view);
                return;
            case 5:
                this.f24482b.C0(101, view);
                return;
            case 6:
                kv0 kv0Var = this.f24482b;
                fs0 fs0Var = kv0Var.W;
                zr0 zr0Var = kv0Var.V;
                if (kv0Var.f25835q0.getAlpha() >= 0.1f) {
                    if (zr0Var != null && zr0Var.g()) {
                        zr0Var.i();
                    }
                    if (fs0Var != null && fs0Var.f31926w) {
                        jv0 i12 = kv0Var.i1(kv0Var.h1(kv0Var.getClosestTab()));
                        du0 W = kv0Var.W(i12.f25463a);
                        if (W != null) {
                            fs0Var.setReorderingAlbums(false);
                            js0 js0Var = W.h;
                            for (int i10 = 0; i10 < js0Var.getChildCount(); i10++) {
                                View childAt = js0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            iv0 iv0Var = i12.f25465c;
                            if (iv0Var != null && iv0Var.f24743x) {
                                iv0Var.f24743x = false;
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
                org.telegram.ui.ActionBar.n2 n2Var = this.f24482b.f25848v1;
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.oc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
