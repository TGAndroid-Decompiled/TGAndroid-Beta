package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class gt0 extends ViewOutlineProvider {
    public final int f36777a;
    public final float f36778b;
    public final Object f36779c;

    public gt0(Object obj, float f7, int i10) {
        this.f36777a = i10;
        this.f36779c = obj;
        this.f36778b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f36777a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f36778b) * ((Float) ((ValueAnimator) this.f36779c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f36778b) * (1.0f - ((PhotoViewer) this.f36779c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
