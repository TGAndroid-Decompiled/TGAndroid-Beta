package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class a5 extends x5 {
    public final n5 f33977p0;

    public a5(n5 n5Var, Context context) {
        super(context);
        this.f33977p0 = n5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i10, makeMeasureSpec);
        n5 n5Var = this.f33977p0;
        if (n5Var.f34592n > 0 && getMeasuredHeight() > n5Var.f34592n) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, n5Var.f34592n - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), 1073741824), makeMeasureSpec);
        }
    }

    @Override
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        n5 n5Var = this.f33977p0;
        n5Var.N0(n5Var.f34605w0);
        n5Var.O0(fArr);
    }
}
