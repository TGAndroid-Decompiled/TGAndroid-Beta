package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class b70 extends FrameLayout {
    public final g70 f27064a;

    public b70(g70 g70Var, Context context) {
        super(context);
        this.f27064a = g70Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        g70 g70Var = this.f27064a;
        Drawable drawable = g70Var.f28666b;
        int i10 = g70Var.f28671r;
        i9 = ((org.telegram.ui.ActionBar.f3) g70Var).backgroundPaddingTop;
        drawable.setBounds(0, i10 - i9, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            g70 g70Var = this.f27064a;
            if (g70Var.f28671r != 0 && motionEvent.getY() < g70Var.f28671r) {
                g70Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        g70.o(this.f27064a);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.statusBarHeight;
        g70 g70Var = this.f27064a;
        TextView textView = g70Var.f28669f;
        measureChildWithMargins(textView, i9, 0, i10, 0);
        int measuredHeight = textView.getMeasuredHeight();
        c70 c70Var = g70Var.d;
        ((FrameLayout.LayoutParams) c70Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.l0.D(58.0f, g70Var.h.size(), AndroidUtilities.dp(80.0f));
        i11 = ((org.telegram.ui.ActionBar.f3) g70Var).backgroundPaddingTop;
        int C = org.telegram.messenger.l0.C(55.0f, i11 + D, measuredHeight);
        int i13 = size / 5;
        if (C < i13 * 3) {
            i12 = size - C;
        } else {
            i12 = i13 * 2;
        }
        if (c70Var.getPaddingTop() != i12) {
            g70Var.f28670n = true;
            c70Var.setPadding(0, i12, 0, 0);
            g70Var.f28670n = false;
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f27064a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f27064a.f28670n) {
            return;
        }
        super.requestLayout();
    }
}
