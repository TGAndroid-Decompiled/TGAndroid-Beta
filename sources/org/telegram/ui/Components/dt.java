package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class dt implements ViewTreeObserver.OnPreDrawListener {
    public final int f27807a;
    public final View f27808b;

    public dt(int i9, View view) {
        this.f27807a = i9;
        this.f27808b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27807a) {
            case 0:
                org.telegram.ui.ActionBar.g4 g4Var = ((EditTextBoldCursor) this.f27808b).floatingActionMode;
                if (g4Var != null) {
                    g4Var.e();
                    return true;
                }
                return true;
            default:
                ((v60) this.f27808b).invalidate();
                return true;
        }
    }
}
