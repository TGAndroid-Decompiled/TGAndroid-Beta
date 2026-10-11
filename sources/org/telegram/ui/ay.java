package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ay implements ValueAnimator.AnimatorUpdateListener {
    public int f36200a;
    public final float f36201b;
    public final float f36202c;
    public final sy d;

    public ay(sy syVar, float f7, boolean z10, float f10) {
        this.d = syVar;
        this.f36201b = f7;
        this.f36202c = f10;
        this.f36200a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f36201b, this.f36202c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f36200a;
        this.f36200a = lerp;
        sy syVar = this.d;
        syVar.f41907e0[0].f41530a.scrollBy(0, i10);
        View view = syVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
