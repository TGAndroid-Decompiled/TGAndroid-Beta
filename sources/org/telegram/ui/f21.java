package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class f21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32671a;
    public final Object f32672b;

    public f21(Object obj, int i10) {
        this.f32671a = i10;
        this.f32672b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32671a) {
            case 0:
                h21 h21Var = (h21) this.f32672b;
                h21Var.f33255y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h21Var.a();
                return;
            case 1:
                u21 u21Var = (u21) this.f32672b;
                u21Var.f37098y = AndroidUtilities.lerp(u21Var.E, valueAnimator.getAnimatedFraction());
                u21Var.h.setTextColor(i0.a.d(u21Var.f37098y, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18325z6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false)));
                u21Var.f37094r.setAlpha((u21Var.f37098y / 2.0f) + 0.5f);
                return;
            case 2:
                ((k31) this.f32672b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                j31 j31Var = (j31) this.f32672b;
                j31Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j31Var.O.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = ((c51) this.f32672b).d;
                secretMediaViewer.f30549a0.f35612k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f30549a0.invalidate();
                return;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((c51) this.f32672b).d;
                secretMediaViewer2.f30549a0.f35612k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f30549a0.invalidate();
                return;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.om0) this.f32672b).f25843b).f30549a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                n51 n51Var = (n51) this.f32672b;
                n51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (n51Var.S) {
                    n51Var.N.invalidate();
                    return;
                }
                return;
            case 8:
                ((b61) this.f32672b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                a71 a71Var = (a71) this.f32672b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a71Var.f30817r = floatValue;
                View view = a71Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.sg0 sg0Var = a71Var.d;
                if (sg0Var != null) {
                    sg0Var.invalidate();
                    return;
                }
                return;
            case 10:
                h71 h71Var = (h71) this.f32672b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h71Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h71Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.wr.f28820g.getInterpolation(h71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(h71Var.L, i10, itemsCount, 4.0f);
                    k1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    k1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 11:
                k91.a0((k91) this.f32672b, valueAnimator);
                return;
            case 12:
                pa1 pa1Var = (pa1) this.f32672b;
                pa1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pa1Var.e.setAlpha(1.0f - floatValue3);
                hg.g gVar = pa1Var.f35753b;
                gVar.f9391z0.f11933f = floatValue3;
                pa1Var.f35754c.invalidate();
                gVar.invalidate();
                return;
            case 13:
                ae1 ae1Var = (ae1) this.f32672b;
                ae1Var.getClass();
                ae1Var.f30955o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ae1Var.f30976x0.invalidate();
                ae1Var.C0.invalidate();
                ae1Var.R1.setAlpha(ae1Var.f30955o1);
                ae1Var.Q1.invalidate();
                ae1Var.V0();
                return;
            case 14:
                ae1 ae1Var2 = ((od1) this.f32672b).f35470a;
                ae1Var2.f30955o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ae1Var2.f30976x0.invalidate();
                ae1Var2.C0.invalidate();
                ae1Var2.R1.setAlpha(ae1Var2.f30955o1);
                ae1Var2.Q1.invalidate();
                ae1Var2.V0();
                return;
            case 15:
                xe1 xe1Var = (xe1) this.f32672b;
                xe1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = xe1Var.f38694a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(xe1Var.f38694a.getChildAt(i11));
                    int i12 = xe1Var.d.e;
                    if (R >= i12 && i12 > 0) {
                        xe1Var.f38694a.getChildAt(i11).setAlpha(xe1Var.E);
                    } else {
                        xe1Var.f38694a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 16:
                cf1 cf1Var = (cf1) this.f32672b;
                cf1Var.getClass();
                cf1Var.f31659c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cf1Var.invalidate();
                return;
            case 17:
                ig1 ig1Var = (ig1) this.f32672b;
                ig1Var.getClass();
                ig1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                fg1 fg1Var = (fg1) this.f32672b;
                fg1Var.getClass();
                fg1Var.f32824f5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg1Var.f0();
                return;
            case 19:
                gg1 gg1Var = (gg1) this.f32672b;
                gg1Var.getClass();
                gg1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                zi1 zi1Var = (zi1) this.f32672b;
                zi1Var.getClass();
                zi1Var.f39401y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zi1Var.G();
                return;
        }
    }
}
