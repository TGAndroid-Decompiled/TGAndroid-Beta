package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class v70 extends FrameLayout {
    public final a80 f31815a;

    public v70(a80 a80Var, Context context) {
        super(context);
        this.f31815a = a80Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        a80 a80Var = this.f31815a;
        Drawable drawable = a80Var.f25181b;
        int i11 = a80Var.f25186r;
        i10 = ((org.telegram.ui.ActionBar.h3) a80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            a80 a80Var = this.f31815a;
            if (a80Var.f25186r != 0 && motionEvent.getY() < a80Var.f25186r) {
                a80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        a80.o(this.f31815a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        a80 a80Var = this.f31815a;
        TextView textView = a80Var.f25184f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        w70 w70Var = a80Var.d;
        ((FrameLayout.LayoutParams) w70Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.y3.D(58.0f, a80Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.h3) a80Var).backgroundPaddingTop;
        int C = org.telegram.messenger.y3.C(55.0f, i12 + D, measuredHeight);
        int i14 = size / 5;
        if (C < i14 * 3) {
            i13 = size - C;
        } else {
            i13 = i14 * 2;
        }
        if (w70Var.getPaddingTop() != i13) {
            a80Var.f25185n = true;
            w70Var.setPadding(0, i13, 0, 0);
            a80Var.f25185n = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f31815a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f31815a.f25185n) {
            return;
        }
        super.requestLayout();
    }
}
