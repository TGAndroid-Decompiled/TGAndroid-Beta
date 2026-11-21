package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class d70 extends FrameLayout {
    public final i70 f34400a;

    public d70(i70 i70Var, Context context) {
        super(context);
        this.f34400a = i70Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        i70 i70Var = this.f34400a;
        i70Var.f36186m1.setBounds(0, i70Var.f36194v1 - i70Var.f30207t0, getMeasuredWidth(), getMeasuredHeight());
        i70Var.f36186m1.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            i70 i70Var = this.f34400a;
            if (i70Var.f36194v1 != 0 && motionEvent.getY() < i70Var.f36194v1) {
                i70Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        i70.J0(this.f34400a);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.f24140m;
        i70 i70Var = this.f34400a;
        TextView textView = i70Var.f36191s1;
        measureChildWithMargins(textView, i7, 0, i10, 0);
        int measuredHeight = textView.getMeasuredHeight();
        e70 e70Var = i70Var.f36189q1;
        ((FrameLayout.LayoutParams) e70Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(65.0f) + measuredHeight;
        getMeasuredWidth();
        int C = org.telegram.messenger.f3.C(55.0f, org.telegram.messenger.f3.D(58.0f, i70Var.f36192t1.size(), org.telegram.messenger.g0.L(80.0f)) + i70Var.f30207t0, measuredHeight);
        int i12 = size / 5;
        if (C < i12 * 3) {
            i11 = size - C;
        } else {
            i11 = i12 * 2;
        }
        if (e70Var.getPaddingTop() != i11) {
            i70Var.f36193u1 = true;
            e70Var.setPadding(0, i11, 0, 0);
            i70Var.f36193u1 = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f34400a.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f34400a.f36193u1) {
            return;
        }
        super.requestLayout();
    }
}
