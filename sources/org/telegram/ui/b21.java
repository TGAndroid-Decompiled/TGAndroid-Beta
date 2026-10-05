package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class b21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35026a;
    public final Object f35027b;

    public b21(Object obj, int i10) {
        this.f35026a = i10;
        this.f35027b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35026a) {
            case 0:
                h21 h21Var = (h21) this.f35027b;
                h21Var.f36875y = AndroidUtilities.lerp(h21Var.E, valueAnimator.getAnimatedFraction());
                h21Var.h.setTextColor(i0.a.d(h21Var.f36875y, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21233z6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false)));
                h21Var.f36871r.setAlpha((h21Var.f36875y / 2.0f) + 0.5f);
                return;
            case 1:
                ((y21) this.f35027b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                x21 x21Var = (x21) this.f35027b;
                x21Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x21Var.O.invalidate();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = ((r41) this.f35027b).d;
                secretMediaViewer.f34423a0.f37777k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f34423a0.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer2 = ((r41) this.f35027b).d;
                secretMediaViewer2.f34423a0.f37777k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f34423a0.invalidate();
                return;
            case 5:
                ((SecretMediaViewer) ((org.telegram.ui.Components.wm0) this.f35027b).f32671b).f34423a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 6:
                c51 c51Var = (c51) this.f35027b;
                c51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (c51Var.S) {
                    c51Var.N.invalidate();
                    return;
                }
                return;
            case 7:
                ((q51) this.f35027b).f39722e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 8:
                p61 p61Var = (p61) this.f35027b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p61Var.f39372r = floatValue;
                View view = p61Var.f39369e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.vg0 vg0Var = p61Var.d;
                if (vg0Var != null) {
                    vg0Var.invalidate();
                    return;
                }
                return;
            case 9:
                w61 w61Var = (w61) this.f35027b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w61Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w61Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.tr.f31216g.getInterpolation(w61Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(w61Var.L, i10, itemsCount, 4.0f);
                    j1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    j1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 10:
                y81 y81Var = (y81) this.f35027b;
                y81Var.getClass();
                y81Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                da1 da1Var = (da1) this.f35027b;
                da1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                da1Var.f35735e.setAlpha(1.0f - floatValue3);
                ig.g gVar = da1Var.f35733b;
                gVar.f12154z0.f14815f = floatValue3;
                da1Var.f35734c.invalidate();
                gVar.invalidate();
                return;
            case 12:
                pd1 pd1Var = (pd1) this.f35027b;
                pd1Var.getClass();
                pd1Var.f39529o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pd1Var.f39550x0.invalidate();
                pd1Var.C0.invalidate();
                pd1Var.R1.setAlpha(pd1Var.f39529o1);
                pd1Var.Q1.invalidate();
                pd1Var.V0();
                return;
            case 13:
                pd1 pd1Var2 = ((dd1) this.f35027b).f35789a;
                pd1Var2.f39529o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pd1Var2.f39550x0.invalidate();
                pd1Var2.C0.invalidate();
                pd1Var2.R1.setAlpha(pd1Var2.f39529o1);
                pd1Var2.Q1.invalidate();
                pd1Var2.V0();
                return;
            case 14:
                le1 le1Var = (le1) this.f35027b;
                le1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = le1Var.f38297a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(le1Var.f38297a.getChildAt(i11));
                    int i12 = le1Var.d.f37401e;
                    if (R >= i12 && i12 > 0) {
                        le1Var.f38297a.getChildAt(i11).setAlpha(le1Var.E);
                    } else {
                        le1Var.f38297a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 15:
                qe1 qe1Var = (qe1) this.f35027b;
                qe1Var.getClass();
                qe1Var.f39781c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qe1Var.invalidate();
                return;
            case 16:
                wf1 wf1Var = (wf1) this.f35027b;
                wf1Var.getClass();
                wf1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 17:
                tf1 tf1Var = (tf1) this.f35027b;
                tf1Var.getClass();
                tf1Var.f40877f5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tf1Var.f0();
                return;
            case 18:
                uf1 uf1Var = (uf1) this.f35027b;
                uf1Var.getClass();
                uf1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ki1 ki1Var = (ki1) this.f35027b;
                ki1Var.getClass();
                ki1Var.f38064y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ki1Var.G();
                return;
        }
    }
}
