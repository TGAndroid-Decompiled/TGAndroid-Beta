package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class nt0 extends ViewOutlineProvider {
    public final int f38472a;
    public final float f38473b;
    public final Object f38474c;

    public nt0(Object obj, float f7, int i10) {
        this.f38472a = i10;
        this.f38474c = obj;
        this.f38473b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f38472a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f38473b) * ((Float) ((ValueAnimator) this.f38474c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f38473b) * (1.0f - ((PhotoViewer) this.f38474c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
