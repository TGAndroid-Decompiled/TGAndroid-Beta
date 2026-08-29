package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qj0;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f24102a = 1;
    public final float f24103b;
    public final float f24104c;
    public final FrameLayout d;
    public final Object f24105e;
    public final Object f24106f;

    public b(HorizontalScrollView horizontalScrollView, float f9, float f10, qj0 qj0Var, qj0 qj0Var2) {
        this.d = horizontalScrollView;
        this.f24103b = f9;
        this.f24104c = f10;
        this.f24105e = qj0Var;
        this.f24106f = qj0Var2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24102a) {
            case 0:
                j jVar = (j) this.d;
                o1.f fVar = (o1.f) this.f24106f;
                FrameLayout frameLayout = jVar.F;
                Float f9 = (Float) valueAnimator.getAnimatedValue();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = this.f24103b;
                float f11 = this.f24104c;
                AndroidUtilities.lerp(f10, f11, floatValue);
                float min = Math.min((f9.floatValue() - ((Float) ((AtomicReference) this.f24105e).getAndSet(f9)).floatValue()) * 1000.0f * 8.0f, 250.0f);
                while (min > 0.0f) {
                    float min2 = Math.min(min, 18.0f);
                    float f12 = fVar.f19025a;
                    float f13 = fVar.f19026b;
                    float f14 = (((((-0.020170001f) * f13) + ((f12 - 1.0f) * (-3.8E-4f))) / 1.0f) * min2) + f13;
                    fVar.f19026b = f14;
                    fVar.f19025a = (f14 * min2) + f12;
                    min -= min2;
                }
                float lerp = AndroidUtilities.lerp(f10, f11, fVar.f19025a);
                jVar.P = lerp;
                if (lerp > 0.8f && frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.G);
                }
                jVar.f24523r.setAlpha(1.0f - jVar.P);
                jVar.f24524s.setAlpha((float) Math.pow(1.0f - jVar.P, 2.0d));
                jVar.i();
                frameLayout.invalidate();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = this.f24104c;
                float f16 = this.f24103b;
                ((HorizontalScrollView) this.d).setScrollX((int) com.google.android.recaptcha.internal.a.z(f15, f16, floatValue2, f16));
                ((qj0) this.f24105e).setOutlineProgress(1.0f - floatValue2);
                ((qj0) this.f24106f).setOutlineProgress(floatValue2);
                return;
        }
    }

    public b(j jVar, AtomicReference atomicReference, float f9, float f10, o1.f fVar) {
        this.d = jVar;
        this.f24105e = atomicReference;
        this.f24103b = f9;
        this.f24104c = f10;
        this.f24106f = fVar;
    }
}
