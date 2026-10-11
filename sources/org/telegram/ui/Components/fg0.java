package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
public final class fg0 extends TextureView {
    public final lg0 f26463a;

    public fg0(lg0 lg0Var, Context context) {
        super(context);
        this.f26463a = lg0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        m00 m00Var = this.f26463a.f28395l0;
        if (m00Var != null) {
            int width = getWidth();
            int height = getHeight();
            ra raVar = m00Var.I;
            if (raVar != null) {
                Matrix matrix2 = raVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                raVar.c(matrix2);
                m00Var.e(false, false, false);
            }
        }
    }
}
