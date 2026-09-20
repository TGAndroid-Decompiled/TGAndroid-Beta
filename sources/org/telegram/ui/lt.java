package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class lt extends org.telegram.ui.ActionBar.n1 {
    public final ot f35523o;

    public lt(ot otVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f35523o = otVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        st stVar = this.f35523o.f36366a;
        stVar.f37536k = null;
        stVar.K = false;
        if (stVar.R) {
            stVar.n();
        }
        View view = stVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.g8) {
                ((org.telegram.ui.Cells.g8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.e8) {
                ((org.telegram.ui.Cells.e8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.f2) {
                ((org.telegram.ui.Cells.f2) view).setScaled(false);
            }
            stVar.h = null;
        }
    }
}
