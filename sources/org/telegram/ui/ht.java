package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ht extends org.telegram.ui.ActionBar.p1 {
    public final lt f34948o;

    public ht(lt ltVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f34948o = ltVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        pt ptVar = this.f34948o.f36133a;
        ptVar.f37523k = null;
        ptVar.K = false;
        if (ptVar.R) {
            ptVar.n();
        }
        View view = ptVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.d8) {
                ((org.telegram.ui.Cells.d8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.b8) {
                ((org.telegram.ui.Cells.b8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.e2) {
                ((org.telegram.ui.Cells.e2) view).setScaled(false);
            }
            ptVar.h = null;
        }
    }
}
