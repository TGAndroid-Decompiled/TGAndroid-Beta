package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class d0 extends LinearLayout {
    public final RectF f27601a;
    public final RectF f27602b;
    public final RectF f27603c;
    public final Paint d;
    public final org.telegram.ui.ActionBar.c6 f27604e;
    public final f0 f27605f;

    public d0(f0 f0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f27605f = f0Var;
        this.f27604e = c6Var;
        this.f27601a = new RectF();
        this.f27602b = new RectF();
        this.f27603c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        f0 f0Var;
        float d;
        d6 d6Var = this.f27605f.h;
        if (d6Var == null) {
            d = 0.0f;
        } else {
            d = d6Var.d(f0Var.f28223f, false);
        }
        double d10 = d;
        int floor = (int) Math.floor(d10);
        int ceil = (int) Math.ceil(d10);
        float f9 = d - floor;
        RectF rectF = this.f27601a;
        if (floor >= 0 && floor < getChildCount()) {
            View childAt = getChildAt(floor);
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        }
        RectF rectF2 = this.f27602b;
        if (ceil >= 0 && ceil < getChildCount()) {
            View childAt2 = getChildAt(ceil);
            rectF2.set(childAt2.getLeft(), childAt2.getTop(), childAt2.getRight(), childAt2.getBottom());
        }
        RectF rectF3 = this.f27603c;
        AndroidUtilities.lerp(rectF, rectF2, f9, rectF3);
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.f27604e));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(f0Var.d), AndroidUtilities.dp(f0Var.d), paint);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt3 = getChildAt(i10);
            if (childAt3 instanceof e0) {
                ((e0) childAt3).a(Math.max(0.0f, 1.0f - Math.abs(i10 - d)), false);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int size;
        int i12;
        int i13;
        int measuredHeight;
        boolean z11 = true;
        if (getOrientation() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            size = View.MeasureSpec.getSize(i10);
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            childAt.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            if (z10) {
                i12 = View.MeasureSpec.makeMeasureSpec(0, 0);
            } else {
                i12 = i10;
            }
            if (!z10) {
                i13 = View.MeasureSpec.makeMeasureSpec(0, 0);
            } else {
                i13 = i11;
            }
            childAt.measure(i12, i13);
            if (z10) {
                measuredHeight = childAt.getMeasuredWidth();
            } else {
                measuredHeight = childAt.getMeasuredHeight();
            }
            i15 = Math.max(i15, measuredHeight);
            i14 += measuredHeight;
        }
        z11 = (i14 > size || ((float) i15) >= ((float) size) / ((float) getChildCount())) ? false : false;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt2 = getChildAt(i17);
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
