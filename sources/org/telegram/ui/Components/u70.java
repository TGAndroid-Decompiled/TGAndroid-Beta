package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class u70 extends FrameLayout {
    public final z70 f29126a;

    public u70(z70 z70Var, Context context) {
        super(context);
        this.f29126a = z70Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        z70 z70Var = this.f29126a;
        Drawable drawable = z70Var.f31270b;
        int i11 = z70Var.f31274r;
        i10 = ((org.telegram.ui.ActionBar.g3) z70Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            z70 z70Var = this.f29126a;
            if (z70Var.f31274r != 0 && motionEvent.getY() < z70Var.f31274r) {
                z70Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        z70.o(this.f29126a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        z70 z70Var = this.f29126a;
        TextView textView = z70Var.f31272f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        v70 v70Var = z70Var.d;
        ((FrameLayout.LayoutParams) v70Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.y3.D(58.0f, z70Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.g3) z70Var).backgroundPaddingTop;
        int C = org.telegram.messenger.y3.C(55.0f, i12 + D, measuredHeight);
        int i14 = size / 5;
        if (C < i14 * 3) {
            i13 = size - C;
        } else {
            i13 = i14 * 2;
        }
        if (v70Var.getPaddingTop() != i13) {
            z70Var.f31273n = true;
            v70Var.setPadding(0, i13, 0, 0);
            z70Var.f31273n = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f29126a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f29126a.f31273n) {
            return;
        }
        super.requestLayout();
    }
}
