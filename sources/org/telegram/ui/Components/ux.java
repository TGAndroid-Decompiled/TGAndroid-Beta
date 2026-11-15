package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import org.telegram.messenger.Utilities;
public final class ux extends ImageView {
    public int f40179a;
    public g5 f40180b;
    public boolean f40181c;
    public p5 d;
    public zw f40182e;
    public final org.telegram.messenger.hc[] f40183f;
    public float h;
    public ValueAnimator f40184n;

    public ux(Context context) {
        super(context);
        this.f40183f = new org.telegram.messenger.hc[2];
        setScaleType(ImageView.ScaleType.CENTER);
        int i7 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.x0(null, i7, false), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        setBackground(a02);
        org.telegram.ui.ActionBar.q6.j(this, a02, null, M, null);
    }

    public final void a(org.telegram.messenger.f6 f6Var, boolean z10) {
        setImageDrawable(f6Var);
        this.f40181c = z10;
    }

    public p5 getSpan() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (isPressed()) {
            float f10 = this.h;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.f23610r) / 100.0f) + f10;
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
            if (z10 && (valueAnimator = this.f40184n) != null) {
                valueAnimator.removeAllListeners();
                this.f40184n.cancel();
            }
            if (!z10) {
                float f10 = this.h;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f40184n = ofFloat;
                    ofFloat.addUpdateListener(new c6(this, 21));
                    this.f40184n.addListener(new x5(this, 25));
                    org.telegram.messenger.i20.k(5.0f, this.f40184n);
                    this.f40184n.setDuration(350L);
                    this.f40184n.start();
                }
            }
        }
    }

    public void setSpan(p5 p5Var) {
        this.d = p5Var;
    }
}
