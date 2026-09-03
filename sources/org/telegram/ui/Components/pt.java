package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class pt implements ViewTreeObserver.OnPreDrawListener {
    public final int f30184a;
    public final View f30185b;

    public pt(int i10, View view) {
        this.f30184a = i10;
        this.f30185b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f30184a) {
            case 0:
                org.telegram.ui.ActionBar.k4 k4Var = ((EditTextBoldCursor) this.f30185b).floatingActionMode;
                if (k4Var != null) {
                    k4Var.e();
                    return true;
                }
                return true;
            default:
                ((o70) this.f30185b).invalidate();
                return true;
        }
    }
}
