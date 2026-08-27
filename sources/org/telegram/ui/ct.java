package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class ct extends org.telegram.ui.ActionBar.n1 {

    public final ft f37147o;

    public ct(ft ftVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f37147o = ftVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        kt ktVar = this.f37147o.f38203a;
        ktVar.f39867k = null;
        ktVar.K = false;
        if (ktVar.R) {
            ktVar.n();
        }
        View view = ktVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.a8) {
                ((org.telegram.ui.Cells.a8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.y7) {
                ((org.telegram.ui.Cells.y7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d2) {
                ((org.telegram.ui.Cells.d2) view).setScaled(false);
            }
            ktVar.h = null;
        }
    }
}
