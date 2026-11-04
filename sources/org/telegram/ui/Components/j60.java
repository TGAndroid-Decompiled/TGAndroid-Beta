package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class j60 extends FrameLayout {
    public final o60 f34970a;

    public j60(o60 o60Var, Context context) {
        super(context);
        this.f34970a = o60Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        o60 o60Var = this.f34970a;
        o60Var.f36745j1.setBounds(0, o60Var.f36752s1 - o60Var.f28617t0, getMeasuredWidth(), getMeasuredHeight());
        o60Var.f36745j1.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            o60 o60Var = this.f34970a;
            if (o60Var.f36752s1 != 0 && motionEvent.getY() < o60Var.f36752s1) {
                o60Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        o60.I0(this.f34970a);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.f22602m;
        o60 o60Var = this.f34970a;
        TextView textView = o60Var.f36749p1;
        measureChildWithMargins(textView, i3, 0, i10, 0);
        int measuredHeight = textView.getMeasuredHeight();
        k60 k60Var = o60Var.f36747n1;
        ((FrameLayout.LayoutParams) k60Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(65.0f) + measuredHeight;
        getMeasuredWidth();
        int C = org.telegram.messenger.k5.C(55.0f, org.telegram.messenger.k5.D(58.0f, o60Var.f36750q1.size(), org.telegram.messenger.g0.L(80.0f)) + o60Var.f28617t0, measuredHeight);
        int i12 = size / 5;
        if (C < i12 * 3) {
            i11 = size - C;
        } else {
            i11 = i12 * 2;
        }
        if (k60Var.getPaddingTop() != i11) {
            o60Var.f36751r1 = true;
            k60Var.setPadding(0, i11, 0, 0);
            o60Var.f36751r1 = false;
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f34970a.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f34970a.f36751r1) {
            return;
        }
        super.requestLayout();
    }
}
