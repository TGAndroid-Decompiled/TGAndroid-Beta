package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
public final class hf0 extends TextureView {
    public final nf0 f25409a;

    public hf0(nf0 nf0Var, Context context) {
        super(context);
        this.f25409a = nf0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        vz vzVar = this.f25409a.f27248i0;
        if (vzVar != null) {
            int width = getWidth();
            int height = getHeight();
            ha haVar = vzVar.F;
            if (haVar != null) {
                Matrix matrix2 = haVar.v;
                matrix.invert(matrix2);
                float f10 = width;
                float f11 = height;
                matrix2.preScale(f10, f11);
                matrix2.postScale(1.0f / f10, 1.0f / f11);
                haVar.c(matrix2);
                vzVar.e(false, false, false);
            }
        }
    }
}
