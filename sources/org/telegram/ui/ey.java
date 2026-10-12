package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ey implements ValueAnimator.AnimatorUpdateListener {
    public int f37562a;
    public final float f37563b;
    public final float f37564c;
    public final vy d;

    public ey(vy vyVar, float f7, boolean z10, float f10) {
        this.d = vyVar;
        this.f37563b = f7;
        this.f37564c = f10;
        this.f37562a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f37563b, this.f37564c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f37562a;
        this.f37562a = lerp;
        vy vyVar = this.d;
        vyVar.f42903e0[0].f42611a.scrollBy(0, i10);
        View view = vyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
