package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ns0 extends ViewOutlineProvider {
    public final int f39686a;
    public final float f39687b;
    public final Object f39688c;

    public ns0(Object obj, float f7, int i10) {
        this.f39686a = i10;
        this.f39688c = obj;
        this.f39687b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f39686a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f39687b) * ((Float) ((ValueAnimator) this.f39688c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f39687b) * (1.0f - ((PhotoViewer) this.f39688c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
