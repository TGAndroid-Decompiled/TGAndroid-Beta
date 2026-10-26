package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class y4 extends w5 {
    public final m5 f37513l0;

    public y4(m5 m5Var, Context context) {
        super(context);
        this.f37513l0 = m5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i10, makeMeasureSpec);
        m5 m5Var = this.f37513l0;
        if (m5Var.f36954r > 0 && getMeasuredHeight() > m5Var.f36954r) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, m5Var.f36954r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), 1073741824), makeMeasureSpec);
        }
    }

    @Override
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        m5 m5Var = this.f37513l0;
        m5Var.Q0(m5Var.f36964x0);
        m5Var.R0(fArr);
    }
}
