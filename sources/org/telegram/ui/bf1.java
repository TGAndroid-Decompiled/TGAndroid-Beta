package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class bf1 extends FrameLayout {
    public ValueAnimator f36154a;
    public boolean f36155b;
    public float f36156c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7 = ((1.0f - this.f36156c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f10 = this.f36156c;
            if (f10 != 1.0f) {
                this.f36156c = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f36155b != z10) {
            this.f36155b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f36154a) != null) {
                valueAnimator.removeAllListeners();
                this.f36154a.cancel();
            }
            if (!z10) {
                float f7 = this.f36156c;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f36154a = ofFloat;
                    ofFloat.addUpdateListener(new a21(this, 16));
                    this.f36154a.addListener(new gp0(this, 24));
                    org.telegram.messenger.am.l(5.0f, this.f36154a);
                    this.f36154a.setDuration(350L);
                    this.f36154a.start();
                }
            }
        }
    }
}
