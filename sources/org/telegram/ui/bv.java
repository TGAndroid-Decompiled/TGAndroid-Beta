package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class bv extends FrameLayout {
    public org.telegram.ui.ActionBar.o2 f36142a;
    public FrameLayout f36143b;
    public org.telegram.ui.ActionBar.k f36144c;
    public org.telegram.ui.Components.lm0 d;
    public ai.u1 e;
    public int f36145f;
    public final cv h;

    public bv(cv cvVar, Context context) {
        super(context);
        this.h = cvVar;
    }

    @Override
    public final void setTranslationX(float f7) {
        bv bvVar;
        super.setTranslationX(f7);
        cv cvVar = this.h;
        bv[] bvVarArr = cvVar.f36409f;
        if (cvVar.f36410n && (bvVar = bvVarArr[0]) == this) {
            cvVar.e.i(Math.abs(bvVar.getTranslationX()) / bvVarArr[0].getMeasuredWidth(), bvVarArr[1].f36145f);
        }
    }
}
