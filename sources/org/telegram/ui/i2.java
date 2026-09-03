package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
public final class i2 extends HorizontalScrollView {
    public final int f34791a;
    public final Object f34792b;

    public i2(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.f34791a = i10;
        this.f34792b = frameLayout;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f34791a) {
            case 1:
                int mode = View.MeasureSpec.getMode(i10);
                if (mode == 1073741824) {
                    super.onMeasure(i10, i11);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0), i11);
                int measuredWidth = getMeasuredWidth();
                int i12 = ((vh.w3) this.f34792b).H;
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
        org.telegram.ui.Cells.l9 textSelectionHelper;
        switch (this.f34791a) {
            case 0:
                super.onScrollChanged(i10, i11, i12, i13);
                p70 p70Var = (p70) this.f34792b;
                if (p70Var.d != null) {
                    p70Var.d = null;
                    p70Var.f36983f = null;
                    return;
                }
                return;
            case 1:
            default:
                super.onScrollChanged(i10, i11, i12, i13);
                return;
            case 2:
                super.onScrollChanged(i10, i11, i12, i13);
                vh.z2 z2Var = ((vh.j5) this.f34792b).B;
                if (z2Var != null && (textSelectionHelper = z2Var.f46422a.getTextSelectionHelper()) != null && textSelectionHelper.y()) {
                    textSelectionHelper.x();
                }
                invalidate();
                return;
        }
    }

    public i2(Context context, p70 p70Var) {
        super(context);
        this.f34791a = 0;
        this.f34792b = p70Var;
    }
}
