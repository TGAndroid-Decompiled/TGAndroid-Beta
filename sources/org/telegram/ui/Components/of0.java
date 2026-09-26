package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
public final class of0 extends TextureView {
    public final uf0 f27036a;

    public of0(uf0 uf0Var, Context context) {
        super(context);
        this.f27036a = uf0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        xz xzVar = this.f27036a.f28785l0;
        if (xzVar != null) {
            int width = getWidth();
            int height = getHeight();
            pa paVar = xzVar.I;
            if (paVar != null) {
                Matrix matrix2 = paVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                paVar.c(matrix2);
                xzVar.e(false, false, false);
            }
        }
    }
}
