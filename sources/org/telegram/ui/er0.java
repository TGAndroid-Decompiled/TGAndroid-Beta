package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class er0 extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f33390a;
    public FrameLayout f33391b;
    public org.telegram.ui.ActionBar.k f33392c;
    public org.telegram.ui.Components.ll0 d;
    public int e;
    public final gr0 f33393f;

    public er0(gr0 gr0Var, Context context) {
        super(context);
        this.f33393f = gr0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        er0 er0Var;
        super.setTranslationX(f7);
        gr0 gr0Var = this.f33393f;
        er0[] er0VarArr = gr0Var.f33994n;
        if (gr0Var.f33996s && (er0Var = er0VarArr[0]) == this) {
            gr0Var.h.j(Math.abs(er0Var.getTranslationX()) / er0VarArr[0].getMeasuredWidth(), er0VarArr[1].e);
        }
    }
}
