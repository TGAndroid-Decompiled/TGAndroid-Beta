package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import org.telegram.messenger.Utilities;
public final class yx extends ImageView {
    public int f42578a;
    public o5 f42579b;
    public boolean f42580c;
    public x5 d;
    public ex f42581e;
    public final org.telegram.messenger.gc[] f42582f;
    public float h;
    public ValueAnimator f42583n;

    public yx(Context context) {
        super(context);
        this.f42582f = new org.telegram.messenger.gc[2];
        setScaleType(ImageView.ScaleType.CENTER);
        int i7 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.x0(null, i7, false), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        setBackground(a02);
        org.telegram.ui.ActionBar.u6.j(this, a02, null, M, null);
    }

    public final void a(org.telegram.messenger.f6 f6Var, boolean z10) {
        setImageDrawable(f6Var);
        this.f42580c = z10;
    }

    public x5 getSpan() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (isPressed()) {
            float f10 = this.h;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.f24227r) / 100.0f) + f10;
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
            if (z10 && (valueAnimator = this.f42583n) != null) {
                valueAnimator.removeAllListeners();
                this.f42583n.cancel();
            }
            if (!z10) {
                float f10 = this.h;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f42583n = ofFloat;
                    ofFloat.addUpdateListener(new w(this, 22));
                    this.f42583n.addListener(new x(this, 26));
                    org.telegram.ui.Cells.c0.q(5.0f, this.f42583n);
                    this.f42583n.setDuration(350L);
                    this.f42583n.start();
                }
            }
        }
    }

    public void setSpan(x5 x5Var) {
        this.d = x5Var;
    }
}
