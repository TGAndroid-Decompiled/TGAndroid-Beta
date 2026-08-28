package org.telegram.ui.Components;

import android.view.View;
public final class cq0 implements View.OnClickListener {
    public final int f27554a;
    public final eu0 f27555b;

    public cq0(eu0 eu0Var, int i9) {
        this.f27554a = i9;
        this.f27555b = eu0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27554a) {
            case 0:
                this.f27555b.L(true);
                return;
            case 1:
                this.f27555b.C0(102, view);
                return;
            case 2:
                this.f27555b.C0(100, view);
                return;
            case 3:
                this.f27555b.C0(103, view);
                return;
            case 4:
                this.f27555b.C0(104, view);
                return;
            case 5:
                this.f27555b.C0(101, view);
                return;
            case 6:
                eu0 eu0Var = this.f27555b;
                zq0 zq0Var = eu0Var.S;
                vq0 vq0Var = eu0Var.R;
                if (eu0Var.m0.getAlpha() >= 0.1f) {
                    if (vq0Var != null && vq0Var.g()) {
                        vq0Var.i();
                    }
                    if (zq0Var != null && zq0Var.f44304w) {
                        du0 i12 = eu0Var.i1(eu0Var.h1(eu0Var.getClosestTab()));
                        xs0 W = eu0Var.W(i12.f27810a);
                        if (W != null) {
                            zq0Var.setReorderingAlbums(false);
                            dr0 dr0Var = W.h;
                            for (int i9 = 0; i9 < dr0Var.getChildCount(); i9++) {
                                View childAt = dr0Var.getChildAt(i9);
                                if (childAt instanceof org.telegram.ui.Cells.r7) {
                                    ((org.telegram.ui.Cells.r7) childAt).l(false, true);
                                }
                            }
                            cu0 cu0Var = i12.f27812c;
                            if (cu0Var != null && cu0Var.f27283x) {
                                cu0Var.f27283x = false;
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
                org.telegram.ui.ActionBar.o2 o2Var = this.f27555b.f28160r1;
                o2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                kh.wb.E(o2Var.getParentActivity(), o2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
