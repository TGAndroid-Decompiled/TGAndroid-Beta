package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class ku implements ViewTreeObserver.OnPreDrawListener {
    public final int f27933a;
    public final View f27934b;

    public ku(int i10, View view) {
        this.f27933a = i10;
        this.f27934b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27933a) {
            case 0:
                org.telegram.ui.ActionBar.g4 g4Var = ((EditTextBoldCursor) this.f27934b).floatingActionMode;
                if (g4Var != null) {
                    g4Var.c();
                    return true;
                }
                return true;
            default:
                ((q80) this.f27934b).invalidate();
                return true;
        }
    }
}
