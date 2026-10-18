package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class oq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f39885a;
    public FrameLayout f39886b;
    public org.telegram.ui.ActionBar.k f39887c;
    public org.telegram.ui.Components.im0 d;
    public int e;
    public final qq0 f39888f;

    public oq0(qq0 qq0Var, Context context) {
        super(context);
        this.f39888f = qq0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        oq0 oq0Var;
        super.setTranslationX(f7);
        qq0 qq0Var = this.f39888f;
        oq0[] oq0VarArr = qq0Var.f40509n;
        if (qq0Var.f40511s && (oq0Var = oq0VarArr[0]) == this) {
            qq0Var.h.j(Math.abs(oq0Var.getTranslationX()) / oq0VarArr[0].getMeasuredWidth(), oq0VarArr[1].e);
        }
    }
}
