package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class bu extends FrameLayout {
    public org.telegram.ui.ActionBar.e2 f45833a;
    public FrameLayout f45834b;
    public org.telegram.ui.ActionBar.k f45835c;
    public org.telegram.ui.Components.uj0 d;
    public di.c1 f45836e;
    public int f45837f;
    public final cu h;

    public bu(cu cuVar, Context context) {
        super(context);
        this.h = cuVar;
    }

    @Override
    public final void setTranslationX(float f10) {
        bu buVar;
        super.setTranslationX(f10);
        cu cuVar = this.h;
        bu[] buVarArr = cuVar.f46249f;
        if (cuVar.f46250n && (buVar = buVarArr[0]) == this) {
            cuVar.f46248e.i(Math.abs(buVar.getTranslationX()) / buVarArr[0].getMeasuredWidth(), buVarArr[1].f45837f);
        }
    }
}
