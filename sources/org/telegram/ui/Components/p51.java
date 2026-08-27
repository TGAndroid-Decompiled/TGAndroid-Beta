package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;

public final class p51 extends NestedScrollView {
    public boolean S;
    public final q51 T;

    public p51(q51 q51Var, Context context) {
        super(context, null);
        this.T = q51Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        q51.m(this.T);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        q51 q51Var = this.T;
        measureChildWithMargins(q51Var.f31803f, i10, 0, i11, 0);
        int measuredHeight = q51Var.f31803f.getMeasuredHeight();
        int i12 = (size / 5) * 2;
        if (measuredHeight - (size - i12) >= AndroidUtilities.dp(90.0f)) {
            if (measuredHeight < AndroidUtilities.dp(90.0f) + (size / 2)) {
                i12 = size - measuredHeight;
            }
        } else {
            i12 = size - measuredHeight;
        }
        if (i12 < 0) {
            i12 = 0;
        }
        if (getPaddingTop() != i12) {
            this.S = true;
            setPadding(0, i12, 0, 0);
            this.S = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        q51.m(this.T);
    }

    @Override
    public final void requestLayout() {
        if (this.S) {
            return;
        }
        super.requestLayout();
    }
}
