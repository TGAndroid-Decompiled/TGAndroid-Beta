package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ot0 extends ViewOutlineProvider {
    public final int f39036a;
    public final float f39037b;
    public final Object f39038c;

    public ot0(Object obj, float f7, int i10) {
        this.f39036a = i10;
        this.f39038c = obj;
        this.f39037b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f39036a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f39037b) * ((Float) ((ValueAnimator) this.f39038c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f39037b) * (1.0f - ((PhotoViewer) this.f39038c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
