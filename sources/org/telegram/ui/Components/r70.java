package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class r70 extends FrameLayout {
    public final w70 f29994a;

    public r70(w70 w70Var, Context context) {
        super(context);
        this.f29994a = w70Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        w70 w70Var = this.f29994a;
        Drawable drawable = w70Var.f32212b;
        int i11 = w70Var.f32217r;
        i10 = ((org.telegram.ui.ActionBar.f3) w70Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            w70 w70Var = this.f29994a;
            if (w70Var.f32217r != 0 && motionEvent.getY() < w70Var.f32217r) {
                w70Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        w70.o(this.f29994a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        w70 w70Var = this.f29994a;
        TextView textView = w70Var.f32215f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        s70 s70Var = w70Var.d;
        ((FrameLayout.LayoutParams) s70Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.w1.D(58.0f, w70Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) w70Var).backgroundPaddingTop;
        int C = org.telegram.messenger.w1.C(55.0f, i12 + D, measuredHeight);
        int i14 = size / 5;
        if (C < i14 * 3) {
            i13 = size - C;
        } else {
            i13 = i14 * 2;
        }
        if (s70Var.getPaddingTop() != i13) {
            w70Var.f32216n = true;
            s70Var.setPadding(0, i13, 0, 0);
            w70Var.f32216n = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f29994a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f29994a.f32216n) {
            return;
        }
        super.requestLayout();
    }
}
