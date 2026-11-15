package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class yk implements ViewTreeObserver.OnPreDrawListener {
    public final int f42030a;
    public final View f42031b;

    public yk(int i7, View view) {
        this.f42030a = i7;
        this.f42031b = view;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        RecyclerView recyclerView;
        switch (this.f42030a) {
            case 0:
                dl dlVar = (dl) this.f42031b;
                o7 o7Var = dlVar.f33609b.V2;
                if (o7Var != null) {
                    f10 = o7Var.getAlpha();
                } else {
                    f10 = 0.0f;
                }
                if (f10 != dlVar.A0) {
                    dlVar.A0 = f10;
                    dlVar.i0();
                    return true;
                }
                return true;
            case 1:
                org.telegram.ui.ActionBar.u3 u3Var = ((EditTextBoldCursor) this.f42031b).Z0;
                if (u3Var != null) {
                    u3Var.c();
                    return true;
                }
                return true;
            case 2:
                ((k60) this.f42031b).invalidate();
                return true;
            default:
                it0 it0Var = (it0) this.f42031b;
                if (it0Var.f35703a && it0Var.f35705b > 0) {
                    it0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                it0Var.p();
                if (it0Var.f35715h0 && (recyclerView = it0Var.F) != null && !recyclerView.c0()) {
                    float n10 = it0Var.n();
                    if (!Float.isInfinite(n10)) {
                        it0Var.f35715h0 = false;
                        it0Var.t(it0Var.F, Math.round(n10 - it0Var.V));
                        it0Var.B();
                    }
                }
                if (it0Var.f35703a && it0Var.f35705b > 0) {
                    it0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    it0Var.f35705b--;
                    it0Var.f35707c++;
                }
                return true;
        }
    }
}
