package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class hp0 extends ViewOutlineProvider {
    public final int f48474a;
    public final float f48475b;
    public final Object f48476c;

    public hp0(Object obj, float f10, int i7) {
        this.f48474a = i7;
        this.f48476c = obj;
        this.f48475b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f48474a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f48475b) * org.telegram.messenger.g0.L(10.0f) * ((Float) ((ValueAnimator) this.f48476c).getAnimatedValue()).floatValue());
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f48475b) * org.telegram.messenger.g0.L(10.0f) * (1.0f - ((PhotoViewer) this.f48476c).X));
                return;
        }
    }
}
