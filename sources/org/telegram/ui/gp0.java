package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class gp0 extends ViewOutlineProvider {
    public final int f48147a;
    public final float f48148b;
    public final Object f48149c;

    public gp0(Object obj, float f10, int i7) {
        this.f48147a = i7;
        this.f48149c = obj;
        this.f48148b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f48147a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f48148b) * org.telegram.messenger.g0.L(10.0f) * ((Float) ((ValueAnimator) this.f48149c).getAnimatedValue()).floatValue());
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f48148b) * org.telegram.messenger.g0.L(10.0f) * (1.0f - ((PhotoViewer) this.f48149c).X));
                return;
        }
    }
}
