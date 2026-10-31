package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class pq0 extends ViewOutlineProvider {
    public final int f40715a;
    public final float f40716b;
    public final Object f40717c;

    public pq0(Object obj, float f7, int i10) {
        this.f40715a = i10;
        this.f40717c = obj;
        this.f40716b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f40715a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f40716b) * ((Float) ((ValueAnimator) this.f40717c).getAnimatedValue()).floatValue() * org.telegram.messenger.i0.L(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f40716b) * (1.0f - ((PhotoViewer) this.f40717c).W) * org.telegram.messenger.i0.L(10.0f));
                return;
        }
    }
}
