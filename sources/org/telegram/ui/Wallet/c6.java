package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class c6 extends y6 {
    public final o6 m0;

    public c6(o6 o6Var, Context context) {
        super(context);
        this.m0 = o6Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i7, makeMeasureSpec);
        o6 o6Var = this.m0;
        if (o6Var.f44812r > 0 && getMeasuredHeight() > o6Var.f44812r) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, o6Var.f44812r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), 1073741824), makeMeasureSpec);
        }
    }

    @Override
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        o6 o6Var = this.m0;
        o6Var.Z0(o6Var.A0);
        o6Var.a1(fArr);
    }
}
