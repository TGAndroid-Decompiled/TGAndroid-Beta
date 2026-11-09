package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class k5 extends f6 {
    public final w5 f42661l0;

    public k5(w5 w5Var, Context context) {
        super(context);
        this.f42661l0 = w5Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i7, makeMeasureSpec);
        w5 w5Var = this.f42661l0;
        if (w5Var.f43268r > 0 && getMeasuredHeight() > w5Var.f43268r) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, w5Var.f43268r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), 1073741824), makeMeasureSpec);
        }
    }

    @Override
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        w5 w5Var = this.f42661l0;
        w5Var.U0(w5Var.f43278x0);
        w5Var.V0(fArr);
    }
}
