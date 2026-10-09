package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class cy implements ValueAnimator.AnimatorUpdateListener {
    public int f36747a;
    public final float f36748b;
    public final float f36749c;
    public final ty d;

    public cy(ty tyVar, float f7, boolean z10, float f10) {
        this.d = tyVar;
        this.f36748b = f7;
        this.f36749c = f10;
        this.f36747a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f36748b, this.f36749c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f36747a;
        this.f36747a = lerp;
        ty tyVar = this.d;
        tyVar.f42172e0[0].f41788a.scrollBy(0, i10);
        View view = tyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
