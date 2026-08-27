package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

public final class lb implements ViewTreeObserver.OnPreDrawListener {

    public final View f40037a;

    public final f2.o1 f40038b;

    public final mb f40039c;

    public lb(mb mbVar, View view, f2.o1 o1Var) {
        this.f40039c = mbVar;
        this.f40037a = view;
        this.f40038b = o1Var;
    }

    @Override
    public final boolean onPreDraw() {
        View view = this.f40037a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        qb qbVar = this.f40039c.f40428n;
        int measuredHeight = qbVar.A.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        int i10 = top >= 0 ? 0 : -top;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i10 + measuredHeight;
        }
        View view2 = this.f40038b.f5789a;
        if (view2 instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) view).a4(i10, measuredHeight2 - i10, (qbVar.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - qbVar.A.getTop(), 0.0f, (view.getY() + ((org.telegram.ui.ActionBar.n2) qbVar).actionBar.getMeasuredHeight()) - qbVar.X.getBackgroundTranslationY(), qbVar.X.getMeasuredWidth(), qbVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        }
        if (!(view2 instanceof org.telegram.ui.Cells.v0) || ((org.telegram.ui.ActionBar.n2) qbVar).actionBar == null || qbVar.X == null) {
            return true;
        }
        ((org.telegram.ui.Cells.v0) view).W((view.getY() + ((org.telegram.ui.ActionBar.n2) qbVar).actionBar.getMeasuredHeight()) - qbVar.X.getBackgroundTranslationY(), qbVar.X.getBackgroundSizeY());
        return true;
    }
}
