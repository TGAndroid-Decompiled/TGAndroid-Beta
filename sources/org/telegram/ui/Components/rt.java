package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class rt implements ViewTreeObserver.OnPreDrawListener {
    public final int f27678a;
    public final View f27679b;

    public rt(int i10, View view) {
        this.f27678a = i10;
        this.f27679b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27678a) {
            case 0:
                org.telegram.ui.ActionBar.i4 i4Var = ((EditTextBoldCursor) this.f27679b).floatingActionMode;
                if (i4Var != null) {
                    i4Var.e();
                    return true;
                }
                return true;
            default:
                ((l70) this.f27679b).invalidate();
                return true;
        }
    }
}
