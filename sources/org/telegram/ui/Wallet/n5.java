package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class n5 extends i6 {
    public final z5 f42862l0;

    public n5(z5 z5Var, Context context) {
        super(context);
        this.f42862l0 = z5Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i7, makeMeasureSpec);
        z5 z5Var = this.f42862l0;
        if (z5Var.f43463r > 0 && getMeasuredHeight() > z5Var.f43463r) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, z5Var.f43463r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), 1073741824), makeMeasureSpec);
        }
    }

    @Override
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        z5 z5Var = this.f42862l0;
        z5Var.V0(z5Var.f43473x0);
        z5Var.W0(fArr);
    }
}
