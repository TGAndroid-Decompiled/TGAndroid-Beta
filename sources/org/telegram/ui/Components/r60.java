package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class r60 extends yl0 {
    public int X2;
    public final e70 Y2;

    public r60(e70 e70Var, Context context) {
        super(context, null);
        this.Y2 = e70Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        e70 e70Var = this.Y2;
        r60 r60Var = e70Var.V;
        if (this.X2 != View.MeasureSpec.getSize(i11)) {
            this.X2 = View.MeasureSpec.getSize(i11);
            e70Var.f23925a0 = true;
            r60Var.setPadding(0, 0, 0, 0);
            e70Var.f23925a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.X2;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.X2 - measuredHeight;
            }
            e70Var.f23925a0 = true;
            r60Var.setPadding(0, i13, 0, 0);
            e70Var.f23925a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.Y2.f23925a0) {
            return;
        }
        super.requestLayout();
    }
}
