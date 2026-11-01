package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class nq0 extends ViewOutlineProvider {
    public final int f39957a;
    public final float f39958b;
    public final Object f39959c;

    public nq0(Object obj, float f7, int i10) {
        this.f39957a = i10;
        this.f39959c = obj;
        this.f39958b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f39957a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f39958b) * ((Float) ((ValueAnimator) this.f39959c).getAnimatedValue()).floatValue() * org.telegram.messenger.i0.L(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f39958b) * (1.0f - ((PhotoViewer) this.f39959c).W) * org.telegram.messenger.i0.L(10.0f));
                return;
        }
    }
}
