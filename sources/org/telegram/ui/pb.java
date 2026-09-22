package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class pb implements ViewTreeObserver.OnPreDrawListener {
    public final View f36523a;
    public final s4.c1 f36524b;
    public final qb f36525c;

    public pb(qb qbVar, View view, s4.c1 c1Var) {
        this.f36525c = qbVar;
        this.f36523a = view;
        this.f36524b = c1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        View view = this.f36523a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ub ubVar = this.f36525c.f36824n;
        int measuredHeight = ubVar.v.getMeasuredHeight();
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
        View view2 = this.f36524b.f42671a;
        if (view2 instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) view).b4(i10, measuredHeight2 - i10, (ubVar.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - ubVar.v.getTop(), 0.0f, (view.getY() + ub.G0(ubVar).getMeasuredHeight()) - ubVar.X.getBackgroundTranslationY(), ubVar.X.getMeasuredWidth(), ubVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof org.telegram.ui.Cells.w0) && ub.H0(ubVar) != null && ubVar.X != null) {
            ((org.telegram.ui.Cells.w0) view).W((view.getY() + ub.I0(ubVar).getMeasuredHeight()) - ubVar.X.getBackgroundTranslationY(), ubVar.X.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}
