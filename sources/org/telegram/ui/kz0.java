package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class kz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47468a;
    public final Object f47469b;

    public kz0(Object obj, int i7) {
        this.f47468a = i7;
        this.f47469b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47468a) {
            case 0:
                SecretMediaViewer secretMediaViewer = ((lz0) this.f47469b).d;
                secretMediaViewer.Y.f47673k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Y.invalidate();
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = ((lz0) this.f47469b).d;
                secretMediaViewer2.Y.f47673k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Y.invalidate();
                return;
            case 2:
                ((SecretMediaViewer) ((org.telegram.ui.Components.nk0) this.f47469b).f36328b).Y.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                vz0 vz0Var = (vz0) this.f47469b;
                vz0Var.f50842w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (vz0Var.S) {
                    vz0Var.N.invalidate();
                    return;
                }
                return;
            case 4:
                ((k01) this.f47469b).f47131e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                l01 l01Var = (l01) this.f47469b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l01Var.f47479r = floatValue;
                View view = l01Var.f47476e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                fi.r3 r3Var = l01Var.d;
                if (r3Var != null) {
                    r3Var.invalidate();
                    return;
                }
                return;
            case 6:
                p11 p11Var = (p11) this.f47469b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p11Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = p11Var.f48625w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                e61 e61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.wq.f40047g.getInterpolation(p11Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    float s5 = org.telegram.messenger.g0.s(p11Var.L, i7, itemsCount, 4.0f);
                    e61Var.getChildAt(i7).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    e61Var.getChildAt(i7).setAlpha(s5);
                }
                return;
            case 7:
                o31 o31Var = (o31) this.f47469b;
                o31Var.getClass();
                o31Var.l0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                n41 n41Var = (n41) this.f47469b;
                n41Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n41Var.f48116e.setAlpha(1.0f - floatValue3);
                lg.g gVar = n41Var.f48114b;
                gVar.f18334z0.f20594f = floatValue3;
                n41Var.f48115c.invalidate();
                gVar.invalidate();
                return;
            case 9:
                x71 x71Var = (x71) this.f47469b;
                x71Var.getClass();
                x71Var.f51605p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x71Var.f51627y0.invalidate();
                x71Var.D0.invalidate();
                x71Var.S1.setAlpha(x71Var.f51605p1);
                x71Var.R1.invalidate();
                x71Var.a1();
                return;
            case 10:
                x71 x71Var2 = ((m71) this.f47469b).f47820a;
                x71Var2.f51605p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x71Var2.f51627y0.invalidate();
                x71Var2.D0.invalidate();
                x71Var2.S1.setAlpha(x71Var2.f51605p1);
                x71Var2.R1.invalidate();
                x71Var2.a1();
                return;
            case 11:
                p81 p81Var = (p81) this.f47469b;
                p81Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = p81Var.f48714a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    int R = RecyclerView.R(p81Var.f48714a.getChildAt(i10));
                    int i11 = p81Var.d.f47858e;
                    if (R >= i11 && i11 > 0) {
                        p81Var.f48714a.getChildAt(i10).setAlpha(p81Var.E);
                    } else {
                        p81Var.f48714a.getChildAt(i10).setAlpha(1.0f);
                    }
                }
                return;
            case 12:
                v81 v81Var = (v81) this.f47469b;
                v81Var.getClass();
                v81Var.f50656b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v81Var.invalidate();
                return;
            case 13:
                z91 z91Var = (z91) this.f47469b;
                z91Var.getClass();
                z91Var.W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 14:
                w91 w91Var = (w91) this.f47469b;
                w91Var.getClass();
                w91Var.f50962j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w91Var.n0();
                return;
            case 15:
                x91 x91Var = (x91) this.f47469b;
                x91Var.getClass();
                x91Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                jc1 jc1Var = (jc1) this.f47469b;
                jc1Var.getClass();
                jc1Var.f46950x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jc1Var.x();
                return;
        }
    }
}
