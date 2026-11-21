package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class gp0 extends ViewOutlineProvider {
    public final int f48152a;
    public final float f48153b;
    public final Object f48154c;

    public gp0(Object obj, float f10, int i7) {
        this.f48152a = i7;
        this.f48154c = obj;
        this.f48153b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f48152a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f48153b) * org.telegram.messenger.g0.L(10.0f) * ((Float) ((ValueAnimator) this.f48154c).getAnimatedValue()).floatValue());
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f48153b) * org.telegram.messenger.g0.L(10.0f) * (1.0f - ((PhotoViewer) this.f48154c).X));
                return;
        }
    }
}
