package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class qb implements ViewTreeObserver.OnPreDrawListener {
    public final View f36893a;
    public final s4.c1 f36894b;
    public final rb f36895c;

    public qb(rb rbVar, View view, s4.c1 c1Var) {
        this.f36895c = rbVar;
        this.f36893a = view;
        this.f36894b = c1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        View view = this.f36893a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        vb vbVar = this.f36895c.f37120n;
        int measuredHeight = vbVar.v.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        if (top >= 0) {
            i10 = 0;
        } else {
            i10 = -top;
        }
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i10 + measuredHeight;
        }
        View view2 = this.f36894b.f42995a;
        if (view2 instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).b4(i10, measuredHeight2 - i10, (vbVar.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - vbVar.v.getTop(), 0.0f, (view.getY() + vb.G0(vbVar).getMeasuredHeight()) - vbVar.X.getBackgroundTranslationY(), vbVar.X.getMeasuredWidth(), vbVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof org.telegram.ui.Cells.w0) && vb.H0(vbVar) != null && vbVar.X != null) {
            ((org.telegram.ui.Cells.w0) view).W((view.getY() + vb.I0(vbVar).getMeasuredHeight()) - vbVar.X.getBackgroundTranslationY(), vbVar.X.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}
