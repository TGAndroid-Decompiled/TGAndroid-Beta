package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class lv extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f39725a;
    public FrameLayout f39726b;
    public org.telegram.ui.ActionBar.k f39727c;
    public org.telegram.ui.Components.rm0 d;
    public ai.w0 f39728e;
    public int f39729f;
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
        lv[] lvVarArr = mvVar.f40039f;
        if (mvVar.f40040n && (lvVar = lvVarArr[0]) == this) {
            mvVar.f40038e.j(Math.abs(lvVar.getTranslationX()) / lvVarArr[0].getMeasuredWidth(), lvVarArr[1].f39729f);
        }
    }
}
