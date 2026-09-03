package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class lv extends FrameLayout {
    public org.telegram.ui.ActionBar.p2 f35928a;
    public FrameLayout f35929b;
    public org.telegram.ui.ActionBar.k f35930c;
    public org.telegram.ui.Components.rl0 d;
    public lh.e1 e;
    public int f35931f;
    public final mv h;

    public lv(mv mvVar, Context context) {
        super(context);
        this.h = mvVar;
    }

    @Override
    public final void setTranslationX(float f10) {
        lv lvVar;
        super.setTranslationX(f10);
        mv mvVar = this.h;
        lv[] lvVarArr = mvVar.f36224f;
        if (mvVar.f36225n && (lvVar = lvVarArr[0]) == this) {
            mvVar.e.j(Math.abs(lvVar.getTranslationX()) / lvVarArr[0].getMeasuredWidth(), lvVarArr[1].f35931f);
        }
    }
}
