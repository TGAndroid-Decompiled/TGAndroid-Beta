package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.sh0;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f28904a = 1;
    public final float f28905b;
    public final float f28906c;
    public final FrameLayout d;
    public final Object f28907e;
    public final Object f28908f;

    public b(HorizontalScrollView horizontalScrollView, float f10, float f11, sh0 sh0Var, sh0 sh0Var2) {
        this.d = horizontalScrollView;
        this.f28905b = f10;
        this.f28906c = f11;
        this.f28907e = sh0Var;
        this.f28908f = sh0Var2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f28904a;
        Object obj = this.f28908f;
        Object obj2 = this.f28907e;
        float f10 = this.f28906c;
        float f11 = this.f28905b;
        FrameLayout frameLayout = this.d;
        switch (i7) {
            case 0:
                j jVar = (j) frameLayout;
                i iVar = (i) obj;
                FrameLayout frameLayout2 = jVar.J;
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                ((Float) valueAnimator.getAnimatedValue()).getClass();
                Typeface typeface = org.telegram.messenger.g0.f22516a;
                float min = Math.min((f12.floatValue() - ((Float) ((AtomicReference) obj2).getAndSet(f12)).floatValue()) * 1000.0f * 8.0f, 250.0f);
                while (min > 0.0f) {
                    float min2 = Math.min(min, 18.0f);
                    float f13 = iVar.f29295a;
                    float f14 = iVar.f29296b;
                    float f15 = (((((-0.020170001f) * f14) + ((f13 - 1.0f) * (-3.8E-4f))) / 1.0f) * min2) + f14;
                    iVar.f29296b = f15;
                    iVar.f29295a = (f15 * min2) + f13;
                    min -= min2;
                }
                float T1 = org.telegram.messenger.g0.T1(f11, f10, iVar.f29295a);
                jVar.V = T1;
                if (T1 > 0.8f && frameLayout2.getBackground() == null) {
                    frameLayout2.setBackground(jVar.K);
                }
                jVar.f29338r.setAlpha(1.0f - jVar.V);
                jVar.f29339s.setAlpha((float) Math.pow(1.0f - jVar.V, 2.0d));
                jVar.i();
                frameLayout2.invalidate();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((HorizontalScrollView) frameLayout).setScrollX((int) com.google.android.recaptcha.internal.a.z(f10, f11, floatValue, f11));
                ((sh0) obj2).setOutlineProgress(1.0f - floatValue);
                ((sh0) obj).setOutlineProgress(floatValue);
                return;
        }
    }

    public b(j jVar, AtomicReference atomicReference, float f10, float f11, i iVar) {
        this.d = jVar;
        this.f28907e = atomicReference;
        this.f28905b = f10;
        this.f28906c = f11;
        this.f28908f = iVar;
    }
}
