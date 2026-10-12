package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ey implements ValueAnimator.AnimatorUpdateListener {
    public int f37566a;
    public final float f37567b;
    public final float f37568c;
    public final vy d;

    public ey(vy vyVar, float f7, boolean z10, float f10) {
        this.d = vyVar;
        this.f37567b = f7;
        this.f37568c = f10;
        this.f37566a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f37567b, this.f37568c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f37566a;
        this.f37566a = lerp;
        vy vyVar = this.d;
        vyVar.f42905e0[0].f42613a.scrollBy(0, i10);
        View view = vyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
