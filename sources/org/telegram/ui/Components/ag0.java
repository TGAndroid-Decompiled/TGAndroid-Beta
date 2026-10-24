package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
public final class ag0 extends TextureView {
    public final gg0 f24730a;

    public ag0(gg0 gg0Var, Context context) {
        super(context);
        this.f24730a = gg0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        c00 c00Var = this.f24730a.f26670l0;
        if (c00Var != null) {
            int width = getWidth();
            int height = getHeight();
            na naVar = c00Var.I;
            if (naVar != null) {
                Matrix matrix2 = naVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                naVar.c(matrix2);
                c00Var.d(false, false, false);
            }
        }
    }
}
