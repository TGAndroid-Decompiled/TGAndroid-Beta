package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class b6 extends x6 {
    public final n6 m0;

    public b6(n6 n6Var, Context context) {
        super(context);
        this.m0 = n6Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i7, makeMeasureSpec);
        n6 n6Var = this.m0;
        if (n6Var.f44684r > 0 && getMeasuredHeight() > n6Var.f44684r) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, n6Var.f44684r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), 1073741824), makeMeasureSpec);
        }
    }

    @Override
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        n6 n6Var = this.m0;
        n6Var.Z0(n6Var.A0);
        n6Var.a1(fArr);
    }
}
