package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ov extends FrameLayout {
    public org.telegram.ui.ActionBar.m2 f40778a;
    public FrameLayout f40779b;
    public org.telegram.ui.ActionBar.k f40780c;
    public org.telegram.ui.Components.wm0 d;
    public ai.w0 f40781e;
    public int f40782f;
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
        ov[] ovVarArr = pvVar.f41101f;
        if (pvVar.f41102n && (ovVar = ovVarArr[0]) == this) {
            pvVar.f41100e.j(Math.abs(ovVar.getTranslationX()) / ovVarArr[0].getMeasuredWidth(), ovVarArr[1].f40782f);
        }
    }
}
