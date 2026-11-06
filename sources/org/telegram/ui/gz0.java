package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class gz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46170a;
    public final Object f46171b;

    public gz0(Object obj, int i7) {
        this.f46170a = i7;
        this.f46171b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46170a) {
            case 0:
                SecretMediaViewer secretMediaViewer = ((hz0) this.f46171b).d;
                secretMediaViewer.Y.f46725k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Y.invalidate();
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = ((hz0) this.f46171b).d;
                secretMediaViewer2.Y.f46725k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Y.invalidate();
                return;
            case 2:
                ((SecretMediaViewer) ((org.telegram.ui.Components.nk0) this.f46171b).f36366b).Y.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                rz0 rz0Var = (rz0) this.f46171b;
                rz0Var.f49604w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (rz0Var.S) {
                    rz0Var.N.invalidate();
                    return;
                }
                return;
            case 4:
                ((h01) this.f46171b).f46179e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                i01 i01Var = (i01) this.f46171b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i01Var.f46542r = floatValue;
                View view = i01Var.f46539e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                fi.r3 r3Var = i01Var.d;
                if (r3Var != null) {
                    r3Var.invalidate();
                    return;
                }
                return;
            case 6:
                m11 m11Var = (m11) this.f46171b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m11Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m11Var.f47629w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                c61 c61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.xq.f40346g.getInterpolation(m11Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    float s5 = org.telegram.messenger.g0.s(m11Var.L, i7, itemsCount, 4.0f);
                    c61Var.getChildAt(i7).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    c61Var.getChildAt(i7).setAlpha(s5);
                }
                return;
            case 7:
                m31 m31Var = (m31) this.f46171b;
                m31Var.getClass();
                m31Var.l0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                l41 l41Var = (l41) this.f46171b;
                l41Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l41Var.f47411e.setAlpha(1.0f - floatValue3);
                lg.g gVar = l41Var.f47409b;
                gVar.f18328z0.f20586f = floatValue3;
                l41Var.f47410c.invalidate();
                gVar.invalidate();
                return;
            case 9:
                u71 u71Var = (u71) this.f46171b;
                u71Var.getClass();
                u71Var.f50309p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u71Var.f50331y0.invalidate();
                u71Var.D0.invalidate();
                u71Var.S1.setAlpha(u71Var.f50309p1);
                u71Var.R1.invalidate();
                u71Var.a1();
                return;
            case 10:
                u71 u71Var2 = ((j71) this.f46171b).f46865a;
                u71Var2.f50309p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u71Var2.f50331y0.invalidate();
                u71Var2.D0.invalidate();
                u71Var2.S1.setAlpha(u71Var2.f50309p1);
                u71Var2.R1.invalidate();
                u71Var2.a1();
                return;
            case 11:
                m81 m81Var = (m81) this.f46171b;
                m81Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = m81Var.f47725a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    int R = RecyclerView.R(m81Var.f47725a.getChildAt(i10));
                    int i11 = m81Var.d.f46900e;
                    if (R >= i11 && i11 > 0) {
                        m81Var.f47725a.getChildAt(i10).setAlpha(m81Var.E);
                    } else {
                        m81Var.f47725a.getChildAt(i10).setAlpha(1.0f);
                    }
                }
                return;
            case 12:
                s81 s81Var = (s81) this.f46171b;
                s81Var.getClass();
                s81Var.f49683b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s81Var.invalidate();
                return;
            case 13:
                v91 v91Var = (v91) this.f46171b;
                v91Var.getClass();
                v91Var.W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 14:
                s91 s91Var = (s91) this.f46171b;
                s91Var.getClass();
                s91Var.f49713j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s91Var.n0();
                return;
            case 15:
                t91 t91Var = (t91) this.f46171b;
                t91Var.getClass();
                t91Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ec1 ec1Var = (ec1) this.f46171b;
                ec1Var.getClass();
                ec1Var.f45314x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ec1Var.x();
                return;
        }
    }
}
