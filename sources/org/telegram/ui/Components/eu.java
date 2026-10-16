package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class eu implements ViewTreeObserver.OnPreDrawListener {
    public final int f24488a;
    public final View f24489b;

    public eu(int i10, View view) {
        this.f24488a = i10;
        this.f24489b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f24488a) {
            case 0:
                org.telegram.ui.ActionBar.g4 g4Var = ((EditTextBoldCursor) this.f24489b).floatingActionMode;
                if (g4Var != null) {
                    g4Var.c();
                    return true;
                }
                return true;
            default:
                ((j80) this.f24489b).invalidate();
                return true;
        }
    }
}
