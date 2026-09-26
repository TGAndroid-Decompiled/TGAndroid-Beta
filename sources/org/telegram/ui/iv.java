package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class iv extends FrameLayout {
    public org.telegram.ui.ActionBar.m2 f34583a;
    public FrameLayout f34584b;
    public org.telegram.ui.ActionBar.k f34585c;
    public org.telegram.ui.Components.wl0 d;
    public ai.w0 e;
    public int f34586f;
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
        iv[] ivVarArr = jvVar.f34877f;
        if (jvVar.f34878n && (ivVar = ivVarArr[0]) == this) {
            jvVar.e.j(Math.abs(ivVar.getTranslationX()) / ivVarArr[0].getMeasuredWidth(), ivVarArr[1].f34586f);
        }
    }
}
