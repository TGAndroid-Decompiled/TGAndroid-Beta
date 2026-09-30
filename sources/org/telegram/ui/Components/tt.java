package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class tt implements ViewTreeObserver.OnPreDrawListener {
    public final int f28623a;
    public final View f28624b;

    public tt(int i10, View view) {
        this.f28623a = i10;
        this.f28624b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f28623a) {
            case 0:
                org.telegram.ui.ActionBar.g4 g4Var = ((EditTextBoldCursor) this.f28624b).floatingActionMode;
                if (g4Var != null) {
                    g4Var.e();
                    return true;
                }
                return true;
            default:
                ((y70) this.f28624b).invalidate();
                return true;
        }
    }
}
