package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class de1 extends FrameLayout {
    public ValueAnimator f33614a;
    public boolean f33615b;
    public float f33616c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10 = ((1.0f - this.f33616c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f10, f10, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f11 = this.f33616c;
            if (f11 != 1.0f) {
                this.f33616c = Utilities.clamp(f11 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z4) {
        ValueAnimator valueAnimator;
        super.setPressed(z4);
        if (this.f33615b != z4) {
            this.f33615b = z4;
            invalidate();
            if (z4 && (valueAnimator = this.f33614a) != null) {
                valueAnimator.removeAllListeners();
                this.f33614a.cancel();
            }
            if (!z4) {
                float f10 = this.f33616c;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f33614a = ofFloat;
                    ofFloat.addUpdateListener(new h11(this, 16));
                    this.f33614a.addListener(new ls0(this, 22));
                    this.f33614a.setInterpolator(new OvershootInterpolator(5.0f));
                    this.f33614a.setDuration(350L);
                    this.f33614a.start();
                }
            }
        }
    }
}
