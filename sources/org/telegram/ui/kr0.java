package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class kr0 extends FrameLayout {
    public org.telegram.ui.ActionBar.m2 f37712a;
    public FrameLayout f37713b;
    public org.telegram.ui.ActionBar.k f37714c;
    public org.telegram.ui.Components.mm0 d;
    public int e;
    public final mr0 f37715f;

    public kr0(mr0 mr0Var, Context context) {
        super(context);
        this.f37715f = mr0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        kr0 kr0Var;
        super.setTranslationX(f7);
        mr0 mr0Var = this.f37715f;
        kr0[] kr0VarArr = mr0Var.f38322n;
        if (mr0Var.f38324s && (kr0Var = kr0VarArr[0]) == this) {
            mr0Var.h.j(Math.abs(kr0Var.getTranslationX()) / kr0VarArr[0].getMeasuredWidth(), kr0VarArr[1].e);
        }
    }
}
