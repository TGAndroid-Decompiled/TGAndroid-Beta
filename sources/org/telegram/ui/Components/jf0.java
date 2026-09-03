package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
public final class jf0 extends TextureView {
    public final pf0 f28094a;

    public jf0(pf0 pf0Var, Context context) {
        super(context);
        this.f28094a = pf0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        xz xzVar = this.f28094a.f30060i0;
        if (xzVar != null) {
            int width = getWidth();
            int height = getHeight();
            ha haVar = xzVar.F;
            if (haVar != null) {
                Matrix matrix2 = haVar.v;
                matrix.invert(matrix2);
                float f10 = width;
                float f11 = height;
                matrix2.preScale(f10, f11);
                matrix2.postScale(1.0f / f10, 1.0f / f11);
                haVar.c(matrix2);
                xzVar.e(false, false, false);
            }
        }
    }
}
