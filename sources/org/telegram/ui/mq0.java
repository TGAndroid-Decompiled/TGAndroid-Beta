package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class mq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f39335a;
    public FrameLayout f39336b;
    public org.telegram.ui.ActionBar.k f39337c;
    public org.telegram.ui.Components.jm0 d;
    public int e;
    public final oq0 f39338f;

    public mq0(oq0 oq0Var, Context context) {
        super(context);
        this.f39338f = oq0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        mq0 mq0Var;
        super.setTranslationX(f7);
        oq0 oq0Var = this.f39338f;
        mq0[] mq0VarArr = oq0Var.f39968n;
        if (oq0Var.f39970s && (mq0Var = mq0VarArr[0]) == this) {
            oq0Var.h.j(Math.abs(mq0Var.getTranslationX()) / mq0VarArr[0].getMeasuredWidth(), mq0VarArr[1].e);
        }
    }
}
