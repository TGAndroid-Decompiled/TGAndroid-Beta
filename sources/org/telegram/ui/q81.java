package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
public final class q81 extends FrameLayout {
    public final int f50494a;
    public float f50495b;
    public boolean f50496c;
    public Object d;

    public q81(Context context, int i7) {
        super(context);
        this.f50494a = i7;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f50494a) {
            case 0:
                float f10 = ((1.0f - this.f50495b) * 0.2f) + 0.8f;
                canvas.save();
                canvas.scale(f10, f10, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
                super.dispatchDraw(canvas);
                canvas.restore();
                if (isPressed()) {
                    float f11 = this.f50495b;
                    if (f11 != 1.0f) {
                        this.f50495b = Utilities.i(f11 + 0.16f, 1.0f, 0.0f);
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                int i7 = 1;
                if (this.f50496c) {
                    float f12 = this.f50495b + 0.013333334f;
                    this.f50495b = f12;
                    if (f12 > 1.0f) {
                        this.f50496c = false;
                        this.f50495b = 1.0f;
                    }
                } else {
                    float f13 = this.f50495b - 0.013333334f;
                    this.f50495b = f13;
                    if (f13 < 0.0f) {
                        this.f50496c = true;
                        this.f50495b = 0.0f;
                    }
                }
                TextView textView = (TextView) this.d;
                float interpolation = org.telegram.ui.Components.er.f34419f.getInterpolation(this.f50495b) * org.telegram.messenger.g0.L(8.0f);
                if (org.telegram.messenger.hd.f24104a0) {
                    i7 = -1;
                }
                textView.setTranslationX(interpolation * i7);
                invalidate();
                return;
        }
    }

    @Override
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        switch (this.f50494a) {
            case 0:
                super.setPressed(z10);
                if (this.f50496c != z10) {
                    this.f50496c = z10;
                    invalidate();
                    if (z10 && (valueAnimator = (ValueAnimator) this.d) != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) this.d).cancel();
                    }
                    if (!z10) {
                        float f10 = this.f50495b;
                        if (f10 != 0.0f) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                            this.d = ofFloat;
                            ofFloat.addUpdateListener(new ez0(this, 12));
                            ((ValueAnimator) this.d).addListener(new g71(this, 1));
                            org.telegram.messenger.i20.k(5.0f, (ValueAnimator) this.d);
                            ((ValueAnimator) this.d).setDuration(350L);
                            ((ValueAnimator) this.d).start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                super.setPressed(z10);
                return;
        }
    }
}
