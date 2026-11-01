package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class bv extends FrameLayout {
    public org.telegram.ui.ActionBar.k2 f36117a;
    public FrameLayout f36118b;
    public org.telegram.ui.ActionBar.l f36119c;
    public org.telegram.ui.Components.uk0 d;
    public ag.b1 e;
    public int f36120f;
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
        bv[] bvVarArr = cvVar.f36418f;
        if (cvVar.f36419n && (bvVar = bvVarArr[0]) == this) {
            cvVar.e.i(Math.abs(bvVar.getTranslationX()) / bvVarArr[0].getMeasuredWidth(), bvVarArr[1].f36120f);
        }
    }
}
