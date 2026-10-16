package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
public final class dg0 extends TextureView {
    public final jg0 f24120a;

    public dg0(jg0 jg0Var, Context context) {
        super(context);
        this.f24120a = jg0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        h00 h00Var = this.f24120a.f26009l0;
        if (h00Var != null) {
            int width = getWidth();
            int height = getHeight();
            ra raVar = h00Var.I;
            if (raVar != null) {
                Matrix matrix2 = raVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                raVar.c(matrix2);
                h00Var.d(false, false, false);
            }
        }
    }
}
