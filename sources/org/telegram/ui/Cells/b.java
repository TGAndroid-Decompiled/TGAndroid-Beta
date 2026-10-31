package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.wi0;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f21696a = 1;
    public final float f21697b;
    public final float f21698c;
    public final FrameLayout d;
    public final Object e;
    public final Object f21699f;

    public b(HorizontalScrollView horizontalScrollView, float f7, float f10, wi0 wi0Var, wi0 wi0Var2) {
        this.d = horizontalScrollView;
        this.f21697b = f7;
        this.f21698c = f10;
        this.e = wi0Var;
        this.f21699f = wi0Var2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f21696a;
        Object obj = this.f21699f;
        Object obj2 = this.e;
        float f7 = this.f21698c;
        float f10 = this.f21697b;
        FrameLayout frameLayout = this.d;
        switch (i10) {
            case 0:
                i iVar = (i) frameLayout;
                o1.e eVar = (o1.e) obj;
                FrameLayout frameLayout2 = iVar.J;
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                ((Float) valueAnimator.getAnimatedValue()).getClass();
                Typeface typeface = org.telegram.messenger.i0.f15999a;
                float min = Math.min((f11.floatValue() - ((Float) ((AtomicReference) obj2).getAndSet(f11)).floatValue()) * 1000.0f * 8.0f, 250.0f);
                while (min > 0.0f) {
                    float min2 = Math.min(min, 18.0f);
                    float f12 = eVar.f13938a;
                    float f13 = eVar.f13939b;
                    float f14 = (((((-0.020170001f) * f13) + ((f12 - 1.0f) * (-3.8E-4f))) / 1.0f) * min2) + f13;
                    eVar.f13939b = f14;
                    eVar.f13938a = (f14 * min2) + f12;
                    min -= min2;
                }
                float T1 = org.telegram.messenger.i0.T1(f10, f7, eVar.f13938a);
                iVar.V = T1;
                if (T1 > 0.8f && frameLayout2.getBackground() == null) {
                    frameLayout2.setBackground(iVar.K);
                }
                iVar.f22017r.setAlpha(1.0f - iVar.V);
                iVar.f22018s.setAlpha((float) Math.pow(1.0f - iVar.V, 2.0d));
                iVar.i();
                frameLayout2.invalidate();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((HorizontalScrollView) frameLayout).setScrollX((int) c3.i0.z(f7, f10, floatValue, f10));
                ((wi0) obj2).setOutlineProgress(1.0f - floatValue);
                ((wi0) obj).setOutlineProgress(floatValue);
                return;
        }
    }

    public b(i iVar, AtomicReference atomicReference, float f7, float f10, o1.e eVar) {
        this.d = iVar;
        this.e = atomicReference;
        this.f21697b = f7;
        this.f21698c = f10;
        this.f21699f = eVar;
    }
}
