package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class iv extends FrameLayout {
    public org.telegram.ui.ActionBar.m2 f34582a;
    public FrameLayout f34583b;
    public org.telegram.ui.ActionBar.k f34584c;
    public org.telegram.ui.Components.xl0 d;
    public ai.w0 e;
    public int f34585f;
    public final jv h;

    public iv(jv jvVar, Context context) {
        super(context);
        this.h = jvVar;
    }

    @Override
    public final void setTranslationX(float f7) {
        iv ivVar;
        super.setTranslationX(f7);
        jv jvVar = this.h;
        iv[] ivVarArr = jvVar.f34876f;
        if (jvVar.f34877n && (ivVar = ivVarArr[0]) == this) {
            jvVar.e.j(Math.abs(ivVar.getTranslationX()) / ivVarArr[0].getMeasuredWidth(), ivVarArr[1].f34585f);
        }
    }
}
