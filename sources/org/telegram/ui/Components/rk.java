package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class rk implements ViewTreeObserver.OnPreDrawListener {
    public final int f37724a;
    public final View f37725b;

    public rk(int i7, View view) {
        this.f37724a = i7;
        this.f37725b = view;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        RecyclerView recyclerView;
        switch (this.f37724a) {
            case 0:
                wk wkVar = (wk) this.f37725b;
                r7 r7Var = wkVar.f39071b.R2;
                if (r7Var != null) {
                    f10 = r7Var.getAlpha();
                } else {
                    f10 = 0.0f;
                }
                if (f10 != wkVar.f40095z0) {
                    wkVar.f40095z0 = f10;
                    wkVar.i0();
                    return true;
                }
                return true;
            case 1:
                org.telegram.ui.ActionBar.w3 w3Var = ((EditTextBoldCursor) this.f37725b).Y0;
                if (w3Var != null) {
                    w3Var.c();
                    return true;
                }
                return true;
            case 2:
                ((j60) this.f37725b).invalidate();
                return true;
            default:
                jt0 jt0Var = (jt0) this.f37725b;
                if (jt0Var.f35131a && jt0Var.f35133b > 0) {
                    jt0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                jt0Var.p();
                if (jt0Var.f35142g0 && (recyclerView = jt0Var.E) != null && !recyclerView.c0()) {
                    float n10 = jt0Var.n();
                    if (!Float.isInfinite(n10)) {
                        jt0Var.f35142g0 = false;
                        jt0Var.t(jt0Var.E, Math.round(n10 - jt0Var.U));
                        jt0Var.B();
                    }
                }
                if (jt0Var.f35131a && jt0Var.f35133b > 0) {
                    jt0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    jt0Var.f35133b--;
                    jt0Var.f35135c++;
                }
                return true;
        }
    }
}
