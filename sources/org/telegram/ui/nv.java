package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class nv extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f39036a;
    public FrameLayout f39037b;
    public org.telegram.ui.ActionBar.k f39038c;
    public org.telegram.ui.Components.ll0 d;
    public bi.o0 f39039e;
    public int f39040f;
    public final ov h;

    public nv(ov ovVar, Context context) {
        super(context);
        this.h = ovVar;
    }

    @Override
    public final void setTranslationX(float f7) {
        nv nvVar;
        super.setTranslationX(f7);
        ov ovVar = this.h;
        nv[] nvVarArr = ovVar.f39322f;
        if (ovVar.f39323n && (nvVar = nvVarArr[0]) == this) {
            ovVar.f39321e.j(Math.abs(nvVar.getTranslationX()) / nvVarArr[0].getMeasuredWidth(), nvVarArr[1].f39040f);
        }
    }
}
