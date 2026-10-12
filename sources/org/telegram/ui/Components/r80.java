package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class r80 extends FrameLayout {
    public final w80 f28774a;

    public r80(w80 w80Var, Context context) {
        super(context);
        this.f28774a = w80Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        w80 w80Var = this.f28774a;
        Drawable drawable = w80Var.f30816b;
        int i11 = w80Var.f30820r;
        i10 = ((org.telegram.ui.ActionBar.e3) w80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            w80 w80Var = this.f28774a;
            if (w80Var.f30820r != 0 && motionEvent.getY() < w80Var.f30820r) {
                w80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        w80.q(this.f28774a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        w80 w80Var = this.f28774a;
        TextView textView = w80Var.f30818f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        s80 s80Var = w80Var.d;
        ((FrameLayout.LayoutParams) s80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int y3 = org.telegram.messenger.yh.y(58.0f, w80Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.e3) w80Var).backgroundPaddingTop;
        int c10 = org.telegram.messenger.yh.c(55.0f, i12 + y3, measuredHeight);
        int i14 = size / 5;
        if (c10 < i14 * 3) {
            i13 = size - c10;
        } else {
            i13 = i14 * 2;
        }
        if (s80Var.getPaddingTop() != i13) {
            w80Var.f30819n = true;
            s80Var.setPadding(0, i13, 0, 0);
            w80Var.f30819n = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f28774a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f28774a.f30819n) {
            return;
        }
        super.requestLayout();
    }
}
