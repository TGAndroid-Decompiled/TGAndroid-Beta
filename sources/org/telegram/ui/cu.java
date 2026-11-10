package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class cu extends FrameLayout {
    public org.telegram.ui.ActionBar.f2 f44807a;
    public FrameLayout f44808b;
    public org.telegram.ui.ActionBar.l f44809c;
    public org.telegram.ui.Components.pj0 d;
    public bi.q1 f44810e;
    public int f44811f;
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
        cu[] cuVarArr = duVar.f45054f;
        if (duVar.f45055n && (cuVar = cuVarArr[0]) == this) {
            duVar.f45053e.i(Math.abs(cuVar.getTranslationX()) / cuVarArr[0].getMeasuredWidth(), cuVarArr[1].f44811f);
        }
    }
}
