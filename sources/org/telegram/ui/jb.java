package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class jb implements ViewTreeObserver.OnPreDrawListener {
    public final View f39502a;
    public final f2.n1 f39503b;
    public final kb f39504c;

    public jb(kb kbVar, View view, f2.n1 n1Var) {
        this.f39504c = kbVar;
        this.f39502a = view;
        this.f39503b = n1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        View view = this.f39502a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ob obVar = this.f39504c.f39829n;
        int measuredHeight = obVar.A.getMeasuredHeight();
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
        View view2 = this.f39503b.f6432a;
        if (view2 instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) view).b4(i10, measuredHeight2 - i10, (obVar.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - obVar.A.getTop(), 0.0f, (view.getY() + ob.G0(obVar).getMeasuredHeight()) - obVar.X.getBackgroundTranslationY(), obVar.X.getMeasuredWidth(), obVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof org.telegram.ui.Cells.v0) && ob.H0(obVar) != null && obVar.X != null) {
            ((org.telegram.ui.Cells.v0) view).W((view.getY() + ob.I0(obVar).getMeasuredHeight()) - obVar.X.getBackgroundTranslationY(), obVar.X.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}
