package org.telegram.ui.Components;

import android.view.View;
public final class ds0 implements View.OnClickListener {
    public final int f25456a;
    public final hw0 f25457b;

    public ds0(hw0 hw0Var, int i10) {
        this.f25456a = i10;
        this.f25457b = hw0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25456a) {
            case 0:
                this.f25457b.L(true);
                return;
            case 1:
                this.f25457b.C0(102, view);
                return;
            case 2:
                this.f25457b.C0(100, view);
                return;
            case 3:
                this.f25457b.C0(103, view);
                return;
            case 4:
                this.f25457b.C0(104, view);
                return;
            case 5:
                this.f25457b.C0(101, view);
                return;
            case 6:
                hw0 hw0Var = this.f25457b;
                ct0 ct0Var = hw0Var.W;
                xs0 xs0Var = hw0Var.V;
                if (hw0Var.f26959q0.getAlpha() >= 0.1f) {
                    if (xs0Var != null && xs0Var.g()) {
                        xs0Var.i();
                    }
                    if (ct0Var != null && ct0Var.f36309w) {
                        gw0 i12 = hw0Var.i1(hw0Var.h1(hw0Var.getClosestTab()));
                        av0 W = hw0Var.W(i12.f26539a);
                        if (W != null) {
                            ct0Var.setReorderingAlbums(false);
                            gt0 gt0Var = W.h;
                            for (int i10 = 0; i10 < gt0Var.getChildCount(); i10++) {
                                View childAt = gt0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            fw0 fw0Var = i12.f26541c;
                            if (fw0Var != null && fw0Var.f25797x) {
                                fw0Var.f25797x = false;
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
                org.telegram.ui.ActionBar.m2 m2Var = this.f25457b.f26972v1;
                m2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.lc.D(m2Var.getParentActivity(), m2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
