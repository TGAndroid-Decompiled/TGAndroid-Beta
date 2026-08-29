package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ds0 extends ViewOutlineProvider {
    public final int f37626a;
    public final float f37627b;
    public final Object f37628c;

    public ds0(Object obj, float f9, int i10) {
        this.f37626a = i10;
        this.f37628c = obj;
        this.f37627b = f9;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f37626a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f37627b) * ((Float) ((ValueAnimator) this.f37628c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f37627b) * (1.0f - ((PhotoViewer) this.f37628c).S) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
