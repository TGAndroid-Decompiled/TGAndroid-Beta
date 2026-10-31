package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
public final class ja1 extends FrameLayout {
    public final int f38480a;
    public float f38481b;
    public boolean f38482c;
    public Object d;

    public ja1(Context context, int i10) {
        super(context);
        this.f38480a = i10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f38480a) {
            case 0:
                float f7 = ((1.0f - this.f38481b) * 0.2f) + 0.8f;
                canvas.save();
                canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
                super.dispatchDraw(canvas);
                canvas.restore();
                if (isPressed()) {
                    float f10 = this.f38481b;
                    if (f10 != 1.0f) {
                        this.f38481b = Utilities.i(f10 + 0.16f, 1.0f, 0.0f);
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                int i10 = 1;
                if (this.f38482c) {
                    float f11 = this.f38481b + 0.013333334f;
                    this.f38481b = f11;
                    if (f11 > 1.0f) {
                        this.f38482c = false;
                        this.f38481b = 1.0f;
                    }
                } else {
                    float f12 = this.f38481b - 0.013333334f;
                    this.f38481b = f12;
                    if (f12 < 0.0f) {
                        this.f38482c = true;
                        this.f38481b = 0.0f;
                    }
                }
                TextView textView = (TextView) this.d;
                float interpolation = org.telegram.ui.Components.gr.f26495f.getInterpolation(this.f38481b) * org.telegram.messenger.i0.L(8.0f);
                if (org.telegram.messenger.cd.X) {
                    i10 = -1;
                }
                textView.setTranslationX(interpolation * i10);
                invalidate();
                return;
        }
    }

    @Override
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        switch (this.f38480a) {
            case 0:
                super.setPressed(z10);
                if (this.f38482c != z10) {
                    this.f38482c = z10;
                    invalidate();
                    if (z10 && (valueAnimator = (ValueAnimator) this.d) != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) this.d).cancel();
                    }
                    if (!z10) {
                        float f7 = this.f38481b;
                        if (f7 != 0.0f) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                            this.d = ofFloat;
                            ofFloat.addUpdateListener(new u01(this, 12));
                            ((ValueAnimator) this.d).addListener(new ns0(this, 11));
                            org.telegram.messenger.z20.j(5.0f, (ValueAnimator) this.d);
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
