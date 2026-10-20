package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ok0;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f22025a = 1;
    public final float f22026b;
    public final float f22027c;
    public final FrameLayout d;
    public final Object e;
    public final Object f22028f;

    public b(HorizontalScrollView horizontalScrollView, float f7, float f10, ok0 ok0Var, ok0 ok0Var2) {
        this.d = horizontalScrollView;
        this.f22026b = f7;
        this.f22027c = f10;
        this.e = ok0Var;
        this.f22028f = ok0Var2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22025a) {
            case 0:
                j jVar = (j) this.d;
                o1.e eVar = (o1.e) this.f22028f;
                FrameLayout frameLayout = jVar.J;
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = this.f22026b;
                float f11 = this.f22027c;
                AndroidUtilities.lerp(f10, f11, floatValue);
                float min = Math.min((f7.floatValue() - ((Float) ((AtomicReference) this.e).getAndSet(f7)).floatValue()) * 1000.0f * 8.0f, 250.0f);
                while (min > 0.0f) {
                    float min2 = Math.min(min, 18.0f);
                    float f12 = eVar.f17539a;
                    float f13 = eVar.f17540b;
                    float f14 = (((((-0.020170001f) * f13) + ((f12 - 1.0f) * (-3.8E-4f))) / 1.0f) * min2) + f13;
                    eVar.f17540b = f14;
                    eVar.f17539a = (f14 * min2) + f12;
                    min -= min2;
                }
                float lerp = AndroidUtilities.lerp(f10, f11, eVar.f17539a);
                jVar.T = lerp;
                if (lerp > 0.8f && frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                }
                jVar.f22452r.setAlpha(1.0f - jVar.T);
                jVar.f22453s.setAlpha((float) Math.pow(1.0f - jVar.T, 2.0d));
                jVar.i();
                frameLayout.invalidate();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = this.f22027c;
                float f16 = this.f22026b;
                ((HorizontalScrollView) this.d).setScrollX((int) com.google.android.gms.internal.play_billing.k3.y(f15, f16, floatValue2, f16));
                ((ok0) this.e).setOutlineProgress(1.0f - floatValue2);
                ((ok0) this.f22028f).setOutlineProgress(floatValue2);
                return;
        }
    }

    public b(j jVar, AtomicReference atomicReference, float f7, float f10, o1.e eVar) {
        this.d = jVar;
        this.e = atomicReference;
        this.f22026b = f7;
        this.f22027c = f10;
        this.f22028f = eVar;
    }
}
