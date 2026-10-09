package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class m4 extends i5 {
    public final a5 f35238a0;

    public m4(a5 a5Var, Context context, boolean z10) {
        super(context, z10);
        this.f35238a0 = a5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i10, makeMeasureSpec);
        a5 a5Var = this.f35238a0;
        if (a5Var.f34631n > 0 && getMeasuredHeight() > a5Var.f34631n) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, a5Var.f34631n - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), 1073741824), makeMeasureSpec);
        }
    }
}
