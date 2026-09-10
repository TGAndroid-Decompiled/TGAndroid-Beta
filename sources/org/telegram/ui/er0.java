package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class er0 extends FrameLayout {
    public org.telegram.ui.ActionBar.p2 f32588a;
    public FrameLayout f32589b;
    public org.telegram.ui.ActionBar.l f32590c;
    public org.telegram.ui.Components.vl0 d;
    public int e;
    public final gr0 f32591f;

    public er0(gr0 gr0Var, Context context) {
        super(context);
        this.f32591f = gr0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        er0 er0Var;
        super.setTranslationX(f7);
        gr0 gr0Var = this.f32591f;
        er0[] er0VarArr = gr0Var.f33170n;
        if (gr0Var.f33172s && (er0Var = er0VarArr[0]) == this) {
            gr0Var.h.j(Math.abs(er0Var.getTranslationX()) / er0VarArr[0].getMeasuredWidth(), er0VarArr[1].e);
        }
    }
}
