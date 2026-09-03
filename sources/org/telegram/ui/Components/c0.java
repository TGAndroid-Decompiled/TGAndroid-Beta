package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class c0 extends LinearLayout {
    public final RectF f23781a;
    public final RectF f23782b;
    public final RectF f23783c;
    public final Paint d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final e0 f23784f;

    public c0(e0 e0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f23784f = e0Var;
        this.e = f6Var;
        this.f23781a = new RectF();
        this.f23782b = new RectF();
        this.f23783c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e0 e0Var;
        float d;
        z5 z5Var = this.f23784f.h;
        if (z5Var == null) {
            d = 0.0f;
        } else {
            d = z5Var.d(e0Var.f24430f, false);
        }
        double d10 = d;
        int floor = (int) Math.floor(d10);
        int ceil = (int) Math.ceil(d10);
        float f10 = d - floor;
        RectF rectF = this.f23781a;
        if (floor >= 0 && floor < getChildCount()) {
            View childAt = getChildAt(floor);
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        }
        RectF rectF2 = this.f23782b;
        if (ceil >= 0 && ceil < getChildCount()) {
            View childAt2 = getChildAt(ceil);
            rectF2.set(childAt2.getLeft(), childAt2.getTop(), childAt2.getRight(), childAt2.getBottom());
        }
        RectF rectF3 = this.f23783c;
        AndroidUtilities.lerp(rectF, rectF2, f10, rectF3);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.e));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(e0Var.d), AndroidUtilities.dp(e0Var.d), paint);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt3 = getChildAt(i10);
            if (childAt3 instanceof d0) {
                ((d0) childAt3).a(Math.max(0.0f, 1.0f - Math.abs(i10 - d)), false);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        int size;
        int i12;
        int i13;
        int measuredHeight;
        boolean z10 = true;
        if (getOrientation() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            size = View.MeasureSpec.getSize(i10);
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            childAt.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            if (z4) {
                i12 = View.MeasureSpec.makeMeasureSpec(0, 0);
            } else {
                i12 = i10;
            }
            if (!z4) {
                i13 = View.MeasureSpec.makeMeasureSpec(0, 0);
            } else {
                i13 = i11;
            }
            childAt.measure(i12, i13);
            if (z4) {
                measuredHeight = childAt.getMeasuredWidth();
            } else {
                measuredHeight = childAt.getMeasuredHeight();
            }
            i15 = Math.max(i15, measuredHeight);
            i14 += measuredHeight;
        }
        z10 = (i14 > size || ((float) i15) >= ((float) size) / ((float) getChildCount())) ? false : false;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt2 = getChildAt(i17);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            childAt2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            if (z10) {
                if (z4) {
                    layoutParams.width = 0;
                } else {
                    layoutParams.height = 0;
                }
                layoutParams.weight = 1.0f;
            } else {
                if (z4) {
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
