package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a70 extends mm0 {
    public int f26427f3;
    public final n70 f26428g3;

    public a70(n70 n70Var, Context context) {
        super(context, null);
        this.f26428g3 = n70Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        n70 n70Var = this.f26428g3;
        a70 a70Var = n70Var.V;
        if (this.f26427f3 != View.MeasureSpec.getSize(i11)) {
            this.f26427f3 = View.MeasureSpec.getSize(i11);
            n70Var.f30885a0 = true;
            a70Var.setPadding(0, 0, 0, 0);
            n70Var.f30885a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.f26427f3;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.f26427f3 - measuredHeight;
            }
            n70Var.f30885a0 = true;
            a70Var.setPadding(0, i13, 0, 0);
            n70Var.f30885a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26428g3.f30885a0) {
            return;
        }
        super.requestLayout();
    }
}
