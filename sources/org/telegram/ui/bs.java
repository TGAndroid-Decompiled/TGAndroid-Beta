package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class bs extends org.telegram.ui.ActionBar.f1 {
    public final es f44134o;

    public bs(es esVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f44134o = esVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        is isVar = this.f44134o.f45025a;
        isVar.f46395k = null;
        isVar.K = false;
        if (isVar.R) {
            isVar.m();
        }
        View view = isVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.y7) {
                ((org.telegram.ui.Cells.y7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.w7) {
                ((org.telegram.ui.Cells.w7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.h2) {
                ((org.telegram.ui.Cells.h2) view).setScaled(false);
            }
            isVar.h = null;
        }
    }
}
