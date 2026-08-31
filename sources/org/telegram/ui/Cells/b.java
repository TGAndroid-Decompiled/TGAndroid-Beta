package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bk0;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f22577a = 1;
    public final float f22578b;
    public final float f22579c;
    public final FrameLayout d;
    public final Object f22580e;
    public final Object f22581f;

    public b(HorizontalScrollView horizontalScrollView, float f10, float f11, bk0 bk0Var, bk0 bk0Var2) {
        this.d = horizontalScrollView;
        this.f22578b = f10;
        this.f22579c = f11;
        this.f22580e = bk0Var;
        this.f22581f = bk0Var2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22577a) {
            case 0:
                j jVar = (j) this.d;
                o1.e eVar = (o1.e) this.f22581f;
                FrameLayout frameLayout = jVar.G;
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f11 = this.f22578b;
                float f12 = this.f22579c;
                AndroidUtilities.lerp(f11, f12, floatValue);
                float min = Math.min((f10.floatValue() - ((Float) ((AtomicReference) this.f22580e).getAndSet(f10)).floatValue()) * 1000.0f * 8.0f, 250.0f);
                while (min > 0.0f) {
                    float min2 = Math.min(min, 18.0f);
                    float f13 = eVar.f16316a;
                    float f14 = eVar.f16317b;
                    float f15 = (((((-0.020170001f) * f14) + ((f13 - 1.0f) * (-3.8E-4f))) / 1.0f) * min2) + f14;
                    eVar.f16317b = f15;
                    eVar.f16316a = (f15 * min2) + f13;
                    min -= min2;
                }
                float lerp = AndroidUtilities.lerp(f11, f12, eVar.f16316a);
                jVar.Q = lerp;
                if (lerp > 0.8f && frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.H);
                }
                jVar.f22995r.setAlpha(1.0f - jVar.Q);
                jVar.f22996s.setAlpha((float) Math.pow(1.0f - jVar.Q, 2.0d));
                jVar.i();
                frameLayout.invalidate();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f16 = this.f22579c;
                float f17 = this.f22578b;
                ((HorizontalScrollView) this.d).setScrollX((int) e2.c.w(f16, f17, floatValue2, f17));
                ((bk0) this.f22580e).setOutlineProgress(1.0f - floatValue2);
                ((bk0) this.f22581f).setOutlineProgress(floatValue2);
                return;
        }
    }

    public b(j jVar, AtomicReference atomicReference, float f10, float f11, o1.e eVar) {
        this.d = jVar;
        this.f22580e = atomicReference;
        this.f22578b = f10;
        this.f22579c = f11;
        this.f22581f = eVar;
    }
}
