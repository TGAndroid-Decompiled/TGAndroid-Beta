package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class dr0 extends FrameLayout {
    public org.telegram.ui.ActionBar.m2 f37106a;
    public FrameLayout f37107b;
    public org.telegram.ui.ActionBar.k f37108c;
    public org.telegram.ui.Components.rm0 d;
    public int f37109e;
    public final fr0 f37110f;

    public dr0(fr0 fr0Var, Context context) {
        super(context);
        this.f37110f = fr0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        dr0 dr0Var;
        super.setTranslationX(f7);
        fr0 fr0Var = this.f37110f;
        dr0[] dr0VarArr = fr0Var.f37785n;
        if (fr0Var.f37787s && (dr0Var = dr0VarArr[0]) == this) {
            fr0Var.h.j(Math.abs(dr0Var.getTranslationX()) / dr0VarArr[0].getMeasuredWidth(), dr0VarArr[1].f37109e);
        }
    }
}
