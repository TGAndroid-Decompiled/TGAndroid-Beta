package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class o70 extends FrameLayout {
    public final t70 f31278a;

    public o70(t70 t70Var, Context context) {
        super(context);
        this.f31278a = t70Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        t70 t70Var = this.f31278a;
        Drawable drawable = t70Var.f32886b;
        int i11 = t70Var.f32891r;
        i10 = ((org.telegram.ui.ActionBar.f3) t70Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            t70 t70Var = this.f31278a;
            if (t70Var.f32891r != 0 && motionEvent.getY() < t70Var.f32891r) {
                t70Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        t70.o(this.f31278a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        t70 t70Var = this.f31278a;
        TextView textView = t70Var.f32889f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        p70 p70Var = t70Var.d;
        ((FrameLayout.LayoutParams) p70Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.x3.D(58.0f, t70Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) t70Var).backgroundPaddingTop;
        int C = org.telegram.messenger.x3.C(55.0f, i12 + D, measuredHeight);
        int i14 = size / 5;
        if (C < i14 * 3) {
            i13 = size - C;
        } else {
            i13 = i14 * 2;
        }
        if (p70Var.getPaddingTop() != i13) {
            t70Var.f32890n = true;
            p70Var.setPadding(0, i13, 0, 0);
            t70Var.f32890n = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f31278a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f31278a.f32890n) {
            return;
        }
        super.requestLayout();
    }
}
