package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class mq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f39334a;
    public FrameLayout f39335b;
    public org.telegram.ui.ActionBar.k f39336c;
    public org.telegram.ui.Components.jm0 d;
    public int e;
    public final oq0 f39337f;

    public mq0(oq0 oq0Var, Context context) {
        super(context);
        this.f39337f = oq0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        mq0 mq0Var;
        super.setTranslationX(f7);
        oq0 oq0Var = this.f39337f;
        mq0[] mq0VarArr = oq0Var.f39967n;
        if (oq0Var.f39969s && (mq0Var = mq0VarArr[0]) == this) {
            oq0Var.h.j(Math.abs(mq0Var.getTranslationX()) / mq0VarArr[0].getMeasuredWidth(), mq0VarArr[1].e);
        }
    }
}
