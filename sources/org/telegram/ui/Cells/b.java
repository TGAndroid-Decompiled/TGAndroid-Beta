package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qk0;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f23883a = 1;
    public final float f23884b;
    public final float f23885c;
    public final FrameLayout d;
    public final Object e;
    public final Object f23886f;

    public b(HorizontalScrollView horizontalScrollView, float f7, float f10, qk0 qk0Var, qk0 qk0Var2) {
        this.d = horizontalScrollView;
        this.f23884b = f7;
        this.f23885c = f10;
        this.e = qk0Var;
        this.f23886f = qk0Var2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23883a) {
            case 0:
                j jVar = (j) this.d;
                o1.e eVar = (o1.e) this.f23886f;
                FrameLayout frameLayout = jVar.J;
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = this.f23884b;
                float f11 = this.f23885c;
                AndroidUtilities.lerp(f10, f11, floatValue);
                float min = Math.min((f7.floatValue() - ((Float) ((AtomicReference) this.e).getAndSet(f7)).floatValue()) * 1000.0f * 8.0f, 250.0f);
                while (min > 0.0f) {
                    float min2 = Math.min(min, 18.0f);
                    float f12 = eVar.f18950a;
                    float f13 = eVar.f18951b;
                    float f14 = (((((-0.020170001f) * f13) + ((f12 - 1.0f) * (-3.8E-4f))) / 1.0f) * min2) + f13;
                    eVar.f18951b = f14;
                    eVar.f18950a = (f14 * min2) + f12;
                    min -= min2;
                }
                float lerp = AndroidUtilities.lerp(f10, f11, eVar.f18950a);
                jVar.V = lerp;
                if (lerp > 0.8f && frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                }
                jVar.f24270r.setAlpha(1.0f - jVar.V);
                jVar.f24271s.setAlpha((float) Math.pow(1.0f - jVar.V, 2.0d));
                jVar.i();
                frameLayout.invalidate();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = this.f23885c;
                float f16 = this.f23884b;
                ((HorizontalScrollView) this.d).setScrollX((int) c3.h0.z(f15, f16, floatValue2, f16));
                ((qk0) this.e).setOutlineProgress(1.0f - floatValue2);
                ((qk0) this.f23886f).setOutlineProgress(floatValue2);
                return;
        }
    }

    public b(j jVar, AtomicReference atomicReference, float f7, float f10, o1.e eVar) {
        this.d = jVar;
        this.e = atomicReference;
        this.f23884b = f7;
        this.f23885c = f10;
        this.f23886f = eVar;
    }
}
