package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;

public final class qd1 extends FrameLayout {

    public ValueAnimator f41638a;

    public boolean f41639b;

    public float f41640c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10 = ((1.0f - this.f41640c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f10, f10, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f11 = this.f41640c;
            if (f11 != 1.0f) {
                this.f41640c = Utilities.clamp(f11 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f41639b != z10) {
            this.f41639b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f41638a) != null) {
                valueAnimator.removeAllListeners();
                this.f41638a.cancel();
            }
            if (z10) {
                return;
            }
            float f10 = this.f41640c;
            if (f10 != 0.0f) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.f41638a = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new w01(this, 16));
                this.f41638a.addListener(new zb1(this, 1));
                this.f41638a.setInterpolator(new OvershootInterpolator(5.0f));
                this.f41638a.setDuration(350L);
                this.f41638a.start();
            }
        }
    }
}
