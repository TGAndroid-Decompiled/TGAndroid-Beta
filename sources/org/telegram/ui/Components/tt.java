package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class tt implements ViewTreeObserver.OnPreDrawListener {
    public final int f28688a;
    public final View f28689b;

    public tt(int i10, View view) {
        this.f28688a = i10;
        this.f28689b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f28688a) {
            case 0:
                org.telegram.ui.ActionBar.i4 i4Var = ((EditTextBoldCursor) this.f28689b).floatingActionMode;
                if (i4Var != null) {
                    i4Var.e();
                    return true;
                }
                return true;
            default:
                ((y70) this.f28689b).invalidate();
                return true;
        }
    }
}
