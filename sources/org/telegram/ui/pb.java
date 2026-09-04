package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class pb implements ViewTreeObserver.OnPreDrawListener {
    public final View f39460a;
    public final s4.c1 f39461b;
    public final qb f39462c;

    public pb(qb qbVar, View view, s4.c1 c1Var) {
        this.f39462c = qbVar;
        this.f39460a = view;
        this.f39461b = c1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        View view = this.f39460a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ub ubVar = this.f39462c.f39822n;
        int measuredHeight = ubVar.E.getMeasuredHeight();
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
        View view2 = this.f39461b.f45738a;
        if (view2 instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) view).b4(i10, measuredHeight2 - i10, (ubVar.f41018b0.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - ubVar.E.getTop(), 0.0f, (view.getY() + ub.G0(ubVar).getMeasuredHeight()) - ubVar.f41018b0.getBackgroundTranslationY(), ubVar.f41018b0.getMeasuredWidth(), ubVar.f41018b0.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof org.telegram.ui.Cells.w0) && ub.H0(ubVar) != null && ubVar.f41018b0 != null) {
            ((org.telegram.ui.Cells.w0) view).W((view.getY() + ub.I0(ubVar).getMeasuredHeight()) - ubVar.f41018b0.getBackgroundTranslationY(), ubVar.f41018b0.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}
