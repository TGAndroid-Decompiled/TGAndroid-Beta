package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class nt implements ViewTreeObserver.OnPreDrawListener {
    public final int f27358a;
    public final View f27359b;

    public nt(int i10, View view) {
        this.f27358a = i10;
        this.f27359b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27358a) {
            case 0:
                org.telegram.ui.ActionBar.j4 j4Var = ((EditTextBoldCursor) this.f27359b).floatingActionMode;
                if (j4Var != null) {
                    j4Var.e();
                    return true;
                }
                return true;
            default:
                ((m70) this.f27359b).invalidate();
                return true;
        }
    }
}
