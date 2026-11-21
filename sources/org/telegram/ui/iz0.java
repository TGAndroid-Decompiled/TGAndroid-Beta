package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class iz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48848a;
    public final Object f48849b;

    public iz0(Object obj, int i7) {
        this.f48848a = i7;
        this.f48849b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48848a) {
            case 0:
                SecretMediaViewer secretMediaViewer = ((jz0) this.f48849b).d;
                secretMediaViewer.Z.f49075l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Z.invalidate();
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = ((jz0) this.f48849b).d;
                secretMediaViewer2.Z.f49075l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Z.invalidate();
                return;
            case 2:
                ((SecretMediaViewer) ((org.telegram.ui.Components.cl0) this.f48849b).f34222b).Z.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                uz0 uz0Var = (uz0) this.f48849b;
                uz0Var.f52667w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (uz0Var.T) {
                    uz0Var.O.invalidate();
                    return;
                }
                return;
            case 4:
                ((j01) this.f48849b).f48857e.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                k01 k01Var = (k01) this.f48849b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k01Var.f49162r = floatValue;
                View view = k01Var.f49159e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                hi.p3 p3Var = k01Var.d;
                if (p3Var != null) {
                    p3Var.invalidate();
                    return;
                }
                return;
            case 6:
                o11 o11Var = (o11) this.f48849b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o11Var.M = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = o11Var.f50402w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                d61 d61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.nr.f37957g.getInterpolation(o11Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    float s5 = org.telegram.messenger.g0.s(o11Var.M, i7, itemsCount, 4.0f);
                    d61Var.getChildAt(i7).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    d61Var.getChildAt(i7).setAlpha(s5);
                }
                return;
            case 7:
                o31 o31Var = (o31) this.f48849b;
                o31Var.getClass();
                o31Var.l0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                m41 m41Var = (m41) this.f48849b;
                m41Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m41Var.f49757e.setAlpha(1.0f - floatValue3);
                lg.g gVar = m41Var.f49755b;
                gVar.A0.f21548f = floatValue3;
                m41Var.f49756c.invalidate();
                gVar.invalidate();
                return;
            case 9:
                x71 x71Var = (x71) this.f48849b;
                x71Var.getClass();
                x71Var.f53758q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x71Var.f53780z0.invalidate();
                x71Var.E0.invalidate();
                x71Var.T1.setAlpha(x71Var.f53758q1);
                x71Var.S1.invalidate();
                x71Var.a1();
                return;
            case 10:
                x71 x71Var2 = ((m71) this.f48849b).f49778a;
                x71Var2.f53758q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x71Var2.f53780z0.invalidate();
                x71Var2.E0.invalidate();
                x71Var2.T1.setAlpha(x71Var2.f53758q1);
                x71Var2.S1.invalidate();
                x71Var2.a1();
                return;
            case 11:
                p81 p81Var = (p81) this.f48849b;
                p81Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = p81Var.f50805a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    int R = RecyclerView.R(p81Var.f50805a.getChildAt(i10));
                    int i11 = p81Var.d.f49813e;
                    if (R >= i11 && i11 > 0) {
                        p81Var.f50805a.getChildAt(i10).setAlpha(p81Var.F);
                    } else {
                        p81Var.f50805a.getChildAt(i10).setAlpha(1.0f);
                    }
                }
                return;
            case 12:
                u81 u81Var = (u81) this.f48849b;
                u81Var.getClass();
                u81Var.f52476b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u81Var.invalidate();
                return;
            case 13:
                y91 y91Var = (y91) this.f48849b;
                y91Var.getClass();
                y91Var.W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 14:
                v91 v91Var = (v91) this.f48849b;
                v91Var.getClass();
                v91Var.f52767k5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v91Var.n0();
                return;
            case 15:
                w91 w91Var = (w91) this.f48849b;
                w91Var.getClass();
                w91Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                hc1 hc1Var = (hc1) this.f48849b;
                hc1Var.getClass();
                hc1Var.f48371y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hc1Var.x();
                return;
        }
    }
}
