package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class er0 extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f37314a;
    public FrameLayout f37315b;
    public org.telegram.ui.ActionBar.k f37316c;
    public org.telegram.ui.Components.qm0 d;
    public int f37317e;
    public final gr0 f37318f;

    public er0(gr0 gr0Var, Context context) {
        super(context);
        this.f37318f = gr0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        er0 er0Var;
        super.setTranslationX(f7);
        gr0 gr0Var = this.f37318f;
        er0[] er0VarArr = gr0Var.f38089n;
        if (gr0Var.f38091s && (er0Var = er0VarArr[0]) == this) {
            gr0Var.h.j(Math.abs(er0Var.getTranslationX()) / er0VarArr[0].getMeasuredWidth(), er0VarArr[1].f37317e);
        }
    }
}
