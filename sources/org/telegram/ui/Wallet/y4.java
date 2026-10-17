package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class y4 extends v5 {
    public final l5 f35171r0;

    public y4(l5 l5Var, Context context, boolean z10) {
        super(context, z10);
        this.f35171r0 = l5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i10, makeMeasureSpec);
        l5 l5Var = this.f35171r0;
        if (l5Var.f34493n > 0 && getMeasuredHeight() > l5Var.f34493n) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, l5Var.f34493n - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), 1073741824), makeMeasureSpec);
        }
    }

    @Override
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        l5 l5Var = this.f35171r0;
        l5Var.N0(l5Var.f34510y0);
        l5Var.O0(fArr);
    }
}
