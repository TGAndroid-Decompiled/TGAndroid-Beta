package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class bu extends FrameLayout {
    public org.telegram.ui.ActionBar.e2 f45822a;
    public FrameLayout f45823b;
    public org.telegram.ui.ActionBar.k f45824c;
    public org.telegram.ui.Components.uj0 d;
    public di.c1 f45825e;
    public int f45826f;
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
        bu[] buVarArr = cuVar.f46221f;
        if (cuVar.f46222n && (buVar = buVarArr[0]) == this) {
            cuVar.f46220e.i(Math.abs(buVar.getTranslationX()) / buVarArr[0].getMeasuredWidth(), buVarArr[1].f45826f);
        }
    }
}
