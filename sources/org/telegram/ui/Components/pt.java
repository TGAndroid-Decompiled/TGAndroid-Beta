package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class pt implements ViewTreeObserver.OnPreDrawListener {
    public final int f29514a;
    public final View f29515b;

    public pt(int i10, View view) {
        this.f29514a = i10;
        this.f29515b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f29514a) {
            case 0:
                org.telegram.ui.ActionBar.i4 i4Var = ((EditTextBoldCursor) this.f29515b).floatingActionMode;
                if (i4Var != null) {
                    i4Var.e();
                    return true;
                }
                return true;
            default:
                ((l70) this.f29515b).invalidate();
                return true;
        }
    }
}
