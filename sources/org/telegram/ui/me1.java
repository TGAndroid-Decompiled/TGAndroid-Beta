package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class me1 extends FrameLayout {
    public ValueAnimator f38961a;
    public boolean f38962b;
    public float f38963c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10 = ((1.0f - this.f38963c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f10, f10, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f11 = this.f38963c;
            if (f11 != 1.0f) {
                this.f38963c = Utilities.clamp(f11 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z4) {
        ValueAnimator valueAnimator;
        super.setPressed(z4);
        if (this.f38962b != z4) {
            this.f38962b = z4;
            invalidate();
            if (z4 && (valueAnimator = this.f38961a) != null) {
                valueAnimator.removeAllListeners();
                this.f38961a.cancel();
            }
            if (!z4) {
                float f10 = this.f38963c;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f38961a = ofFloat;
                    ofFloat.addUpdateListener(new n11(this, 16));
                    this.f38961a.addListener(new ss0(this, 22));
                    this.f38961a.setInterpolator(new OvershootInterpolator(5.0f));
                    this.f38961a.setDuration(350L);
                    this.f38961a.start();
                }
            }
        }
    }
}
