package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class kb implements ViewTreeObserver.OnPreDrawListener {
    public final View f39787a;
    public final f2.q1 f39788b;
    public final lb f39789c;

    public kb(lb lbVar, View view, f2.q1 q1Var) {
        this.f39789c = lbVar;
        this.f39787a = view;
        this.f39788b = q1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i9;
        View view = this.f39787a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        pb pbVar = this.f39789c.f40103n;
        int measuredHeight = pbVar.A.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        if (top >= 0) {
            i9 = 0;
        } else {
            i9 = -top;
        }
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i9 + measuredHeight;
        }
        View view2 = this.f39788b.f5501a;
        if (view2 instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) view).b4(i9, measuredHeight2 - i9, (pbVar.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - pbVar.A.getTop(), 0.0f, (view.getY() + pb.F0(pbVar).getMeasuredHeight()) - pbVar.X.getBackgroundTranslationY(), pbVar.X.getMeasuredWidth(), pbVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof org.telegram.ui.Cells.w0) && pb.G0(pbVar) != null && pbVar.X != null) {
            ((org.telegram.ui.Cells.w0) view).V((view.getY() + pb.H0(pbVar).getMeasuredHeight()) - pbVar.X.getBackgroundTranslationY(), pbVar.X.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}
