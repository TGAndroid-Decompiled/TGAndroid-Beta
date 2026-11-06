package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class ep0 extends ViewOutlineProvider {
    public final int f45364a;
    public final float f45365b;
    public final Object f45366c;

    public ep0(Object obj, float f10, int i7) {
        this.f45364a = i7;
        this.f45366c = obj;
        this.f45365b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f45364a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f45365b) * org.telegram.messenger.g0.L(10.0f) * ((Float) ((ValueAnimator) this.f45366c).getAnimatedValue()).floatValue());
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f45365b) * org.telegram.messenger.g0.L(10.0f) * (1.0f - ((PhotoViewer) this.f45366c).W));
                return;
        }
    }
}
