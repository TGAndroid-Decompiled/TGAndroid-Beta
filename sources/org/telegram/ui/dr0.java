package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class dr0 extends FrameLayout {
    public org.telegram.ui.ActionBar.m2 f37072a;
    public FrameLayout f37073b;
    public org.telegram.ui.ActionBar.k f37074c;
    public org.telegram.ui.Components.sm0 d;
    public int f37075e;
    public final fr0 f37076f;

    public dr0(fr0 fr0Var, Context context) {
        super(context);
        this.f37076f = fr0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        dr0 dr0Var;
        super.setTranslationX(f7);
        fr0 fr0Var = this.f37076f;
        dr0[] dr0VarArr = fr0Var.f37751n;
        if (fr0Var.f37753s && (dr0Var = dr0VarArr[0]) == this) {
            fr0Var.h.j(Math.abs(dr0Var.getTranslationX()) / dr0VarArr[0].getMeasuredWidth(), dr0VarArr[1].f37075e);
        }
    }
}
