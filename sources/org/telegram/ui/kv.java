package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class kv extends FrameLayout {
    public org.telegram.ui.ActionBar.m2 f39456a;
    public FrameLayout f39457b;
    public org.telegram.ui.ActionBar.k f39458c;
    public org.telegram.ui.Components.rm0 d;
    public ai.w0 f39459e;
    public int f39460f;
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
        kv[] kvVarArr = lvVar.f39771f;
        if (lvVar.f39772n && (kvVar = kvVarArr[0]) == this) {
            lvVar.f39770e.j(Math.abs(kvVar.getTranslationX()) / kvVarArr[0].getMeasuredWidth(), kvVarArr[1].f39460f);
        }
    }
}
