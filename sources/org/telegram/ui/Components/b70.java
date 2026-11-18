package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class b70 extends FrameLayout {
    public final g70 f33575a;

    public b70(g70 g70Var, Context context) {
        super(context);
        this.f33575a = g70Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        g70 g70Var = this.f33575a;
        g70Var.f35362m1.setBounds(0, g70Var.f35370v1 - g70Var.f30224t0, getMeasuredWidth(), getMeasuredHeight());
        g70Var.f35362m1.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            g70 g70Var = this.f33575a;
            if (g70Var.f35370v1 != 0 && motionEvent.getY() < g70Var.f35370v1) {
                g70Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        g70.J0(this.f33575a);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.f24112m;
        g70 g70Var = this.f33575a;
        TextView textView = g70Var.f35367s1;
        measureChildWithMargins(textView, i7, 0, i10, 0);
        int measuredHeight = textView.getMeasuredHeight();
        c70 c70Var = g70Var.f35365q1;
        ((FrameLayout.LayoutParams) c70Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(65.0f) + measuredHeight;
        getMeasuredWidth();
        int C = org.telegram.messenger.f3.C(55.0f, org.telegram.messenger.f3.D(58.0f, g70Var.f35368t1.size(), org.telegram.messenger.g0.L(80.0f)) + g70Var.f30224t0, measuredHeight);
        int i12 = size / 5;
        if (C < i12 * 3) {
            i11 = size - C;
        } else {
            i11 = i12 * 2;
        }
        if (c70Var.getPaddingTop() != i11) {
            g70Var.f35369u1 = true;
            c70Var.setPadding(0, i11, 0, 0);
            g70Var.f35369u1 = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f33575a.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f33575a.f35369u1) {
            return;
        }
        super.requestLayout();
    }
}
