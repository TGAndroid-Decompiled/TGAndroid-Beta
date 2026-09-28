package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class qe1 extends FrameLayout {
    public ValueAnimator f36873a;
    public boolean f36874b;
    public float f36875c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7 = ((1.0f - this.f36875c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f10 = this.f36875c;
            if (f10 != 1.0f) {
                this.f36875c = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f36874b != z10) {
            this.f36874b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f36873a) != null) {
                valueAnimator.removeAllListeners();
                this.f36873a.cancel();
            }
            if (!z10) {
                float f7 = this.f36875c;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f36873a = ofFloat;
                    ofFloat.addUpdateListener(new q11(this, 16));
                    this.f36873a.addListener(new xo0(this, 24));
                    this.f36873a.setInterpolator(new OvershootInterpolator(5.0f));
                    this.f36873a.setDuration(350L);
                    this.f36873a.start();
                }
            }
        }
    }
}
