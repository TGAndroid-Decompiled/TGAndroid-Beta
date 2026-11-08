package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class fp0 extends ViewOutlineProvider {
    public final int f45664a;
    public final float f45665b;
    public final Object f45666c;

    public fp0(Object obj, float f10, int i7) {
        this.f45664a = i7;
        this.f45666c = obj;
        this.f45665b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f45664a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f45665b) * org.telegram.messenger.g0.L(10.0f) * ((Float) ((ValueAnimator) this.f45666c).getAnimatedValue()).floatValue());
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f45665b) * org.telegram.messenger.g0.L(10.0f) * (1.0f - ((PhotoViewer) this.f45666c).W));
                return;
        }
    }
}
