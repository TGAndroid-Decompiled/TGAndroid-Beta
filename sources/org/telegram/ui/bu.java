package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class bu extends FrameLayout {
    public org.telegram.ui.ActionBar.f2 f44135a;
    public FrameLayout f44136b;
    public org.telegram.ui.ActionBar.k f44137c;
    public org.telegram.ui.Components.qj0 d;
    public bi.q1 f44138e;
    public int f44139f;
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
        bu[] buVarArr = cuVar.f44756f;
        if (cuVar.f44757n && (buVar = buVarArr[0]) == this) {
            cuVar.f44755e.i(Math.abs(buVar.getTranslationX()) / buVarArr[0].getMeasuredWidth(), buVarArr[1].f44139f);
        }
    }
}
