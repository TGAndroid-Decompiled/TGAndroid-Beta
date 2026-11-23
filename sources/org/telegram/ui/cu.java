package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class cu extends FrameLayout {
    public org.telegram.ui.ActionBar.g2 f46873a;
    public FrameLayout f46874b;
    public org.telegram.ui.ActionBar.k f46875c;
    public org.telegram.ui.Components.ek0 d;
    public di.b1 f46876e;
    public int f46877f;
    public final du h;

    public cu(du duVar, Context context) {
        super(context);
        this.h = duVar;
    }

    @Override
    public final void setTranslationX(float f10) {
        cu cuVar;
        super.setTranslationX(f10);
        du duVar = this.h;
        cu[] cuVarArr = duVar.f47231f;
        if (duVar.f47232n && (cuVar = cuVarArr[0]) == this) {
            duVar.f47230e.i(Math.abs(cuVar.getTranslationX()) / cuVarArr[0].getMeasuredWidth(), cuVarArr[1].f46877f);
        }
    }
}
