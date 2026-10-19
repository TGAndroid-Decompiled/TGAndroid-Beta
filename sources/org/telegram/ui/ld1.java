package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class ld1 extends FrameLayout {
    public ValueAnimator f38892a;
    public boolean f38893b;
    public float f38894c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7 = ((1.0f - this.f38894c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f10 = this.f38894c;
            if (f10 != 1.0f) {
                this.f38894c = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f38893b != z10) {
            this.f38893b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f38892a) != null) {
                valueAnimator.removeAllListeners();
                this.f38892a.cancel();
            }
            if (!z10) {
                float f7 = this.f38894c;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f38892a = ofFloat;
                    ofFloat.addUpdateListener(new c11(this, 14));
                    this.f38892a.addListener(new zb0(this, 28));
                    org.telegram.messenger.kk.l(5.0f, this.f38892a);
                    this.f38892a.setDuration(350L);
                    this.f38892a.start();
                }
            }
        }
    }
}
