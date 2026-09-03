package org.telegram.ui.Components;

import android.view.View;
public final class wq0 implements View.OnClickListener {
    public final int f32816a;
    public final yu0 f32817b;

    public wq0(yu0 yu0Var, int i10) {
        this.f32816a = i10;
        this.f32817b = yu0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32816a) {
            case 0:
                this.f32817b.L(true);
                return;
            case 1:
                this.f32817b.C0(102, view);
                return;
            case 2:
                this.f32817b.C0(100, view);
                return;
            case 3:
                this.f32817b.C0(103, view);
                return;
            case 4:
                this.f32817b.C0(104, view);
                return;
            case 5:
                this.f32817b.C0(101, view);
                return;
            case 6:
                yu0 yu0Var = this.f32817b;
                sr0 sr0Var = yu0Var.T;
                or0 or0Var = yu0Var.S;
                if (yu0Var.f33636n0.getAlpha() >= 0.1f) {
                    if (or0Var != null && or0Var.g()) {
                        or0Var.i();
                    }
                    if (sr0Var != null && sr0Var.f40300w) {
                        xu0 i12 = yu0Var.i1(yu0Var.h1(yu0Var.getClosestTab()));
                        qt0 W = yu0Var.W(i12.f33177a);
                        if (W != null) {
                            sr0Var.setReorderingAlbums(false);
                            wr0 wr0Var = W.h;
                            for (int i10 = 0; i10 < wr0Var.getChildCount(); i10++) {
                                View childAt = wr0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.r7) {
                                    ((org.telegram.ui.Cells.r7) childAt).l(false, true);
                                }
                            }
                            wu0 wu0Var = i12.f33179c;
                            if (wu0Var != null && wu0Var.f32553x) {
                                wu0Var.f32553x = false;
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
                org.telegram.ui.ActionBar.p2 p2Var = this.f32817b.f33649s1;
                p2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                qh.ba.E(p2Var.getParentActivity(), p2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
