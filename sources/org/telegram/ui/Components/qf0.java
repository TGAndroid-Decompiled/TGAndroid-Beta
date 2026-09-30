package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
public final class qf0 extends TextureView {
    public final wf0 f27650a;

    public qf0(wf0 wf0Var, Context context) {
        super(context);
        this.f27650a = wf0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        yz yzVar = this.f27650a.f29917l0;
        if (yzVar != null) {
            int width = getWidth();
            int height = getHeight();
            qa qaVar = yzVar.I;
            if (qaVar != null) {
                Matrix matrix2 = qaVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                qaVar.c(matrix2);
                yzVar.e(false, false, false);
            }
        }
    }
}
