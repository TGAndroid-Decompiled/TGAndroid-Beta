package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m60 extends vl0 {
    public int X2;
    public final z60 Y2;

    public m60(z60 z60Var, Context context) {
        super(context, null);
        this.Y2 = z60Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        z60 z60Var = this.Y2;
        m60 m60Var = z60Var.V;
        if (this.X2 != View.MeasureSpec.getSize(i11)) {
            this.X2 = View.MeasureSpec.getSize(i11);
            z60Var.f30746a0 = true;
            m60Var.setPadding(0, 0, 0, 0);
            z60Var.f30746a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.X2;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.X2 - measuredHeight;
            }
            z60Var.f30746a0 = true;
            m60Var.setPadding(0, i13, 0, 0);
            z60Var.f30746a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.Y2.f30746a0) {
            return;
        }
        super.requestLayout();
    }
}
