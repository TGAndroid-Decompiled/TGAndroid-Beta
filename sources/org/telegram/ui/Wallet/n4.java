package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class n4 extends j5 {
    public final b5 f35331a0;

    public n4(b5 b5Var, Context context, boolean z10) {
        super(context, z10);
        this.f35331a0 = b5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i10, makeMeasureSpec);
        b5 b5Var = this.f35331a0;
        if (b5Var.f34722n > 0 && getMeasuredHeight() > b5Var.f34722n) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, b5Var.f34722n - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), 1073741824), makeMeasureSpec);
        }
    }
}
