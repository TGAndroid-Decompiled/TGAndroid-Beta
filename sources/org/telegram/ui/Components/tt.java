package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class tt implements ViewTreeObserver.OnPreDrawListener {
    public final int f28609a;
    public final View f28610b;

    public tt(int i10, View view) {
        this.f28609a = i10;
        this.f28610b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f28609a) {
            case 0:
                org.telegram.ui.ActionBar.g4 g4Var = ((EditTextBoldCursor) this.f28610b).floatingActionMode;
                if (g4Var != null) {
                    g4Var.e();
                    return true;
                }
                return true;
            default:
                ((x70) this.f28610b).invalidate();
                return true;
        }
    }
}
