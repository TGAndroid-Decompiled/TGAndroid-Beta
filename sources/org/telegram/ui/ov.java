package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ov extends FrameLayout {
    public org.telegram.ui.ActionBar.p2 f35616a;
    public FrameLayout f35617b;
    public org.telegram.ui.ActionBar.l f35618c;
    public org.telegram.ui.Components.vl0 d;
    public bi.y1 e;
    public int f35619f;
    public final pv h;

    public ov(pv pvVar, Context context) {
        super(context);
        this.h = pvVar;
    }

    @Override
    public final void setTranslationX(float f7) {
        ov ovVar;
        super.setTranslationX(f7);
        pv pvVar = this.h;
        ov[] ovVarArr = pvVar.f35910f;
        if (pvVar.f35911n && (ovVar = ovVarArr[0]) == this) {
            pvVar.e.j(Math.abs(ovVar.getTranslationX()) / ovVarArr[0].getMeasuredWidth(), ovVarArr[1].f35619f);
        }
    }
}
