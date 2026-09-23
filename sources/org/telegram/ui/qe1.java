package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class qe1 extends FrameLayout {
    public ValueAnimator f36410a;
    public boolean f36411b;
    public float f36412c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7 = ((1.0f - this.f36412c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f10 = this.f36412c;
            if (f10 != 1.0f) {
                this.f36412c = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f36411b != z10) {
            this.f36411b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f36410a) != null) {
                valueAnimator.removeAllListeners();
                this.f36410a.cancel();
            }
            if (!z10) {
                float f7 = this.f36412c;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f36410a = ofFloat;
                    ofFloat.addUpdateListener(new s11(this, 16));
                    this.f36410a.addListener(new wq0(this, 23));
                    this.f36410a.setInterpolator(new OvershootInterpolator(5.0f));
                    this.f36410a.setDuration(350L);
                    this.f36410a.start();
                }
            }
        }
    }
}
