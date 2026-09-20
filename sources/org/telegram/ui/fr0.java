package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class fr0 extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f33707a;
    public FrameLayout f33708b;
    public org.telegram.ui.ActionBar.k f33709c;
    public org.telegram.ui.Components.vl0 d;
    public int e;
    public final hr0 f33710f;

    public fr0(hr0 hr0Var, Context context) {
        super(context);
        this.f33710f = hr0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        fr0 fr0Var;
        super.setTranslationX(f7);
        hr0 hr0Var = this.f33710f;
        fr0[] fr0VarArr = hr0Var.f34267n;
        if (hr0Var.f34269s && (fr0Var = fr0VarArr[0]) == this) {
            hr0Var.h.j(Math.abs(fr0Var.getTranslationX()) / fr0VarArr[0].getMeasuredWidth(), fr0VarArr[1].e);
        }
    }
}
