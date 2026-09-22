package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class i21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34368a;
    public final Object f34369b;

    public i21(Object obj, int i10) {
        this.f34368a = i10;
        this.f34369b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34368a) {
            case 0:
                o21 o21Var = (o21) this.f34369b;
                o21Var.f36198y = AndroidUtilities.lerp(o21Var.E, valueAnimator.getAnimatedFraction());
                o21Var.h.setTextColor(i0.a.d(o21Var.f36198y, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19511z6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false)));
                o21Var.f36194r.setAlpha((o21Var.f36198y / 2.0f) + 0.5f);
                return;
            case 1:
                ((f31) this.f34369b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                e31 e31Var = (e31) this.f34369b;
                e31Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e31Var.O.invalidate();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = ((a51) this.f34369b).d;
                secretMediaViewer.f31742a0.f36405k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f31742a0.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer2 = ((a51) this.f34369b).d;
                secretMediaViewer2.f31742a0.f36405k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f31742a0.invalidate();
                return;
            case 5:
                ((SecretMediaViewer) ((org.telegram.ui.Components.sm0) this.f34369b).f28278b).f31742a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 6:
                l51 l51Var = (l51) this.f34369b;
                l51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (l51Var.S) {
                    l51Var.N.invalidate();
                    return;
                }
                return;
            case 7:
                ((z51) this.f34369b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 8:
                y61 y61Var = (y61) this.f34369b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y61Var.f39830r = floatValue;
                View view = y61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.vg0 vg0Var = y61Var.d;
                if (vg0Var != null) {
                    vg0Var.invalidate();
                    return;
                }
                return;
            case 9:
                f71 f71Var = (f71) this.f34369b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f71Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f71Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.qr.f27654g.getInterpolation(f71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(f71Var.L, i10, itemsCount, 4.0f);
                    j1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    j1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 10:
                i91.a0((i91) this.f34369b, valueAnimator);
                return;
            case 11:
                la1 la1Var = (la1) this.f34369b;
                la1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                la1Var.e.setAlpha(1.0f - floatValue3);
                ig.g gVar = la1Var.f35408b;
                gVar.f11175z0.f13637f = floatValue3;
                la1Var.f35409c.invalidate();
                gVar.invalidate();
                return;
            case 12:
                xd1 xd1Var = (xd1) this.f34369b;
                xd1Var.getClass();
                xd1Var.f39535o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd1Var.f39556x0.invalidate();
                xd1Var.C0.invalidate();
                xd1Var.R1.setAlpha(xd1Var.f39535o1);
                xd1Var.Q1.invalidate();
                xd1Var.V0();
                return;
            case 13:
                xd1 xd1Var2 = ((ld1) this.f34369b).f35442a;
                xd1Var2.f39535o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd1Var2.f39556x0.invalidate();
                xd1Var2.C0.invalidate();
                xd1Var2.R1.setAlpha(xd1Var2.f39535o1);
                xd1Var2.Q1.invalidate();
                xd1Var2.V0();
                return;
            case 14:
                ue1 ue1Var = (ue1) this.f34369b;
                ue1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = ue1Var.f38070a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int S = RecyclerView.S(ue1Var.f38070a.getChildAt(i11));
                    int i12 = ue1Var.d.e;
                    if (S >= i12 && i12 > 0) {
                        ue1Var.f38070a.getChildAt(i11).setAlpha(ue1Var.E);
                    } else {
                        ue1Var.f38070a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 15:
                ze1 ze1Var = (ze1) this.f34369b;
                ze1Var.getClass();
                ze1Var.f40227c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ze1Var.invalidate();
                return;
            case 16:
                fg1 fg1Var = (fg1) this.f34369b;
                fg1Var.getClass();
                fg1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 17:
                cg1 cg1Var = (cg1) this.f34369b;
                cg1Var.getClass();
                cg1Var.f32777f5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cg1Var.f0();
                return;
            case 18:
                dg1 dg1Var = (dg1) this.f34369b;
                dg1Var.getClass();
                dg1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ti1 ti1Var = (ti1) this.f34369b;
                ti1Var.getClass();
                ti1Var.f37837y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti1Var.G();
                return;
        }
    }
}
