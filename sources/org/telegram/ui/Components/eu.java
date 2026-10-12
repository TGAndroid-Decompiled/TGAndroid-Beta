package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class eu implements ViewTreeObserver.OnPreDrawListener {
    public final int f24794a;
    public final View f24795b;

    public eu(int i10, View view) {
        this.f24794a = i10;
        this.f24795b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f24794a) {
            case 0:
                org.telegram.ui.ActionBar.g4 g4Var = ((EditTextBoldCursor) this.f24795b).floatingActionMode;
                if (g4Var != null) {
                    g4Var.c();
                    return true;
                }
                return true;
            default:
                ((k80) this.f24795b).invalidate();
                return true;
        }
    }
}
