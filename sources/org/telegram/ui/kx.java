package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class kx implements ValueAnimator.AnimatorUpdateListener {
    public int f38673a;
    public final float f38674b;
    public final float f38675c;
    public final cy d;

    public kx(cy cyVar, float f7, boolean z10, float f10) {
        this.d = cyVar;
        this.f38674b = f7;
        this.f38675c = f10;
        this.f38673a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f38674b, this.f38675c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f38673a;
        this.f38673a = lerp;
        cy cyVar = this.d;
        cyVar.f36113e0[0].f35452a.scrollBy(0, i10);
        View view = cyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
