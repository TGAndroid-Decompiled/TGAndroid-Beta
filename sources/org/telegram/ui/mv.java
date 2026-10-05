package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class mv extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f38752a;
    public FrameLayout f38753b;
    public org.telegram.ui.ActionBar.k f38754c;
    public org.telegram.ui.Components.zl0 d;
    public ai.w0 f38755e;
    public int f38756f;
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
        mv[] mvVarArr = nvVar.f39044f;
        if (nvVar.f39045n && (mvVar = mvVarArr[0]) == this) {
            nvVar.f39043e.j(Math.abs(mvVar.getTranslationX()) / mvVarArr[0].getMeasuredWidth(), mvVarArr[1].f38756f);
        }
    }
}
