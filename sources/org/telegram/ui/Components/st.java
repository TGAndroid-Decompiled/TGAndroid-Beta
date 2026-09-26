package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class st implements ViewTreeObserver.OnPreDrawListener {
    public final int f28323a;
    public final View f28324b;

    public st(int i10, View view) {
        this.f28323a = i10;
        this.f28324b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f28323a) {
            case 0:
                org.telegram.ui.ActionBar.g4 g4Var = ((EditTextBoldCursor) this.f28324b).floatingActionMode;
                if (g4Var != null) {
                    g4Var.e();
                    return true;
                }
                return true;
            default:
                ((w70) this.f28324b).invalidate();
                return true;
        }
    }
}
