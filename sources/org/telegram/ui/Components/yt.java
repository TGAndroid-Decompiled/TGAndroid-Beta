package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class yt implements ViewTreeObserver.OnPreDrawListener {
    public final int f33042a;
    public final View f33043b;

    public yt(int i10, View view) {
        this.f33042a = i10;
        this.f33043b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f33042a) {
            case 0:
                org.telegram.ui.ActionBar.k4 k4Var = ((EditTextBoldCursor) this.f33043b).floatingActionMode;
                if (k4Var != null) {
                    k4Var.c();
                    return true;
                }
                return true;
            default:
                ((f80) this.f33043b).invalidate();
                return true;
        }
    }
}
