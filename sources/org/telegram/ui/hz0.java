package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class hz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48673a;
    public final Object f48674b;

    public hz0(Object obj, int i7) {
        this.f48673a = i7;
        this.f48674b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48673a) {
            case 0:
                SecretMediaViewer secretMediaViewer = ((iz0) this.f48674b).d;
                secretMediaViewer.Z.f49193l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Z.invalidate();
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = ((iz0) this.f48674b).d;
                secretMediaViewer2.Z.f49193l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Z.invalidate();
                return;
            case 2:
                ((SecretMediaViewer) ((org.telegram.ui.Components.cl0) this.f48674b).f34083b).Z.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                sz0 sz0Var = (sz0) this.f48674b;
                sz0Var.f52190w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (sz0Var.T) {
                    sz0Var.O.invalidate();
                    return;
                }
                return;
            case 4:
                ((h01) this.f48674b).f48393e.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                i01 i01Var = (i01) this.f48674b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i01Var.f48683r = floatValue;
                View view = i01Var.f48680e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                hi.y3 y3Var = i01Var.d;
                if (y3Var != null) {
                    y3Var.invalidate();
                    return;
                }
                return;
            case 6:
                m11 m11Var = (m11) this.f48674b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m11Var.M = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m11Var.f49932w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                b61 b61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.kr.f36859g.getInterpolation(m11Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    float s5 = org.telegram.messenger.g0.s(m11Var.M, i7, itemsCount, 4.0f);
                    b61Var.getChildAt(i7).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    b61Var.getChildAt(i7).setAlpha(s5);
                }
                return;
            case 7:
                n31 n31Var = (n31) this.f48674b;
                n31Var.getClass();
                n31Var.l0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                l41 l41Var = (l41) this.f48674b;
                l41Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l41Var.f49587e.setAlpha(1.0f - floatValue3);
                lg.g gVar = l41Var.f49585b;
                gVar.A0.f21616f = floatValue3;
                l41Var.f49586c.invalidate();
                gVar.invalidate();
                return;
            case 9:
                v71 v71Var = (v71) this.f48674b;
                v71Var.getClass();
                v71Var.f52892q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v71Var.f52914z0.invalidate();
                v71Var.E0.invalidate();
                v71Var.T1.setAlpha(v71Var.f52892q1);
                v71Var.S1.invalidate();
                v71Var.a1();
                return;
            case 10:
                v71 v71Var2 = ((k71) this.f48674b).f49361a;
                v71Var2.f52892q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v71Var2.f52914z0.invalidate();
                v71Var2.E0.invalidate();
                v71Var2.T1.setAlpha(v71Var2.f52892q1);
                v71Var2.S1.invalidate();
                v71Var2.a1();
                return;
            case 11:
                n81 n81Var = (n81) this.f48674b;
                n81Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = n81Var.f50261a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    int R = RecyclerView.R(n81Var.f50261a.getChildAt(i10));
                    int i11 = n81Var.d.f49369e;
                    if (R >= i11 && i11 > 0) {
                        n81Var.f50261a.getChildAt(i10).setAlpha(n81Var.F);
                    } else {
                        n81Var.f50261a.getChildAt(i10).setAlpha(1.0f);
                    }
                }
                return;
            case 12:
                s81 s81Var = (s81) this.f48674b;
                s81Var.getClass();
                s81Var.f52004b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s81Var.invalidate();
                return;
            case 13:
                w91 w91Var = (w91) this.f48674b;
                w91Var.getClass();
                w91Var.W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 14:
                t91 t91Var = (t91) this.f48674b;
                t91Var.getClass();
                t91Var.f52326k5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t91Var.o0();
                return;
            case 15:
                u91 u91Var = (u91) this.f48674b;
                u91Var.getClass();
                u91Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                fc1 fc1Var = (fc1) this.f48674b;
                fc1Var.getClass();
                fc1Var.f47797y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fc1Var.x();
                return;
        }
    }
}
