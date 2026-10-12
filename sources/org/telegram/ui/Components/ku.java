package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class ku implements ViewTreeObserver.OnPreDrawListener {
    public final int f27948a;
    public final View f27949b;

    public ku(int i10, View view) {
        this.f27948a = i10;
        this.f27949b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27948a) {
            case 0:
                org.telegram.ui.ActionBar.g4 g4Var = ((EditTextBoldCursor) this.f27949b).floatingActionMode;
                if (g4Var != null) {
                    g4Var.c();
                    return true;
                }
                return true;
            default:
                ((q80) this.f27949b).invalidate();
                return true;
        }
    }
}
