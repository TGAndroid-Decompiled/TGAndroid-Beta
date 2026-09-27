package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class kv extends FrameLayout {
    public org.telegram.ui.ActionBar.o2 f35160a;
    public FrameLayout f35161b;
    public org.telegram.ui.ActionBar.l f35162c;
    public org.telegram.ui.Components.yl0 d;
    public ai.w0 e;
    public int f35163f;
    public final lv h;

    public kv(lv lvVar, Context context) {
        super(context);
        this.h = lvVar;
    }

    @Override
    public final void setTranslationX(float f7) {
        kv kvVar;
        super.setTranslationX(f7);
        lv lvVar = this.h;
        kv[] kvVarArr = lvVar.f35456f;
        if (lvVar.f35457n && (kvVar = kvVarArr[0]) == this) {
            lvVar.e.j(Math.abs(kvVar.getTranslationX()) / kvVarArr[0].getMeasuredWidth(), kvVarArr[1].f35163f);
        }
    }
}
