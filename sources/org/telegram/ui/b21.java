package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class b21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34969a;
    public final Object f34970b;

    public b21(Object obj, int i10) {
        this.f34969a = i10;
        this.f34970b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34969a) {
            case 0:
                h21 h21Var = (h21) this.f34970b;
                h21Var.f36845y = AndroidUtilities.lerp(h21Var.E, valueAnimator.getAnimatedFraction());
                h21Var.h.setTextColor(i0.a.d(h21Var.f36845y, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21223z6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false)));
                h21Var.f36841r.setAlpha((h21Var.f36845y / 2.0f) + 0.5f);
                return;
            case 1:
                ((y21) this.f34970b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                x21 x21Var = (x21) this.f34970b;
                x21Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x21Var.O.invalidate();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = ((t41) this.f34970b).d;
                secretMediaViewer.f34403a0.f37763k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f34403a0.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer2 = ((t41) this.f34970b).d;
                secretMediaViewer2.f34403a0.f37763k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f34403a0.invalidate();
                return;
            case 5:
                ((SecretMediaViewer) ((org.telegram.ui.Components.wm0) this.f34970b).f32582b).f34403a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 6:
                e51 e51Var = (e51) this.f34970b;
                e51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (e51Var.S) {
                    e51Var.N.invalidate();
                    return;
                }
                return;
            case 7:
                ((s51) this.f34970b).f40364e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 8:
                r61 r61Var = (r61) this.f34970b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r61Var.f39932r = floatValue;
                View view = r61Var.f39929e;
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
                y61 y61Var = (y61) this.f34970b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y61Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = y61Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.tr.f31141g.getInterpolation(y61Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(y61Var.L, i10, itemsCount, 4.0f);
                    j1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    j1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 10:
                a91.T((a91) this.f34970b, valueAnimator);
                return;
            case 11:
                fa1 fa1Var = (fa1) this.f34970b;
                fa1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fa1Var.f36232e.setAlpha(1.0f - floatValue3);
                ig.g gVar = fa1Var.f36230b;
                gVar.f12153z0.f14814f = floatValue3;
                fa1Var.f36231c.invalidate();
                gVar.invalidate();
                return;
            case 12:
                rd1 rd1Var = (rd1) this.f34970b;
                rd1Var.getClass();
                rd1Var.f40073o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rd1Var.f40094x0.invalidate();
                rd1Var.C0.invalidate();
                rd1Var.R1.setAlpha(rd1Var.f40073o1);
                rd1Var.Q1.invalidate();
                rd1Var.V0();
                return;
            case 13:
                rd1 rd1Var2 = ((fd1) this.f34970b).f36275a;
                rd1Var2.f40073o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rd1Var2.f40094x0.invalidate();
                rd1Var2.C0.invalidate();
                rd1Var2.R1.setAlpha(rd1Var2.f40073o1);
                rd1Var2.Q1.invalidate();
                rd1Var2.V0();
                return;
            case 14:
                ne1 ne1Var = (ne1) this.f34970b;
                ne1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = ne1Var.f38955a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(ne1Var.f38955a.getChildAt(i11));
                    int i12 = ne1Var.d.f37959e;
                    if (R >= i12 && i12 > 0) {
                        ne1Var.f38955a.getChildAt(i11).setAlpha(ne1Var.E);
                    } else {
                        ne1Var.f38955a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 15:
                se1 se1Var = (se1) this.f34970b;
                se1Var.getClass();
                se1Var.f40469c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                se1Var.invalidate();
                return;
            case 16:
                yf1 yf1Var = (yf1) this.f34970b;
                yf1Var.getClass();
                yf1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 17:
                vf1 vf1Var = (vf1) this.f34970b;
                vf1Var.getClass();
                vf1Var.f41740f5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vf1Var.f0();
                return;
            case 18:
                wf1 wf1Var = (wf1) this.f34970b;
                wf1Var.getClass();
                wf1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                mi1 mi1Var = (mi1) this.f34970b;
                mi1Var.getClass();
                mi1Var.f38649y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mi1Var.G();
                return;
        }
    }
}
