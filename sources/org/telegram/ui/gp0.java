package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class gp0 extends ViewOutlineProvider {
    public final int f48075a;
    public final float f48076b;
    public final Object f48077c;

    public gp0(Object obj, float f10, int i7) {
        this.f48075a = i7;
        this.f48077c = obj;
        this.f48076b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f48075a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f48076b) * org.telegram.messenger.g0.L(10.0f) * ((Float) ((ValueAnimator) this.f48077c).getAnimatedValue()).floatValue());
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f48076b) * org.telegram.messenger.g0.L(10.0f) * (1.0f - ((PhotoViewer) this.f48077c).X));
                return;
        }
    }
}
