package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class i21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34348a;
    public final Object f34349b;

    public i21(Object obj, int i10) {
        this.f34348a = i10;
        this.f34349b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34348a) {
            case 0:
                o21 o21Var = (o21) this.f34349b;
                o21Var.f36180y = AndroidUtilities.lerp(o21Var.E, valueAnimator.getAnimatedFraction());
                o21Var.h.setTextColor(i0.a.d(o21Var.f36180y, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19496z6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false)));
                o21Var.f36176r.setAlpha((o21Var.f36180y / 2.0f) + 0.5f);
                return;
            case 1:
                ((f31) this.f34349b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                e31 e31Var = (e31) this.f34349b;
                e31Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e31Var.O.invalidate();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = ((a51) this.f34349b).d;
                secretMediaViewer.f31721a0.f36378k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f31721a0.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer2 = ((a51) this.f34349b).d;
                secretMediaViewer2.f31721a0.f36378k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f31721a0.invalidate();
                return;
            case 5:
                ((SecretMediaViewer) ((org.telegram.ui.Components.qm0) this.f34349b).f27614b).f31721a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 6:
                l51 l51Var = (l51) this.f34349b;
                l51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (l51Var.S) {
                    l51Var.N.invalidate();
                    return;
                }
                return;
            case 7:
                ((z51) this.f34349b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 8:
                y61 y61Var = (y61) this.f34349b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y61Var.f39810r = floatValue;
                View view = y61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.sg0 sg0Var = y61Var.d;
                if (sg0Var != null) {
                    sg0Var.invalidate();
                    return;
                }
                return;
            case 9:
                f71 f71Var = (f71) this.f34349b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f71Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f71Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.qr.f27643g.getInterpolation(f71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(f71Var.L, i10, itemsCount, 4.0f);
                    j1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    j1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 10:
                i91.a0((i91) this.f34349b, valueAnimator);
                return;
            case 11:
                la1 la1Var = (la1) this.f34349b;
                la1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                la1Var.e.setAlpha(1.0f - floatValue3);
                ig.g gVar = la1Var.f35390b;
                gVar.f11175z0.f13639f = floatValue3;
                la1Var.f35391c.invalidate();
                gVar.invalidate();
                return;
            case 12:
                xd1 xd1Var = (xd1) this.f34349b;
                xd1Var.getClass();
                xd1Var.f39511o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd1Var.f39532x0.invalidate();
                xd1Var.C0.invalidate();
                xd1Var.R1.setAlpha(xd1Var.f39511o1);
                xd1Var.Q1.invalidate();
                xd1Var.V0();
                return;
            case 13:
                xd1 xd1Var2 = ((ld1) this.f34349b).f35424a;
                xd1Var2.f39511o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd1Var2.f39532x0.invalidate();
                xd1Var2.C0.invalidate();
                xd1Var2.R1.setAlpha(xd1Var2.f39511o1);
                xd1Var2.Q1.invalidate();
                xd1Var2.V0();
                return;
            case 14:
                ue1 ue1Var = (ue1) this.f34349b;
                ue1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = ue1Var.f38069a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int S = RecyclerView.S(ue1Var.f38069a.getChildAt(i11));
                    int i12 = ue1Var.d.e;
                    if (S >= i12 && i12 > 0) {
                        ue1Var.f38069a.getChildAt(i11).setAlpha(ue1Var.E);
                    } else {
                        ue1Var.f38069a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 15:
                ze1 ze1Var = (ze1) this.f34349b;
                ze1Var.getClass();
                ze1Var.f40205c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ze1Var.invalidate();
                return;
            case 16:
                fg1 fg1Var = (fg1) this.f34349b;
                fg1Var.getClass();
                fg1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 17:
                cg1 cg1Var = (cg1) this.f34349b;
                cg1Var.getClass();
                cg1Var.f32757f5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cg1Var.f0();
                return;
            case 18:
                dg1 dg1Var = (dg1) this.f34349b;
                dg1Var.getClass();
                dg1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ti1 ti1Var = (ti1) this.f34349b;
                ti1Var.getClass();
                ti1Var.f37814y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti1Var.G();
                return;
        }
    }
}
