package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
public final class y40 extends TextureView {
    public final int f42315a;
    public final Object f42316b;

    public y40(int i7, Context context, Object obj) {
        super(context);
        this.f42315a = i7;
        this.f42316b = obj;
    }

    @Override
    public void invalidate() {
        zi.t0 t0Var;
        switch (this.f42315a) {
            case 0:
                b50 b50Var = (b50) this.f42316b;
                if (!b50Var.J0 && (t0Var = b50Var.R) != null && t0Var.f62348a == 3) {
                    b50Var.J0 = true;
                    try {
                        b50Var.H0 = SystemClock.elapsedRealtimeNanos();
                        b50Var.F();
                    } finally {
                        b50Var.J0 = false;
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
        switch (this.f42315a) {
            case 1:
                View.MeasureSpec.getSize(i7);
                super.onMeasure(i7, i10);
                return;
            case 2:
                xh.e eVar = (xh.e) this.f42316b;
                setMeasuredDimension(eVar.f60586g, eVar.h);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        switch (this.f42315a) {
            case 1:
                super.setTransform(matrix);
                ez ezVar = ((ee0) this.f42316b).m0;
                if (ezVar != null) {
                    int width = getWidth();
                    int height = getHeight();
                    ha haVar = ezVar.J;
                    if (haVar != null) {
                        Matrix matrix2 = haVar.v;
                        matrix.invert(matrix2);
                        float f10 = width;
                        float f11 = height;
                        matrix2.preScale(f10, f11);
                        matrix2.postScale(1.0f / f10, 1.0f / f11);
                        haVar.c(matrix2);
                        ezVar.c(false, false, false);
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
