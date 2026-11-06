package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class gz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46171a;
    public final Object f46172b;

    public gz0(Object obj, int i7) {
        this.f46171a = i7;
        this.f46172b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46171a) {
            case 0:
                SecretMediaViewer secretMediaViewer = ((hz0) this.f46172b).d;
                secretMediaViewer.Y.f46726k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Y.invalidate();
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = ((hz0) this.f46172b).d;
                secretMediaViewer2.Y.f46726k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Y.invalidate();
                return;
            case 2:
                ((SecretMediaViewer) ((org.telegram.ui.Components.nk0) this.f46172b).f36327b).Y.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                rz0 rz0Var = (rz0) this.f46172b;
                rz0Var.f49605w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (rz0Var.S) {
                    rz0Var.N.invalidate();
                    return;
                }
                return;
            case 4:
                ((h01) this.f46172b).f46180e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                i01 i01Var = (i01) this.f46172b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i01Var.f46543r = floatValue;
                View view = i01Var.f46540e;
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
                m11 m11Var = (m11) this.f46172b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m11Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m11Var.f47630w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                c61 c61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.xq.f40330g.getInterpolation(m11Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    float s5 = org.telegram.messenger.g0.s(m11Var.L, i7, itemsCount, 4.0f);
                    c61Var.getChildAt(i7).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    c61Var.getChildAt(i7).setAlpha(s5);
                }
                return;
            case 7:
                m31 m31Var = (m31) this.f46172b;
                m31Var.getClass();
                m31Var.l0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                l41 l41Var = (l41) this.f46172b;
                l41Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l41Var.f47412e.setAlpha(1.0f - floatValue3);
                lg.g gVar = l41Var.f47410b;
                gVar.f18328z0.f20586f = floatValue3;
                l41Var.f47411c.invalidate();
                gVar.invalidate();
                return;
            case 9:
                u71 u71Var = (u71) this.f46172b;
                u71Var.getClass();
                u71Var.f50310p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u71Var.f50332y0.invalidate();
                u71Var.D0.invalidate();
                u71Var.S1.setAlpha(u71Var.f50310p1);
                u71Var.R1.invalidate();
                u71Var.a1();
                return;
            case 10:
                u71 u71Var2 = ((j71) this.f46172b).f46866a;
                u71Var2.f50310p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u71Var2.f50332y0.invalidate();
                u71Var2.D0.invalidate();
                u71Var2.S1.setAlpha(u71Var2.f50310p1);
                u71Var2.R1.invalidate();
                u71Var2.a1();
                return;
            case 11:
                m81 m81Var = (m81) this.f46172b;
                m81Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = m81Var.f47726a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    int R = RecyclerView.R(m81Var.f47726a.getChildAt(i10));
                    int i11 = m81Var.d.f46901e;
                    if (R >= i11 && i11 > 0) {
                        m81Var.f47726a.getChildAt(i10).setAlpha(m81Var.E);
                    } else {
                        m81Var.f47726a.getChildAt(i10).setAlpha(1.0f);
                    }
                }
                return;
            case 12:
                s81 s81Var = (s81) this.f46172b;
                s81Var.getClass();
                s81Var.f49684b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s81Var.invalidate();
                return;
            case 13:
                v91 v91Var = (v91) this.f46172b;
                v91Var.getClass();
                v91Var.W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 14:
                s91 s91Var = (s91) this.f46172b;
                s91Var.getClass();
                s91Var.f49714j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s91Var.n0();
                return;
            case 15:
                t91 t91Var = (t91) this.f46172b;
                t91Var.getClass();
                t91Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ec1 ec1Var = (ec1) this.f46172b;
                ec1Var.getClass();
                ec1Var.f45315x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ec1Var.x();
                return;
        }
    }
}
