package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class a70 extends FrameLayout {
    public final f70 f33379a;

    public a70(f70 f70Var, Context context) {
        super(context);
        this.f33379a = f70Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        f70 f70Var = this.f33379a;
        f70Var.f35027m1.setBounds(0, f70Var.f35035v1 - f70Var.f30260t0, getMeasuredWidth(), getMeasuredHeight());
        f70Var.f35027m1.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            f70 f70Var = this.f33379a;
            if (f70Var.f35035v1 != 0 && motionEvent.getY() < f70Var.f35035v1) {
                f70Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        f70.J0(this.f33379a);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.f24220m;
        f70 f70Var = this.f33379a;
        TextView textView = f70Var.f35032s1;
        measureChildWithMargins(textView, i7, 0, i10, 0);
        int measuredHeight = textView.getMeasuredHeight();
        b70 b70Var = f70Var.f35030q1;
        ((FrameLayout.LayoutParams) b70Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(65.0f) + measuredHeight;
        getMeasuredWidth();
        int C = org.telegram.messenger.f3.C(55.0f, org.telegram.messenger.f3.D(58.0f, f70Var.f35033t1.size(), org.telegram.messenger.g0.L(80.0f)) + f70Var.f30260t0, measuredHeight);
        int i12 = size / 5;
        if (C < i12 * 3) {
            i11 = size - C;
        } else {
            i11 = i12 * 2;
        }
        if (b70Var.getPaddingTop() != i11) {
            f70Var.f35034u1 = true;
            b70Var.setPadding(0, i11, 0, 0);
            f70Var.f35034u1 = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f33379a.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f33379a.f35034u1) {
            return;
        }
        super.requestLayout();
    }
}
