package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class rt implements ViewTreeObserver.OnPreDrawListener {
    public final int f27955a;
    public final View f27956b;

    public rt(int i10, View view) {
        this.f27955a = i10;
        this.f27956b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27955a) {
            case 0:
                org.telegram.ui.ActionBar.i4 i4Var = ((EditTextBoldCursor) this.f27956b).floatingActionMode;
                if (i4Var != null) {
                    i4Var.e();
                    return true;
                }
                return true;
            default:
                ((t70) this.f27956b).invalidate();
                return true;
        }
    }
}
