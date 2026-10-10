package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class u80 extends FrameLayout {
    public final z80 f31420a;

    public u80(z80 z80Var, Context context) {
        super(context);
        this.f31420a = z80Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        z80 z80Var = this.f31420a;
        Drawable drawable = z80Var.f33521b;
        int i11 = z80Var.f33526r;
        i10 = ((org.telegram.ui.ActionBar.f3) z80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            z80 z80Var = this.f31420a;
            if (z80Var.f33526r != 0 && motionEvent.getY() < z80Var.f33526r) {
                z80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        z80.q(this.f31420a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        z80 z80Var = this.f31420a;
        TextView textView = z80Var.f33524f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        v80 v80Var = z80Var.d;
        ((FrameLayout.LayoutParams) v80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.q.D(58.0f, z80Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) z80Var).backgroundPaddingTop;
        int C = org.telegram.messenger.q.C(55.0f, i12 + D, measuredHeight);
        int i14 = size / 5;
        if (C < i14 * 3) {
            i13 = size - C;
        } else {
            i13 = i14 * 2;
        }
        if (v80Var.getPaddingTop() != i13) {
            z80Var.f33525n = true;
            v80Var.setPadding(0, i13, 0, 0);
            z80Var.f33525n = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f31420a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f31420a.f33525n) {
            return;
        }
        super.requestLayout();
    }
}
