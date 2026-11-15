package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class dp0 extends ViewOutlineProvider {
    public final int f46447a;
    public final float f46448b;
    public final Object f46449c;

    public dp0(Object obj, float f10, int i7) {
        this.f46447a = i7;
        this.f46449c = obj;
        this.f46448b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f46447a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f46448b) * org.telegram.messenger.g0.L(10.0f) * ((Float) ((ValueAnimator) this.f46449c).getAnimatedValue()).floatValue());
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f46448b) * org.telegram.messenger.g0.L(10.0f) * (1.0f - ((PhotoViewer) this.f46449c).X));
                return;
        }
    }
}
