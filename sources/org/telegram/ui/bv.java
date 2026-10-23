package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class bv extends FrameLayout {
    public org.telegram.ui.ActionBar.o2 f36172a;
    public FrameLayout f36173b;
    public org.telegram.ui.ActionBar.k f36174c;
    public org.telegram.ui.Components.mm0 d;
    public ai.u1 e;
    public int f36175f;
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
        bv[] bvVarArr = cvVar.f36432f;
        if (cvVar.f36433n && (bvVar = bvVarArr[0]) == this) {
            cvVar.e.i(Math.abs(bvVar.getTranslationX()) / bvVarArr[0].getMeasuredWidth(), bvVarArr[1].f36175f);
        }
    }
}
