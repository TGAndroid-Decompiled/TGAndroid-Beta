package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class b0 extends LinearLayout {
    public final RectF f22790a;
    public final RectF f22791b;
    public final RectF f22792c;
    public final Paint d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final d0 f22793f;

    public b0(d0 d0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f22793f = d0Var;
        this.e = f6Var;
        this.f22790a = new RectF();
        this.f22791b = new RectF();
        this.f22792c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d0 d0Var;
        float d;
        d6 d6Var = this.f22793f.h;
        if (d6Var == null) {
            d = 0.0f;
        } else {
            d = d6Var.d(d0Var.f23512f, false);
        }
        double d10 = d;
        int floor = (int) Math.floor(d10);
        int ceil = (int) Math.ceil(d10);
        float f7 = d - floor;
        RectF rectF = this.f22790a;
        if (floor >= 0 && floor < getChildCount()) {
            View childAt = getChildAt(floor);
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        }
        RectF rectF2 = this.f22791b;
        if (ceil >= 0 && ceil < getChildCount()) {
            View childAt2 = getChildAt(ceil);
            rectF2.set(childAt2.getLeft(), childAt2.getTop(), childAt2.getRight(), childAt2.getBottom());
        }
        RectF rectF3 = this.f22792c;
        AndroidUtilities.lerp(rectF, rectF2, f7, rectF3);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.e));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(d0Var.d), AndroidUtilities.dp(d0Var.d), paint);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt3 = getChildAt(i10);
            if (childAt3 instanceof c0) {
                ((c0) childAt3).a(Math.max(0.0f, 1.0f - Math.abs(i10 - d)), false);
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
