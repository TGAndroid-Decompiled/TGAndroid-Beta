package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class cy implements ValueAnimator.AnimatorUpdateListener {
    public int f36749a;
    public final float f36750b;
    public final float f36751c;
    public final ty d;

    public cy(ty tyVar, float f7, boolean z10, float f10) {
        this.d = tyVar;
        this.f36750b = f7;
        this.f36751c = f10;
        this.f36749a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f36750b, this.f36751c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f36749a;
        this.f36749a = lerp;
        ty tyVar = this.d;
        tyVar.f42174e0[0].f41790a.scrollBy(0, i10);
        View view = tyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
