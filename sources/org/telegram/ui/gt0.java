package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class gt0 extends ViewOutlineProvider {
    public final int f33177a;
    public final float f33178b;
    public final Object f33179c;

    public gt0(Object obj, float f7, int i10) {
        this.f33177a = i10;
        this.f33179c = obj;
        this.f33178b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f33177a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f33178b) * ((Float) ((ValueAnimator) this.f33179c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f33178b) * (1.0f - ((PhotoViewer) this.f33179c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
