package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ir0 extends FrameLayout {
    public org.telegram.ui.ActionBar.m2 f36861a;
    public FrameLayout f36862b;
    public org.telegram.ui.ActionBar.k f36863c;
    public org.telegram.ui.Components.mm0 d;
    public int e;
    public final kr0 f36864f;

    public ir0(kr0 kr0Var, Context context) {
        super(context);
        this.f36864f = kr0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        ir0 ir0Var;
        super.setTranslationX(f7);
        kr0 kr0Var = this.f36864f;
        ir0[] ir0VarArr = kr0Var.f37495n;
        if (kr0Var.f37497s && (ir0Var = ir0VarArr[0]) == this) {
            kr0Var.h.j(Math.abs(ir0Var.getTranslationX()) / ir0VarArr[0].getMeasuredWidth(), ir0VarArr[1].e);
        }
    }
}
