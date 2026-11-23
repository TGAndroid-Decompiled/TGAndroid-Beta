package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import org.telegram.messenger.Utilities;
public final class cy extends ImageView {
    public int f34287a;
    public p5 f34288b;
    public boolean f34289c;
    public y5 d;
    public hx f34290e;
    public final org.telegram.messenger.hc[] f34291f;
    public float h;
    public ValueAnimator f34292n;

    public cy(Context context) {
        super(context);
        this.f34291f = new org.telegram.messenger.hc[2];
        setScaleType(ImageView.ScaleType.CENTER);
        int i7 = org.telegram.ui.ActionBar.m6.f29439i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.x0(null, i7, false), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        setBackground(a02);
        org.telegram.ui.ActionBar.t6.j(this, a02, null, M, null);
    }

    public final void a(org.telegram.messenger.f6 f6Var, boolean z10) {
        setImageDrawable(f6Var);
        this.f34289c = z10;
    }

    public y5 getSpan() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (isPressed()) {
            float f10 = this.h;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.f24011r) / 100.0f) + f10;
                this.h = min;
                this.h = Utilities.i(min, 1.0f, 0.0f);
                invalidate();
            }
        }
        float f11 = ((1.0f - this.h) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f11, f11, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.view.View");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i7));
    }

    @Override
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.f34292n) != null) {
                valueAnimator.removeAllListeners();
                this.f34292n.cancel();
            }
            if (!z10) {
                float f10 = this.h;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f34292n = ofFloat;
                    ofFloat.addUpdateListener(new x(this, 22));
                    this.f34292n.addListener(new y(this, 26));
                    org.telegram.ui.Cells.c0.q(5.0f, this.f34292n);
                    this.f34292n.setDuration(350L);
                    this.f34292n.start();
                }
            }
        }
    }

    public void setSpan(y5 y5Var) {
        this.d = y5Var;
    }
}
