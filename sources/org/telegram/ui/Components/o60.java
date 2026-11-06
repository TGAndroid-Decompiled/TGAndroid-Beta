package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class o60 extends FrameLayout {
    public final t60 f36562a;

    public o60(t60 t60Var, Context context) {
        super(context);
        this.f36562a = t60Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        t60 t60Var = this.f36562a;
        t60Var.f38244i1.setBounds(0, t60Var.f38251r1 - t60Var.f28645s0, getMeasuredWidth(), getMeasuredHeight());
        t60Var.f38244i1.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            t60 t60Var = this.f36562a;
            if (t60Var.f38251r1 != 0 && motionEvent.getY() < t60Var.f38251r1) {
                t60Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        t60.I0(this.f36562a);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.f22538m;
        t60 t60Var = this.f36562a;
        TextView textView = t60Var.f38248o1;
        measureChildWithMargins(textView, i7, 0, i10, 0);
        int measuredHeight = textView.getMeasuredHeight();
        p60 p60Var = t60Var.f38247m1;
        ((FrameLayout.LayoutParams) p60Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(65.0f) + measuredHeight;
        getMeasuredWidth();
        int C = org.telegram.messenger.k5.C(55.0f, org.telegram.messenger.k5.D(58.0f, t60Var.f38249p1.size(), org.telegram.messenger.g0.L(80.0f)) + t60Var.f28645s0, measuredHeight);
        int i12 = size / 5;
        if (C < i12 * 3) {
            i11 = size - C;
        } else {
            i11 = i12 * 2;
        }
        if (p60Var.getPaddingTop() != i11) {
            t60Var.f38250q1 = true;
            p60Var.setPadding(0, i11, 0, 0);
            t60Var.f38250q1 = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f36562a.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f36562a.f38250q1) {
            return;
        }
        super.requestLayout();
    }
}
