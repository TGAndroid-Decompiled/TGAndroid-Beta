package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class ip0 extends ViewOutlineProvider {
    public final int f46714a;
    public final float f46715b;
    public final Object f46716c;

    public ip0(Object obj, float f10, int i7) {
        this.f46714a = i7;
        this.f46716c = obj;
        this.f46715b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f46714a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f46715b) * org.telegram.messenger.g0.L(10.0f) * ((Float) ((ValueAnimator) this.f46716c).getAnimatedValue()).floatValue());
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f46715b) * org.telegram.messenger.g0.L(10.0f) * (1.0f - ((PhotoViewer) this.f46716c).W));
                return;
        }
    }
}
