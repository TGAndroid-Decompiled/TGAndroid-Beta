package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
public final class v40 extends TextureView {
    public final int f40557a;
    public final Object f40558b;

    public v40(int i7, Context context, Object obj) {
        super(context);
        this.f40557a = i7;
        this.f40558b = obj;
    }

    @Override
    public void invalidate() {
        zi.t0 t0Var;
        switch (this.f40557a) {
            case 0:
                y40 y40Var = (y40) this.f40558b;
                if (!y40Var.J0 && (t0Var = y40Var.R) != null && t0Var.f62433a == 3) {
                    y40Var.J0 = true;
                    try {
                        y40Var.H0 = SystemClock.elapsedRealtimeNanos();
                        y40Var.F();
                    } finally {
                        y40Var.J0 = false;
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
        switch (this.f40557a) {
            case 1:
                View.MeasureSpec.getSize(i7);
                super.onMeasure(i7, i10);
                return;
            case 2:
                xh.e eVar = (xh.e) this.f40558b;
                setMeasuredDimension(eVar.f60669g, eVar.h);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        switch (this.f40557a) {
            case 1:
                super.setTransform(matrix);
                bz bzVar = ((de0) this.f40558b).m0;
                if (bzVar != null) {
                    int width = getWidth();
                    int height = getHeight();
                    ga gaVar = bzVar.J;
                    if (gaVar != null) {
                        Matrix matrix2 = gaVar.v;
                        matrix.invert(matrix2);
                        float f10 = width;
                        float f11 = height;
                        matrix2.preScale(f10, f11);
                        matrix2.postScale(1.0f / f10, 1.0f / f11);
                        gaVar.c(matrix2);
                        bzVar.c(false, false, false);
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
