package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class b0 extends LinearLayout {
    public final RectF f26939a;
    public final RectF f26940b;
    public final RectF f26941c;
    public final Paint d;
    public final org.telegram.ui.ActionBar.b6 f26942e;
    public final d0 f26943f;

    public b0(d0 d0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f26943f = d0Var;
        this.f26942e = b6Var;
        this.f26939a = new RectF();
        this.f26940b = new RectF();
        this.f26941c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d0 d0Var;
        float d;
        y5 y5Var = this.f26943f.h;
        if (y5Var == null) {
            d = 0.0f;
        } else {
            d = y5Var.d(d0Var.f27606f, false);
        }
        double d9 = d;
        int floor = (int) Math.floor(d9);
        int ceil = (int) Math.ceil(d9);
        float f10 = d - floor;
        RectF rectF = this.f26939a;
        if (floor >= 0 && floor < getChildCount()) {
            View childAt = getChildAt(floor);
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        }
        RectF rectF2 = this.f26940b;
        if (ceil >= 0 && ceil < getChildCount()) {
            View childAt2 = getChildAt(ceil);
            rectF2.set(childAt2.getLeft(), childAt2.getTop(), childAt2.getRight(), childAt2.getBottom());
        }
        RectF rectF3 = this.f26941c;
        AndroidUtilities.lerp(rectF, rectF2, f10, rectF3);
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.f26942e));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(d0Var.d), AndroidUtilities.dp(d0Var.d), paint);
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt3 = getChildAt(i9);
            if (childAt3 instanceof c0) {
                ((c0) childAt3).a(Math.max(0.0f, 1.0f - Math.abs(i9 - d)), false);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        boolean z10;
        int size;
        int i11;
        int i12;
        int measuredHeight;
        boolean z11 = true;
        if (getOrientation() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            size = View.MeasureSpec.getSize(i9);
        } else {
            size = View.MeasureSpec.getSize(i10);
        }
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            childAt.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            if (z10) {
                i11 = View.MeasureSpec.makeMeasureSpec(0, 0);
            } else {
                i11 = i9;
            }
            if (!z10) {
                i12 = View.MeasureSpec.makeMeasureSpec(0, 0);
            } else {
                i12 = i10;
            }
            childAt.measure(i11, i12);
            if (z10) {
                measuredHeight = childAt.getMeasuredWidth();
            } else {
                measuredHeight = childAt.getMeasuredHeight();
            }
            i14 = Math.max(i14, measuredHeight);
            i13 += measuredHeight;
        }
        z11 = (i13 > size || ((float) i14) >= ((float) size) / ((float) getChildCount())) ? false : false;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt2 = getChildAt(i16);
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
        super.onMeasure(i9, i10);
    }
}
