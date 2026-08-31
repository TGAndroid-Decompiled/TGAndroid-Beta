package org.telegram.ui.Components;

import android.view.View;
public final class xq0 implements View.OnClickListener {
    public final int f33164a;
    public final zu0 f33165b;

    public xq0(zu0 zu0Var, int i10) {
        this.f33164a = i10;
        this.f33165b = zu0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33164a) {
            case 0:
                this.f33165b.L(true);
                return;
            case 1:
                this.f33165b.C0(102, view);
                return;
            case 2:
                this.f33165b.C0(100, view);
                return;
            case 3:
                this.f33165b.C0(103, view);
                return;
            case 4:
                this.f33165b.C0(104, view);
                return;
            case 5:
                this.f33165b.C0(101, view);
                return;
            case 6:
                zu0 zu0Var = this.f33165b;
                tr0 tr0Var = zu0Var.T;
                pr0 pr0Var = zu0Var.S;
                if (zu0Var.f33991n0.getAlpha() >= 0.1f) {
                    if (pr0Var != null && pr0Var.g()) {
                        pr0Var.i();
                    }
                    if (tr0Var != null && tr0Var.f38934w) {
                        yu0 i12 = zu0Var.i1(zu0Var.h1(zu0Var.getClosestTab()));
                        rt0 W = zu0Var.W(i12.f33579a);
                        if (W != null) {
                            tr0Var.setReorderingAlbums(false);
                            xr0 xr0Var = W.h;
                            for (int i10 = 0; i10 < xr0Var.getChildCount(); i10++) {
                                View childAt = xr0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.r7) {
                                    ((org.telegram.ui.Cells.r7) childAt).l(false, true);
                                }
                            }
                            xu0 xu0Var = i12.f33581c;
                            if (xu0Var != null && xu0Var.f32859x) {
                                xu0Var.f32859x = false;
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
                org.telegram.ui.ActionBar.p2 p2Var = this.f33165b.f34004s1;
                p2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                qh.ca.E(p2Var.getParentActivity(), p2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
