package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class gs extends org.telegram.ui.ActionBar.g1 {
    public final js f46150o;

    public gs(js jsVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f46150o = jsVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ns nsVar = this.f46150o.f47066a;
        nsVar.f48266k = null;
        nsVar.K = false;
        if (nsVar.R) {
            nsVar.m();
        }
        View view = nsVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.z7) {
                ((org.telegram.ui.Cells.z7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.x7) {
                ((org.telegram.ui.Cells.x7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.h2) {
                ((org.telegram.ui.Cells.h2) view).setScaled(false);
            }
            nsVar.h = null;
        }
    }
}
