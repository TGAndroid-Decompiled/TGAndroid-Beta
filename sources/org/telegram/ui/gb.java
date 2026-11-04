package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
public final class gb implements ViewTreeObserver.OnPreDrawListener {
    public final View f45615a;
    public final u4.d1 f45616b;
    public final hb f45617c;

    public gb(hb hbVar, View view, u4.d1 d1Var) {
        this.f45617c = hbVar;
        this.f45615a = view;
        this.f45616b = d1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i3;
        View view = this.f45615a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        kb kbVar = this.f45617c.f45891n;
        int measuredHeight = kbVar.f46885w.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        if (top >= 0) {
            i3 = 0;
        } else {
            i3 = -top;
        }
        int i10 = i3;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i10 + measuredHeight;
        }
        View view2 = this.f45616b.f55540a;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view).y3(i10, measuredHeight2 - i10, (kbVar.Y.getHeightWithKeyboard() - org.telegram.messenger.g0.L(48.0f)) - kbVar.f46885w.getTop(), 0.0f, (view.getY() + kb.L0(kbVar).getMeasuredHeight()) - kbVar.Y.getBackgroundTranslationY(), kbVar.Y.getMeasuredWidth(), kbVar.Y.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof org.telegram.ui.Cells.t0) && kb.M0(kbVar) != null && kbVar.Y != null) {
            ((org.telegram.ui.Cells.t0) view).h0((view.getY() + kb.N0(kbVar).getMeasuredHeight()) - kbVar.Y.getBackgroundTranslationY(), kbVar.Y.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}
