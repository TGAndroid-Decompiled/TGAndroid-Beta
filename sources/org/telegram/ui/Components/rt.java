package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class rt implements ViewTreeObserver.OnPreDrawListener {
    public final int f27967a;
    public final View f27968b;

    public rt(int i10, View view) {
        this.f27967a = i10;
        this.f27968b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27967a) {
            case 0:
                org.telegram.ui.ActionBar.i4 i4Var = ((EditTextBoldCursor) this.f27968b).floatingActionMode;
                if (i4Var != null) {
                    i4Var.e();
                    return true;
                }
                return true;
            default:
                ((u70) this.f27968b).invalidate();
                return true;
        }
    }
}
