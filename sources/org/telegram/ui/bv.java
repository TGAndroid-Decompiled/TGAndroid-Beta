package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class bv extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f35715a;
    public FrameLayout f35716b;
    public org.telegram.ui.ActionBar.k f35717c;
    public org.telegram.ui.Components.im0 d;
    public ai.u1 e;
    public int f35718f;
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
        bv[] bvVarArr = cvVar.f35985f;
        if (cvVar.f35986n && (bvVar = bvVarArr[0]) == this) {
            cvVar.e.j(Math.abs(bvVar.getTranslationX()) / bvVarArr[0].getMeasuredWidth(), bvVarArr[1].f35718f);
        }
    }
}
