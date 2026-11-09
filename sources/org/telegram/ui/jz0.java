package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class jz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47134a;
    public final Object f47135b;

    public jz0(Object obj, int i7) {
        this.f47134a = i7;
        this.f47135b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47134a) {
            case 0:
                SecretMediaViewer secretMediaViewer = ((kz0) this.f47135b).d;
                secretMediaViewer.Y.f47349k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Y.invalidate();
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = ((kz0) this.f47135b).d;
                secretMediaViewer2.Y.f47349k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Y.invalidate();
                return;
            case 2:
                ((SecretMediaViewer) ((org.telegram.ui.Components.ok0) this.f47135b).f36738b).Y.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                uz0 uz0Var = (uz0) this.f47135b;
                uz0Var.f50513w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (uz0Var.S) {
                    uz0Var.N.invalidate();
                    return;
                }
                return;
            case 4:
                ((j01) this.f47135b).f46808e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                k01 k01Var = (k01) this.f47135b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k01Var.f47150r = floatValue;
                View view = k01Var.f47147e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                fi.r3 r3Var = k01Var.d;
                if (r3Var != null) {
                    r3Var.invalidate();
                    return;
                }
                return;
            case 6:
                o11 o11Var = (o11) this.f47135b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o11Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = o11Var.f48290w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                d61 d61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.xq.f40459g.getInterpolation(o11Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    float s5 = org.telegram.messenger.g0.s(o11Var.L, i7, itemsCount, 4.0f);
                    d61Var.getChildAt(i7).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    d61Var.getChildAt(i7).setAlpha(s5);
                }
                return;
            case 7:
                n31 n31Var = (n31) this.f47135b;
                n31Var.getClass();
                n31Var.l0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                m41 m41Var = (m41) this.f47135b;
                m41Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m41Var.f47746e.setAlpha(1.0f - floatValue3);
                lg.g gVar = m41Var.f47744b;
                gVar.f18331z0.f20589f = floatValue3;
                m41Var.f47745c.invalidate();
                gVar.invalidate();
                return;
            case 9:
                w71 w71Var = (w71) this.f47135b;
                w71Var.getClass();
                w71Var.f50946p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w71Var.f50968y0.invalidate();
                w71Var.D0.invalidate();
                w71Var.S1.setAlpha(w71Var.f50946p1);
                w71Var.R1.invalidate();
                w71Var.a1();
                return;
            case 10:
                w71 w71Var2 = ((l71) this.f47135b).f47493a;
                w71Var2.f50946p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w71Var2.f50968y0.invalidate();
                w71Var2.D0.invalidate();
                w71Var2.S1.setAlpha(w71Var2.f50946p1);
                w71Var2.R1.invalidate();
                w71Var2.a1();
                return;
            case 11:
                o81 o81Var = (o81) this.f47135b;
                o81Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = o81Var.f48399a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    int R = RecyclerView.R(o81Var.f48399a.getChildAt(i10));
                    int i11 = o81Var.d.f47528e;
                    if (R >= i11 && i11 > 0) {
                        o81Var.f48399a.getChildAt(i10).setAlpha(o81Var.E);
                    } else {
                        o81Var.f48399a.getChildAt(i10).setAlpha(1.0f);
                    }
                }
                return;
            case 12:
                u81 u81Var = (u81) this.f47135b;
                u81Var.getClass();
                u81Var.f50320b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u81Var.invalidate();
                return;
            case 13:
                y91 y91Var = (y91) this.f47135b;
                y91Var.getClass();
                y91Var.W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 14:
                v91 v91Var = (v91) this.f47135b;
                v91Var.getClass();
                v91Var.f50620j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v91Var.n0();
                return;
            case 15:
                w91 w91Var = (w91) this.f47135b;
                w91Var.getClass();
                w91Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ic1 ic1Var = (ic1) this.f47135b;
                ic1Var.getClass();
                ic1Var.f46614x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ic1Var.x();
                return;
        }
    }
}
