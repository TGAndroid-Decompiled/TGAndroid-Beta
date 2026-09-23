package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class jv extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f34514a;
    public FrameLayout f34515b;
    public org.telegram.ui.ActionBar.k f34516c;
    public org.telegram.ui.Components.ml0 d;
    public ai.w0 e;
    public int f34517f;
    public final kv h;

    public jv(kv kvVar, Context context) {
        super(context);
        this.h = kvVar;
    }

    @Override
    public final void setTranslationX(float f7) {
        jv jvVar;
        super.setTranslationX(f7);
        kv kvVar = this.h;
        jv[] jvVarArr = kvVar.f34806f;
        if (kvVar.f34807n && (jvVar = jvVarArr[0]) == this) {
            kvVar.e.j(Math.abs(jvVar.getTranslationX()) / jvVarArr[0].getMeasuredWidth(), jvVarArr[1].f34517f);
        }
    }
}
