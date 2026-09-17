package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class rt implements ViewTreeObserver.OnPreDrawListener {
    public final int f27687a;
    public final View f27688b;

    public rt(int i10, View view) {
        this.f27687a = i10;
        this.f27688b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27687a) {
            case 0:
                org.telegram.ui.ActionBar.j4 j4Var = ((EditTextBoldCursor) this.f27688b).floatingActionMode;
                if (j4Var != null) {
                    j4Var.e();
                    return true;
                }
                return true;
            default:
                ((l70) this.f27688b).invalidate();
                return true;
        }
    }
}
