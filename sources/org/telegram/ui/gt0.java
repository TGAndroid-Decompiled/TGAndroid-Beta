package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class gt0 extends ViewOutlineProvider {
    public final int f36805a;
    public final float f36806b;
    public final Object f36807c;

    public gt0(Object obj, float f7, int i10) {
        this.f36805a = i10;
        this.f36807c = obj;
        this.f36806b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f36805a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f36806b) * ((Float) ((ValueAnimator) this.f36807c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f36806b) * (1.0f - ((PhotoViewer) this.f36807c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
