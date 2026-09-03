package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class kv extends FrameLayout {
    public org.telegram.ui.ActionBar.p2 f38427a;
    public FrameLayout f38428b;
    public org.telegram.ui.ActionBar.k f38429c;
    public org.telegram.ui.Components.sl0 d;
    public mh.d1 f38430e;
    public int f38431f;
    public final lv h;

    public kv(lv lvVar, Context context) {
        super(context);
        this.h = lvVar;
    }

    @Override
    public final void setTranslationX(float f10) {
        kv kvVar;
        super.setTranslationX(f10);
        lv lvVar = this.h;
        kv[] kvVarArr = lvVar.f38788f;
        if (lvVar.f38789n && (kvVar = kvVarArr[0]) == this) {
            lvVar.f38787e.j(Math.abs(kvVar.getTranslationX()) / kvVarArr[0].getMeasuredWidth(), kvVarArr[1].f38431f);
        }
    }
}
