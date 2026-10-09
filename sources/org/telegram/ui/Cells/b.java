package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vk0;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f21820a = 1;
    public final float f21821b;
    public final float f21822c;
    public final FrameLayout d;
    public final Object f21823e;
    public final Object f21824f;

    public b(HorizontalScrollView horizontalScrollView, float f7, float f10, vk0 vk0Var, vk0 vk0Var2) {
        this.d = horizontalScrollView;
        this.f21821b = f7;
        this.f21822c = f10;
        this.f21823e = vk0Var;
        this.f21824f = vk0Var2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21820a) {
            case 0:
                j jVar = (j) this.d;
                o1.e eVar = (o1.e) this.f21824f;
                FrameLayout frameLayout = jVar.J;
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = this.f21821b;
                float f11 = this.f21822c;
                AndroidUtilities.lerp(f10, f11, floatValue);
                float min = Math.min((f7.floatValue() - ((Float) ((AtomicReference) this.f21823e).getAndSet(f7)).floatValue()) * 1000.0f * 8.0f, 250.0f);
                while (min > 0.0f) {
                    float min2 = Math.min(min, 18.0f);
                    float f12 = eVar.f16917a;
                    float f13 = eVar.f16918b;
                    float f14 = (((((-0.020170001f) * f13) + ((f12 - 1.0f) * (-3.8E-4f))) / 1.0f) * min2) + f13;
                    eVar.f16918b = f14;
                    eVar.f16917a = (f14 * min2) + f12;
                    min -= min2;
                }
                float lerp = AndroidUtilities.lerp(f10, f11, eVar.f16917a);
                jVar.T = lerp;
                if (lerp > 0.8f && frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                }
                jVar.f22288r.setAlpha(1.0f - jVar.T);
                jVar.f22289s.setAlpha((float) Math.pow(1.0f - jVar.T, 2.0d));
                jVar.i();
                frameLayout.invalidate();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = this.f21822c;
                float f16 = this.f21821b;
                ((HorizontalScrollView) this.d).setScrollX((int) com.google.android.gms.internal.vision.e2.y(f15, f16, floatValue2, f16));
                ((vk0) this.f21823e).setOutlineProgress(1.0f - floatValue2);
                ((vk0) this.f21824f).setOutlineProgress(floatValue2);
                return;
        }
    }

    public b(j jVar, AtomicReference atomicReference, float f7, float f10, o1.e eVar) {
        this.d = jVar;
        this.f21823e = atomicReference;
        this.f21821b = f7;
        this.f21822c = f10;
        this.f21824f = eVar;
    }
}
