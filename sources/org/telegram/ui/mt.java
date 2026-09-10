package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mt extends org.telegram.ui.ActionBar.p1 {
    public final pt f35058o;

    public mt(pt ptVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f35058o = ptVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        tt ttVar = this.f35058o.f35899a;
        ttVar.f37025k = null;
        ttVar.K = false;
        if (ttVar.R) {
            ttVar.n();
        }
        View view = ttVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.g8) {
                ((org.telegram.ui.Cells.g8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.e8) {
                ((org.telegram.ui.Cells.e8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.e2) {
                ((org.telegram.ui.Cells.e2) view).setScaled(false);
            }
            ttVar.h = null;
        }
    }
}
