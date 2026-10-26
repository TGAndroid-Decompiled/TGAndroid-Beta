package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
public final class yf0 extends TextureView {
    public final eg0 f35037a;

    public yf0(eg0 eg0Var, Context context) {
        super(context);
        this.f35037a = eg0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        e00 e00Var = this.f35037a.f27843l0;
        if (e00Var != null) {
            int width = getWidth();
            int height = getHeight();
            ra raVar = e00Var.I;
            if (raVar != null) {
                Matrix matrix2 = raVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                raVar.c(matrix2);
                e00Var.d(false, false, false);
            }
        }
    }
}
