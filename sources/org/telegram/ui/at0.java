package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class at0 extends ViewOutlineProvider {
    public final int f31882a;
    public final float f31883b;
    public final Object f31884c;

    public at0(Object obj, float f7, int i10) {
        this.f31882a = i10;
        this.f31884c = obj;
        this.f31883b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f31882a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f31883b) * ((Float) ((ValueAnimator) this.f31884c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f31883b) * (1.0f - ((PhotoViewer) this.f31884c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
