package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class d80 extends FrameLayout {
    public final i80 f23623a;

    public d80(i80 i80Var, Context context) {
        super(context);
        this.f23623a = i80Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        i80 i80Var = this.f23623a;
        Drawable drawable = i80Var.f24997b;
        int i11 = i80Var.f25001r;
        i10 = ((org.telegram.ui.ActionBar.e3) i80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            i80 i80Var = this.f23623a;
            if (i80Var.f25001r != 0 && motionEvent.getY() < i80Var.f25001r) {
                i80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i80.o(this.f23623a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        i80 i80Var = this.f23623a;
        TextView textView = i80Var.f24999f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        e80 e80Var = i80Var.d;
        ((FrameLayout.LayoutParams) e80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.f0.D(58.0f, i80Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.e3) i80Var).backgroundPaddingTop;
        int C = org.telegram.messenger.f0.C(55.0f, i12 + D, measuredHeight);
        int i14 = size / 5;
        if (C < i14 * 3) {
            i13 = size - C;
        } else {
            i13 = i14 * 2;
        }
        if (e80Var.getPaddingTop() != i13) {
            i80Var.f25000n = true;
            e80Var.setPadding(0, i13, 0, 0);
            i80Var.f25000n = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f23623a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f23623a.f25000n) {
            return;
        }
        super.requestLayout();
    }
}
