package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class pb implements ViewTreeObserver.OnPreDrawListener {
    public final View f37057a;
    public final f2.l1 f37058b;
    public final qb f37059c;

    public pb(qb qbVar, View view, f2.l1 l1Var) {
        this.f37059c = qbVar;
        this.f37057a = view;
        this.f37058b = l1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        View view = this.f37057a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ub ubVar = this.f37059c.f37374n;
        int measuredHeight = ubVar.B.getMeasuredHeight();
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
        View view2 = this.f37058b.f5774a;
        if (view2 instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) view).b4(i10, measuredHeight2 - i10, (ubVar.Y.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - ubVar.B.getTop(), 0.0f, (view.getY() + ub.G0(ubVar).getMeasuredHeight()) - ubVar.Y.getBackgroundTranslationY(), ubVar.Y.getMeasuredWidth(), ubVar.Y.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof org.telegram.ui.Cells.v0) && ub.H0(ubVar) != null && ubVar.Y != null) {
            ((org.telegram.ui.Cells.v0) view).W((view.getY() + ub.I0(ubVar).getMeasuredHeight()) - ubVar.Y.getBackgroundTranslationY(), ubVar.Y.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}
