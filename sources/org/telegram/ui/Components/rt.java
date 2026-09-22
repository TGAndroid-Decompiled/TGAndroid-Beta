package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
public final class rt implements ViewTreeObserver.OnPreDrawListener {
    public final int f28050a;
    public final View f28051b;

    public rt(int i10, View view) {
        this.f28050a = i10;
        this.f28051b = view;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f28050a) {
            case 0:
                org.telegram.ui.ActionBar.i4 i4Var = ((EditTextBoldCursor) this.f28051b).floatingActionMode;
                if (i4Var != null) {
                    i4Var.e();
                    return true;
                }
                return true;
            default:
                ((w70) this.f28051b).invalidate();
                return true;
        }
    }
}
