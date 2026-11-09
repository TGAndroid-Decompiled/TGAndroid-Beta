package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class fs extends org.telegram.ui.ActionBar.g1 {
    public final is f45783o;

    public fs(is isVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f45783o = isVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ms msVar = this.f45783o.f46750a;
        msVar.f47969k = null;
        msVar.K = false;
        if (msVar.R) {
            msVar.m();
        }
        View view = msVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.z7) {
                ((org.telegram.ui.Cells.z7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.x7) {
                ((org.telegram.ui.Cells.x7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.h2) {
                ((org.telegram.ui.Cells.h2) view).setScaled(false);
            }
            msVar.h = null;
        }
    }
}
