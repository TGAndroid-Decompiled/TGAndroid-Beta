package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class e61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24317a;
    public int f24318b;
    public final int f24319c;
    public final Object d;

    public e61(org.telegram.ui.iv ivVar, int i10, int i11) {
        this.f24317a = 1;
        this.d = ivVar;
        this.f24318b = i10;
        this.f24319c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24317a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f24319c);
                i61 i61Var = (i61) this.d;
                i61Var.N = true;
                i61Var.f25565n.scrollBy(0, floatValue - this.f24318b);
                i61Var.N = false;
                this.f24318b = floatValue;
                return;
            default:
                ((org.telegram.ui.iv) this.d).f36873c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f24318b, this.f24319c), PorterDuff.Mode.SRC_IN));
                return;
        }
    }

    public e61(i61 i61Var, int i10) {
        this.f24317a = 0;
        this.d = i61Var;
        this.f24319c = i10;
        this.f24318b = 0;
    }
}
