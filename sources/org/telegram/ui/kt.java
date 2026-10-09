package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class kt extends org.telegram.ui.ActionBar.n1 {
    public final nt f39346o;

    public kt(nt ntVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f39346o = ntVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        rt rtVar = this.f39346o.f40360a;
        rtVar.f41495k = null;
        rtVar.K = false;
        if (rtVar.R) {
            rtVar.n();
        }
        View view = rtVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.f8) {
                ((org.telegram.ui.Cells.f8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d8) {
                ((org.telegram.ui.Cells.d8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.f2) {
                ((org.telegram.ui.Cells.f2) view).setScaled(false);
            }
            rtVar.h = null;
        }
    }
}
