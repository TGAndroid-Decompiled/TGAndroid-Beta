package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
public final class ke0 extends TextureView {
    public final qe0 f30067a;

    public ke0(qe0 qe0Var, Context context) {
        super(context);
        this.f30067a = qe0Var;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        View.MeasureSpec.getSize(i9);
        super.onMeasure(i9, i10);
    }

    @Override
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        hz hzVar = this.f30067a.f31902h0;
        if (hzVar != null) {
            int width = getWidth();
            int height = getHeight();
            ha haVar = hzVar.E;
            if (haVar != null) {
                Matrix matrix2 = haVar.v;
                matrix.invert(matrix2);
                float f10 = width;
                float f11 = height;
                matrix2.preScale(f10, f11);
                matrix2.postScale(1.0f / f10, 1.0f / f11);
                haVar.c(matrix2);
                hzVar.e(false, false, false);
            }
        }
    }
}
