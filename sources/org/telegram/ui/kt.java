package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class kt extends org.telegram.ui.ActionBar.p1 {
    public final nt f35582o;

    public kt(nt ntVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f35582o = ntVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        rt rtVar = this.f35582o.f36580a;
        rtVar.f38039k = null;
        rtVar.K = false;
        if (rtVar.R) {
            rtVar.n();
        }
        View view = rtVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.c8) {
                ((org.telegram.ui.Cells.c8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.a8) {
                ((org.telegram.ui.Cells.a8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d2) {
                ((org.telegram.ui.Cells.d2) view).setScaled(false);
            }
            rtVar.h = null;
        }
    }
}
