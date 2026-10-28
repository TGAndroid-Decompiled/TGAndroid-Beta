package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class bu implements ViewTreeObserver.OnPreDrawListener {
    public final int f26913a;
    public final View f26914b;

    public bu(int i10, View view) {
        this.f26913a = i10;
        this.f26914b = view;
    }

    @Override
    public final boolean onPreDraw() {
        RecyclerView recyclerView;
        switch (this.f26913a) {
            case 0:
                org.telegram.ui.ActionBar.m4 m4Var = ((EditTextBoldCursor) this.f26914b).floatingActionMode;
                if (m4Var != null) {
                    m4Var.c();
                    return true;
                }
                return true;
            case 1:
                ((j80) this.f26914b).invalidate();
                return true;
            default:
                mw0 mw0Var = (mw0) this.f26914b;
                if (mw0Var.f30646a && mw0Var.f30648b > 0) {
                    mw0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                mw0Var.l();
                if (mw0Var.f30656g0 && (recyclerView = mw0Var.E) != null && !recyclerView.c0()) {
                    float k10 = mw0Var.k();
                    if (!Float.isInfinite(k10)) {
                        mw0Var.f30656g0 = false;
                        mw0Var.r(mw0Var.E, Math.round(k10 - mw0Var.U));
                        mw0Var.B();
                    }
                }
                if (mw0Var.f30646a && mw0Var.f30648b > 0) {
                    mw0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    mw0Var.f30648b--;
                    mw0Var.f30650c++;
                }
                return true;
        }
    }
}
