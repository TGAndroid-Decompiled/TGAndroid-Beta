package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class le1 extends FrameLayout {
    public ValueAnimator f35751a;
    public boolean f35752b;
    public float f35753c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10 = ((1.0f - this.f35753c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f10, f10, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f11 = this.f35753c;
            if (f11 != 1.0f) {
                this.f35753c = Utilities.clamp(f11 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z4) {
        ValueAnimator valueAnimator;
        super.setPressed(z4);
        if (this.f35752b != z4) {
            this.f35752b = z4;
            invalidate();
            if (z4 && (valueAnimator = this.f35751a) != null) {
                valueAnimator.removeAllListeners();
                this.f35751a.cancel();
            }
            if (!z4) {
                float f10 = this.f35753c;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f35751a = ofFloat;
                    ofFloat.addUpdateListener(new o11(this, 16));
                    this.f35751a.addListener(new ss0(this, 22));
                    this.f35751a.setInterpolator(new OvershootInterpolator(5.0f));
                    this.f35751a.setDuration(350L);
                    this.f35751a.start();
                }
            }
        }
    }
}
