package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class kq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.p2 f38491a;
    public FrameLayout f38492b;
    public org.telegram.ui.ActionBar.k f38493c;
    public org.telegram.ui.Components.tl0 d;
    public int f38494e;
    public final mq0 f38495f;

    public kq0(mq0 mq0Var, Context context) {
        super(context);
        this.f38495f = mq0Var;
    }

    @Override
    public final void setTranslationX(float f10) {
        kq0 kq0Var;
        super.setTranslationX(f10);
        mq0 mq0Var = this.f38495f;
        kq0[] kq0VarArr = mq0Var.f39204n;
        if (mq0Var.f39206s && (kq0Var = kq0VarArr[0]) == this) {
            mq0Var.h.j(Math.abs(kq0Var.getTranslationX()) / kq0VarArr[0].getMeasuredWidth(), kq0VarArr[1].f38494e);
        }
    }
}
