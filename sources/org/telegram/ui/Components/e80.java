package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class e80 extends FrameLayout {
    public final j80 f23972a;

    public e80(j80 j80Var, Context context) {
        super(context);
        this.f23972a = j80Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        j80 j80Var = this.f23972a;
        Drawable drawable = j80Var.f25378b;
        int i11 = j80Var.f25382r;
        i10 = ((org.telegram.ui.ActionBar.g3) j80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            j80 j80Var = this.f23972a;
            if (j80Var.f25382r != 0 && motionEvent.getY() < j80Var.f25382r) {
                j80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j80.o(this.f23972a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        j80 j80Var = this.f23972a;
        TextView textView = j80Var.f25380f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        f80 f80Var = j80Var.d;
        ((FrameLayout.LayoutParams) f80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.l0.D(58.0f, j80Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.g3) j80Var).backgroundPaddingTop;
        int C = org.telegram.messenger.l0.C(55.0f, i12 + D, measuredHeight);
        int i14 = size / 5;
        if (C < i14 * 3) {
            i13 = size - C;
        } else {
            i13 = i14 * 2;
        }
        if (f80Var.getPaddingTop() != i13) {
            j80Var.f25381n = true;
            f80Var.setPadding(0, i13, 0, 0);
            j80Var.f25381n = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f23972a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f23972a.f25381n) {
            return;
        }
        super.requestLayout();
    }
}
