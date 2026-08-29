package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
public final class ye0 extends TextureView {
    public final ef0 f35054a;

    public ye0(ef0 ef0Var, Context context) {
        super(context);
        this.f35054a = ef0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        qz qzVar = this.f35054a.f28034h0;
        if (qzVar != null) {
            int width = getWidth();
            int height = getHeight();
            ma maVar = qzVar.E;
            if (maVar != null) {
                Matrix matrix2 = maVar.v;
                matrix.invert(matrix2);
                float f9 = width;
                float f10 = height;
                matrix2.preScale(f9, f10);
                matrix2.postScale(1.0f / f9, 1.0f / f10);
                maVar.c(matrix2);
                qzVar.e(false, false, false);
            }
        }
    }
}
