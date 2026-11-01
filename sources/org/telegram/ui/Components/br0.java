package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class br0 extends ts0 {
    public final au0 P;

    public br0(au0 au0Var, Context context) {
        super(context);
        this.P = au0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        ts0 ts0Var;
        int i10;
        float translationX = getTranslationX();
        super.setTranslationX(f7);
        au0 au0Var = this.P;
        ts0[] ts0VarArr = au0Var.m0;
        if (ts0VarArr[0] == this) {
            float f10 = translationX - f7;
            ei.r rVar = au0Var.f24520g2;
            if (rVar != null) {
                float f11 = au0Var.f24523h2 + f10;
                au0Var.f24523h2 = f11;
                int i11 = (int) f11;
                if (i11 != 0) {
                    au0Var.f24523h2 = f11 - i11;
                    rVar.h(i11, 0);
                }
            }
        }
        if (au0Var.f24525i1 && (ts0Var = ts0VarArr[0]) == this) {
            float abs = Math.abs(ts0Var.getTranslationX()) / ts0VarArr[0].getMeasuredWidth();
            au0Var.h1(abs, ts0VarArr[1].E);
            if (au0Var.H()) {
                int i12 = au0Var.f24572z0;
                if (i12 == 2) {
                    au0Var.f24547q0 = 1.0f - abs;
                } else if (i12 == 1) {
                    au0Var.f24547q0 = abs;
                }
                au0Var.I1(abs);
                float j02 = au0Var.j0(abs);
                au0Var.f24551r0 = j02;
                ImageView imageView = au0Var.f24557t0;
                if (j02 != 0.0f && au0Var.H() && !au0Var.z0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                au0Var.f24547q0 = 0.0f;
            }
            au0Var.E1(false);
        }
        au0Var.R();
        au0Var.T();
    }
}
