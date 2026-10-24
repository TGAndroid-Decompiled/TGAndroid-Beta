package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class qb implements ViewTreeObserver.OnPreDrawListener {
    public final View f40759a;
    public final s4.b1 f40760b;
    public final rb f40761c;

    public qb(rb rbVar, View view, s4.b1 b1Var) {
        this.f40761c = rbVar;
        this.f40759a = view;
        this.f40760b = b1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        View view = this.f40759a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        vb vbVar = this.f40761c.f41085n;
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
        View view2 = this.f40760b.f46342a;
        if (view2 instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) view).a4(i11, measuredHeight2 - i11, (vbVar.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - vbVar.v.getTop(), 0.0f, (view.getY() + vb.G0(vbVar).getMeasuredHeight()) - vbVar.X.getBackgroundTranslationY(), vbVar.X.getMeasuredWidth(), vbVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof org.telegram.ui.Cells.v0) && vb.H0(vbVar) != null && vbVar.X != null) {
            ((org.telegram.ui.Cells.v0) view).Z((view.getY() + vb.I0(vbVar).getMeasuredHeight()) - vbVar.X.getBackgroundTranslationY(), vbVar.X.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}
