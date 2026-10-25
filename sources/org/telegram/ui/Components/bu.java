package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class bu implements ViewTreeObserver.OnPreDrawListener {
    public final int f26963a;
    public final View f26964b;

    public bu(int i10, View view) {
        this.f26963a = i10;
        this.f26964b = view;
    }

    @Override
    public final boolean onPreDraw() {
        RecyclerView recyclerView;
        switch (this.f26963a) {
            case 0:
                org.telegram.ui.ActionBar.m4 m4Var = ((EditTextBoldCursor) this.f26964b).floatingActionMode;
                if (m4Var != null) {
                    m4Var.c();
                    return true;
                }
                return true;
            case 1:
                ((i80) this.f26964b).invalidate();
                return true;
            default:
                lw0 lw0Var = (lw0) this.f26964b;
                if (lw0Var.f30301a && lw0Var.f30303b > 0) {
                    lw0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                lw0Var.l();
                if (lw0Var.f30311g0 && (recyclerView = lw0Var.E) != null && !recyclerView.c0()) {
                    float k10 = lw0Var.k();
                    if (!Float.isInfinite(k10)) {
                        lw0Var.f30311g0 = false;
                        lw0Var.r(lw0Var.E, Math.round(k10 - lw0Var.U));
                        lw0Var.B();
                    }
                }
                if (lw0Var.f30301a && lw0Var.f30303b > 0) {
                    lw0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    lw0Var.f30303b--;
                    lw0Var.f30305c++;
                }
                return true;
        }
    }
}
