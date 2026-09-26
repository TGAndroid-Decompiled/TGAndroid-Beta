package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class gs0 extends du0 {
    public final kv0 M;

    public gs0(kv0 kv0Var, Context context) {
        super(context);
        this.M = kv0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        du0 du0Var;
        int i10;
        super.setTranslationX(f7);
        kv0 kv0Var = this.M;
        du0[] du0VarArr = kv0Var.f25842k0;
        if (kv0Var.f25835g1 && (du0Var = du0VarArr[0]) == this) {
            float abs = Math.abs(du0Var.getTranslationX()) / du0VarArr[0].getMeasuredWidth();
            kv0Var.Z0(abs, du0VarArr[1].F);
            if (kv0Var.D()) {
                int i11 = kv0Var.f25871x0;
                if (i11 == 2) {
                    kv0Var.f25849o0 = 1.0f - abs;
                } else if (i11 == 1) {
                    kv0Var.f25849o0 = abs;
                }
                kv0Var.s1(abs);
                float a02 = kv0Var.a0(abs);
                kv0Var.f25851p0 = a02;
                ImageView imageView = kv0Var.f25856r0;
                if (a02 != 0.0f && kv0Var.D() && !kv0Var.q0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                kv0Var.f25849o0 = 0.0f;
            }
            kv0Var.q1(false);
        }
        kv0Var.I();
        kv0Var.K();
        kv0Var.o0();
    }
}
