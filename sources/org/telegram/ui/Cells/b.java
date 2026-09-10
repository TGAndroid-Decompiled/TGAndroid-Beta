package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ak0;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f18899a = 1;
    public final float f18900b;
    public final float f18901c;
    public final FrameLayout d;
    public final Object e;
    public final Object f18902f;

    public b(HorizontalScrollView horizontalScrollView, float f7, float f10, ak0 ak0Var, ak0 ak0Var2) {
        this.d = horizontalScrollView;
        this.f18900b = f7;
        this.f18901c = f10;
        this.e = ak0Var;
        this.f18902f = ak0Var2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18899a) {
            case 0:
                j jVar = (j) this.d;
                o1.e eVar = (o1.e) this.f18902f;
                FrameLayout frameLayout = jVar.J;
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = this.f18900b;
                float f11 = this.f18901c;
                AndroidUtilities.lerp(f10, f11, floatValue);
                float min = Math.min((f7.floatValue() - ((Float) ((AtomicReference) this.e).getAndSet(f7)).floatValue()) * 1000.0f * 8.0f, 250.0f);
                while (min > 0.0f) {
                    float min2 = Math.min(min, 18.0f);
                    float f12 = eVar.f14114a;
                    float f13 = eVar.f14115b;
                    float f14 = (((((-0.020170001f) * f13) + ((f12 - 1.0f) * (-3.8E-4f))) / 1.0f) * min2) + f13;
                    eVar.f14115b = f14;
                    eVar.f14114a = (f14 * min2) + f12;
                    min -= min2;
                }
                float lerp = AndroidUtilities.lerp(f10, f11, eVar.f14114a);
                jVar.T = lerp;
                if (lerp > 0.8f && frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                }
                jVar.f19330r.setAlpha(1.0f - jVar.T);
                jVar.f19331s.setAlpha((float) Math.pow(1.0f - jVar.T, 2.0d));
                jVar.i();
                frameLayout.invalidate();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = this.f18901c;
                float f16 = this.f18900b;
                ((HorizontalScrollView) this.d).setScrollX((int) com.google.android.gms.internal.vision.e2.z(f15, f16, floatValue2, f16));
                ((ak0) this.e).setOutlineProgress(1.0f - floatValue2);
                ((ak0) this.f18902f).setOutlineProgress(floatValue2);
                return;
        }
    }

    public b(j jVar, AtomicReference atomicReference, float f7, float f10, o1.e eVar) {
        this.d = jVar;
        this.e = atomicReference;
        this.f18900b = f7;
        this.f18901c = f10;
        this.f18902f = eVar;
    }
}
