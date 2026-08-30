package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class t70 extends FrameLayout {
    public final y70 f28916a;

    public t70(y70 y70Var, Context context) {
        super(context);
        this.f28916a = y70Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        y70 y70Var = this.f28916a;
        Drawable drawable = y70Var.f30909b;
        int i11 = y70Var.f30913r;
        i10 = ((org.telegram.ui.ActionBar.g3) y70Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            y70 y70Var = this.f28916a;
            if (y70Var.f30913r != 0 && motionEvent.getY() < y70Var.f30913r) {
                y70Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        y70.o(this.f28916a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        y70 y70Var = this.f28916a;
        TextView textView = y70Var.f30911f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        u70 u70Var = y70Var.d;
        ((FrameLayout.LayoutParams) u70Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.y3.D(58.0f, y70Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.g3) y70Var).backgroundPaddingTop;
        int C = org.telegram.messenger.y3.C(55.0f, i12 + D, measuredHeight);
        int i14 = size / 5;
        if (C < i14 * 3) {
            i13 = size - C;
        } else {
            i13 = i14 * 2;
        }
        if (u70Var.getPaddingTop() != i13) {
            y70Var.f30912n = true;
            u70Var.setPadding(0, i13, 0, 0);
            y70Var.f30912n = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f28916a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f28916a.f30912n) {
            return;
        }
        super.requestLayout();
    }
}
