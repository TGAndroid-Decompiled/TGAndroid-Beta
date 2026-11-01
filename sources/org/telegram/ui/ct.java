package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ct extends org.telegram.ui.ActionBar.k1 {
    public final ft f36401o;

    public ct(ft ftVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f36401o = ftVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        kt ktVar = this.f36401o.f37231a;
        ktVar.f38985k = null;
        ktVar.K = false;
        if (ktVar.R) {
            ktVar.m();
        }
        View view = ktVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.d8) {
                ((org.telegram.ui.Cells.d8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.b8) {
                ((org.telegram.ui.Cells.b8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.h2) {
                ((org.telegram.ui.Cells.h2) view).setScaled(false);
            }
            ktVar.h = null;
        }
    }
}
