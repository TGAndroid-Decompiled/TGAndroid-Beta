package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class fp0 extends ViewOutlineProvider {
    public final int f47941a;
    public final float f47942b;
    public final Object f47943c;

    public fp0(Object obj, float f10, int i7) {
        this.f47941a = i7;
        this.f47943c = obj;
        this.f47942b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f47941a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f47942b) * org.telegram.messenger.g0.L(10.0f) * ((Float) ((ValueAnimator) this.f47943c).getAnimatedValue()).floatValue());
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f47942b) * org.telegram.messenger.g0.L(10.0f) * (1.0f - ((PhotoViewer) this.f47943c).X));
                return;
        }
    }
}
