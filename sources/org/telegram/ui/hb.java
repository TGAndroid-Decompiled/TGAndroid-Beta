package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
public final class hb implements ViewTreeObserver.OnPreDrawListener {
    public final View f47647a;
    public final v4.e1 f47648b;
    public final ib f47649c;

    public hb(ib ibVar, View view, v4.e1 e1Var) {
        this.f47649c = ibVar;
        this.f47647a = view;
        this.f47648b = e1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i7;
        View view = this.f47647a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        lb lbVar = this.f47649c.f48003n;
        int measuredHeight = lbVar.f48954w.getMeasuredHeight();
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
        View view2 = this.f47648b.f58535a;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view).B3(i10, measuredHeight2 - i10, (lbVar.Y.getHeightWithKeyboard() - org.telegram.messenger.g0.L(48.0f)) - lbVar.f48954w.getTop(), 0.0f, (view.getY() + lb.L0(lbVar).getMeasuredHeight()) - lbVar.Y.getBackgroundTranslationY(), lbVar.Y.getMeasuredWidth(), lbVar.Y.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof org.telegram.ui.Cells.t0) && lb.M0(lbVar) != null && lbVar.Y != null) {
            ((org.telegram.ui.Cells.t0) view).j0((view.getY() + lb.N0(lbVar).getMeasuredHeight()) - lbVar.Y.getBackgroundTranslationY(), lbVar.Y.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}
