package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
public final class ib implements ViewTreeObserver.OnPreDrawListener {
    public final View f46551a;
    public final v4.d1 f46552b;
    public final jb f46553c;

    public ib(jb jbVar, View view, v4.d1 d1Var) {
        this.f46553c = jbVar;
        this.f46551a = view;
        this.f46552b = d1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i7;
        View view = this.f46551a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        mb mbVar = this.f46553c.f46911n;
        int measuredHeight = mbVar.f47834w.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        if (top >= 0) {
            i7 = 0;
        } else {
            i7 = -top;
        }
        int i10 = i7;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i10 + measuredHeight;
        }
        View view2 = this.f46552b.f57056a;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view).A3(i10, measuredHeight2 - i10, (mbVar.X.getHeightWithKeyboard() - org.telegram.messenger.g0.L(48.0f)) - mbVar.f47834w.getTop(), 0.0f, (view.getY() + mb.L0(mbVar).getMeasuredHeight()) - mbVar.X.getBackgroundTranslationY(), mbVar.X.getMeasuredWidth(), mbVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof org.telegram.ui.Cells.t0) && mb.M0(mbVar) != null && mbVar.X != null) {
            ((org.telegram.ui.Cells.t0) view).i0((view.getY() + mb.N0(mbVar).getMeasuredHeight()) - mbVar.X.getBackgroundTranslationY(), mbVar.X.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}
