package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class c11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35780a;
    public final Object f35781b;

    public c11(Object obj, int i10) {
        this.f35780a = i10;
        this.f35781b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35780a) {
            case 0:
                e11 e11Var = (e11) this.f35781b;
                e11Var.f36517y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e11Var.b();
                return;
            case 1:
                s11 s11Var = (s11) this.f35781b;
                s11Var.f41318y = AndroidUtilities.lerp(s11Var.E, valueAnimator.getAnimatedFraction());
                s11Var.h.setTextColor(i0.a.f(s11Var.f41318y, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21392z6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false)));
                s11Var.f41314r.setAlpha((s11Var.f41318y / 2.0f) + 0.5f);
                return;
            case 2:
                SecretMediaViewer secretMediaViewer = ((m31) this.f35781b).d;
                secretMediaViewer.f33778a0.f42044k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f33778a0.invalidate();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer2 = ((m31) this.f35781b).d;
                secretMediaViewer2.f33778a0.f42044k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f33778a0.invalidate();
                return;
            case 4:
                ((SecretMediaViewer) ((org.telegram.ui.Components.cn0) this.f35781b).f25287b).f33778a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 5:
                x31 x31Var = (x31) this.f35781b;
                x31Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (x31Var.S) {
                    x31Var.N.invalidate();
                    return;
                }
                return;
            case 6:
                ((n41) this.f35781b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 7:
                m51 m51Var = (m51) this.f35781b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m51Var.f39112r = floatValue;
                View view = m51Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.dh0 dh0Var = m51Var.d;
                if (dh0Var != null) {
                    dh0Var.invalidate();
                    return;
                }
                return;
            case 8:
                t51 t51Var = (t51) this.f35781b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t51Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = t51Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.i1 i1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.bs.f25013g.getInterpolation(t51Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(t51Var.L, i10, itemsCount, 4.0f);
                    i1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    i1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 9:
                x71.a0((x71) this.f35781b, valueAnimator);
                return;
            case 10:
                z81 z81Var = (z81) this.f35781b;
                z81Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z81Var.e.setAlpha(1.0f - floatValue3);
                jg.g gVar = z81Var.f43665b;
                gVar.f14489z0.f16072f = floatValue3;
                z81Var.f43666c.invalidate();
                gVar.invalidate();
                return;
            case 11:
                kc1 kc1Var = (kc1) this.f35781b;
                kc1Var.getClass();
                kc1Var.f38551o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kc1Var.f38572x0.invalidate();
                kc1Var.C0.invalidate();
                kc1Var.R1.setAlpha(kc1Var.f38551o1);
                kc1Var.Q1.invalidate();
                kc1Var.V0();
                return;
            case 12:
                kc1 kc1Var2 = ((yb1) this.f35781b).f43437a;
                kc1Var2.f38551o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kc1Var2.f38572x0.invalidate();
                kc1Var2.C0.invalidate();
                kc1Var2.R1.setAlpha(kc1Var2.f38551o1);
                kc1Var2.Q1.invalidate();
                kc1Var2.V0();
                return;
            case 13:
                gd1 gd1Var = (gd1) this.f35781b;
                gd1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = gd1Var.f37278a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(gd1Var.f37278a.getChildAt(i11));
                    int i12 = gd1Var.d.e;
                    if (R >= i12 && i12 > 0) {
                        gd1Var.f37278a.getChildAt(i11).setAlpha(gd1Var.E);
                    } else {
                        gd1Var.f37278a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 14:
                ld1 ld1Var = (ld1) this.f35781b;
                ld1Var.getClass();
                ld1Var.f38894c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ld1Var.invalidate();
                return;
            case 15:
                re1 re1Var = (re1) this.f35781b;
                re1Var.getClass();
                re1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                oe1 oe1Var = (oe1) this.f35781b;
                oe1Var.getClass();
                oe1Var.f39866j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oe1Var.f0();
                return;
            case 17:
                pe1 pe1Var = (pe1) this.f35781b;
                pe1Var.getClass();
                pe1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                hh1 hh1Var = (hh1) this.f35781b;
                hh1Var.getClass();
                hh1Var.f37669y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hh1Var.F();
                return;
        }
    }
}
