package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class o80 extends FrameLayout {
    public final t80 f31224a;

    public o80(t80 t80Var, Context context) {
        super(context);
        this.f31224a = t80Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        t80 t80Var = this.f31224a;
        Drawable drawable = t80Var.f32906b;
        int i11 = t80Var.v;
        i10 = ((org.telegram.ui.ActionBar.k3) t80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            t80 t80Var = this.f31224a;
            if (t80Var.v != 0 && motionEvent.getY() < t80Var.v) {
                t80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        t80.o(this.f31224a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        t80 t80Var = this.f31224a;
        TextView textView = t80Var.f32909n;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        p80 p80Var = t80Var.f32908f;
        ((FrameLayout.LayoutParams) p80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int b10 = org.telegram.messenger.vh.b(58.0f, t80Var.f32910r.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.k3) t80Var).backgroundPaddingTop;
        int D = org.telegram.messenger.t.D(55.0f, i12 + b10, measuredHeight);
        int i14 = size / 5;
        if (D < i14 * 3) {
            i13 = size - D;
        } else {
            i13 = i14 * 2;
        }
        if (p80Var.getPaddingTop() != i13) {
            t80Var.f32911s = true;
            p80Var.setPadding(0, i13, 0, 0);
            t80Var.f32911s = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f31224a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f31224a.f32911s) {
            return;
        }
        super.requestLayout();
    }
}
