package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dy implements ValueAnimator.AnimatorUpdateListener {
    public int f35911a;
    public final float f35912b;
    public final float f35913c;
    public final uy d;

    public dy(uy uyVar, float f7, boolean z10, float f10) {
        this.d = uyVar;
        this.f35912b = f7;
        this.f35913c = f10;
        this.f35911a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f35912b, this.f35913c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f35911a;
        this.f35911a = lerp;
        uy uyVar = this.d;
        uyVar.f41287e0[0].f40886a.scrollBy(0, i10);
        View view = uyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
