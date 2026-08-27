package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;

public final class ct implements ViewTreeObserver.OnPreDrawListener {

    public final int f27538a;

    public final View f27539b;

    public ct(int i10, View view) {
        this.f27538a = i10;
        this.f27539b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27538a) {
            case 0:
                org.telegram.ui.ActionBar.g4 g4Var = ((EditTextBoldCursor) this.f27539b).floatingActionMode;
                if (g4Var != null) {
                    g4Var.e();
                }
                break;
            default:
                ((z60) this.f27539b).invalidate();
                break;
        }
        return true;
    }
}
