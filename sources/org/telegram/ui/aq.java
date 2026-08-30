package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class aq implements ValueAnimator.AnimatorUpdateListener {
    public final int f32688a;
    public final jq f32689b;

    public aq(jq jqVar, int i10) {
        this.f32688a = i10;
        this.f32689b = jqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32688a) {
            case 0:
                jq jqVar = this.f32689b;
                jqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                jqVar.h.invalidateSelf();
                return;
            default:
                jq jqVar2 = this.f32689b;
                jqVar2.getClass();
                jqVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = jqVar2.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
