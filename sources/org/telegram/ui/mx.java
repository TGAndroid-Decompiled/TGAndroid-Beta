package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class mx implements ValueAnimator.AnimatorUpdateListener {
    public int f39257a;
    public final float f39258b;
    public final float f39259c;
    public final ey d;

    public mx(ey eyVar, float f7, boolean z10, float f10) {
        this.d = eyVar;
        this.f39258b = f7;
        this.f39259c = f10;
        this.f39257a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f39258b, this.f39259c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f39257a;
        this.f39257a = lerp;
        ey eyVar = this.d;
        eyVar.f36630e0[0].f36333a.scrollBy(0, i10);
        View view = eyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
