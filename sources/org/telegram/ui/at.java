package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class at extends org.telegram.ui.ActionBar.m1 {
    public final dt f35834o;

    public at(dt dtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f35834o = dtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ht htVar = this.f35834o.f36721a;
        htVar.f37995k = null;
        htVar.K = false;
        if (htVar.R) {
            htVar.l();
        }
        View view = htVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.e8) {
                ((org.telegram.ui.Cells.e8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.c8) {
                ((org.telegram.ui.Cells.c8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.e2) {
                ((org.telegram.ui.Cells.e2) view).setScaled(false);
            }
            htVar.h = null;
        }
    }
}
