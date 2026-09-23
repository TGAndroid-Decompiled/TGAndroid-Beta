package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class s70 extends FrameLayout {
    public final x70 f27865a;

    public s70(x70 x70Var, Context context) {
        super(context);
        this.f27865a = x70Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        x70 x70Var = this.f27865a;
        Drawable drawable = x70Var.f29933b;
        int i11 = x70Var.f29937r;
        i10 = ((org.telegram.ui.ActionBar.f3) x70Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            x70 x70Var = this.f27865a;
            if (x70Var.f29937r != 0 && motionEvent.getY() < x70Var.f29937r) {
                x70Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        x70.o(this.f27865a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        x70 x70Var = this.f27865a;
        TextView textView = x70Var.f29935f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        t70 t70Var = x70Var.d;
        ((FrameLayout.LayoutParams) t70Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.z0.D(58.0f, x70Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) x70Var).backgroundPaddingTop;
        int C = org.telegram.messenger.z0.C(55.0f, i12 + D, measuredHeight);
        int i14 = size / 5;
        if (C < i14 * 3) {
            i13 = size - C;
        } else {
            i13 = i14 * 2;
        }
        if (t70Var.getPaddingTop() != i13) {
            x70Var.f29936n = true;
            t70Var.setPadding(0, i13, 0, 0);
            x70Var.f29936n = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f27865a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f27865a.f29936n) {
            return;
        }
        super.requestLayout();
    }
}
