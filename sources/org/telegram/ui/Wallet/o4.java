package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class o4 extends k5 {
    public final c5 f35395a0;

    public o4(c5 c5Var, Context context, boolean z10) {
        super(context, z10);
        this.f35395a0 = c5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i10, makeMeasureSpec);
        c5 c5Var = this.f35395a0;
        if (c5Var.f34787n > 0 && getMeasuredHeight() > c5Var.f34787n) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, c5Var.f34787n - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), 1073741824), makeMeasureSpec);
        }
    }
}
