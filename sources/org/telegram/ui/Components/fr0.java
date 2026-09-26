package org.telegram.ui.Components;

import android.view.View;
public final class fr0 implements View.OnClickListener {
    public final int f24261a;
    public final jv0 f24262b;

    public fr0(jv0 jv0Var, int i10) {
        this.f24261a = i10;
        this.f24262b = jv0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24261a) {
            case 0:
                this.f24262b.L(true);
                return;
            case 1:
                this.f24262b.C0(102, view);
                return;
            case 2:
                this.f24262b.C0(100, view);
                return;
            case 3:
                this.f24262b.C0(103, view);
                return;
            case 4:
                this.f24262b.C0(104, view);
                return;
            case 5:
                this.f24262b.C0(101, view);
                return;
            case 6:
                jv0 jv0Var = this.f24262b;
                es0 es0Var = jv0Var.W;
                zr0 zr0Var = jv0Var.V;
                if (jv0Var.f25546q0.getAlpha() >= 0.1f) {
                    if (zr0Var != null && zr0Var.g()) {
                        zr0Var.i();
                    }
                    if (es0Var != null && es0Var.f37569w) {
                        iv0 i12 = jv0Var.i1(jv0Var.h1(jv0Var.getClosestTab()));
                        cu0 W = jv0Var.W(i12.f25172a);
                        if (W != null) {
                            es0Var.setReorderingAlbums(false);
                            is0 is0Var = W.h;
                            for (int i10 = 0; i10 < is0Var.getChildCount(); i10++) {
                                View childAt = is0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    ((org.telegram.ui.Cells.t7) childAt).l(false, true);
                                }
                            }
                            hv0 hv0Var = i12.f25174c;
                            if (hv0Var != null && hv0Var.f24537x) {
                                hv0Var.f24537x = false;
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
                org.telegram.ui.ActionBar.m2 m2Var = this.f24262b.f25559v1;
                m2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.lc.E(m2Var.getParentActivity(), m2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
