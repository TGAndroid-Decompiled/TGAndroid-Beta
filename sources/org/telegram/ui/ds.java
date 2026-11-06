package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ds extends org.telegram.ui.ActionBar.g1 {
    public final gs f45133o;

    public ds(gs gsVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f45133o = gsVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ks ksVar = this.f45133o.f46087a;
        ksVar.f47280k = null;
        ksVar.K = false;
        if (ksVar.R) {
            ksVar.m();
        }
        View view = ksVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.z7) {
                ((org.telegram.ui.Cells.z7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.x7) {
                ((org.telegram.ui.Cells.x7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.h2) {
                ((org.telegram.ui.Cells.h2) view).setScaled(false);
            }
            ksVar.h = null;
        }
    }
}
