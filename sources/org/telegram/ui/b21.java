package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class b21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32221a;
    public final Object f32222b;

    public b21(Object obj, int i10) {
        this.f32221a = i10;
        this.f32222b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32221a) {
            case 0:
                h21 h21Var = (h21) this.f32222b;
                h21Var.f34116y = AndroidUtilities.lerp(h21Var.E, valueAnimator.getAnimatedFraction());
                h21Var.h.setTextColor(i0.a.d(h21Var.f34116y, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19461z6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false)));
                h21Var.f34112r.setAlpha((h21Var.f34116y / 2.0f) + 0.5f);
                return;
            case 1:
                ((y21) this.f32222b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                x21 x21Var = (x21) this.f32222b;
                x21Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x21Var.O.invalidate();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = ((t41) this.f32222b).d;
                secretMediaViewer.f31725a0.f34858k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f31725a0.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer2 = ((t41) this.f32222b).d;
                secretMediaViewer2.f31725a0.f34858k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f31725a0.invalidate();
                return;
            case 5:
                ((SecretMediaViewer) ((org.telegram.ui.Components.sm0) this.f32222b).f28338b).f31725a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 6:
                e51 e51Var = (e51) this.f32222b;
                e51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (e51Var.S) {
                    e51Var.N.invalidate();
                    return;
                }
                return;
            case 7:
                ((s51) this.f32222b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 8:
                r61 r61Var = (r61) this.f32222b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r61Var.f37011r = floatValue;
                View view = r61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.vg0 vg0Var = r61Var.d;
                if (vg0Var != null) {
                    vg0Var.invalidate();
                    return;
                }
                return;
            case 9:
                y61 y61Var = (y61) this.f32222b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y61Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = y61Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.sr.f28360g.getInterpolation(y61Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(y61Var.L, i10, itemsCount, 4.0f);
                    k1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    k1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 10:
                a91.W((a91) this.f32222b, valueAnimator);
                return;
            case 11:
                ba1 ba1Var = (ba1) this.f32222b;
                ba1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ba1Var.e.setAlpha(1.0f - floatValue3);
                ig.g gVar = ba1Var.f32302b;
                gVar.f11164z0.f13627f = floatValue3;
                ba1Var.f32303c.invalidate();
                gVar.invalidate();
                return;
            case 12:
                pd1 pd1Var = (pd1) this.f32222b;
                pd1Var.getClass();
                pd1Var.f36431o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pd1Var.f36452x0.invalidate();
                pd1Var.C0.invalidate();
                pd1Var.R1.setAlpha(pd1Var.f36431o1);
                pd1Var.Q1.invalidate();
                pd1Var.V0();
                return;
            case 13:
                pd1 pd1Var2 = ((dd1) this.f32222b).f32940a;
                pd1Var2.f36431o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pd1Var2.f36452x0.invalidate();
                pd1Var2.C0.invalidate();
                pd1Var2.R1.setAlpha(pd1Var2.f36431o1);
                pd1Var2.Q1.invalidate();
                pd1Var2.V0();
                return;
            case 14:
                le1 le1Var = (le1) this.f32222b;
                le1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = le1Var.f35328a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int S = RecyclerView.S(le1Var.f35328a.getChildAt(i11));
                    int i12 = le1Var.d.e;
                    if (S >= i12 && i12 > 0) {
                        le1Var.f35328a.getChildAt(i11).setAlpha(le1Var.E);
                    } else {
                        le1Var.f35328a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 15:
                qe1 qe1Var = (qe1) this.f32222b;
                qe1Var.getClass();
                qe1Var.f36729c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qe1Var.invalidate();
                return;
            case 16:
                wf1 wf1Var = (wf1) this.f32222b;
                wf1Var.getClass();
                wf1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 17:
                tf1 tf1Var = (tf1) this.f32222b;
                tf1Var.getClass();
                tf1Var.f37777f5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tf1Var.f0();
                return;
            case 18:
                uf1 uf1Var = (uf1) this.f32222b;
                uf1Var.getClass();
                uf1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ki1 ki1Var = (ki1) this.f32222b;
                ki1Var.getClass();
                ki1Var.f35089y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ki1Var.G();
                return;
        }
    }
}
