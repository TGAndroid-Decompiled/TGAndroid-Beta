package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class q60 extends FrameLayout {
    public final v60 f38534a;

    public q60(v60 v60Var, Context context) {
        super(context);
        this.f38534a = v60Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        v60 v60Var = this.f38534a;
        v60Var.f40277m1.setBounds(0, v60Var.f40285v1 - v60Var.f29716t0, getMeasuredWidth(), getMeasuredHeight());
        v60Var.f40277m1.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            v60 v60Var = this.f38534a;
            if (v60Var.f40285v1 != 0 && motionEvent.getY() < v60Var.f40285v1) {
                v60Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        v60.I0(this.f38534a);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.f23605m;
        v60 v60Var = this.f38534a;
        TextView textView = v60Var.f40282s1;
        measureChildWithMargins(textView, i7, 0, i10, 0);
        int measuredHeight = textView.getMeasuredHeight();
        r60 r60Var = v60Var.f40280q1;
        ((FrameLayout.LayoutParams) r60Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(65.0f) + measuredHeight;
        getMeasuredWidth();
        int C = org.telegram.messenger.k5.C(55.0f, org.telegram.messenger.k5.D(58.0f, v60Var.f40283t1.size(), org.telegram.messenger.g0.L(80.0f)) + v60Var.f29716t0, measuredHeight);
        int i12 = size / 5;
        if (C < i12 * 3) {
            i11 = size - C;
        } else {
            i11 = i12 * 2;
        }
        if (r60Var.getPaddingTop() != i11) {
            v60Var.f40284u1 = true;
            r60Var.setPadding(0, i11, 0, 0);
            v60Var.f40284u1 = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f38534a.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f38534a.f40284u1) {
            return;
        }
        super.requestLayout();
    }
}
