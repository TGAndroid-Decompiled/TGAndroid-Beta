package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class f70 extends FrameLayout {

    public final k70 f28290a;

    public f70(k70 k70Var, Context context) {
        super(context);
        this.f28290a = k70Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        k70 k70Var = this.f28290a;
        Drawable drawable = k70Var.f30023b;
        drawable.setBounds(0, k70Var.f30028r - ((org.telegram.ui.ActionBar.e3) k70Var).backgroundPaddingTop, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            k70 k70Var = this.f28290a;
            if (k70Var.f30028r != 0 && motionEvent.getY() < k70Var.f30028r) {
                k70Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k70.p(this.f28290a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        k70 k70Var = this.f28290a;
        TextView textView = k70Var.f30026f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        g70 g70Var = k70Var.d;
        ((FrameLayout.LayoutParams) g70Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int iC = org.telegram.messenger.y1.C(55.0f, ((org.telegram.ui.ActionBar.e3) k70Var).backgroundPaddingTop + org.telegram.messenger.y1.D(58.0f, k70Var.h.size(), AndroidUtilities.dp(80.0f)), measuredHeight);
        int i12 = size / 5;
        int i13 = iC < i12 * 3 ? size - iC : i12 * 2;
        if (g70Var.getPaddingTop() != i13) {
            k70Var.f30027n = true;
            g70Var.setPadding(0, i13, 0, 0);
            k70Var.f30027n = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.f28290a.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f28290a.f30027n) {
            return;
        }
        super.requestLayout();
    }
}
