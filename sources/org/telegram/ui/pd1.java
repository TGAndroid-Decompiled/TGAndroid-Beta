package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class pd1 extends FrameLayout {
    public ValueAnimator f41493a;
    public boolean f41494b;
    public float f41495c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10 = ((1.0f - this.f41495c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f10, f10, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f11 = this.f41495c;
            if (f11 != 1.0f) {
                this.f41495c = Utilities.clamp(f11 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f41494b != z10) {
            this.f41494b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f41493a) != null) {
                valueAnimator.removeAllListeners();
                this.f41493a.cancel();
            }
            if (!z10) {
                float f10 = this.f41495c;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f41493a = ofFloat;
                    ofFloat.addUpdateListener(new v01(this, 16));
                    this.f41493a.addListener(new bc0(this, 29));
                    this.f41493a.setInterpolator(new OvershootInterpolator(5.0f));
                    this.f41493a.setDuration(350L);
                    this.f41493a.start();
                }
            }
        }
    }
}
