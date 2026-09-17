package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class er0 extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f36182a;
    public FrameLayout f36183b;
    public org.telegram.ui.ActionBar.k f36184c;
    public org.telegram.ui.Components.ll0 d;
    public int f36185e;
    public final gr0 f36186f;

    public er0(gr0 gr0Var, Context context) {
        super(context);
        this.f36186f = gr0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        er0 er0Var;
        super.setTranslationX(f7);
        gr0 gr0Var = this.f36186f;
        er0[] er0VarArr = gr0Var.f36785n;
        if (gr0Var.f36787s && (er0Var = er0VarArr[0]) == this) {
            gr0Var.h.j(Math.abs(er0Var.getTranslationX()) / er0VarArr[0].getMeasuredWidth(), er0VarArr[1].f36185e);
        }
    }
}
