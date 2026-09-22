package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class mv extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f35812a;
    public FrameLayout f35813b;
    public org.telegram.ui.ActionBar.k f35814c;
    public org.telegram.ui.Components.ll0 d;
    public ai.w0 e;
    public int f35815f;
    public final nv h;

    public mv(nv nvVar, Context context) {
        super(context);
        this.h = nvVar;
    }

    @Override
    public final void setTranslationX(float f7) {
        mv mvVar;
        super.setTranslationX(f7);
        nv nvVar = this.h;
        mv[] mvVarArr = nvVar.f36055f;
        if (nvVar.f36056n && (mvVar = mvVarArr[0]) == this) {
            nvVar.e.j(Math.abs(mvVar.getTranslationX()) / mvVarArr[0].getMeasuredWidth(), mvVarArr[1].f35815f);
        }
    }
}
