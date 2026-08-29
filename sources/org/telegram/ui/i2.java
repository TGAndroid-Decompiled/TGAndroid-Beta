package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
public final class i2 extends HorizontalScrollView {
    public final int f39105a;
    public final Object f39106b;

    public i2(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.f39105a = i10;
        this.f39106b = frameLayout;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f39105a) {
            case 1:
                int mode = View.MeasureSpec.getMode(i10);
                if (mode == 1073741824) {
                    super.onMeasure(i10, i11);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0), i11);
                int measuredWidth = getMeasuredWidth();
                int i12 = ((th.t3) this.f39106b).G;
                if (mode == Integer.MIN_VALUE) {
                    i12 = Math.min(i12, View.MeasureSpec.getSize(i10));
                }
                setMeasuredDimension(Math.min(measuredWidth, i12), getMeasuredHeight());
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.k9 textSelectionHelper;
        switch (this.f39105a) {
            case 0:
                super.onScrollChanged(i10, i11, i12, i13);
                d70 d70Var = (d70) this.f39106b;
                if (d70Var.d != null) {
                    d70Var.d = null;
                    d70Var.f37383f = null;
                    return;
                }
                return;
            case 1:
            default:
                super.onScrollChanged(i10, i11, i12, i13);
                return;
            case 2:
                super.onScrollChanged(i10, i11, i12, i13);
                th.w2 w2Var = ((th.g5) this.f39106b).A;
                if (w2Var != null && (textSelectionHelper = w2Var.f48834a.getTextSelectionHelper()) != null && textSelectionHelper.y()) {
                    textSelectionHelper.x();
                }
                invalidate();
                return;
        }
    }

    public i2(Context context, d70 d70Var) {
        super(context);
        this.f39105a = 0;
        this.f39106b = d70Var;
    }
}
