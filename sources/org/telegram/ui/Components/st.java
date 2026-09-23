package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class st implements ViewTreeObserver.OnPreDrawListener {
    public final int f27987a;
    public final View f27988b;

    public st(int i10, View view) {
        this.f27987a = i10;
        this.f27988b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27987a) {
            case 0:
                org.telegram.ui.ActionBar.h4 h4Var = ((EditTextBoldCursor) this.f27988b).floatingActionMode;
                if (h4Var != null) {
                    h4Var.e();
                    return true;
                }
                return true;
            default:
                ((m70) this.f27988b).invalidate();
                return true;
        }
    }
}
