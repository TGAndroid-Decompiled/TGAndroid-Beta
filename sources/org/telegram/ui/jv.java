package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class jv extends FrameLayout {
    public org.telegram.ui.ActionBar.p2 f35511a;
    public FrameLayout f35512b;
    public org.telegram.ui.ActionBar.k f35513c;
    public org.telegram.ui.Components.sl0 d;
    public lh.e1 e;
    public int f35514f;
    public final kv h;

    public jv(kv kvVar, Context context) {
        super(context);
        this.h = kvVar;
    }

    @Override
    public final void setTranslationX(float f10) {
        jv jvVar;
        super.setTranslationX(f10);
        kv kvVar = this.h;
        jv[] jvVarArr = kvVar.f35821f;
        if (kvVar.f35822n && (jvVar = jvVarArr[0]) == this) {
            kvVar.e.j(Math.abs(jvVar.getTranslationX()) / jvVarArr[0].getMeasuredWidth(), jvVarArr[1].f35514f);
        }
    }
}
