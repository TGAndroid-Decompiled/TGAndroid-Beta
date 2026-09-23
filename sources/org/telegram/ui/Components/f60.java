package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class f60 extends ml0 {
    public int X2;
    public final s60 Y2;

    public f60(s60 s60Var, Context context) {
        super(context, null);
        this.Y2 = s60Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        s60 s60Var = this.Y2;
        f60 f60Var = s60Var.V;
        if (this.X2 != View.MeasureSpec.getSize(i11)) {
            this.X2 = View.MeasureSpec.getSize(i11);
            s60Var.f27839a0 = true;
            f60Var.setPadding(0, 0, 0, 0);
            s60Var.f27839a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.X2;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.X2 - measuredHeight;
            }
            s60Var.f27839a0 = true;
            f60Var.setPadding(0, i13, 0, 0);
            s60Var.f27839a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.Y2.f27839a0) {
            return;
        }
        super.requestLayout();
    }
}
