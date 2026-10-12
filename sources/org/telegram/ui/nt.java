package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class nt extends org.telegram.ui.ActionBar.m1 {
    public final qt f40474o;

    public nt(qt qtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f40474o = qtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ut utVar = this.f40474o.f41433a;
        utVar.f42579k = null;
        utVar.K = false;
        if (utVar.R) {
            utVar.n();
        }
        View view = utVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.f8) {
                ((org.telegram.ui.Cells.f8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d8) {
                ((org.telegram.ui.Cells.d8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.f2) {
                ((org.telegram.ui.Cells.f2) view).setScaled(false);
            }
            utVar.h = null;
        }
    }
}
