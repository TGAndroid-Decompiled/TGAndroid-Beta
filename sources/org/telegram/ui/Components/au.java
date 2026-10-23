package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class au implements ViewTreeObserver.OnPreDrawListener {
    public final int f24850a;
    public final View f24851b;

    public au(int i10, View view) {
        this.f24850a = i10;
        this.f24851b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f24850a) {
            case 0:
                org.telegram.ui.ActionBar.k4 k4Var = ((EditTextBoldCursor) this.f24851b).floatingActionMode;
                if (k4Var != null) {
                    k4Var.c();
                    return true;
                }
                return true;
            default:
                ((h80) this.f24851b).invalidate();
                return true;
        }
    }
}
