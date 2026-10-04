package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s60 extends zl0 {
    public int f30636e3;
    public final f70 f30637f3;

    public s60(f70 f70Var, Context context) {
        super(context, null);
        this.f30637f3 = f70Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        f70 f70Var = this.f30637f3;
        s60 s60Var = f70Var.V;
        if (this.f30636e3 != View.MeasureSpec.getSize(i11)) {
            this.f30636e3 = View.MeasureSpec.getSize(i11);
            f70Var.f26337a0 = true;
            s60Var.setPadding(0, 0, 0, 0);
            f70Var.f26337a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.f30636e3;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.f30636e3 - measuredHeight;
            }
            f70Var.f26337a0 = true;
            s60Var.setPadding(0, i13, 0, 0);
            f70Var.f26337a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f30637f3.f26337a0) {
            return;
        }
        super.requestLayout();
    }
}
