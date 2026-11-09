package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class p60 extends FrameLayout {
    public final u60 f36934a;

    public p60(u60 u60Var, Context context) {
        super(context);
        this.f36934a = u60Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        u60 u60Var = this.f36934a;
        u60Var.f38626i1.setBounds(0, u60Var.f38633r1 - u60Var.f28653s0, getMeasuredWidth(), getMeasuredHeight());
        u60Var.f38626i1.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            u60 u60Var = this.f36934a;
            if (u60Var.f38633r1 != 0 && motionEvent.getY() < u60Var.f38633r1) {
                u60Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        u60.I0(this.f36934a);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.f22557m;
        u60 u60Var = this.f36934a;
        TextView textView = u60Var.f38630o1;
        measureChildWithMargins(textView, i7, 0, i10, 0);
        int measuredHeight = textView.getMeasuredHeight();
        q60 q60Var = u60Var.f38629m1;
        ((FrameLayout.LayoutParams) q60Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(65.0f) + measuredHeight;
        getMeasuredWidth();
        int C = org.telegram.messenger.k5.C(55.0f, org.telegram.messenger.k5.D(58.0f, u60Var.f38631p1.size(), org.telegram.messenger.g0.L(80.0f)) + u60Var.f28653s0, measuredHeight);
        int i12 = size / 5;
        if (C < i12 * 3) {
            i11 = size - C;
        } else {
            i11 = i12 * 2;
        }
        if (q60Var.getPaddingTop() != i11) {
            u60Var.f38632q1 = true;
            q60Var.setPadding(0, i11, 0, 0);
            u60Var.f38632q1 = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f36934a.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f36934a.f38632q1) {
            return;
        }
        super.requestLayout();
    }
}
