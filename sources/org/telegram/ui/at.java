package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class at extends org.telegram.ui.ActionBar.o1 {
    public final dt f36595o;

    public at(dt dtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f36595o = dtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ht htVar = this.f36595o.f37629a;
        htVar.f39031k = null;
        htVar.K = false;
        if (htVar.R) {
            htVar.n();
        }
        View view = htVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.b8) {
                ((org.telegram.ui.Cells.b8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.z7) {
                ((org.telegram.ui.Cells.z7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d2) {
                ((org.telegram.ui.Cells.d2) view).setScaled(false);
            }
            htVar.h = null;
        }
    }
}
