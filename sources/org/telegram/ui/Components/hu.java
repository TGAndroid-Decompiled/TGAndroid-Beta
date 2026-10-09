package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class hu implements ViewTreeObserver.OnPreDrawListener {
    public final int f27141a;
    public final View f27142b;

    public hu(int i10, View view) {
        this.f27141a = i10;
        this.f27142b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27141a) {
            case 0:
                org.telegram.ui.ActionBar.h4 h4Var = ((EditTextBoldCursor) this.f27142b).floatingActionMode;
                if (h4Var != null) {
                    h4Var.c();
                    return true;
                }
                return true;
            default:
                ((n80) this.f27142b).invalidate();
                return true;
        }
    }
}
