package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;

public final class i2 extends HorizontalScrollView {

    public final int f38959a;

    public final Object f38960b;

    public i2(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.f38959a = i10;
        this.f38960b = frameLayout;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f38959a) {
            case 1:
                int mode = View.MeasureSpec.getMode(i10);
                if (mode != 1073741824) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0), i11);
                    int measuredWidth = getMeasuredWidth();
                    int iMin = ((rh.t3) this.f38960b).G;
                    if (mode == Integer.MIN_VALUE) {
                        iMin = Math.min(iMin, View.MeasureSpec.getSize(i10));
                    }
                    setMeasuredDimension(Math.min(measuredWidth, iMin), getMeasuredHeight());
                } else {
                    super.onMeasure(i10, i11);
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.j9 textSelectionHelper;
        switch (this.f38959a) {
            case 0:
                super.onScrollChanged(i10, i11, i12, i13);
                d70 d70Var = (d70) this.f38960b;
                if (d70Var.d != null) {
                    d70Var.d = null;
                    d70Var.f37288f = null;
                }
                break;
            case 1:
            default:
                super.onScrollChanged(i10, i11, i12, i13);
                break;
            case 2:
                super.onScrollChanged(i10, i11, i12, i13);
                rh.w2 w2Var = ((rh.g5) this.f38960b).A;
                if (w2Var != null && (textSelectionHelper = w2Var.f47536a.getTextSelectionHelper()) != null && textSelectionHelper.y()) {
                    textSelectionHelper.x();
                }
                invalidate();
                break;
        }
    }

    public i2(Context context, d70 d70Var) {
        super(context);
        this.f38959a = 0;
        this.f38960b = d70Var;
    }
}
