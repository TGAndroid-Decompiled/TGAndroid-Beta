package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
public final class l40 extends TextureView {
    public final int f35575a;
    public final Object f35576b;

    public l40(int i7, Context context, Object obj) {
        super(context);
        this.f35575a = i7;
        this.f35576b = obj;
    }

    @Override
    public void invalidate() {
        wi.s0 s0Var;
        switch (this.f35575a) {
            case 0:
                o40 o40Var = (o40) this.f35576b;
                if (!o40Var.I0 && (s0Var = o40Var.Q) != null && s0Var.f58148a == 3) {
                    o40Var.I0 = true;
                    try {
                        o40Var.G0 = SystemClock.elapsedRealtimeNanos();
                        o40Var.F();
                    } finally {
                        o40Var.I0 = false;
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
        switch (this.f35575a) {
            case 1:
                View.MeasureSpec.getSize(i7);
                super.onMeasure(i7, i10);
                return;
            case 2:
                xh.e eVar = (xh.e) this.f35576b;
                setMeasuredDimension(eVar.f58793g, eVar.h);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        switch (this.f35575a) {
            case 1:
                super.setTransform(matrix);
                sy syVar = ((td0) this.f35576b).f38370l0;
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
