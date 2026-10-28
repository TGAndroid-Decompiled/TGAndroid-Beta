package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class p80 extends FrameLayout {
    public final u80 f31523a;

    public p80(u80 u80Var, Context context) {
        super(context);
        this.f31523a = u80Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        u80 u80Var = this.f31523a;
        Drawable drawable = u80Var.f33282b;
        int i11 = u80Var.v;
        i10 = ((org.telegram.ui.ActionBar.k3) u80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            u80 u80Var = this.f31523a;
            if (u80Var.v != 0 && motionEvent.getY() < u80Var.v) {
                u80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        u80.o(this.f31523a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        u80 u80Var = this.f31523a;
        TextView textView = u80Var.f33285n;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        q80 q80Var = u80Var.f33284f;
        ((FrameLayout.LayoutParams) q80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int b10 = org.telegram.messenger.wh.b(58.0f, u80Var.f33286r.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.k3) u80Var).backgroundPaddingTop;
        int D = org.telegram.messenger.t.D(55.0f, i12 + b10, measuredHeight);
        int i14 = size / 5;
        if (D < i14 * 3) {
            i13 = size - D;
        } else {
            i13 = i14 * 2;
        }
        if (q80Var.getPaddingTop() != i13) {
            u80Var.f33287s = true;
            q80Var.setPadding(0, i13, 0, 0);
            u80Var.f33287s = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f31523a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f31523a.f33287s) {
            return;
        }
        super.requestLayout();
    }
}
