package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ps0 extends ViewOutlineProvider {
    public final int f40234a;
    public final float f40235b;
    public final Object f40236c;

    public ps0(Object obj, float f7, int i10) {
        this.f40234a = i10;
        this.f40236c = obj;
        this.f40235b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f40234a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f40235b) * ((Float) ((ValueAnimator) this.f40236c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f40235b) * (1.0f - ((PhotoViewer) this.f40236c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
