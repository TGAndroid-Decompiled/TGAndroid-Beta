package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import org.telegram.messenger.Utilities;
public final class ey extends ImageView {
    public int f25965a;
    public f5 f25966b;
    public boolean f25967c;
    public o5 d;
    public ix e;
    public final org.telegram.messenger.kc[] f25968f;
    public float h;
    public ValueAnimator f25969n;

    public ey(Context context) {
        super(context);
        this.f25968f = new org.telegram.messenger.kc[2];
        setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.x0(null, i10, false), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        setBackground(a02);
        org.telegram.ui.ActionBar.a7.k(this, a02, null, N, null);
    }

    public final void a(org.telegram.messenger.g6 g6Var, boolean z10) {
        setImageDrawable(g6Var);
        this.f25967c = z10;
    }

    public o5 getSpan() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (isPressed()) {
            float f7 = this.h;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.i0.f16173r) / 100.0f) + f7;
                this.h = min;
                this.h = Utilities.i(min, 1.0f, 0.0f);
                invalidate();
            }
        }
        float f10 = ((1.0f - this.h) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.view.View");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i10));
    }

    @Override
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.f25969n) != null) {
                valueAnimator.removeAllListeners();
                this.f25969n.cancel();
            }
            if (!z10) {
                float f7 = this.h;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f25969n = ofFloat;
                    ofFloat.addUpdateListener(new a6(this, 21));
                    this.f25969n.addListener(new w5(this, 25));
                    org.telegram.messenger.a30.j(5.0f, this.f25969n);
                    this.f25969n.setDuration(350L);
                    this.f25969n.start();
                }
            }
        }
    }

    public void setSpan(o5 o5Var) {
        this.d = o5Var;
    }
}
