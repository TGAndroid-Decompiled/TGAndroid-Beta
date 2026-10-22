package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class ld1 extends FrameLayout {
    public ValueAnimator f38902a;
    public boolean f38903b;
    public float f38904c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7 = ((1.0f - this.f38904c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f10 = this.f38904c;
            if (f10 != 1.0f) {
                this.f38904c = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f38903b != z10) {
            this.f38903b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f38902a) != null) {
                valueAnimator.removeAllListeners();
                this.f38902a.cancel();
            }
            if (!z10) {
                float f7 = this.f38904c;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f38902a = ofFloat;
                    ofFloat.addUpdateListener(new c11(this, 14));
                    this.f38902a.addListener(new zb0(this, 28));
                    org.telegram.messenger.ok.l(5.0f, this.f38902a);
                    this.f38902a.setDuration(350L);
                    this.f38902a.start();
                }
            }
        }
    }
}
