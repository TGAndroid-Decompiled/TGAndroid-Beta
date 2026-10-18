package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class mx implements ValueAnimator.AnimatorUpdateListener {
    public int f39242a;
    public final float f39243b;
    public final float f39244c;
    public final ey d;

    public mx(ey eyVar, float f7, boolean z10, float f10) {
        this.d = eyVar;
        this.f39243b = f7;
        this.f39244c = f10;
        this.f39242a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f39243b, this.f39244c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f39242a;
        this.f39242a = lerp;
        ey eyVar = this.d;
        eyVar.f36637e0[0].f36300a.scrollBy(0, i10);
        View view = eyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
