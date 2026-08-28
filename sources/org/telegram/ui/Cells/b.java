package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fj0;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f24113a = 1;
    public final float f24114b;
    public final float f24115c;
    public final FrameLayout d;
    public final Object f24116e;
    public final Object f24117f;

    public b(HorizontalScrollView horizontalScrollView, float f10, float f11, fj0 fj0Var, fj0 fj0Var2) {
        this.d = horizontalScrollView;
        this.f24114b = f10;
        this.f24115c = f11;
        this.f24116e = fj0Var;
        this.f24117f = fj0Var2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24113a) {
            case 0:
                j jVar = (j) this.d;
                o1.e eVar = (o1.e) this.f24117f;
                FrameLayout frameLayout = jVar.F;
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f11 = this.f24114b;
                float f12 = this.f24115c;
                AndroidUtilities.lerp(f11, f12, floatValue);
                float min = Math.min((f10.floatValue() - ((Float) ((AtomicReference) this.f24116e).getAndSet(f10)).floatValue()) * 1000.0f * 8.0f, 250.0f);
                while (min > 0.0f) {
                    float min2 = Math.min(min, 18.0f);
                    float f13 = eVar.f18780a;
                    float f14 = eVar.f18781b;
                    float f15 = (((((-0.020170001f) * f14) + ((f13 - 1.0f) * (-3.8E-4f))) / 1.0f) * min2) + f14;
                    eVar.f18781b = f15;
                    eVar.f18780a = (f15 * min2) + f13;
                    min -= min2;
                }
                float lerp = AndroidUtilities.lerp(f11, f12, eVar.f18780a);
                jVar.P = lerp;
                if (lerp > 0.8f && frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.G);
                }
                jVar.f24535r.setAlpha(1.0f - jVar.P);
                jVar.f24536s.setAlpha((float) Math.pow(1.0f - jVar.P, 2.0d));
                jVar.i();
                frameLayout.invalidate();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f16 = this.f24115c;
                float f17 = this.f24114b;
                ((HorizontalScrollView) this.d).setScrollX((int) e2.c.z(f16, f17, floatValue2, f17));
                ((fj0) this.f24116e).setOutlineProgress(1.0f - floatValue2);
                ((fj0) this.f24117f).setOutlineProgress(floatValue2);
                return;
        }
    }

    public b(j jVar, AtomicReference atomicReference, float f10, float f11, o1.e eVar) {
        this.d = jVar;
        this.f24116e = atomicReference;
        this.f24114b = f10;
        this.f24115c = f11;
        this.f24117f = eVar;
    }
}
