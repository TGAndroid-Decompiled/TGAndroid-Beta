package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
public final class h2 extends HorizontalScrollView {
    public final int f38649a;
    public final Object f38650b;

    public h2(FrameLayout frameLayout, Context context, int i9) {
        super(context);
        this.f38649a = i9;
        this.f38650b = frameLayout;
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f38649a) {
            case 1:
                int mode = View.MeasureSpec.getMode(i9);
                if (mode == 1073741824) {
                    super.onMeasure(i9, i10);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 0), i10);
                int measuredWidth = getMeasuredWidth();
                int i11 = ((qh.s3) this.f38650b).G;
                if (mode == Integer.MIN_VALUE) {
                    i11 = Math.min(i11, View.MeasureSpec.getSize(i9));
                }
                setMeasuredDimension(Math.min(measuredWidth, i11), getMeasuredHeight());
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public void onScrollChanged(int i9, int i10, int i11, int i12) {
        org.telegram.ui.Cells.n9 textSelectionHelper;
        switch (this.f38649a) {
            case 0:
                super.onScrollChanged(i9, i10, i11, i12);
                a70 a70Var = (a70) this.f38650b;
                if (a70Var.d != null) {
                    a70Var.d = null;
                    a70Var.f36377f = null;
                    return;
                }
                return;
            case 1:
            default:
                super.onScrollChanged(i9, i10, i11, i12);
                return;
            case 2:
                super.onScrollChanged(i9, i10, i11, i12);
                qh.v2 v2Var = ((qh.f5) this.f38650b).A;
                if (v2Var != null && (textSelectionHelper = v2Var.f46757a.getTextSelectionHelper()) != null && textSelectionHelper.y()) {
                    textSelectionHelper.x();
                }
                invalidate();
                return;
        }
    }

    public h2(Context context, a70 a70Var) {
        super(context);
        this.f38649a = 0;
        this.f38650b = a70Var;
    }
}
