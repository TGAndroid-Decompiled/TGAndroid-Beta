package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class qd1 extends FrameLayout {
    public ValueAnimator f40793a;
    public boolean f40794b;
    public float f40795c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7 = ((1.0f - this.f40795c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f10 = this.f40795c;
            if (f10 != 1.0f) {
                this.f40795c = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f40794b != z10) {
            this.f40794b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f40793a) != null) {
                valueAnimator.removeAllListeners();
                this.f40793a.cancel();
            }
            if (!z10) {
                float f7 = this.f40795c;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f40793a = ofFloat;
                    ofFloat.addUpdateListener(new f11(this, 14));
                    this.f40793a.addListener(new v70(this, 29));
                    org.telegram.messenger.tl.l(5.0f, this.f40793a);
                    this.f40793a.setDuration(350L);
                    this.f40793a.start();
                }
            }
        }
    }
}
