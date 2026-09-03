package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class o11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36624a;
    public final Object f36625b;

    public o11(Object obj, int i10) {
        this.f36624a = i10;
        this.f36625b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36624a) {
            case 0:
                q11 q11Var = (q11) this.f36625b;
                q11Var.f37282y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q11Var.a();
                return;
            case 1:
                d21 d21Var = (d21) this.f36625b;
                d21Var.f33312y = AndroidUtilities.lerp(d21Var.B, valueAnimator.getAnimatedFraction());
                d21Var.h.setTextColor(i0.a.d(d21Var.f33312y, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20273z6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20115q6, false)));
                d21Var.f33308r.setAlpha((d21Var.f33312y / 2.0f) + 0.5f);
                return;
            case 2:
                ((u21) this.f36625b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                t21 t21Var = (t21) this.f36625b;
                t21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t21Var.L.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = ((l41) this.f36625b).d;
                secretMediaViewer.X.f32655h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.X.invalidate();
                return;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((l41) this.f36625b).d;
                secretMediaViewer2.X.f32655h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.X.invalidate();
                return;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.lm0) this.f36625b).f26803b).X.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                w41 w41Var = (w41) this.f36625b;
                w41Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (w41Var.P) {
                    w41Var.K.invalidate();
                    return;
                }
                return;
            case 8:
                ((m51) this.f36625b).e.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                l61 l61Var = (l61) this.f36625b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l61Var.f35660r = floatValue;
                View view = l61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                eg.y yVar = l61Var.d;
                if (yVar != null) {
                    yVar.invalidate();
                    return;
                }
                return;
            case 10:
                t61 t61Var = (t61) this.f36625b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t61Var.I = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = t61Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.l1 l1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.I;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.mr.f27123g.getInterpolation(t61Var.I));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(t61Var.I, i10, itemsCount, 4.0f);
                    l1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    l1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 11:
                w81.Z((w81) this.f36625b, valueAnimator);
                return;
            case 12:
                y91 y91Var = (y91) this.f36625b;
                y91Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y91Var.e.setAlpha(1.0f - floatValue3);
                vf.g gVar = y91Var.f40190b;
                gVar.f45818w0.f47064f = floatValue3;
                y91Var.f40191c.invalidate();
                gVar.invalidate();
                return;
            case 13:
                jd1 jd1Var = (jd1) this.f36625b;
                jd1Var.getClass();
                jd1Var.l1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jd1Var.f35230u0.invalidate();
                jd1Var.f35243z0.invalidate();
                jd1Var.O1.setAlpha(jd1Var.l1);
                jd1Var.N1.invalidate();
                jd1Var.V0();
                return;
            case 14:
                jd1 jd1Var2 = ((xc1) this.f36625b).f39959a;
                jd1Var2.l1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jd1Var2.f35230u0.invalidate();
                jd1Var2.f35243z0.invalidate();
                jd1Var2.O1.setAlpha(jd1Var2.l1);
                jd1Var2.N1.invalidate();
                jd1Var2.V0();
                return;
            case 15:
                ge1 ge1Var = (ge1) this.f36625b;
                ge1Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = ge1Var.f34427a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(ge1Var.f34427a.getChildAt(i11));
                    int i12 = ge1Var.d.e;
                    if (R >= i12 && i12 > 0) {
                        ge1Var.f34427a.getChildAt(i11).setAlpha(ge1Var.B);
                    } else {
                        ge1Var.f34427a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 16:
                le1 le1Var = (le1) this.f36625b;
                le1Var.getClass();
                le1Var.f35753c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                le1Var.invalidate();
                return;
            case 17:
                sf1 sf1Var = (sf1) this.f36625b;
                sf1Var.getClass();
                sf1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                pf1 pf1Var = (pf1) this.f36625b;
                pf1Var.getClass();
                pf1Var.f37120c5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pf1Var.f0();
                return;
            case 19:
                qf1 qf1Var = (qf1) this.f36625b;
                qf1Var.getClass();
                qf1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ii1 ii1Var = (ii1) this.f36625b;
                ii1Var.getClass();
                ii1Var.f34981v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ii1Var.G();
                return;
        }
    }
}
