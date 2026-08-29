package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class bv extends FrameLayout {
    public org.telegram.ui.ActionBar.o2 f36923a;
    public FrameLayout f36924b;
    public org.telegram.ui.ActionBar.l f36925c;
    public org.telegram.ui.Components.jl0 d;
    public jh.e1 f36926e;
    public int f36927f;
    public final cv h;

    public bv(cv cvVar, Context context) {
        super(context);
        this.h = cvVar;
    }

    @Override
    public final void setTranslationX(float f9) {
        bv bvVar;
        super.setTranslationX(f9);
        cv cvVar = this.h;
        bv[] bvVarArr = cvVar.f37222f;
        if (cvVar.f37223n && (bvVar = bvVarArr[0]) == this) {
            cvVar.f37221e.j(Math.abs(bvVar.getTranslationX()) / bvVarArr[0].getMeasuredWidth(), bvVarArr[1].f36927f);
        }
    }
}
