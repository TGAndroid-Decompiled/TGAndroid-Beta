package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class mt implements ViewTreeObserver.OnPreDrawListener {
    public final int f27136a;
    public final View f27137b;

    public mt(int i10, View view) {
        this.f27136a = i10;
        this.f27137b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27136a) {
            case 0:
                org.telegram.ui.ActionBar.j4 j4Var = ((EditTextBoldCursor) this.f27137b).floatingActionMode;
                if (j4Var != null) {
                    j4Var.e();
                    return true;
                }
                return true;
            default:
                ((n70) this.f27137b).invalidate();
                return true;
        }
    }
}
