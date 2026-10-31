package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class dt extends org.telegram.ui.ActionBar.k1 {
    public final gt f36824o;

    public dt(gt gtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f36824o = gtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        lt ltVar = this.f36824o.f37643a;
        ltVar.f39395k = null;
        ltVar.K = false;
        if (ltVar.R) {
            ltVar.m();
        }
        View view = ltVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.d8) {
                ((org.telegram.ui.Cells.d8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.b8) {
                ((org.telegram.ui.Cells.b8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.h2) {
                ((org.telegram.ui.Cells.h2) view).setScaled(false);
            }
            ltVar.h = null;
        }
    }
}
