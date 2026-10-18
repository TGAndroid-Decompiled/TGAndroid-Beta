package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class nd1 extends FrameLayout {
    public ValueAnimator f39412a;
    public boolean f39413b;
    public float f39414c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7 = ((1.0f - this.f39414c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f10 = this.f39414c;
            if (f10 != 1.0f) {
                this.f39414c = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f39413b != z10) {
            this.f39413b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f39412a) != null) {
                valueAnimator.removeAllListeners();
                this.f39412a.cancel();
            }
            if (!z10) {
                float f7 = this.f39414c;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f39412a = ofFloat;
                    ofFloat.addUpdateListener(new e11(this, 14));
                    this.f39412a.addListener(new bc0(this, 28));
                    org.telegram.messenger.lk.l(5.0f, this.f39412a);
                    this.f39412a.setDuration(350L);
                    this.f39412a.start();
                }
            }
        }
    }
}
