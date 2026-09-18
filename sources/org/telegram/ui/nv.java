package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class nv extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f36057a;
    public FrameLayout f36058b;
    public org.telegram.ui.ActionBar.k f36059c;
    public org.telegram.ui.Components.wl0 d;
    public ai.w0 e;
    public int f36060f;
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
        nv[] nvVarArr = ovVar.f36258f;
        if (ovVar.f36259n && (nvVar = nvVarArr[0]) == this) {
            ovVar.e.j(Math.abs(nvVar.getTranslationX()) / nvVarArr[0].getMeasuredWidth(), nvVarArr[1].f36060f);
        }
    }
}
