package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class ut implements ViewTreeObserver.OnPreDrawListener {
    public final int f28925a;
    public final View f28926b;

    public ut(int i10, View view) {
        this.f28925a = i10;
        this.f28926b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f28925a) {
            case 0:
                org.telegram.ui.ActionBar.g4 g4Var = ((EditTextBoldCursor) this.f28926b).floatingActionMode;
                if (g4Var != null) {
                    g4Var.e();
                    return true;
                }
                return true;
            default:
                ((z70) this.f28926b).invalidate();
                return true;
        }
    }
}
