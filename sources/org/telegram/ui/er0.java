package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class er0 extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f37358a;
    public FrameLayout f37359b;
    public org.telegram.ui.ActionBar.k f37360c;
    public org.telegram.ui.Components.rm0 d;
    public int f37361e;
    public final gr0 f37362f;

    public er0(gr0 gr0Var, Context context) {
        super(context);
        this.f37362f = gr0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        er0 er0Var;
        super.setTranslationX(f7);
        gr0 gr0Var = this.f37362f;
        er0[] er0VarArr = gr0Var.f38133n;
        if (gr0Var.f38135s && (er0Var = er0VarArr[0]) == this) {
            gr0Var.h.j(Math.abs(er0Var.getTranslationX()) / er0VarArr[0].getMeasuredWidth(), er0VarArr[1].f37361e);
        }
    }
}
