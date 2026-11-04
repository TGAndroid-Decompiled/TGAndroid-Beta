package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
public final class g40 extends TextureView {
    public final int f33954a;
    public final Object f33955b;

    public g40(int i3, Context context, Object obj) {
        super(context);
        this.f33954a = i3;
        this.f33955b = obj;
    }

    @Override
    public void invalidate() {
        wi.s0 s0Var;
        switch (this.f33954a) {
            case 0:
                j40 j40Var = (j40) this.f33955b;
                if (!j40Var.I0 && (s0Var = j40Var.R) != null && s0Var.f58047a == 3) {
                    j40Var.I0 = true;
                    try {
                        j40Var.G0 = SystemClock.elapsedRealtimeNanos();
                        j40Var.D();
                    } finally {
                        j40Var.I0 = false;
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
    public void onMeasure(int i3, int i10) {
        switch (this.f33954a) {
            case 1:
                View.MeasureSpec.getSize(i3);
                super.onMeasure(i3, i10);
                return;
            case 2:
                yh.e eVar = (yh.e) this.f33955b;
                setMeasuredDimension(eVar.f59501g, eVar.h);
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        switch (this.f33954a) {
            case 1:
                super.setTransform(matrix);
                py pyVar = ((nd0) this.f33955b).m0;
                if (pyVar != null) {
                    int width = getWidth();
                    int height = getHeight();
                    ca caVar = pyVar.J;
                    if (caVar != null) {
                        Matrix matrix2 = caVar.v;
                        matrix.invert(matrix2);
                        float f10 = width;
                        float f11 = height;
                        matrix2.preScale(f10, f11);
                        matrix2.postScale(1.0f / f10, 1.0f / f11);
                        caVar.c(matrix2);
                        pyVar.c(false, false, false);
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
