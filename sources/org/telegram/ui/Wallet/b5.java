package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class b5 extends x5 {
    public final o5 f34046l0;

    public b5(o5 o5Var, Context context) {
        super(context);
        this.f34046l0 = o5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i10, makeMeasureSpec);
        o5 o5Var = this.f34046l0;
        if (o5Var.f34659n > 0 && getMeasuredHeight() > o5Var.f34659n) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, o5Var.f34659n - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), 1073741824), makeMeasureSpec);
        }
    }

    @Override
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        o5 o5Var = this.f34046l0;
        o5Var.O0(o5Var.f34672w0);
        o5Var.P0(fArr);
    }
}
