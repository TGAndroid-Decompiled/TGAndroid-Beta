package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ht0 extends ViewOutlineProvider {
    public final int f38397a;
    public final float f38398b;
    public final Object f38399c;

    public ht0(Object obj, float f7, int i10) {
        this.f38397a = i10;
        this.f38399c = obj;
        this.f38398b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f38397a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f38398b) * ((Float) ((ValueAnimator) this.f38399c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f38398b) * (1.0f - ((PhotoViewer) this.f38399c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
