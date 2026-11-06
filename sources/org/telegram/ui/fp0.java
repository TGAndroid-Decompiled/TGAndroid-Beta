package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class fp0 extends ViewOutlineProvider {
    public final int f45687a;
    public final float f45688b;
    public final Object f45689c;

    public fp0(Object obj, float f10, int i7) {
        this.f45687a = i7;
        this.f45689c = obj;
        this.f45688b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f45687a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f45688b) * org.telegram.messenger.g0.L(10.0f) * ((Float) ((ValueAnimator) this.f45689c).getAnimatedValue()).floatValue());
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f45688b) * org.telegram.messenger.g0.L(10.0f) * (1.0f - ((PhotoViewer) this.f45689c).W));
                return;
        }
    }
}
