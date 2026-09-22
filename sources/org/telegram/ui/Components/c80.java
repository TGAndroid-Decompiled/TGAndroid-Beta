package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class c80 extends FrameLayout {
    public final h80 f23300a;

    public c80(h80 h80Var, Context context) {
        super(context);
        this.f23300a = h80Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        h80 h80Var = this.f23300a;
        Drawable drawable = h80Var.f24711b;
        int i11 = h80Var.f24715r;
        i10 = ((org.telegram.ui.ActionBar.f3) h80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            h80 h80Var = this.f23300a;
            if (h80Var.f24715r != 0 && motionEvent.getY() < h80Var.f24715r) {
                h80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        h80.o(this.f23300a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        h80 h80Var = this.f23300a;
        TextView textView = h80Var.f24713f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        d80 d80Var = h80Var.d;
        ((FrameLayout.LayoutParams) d80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.l0.D(58.0f, h80Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) h80Var).backgroundPaddingTop;
        int C = org.telegram.messenger.l0.C(55.0f, i12 + D, measuredHeight);
        int i14 = size / 5;
        if (C < i14 * 3) {
            i13 = size - C;
        } else {
            i13 = i14 * 2;
        }
        if (d80Var.getPaddingTop() != i13) {
            h80Var.f24714n = true;
            d80Var.setPadding(0, i13, 0, 0);
            h80Var.f24714n = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f23300a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f23300a.f24714n) {
            return;
        }
        super.requestLayout();
    }
}
