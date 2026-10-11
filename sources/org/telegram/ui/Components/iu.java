package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class iu implements ViewTreeObserver.OnPreDrawListener {
    public final int f27467a;
    public final View f27468b;

    public iu(int i10, View view) {
        this.f27467a = i10;
        this.f27468b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27467a) {
            case 0:
                org.telegram.ui.ActionBar.g4 g4Var = ((EditTextBoldCursor) this.f27468b).floatingActionMode;
                if (g4Var != null) {
                    g4Var.c();
                    return true;
                }
                return true;
            default:
                ((o80) this.f27468b).invalidate();
                return true;
        }
    }
}
