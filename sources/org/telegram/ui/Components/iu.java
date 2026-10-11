package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class iu implements ViewTreeObserver.OnPreDrawListener {
    public final int f27515a;
    public final View f27516b;

    public iu(int i10, View view) {
        this.f27515a = i10;
        this.f27516b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27515a) {
            case 0:
                org.telegram.ui.ActionBar.g4 g4Var = ((EditTextBoldCursor) this.f27516b).floatingActionMode;
                if (g4Var != null) {
                    g4Var.c();
                    return true;
                }
                return true;
            default:
                ((n80) this.f27516b).invalidate();
                return true;
        }
    }
}
