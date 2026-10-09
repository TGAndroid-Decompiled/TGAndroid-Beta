package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ht0 extends ViewOutlineProvider {
    public final int f38399a;
    public final float f38400b;
    public final Object f38401c;

    public ht0(Object obj, float f7, int i10) {
        this.f38399a = i10;
        this.f38401c = obj;
        this.f38400b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f38399a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f38400b) * ((Float) ((ValueAnimator) this.f38401c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f38400b) * (1.0f - ((PhotoViewer) this.f38401c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
