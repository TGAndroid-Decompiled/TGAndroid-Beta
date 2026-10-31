package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
public final class ob implements ViewTreeObserver.OnPreDrawListener {
    public final View f40218a;
    public final s4.c1 f40219b;
    public final pb f40220c;

    public ob(pb pbVar, View view, s4.c1 c1Var) {
        this.f40220c = pbVar;
        this.f40218a = view;
        this.f40219b = c1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        View view = this.f40218a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        sb sbVar = this.f40220c.f40563n;
        int measuredHeight = sbVar.f41453w.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        if (top >= 0) {
            i10 = 0;
        } else {
            i10 = -top;
        }
        int i11 = i10;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i11 + measuredHeight;
        }
        View view2 = this.f40219b.f47898a;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view).w3(i11, measuredHeight2 - i11, (sbVar.X.getHeightWithKeyboard() - org.telegram.messenger.i0.L(48.0f)) - sbVar.f41453w.getTop(), 0.0f, (view.getY() + sb.K0(sbVar).getMeasuredHeight()) - sbVar.X.getBackgroundTranslationY(), sbVar.X.getMeasuredWidth(), sbVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof org.telegram.ui.Cells.s0) && sb.L0(sbVar) != null && sbVar.X != null) {
            ((org.telegram.ui.Cells.s0) view).g0((view.getY() + sb.M0(sbVar).getMeasuredHeight()) - sbVar.X.getBackgroundTranslationY(), sbVar.X.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}
