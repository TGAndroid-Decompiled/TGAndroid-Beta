package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class a80 extends FrameLayout {
    public final f80 f21419a;

    public a80(f80 f80Var, Context context) {
        super(context);
        this.f21419a = f80Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        f80 f80Var = this.f21419a;
        Drawable drawable = f80Var.f22926b;
        int i11 = f80Var.f22930r;
        i10 = ((org.telegram.ui.ActionBar.h3) f80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            f80 f80Var = this.f21419a;
            if (f80Var.f22930r != 0 && motionEvent.getY() < f80Var.f22930r) {
                f80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        f80.o(this.f21419a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        f80 f80Var = this.f21419a;
        TextView textView = f80Var.f22928f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        b80 b80Var = f80Var.d;
        ((FrameLayout.LayoutParams) b80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.a2.D(58.0f, f80Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.h3) f80Var).backgroundPaddingTop;
        int C = org.telegram.messenger.a2.C(55.0f, i12 + D, measuredHeight);
        int i14 = size / 5;
        if (C < i14 * 3) {
            i13 = size - C;
        } else {
            i13 = i14 * 2;
        }
        if (b80Var.getPaddingTop() != i13) {
            f80Var.f22929n = true;
            b80Var.setPadding(0, i13, 0, 0);
            f80Var.f22929n = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f21419a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f21419a.f22929n) {
            return;
        }
        super.requestLayout();
    }
}
