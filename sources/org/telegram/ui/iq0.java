package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class iq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.p2 f35150a;
    public FrameLayout f35151b;
    public org.telegram.ui.ActionBar.k f35152c;
    public org.telegram.ui.Components.sl0 d;
    public int e;
    public final kq0 f35153f;

    public iq0(kq0 kq0Var, Context context) {
        super(context);
        this.f35153f = kq0Var;
    }

    @Override
    public final void setTranslationX(float f10) {
        iq0 iq0Var;
        super.setTranslationX(f10);
        kq0 kq0Var = this.f35153f;
        iq0[] iq0VarArr = kq0Var.f35792n;
        if (kq0Var.f35794s && (iq0Var = iq0VarArr[0]) == this) {
            kq0Var.h.j(Math.abs(iq0Var.getTranslationX()) / iq0VarArr[0].getMeasuredWidth(), iq0VarArr[1].e);
        }
    }
}
