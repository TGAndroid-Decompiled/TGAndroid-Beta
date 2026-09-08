package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class nv extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f39062a;
    public FrameLayout f39063b;
    public org.telegram.ui.ActionBar.k f39064c;
    public org.telegram.ui.Components.ll0 d;
    public bi.o0 f39065e;
    public int f39066f;
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
        nv[] nvVarArr = ovVar.f39348f;
        if (ovVar.f39349n && (nvVar = nvVarArr[0]) == this) {
            ovVar.f39347e.j(Math.abs(nvVar.getTranslationX()) / nvVarArr[0].getMeasuredWidth(), nvVarArr[1].f39066f);
        }
    }
}
