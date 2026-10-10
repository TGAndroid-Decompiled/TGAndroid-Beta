package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class cy implements ValueAnimator.AnimatorUpdateListener {
    public int f36793a;
    public final float f36794b;
    public final float f36795c;
    public final ty d;

    public cy(ty tyVar, float f7, boolean z10, float f10) {
        this.d = tyVar;
        this.f36794b = f7;
        this.f36795c = f10;
        this.f36793a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f36794b, this.f36795c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f36793a;
        this.f36793a = lerp;
        ty tyVar = this.d;
        tyVar.f42218e0[0].f41834a.scrollBy(0, i10);
        View view = tyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
