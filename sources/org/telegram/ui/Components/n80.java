package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class n80 extends FrameLayout {
    public final s80 f28895a;

    public n80(s80 s80Var, Context context) {
        super(context);
        this.f28895a = s80Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        s80 s80Var = this.f28895a;
        Drawable drawable = s80Var.f30412b;
        int i11 = s80Var.v;
        i10 = ((org.telegram.ui.ActionBar.h3) s80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            s80 s80Var = this.f28895a;
            if (s80Var.v != 0 && motionEvent.getY() < s80Var.v) {
                s80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        s80.p(this.f28895a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        s80 s80Var = this.f28895a;
        TextView textView = s80Var.f30415n;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        o80 o80Var = s80Var.f30414f;
        ((FrameLayout.LayoutParams) o80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.v0.D(58.0f, s80Var.f30416r.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.h3) s80Var).backgroundPaddingTop;
        int C = org.telegram.messenger.v0.C(55.0f, i12 + D, measuredHeight);
        int i14 = size / 5;
        if (C < i14 * 3) {
            i13 = size - C;
        } else {
            i13 = i14 * 2;
        }
        if (o80Var.getPaddingTop() != i13) {
            s80Var.f30417s = true;
            o80Var.setPadding(0, i13, 0, 0);
            s80Var.f30417s = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f28895a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f28895a.f30417s) {
            return;
        }
        super.requestLayout();
    }
}
