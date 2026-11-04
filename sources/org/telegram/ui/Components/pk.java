package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class pk implements ViewTreeObserver.OnPreDrawListener {
    public final int f37169a;
    public final View f37170b;

    public pk(int i3, View view) {
        this.f37169a = i3;
        this.f37170b = view;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        RecyclerView recyclerView;
        switch (this.f37169a) {
            case 0:
                uk ukVar = (uk) this.f37170b;
                p7 p7Var = ukVar.f38416b.S2;
                if (p7Var != null) {
                    f10 = p7Var.getAlpha();
                } else {
                    f10 = 0.0f;
                }
                if (f10 != ukVar.A0) {
                    ukVar.A0 = f10;
                    ukVar.i0();
                    return true;
                }
                return true;
            case 1:
                org.telegram.ui.ActionBar.u3 u3Var = ((EditTextBoldCursor) this.f37170b).Z0;
                if (u3Var != null) {
                    u3Var.c();
                    return true;
                }
                return true;
            case 2:
                ((d60) this.f37170b).invalidate();
                return true;
            default:
                gt0 gt0Var = (gt0) this.f37170b;
                if (gt0Var.f34186a && gt0Var.f34188b > 0) {
                    gt0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                gt0Var.l();
                if (gt0Var.f34198h0 && (recyclerView = gt0Var.F) != null && !recyclerView.c0()) {
                    float k10 = gt0Var.k();
                    if (!Float.isInfinite(k10)) {
                        gt0Var.f34198h0 = false;
                        gt0Var.r(gt0Var.F, Math.round(k10 - gt0Var.V));
                        gt0Var.B();
                    }
                }
                if (gt0Var.f34186a && gt0Var.f34188b > 0) {
                    gt0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    gt0Var.f34188b--;
                    gt0Var.f34190c++;
                }
                return true;
        }
    }
}
