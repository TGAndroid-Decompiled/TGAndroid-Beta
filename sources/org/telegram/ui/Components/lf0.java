package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
public final class lf0 extends TextureView {
    public final rf0 f26123a;

    public lf0(rf0 rf0Var, Context context) {
        super(context);
        this.f26123a = rf0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        vz vzVar = this.f26123a.f27871l0;
        if (vzVar != null) {
            int width = getWidth();
            int height = getHeight();
            oa oaVar = vzVar.I;
            if (oaVar != null) {
                Matrix matrix2 = oaVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                oaVar.c(matrix2);
                vzVar.e(false, false, false);
            }
        }
    }
}
