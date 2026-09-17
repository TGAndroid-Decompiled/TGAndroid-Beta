package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class nv extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f39063a;
    public FrameLayout f39064b;
    public org.telegram.ui.ActionBar.k f39065c;
    public org.telegram.ui.Components.ll0 d;
    public bi.o0 f39066e;
    public int f39067f;
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
        nv[] nvVarArr = ovVar.f39349f;
        if (ovVar.f39350n && (nvVar = nvVarArr[0]) == this) {
            ovVar.f39348e.j(Math.abs(nvVar.getTranslationX()) / nvVarArr[0].getMeasuredWidth(), nvVarArr[1].f39067f);
        }
    }
}
