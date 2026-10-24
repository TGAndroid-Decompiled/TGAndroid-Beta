package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class oq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.o2 f40234a;
    public FrameLayout f40235b;
    public org.telegram.ui.ActionBar.k f40236c;
    public org.telegram.ui.Components.lm0 d;
    public int e;
    public final qq0 f40237f;

    public oq0(qq0 qq0Var, Context context) {
        super(context);
        this.f40237f = qq0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        oq0 oq0Var;
        super.setTranslationX(f7);
        qq0 qq0Var = this.f40237f;
        oq0[] oq0VarArr = qq0Var.f40924n;
        if (qq0Var.f40926s && (oq0Var = oq0VarArr[0]) == this) {
            qq0Var.h.i(Math.abs(oq0Var.getTranslationX()) / oq0VarArr[0].getMeasuredWidth(), oq0VarArr[1].e);
        }
    }
}
