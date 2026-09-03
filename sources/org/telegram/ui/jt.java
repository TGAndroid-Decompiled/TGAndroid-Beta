package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class jt extends org.telegram.ui.ActionBar.p1 {
    public final mt f38120o;

    public jt(mt mtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f38120o = mtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        qt qtVar = this.f38120o.f39067a;
        qtVar.f40656k = null;
        qtVar.K = false;
        if (qtVar.R) {
            qtVar.n();
        }
        View view = qtVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.d8) {
                ((org.telegram.ui.Cells.d8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.b8) {
                ((org.telegram.ui.Cells.b8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.e2) {
                ((org.telegram.ui.Cells.e2) view).setScaled(false);
            }
            qtVar.h = null;
        }
    }
}
