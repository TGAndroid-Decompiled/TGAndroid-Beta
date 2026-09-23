package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ht extends org.telegram.ui.ActionBar.n1 {
    public final lt f33914o;

    public ht(lt ltVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f33914o = ltVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        pt ptVar = this.f33914o.f35086a;
        ptVar.f36192k = null;
        ptVar.K = false;
        if (ptVar.R) {
            ptVar.n();
        }
        View view = ptVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.g8) {
                ((org.telegram.ui.Cells.g8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.e8) {
                ((org.telegram.ui.Cells.e8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.e2) {
                ((org.telegram.ui.Cells.e2) view).setScaled(false);
            }
            ptVar.h = null;
        }
    }
}
