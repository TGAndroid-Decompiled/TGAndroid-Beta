package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class pt implements ViewTreeObserver.OnPreDrawListener {
    public final int f29486a;
    public final View f29487b;

    public pt(int i10, View view) {
        this.f29486a = i10;
        this.f29487b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f29486a) {
            case 0:
                org.telegram.ui.ActionBar.i4 i4Var = ((EditTextBoldCursor) this.f29487b).floatingActionMode;
                if (i4Var != null) {
                    i4Var.e();
                    return true;
                }
                return true;
            default:
                ((l70) this.f29487b).invalidate();
                return true;
        }
    }
}
