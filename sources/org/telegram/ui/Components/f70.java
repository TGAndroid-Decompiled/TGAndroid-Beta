package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class f70 extends FrameLayout {
    public final k70 f25990a;

    public f70(k70 k70Var, Context context) {
        super(context);
        this.f25990a = k70Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        k70 k70Var = this.f25990a;
        k70Var.f27656i1.setBounds(0, k70Var.f27664r1 - k70Var.f21614s0, getMeasuredWidth(), getMeasuredHeight());
        k70Var.f27656i1.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            k70 k70Var = this.f25990a;
            if (k70Var.f27664r1 != 0 && motionEvent.getY() < k70Var.f27664r1) {
                k70Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k70.I0(this.f25990a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11) - org.telegram.messenger.i0.f16020m;
        k70 k70Var = this.f25990a;
        TextView textView = k70Var.f27661o1;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        g70 g70Var = k70Var.f27659m1;
        ((FrameLayout.LayoutParams) g70Var.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(65.0f) + measuredHeight;
        getMeasuredWidth();
        int C = org.telegram.messenger.m5.C(55.0f, org.telegram.messenger.m5.D(58.0f, k70Var.f27662p1.size(), org.telegram.messenger.i0.L(80.0f)) + k70Var.f21614s0, measuredHeight);
        int i13 = size / 5;
        if (C < i13 * 3) {
            i12 = size - C;
        } else {
            i12 = i13 * 2;
        }
        if (g70Var.getPaddingTop() != i12) {
            k70Var.f27663q1 = true;
            g70Var.setPadding(0, i12, 0, 0);
            k70Var.f27663q1 = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f25990a.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f25990a.f27663q1) {
            return;
        }
        super.requestLayout();
    }
}
