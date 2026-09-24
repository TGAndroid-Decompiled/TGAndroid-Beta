package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ft extends org.telegram.ui.ActionBar.m1 {
    public final jt f33741o;

    public ft(jt jtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f33741o = jtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        nt ntVar = this.f33741o.f34854a;
        ntVar.f35960k = null;
        ntVar.K = false;
        if (ntVar.R) {
            ntVar.n();
        }
        View view = ntVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.f8) {
                ((org.telegram.ui.Cells.f8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d8) {
                ((org.telegram.ui.Cells.d8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.f2) {
                ((org.telegram.ui.Cells.f2) view).setScaled(false);
            }
            ntVar.h = null;
        }
    }
}
