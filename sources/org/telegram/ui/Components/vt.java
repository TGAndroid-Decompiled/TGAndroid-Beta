package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class vt implements ViewTreeObserver.OnPreDrawListener {
    public final int f28595a;
    public final View f28596b;

    public vt(int i10, View view) {
        this.f28595a = i10;
        this.f28596b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f28595a) {
            case 0:
                org.telegram.ui.ActionBar.k4 k4Var = ((EditTextBoldCursor) this.f28596b).floatingActionMode;
                if (k4Var != null) {
                    k4Var.e();
                    return true;
                }
                return true;
            default:
                ((u70) this.f28596b).invalidate();
                return true;
        }
    }
}
