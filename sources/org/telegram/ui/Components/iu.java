package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class iu implements ViewTreeObserver.OnPreDrawListener {
    public final int f27458a;
    public final View f27459b;

    public iu(int i10, View view) {
        this.f27458a = i10;
        this.f27459b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27458a) {
            case 0:
                org.telegram.ui.ActionBar.h4 h4Var = ((EditTextBoldCursor) this.f27459b).floatingActionMode;
                if (h4Var != null) {
                    h4Var.c();
                    return true;
                }
                return true;
            default:
                ((o80) this.f27459b).invalidate();
                return true;
        }
    }
}
