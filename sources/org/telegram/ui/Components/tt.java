package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class tt implements ViewTreeObserver.OnPreDrawListener {
    public final int f28624a;
    public final View f28625b;

    public tt(int i10, View view) {
        this.f28624a = i10;
        this.f28625b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f28624a) {
            case 0:
                org.telegram.ui.ActionBar.g4 g4Var = ((EditTextBoldCursor) this.f28625b).floatingActionMode;
                if (g4Var != null) {
                    g4Var.e();
                    return true;
                }
                return true;
            default:
                ((y70) this.f28625b).invalidate();
                return true;
        }
    }
}
