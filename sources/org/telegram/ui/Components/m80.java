package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class m80 extends FrameLayout {
    public final r80 f28453a;

    public m80(r80 r80Var, Context context) {
        super(context);
        this.f28453a = r80Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        r80 r80Var = this.f28453a;
        Drawable drawable = r80Var.f29873b;
        int i11 = r80Var.f29877r;
        i10 = ((org.telegram.ui.ActionBar.f3) r80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            r80 r80Var = this.f28453a;
            if (r80Var.f29877r != 0 && motionEvent.getY() < r80Var.f29877r) {
                r80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        r80.p(this.f28453a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        r80 r80Var = this.f28453a;
        TextView textView = r80Var.f29875f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        n80 n80Var = r80Var.d;
        ((FrameLayout.LayoutParams) n80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.g0.D(58.0f, r80Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) r80Var).backgroundPaddingTop;
        int C = org.telegram.messenger.g0.C(55.0f, i12 + D, measuredHeight);
        int i14 = size / 5;
        if (C < i14 * 3) {
            i13 = size - C;
        } else {
            i13 = i14 * 2;
        }
        if (n80Var.getPaddingTop() != i13) {
            r80Var.f29876n = true;
            n80Var.setPadding(0, i13, 0, 0);
            r80Var.f29876n = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f28453a.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f28453a.f29876n) {
            return;
        }
        super.requestLayout();
    }
}
