package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class lv extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f39679a;
    public FrameLayout f39680b;
    public org.telegram.ui.ActionBar.k f39681c;
    public org.telegram.ui.Components.qm0 d;
    public ai.w0 f39682e;
    public int f39683f;
    public final mv h;

    public lv(mv mvVar, Context context) {
        super(context);
        this.h = mvVar;
    }

    @Override
    public final void setTranslationX(float f7) {
        lv lvVar;
        super.setTranslationX(f7);
        mv mvVar = this.h;
        lv[] lvVarArr = mvVar.f39993f;
        if (mvVar.f39994n && (lvVar = lvVarArr[0]) == this) {
            mvVar.f39992e.j(Math.abs(lvVar.getTranslationX()) / lvVarArr[0].getMeasuredWidth(), lvVarArr[1].f39683f);
        }
    }
}
