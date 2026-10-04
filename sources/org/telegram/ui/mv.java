package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class mv extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f38761a;
    public FrameLayout f38762b;
    public org.telegram.ui.ActionBar.k f38763c;
    public org.telegram.ui.Components.zl0 d;
    public ai.w0 f38764e;
    public int f38765f;
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
        mv[] mvVarArr = nvVar.f39050f;
        if (nvVar.f39051n && (mvVar = mvVarArr[0]) == this) {
            nvVar.f39049e.j(Math.abs(mvVar.getTranslationX()) / mvVarArr[0].getMeasuredWidth(), mvVarArr[1].f38765f);
        }
    }
}
