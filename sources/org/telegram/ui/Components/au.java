package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class au implements ViewTreeObserver.OnPreDrawListener {
    public final int f24724a;
    public final View f24725b;

    public au(int i10, View view) {
        this.f24724a = i10;
        this.f24725b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f24724a) {
            case 0:
                org.telegram.ui.ActionBar.h4 h4Var = ((EditTextBoldCursor) this.f24725b).floatingActionMode;
                if (h4Var != null) {
                    h4Var.c();
                    return true;
                }
                return true;
            default:
                ((g80) this.f24725b).invalidate();
                return true;
        }
    }
}
