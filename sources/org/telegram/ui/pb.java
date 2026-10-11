package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class pb implements ViewTreeObserver.OnPreDrawListener {
    public final View f40813a;
    public final s4.d1 f40814b;
    public final qb f40815c;

    public pb(qb qbVar, View view, s4.d1 d1Var) {
        this.f40815c = qbVar;
        this.f40813a = view;
        this.f40814b = d1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        View view = this.f40813a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ub ubVar = this.f40815c.f41128n;
        int measuredHeight = ubVar.v.getMeasuredHeight();
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
        View view2 = this.f40814b.f47748a;
        if (view2 instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).b4(i11, measuredHeight2 - i11, (ubVar.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - ubVar.v.getTop(), 0.0f, (view.getY() + ub.G0(ubVar).getMeasuredHeight()) - ubVar.X.getBackgroundTranslationY(), ubVar.X.getMeasuredWidth(), ubVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof org.telegram.ui.Cells.w0) && ub.H0(ubVar) != null && ubVar.X != null) {
            ((org.telegram.ui.Cells.w0) view).a0((view.getY() + ub.I0(ubVar).getMeasuredHeight()) - ubVar.X.getBackgroundTranslationY(), ubVar.X.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}
