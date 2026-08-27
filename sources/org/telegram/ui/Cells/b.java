package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hj0;

public final class b implements ValueAnimator.AnimatorUpdateListener {

    public final int f24083a = 1;

    public final float f24084b;

    public final float f24085c;
    public final FrameLayout d;

    public final Object f24086e;

    public final Object f24087f;

    public b(HorizontalScrollView horizontalScrollView, float f10, float f11, hj0 hj0Var, hj0 hj0Var2) {
        this.d = horizontalScrollView;
        this.f24084b = f10;
        this.f24085c = f11;
        this.f24086e = hj0Var;
        this.f24087f = hj0Var2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24083a) {
            case 0:
                j jVar = (j) this.d;
                AtomicReference atomicReference = (AtomicReference) this.f24086e;
                o1.e eVar = (o1.e) this.f24087f;
                FrameLayout frameLayout = jVar.F;
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                float fFloatValue = (f10.floatValue() - ((Float) atomicReference.getAndSet(f10)).floatValue()) * 1000.0f * 8.0f;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f11 = this.f24084b;
                float f12 = this.f24085c;
                AndroidUtilities.lerp(f11, f12, fFloatValue2);
                float fMin = Math.min(fFloatValue, 250.0f);
                while (fMin > 0.0f) {
                    float fMin2 = Math.min(fMin, 18.0f);
                    float f13 = eVar.f19127a;
                    float f14 = eVar.f19128b;
                    float f15 = (((((-0.020170001f) * f14) + ((f13 - 1.0f) * (-3.8E-4f))) / 1.0f) * fMin2) + f14;
                    eVar.f19128b = f15;
                    eVar.f19127a = (f15 * fMin2) + f13;
                    fMin -= fMin2;
                }
                float fLerp = AndroidUtilities.lerp(f11, f12, eVar.f19127a);
                jVar.P = fLerp;
                if (fLerp > 0.8f && frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.G);
                }
                jVar.f24510r.setAlpha(1.0f - jVar.P);
                jVar.f24511s.setAlpha((float) Math.pow(1.0f - jVar.P, 2.0d));
                jVar.i();
                frameLayout.invalidate();
                break;
            default:
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.d;
                hj0 hj0Var = (hj0) this.f24086e;
                hj0 hj0Var2 = (hj0) this.f24087f;
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f16 = this.f24085c;
                float f17 = this.f24084b;
                horizontalScrollView.setScrollX((int) com.google.android.recaptcha.internal.a.z(f16, f17, fFloatValue3, f17));
                hj0Var.setOutlineProgress(1.0f - fFloatValue3);
                hj0Var2.setOutlineProgress(fFloatValue3);
                break;
        }
    }

    public b(j jVar, AtomicReference atomicReference, float f10, float f11, o1.e eVar) {
        this.d = jVar;
        this.f24086e = atomicReference;
        this.f24084b = f10;
        this.f24085c = f11;
        this.f24087f = eVar;
    }
}
