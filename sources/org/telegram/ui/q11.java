package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class q11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36723a;
    public final Object f36724b;

    public q11(Object obj, int i10) {
        this.f36723a = i10;
        this.f36724b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36723a) {
            case 0:
                s11 s11Var = (s11) this.f36724b;
                s11Var.f37570y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s11Var.a();
                return;
            case 1:
                f21 f21Var = (f21) this.f36724b;
                f21Var.f33531y = AndroidUtilities.lerp(f21Var.E, valueAnimator.getAnimatedFraction());
                f21Var.h.setTextColor(i0.a.d(f21Var.f33531y, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19461z6, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false)));
                f21Var.f33527r.setAlpha((f21Var.f33531y / 2.0f) + 0.5f);
                return;
            case 2:
                ((w21) this.f36724b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                v21 v21Var = (v21) this.f36724b;
                v21Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v21Var.O.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = ((q41) this.f36724b).d;
                secretMediaViewer.f31722a0.f34060k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f31722a0.invalidate();
                return;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((q41) this.f36724b).d;
                secretMediaViewer2.f31722a0.f34060k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f31722a0.invalidate();
                return;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.rm0) this.f36724b).f28009b).f31722a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                b51 b51Var = (b51) this.f36724b;
                b51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (b51Var.S) {
                    b51Var.N.invalidate();
                    return;
                }
                return;
            case 8:
                ((q51) this.f36724b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                p61 p61Var = (p61) this.f36724b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p61Var.f36412r = floatValue;
                View view = p61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.tg0 tg0Var = p61Var.d;
                if (tg0Var != null) {
                    tg0Var.invalidate();
                    return;
                }
                return;
            case 10:
                w61 w61Var = (w61) this.f36724b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w61Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w61Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.i1 i1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.sr.f28340g.getInterpolation(w61Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(w61Var.L, i10, itemsCount, 4.0f);
                    i1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    i1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 11:
                z81.a0((z81) this.f36724b, valueAnimator);
                return;
            case 12:
                ca1 ca1Var = (ca1) this.f36724b;
                ca1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ca1Var.e.setAlpha(1.0f - floatValue3);
                ig.g gVar = ca1Var.f32612b;
                gVar.f11161z0.f13625f = floatValue3;
                ca1Var.f32613c.invalidate();
                gVar.invalidate();
                return;
            case 13:
                od1 od1Var = (od1) this.f36724b;
                od1Var.getClass();
                od1Var.f36192o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                od1Var.f36213x0.invalidate();
                od1Var.C0.invalidate();
                od1Var.R1.setAlpha(od1Var.f36192o1);
                od1Var.Q1.invalidate();
                od1Var.V0();
                return;
            case 14:
                od1 od1Var2 = ((cd1) this.f36724b).f32689a;
                od1Var2.f36192o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                od1Var2.f36213x0.invalidate();
                od1Var2.C0.invalidate();
                od1Var2.R1.setAlpha(od1Var2.f36192o1);
                od1Var2.Q1.invalidate();
                od1Var2.V0();
                return;
            case 15:
                le1 le1Var = (le1) this.f36724b;
                le1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = le1Var.f35338a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(le1Var.f35338a.getChildAt(i11));
                    int i12 = le1Var.d.e;
                    if (R >= i12 && i12 > 0) {
                        le1Var.f35338a.getChildAt(i11).setAlpha(le1Var.E);
                    } else {
                        le1Var.f35338a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 16:
                qe1 qe1Var = (qe1) this.f36724b;
                qe1Var.getClass();
                qe1Var.f36874c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qe1Var.invalidate();
                return;
            case 17:
                wf1 wf1Var = (wf1) this.f36724b;
                wf1Var.getClass();
                wf1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                tf1 tf1Var = (tf1) this.f36724b;
                tf1Var.getClass();
                tf1Var.f38106f5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tf1Var.f0();
                return;
            case 19:
                uf1 uf1Var = (uf1) this.f36724b;
                uf1Var.getClass();
                uf1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                mi1 mi1Var = (mi1) this.f36724b;
                mi1Var.getClass();
                mi1Var.f35611y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mi1Var.G();
                return;
        }
    }
}
