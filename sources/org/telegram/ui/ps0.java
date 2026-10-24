package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ps0 extends ViewOutlineProvider {
    public final int f40627a;
    public final float f40628b;
    public final Object f40629c;

    public ps0(Object obj, float f7, int i10) {
        this.f40627a = i10;
        this.f40629c = obj;
        this.f40628b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f40627a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f40628b) * ((Float) ((ValueAnimator) this.f40629c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f40628b) * (1.0f - ((PhotoViewer) this.f40629c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
