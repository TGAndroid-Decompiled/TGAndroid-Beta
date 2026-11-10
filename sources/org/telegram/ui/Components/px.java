package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import org.telegram.messenger.Utilities;
public final class px extends ImageView {
    public int f37087a;
    public h5 f37088b;
    public boolean f37089c;
    public q5 d;
    public tw f37090e;
    public final org.telegram.messenger.ic[] f37091f;
    public float h;
    public ValueAnimator f37092n;

    public px(Context context) {
        super(context);
        this.f37091f = new org.telegram.messenger.ic[2];
        setScaleType(ImageView.ScaleType.CENTER);
        int i7 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.x0(null, i7, false), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        setBackground(a02);
        org.telegram.ui.ActionBar.t6.j(this, a02, null, M, null);
    }

    public final void a(org.telegram.messenger.e6 e6Var, boolean z9) {
        setImageDrawable(e6Var);
        this.f37089c = z9;
    }

    public q5 getSpan() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (isPressed()) {
            float f10 = this.h;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.f22568r) / 100.0f) + f10;
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
    public void setPressed(boolean z9) {
        ValueAnimator valueAnimator;
        if (isPressed() != z9) {
            super.setPressed(z9);
            invalidate();
            if (z9 && (valueAnimator = this.f37092n) != null) {
                valueAnimator.removeAllListeners();
                this.f37092n.cancel();
            }
            if (!z9) {
                float f10 = this.h;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f37092n = ofFloat;
                    ofFloat.addUpdateListener(new d6(this, 21));
                    this.f37092n.addListener(new y5(this, 25));
                    org.telegram.messenger.camera.q.i(5.0f, this.f37092n);
                    this.f37092n.setDuration(350L);
                    this.f37092n.start();
                }
            }
        }
    }

    public void setSpan(q5 q5Var) {
        this.d = q5Var;
    }
}
