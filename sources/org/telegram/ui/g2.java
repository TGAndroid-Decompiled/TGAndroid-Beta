package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
public final class g2 extends HorizontalScrollView {
    public final int f37067a;
    public final Object f37068b;

    public g2(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.f37067a = i10;
        this.f37068b = frameLayout;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f37067a) {
            case 1:
                int mode = View.MeasureSpec.getMode(i10);
                if (mode == 1073741824) {
                    super.onMeasure(i10, i11);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0), i11);
                int measuredWidth = getMeasuredWidth();
                int i12 = ((wh.v3) this.f37068b).H;
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
        org.telegram.ui.Cells.m9 textSelectionHelper;
        switch (this.f37067a) {
            case 0:
                super.onScrollChanged(i10, i11, i12, i13);
                o70 o70Var = (o70) this.f37068b;
                if (o70Var.d != null) {
                    o70Var.d = null;
                    o70Var.f39612f = null;
                    return;
                }
                return;
            case 1:
            default:
                super.onScrollChanged(i10, i11, i12, i13);
                return;
            case 2:
                super.onScrollChanged(i10, i11, i12, i13);
                wh.y2 y2Var = ((wh.i5) this.f37068b).B;
                if (y2Var != null && (textSelectionHelper = y2Var.f50171a.getTextSelectionHelper()) != null && textSelectionHelper.y()) {
                    textSelectionHelper.x();
                }
                invalidate();
                return;
        }
    }

    public g2(Context context, o70 o70Var) {
        super(context);
        this.f37067a = 0;
        this.f37068b = o70Var;
    }
}
