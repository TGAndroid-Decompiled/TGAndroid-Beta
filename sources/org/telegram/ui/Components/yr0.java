package org.telegram.ui.Components;

import android.view.View;
public final class yr0 implements View.OnClickListener {
    public final int f33397a;
    public final cw0 f33398b;

    public yr0(cw0 cw0Var, int i10) {
        this.f33397a = i10;
        this.f33398b = cw0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33397a) {
            case 0:
                this.f33398b.L(true);
                return;
            case 1:
                this.f33398b.C0(102, view);
                return;
            case 2:
                this.f33398b.C0(100, view);
                return;
            case 3:
                this.f33398b.C0(103, view);
                return;
            case 4:
                this.f33398b.C0(104, view);
                return;
            case 5:
                this.f33398b.C0(101, view);
                return;
            case 6:
                cw0 cw0Var = this.f33398b;
                xs0 xs0Var = cw0Var.W;
                ss0 ss0Var = cw0Var.V;
                if (cw0Var.f25461q0.getAlpha() >= 0.1f) {
                    if (ss0Var != null && ss0Var.g()) {
                        ss0Var.i();
                    }
                    if (xs0Var != null && xs0Var.f35858w) {
                        bw0 i12 = cw0Var.i1(cw0Var.h1(cw0Var.getClosestTab()));
                        vu0 W = cw0Var.W(i12.f25067a);
                        if (W != null) {
                            xs0Var.setReorderingAlbums(false);
                            bt0 bt0Var = W.h;
                            for (int i10 = 0; i10 < bt0Var.getChildCount(); i10++) {
                                View childAt = bt0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            aw0 aw0Var = i12.f25069c;
                            if (aw0Var != null && aw0Var.f33694x) {
                                aw0Var.f33694x = false;
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
                org.telegram.ui.ActionBar.n2 n2Var = this.f33398b.f25474v1;
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.lc.D(n2Var.getParentActivity(), n2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
