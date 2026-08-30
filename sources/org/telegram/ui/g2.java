package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
public final class g2 extends HorizontalScrollView {
    public final int f34436a;
    public final Object f34437b;

    public g2(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.f34436a = i10;
        this.f34437b = frameLayout;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f34436a) {
            case 1:
                int mode = View.MeasureSpec.getMode(i10);
                if (mode == 1073741824) {
                    super.onMeasure(i10, i11);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0), i11);
                int measuredWidth = getMeasuredWidth();
                int i12 = ((vh.v3) this.f34437b).H;
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
        switch (this.f34436a) {
            case 0:
                super.onScrollChanged(i10, i11, i12, i13);
                n70 n70Var = (n70) this.f34437b;
                if (n70Var.d != null) {
                    n70Var.d = null;
                    n70Var.f36478f = null;
                    return;
                }
                return;
            case 1:
            default:
                super.onScrollChanged(i10, i11, i12, i13);
                return;
            case 2:
                super.onScrollChanged(i10, i11, i12, i13);
                vh.y2 y2Var = ((vh.i5) this.f34437b).B;
                if (y2Var != null && (textSelectionHelper = y2Var.f46324a.getTextSelectionHelper()) != null && textSelectionHelper.y()) {
                    textSelectionHelper.x();
                }
                invalidate();
                return;
        }
    }

    public g2(Context context, n70 n70Var) {
        super(context);
        this.f34436a = 0;
        this.f34437b = n70Var;
    }
}
