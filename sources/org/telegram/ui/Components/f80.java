package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class f80 extends FrameLayout {
    public final k80 f26368a;

    public f80(k80 k80Var, Context context) {
        super(context);
        this.f26368a = k80Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        k80 k80Var = this.f26368a;
        Drawable drawable = k80Var.f28003b;
        int i11 = k80Var.f28008r;
        i10 = ((org.telegram.ui.ActionBar.f3) k80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            k80 k80Var = this.f26368a;
            if (k80Var.f28008r != 0 && motionEvent.getY() < k80Var.f28008r) {
                k80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k80.o(this.f26368a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        k80 k80Var = this.f26368a;
        TextView textView = k80Var.f28006f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        g80 g80Var = k80Var.d;
        ((FrameLayout.LayoutParams) g80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.q.D(58.0f, k80Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) k80Var).backgroundPaddingTop;
        int C = org.telegram.messenger.q.C(55.0f, i12 + D, measuredHeight);
        int i14 = size / 5;
        if (C < i14 * 3) {
            i13 = size - C;
        } else {
            i13 = i14 * 2;
        }
        if (g80Var.getPaddingTop() != i13) {
            k80Var.f28007n = true;
            g80Var.setPadding(0, i13, 0, 0);
            k80Var.f28007n = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f26368a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f26368a.f28007n) {
            return;
        }
        super.requestLayout();
    }
}
