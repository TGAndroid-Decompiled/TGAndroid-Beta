package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ut implements ViewTreeObserver.OnPreDrawListener {
    public final int f31441a;
    public final View f31442b;

    public ut(int i10, View view) {
        this.f31441a = i10;
        this.f31442b = view;
    }

    @Override
    public final boolean onPreDraw() {
        RecyclerView recyclerView;
        switch (this.f31441a) {
            case 0:
                org.telegram.ui.ActionBar.h4 h4Var = ((EditTextBoldCursor) this.f31442b).floatingActionMode;
                if (h4Var != null) {
                    h4Var.e();
                    return true;
                }
                return true;
            case 1:
                ((z70) this.f31442b).invalidate();
                return true;
            default:
                aw0 aw0Var = (aw0) this.f31442b;
                if (aw0Var.f24698w0 && aw0Var.f24699x0 > 0) {
                    aw0Var.e0("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                aw0Var.k0();
                if (aw0Var.f24694j1 && (recyclerView = aw0Var.K0) != null && !recyclerView.c0()) {
                    float j02 = aw0Var.j0();
                    if (!Float.isInfinite(j02)) {
                        aw0Var.f24694j1 = false;
                        aw0Var.m0(aw0Var.K0, Math.round(j02 - aw0Var.f24685a1));
                        aw0Var.u0();
                    }
                }
                if (aw0Var.f24698w0 && aw0Var.f24699x0 > 0) {
                    aw0Var.e0("PRE_DRAW_AFTER", null, 0, 0, true);
                    aw0Var.f24699x0--;
                    aw0Var.f24700y0++;
                }
                return true;
        }
    }
}
