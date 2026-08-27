package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

public final class dq0 extends FrameLayout {

    public org.telegram.ui.ActionBar.n2 f37526a;

    public FrameLayout f37527b;

    public org.telegram.ui.ActionBar.k f37528c;
    public org.telegram.ui.Components.zk0 d;

    public int f37529e;

    public final fq0 f37530f;

    public dq0(fq0 fq0Var, Context context) {
        super(context);
        this.f37530f = fq0Var;
    }

    @Override
    public final void setTranslationX(float f10) {
        dq0 dq0Var;
        super.setTranslationX(f10);
        fq0 fq0Var = this.f37530f;
        dq0[] dq0VarArr = fq0Var.f38190n;
        if (fq0Var.f38192s && (dq0Var = dq0VarArr[0]) == this) {
            fq0Var.h.j(Math.abs(dq0Var.getTranslationX()) / dq0VarArr[0].getMeasuredWidth(), dq0VarArr[1].f37529e);
        }
    }
}
