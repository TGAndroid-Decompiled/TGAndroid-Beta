package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ht0 extends ViewOutlineProvider {
    public final int f34282a;
    public final float f34283b;
    public final Object f34284c;

    public ht0(Object obj, float f7, int i10) {
        this.f34282a = i10;
        this.f34284c = obj;
        this.f34283b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f34282a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f34283b) * ((Float) ((ValueAnimator) this.f34284c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f34283b) * (1.0f - ((PhotoViewer) this.f34284c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
