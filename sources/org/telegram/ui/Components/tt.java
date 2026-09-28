package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class tt implements ViewTreeObserver.OnPreDrawListener {
    public final int f28625a;
    public final View f28626b;

    public tt(int i10, View view) {
        this.f28625a = i10;
        this.f28626b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f28625a) {
            case 0:
                org.telegram.ui.ActionBar.g4 g4Var = ((EditTextBoldCursor) this.f28626b).floatingActionMode;
                if (g4Var != null) {
                    g4Var.e();
                    return true;
                }
                return true;
            default:
                ((y70) this.f28626b).invalidate();
                return true;
        }
    }
}
