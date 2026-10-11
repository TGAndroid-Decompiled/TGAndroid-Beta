package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wk0;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f21848a = 1;
    public final float f21849b;
    public final float f21850c;
    public final FrameLayout d;
    public final Object f21851e;
    public final Object f21852f;

    public b(HorizontalScrollView horizontalScrollView, float f7, float f10, wk0 wk0Var, wk0 wk0Var2) {
        this.d = horizontalScrollView;
        this.f21849b = f7;
        this.f21850c = f10;
        this.f21851e = wk0Var;
        this.f21852f = wk0Var2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21848a) {
            case 0:
                j jVar = (j) this.d;
                o1.e eVar = (o1.e) this.f21852f;
                FrameLayout frameLayout = jVar.J;
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = this.f21849b;
                float f11 = this.f21850c;
                AndroidUtilities.lerp(f10, f11, floatValue);
                float min = Math.min((f7.floatValue() - ((Float) ((AtomicReference) this.f21851e).getAndSet(f7)).floatValue()) * 1000.0f * 8.0f, 250.0f);
                while (min > 0.0f) {
                    float min2 = Math.min(min, 18.0f);
                    float f12 = eVar.f17003a;
                    float f13 = eVar.f17004b;
                    float f14 = (((((-0.020170001f) * f13) + ((f12 - 1.0f) * (-3.8E-4f))) / 1.0f) * min2) + f13;
                    eVar.f17004b = f14;
                    eVar.f17003a = (f14 * min2) + f12;
                    min -= min2;
                }
                float lerp = AndroidUtilities.lerp(f10, f11, eVar.f17003a);
                jVar.T = lerp;
                if (lerp > 0.8f && frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                }
                jVar.f22316r.setAlpha(1.0f - jVar.T);
                jVar.f22317s.setAlpha((float) Math.pow(1.0f - jVar.T, 2.0d));
                jVar.i();
                frameLayout.invalidate();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = this.f21850c;
                float f16 = this.f21849b;
                ((HorizontalScrollView) this.d).setScrollX((int) com.google.android.gms.internal.vision.e2.y(f15, f16, floatValue2, f16));
                ((wk0) this.f21851e).setOutlineProgress(1.0f - floatValue2);
                ((wk0) this.f21852f).setOutlineProgress(floatValue2);
                return;
        }
    }

    public b(j jVar, AtomicReference atomicReference, float f7, float f10, o1.e eVar) {
        this.d = jVar;
        this.f21851e = atomicReference;
        this.f21849b = f7;
        this.f21850c = f10;
        this.f21852f = eVar;
    }
}
