package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class o5 extends l6 {
    public final b6 f34983l0;

    public o5(b6 b6Var, Context context) {
        super(context);
        this.f34983l0 = b6Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i10, makeMeasureSpec);
        b6 b6Var = this.f34983l0;
        if (b6Var.f34259r > 0 && getMeasuredHeight() > b6Var.f34259r) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, b6Var.f34259r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), 1073741824), makeMeasureSpec);
        }
    }

    @Override
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        b6 b6Var = this.f34983l0;
        b6Var.T0(b6Var.f34269x0);
        b6Var.U0(fArr);
    }
}
