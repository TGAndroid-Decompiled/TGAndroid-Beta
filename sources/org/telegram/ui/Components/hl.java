package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class hl implements ViewTreeObserver.OnPreDrawListener {
    public final int f35886a;
    public final View f35887b;

    public hl(int i7, View view) {
        this.f35886a = i7;
        this.f35887b = view;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        RecyclerView recyclerView;
        switch (this.f35886a) {
            case 0:
                ml mlVar = (ml) this.f35887b;
                v7 v7Var = mlVar.f37477b.V2;
                if (v7Var != null) {
                    f10 = v7Var.getAlpha();
                } else {
                    f10 = 0.0f;
                }
                if (f10 != mlVar.A0) {
                    mlVar.A0 = f10;
                    mlVar.i0();
                    return true;
                }
                return true;
            case 1:
                org.telegram.ui.ActionBar.x3 x3Var = ((EditTextBoldCursor) this.f35887b).Z0;
                if (x3Var != null) {
                    x3Var.c();
                    return true;
                }
                return true;
            case 2:
                ((w60) this.f35887b).invalidate();
                return true;
            default:
                tt0 tt0Var = (tt0) this.f35887b;
                if (tt0Var.f40016a && tt0Var.f40018b > 0) {
                    tt0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                tt0Var.p();
                if (tt0Var.f40028h0 && (recyclerView = tt0Var.F) != null && !recyclerView.c0()) {
                    float n10 = tt0Var.n();
                    if (!Float.isInfinite(n10)) {
                        tt0Var.f40028h0 = false;
                        tt0Var.t(tt0Var.F, Math.round(n10 - tt0Var.V));
                        tt0Var.B();
                    }
                }
                if (tt0Var.f40016a && tt0Var.f40018b > 0) {
                    tt0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    tt0Var.f40018b--;
                    tt0Var.f40020c++;
                }
                return true;
        }
    }
}
