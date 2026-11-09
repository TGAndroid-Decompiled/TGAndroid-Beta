package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class hp0 extends ViewOutlineProvider {
    public final int f46367a;
    public final float f46368b;
    public final Object f46369c;

    public hp0(Object obj, float f10, int i7) {
        this.f46367a = i7;
        this.f46369c = obj;
        this.f46368b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f46367a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f46368b) * org.telegram.messenger.g0.L(10.0f) * ((Float) ((ValueAnimator) this.f46369c).getAnimatedValue()).floatValue());
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f46368b) * org.telegram.messenger.g0.L(10.0f) * (1.0f - ((PhotoViewer) this.f46369c).W));
                return;
        }
    }
}
