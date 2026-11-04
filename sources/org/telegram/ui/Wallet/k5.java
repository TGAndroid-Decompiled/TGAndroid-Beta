package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class k5 extends f6 {
    public final w5 m0;

    public k5(w5 w5Var, Context context) {
        super(context);
        this.m0 = w5Var;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i3, makeMeasureSpec);
        w5 w5Var = this.m0;
        if (w5Var.f43338r > 0 && getMeasuredHeight() > w5Var.f43338r) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, w5Var.f43338r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), 1073741824), makeMeasureSpec);
        }
    }

    @Override
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        w5 w5Var = this.m0;
        w5Var.U0(w5Var.f43350y0);
        w5Var.V0(fArr);
    }
}
