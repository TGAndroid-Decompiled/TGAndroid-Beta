package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class jt0 extends ViewOutlineProvider {
    public final int f39282a;
    public final float f39283b;
    public final Object f39284c;

    public jt0(Object obj, float f7, int i10) {
        this.f39282a = i10;
        this.f39284c = obj;
        this.f39283b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f39282a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f39283b) * ((Float) ((ValueAnimator) this.f39284c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f39283b) * (1.0f - ((PhotoViewer) this.f39284c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
