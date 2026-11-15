package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class dp0 extends ViewOutlineProvider {
    public final int f46437a;
    public final float f46438b;
    public final Object f46439c;

    public dp0(Object obj, float f10, int i7) {
        this.f46437a = i7;
        this.f46439c = obj;
        this.f46438b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f46437a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f46438b) * org.telegram.messenger.g0.L(10.0f) * ((Float) ((ValueAnimator) this.f46439c).getAnimatedValue()).floatValue());
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f46438b) * org.telegram.messenger.g0.L(10.0f) * (1.0f - ((PhotoViewer) this.f46439c).X));
                return;
        }
    }
}
