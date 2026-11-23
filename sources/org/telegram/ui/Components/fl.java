package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class fl implements ViewTreeObserver.OnPreDrawListener {
    public final int f35157a;
    public final View f35158b;

    public fl(int i7, View view) {
        this.f35157a = i7;
        this.f35158b = view;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        RecyclerView recyclerView;
        switch (this.f35157a) {
            case 0:
                kl klVar = (kl) this.f35158b;
                u7 u7Var = klVar.f37135b.V2;
                if (u7Var != null) {
                    f10 = u7Var.getAlpha();
                } else {
                    f10 = 0.0f;
                }
                if (f10 != klVar.A0) {
                    klVar.A0 = f10;
                    klVar.i0();
                    return true;
                }
                return true;
            case 1:
                org.telegram.ui.ActionBar.x3 x3Var = ((EditTextBoldCursor) this.f35158b).Z0;
                if (x3Var != null) {
                    x3Var.c();
                    return true;
                }
                return true;
            case 2:
                ((t60) this.f35158b).invalidate();
                return true;
            default:
                st0 st0Var = (st0) this.f35158b;
                if (st0Var.f39697a && st0Var.f39699b > 0) {
                    st0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                st0Var.p();
                if (st0Var.f39709h0 && (recyclerView = st0Var.F) != null && !recyclerView.c0()) {
                    float n10 = st0Var.n();
                    if (!Float.isInfinite(n10)) {
                        st0Var.f39709h0 = false;
                        st0Var.t(st0Var.F, Math.round(n10 - st0Var.V));
                        st0Var.B();
                    }
                }
                if (st0Var.f39697a && st0Var.f39699b > 0) {
                    st0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    st0Var.f39699b--;
                    st0Var.f39701c++;
                }
                return true;
        }
    }
}
