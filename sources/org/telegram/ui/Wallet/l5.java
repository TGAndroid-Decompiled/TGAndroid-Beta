package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class l5 extends g6 {
    public final x5 f42742l0;

    public l5(x5 x5Var, Context context) {
        super(context);
        this.f42742l0 = x5Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i7, makeMeasureSpec);
        x5 x5Var = this.f42742l0;
        if (x5Var.f43350r > 0 && getMeasuredHeight() > x5Var.f43350r) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, x5Var.f43350r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), 1073741824), makeMeasureSpec);
        }
    }

    @Override
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        x5 x5Var = this.f42742l0;
        x5Var.U0(x5Var.f43360x0);
        x5Var.V0(fArr);
    }
}
