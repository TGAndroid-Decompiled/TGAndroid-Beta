package org.telegram.ui.Components;

import android.view.View;
public final class xr0 implements View.OnClickListener {
    public final int f32999a;
    public final bw0 f33000b;

    public xr0(bw0 bw0Var, int i10) {
        this.f32999a = i10;
        this.f33000b = bw0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32999a) {
            case 0:
                this.f33000b.L(true);
                return;
            case 1:
                this.f33000b.C0(102, view);
                return;
            case 2:
                this.f33000b.C0(100, view);
                return;
            case 3:
                this.f33000b.C0(103, view);
                return;
            case 4:
                this.f33000b.C0(104, view);
                return;
            case 5:
                this.f33000b.C0(101, view);
                return;
            case 6:
                bw0 bw0Var = this.f33000b;
                ws0 ws0Var = bw0Var.W;
                rs0 rs0Var = bw0Var.V;
                if (bw0Var.f25153q0.getAlpha() >= 0.1f) {
                    if (rs0Var != null && rs0Var.g()) {
                        rs0Var.i();
                    }
                    if (ws0Var != null && ws0Var.f35814w) {
                        aw0 i12 = bw0Var.i1(bw0Var.h1(bw0Var.getClosestTab()));
                        uu0 W = bw0Var.W(i12.f24783a);
                        if (W != null) {
                            ws0Var.setReorderingAlbums(false);
                            at0 at0Var = W.h;
                            for (int i10 = 0; i10 < at0Var.getChildCount(); i10++) {
                                View childAt = at0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            zv0 zv0Var = i12.f24785c;
                            if (zv0Var != null && zv0Var.f33371x) {
                                zv0Var.f33371x = false;
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
                org.telegram.ui.ActionBar.n2 n2Var = this.f33000b.f25166v1;
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.lc.D(n2Var.getParentActivity(), n2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
