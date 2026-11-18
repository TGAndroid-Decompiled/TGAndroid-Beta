package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class gs extends org.telegram.ui.ActionBar.h1 {
    public final js f48087o;

    public gs(js jsVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f48087o = jsVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ns nsVar = this.f48087o.f49050a;
        nsVar.f50286k = null;
        nsVar.K = false;
        if (nsVar.R) {
            nsVar.m();
        }
        View view = nsVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.a8) {
                ((org.telegram.ui.Cells.a8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.y7) {
                ((org.telegram.ui.Cells.y7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.i2) {
                ((org.telegram.ui.Cells.i2) view).setScaled(false);
            }
            nsVar.h = null;
        }
    }
}
