package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class z70 extends FrameLayout {
    public final e80 f30771a;

    public z70(e80 e80Var, Context context) {
        super(context);
        this.f30771a = e80Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        e80 e80Var = this.f30771a;
        Drawable drawable = e80Var.f23768b;
        int i11 = e80Var.f23772r;
        i10 = ((org.telegram.ui.ActionBar.f3) e80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            e80 e80Var = this.f30771a;
            if (e80Var.f23772r != 0 && motionEvent.getY() < e80Var.f23772r) {
                e80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        e80.o(this.f30771a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        e80 e80Var = this.f30771a;
        TextView textView = e80Var.f23770f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        a80 a80Var = e80Var.d;
        ((FrameLayout.LayoutParams) a80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.l0.D(58.0f, e80Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) e80Var).backgroundPaddingTop;
        int C = org.telegram.messenger.l0.C(55.0f, i12 + D, measuredHeight);
        int i14 = size / 5;
        if (C < i14 * 3) {
            i13 = size - C;
        } else {
            i13 = i14 * 2;
        }
        if (a80Var.getPaddingTop() != i13) {
            e80Var.f23771n = true;
            a80Var.setPadding(0, i13, 0, 0);
            e80Var.f23771n = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f30771a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f30771a.f23771n) {
            return;
        }
        super.requestLayout();
    }
}
