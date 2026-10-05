package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class kt extends org.telegram.ui.ActionBar.n1 {
    public final nt f38158o;

    public kt(nt ntVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f38158o = ntVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        rt rtVar = this.f38158o.f39031a;
        rtVar.f40251k = null;
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
