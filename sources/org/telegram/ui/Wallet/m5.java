package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class m5 extends h6 {
    public final y5 m0;

    public m5(y5 y5Var, Context context) {
        super(context);
        this.m0 = y5Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i7, makeMeasureSpec);
        y5 y5Var = this.m0;
        if (y5Var.f44746r > 0 && getMeasuredHeight() > y5Var.f44746r) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, y5Var.f44746r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), 1073741824), makeMeasureSpec);
        }
    }

    @Override
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        y5 y5Var = this.m0;
        y5Var.V0(y5Var.f44758y0);
        y5Var.W0(fArr);
    }
}
