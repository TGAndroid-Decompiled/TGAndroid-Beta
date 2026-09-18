package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class i21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34300a;
    public final Object f34301b;

    public i21(Object obj, int i10) {
        this.f34300a = i10;
        this.f34301b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34300a) {
            case 0:
                o21 o21Var = (o21) this.f34301b;
                o21Var.f36103y = AndroidUtilities.lerp(o21Var.E, valueAnimator.getAnimatedFraction());
                o21Var.h.setTextColor(i0.a.d(o21Var.f36103y, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19464z6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false)));
                o21Var.f36099r.setAlpha((o21Var.f36103y / 2.0f) + 0.5f);
                return;
            case 1:
                ((e31) this.f34301b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                d31 d31Var = (d31) this.f34301b;
                d31Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d31Var.O.invalidate();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = ((x41) this.f34301b).d;
                secretMediaViewer.f31681a0.f36250k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f31681a0.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer2 = ((x41) this.f34301b).d;
                secretMediaViewer2.f31681a0.f36250k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f31681a0.invalidate();
                return;
            case 5:
                ((SecretMediaViewer) ((org.telegram.ui.Components.rm0) this.f34301b).f27933b).f31681a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 6:
                i51 i51Var = (i51) this.f34301b;
                i51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (i51Var.S) {
                    i51Var.N.invalidate();
                    return;
                }
                return;
            case 7:
                ((w51) this.f34301b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 8:
                v61 v61Var = (v61) this.f34301b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v61Var.f38318r = floatValue;
                View view = v61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.tg0 tg0Var = v61Var.d;
                if (tg0Var != null) {
                    tg0Var.invalidate();
                    return;
                }
                return;
            case 9:
                c71 c71Var = (c71) this.f34301b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c71Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c71Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.qr.f27716g.getInterpolation(c71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(c71Var.L, i10, itemsCount, 4.0f);
                    j1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    j1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 10:
                f91.a0((f91) this.f34301b, valueAnimator);
                return;
            case 11:
                ja1 ja1Var = (ja1) this.f34301b;
                ja1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ja1Var.e.setAlpha(1.0f - floatValue3);
                ig.g gVar = ja1Var.f34771b;
                gVar.f11174z0.f13638f = floatValue3;
                ja1Var.f34772c.invalidate();
                gVar.invalidate();
                return;
            case 12:
                vd1 vd1Var = (vd1) this.f34301b;
                vd1Var.getClass();
                vd1Var.f38508o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vd1Var.f38529x0.invalidate();
                vd1Var.C0.invalidate();
                vd1Var.R1.setAlpha(vd1Var.f38508o1);
                vd1Var.Q1.invalidate();
                vd1Var.V0();
                return;
            case 13:
                vd1 vd1Var2 = ((jd1) this.f34301b).f34846a;
                vd1Var2.f38508o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vd1Var2.f38529x0.invalidate();
                vd1Var2.C0.invalidate();
                vd1Var2.R1.setAlpha(vd1Var2.f38508o1);
                vd1Var2.Q1.invalidate();
                vd1Var2.V0();
                return;
            case 14:
                se1 se1Var = (se1) this.f34301b;
                se1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = se1Var.f37265a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int S = RecyclerView.S(se1Var.f37265a.getChildAt(i11));
                    int i12 = se1Var.d.e;
                    if (S >= i12 && i12 > 0) {
                        se1Var.f37265a.getChildAt(i11).setAlpha(se1Var.E);
                    } else {
                        se1Var.f37265a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 15:
                xe1 xe1Var = (xe1) this.f34301b;
                xe1Var.getClass();
                xe1Var.f39447c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xe1Var.invalidate();
                return;
            case 16:
                dg1 dg1Var = (dg1) this.f34301b;
                dg1Var.getClass();
                dg1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 17:
                ag1 ag1Var = (ag1) this.f34301b;
                ag1Var.getClass();
                ag1Var.f32063f5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ag1Var.f0();
                return;
            case 18:
                bg1 bg1Var = (bg1) this.f34301b;
                bg1Var.getClass();
                bg1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                si1 si1Var = (si1) this.f34301b;
                si1Var.getClass();
                si1Var.f37340y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si1Var.G();
                return;
        }
    }
}
