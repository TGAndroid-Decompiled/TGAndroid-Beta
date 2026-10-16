package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class ef1 extends FrameLayout {
    public ValueAnimator f35287a;
    public boolean f35288b;
    public float f35289c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7 = ((1.0f - this.f35289c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f10 = this.f35289c;
            if (f10 != 1.0f) {
                this.f35289c = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f35288b != z10) {
            this.f35288b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f35287a) != null) {
                valueAnimator.removeAllListeners();
                this.f35287a.cancel();
            }
            if (!z10) {
                float f7 = this.f35289c;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f35287a = ofFloat;
                    ofFloat.addUpdateListener(new f21(this, 16));
                    this.f35287a.addListener(new kj0(this, 27));
                    org.telegram.messenger.sk.l(5.0f, this.f35287a);
                    this.f35287a.setDuration(350L);
                    this.f35287a.start();
                }
            }
        }
    }
}
