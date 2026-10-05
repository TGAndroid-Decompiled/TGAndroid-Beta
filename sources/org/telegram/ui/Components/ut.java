package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ut implements ViewTreeObserver.OnPreDrawListener {
    public final int f31517a;
    public final View f31518b;

    public ut(int i10, View view) {
        this.f31517a = i10;
        this.f31518b = view;
    }

    @Override
    public final boolean onPreDraw() {
        RecyclerView recyclerView;
        switch (this.f31517a) {
            case 0:
                org.telegram.ui.ActionBar.h4 h4Var = ((EditTextBoldCursor) this.f31518b).floatingActionMode;
                if (h4Var != null) {
                    h4Var.e();
                    return true;
                }
                return true;
            case 1:
                ((z70) this.f31518b).invalidate();
                return true;
            default:
                bw0 bw0Var = (bw0) this.f31518b;
                if (bw0Var.f25117a && bw0Var.f25119b > 0) {
                    bw0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                bw0Var.l();
                if (bw0Var.f25128g0 && (recyclerView = bw0Var.E) != null && !recyclerView.c0()) {
                    float k10 = bw0Var.k();
                    if (!Float.isInfinite(k10)) {
                        bw0Var.f25128g0 = false;
                        bw0Var.r(bw0Var.E, Math.round(k10 - bw0Var.U));
                        bw0Var.B();
                    }
                }
                if (bw0Var.f25117a && bw0Var.f25119b > 0) {
                    bw0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    bw0Var.f25119b--;
                    bw0Var.f25121c++;
                }
                return true;
        }
    }
}
