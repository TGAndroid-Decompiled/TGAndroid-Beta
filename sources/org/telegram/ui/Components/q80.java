package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class q80 extends FrameLayout {
    public final v80 f28224a;

    public q80(v80 v80Var, Context context) {
        super(context);
        this.f28224a = v80Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        v80 v80Var = this.f28224a;
        Drawable drawable = v80Var.f29596b;
        int i11 = v80Var.f29600r;
        i10 = ((org.telegram.ui.ActionBar.e3) v80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            v80 v80Var = this.f28224a;
            if (v80Var.f29600r != 0 && motionEvent.getY() < v80Var.f29600r) {
                v80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        v80.q(this.f28224a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        v80 v80Var = this.f28224a;
        TextView textView = v80Var.f29598f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        r80 r80Var = v80Var.d;
        ((FrameLayout.LayoutParams) r80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.g0.D(58.0f, v80Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.e3) v80Var).backgroundPaddingTop;
        int C = org.telegram.messenger.g0.C(55.0f, i12 + D, measuredHeight);
        int i14 = size / 5;
        if (C < i14 * 3) {
            i13 = size - C;
        } else {
            i13 = i14 * 2;
        }
        if (r80Var.getPaddingTop() != i13) {
            v80Var.f29599n = true;
            r80Var.setPadding(0, i13, 0, 0);
            v80Var.f29599n = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f28224a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f28224a.f29599n) {
            return;
        }
        super.requestLayout();
    }
}
