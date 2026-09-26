package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class pb implements ViewTreeObserver.OnPreDrawListener {
    public final View f36487a;
    public final s4.c1 f36488b;
    public final qb f36489c;

    public pb(qb qbVar, View view, s4.c1 c1Var) {
        this.f36489c = qbVar;
        this.f36487a = view;
        this.f36488b = c1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        View view = this.f36487a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ub ubVar = this.f36489c.f36848n;
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
        View view2 = this.f36488b.f42960a;
        if (view2 instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).b4(i10, measuredHeight2 - i10, (ubVar.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - ubVar.v.getTop(), 0.0f, (view.getY() + ub.G0(ubVar).getMeasuredHeight()) - ubVar.X.getBackgroundTranslationY(), ubVar.X.getMeasuredWidth(), ubVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof org.telegram.ui.Cells.w0) && ub.H0(ubVar) != null && ubVar.X != null) {
            ((org.telegram.ui.Cells.w0) view).W((view.getY() + ub.I0(ubVar).getMeasuredHeight()) - ubVar.X.getBackgroundTranslationY(), ubVar.X.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}
