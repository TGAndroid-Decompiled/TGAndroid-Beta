package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class mq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f39325a;
    public FrameLayout f39326b;
    public org.telegram.ui.ActionBar.k f39327c;
    public org.telegram.ui.Components.im0 d;
    public int e;
    public final oq0 f39328f;

    public mq0(oq0 oq0Var, Context context) {
        super(context);
        this.f39328f = oq0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        mq0 mq0Var;
        super.setTranslationX(f7);
        oq0 oq0Var = this.f39328f;
        mq0[] mq0VarArr = oq0Var.f39958n;
        if (oq0Var.f39960s && (mq0Var = mq0VarArr[0]) == this) {
            oq0Var.h.j(Math.abs(mq0Var.getTranslationX()) / mq0VarArr[0].getMeasuredWidth(), mq0VarArr[1].e);
        }
    }
}
