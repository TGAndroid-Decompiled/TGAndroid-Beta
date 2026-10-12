package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
public final class ig0 extends TextureView {
    public final og0 f27160a;

    public ig0(og0 og0Var, Context context) {
        super(context);
        this.f27160a = og0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        o00 o00Var = this.f27160a.f29191l0;
        if (o00Var != null) {
            int width = getWidth();
            int height = getHeight();
            ra raVar = o00Var.I;
            if (raVar != null) {
                Matrix matrix2 = raVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                raVar.c(matrix2);
                o00Var.e(false, false, false);
            }
        }
    }
}
