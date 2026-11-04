package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
public final class j81 extends FrameLayout {
    public final int f46560a;
    public float f46561b;
    public boolean f46562c;
    public Object d;

    public j81(Context context, int i3) {
        super(context);
        this.f46560a = i3;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f46560a) {
            case 0:
                float f10 = ((1.0f - this.f46561b) * 0.2f) + 0.8f;
                canvas.save();
                canvas.scale(f10, f10, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
                super.dispatchDraw(canvas);
                canvas.restore();
                if (isPressed()) {
                    float f11 = this.f46561b;
                    if (f11 != 1.0f) {
                        this.f46561b = Utilities.i(f11 + 0.16f, 1.0f, 0.0f);
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                int i3 = 1;
                if (this.f46562c) {
                    float f12 = this.f46561b + 0.013333334f;
                    this.f46561b = f12;
                    if (f12 > 1.0f) {
                        this.f46562c = false;
                        this.f46561b = 1.0f;
                    }
                } else {
                    float f13 = this.f46561b - 0.013333334f;
                    this.f46561b = f13;
                    if (f13 < 0.0f) {
                        this.f46562c = true;
                        this.f46561b = 0.0f;
                    }
                }
                TextView textView = (TextView) this.d;
                float interpolation = org.telegram.ui.Components.xq.f40452f.getInterpolation(this.f46561b) * org.telegram.messenger.g0.L(8.0f);
                if (org.telegram.messenger.bd.f21784a0) {
                    i3 = -1;
                }
                textView.setTranslationX(interpolation * i3);
                invalidate();
                return;
        }
    }

    @Override
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        switch (this.f46560a) {
            case 0:
                super.setPressed(z10);
                if (this.f46562c != z10) {
                    this.f46562c = z10;
                    invalidate();
                    if (z10 && (valueAnimator = (ValueAnimator) this.d) != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) this.d).cancel();
                    }
                    if (!z10) {
                        float f10 = this.f46561b;
                        if (f10 != 0.0f) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                            this.d = ofFloat;
                            ofFloat.addUpdateListener(new xy0(this, 12));
                            ((ValueAnimator) this.d).addListener(new i81(this, 0));
                            org.telegram.messenger.camera.q.i(5.0f, (ValueAnimator) this.d);
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
