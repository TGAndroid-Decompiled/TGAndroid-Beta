package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class x80 extends FrameLayout {
    public final c90 f32677a;

    public x80(c90 c90Var, Context context) {
        super(context);
        this.f32677a = c90Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        c90 c90Var = this.f32677a;
        Drawable drawable = c90Var.f24864b;
        int i11 = c90Var.f24869r;
        i10 = ((org.telegram.ui.ActionBar.e3) c90Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            c90 c90Var = this.f32677a;
            if (c90Var.f24869r != 0 && motionEvent.getY() < c90Var.f24869r) {
                c90Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c90.q(this.f32677a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        c90 c90Var = this.f32677a;
        TextView textView = c90Var.f24867f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        y80 y80Var = c90Var.d;
        ((FrameLayout.LayoutParams) y80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.v0.D(58.0f, c90Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.e3) c90Var).backgroundPaddingTop;
        int C = org.telegram.messenger.v0.C(55.0f, i12 + D, measuredHeight);
        int i14 = size / 5;
        if (C < i14 * 3) {
            i13 = size - C;
        } else {
            i13 = i14 * 2;
        }
        if (y80Var.getPaddingTop() != i13) {
            c90Var.f24868n = true;
            y80Var.setPadding(0, i13, 0, 0);
            c90Var.f24868n = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f32677a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f32677a.f24868n) {
            return;
        }
        super.requestLayout();
    }
}
