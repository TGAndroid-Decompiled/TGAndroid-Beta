package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class pt implements ViewTreeObserver.OnPreDrawListener {
    public final int f30196a;
    public final View f30197b;

    public pt(int i10, View view) {
        this.f30196a = i10;
        this.f30197b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f30196a) {
            case 0:
                org.telegram.ui.ActionBar.k4 k4Var = ((EditTextBoldCursor) this.f30197b).floatingActionMode;
                if (k4Var != null) {
                    k4Var.e();
                    return true;
                }
                return true;
            default:
                ((o70) this.f30197b).invalidate();
                return true;
        }
    }
}
