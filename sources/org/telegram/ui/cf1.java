package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class cf1 extends FrameLayout {
    public ValueAnimator f31657a;
    public boolean f31658b;
    public float f31659c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7 = ((1.0f - this.f31659c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f10 = this.f31659c;
            if (f10 != 1.0f) {
                this.f31659c = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f31658b != z10) {
            this.f31658b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f31657a) != null) {
                valueAnimator.removeAllListeners();
                this.f31657a.cancel();
            }
            if (!z10) {
                float f7 = this.f31659c;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f31657a = ofFloat;
                    ofFloat.addUpdateListener(new f21(this, 16));
                    this.f31657a.addListener(new mv0(this, 13));
                    this.f31657a.setInterpolator(new OvershootInterpolator(5.0f));
                    this.f31657a.setDuration(350L);
                    this.f31657a.start();
                }
            }
        }
    }
}
