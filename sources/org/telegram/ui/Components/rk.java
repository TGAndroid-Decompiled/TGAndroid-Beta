package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class rk implements ViewTreeObserver.OnPreDrawListener {
    public final int f37709a;
    public final View f37710b;

    public rk(int i7, View view) {
        this.f37709a = i7;
        this.f37710b = view;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        RecyclerView recyclerView;
        switch (this.f37709a) {
            case 0:
                wk wkVar = (wk) this.f37710b;
                r7 r7Var = wkVar.f38948b.R2;
                if (r7Var != null) {
                    f10 = r7Var.getAlpha();
                } else {
                    f10 = 0.0f;
                }
                if (f10 != wkVar.f40017z0) {
                    wkVar.f40017z0 = f10;
                    wkVar.i0();
                    return true;
                }
                return true;
            case 1:
                org.telegram.ui.ActionBar.w3 w3Var = ((EditTextBoldCursor) this.f37710b).Y0;
                if (w3Var != null) {
                    w3Var.c();
                    return true;
                }
                return true;
            case 2:
                ((i60) this.f37710b).invalidate();
                return true;
            default:
                ht0 ht0Var = (ht0) this.f37710b;
                if (ht0Var.f34364a && ht0Var.f34366b > 0) {
                    ht0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                ht0Var.p();
                if (ht0Var.f34375g0 && (recyclerView = ht0Var.E) != null && !recyclerView.c0()) {
                    float n10 = ht0Var.n();
                    if (!Float.isInfinite(n10)) {
                        ht0Var.f34375g0 = false;
                        ht0Var.t(ht0Var.E, Math.round(n10 - ht0Var.U));
                        ht0Var.B();
                    }
                }
                if (ht0Var.f34364a && ht0Var.f34366b > 0) {
                    ht0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    ht0Var.f34366b--;
                    ht0Var.f34368c++;
                }
                return true;
        }
    }
}
