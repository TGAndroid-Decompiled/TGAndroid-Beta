package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class qb implements ViewTreeObserver.OnPreDrawListener {
    public final View f41116a;
    public final s4.d1 f41117b;
    public final rb f41118c;

    public qb(rb rbVar, View view, s4.d1 d1Var) {
        this.f41118c = rbVar;
        this.f41116a = view;
        this.f41117b = d1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        View view = this.f41116a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        vb vbVar = this.f41118c.f41412n;
        int measuredHeight = vbVar.v.getMeasuredHeight();
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
        View view2 = this.f41117b.f47702a;
        if (view2 instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).b4(i11, measuredHeight2 - i11, (vbVar.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - vbVar.v.getTop(), 0.0f, (view.getY() + vb.G0(vbVar).getMeasuredHeight()) - vbVar.X.getBackgroundTranslationY(), vbVar.X.getMeasuredWidth(), vbVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof org.telegram.ui.Cells.w0) && vb.H0(vbVar) != null && vbVar.X != null) {
            ((org.telegram.ui.Cells.w0) view).a0((view.getY() + vb.I0(vbVar).getMeasuredHeight()) - vbVar.X.getBackgroundTranslationY(), vbVar.X.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}
