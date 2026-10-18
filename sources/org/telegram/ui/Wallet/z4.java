package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class z4 extends x5 {
    public final m5 f35171r0;

    public z4(m5 m5Var, Context context, boolean z10) {
        super(context, z10);
        this.f35171r0 = m5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i10, makeMeasureSpec);
        m5 m5Var = this.f35171r0;
        if (m5Var.f34580n > 0 && getMeasuredHeight() > m5Var.f34580n) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, m5Var.f34580n - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), 1073741824), makeMeasureSpec);
        }
    }

    @Override
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        m5 m5Var = this.f35171r0;
        m5Var.N0(m5Var.f34597y0);
        m5Var.O0(fArr);
    }
}
