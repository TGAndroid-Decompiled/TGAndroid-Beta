package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class kv extends FrameLayout {
    public org.telegram.ui.ActionBar.p2 f38518a;
    public FrameLayout f38519b;
    public org.telegram.ui.ActionBar.k f38520c;
    public org.telegram.ui.Components.tl0 d;
    public mh.d1 f38521e;
    public int f38522f;
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
        kv[] kvVarArr = lvVar.f38886f;
        if (lvVar.f38887n && (kvVar = kvVarArr[0]) == this) {
            lvVar.f38885e.j(Math.abs(kvVar.getTranslationX()) / kvVarArr[0].getMeasuredWidth(), kvVarArr[1].f38522f);
        }
    }
}
