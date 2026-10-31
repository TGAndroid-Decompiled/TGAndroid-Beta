package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class dt implements ViewTreeObserver.OnPreDrawListener {
    public final int f25531a;
    public final View f25532b;

    public dt(int i10, View view) {
        this.f25531a = i10;
        this.f25532b = view;
    }

    @Override
    public final boolean onPreDraw() {
        RecyclerView recyclerView;
        switch (this.f25531a) {
            case 0:
                org.telegram.ui.ActionBar.d4 d4Var = ((EditTextBoldCursor) this.f25532b).Y0;
                if (d4Var != null) {
                    d4Var.c();
                    return true;
                }
                return true;
            case 1:
                ((x60) this.f25532b).invalidate();
                return true;
            default:
                ku0 ku0Var = (ku0) this.f25532b;
                if (ku0Var.f27907a && ku0Var.f27909b > 0) {
                    ku0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                ku0Var.p();
                if (ku0Var.f27917g0 && (recyclerView = ku0Var.E) != null && !recyclerView.c0()) {
                    float o10 = ku0Var.o();
                    if (!Float.isInfinite(o10)) {
                        ku0Var.f27917g0 = false;
                        ku0Var.t(ku0Var.E, Math.round(o10 - ku0Var.U));
                        ku0Var.B();
                    }
                }
                if (ku0Var.f27907a && ku0Var.f27909b > 0) {
                    ku0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    ku0Var.f27909b--;
                    ku0Var.f27911c++;
                }
                return true;
        }
    }
}
