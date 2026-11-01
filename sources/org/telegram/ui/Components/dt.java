package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class dt implements ViewTreeObserver.OnPreDrawListener {
    public final int f25587a;
    public final View f25588b;

    public dt(int i10, View view) {
        this.f25587a = i10;
        this.f25588b = view;
    }

    @Override
    public final boolean onPreDraw() {
        RecyclerView recyclerView;
        switch (this.f25587a) {
            case 0:
                org.telegram.ui.ActionBar.d4 d4Var = ((EditTextBoldCursor) this.f25588b).Y0;
                if (d4Var != null) {
                    d4Var.c();
                    return true;
                }
                return true;
            case 1:
                ((x60) this.f25588b).invalidate();
                return true;
            default:
                lu0 lu0Var = (lu0) this.f25588b;
                if (lu0Var.f28269a && lu0Var.f28271b > 0) {
                    lu0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                lu0Var.p();
                if (lu0Var.f28279g0 && (recyclerView = lu0Var.E) != null && !recyclerView.c0()) {
                    float o10 = lu0Var.o();
                    if (!Float.isInfinite(o10)) {
                        lu0Var.f28279g0 = false;
                        lu0Var.t(lu0Var.E, Math.round(o10 - lu0Var.U));
                        lu0Var.B();
                    }
                }
                if (lu0Var.f28269a && lu0Var.f28271b > 0) {
                    lu0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    lu0Var.f28271b--;
                    lu0Var.f28273c++;
                }
                return true;
        }
    }
}
