package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
public final class k40 extends TextureView {
    public final int f35127a;
    public final Object f35128b;

    public k40(int i7, Context context, Object obj) {
        super(context);
        this.f35127a = i7;
        this.f35128b = obj;
    }

    @Override
    public void invalidate() {
        wi.s0 s0Var;
        switch (this.f35127a) {
            case 0:
                n40 n40Var = (n40) this.f35128b;
                if (!n40Var.H0 && (s0Var = n40Var.Q) != null && s0Var.f58046a == 3) {
                    n40Var.H0 = true;
                    try {
                        n40Var.F0 = SystemClock.elapsedRealtimeNanos();
                        n40Var.D();
                    } finally {
                        n40Var.H0 = false;
                    }
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f35127a) {
            case 1:
                View.MeasureSpec.getSize(i7);
                super.onMeasure(i7, i10);
                return;
            case 2:
                xh.e eVar = (xh.e) this.f35128b;
                setMeasuredDimension(eVar.f58689g, eVar.h);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        switch (this.f35127a) {
            case 1:
                super.setTransform(matrix);
                ry ryVar = ((sd0) this.f35128b).f38001l0;
                if (ryVar != null) {
                    int width = getWidth();
                    int height = getHeight();
                    da daVar = ryVar.I;
                    if (daVar != null) {
                        Matrix matrix2 = daVar.v;
                        matrix.invert(matrix2);
                        float f10 = width;
                        float f11 = height;
                        matrix2.preScale(f10, f11);
                        matrix2.postScale(1.0f / f10, 1.0f / f11);
                        daVar.c(matrix2);
                        ryVar.c(false, false, false);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.setTransform(matrix);
                return;
        }
    }
}
