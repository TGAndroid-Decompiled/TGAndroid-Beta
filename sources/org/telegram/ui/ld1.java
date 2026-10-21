package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class ld1 extends FrameLayout {
    public ValueAnimator f38899a;
    public boolean f38900b;
    public float f38901c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7 = ((1.0f - this.f38901c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f10 = this.f38901c;
            if (f10 != 1.0f) {
                this.f38901c = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f38900b != z10) {
            this.f38900b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f38899a) != null) {
                valueAnimator.removeAllListeners();
                this.f38899a.cancel();
            }
            if (!z10) {
                float f7 = this.f38901c;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f38899a = ofFloat;
                    ofFloat.addUpdateListener(new c11(this, 14));
                    this.f38899a.addListener(new zb0(this, 28));
                    org.telegram.messenger.mk.l(5.0f, this.f38899a);
                    this.f38899a.setDuration(350L);
                    this.f38899a.start();
                }
            }
        }
    }
}
