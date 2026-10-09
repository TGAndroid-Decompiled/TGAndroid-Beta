package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
public final class eg0 extends TextureView {
    public final kg0 f26086a;

    public eg0(kg0 kg0Var, Context context) {
        super(context);
        this.f26086a = kg0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        l00 l00Var = this.f26086a.f27987l0;
        if (l00Var != null) {
            int width = getWidth();
            int height = getHeight();
            sa saVar = l00Var.I;
            if (saVar != null) {
                Matrix matrix2 = saVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                saVar.c(matrix2);
                l00Var.e(false, false, false);
            }
        }
    }
}
