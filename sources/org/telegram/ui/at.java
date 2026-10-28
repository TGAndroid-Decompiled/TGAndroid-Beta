package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class at extends org.telegram.ui.ActionBar.o1 {
    public final dt f37820o;

    public at(dt dtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f37820o = dtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ht htVar = this.f37820o.f38675a;
        htVar.f39973k = null;
        htVar.K = false;
        if (htVar.R) {
            htVar.l();
        }
        View view = htVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.i8) {
                ((org.telegram.ui.Cells.i8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.g8) {
                ((org.telegram.ui.Cells.g8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d2) {
                ((org.telegram.ui.Cells.d2) view).setScaled(false);
            }
            htVar.h = null;
        }
    }
}
