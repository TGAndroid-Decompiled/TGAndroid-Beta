package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class rt implements ViewTreeObserver.OnPreDrawListener {
    public final int f27690a;
    public final View f27691b;

    public rt(int i10, View view) {
        this.f27690a = i10;
        this.f27691b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27690a) {
            case 0:
                org.telegram.ui.ActionBar.j4 j4Var = ((EditTextBoldCursor) this.f27691b).floatingActionMode;
                if (j4Var != null) {
                    j4Var.e();
                    return true;
                }
                return true;
            default:
                ((l70) this.f27691b).invalidate();
                return true;
        }
    }
}
