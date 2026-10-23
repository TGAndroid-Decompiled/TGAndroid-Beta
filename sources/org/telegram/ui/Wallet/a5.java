package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class a5 extends x5 {
    public final o5 f34292l0;

    public a5(o5 o5Var, Context context) {
        super(context);
        this.f34292l0 = o5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i10, makeMeasureSpec);
        o5 o5Var = this.f34292l0;
        if (o5Var.f34946n > 0 && getMeasuredHeight() > o5Var.f34946n) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, o5Var.f34946n - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), 1073741824), makeMeasureSpec);
        }
    }

    @Override
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        o5 o5Var = this.f34292l0;
        o5Var.P0(o5Var.f34959w0);
        o5Var.Q0(fArr);
    }
}
