package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import org.telegram.messenger.Utilities;
public final class nx extends ImageView {
    public int f36636a;
    public g5 f36637b;
    public boolean f36638c;
    public p5 d;
    public sw f36639e;
    public final org.telegram.messenger.bc[] f36640f;
    public float h;
    public ValueAnimator f36641n;

    public nx(Context context) {
        super(context);
        this.f36640f = new org.telegram.messenger.bc[2];
        setScaleType(ImageView.ScaleType.CENTER);
        int i3 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.x0(null, i3, false), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(this, a02, null, N, null);
    }

    public final void a(org.telegram.messenger.e6 e6Var, boolean z10) {
        setImageDrawable(e6Var);
        this.f36638c = z10;
    }

    public p5 getSpan() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (isPressed()) {
            float f10 = this.h;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.f22609r) / 100.0f) + f10;
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
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i3));
    }

    @Override
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.f36641n) != null) {
                valueAnimator.removeAllListeners();
                this.f36641n.cancel();
            }
            if (!z10) {
                float f10 = this.h;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f36641n = ofFloat;
                    ofFloat.addUpdateListener(new c6(this, 21));
                    this.f36641n.addListener(new x5(this, 25));
                    org.telegram.messenger.camera.q.i(5.0f, this.f36641n);
                    this.f36641n.setDuration(350L);
                    this.f36641n.start();
                }
            }
        }
    }

    public void setSpan(p5 p5Var) {
        this.d = p5Var;
    }
}
