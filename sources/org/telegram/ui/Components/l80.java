package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l80 extends FrameLayout {
    public final q80 f28249a;

    public l80(q80 q80Var, Context context) {
        super(context);
        this.f28249a = q80Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        q80 q80Var = this.f28249a;
        Drawable drawable = q80Var.f29822b;
        int i11 = q80Var.v;
        i10 = ((org.telegram.ui.ActionBar.h3) q80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            q80 q80Var = this.f28249a;
            if (q80Var.v != 0 && motionEvent.getY() < q80Var.v) {
                q80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        q80.p(this.f28249a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        q80 q80Var = this.f28249a;
        TextView textView = q80Var.f29825n;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        m80 m80Var = q80Var.f29824f;
        ((FrameLayout.LayoutParams) m80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.v0.D(58.0f, q80Var.f29826r.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.h3) q80Var).backgroundPaddingTop;
        int C = org.telegram.messenger.v0.C(55.0f, i12 + D, measuredHeight);
        int i14 = size / 5;
        if (C < i14 * 3) {
            i13 = size - C;
        } else {
            i13 = i14 * 2;
        }
        if (m80Var.getPaddingTop() != i13) {
            q80Var.f29827s = true;
            m80Var.setPadding(0, i13, 0, 0);
            q80Var.f29827s = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f28249a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f28249a.f29827s) {
            return;
        }
        super.requestLayout();
    }
}
