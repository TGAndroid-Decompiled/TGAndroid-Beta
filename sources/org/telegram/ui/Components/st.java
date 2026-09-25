package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class st implements ViewTreeObserver.OnPreDrawListener {
    public final int f28324a;
    public final View f28325b;

    public st(int i10, View view) {
        this.f28324a = i10;
        this.f28325b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f28324a) {
            case 0:
                org.telegram.ui.ActionBar.g4 g4Var = ((EditTextBoldCursor) this.f28325b).floatingActionMode;
                if (g4Var != null) {
                    g4Var.e();
                    return true;
                }
                return true;
            default:
                ((w70) this.f28325b).invalidate();
                return true;
        }
    }
}
