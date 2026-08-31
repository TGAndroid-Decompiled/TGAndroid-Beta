package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class nb implements ViewTreeObserver.OnPreDrawListener {
    public final View f39370a;
    public final f2.m1 f39371b;
    public final ob f39372c;

    public nb(ob obVar, View view, f2.m1 m1Var) {
        this.f39372c = obVar;
        this.f39370a = view;
        this.f39371b = m1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        View view = this.f39370a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        sb sbVar = this.f39372c.f39702n;
        int measuredHeight = sbVar.B.getMeasuredHeight();
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
        View view2 = this.f39371b.f5875a;
        if (view2 instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) view).b4(i10, measuredHeight2 - i10, (sbVar.Y.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - sbVar.B.getTop(), 0.0f, (view.getY() + sb.G0(sbVar).getMeasuredHeight()) - sbVar.Y.getBackgroundTranslationY(), sbVar.Y.getMeasuredWidth(), sbVar.Y.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof org.telegram.ui.Cells.v0) && sb.H0(sbVar) != null && sbVar.Y != null) {
            ((org.telegram.ui.Cells.v0) view).W((view.getY() + sb.I0(sbVar).getMeasuredHeight()) - sbVar.Y.getBackgroundTranslationY(), sbVar.Y.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}
