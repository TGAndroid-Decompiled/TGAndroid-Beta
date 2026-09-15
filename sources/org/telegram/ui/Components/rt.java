package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class rt implements ViewTreeObserver.OnPreDrawListener {
    public final int f27681a;
    public final View f27682b;

    public rt(int i10, View view) {
        this.f27681a = i10;
        this.f27682b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27681a) {
            case 0:
                org.telegram.ui.ActionBar.i4 i4Var = ((EditTextBoldCursor) this.f27682b).floatingActionMode;
                if (i4Var != null) {
                    i4Var.e();
                    return true;
                }
                return true;
            default:
                ((l70) this.f27682b).invalidate();
                return true;
        }
    }
}
