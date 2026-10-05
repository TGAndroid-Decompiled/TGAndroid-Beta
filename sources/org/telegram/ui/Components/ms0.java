package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class ms0 extends ju0 {
    public final qv0 M;

    public ms0(qv0 qv0Var, Context context) {
        super(context);
        this.M = qv0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        ju0 ju0Var;
        int i10;
        super.setTranslationX(f7);
        qv0 qv0Var = this.M;
        ju0[] ju0VarArr = qv0Var.f30239k0;
        if (qv0Var.f30232g1 && (ju0Var = ju0VarArr[0]) == this) {
            float abs = Math.abs(ju0Var.getTranslationX()) / ju0VarArr[0].getMeasuredWidth();
            qv0Var.Z0(abs, ju0VarArr[1].F);
            if (qv0Var.D()) {
                int i11 = qv0Var.f30268x0;
                if (i11 == 2) {
                    qv0Var.f30246o0 = 1.0f - abs;
                } else if (i11 == 1) {
                    qv0Var.f30246o0 = abs;
                }
                qv0Var.s1(abs);
                float a02 = qv0Var.a0(abs);
                qv0Var.f30248p0 = a02;
                ImageView imageView = qv0Var.f30253r0;
                if (a02 != 0.0f && qv0Var.D() && !qv0Var.q0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                qv0Var.f30246o0 = 0.0f;
            }
            qv0Var.q1(false);
        }
        qv0Var.I();
        qv0Var.K();
        qv0Var.o0();
    }
}
