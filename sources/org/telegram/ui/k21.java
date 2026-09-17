package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class k21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34977a;
    public final Object f34978b;

    public k21(Object obj, int i10) {
        this.f34977a = i10;
        this.f34978b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34977a) {
            case 0:
                q21 q21Var = (q21) this.f34978b;
                q21Var.f36790y = AndroidUtilities.lerp(q21Var.E, valueAnimator.getAnimatedFraction());
                q21Var.h.setTextColor(i0.a.d(q21Var.f36790y, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19263z6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false)));
                q21Var.f36786r.setAlpha((q21Var.f36790y / 2.0f) + 0.5f);
                return;
            case 1:
                ((g31) this.f34978b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                f31 f31Var = (f31) this.f34978b;
                f31Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f31Var.O.invalidate();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = ((z41) this.f34978b).d;
                secretMediaViewer.f31450a0.f37031k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f31450a0.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer2 = ((z41) this.f34978b).d;
                secretMediaViewer2.f31450a0.f37031k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f31450a0.invalidate();
                return;
            case 5:
                ((SecretMediaViewer) ((org.telegram.ui.Components.fm0) this.f34978b).f23963b).f31450a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 6:
                k51 k51Var = (k51) this.f34978b;
                k51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (k51Var.S) {
                    k51Var.N.invalidate();
                    return;
                }
                return;
            case 7:
                ((y51) this.f34978b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 8:
                x61 x61Var = (x61) this.f34978b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x61Var.f39395r = floatValue;
                View view = x61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.jg0 jg0Var = x61Var.d;
                if (jg0Var != null) {
                    jg0Var.invalidate();
                    return;
                }
                return;
            case 9:
                e71 e71Var = (e71) this.f34978b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e71Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e71Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.qr.f27381g.getInterpolation(e71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(e71Var.L, i10, itemsCount, 4.0f);
                    k1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    k1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 10:
                g91.a0((g91) this.f34978b, valueAnimator);
                return;
            case 11:
                ka1 ka1Var = (ka1) this.f34978b;
                ka1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ka1Var.e.setAlpha(1.0f - floatValue3);
                ig.g gVar = ka1Var.f35174b;
                gVar.f11174z0.f13640f = floatValue3;
                ka1Var.f35175c.invalidate();
                gVar.invalidate();
                return;
            case 12:
                xd1 xd1Var = (xd1) this.f34978b;
                xd1Var.getClass();
                xd1Var.f39572o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd1Var.f39593x0.invalidate();
                xd1Var.C0.invalidate();
                xd1Var.R1.setAlpha(xd1Var.f39572o1);
                xd1Var.Q1.invalidate();
                xd1Var.V0();
                return;
            case 13:
                xd1 xd1Var2 = ((ld1) this.f34978b).f35501a;
                xd1Var2.f39572o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd1Var2.f39593x0.invalidate();
                xd1Var2.C0.invalidate();
                xd1Var2.R1.setAlpha(xd1Var2.f39572o1);
                xd1Var2.Q1.invalidate();
                xd1Var2.V0();
                return;
            case 14:
                ue1 ue1Var = (ue1) this.f34978b;
                ue1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = ue1Var.f38052a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int S = RecyclerView.S(ue1Var.f38052a.getChildAt(i11));
                    int i12 = ue1Var.d.e;
                    if (S >= i12 && i12 > 0) {
                        ue1Var.f38052a.getChildAt(i11).setAlpha(ue1Var.E);
                    } else {
                        ue1Var.f38052a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 15:
                ze1 ze1Var = (ze1) this.f34978b;
                ze1Var.getClass();
                ze1Var.f40240c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ze1Var.invalidate();
                return;
            case 16:
                fg1 fg1Var = (fg1) this.f34978b;
                fg1Var.getClass();
                fg1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 17:
                cg1 cg1Var = (cg1) this.f34978b;
                cg1Var.getClass();
                cg1Var.f32799f5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cg1Var.f0();
                return;
            case 18:
                dg1 dg1Var = (dg1) this.f34978b;
                dg1Var.getClass();
                dg1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ti1 ti1Var = (ti1) this.f34978b;
                ti1Var.getClass();
                ti1Var.f37801y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti1Var.G();
                return;
        }
    }
}
