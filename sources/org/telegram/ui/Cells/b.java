package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zj0;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f20823a = 1;
    public final float f20824b;
    public final float f20825c;
    public final FrameLayout d;
    public final Object e;
    public final Object f20826f;

    public b(HorizontalScrollView horizontalScrollView, float f10, float f11, zj0 zj0Var, zj0 zj0Var2) {
        this.d = horizontalScrollView;
        this.f20824b = f10;
        this.f20825c = f11;
        this.e = zj0Var;
        this.f20826f = zj0Var2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f20823a) {
            case 0:
                j jVar = (j) this.d;
                o1.e eVar = (o1.e) this.f20826f;
                FrameLayout frameLayout = jVar.G;
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f11 = this.f20824b;
                float f12 = this.f20825c;
                AndroidUtilities.lerp(f11, f12, floatValue);
                float min = Math.min((f10.floatValue() - ((Float) ((AtomicReference) this.e).getAndSet(f10)).floatValue()) * 1000.0f * 8.0f, 250.0f);
                while (min > 0.0f) {
                    float min2 = Math.min(min, 18.0f);
                    float f13 = eVar.f16159a;
                    float f14 = eVar.f16160b;
                    float f15 = (((((-0.020170001f) * f14) + ((f13 - 1.0f) * (-3.8E-4f))) / 1.0f) * min2) + f14;
                    eVar.f16160b = f15;
                    eVar.f16159a = (f15 * min2) + f13;
                    min -= min2;
                }
                float lerp = AndroidUtilities.lerp(f11, f12, eVar.f16159a);
                jVar.Q = lerp;
                if (lerp > 0.8f && frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.H);
                }
                jVar.f21204r.setAlpha(1.0f - jVar.Q);
                jVar.f21205s.setAlpha((float) Math.pow(1.0f - jVar.Q, 2.0d));
                jVar.i();
                frameLayout.invalidate();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f16 = this.f20825c;
                float f17 = this.f20824b;
                ((HorizontalScrollView) this.d).setScrollX((int) e2.c.w(f16, f17, floatValue2, f17));
                ((zj0) this.e).setOutlineProgress(1.0f - floatValue2);
                ((zj0) this.f20826f).setOutlineProgress(floatValue2);
                return;
        }
    }

    public b(j jVar, AtomicReference atomicReference, float f10, float f11, o1.e eVar) {
        this.d = jVar;
        this.e = atomicReference;
        this.f20824b = f10;
        this.f20825c = f11;
        this.f20826f = eVar;
    }
}
