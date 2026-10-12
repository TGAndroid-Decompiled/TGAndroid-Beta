package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yk0;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f21584a = 1;
    public final float f21585b;
    public final float f21586c;
    public final FrameLayout d;
    public final Object f21587e;
    public final Object f21588f;

    public b(HorizontalScrollView horizontalScrollView, float f7, float f10, yk0 yk0Var, yk0 yk0Var2) {
        this.d = horizontalScrollView;
        this.f21585b = f7;
        this.f21586c = f10;
        this.f21587e = yk0Var;
        this.f21588f = yk0Var2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21584a) {
            case 0:
                j jVar = (j) this.d;
                o1.e eVar = (o1.e) this.f21588f;
                FrameLayout frameLayout = jVar.J;
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = this.f21585b;
                float f11 = this.f21586c;
                AndroidUtilities.lerp(f10, f11, floatValue);
                float min = Math.min((f7.floatValue() - ((Float) ((AtomicReference) this.f21587e).getAndSet(f7)).floatValue()) * 1000.0f * 8.0f, 250.0f);
                while (min > 0.0f) {
                    float min2 = Math.min(min, 18.0f);
                    float f12 = eVar.f16669a;
                    float f13 = eVar.f16670b;
                    float f14 = (((((-0.020170001f) * f13) + ((f12 - 1.0f) * (-3.8E-4f))) / 1.0f) * min2) + f13;
                    eVar.f16670b = f14;
                    eVar.f16669a = (f14 * min2) + f12;
                    min -= min2;
                }
                float lerp = AndroidUtilities.lerp(f10, f11, eVar.f16669a);
                jVar.T = lerp;
                if (lerp > 0.8f && frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                }
                jVar.f22071r.setAlpha(1.0f - jVar.T);
                jVar.f22072s.setAlpha((float) Math.pow(1.0f - jVar.T, 2.0d));
                jVar.i();
                frameLayout.invalidate();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = this.f21586c;
                float f16 = this.f21585b;
                ((HorizontalScrollView) this.d).setScrollX((int) com.google.android.gms.internal.vision.e2.y(f15, f16, floatValue2, f16));
                ((yk0) this.f21587e).setOutlineProgress(1.0f - floatValue2);
                ((yk0) this.f21588f).setOutlineProgress(floatValue2);
                return;
        }
    }

    public b(j jVar, AtomicReference atomicReference, float f7, float f10, o1.e eVar) {
        this.d = jVar;
        this.f21587e = atomicReference;
        this.f21585b = f7;
        this.f21586c = f10;
        this.f21588f = eVar;
    }
}
