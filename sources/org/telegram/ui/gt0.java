package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class gt0 extends ViewOutlineProvider {
    public final int f36804a;
    public final float f36805b;
    public final Object f36806c;

    public gt0(Object obj, float f7, int i10) {
        this.f36804a = i10;
        this.f36806c = obj;
        this.f36805b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f36804a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f36805b) * ((Float) ((ValueAnimator) this.f36806c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f36805b) * (1.0f - ((PhotoViewer) this.f36806c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
