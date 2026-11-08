package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
public final class k40 extends TextureView {
    public final int f35186a;
    public final Object f35187b;

    public k40(int i7, Context context, Object obj) {
        super(context);
        this.f35186a = i7;
        this.f35187b = obj;
    }

    @Override
    public void invalidate() {
        wi.s0 s0Var;
        switch (this.f35186a) {
            case 0:
                n40 n40Var = (n40) this.f35187b;
                if (!n40Var.I0 && (s0Var = n40Var.Q) != null && s0Var.f58138a == 3) {
                    n40Var.I0 = true;
                    try {
                        n40Var.G0 = SystemClock.elapsedRealtimeNanos();
                        n40Var.F();
                    } finally {
                        n40Var.I0 = false;
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
        switch (this.f35186a) {
            case 1:
                View.MeasureSpec.getSize(i7);
                super.onMeasure(i7, i10);
                return;
            case 2:
                xh.e eVar = (xh.e) this.f35187b;
                setMeasuredDimension(eVar.f58783g, eVar.h);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        switch (this.f35186a) {
            case 1:
                super.setTransform(matrix);
                sy syVar = ((sd0) this.f35187b).f38021l0;
                if (syVar != null) {
                    int width = getWidth();
                    int height = getHeight();
                    da daVar = syVar.I;
                    if (daVar != null) {
                        Matrix matrix2 = daVar.v;
                        matrix.invert(matrix2);
                        float f10 = width;
                        float f11 = height;
                        matrix2.preScale(f10, f11);
                        matrix2.postScale(1.0f / f10, 1.0f / f11);
                        daVar.c(matrix2);
                        syVar.c(false, false, false);
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
