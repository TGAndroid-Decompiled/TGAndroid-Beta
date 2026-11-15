package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ez0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46927a;
    public final Object f46928b;

    public ez0(Object obj, int i7) {
        this.f46927a = i7;
        this.f46928b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46927a) {
            case 0:
                SecretMediaViewer secretMediaViewer = ((fz0) this.f46928b).d;
                secretMediaViewer.Z.f47799l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Z.invalidate();
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = ((fz0) this.f46928b).d;
                secretMediaViewer2.Z.f47799l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Z.invalidate();
                return;
            case 2:
                ((SecretMediaViewer) ((org.telegram.ui.Components.sk0) this.f46928b).f39332b).Z.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                pz0 pz0Var = (pz0) this.f46928b;
                pz0Var.f50404w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (pz0Var.T) {
                    pz0Var.O.invalidate();
                    return;
                }
                return;
            case 4:
                ((e01) this.f46928b).f46509e.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                f01 f01Var = (f01) this.f46928b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f01Var.f46943r = floatValue;
                View view = f01Var.f46940e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                hi.q3 q3Var = f01Var.d;
                if (q3Var != null) {
                    q3Var.invalidate();
                    return;
                }
                return;
            case 6:
                j11 j11Var = (j11) this.f46928b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j11Var.M = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = j11Var.f48179w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                z51 z51Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.er.f34420g.getInterpolation(j11Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    float s5 = org.telegram.messenger.g0.s(j11Var.M, i7, itemsCount, 4.0f);
                    z51Var.getChildAt(i7).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    z51Var.getChildAt(i7).setAlpha(s5);
                }
                return;
            case 7:
                k31 k31Var = (k31) this.f46928b;
                k31Var.getClass();
                k31Var.l0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                j41 j41Var = (j41) this.f46928b;
                j41Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j41Var.f48203e.setAlpha(1.0f - floatValue3);
                lg.g gVar = j41Var.f48201b;
                gVar.A0.f21159f = floatValue3;
                j41Var.f48202c.invalidate();
                gVar.invalidate();
                return;
            case 9:
                t71 t71Var = (t71) this.f46928b;
                t71Var.getClass();
                t71Var.f51456q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t71Var.f51478z0.invalidate();
                t71Var.E0.invalidate();
                t71Var.T1.setAlpha(t71Var.f51456q1);
                t71Var.S1.invalidate();
                t71Var.a1();
                return;
            case 10:
                t71 t71Var2 = ((i71) this.f46928b).f47927a;
                t71Var2.f51456q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t71Var2.f51478z0.invalidate();
                t71Var2.E0.invalidate();
                t71Var2.T1.setAlpha(t71Var2.f51456q1);
                t71Var2.S1.invalidate();
                t71Var2.a1();
                return;
            case 11:
                l81 l81Var = (l81) this.f46928b;
                l81Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = l81Var.f48891a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    int R = RecyclerView.R(l81Var.f48891a.getChildAt(i10));
                    int i11 = l81Var.d.f47961e;
                    if (R >= i11 && i11 > 0) {
                        l81Var.f48891a.getChildAt(i10).setAlpha(l81Var.F);
                    } else {
                        l81Var.f48891a.getChildAt(i10).setAlpha(1.0f);
                    }
                }
                return;
            case 12:
                q81 q81Var = (q81) this.f46928b;
                q81Var.getClass();
                q81Var.f50495b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q81Var.invalidate();
                return;
            case 13:
                u91 u91Var = (u91) this.f46928b;
                u91Var.getClass();
                u91Var.W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 14:
                r91 r91Var = (r91) this.f46928b;
                r91Var.getClass();
                r91Var.f50888k5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r91Var.o0();
                return;
            case 15:
                s91 s91Var = (s91) this.f46928b;
                s91Var.getClass();
                s91Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ec1 ec1Var = (ec1) this.f46928b;
                ec1Var.getClass();
                ec1Var.f46716y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ec1Var.x();
                return;
        }
    }
}
