package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

public final class b0 extends LinearLayout {

    public final RectF f26859a;

    public final RectF f26860b;

    public final RectF f26861c;
    public final Paint d;

    public final org.telegram.ui.ActionBar.c6 f26862e;

    public final d0 f26863f;

    public b0(d0 d0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f26863f = d0Var;
        this.f26862e = c6Var;
        this.f26859a = new RectF();
        this.f26860b = new RectF();
        this.f26861c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d0 d0Var = this.f26863f;
        y5 y5Var = d0Var.h;
        float fD = y5Var == null ? 0.0f : y5Var.d(d0Var.f27588f, false);
        double d = fD;
        int iFloor = (int) Math.floor(d);
        int iCeil = (int) Math.ceil(d);
        float f10 = fD - iFloor;
        RectF rectF = this.f26859a;
        if (iFloor >= 0 && iFloor < getChildCount()) {
            View childAt = getChildAt(iFloor);
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        }
        RectF rectF2 = this.f26860b;
        if (iCeil >= 0 && iCeil < getChildCount()) {
            View childAt2 = getChildAt(iCeil);
            rectF2.set(childAt2.getLeft(), childAt2.getTop(), childAt2.getRight(), childAt2.getBottom());
        }
        RectF rectF3 = this.f26861c;
        AndroidUtilities.lerp(rectF, rectF2, f10, rectF3);
        int iL1 = org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.f26862e));
        Paint paint = this.d;
        paint.setColor(iL1);
        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(d0Var.d), AndroidUtilities.dp(d0Var.d), paint);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt3 = getChildAt(i10);
            if (childAt3 instanceof c0) {
                ((c0) childAt3).a(Math.max(0.0f, 1.0f - Math.abs(i10 - fD)), false);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = getOrientation() == 0;
        int size = z10 ? View.MeasureSpec.getSize(i10) : View.MeasureSpec.getSize(i11);
        int i12 = 0;
        int iMax = 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            childAt.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            childAt.measure(z10 ? View.MeasureSpec.makeMeasureSpec(0, 0) : i10, !z10 ? View.MeasureSpec.makeMeasureSpec(0, 0) : i11);
            int measuredWidth = z10 ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight();
            iMax = Math.max(iMax, measuredWidth);
            i12 += measuredWidth;
        }
        boolean z11 = i12 <= size && ((float) iMax) < ((float) size) / ((float) getChildCount());
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt2 = getChildAt(i14);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            childAt2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            if (z11) {
                if (z10) {
                    layoutParams.width = 0;
                } else {
                    layoutParams.height = 0;
                }
                layoutParams.weight = 1.0f;
            } else {
                if (z10) {
                    layoutParams.width = -2;
                } else {
                    layoutParams.height = -2;
                }
                layoutParams.weight = 0.0f;
            }
        }
        super.onMeasure(i10, i11);
    }
}
