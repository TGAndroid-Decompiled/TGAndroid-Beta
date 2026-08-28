package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class rn extends org.telegram.ui.ActionBar.o1 {
    public final tn f32208o;

    public rn(tn tnVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f32208o = tnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.qn qnVar = this.f32208o.C;
        if (qnVar != null) {
            qnVar.getClass();
            qnVar.g8(false, true, 0.0f);
        }
    }
}
