package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class kt implements ViewTreeObserver.OnPreDrawListener {
    public final int f30145a;
    public final View f30146b;

    public kt(int i10, View view) {
        this.f30145a = i10;
        this.f30146b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f30145a) {
            case 0:
                org.telegram.ui.ActionBar.g4 g4Var = ((EditTextBoldCursor) this.f30146b).floatingActionMode;
                if (g4Var != null) {
                    g4Var.e();
                    return true;
                }
                return true;
            default:
                ((h70) this.f30146b).invalidate();
                return true;
        }
    }
}
