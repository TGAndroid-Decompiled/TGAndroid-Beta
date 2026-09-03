package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ak0;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f22579a = 1;
    public final float f22580b;
    public final float f22581c;
    public final FrameLayout d;
    public final Object f22582e;
    public final Object f22583f;

    public b(HorizontalScrollView horizontalScrollView, float f10, float f11, ak0 ak0Var, ak0 ak0Var2) {
        this.d = horizontalScrollView;
        this.f22580b = f10;
        this.f22581c = f11;
        this.f22582e = ak0Var;
        this.f22583f = ak0Var2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22579a) {
            case 0:
                j jVar = (j) this.d;
                o1.e eVar = (o1.e) this.f22583f;
                FrameLayout frameLayout = jVar.G;
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f11 = this.f22580b;
                float f12 = this.f22581c;
                AndroidUtilities.lerp(f11, f12, floatValue);
                float min = Math.min((f10.floatValue() - ((Float) ((AtomicReference) this.f22582e).getAndSet(f10)).floatValue()) * 1000.0f * 8.0f, 250.0f);
                while (min > 0.0f) {
                    float min2 = Math.min(min, 18.0f);
                    float f13 = eVar.f16318a;
                    float f14 = eVar.f16319b;
                    float f15 = (((((-0.020170001f) * f14) + ((f13 - 1.0f) * (-3.8E-4f))) / 1.0f) * min2) + f14;
                    eVar.f16319b = f15;
                    eVar.f16318a = (f15 * min2) + f13;
                    min -= min2;
                }
                float lerp = AndroidUtilities.lerp(f11, f12, eVar.f16318a);
                jVar.Q = lerp;
                if (lerp > 0.8f && frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.H);
                }
                jVar.f22997r.setAlpha(1.0f - jVar.Q);
                jVar.f22998s.setAlpha((float) Math.pow(1.0f - jVar.Q, 2.0d));
                jVar.i();
                frameLayout.invalidate();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f16 = this.f22581c;
                float f17 = this.f22580b;
                ((HorizontalScrollView) this.d).setScrollX((int) e2.c.w(f16, f17, floatValue2, f17));
                ((ak0) this.f22582e).setOutlineProgress(1.0f - floatValue2);
                ((ak0) this.f22583f).setOutlineProgress(floatValue2);
                return;
        }
    }

    public b(j jVar, AtomicReference atomicReference, float f10, float f11, o1.e eVar) {
        this.d = jVar;
        this.f22582e = atomicReference;
        this.f22580b = f10;
        this.f22581c = f11;
        this.f22583f = eVar;
    }
}
