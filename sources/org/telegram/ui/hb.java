package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
public final class hb implements ViewTreeObserver.OnPreDrawListener {
    public final View f48319a;
    public final v4.f1 f48320b;
    public final ib f48321c;

    public hb(ib ibVar, View view, v4.f1 f1Var) {
        this.f48321c = ibVar;
        this.f48319a = view;
        this.f48320b = f1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i7;
        View view = this.f48319a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        lb lbVar = this.f48321c.f48686n;
        int measuredHeight = lbVar.f49555w.getMeasuredHeight();
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
        View view2 = this.f48320b.f59122a;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view).C3(i10, measuredHeight2 - i10, (lbVar.Y.getHeightWithKeyboard() - org.telegram.messenger.g0.L(48.0f)) - lbVar.f49555w.getTop(), 0.0f, (view.getY() + lb.L0(lbVar).getMeasuredHeight()) - lbVar.Y.getBackgroundTranslationY(), lbVar.Y.getMeasuredWidth(), lbVar.Y.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof org.telegram.ui.Cells.u0) && lb.M0(lbVar) != null && lbVar.Y != null) {
            ((org.telegram.ui.Cells.u0) view).l0((view.getY() + lb.N0(lbVar).getMeasuredHeight()) - lbVar.Y.getBackgroundTranslationY(), lbVar.Y.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}
