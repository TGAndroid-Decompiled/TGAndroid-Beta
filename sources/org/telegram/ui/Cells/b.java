package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.fi0;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f30407a = 1;
    public final float f30408b;
    public final float f30409c;
    public final FrameLayout d;
    public final Object f30410e;
    public final Object f30411f;

    public b(HorizontalScrollView horizontalScrollView, float f10, float f11, fi0 fi0Var, fi0 fi0Var2) {
        this.d = horizontalScrollView;
        this.f30408b = f10;
        this.f30409c = f11;
        this.f30410e = fi0Var;
        this.f30411f = fi0Var2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f30407a;
        Object obj = this.f30411f;
        Object obj2 = this.f30410e;
        float f10 = this.f30409c;
        float f11 = this.f30408b;
        FrameLayout frameLayout = this.d;
        switch (i7) {
            case 0:
                j jVar = (j) frameLayout;
                i iVar = (i) obj;
                FrameLayout frameLayout2 = jVar.K;
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                ((Float) valueAnimator.getAnimatedValue()).getClass();
                Typeface typeface = org.telegram.messenger.g0.f24090a;
                float min = Math.min((f12.floatValue() - ((Float) ((AtomicReference) obj2).getAndSet(f12)).floatValue()) * 1000.0f * 8.0f, 250.0f);
                while (min > 0.0f) {
                    float min2 = Math.min(min, 18.0f);
                    float f13 = iVar.f30773a;
                    float f14 = iVar.f30774b;
                    float f15 = (((((-0.020170001f) * f14) + ((f13 - 1.0f) * (-3.8E-4f))) / 1.0f) * min2) + f14;
                    iVar.f30774b = f15;
                    iVar.f30773a = (f15 * min2) + f13;
                    min -= min2;
                }
                float T1 = org.telegram.messenger.g0.T1(f11, f10, iVar.f30773a);
                jVar.W = T1;
                if (T1 > 0.8f && frameLayout2.getBackground() == null) {
                    frameLayout2.setBackground(jVar.L);
                }
                jVar.f30860r.setAlpha(1.0f - jVar.W);
                jVar.f30861s.setAlpha((float) Math.pow(1.0f - jVar.W, 2.0d));
                jVar.i();
                frameLayout2.invalidate();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((HorizontalScrollView) frameLayout).setScrollX((int) com.google.android.gms.internal.vision.e2.z(f10, f11, floatValue, f11));
                ((fi0) obj2).setOutlineProgress(1.0f - floatValue);
                ((fi0) obj).setOutlineProgress(floatValue);
                return;
        }
    }

    public b(j jVar, AtomicReference atomicReference, float f10, float f11, i iVar) {
        this.d = jVar;
        this.f30410e = atomicReference;
        this.f30408b = f10;
        this.f30409c = f11;
        this.f30411f = iVar;
    }
}
