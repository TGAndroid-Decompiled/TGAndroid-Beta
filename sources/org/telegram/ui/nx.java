package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class nx implements ValueAnimator.AnimatorUpdateListener {
    public int f40917a;
    public final float f40918b;
    public final float f40919c;
    public final fy d;

    public nx(fy fyVar, float f9, boolean z10, float f10) {
        this.d = fyVar;
        this.f40918b = f9;
        this.f40919c = f10;
        this.f40917a = (int) f9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f40918b, this.f40919c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f40917a;
        this.f40917a = lerp;
        fy fyVar = this.d;
        fyVar.f38256a0[0].f37921a.scrollBy(0, i10);
        View view = fyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
