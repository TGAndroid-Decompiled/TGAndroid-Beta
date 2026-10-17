package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class au implements ViewTreeObserver.OnPreDrawListener {
    public final int f24716a;
    public final View f24717b;

    public au(int i10, View view) {
        this.f24716a = i10;
        this.f24717b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f24716a) {
            case 0:
                org.telegram.ui.ActionBar.h4 h4Var = ((EditTextBoldCursor) this.f24717b).floatingActionMode;
                if (h4Var != null) {
                    h4Var.c();
                    return true;
                }
                return true;
            default:
                ((g80) this.f24717b).invalidate();
                return true;
        }
    }
}
