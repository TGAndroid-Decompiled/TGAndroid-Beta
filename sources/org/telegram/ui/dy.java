package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dy implements ValueAnimator.AnimatorUpdateListener {
    public int f33170a;
    public final float f33171b;
    public final float f33172c;
    public final uy d;

    public dy(uy uyVar, float f7, boolean z10, float f10) {
        this.d = uyVar;
        this.f33171b = f7;
        this.f33172c = f10;
        this.f33170a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f33171b, this.f33172c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f33170a;
        this.f33170a = lerp;
        uy uyVar = this.d;
        uyVar.f38256e0[0].f37904a.scrollBy(0, i10);
        View view = uyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
