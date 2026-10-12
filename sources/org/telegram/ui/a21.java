package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class a21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35679a;
    public final Object f35680b;

    public a21(Object obj, int i10) {
        this.f35679a = i10;
        this.f35680b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35679a) {
            case 0:
                c21 c21Var = (c21) this.f35680b;
                c21Var.f36311y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c21Var.a();
                return;
            case 1:
                q21 q21Var = (q21) this.f35680b;
                q21Var.f41160y = AndroidUtilities.lerp(q21Var.E, valueAnimator.getAnimatedFraction());
                q21Var.h.setTextColor(i0.a.d(q21Var.f41160y, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20963z6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false)));
                q21Var.f41156r.setAlpha((q21Var.f41160y / 2.0f) + 0.5f);
                return;
            case 2:
                ((g31) this.f35680b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                f31 f31Var = (f31) this.f35680b;
                f31Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f31Var.O.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = ((b51) this.f35680b).d;
                secretMediaViewer.f34250a0.f41730k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f34250a0.invalidate();
                return;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((b51) this.f35680b).d;
                secretMediaViewer2.f34250a0.f41730k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f34250a0.invalidate();
                return;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.qn0) this.f35680b).f29869b).f34250a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                n51 n51Var = (n51) this.f35680b;
                n51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (n51Var.S) {
                    n51Var.N.invalidate();
                    return;
                }
                return;
            case 8:
                ((d61) this.f35680b).f36665e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                c71 c71Var = (c71) this.f35680b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c71Var.f36359r = floatValue;
                View view = c71Var.f36356e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.oh0 oh0Var = c71Var.d;
                if (oh0Var != null) {
                    oh0Var.invalidate();
                    return;
                }
                return;
            case 10:
                j71 j71Var = (j71) this.f35680b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j71Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = j71Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.i1 i1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.js.f27628g.getInterpolation(j71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(j71Var.L, i10, itemsCount, 4.0f);
                    i1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    i1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 11:
                k91.a0((k91) this.f35680b, valueAnimator);
                return;
            case 12:
                na1 na1Var = (na1) this.f35680b;
                na1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                na1Var.f40339e.setAlpha(1.0f - floatValue3);
                ig.g gVar = na1Var.f40337b;
                gVar.f12199z0.f14858f = floatValue3;
                na1Var.f40338c.invalidate();
                gVar.invalidate();
                return;
            case 13:
                zd1 zd1Var = (zd1) this.f35680b;
                zd1Var.getClass();
                zd1Var.f44771o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zd1Var.f44792x0.invalidate();
                zd1Var.C0.invalidate();
                zd1Var.R1.setAlpha(zd1Var.f44771o1);
                zd1Var.Q1.invalidate();
                zd1Var.V0();
                return;
            case 14:
                zd1 zd1Var2 = ((nd1) this.f35680b).f40387a;
                zd1Var2.f44771o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zd1Var2.f44792x0.invalidate();
                zd1Var2.C0.invalidate();
                zd1Var2.R1.setAlpha(zd1Var2.f44771o1);
                zd1Var2.Q1.invalidate();
                zd1Var2.V0();
                return;
            case 15:
                we1 we1Var = (we1) this.f35680b;
                we1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = we1Var.f43145a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(we1Var.f43145a.getChildAt(i11));
                    int i12 = we1Var.d.f42175e;
                    if (R >= i12 && i12 > 0) {
                        we1Var.f43145a.getChildAt(i11).setAlpha(we1Var.E);
                    } else {
                        we1Var.f43145a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 16:
                bf1 bf1Var = (bf1) this.f35680b;
                bf1Var.getClass();
                bf1Var.f36156c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bf1Var.invalidate();
                return;
            case 17:
                hg1 hg1Var = (hg1) this.f35680b;
                hg1Var.getClass();
                hg1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                eg1 eg1Var = (eg1) this.f35680b;
                eg1Var.getClass();
                eg1Var.f37099j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg1Var.f0();
                return;
            case 19:
                fg1 fg1Var = (fg1) this.f35680b;
                fg1Var.getClass();
                fg1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                xi1 xi1Var = (xi1) this.f35680b;
                xi1Var.getClass();
                xi1Var.f44024y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xi1Var.F();
                return;
        }
    }
}
