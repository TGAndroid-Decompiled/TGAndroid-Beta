package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class n11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39159a;
    public final Object f39160b;

    public n11(Object obj, int i10) {
        this.f39159a = i10;
        this.f39160b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39159a) {
            case 0:
                q11 q11Var = (q11) this.f39160b;
                q11Var.f40302y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q11Var.a();
                return;
            case 1:
                d21 d21Var = (d21) this.f39160b;
                d21Var.f35956y = AndroidUtilities.lerp(d21Var.B, valueAnimator.getAnimatedFraction());
                d21Var.h.setTextColor(i0.a.d(d21Var.f35956y, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22055z6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21896q6, false)));
                d21Var.f35952r.setAlpha((d21Var.f35956y / 2.0f) + 0.5f);
                return;
            case 2:
                ((u21) this.f39160b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                t21 t21Var = (t21) this.f39160b;
                t21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t21Var.L.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = ((l41) this.f39160b).d;
                secretMediaViewer.X.f35259h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.X.invalidate();
                return;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((l41) this.f39160b).d;
                secretMediaViewer2.X.f35259h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.X.invalidate();
                return;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.mm0) this.f39160b).f29180b).X.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                w41 w41Var = (w41) this.f39160b;
                w41Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (w41Var.P) {
                    w41Var.K.invalidate();
                    return;
                }
                return;
            case 8:
                ((m51) this.f39160b).f38860e.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                l61 l61Var = (l61) this.f39160b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l61Var.f38557r = floatValue;
                View view = l61Var.f38554e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                fg.y yVar = l61Var.d;
                if (yVar != null) {
                    yVar.invalidate();
                    return;
                }
                return;
            case 10:
                s61 s61Var = (s61) this.f39160b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s61Var.I = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = s61Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.l1 l1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.I;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.pr.f30169g.getInterpolation(s61Var.I));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(s61Var.I, i10, itemsCount, 4.0f);
                    l1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    l1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 11:
                v81.Z((v81) this.f39160b, valueAnimator);
                return;
            case 12:
                x91 x91Var = (x91) this.f39160b;
                x91Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x91Var.f42968e.setAlpha(1.0f - floatValue3);
                wf.g gVar = x91Var.f42966b;
                gVar.f49615w0.f50979f = floatValue3;
                x91Var.f42967c.invalidate();
                gVar.invalidate();
                return;
            case 13:
                jd1 jd1Var = (jd1) this.f39160b;
                jd1Var.getClass();
                jd1Var.l1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jd1Var.f38013u0.invalidate();
                jd1Var.f38026z0.invalidate();
                jd1Var.O1.setAlpha(jd1Var.l1);
                jd1Var.N1.invalidate();
                jd1Var.V0();
                return;
            case 14:
                jd1 jd1Var2 = ((xc1) this.f39160b).f43014a;
                jd1Var2.l1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jd1Var2.f38013u0.invalidate();
                jd1Var2.f38026z0.invalidate();
                jd1Var2.O1.setAlpha(jd1Var2.l1);
                jd1Var2.N1.invalidate();
                jd1Var2.V0();
                return;
            case 15:
                he1 he1Var = (he1) this.f39160b;
                he1Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = he1Var.f37354a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(he1Var.f37354a.getChildAt(i11));
                    int i12 = he1Var.d.f36467e;
                    if (R >= i12 && i12 > 0) {
                        he1Var.f37354a.getChildAt(i11).setAlpha(he1Var.B);
                    } else {
                        he1Var.f37354a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 16:
                me1 me1Var = (me1) this.f39160b;
                me1Var.getClass();
                me1Var.f38963c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                me1Var.invalidate();
                return;
            case 17:
                sf1 sf1Var = (sf1) this.f39160b;
                sf1Var.getClass();
                sf1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                pf1 pf1Var = (pf1) this.f39160b;
                pf1Var.getClass();
                pf1Var.f40005c5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pf1Var.f0();
                return;
            case 19:
                qf1 qf1Var = (qf1) this.f39160b;
                qf1Var.getClass();
                qf1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ii1 ii1Var = (ii1) this.f39160b;
                ii1Var.getClass();
                ii1Var.f37708v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ii1Var.G();
                return;
        }
    }
}
