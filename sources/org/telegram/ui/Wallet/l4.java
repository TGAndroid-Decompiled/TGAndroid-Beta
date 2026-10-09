package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class l4 extends h5 {
    public final z4 f35174a0;

    public l4(z4 z4Var, Context context, boolean z10) {
        super(context, z10);
        this.f35174a0 = z4Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i10, makeMeasureSpec);
        z4 z4Var = this.f35174a0;
        if (z4Var.f35727n > 0 && getMeasuredHeight() > z4Var.f35727n) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, z4Var.f35727n - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), 1073741824), makeMeasureSpec);
        }
    }
}
