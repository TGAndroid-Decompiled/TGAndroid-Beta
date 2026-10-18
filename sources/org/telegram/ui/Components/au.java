package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class au implements ViewTreeObserver.OnPreDrawListener {
    public final int f24723a;
    public final View f24724b;

    public au(int i10, View view) {
        this.f24723a = i10;
        this.f24724b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f24723a) {
            case 0:
                org.telegram.ui.ActionBar.h4 h4Var = ((EditTextBoldCursor) this.f24724b).floatingActionMode;
                if (h4Var != null) {
                    h4Var.c();
                    return true;
                }
                return true;
            default:
                ((g80) this.f24724b).invalidate();
                return true;
        }
    }
}
