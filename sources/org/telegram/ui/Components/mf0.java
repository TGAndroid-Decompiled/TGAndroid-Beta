package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
public final class mf0 extends TextureView {
    public final sf0 f25229a;

    public mf0(sf0 sf0Var, Context context) {
        super(context);
        this.f25229a = sf0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        c00 c00Var = this.f25229a.f27026l0;
        if (c00Var != null) {
            int width = getWidth();
            int height = getHeight();
            oa oaVar = c00Var.I;
            if (oaVar != null) {
                Matrix matrix2 = oaVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                oaVar.c(matrix2);
                c00Var.e(false, false, false);
            }
        }
    }
}
