package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class t80 extends FrameLayout {
    public final y80 f31158a;

    public t80(y80 y80Var, Context context) {
        super(context);
        this.f31158a = y80Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        y80 y80Var = this.f31158a;
        Drawable drawable = y80Var.f33176b;
        int i11 = y80Var.f33181r;
        i10 = ((org.telegram.ui.ActionBar.e3) y80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            y80 y80Var = this.f31158a;
            if (y80Var.f33181r != 0 && motionEvent.getY() < y80Var.f33181r) {
                y80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        y80.q(this.f31158a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        y80 y80Var = this.f31158a;
        TextView textView = y80Var.f33179f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        u80 u80Var = y80Var.d;
        ((FrameLayout.LayoutParams) u80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.q.D(58.0f, y80Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.e3) y80Var).backgroundPaddingTop;
        int C = org.telegram.messenger.q.C(55.0f, i12 + D, measuredHeight);
        int i14 = size / 5;
        if (C < i14 * 3) {
            i13 = size - C;
        } else {
            i13 = i14 * 2;
        }
        if (u80Var.getPaddingTop() != i13) {
            y80Var.f33180n = true;
            u80Var.setPadding(0, i13, 0, 0);
            y80Var.f33180n = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f31158a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f31158a.f33180n) {
            return;
        }
        super.requestLayout();
    }
}
