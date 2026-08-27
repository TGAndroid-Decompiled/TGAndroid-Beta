package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;

public final class pe0 extends TextureView {

    public final ve0 f31594a;

    public pe0(ve0 ve0Var, Context context) {
        super(context);
        this.f31594a = ve0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        jz jzVar = this.f31594a.f33390h0;
        if (jzVar != null) {
            int width = getWidth();
            int height = getHeight();
            fa faVar = jzVar.E;
            if (faVar == null) {
                return;
            }
            Matrix matrix2 = faVar.v;
            matrix.invert(matrix2);
            float f10 = width;
            float f11 = height;
            matrix2.preScale(f10, f11);
            matrix2.postScale(1.0f / f10, 1.0f / f11);
            faVar.c(matrix2);
            jzVar.e(false, false, false);
        }
    }
}
