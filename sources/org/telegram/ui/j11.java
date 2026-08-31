package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class j11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37983a;
    public final Object f37984b;

    public j11(Object obj, int i10) {
        this.f37983a = i10;
        this.f37984b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37983a) {
            case 0:
                m11 m11Var = (m11) this.f37984b;
                m11Var.f38936y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m11Var.a();
                return;
            case 1:
                z11 z11Var = (z11) this.f37984b;
                z11Var.f43782y = AndroidUtilities.lerp(z11Var.B, valueAnimator.getAnimatedFraction());
                z11Var.h.setTextColor(i0.a.d(z11Var.f43782y, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22053z6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21894q6, false)));
                z11Var.f43778r.setAlpha((z11Var.f43782y / 2.0f) + 0.5f);
                return;
            case 2:
                ((o21) this.f37984b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                n21 n21Var = (n21) this.f37984b;
                n21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n21Var.L.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = ((g41) this.f37984b).d;
                secretMediaViewer.X.f42296h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.X.invalidate();
                return;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((g41) this.f37984b).d;
                secretMediaViewer2.X.f42296h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.X.invalidate();
                return;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.nm0) this.f37984b).f29565b).X.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                r41 r41Var = (r41) this.f37984b;
                r41Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (r41Var.P) {
                    r41Var.K.invalidate();
                    return;
                }
                return;
            case 8:
                ((h51) this.f37984b).f37333e.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                g61 g61Var = (g61) this.f37984b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g61Var.f37100r = floatValue;
                View view = g61Var.f37097e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                fg.y yVar = g61Var.d;
                if (yVar != null) {
                    yVar.invalidate();
                    return;
                }
                return;
            case 10:
                n61 n61Var = (n61) this.f37984b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n61Var.I = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = n61Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.l1 l1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.I;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.pr.f30184g.getInterpolation(n61Var.I));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(n61Var.I, i10, itemsCount, 4.0f);
                    l1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    l1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 11:
                p81.Z((p81) this.f37984b, valueAnimator);
                return;
            case 12:
                r91 r91Var = (r91) this.f37984b;
                r91Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r91Var.f40870e.setAlpha(1.0f - floatValue3);
                wf.g gVar = r91Var.f40868b;
                gVar.f49578w0.f50942f = floatValue3;
                r91Var.f40869c.invalidate();
                gVar.invalidate();
                return;
            case 13:
                ed1 ed1Var = (ed1) this.f37984b;
                ed1Var.getClass();
                ed1Var.l1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ed1Var.f36538u0.invalidate();
                ed1Var.f36551z0.invalidate();
                ed1Var.O1.setAlpha(ed1Var.l1);
                ed1Var.N1.invalidate();
                ed1Var.V0();
                return;
            case 14:
                ed1 ed1Var2 = ((sc1) this.f37984b).f41229a;
                ed1Var2.l1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ed1Var2.f36538u0.invalidate();
                ed1Var2.f36551z0.invalidate();
                ed1Var2.O1.setAlpha(ed1Var2.l1);
                ed1Var2.N1.invalidate();
                ed1Var2.V0();
                return;
            case 15:
                be1 be1Var = (be1) this.f37984b;
                be1Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = be1Var.f35491a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(be1Var.f35491a.getChildAt(i11));
                    int i12 = be1Var.d.f43607e;
                    if (R >= i12 && i12 > 0) {
                        be1Var.f35491a.getChildAt(i11).setAlpha(be1Var.B);
                    } else {
                        be1Var.f35491a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 16:
                ge1 ge1Var = (ge1) this.f37984b;
                ge1Var.getClass();
                ge1Var.f37180c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ge1Var.invalidate();
                return;
            case 17:
                mf1 mf1Var = (mf1) this.f37984b;
                mf1Var.getClass();
                mf1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                jf1 jf1Var = (jf1) this.f37984b;
                jf1Var.getClass();
                jf1Var.f38143c5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jf1Var.f0();
                return;
            case 19:
                kf1 kf1Var = (kf1) this.f37984b;
                kf1Var.getClass();
                kf1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ci1 ci1Var = (ci1) this.f37984b;
                ci1Var.getClass();
                ci1Var.f35856v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ci1Var.G();
                return;
        }
    }
}
