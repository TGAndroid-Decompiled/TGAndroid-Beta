package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class iv extends FrameLayout {
    public org.telegram.ui.ActionBar.m2 f34585a;
    public FrameLayout f34586b;
    public org.telegram.ui.ActionBar.k f34587c;
    public org.telegram.ui.Components.yl0 d;
    public ai.w0 e;
    public int f34588f;
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
        iv[] ivVarArr = jvVar.f34880f;
        if (jvVar.f34881n && (ivVar = ivVarArr[0]) == this) {
            jvVar.e.j(Math.abs(ivVar.getTranslationX()) / ivVarArr[0].getMeasuredWidth(), ivVarArr[1].f34588f);
        }
    }
}
