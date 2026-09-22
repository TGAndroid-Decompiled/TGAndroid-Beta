package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class a21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31660a;
    public final Object f31661b;

    public a21(Object obj, int i10) {
        this.f31660a = i10;
        this.f31661b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31660a) {
            case 0:
                c21 c21Var = (c21) this.f31661b;
                c21Var.f32641y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c21Var.a();
                return;
            case 1:
                p21 p21Var = (p21) this.f31661b;
                p21Var.f36413y = AndroidUtilities.lerp(p21Var.E, valueAnimator.getAnimatedFraction());
                p21Var.h.setTextColor(i0.a.d(p21Var.f36413y, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19234z6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false)));
                p21Var.f36409r.setAlpha((p21Var.f36413y / 2.0f) + 0.5f);
                return;
            case 2:
                ((f31) this.f31661b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                e31 e31Var = (e31) this.f31661b;
                e31Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e31Var.O.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = ((x41) this.f31661b).d;
                secretMediaViewer.f31434a0.f36353k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f31434a0.invalidate();
                return;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((x41) this.f31661b).d;
                secretMediaViewer2.f31434a0.f36353k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f31434a0.invalidate();
                return;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.em0) this.f31661b).f23691b).f31434a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                i51 i51Var = (i51) this.f31661b;
                i51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (i51Var.S) {
                    i51Var.N.invalidate();
                    return;
                }
                return;
            case 8:
                ((x51) this.f31661b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                w61 w61Var = (w61) this.f31661b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w61Var.f38707r = floatValue;
                View view = w61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.ig0 ig0Var = w61Var.d;
                if (ig0Var != null) {
                    ig0Var.invalidate();
                    return;
                }
                return;
            case 10:
                d71 d71Var = (d71) this.f31661b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d71Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d71Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.qr.f27421g.getInterpolation(d71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(d71Var.L, i10, itemsCount, 4.0f);
                    j1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    j1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 11:
                f91.a0((f91) this.f31661b, valueAnimator);
                return;
            case 12:
                ja1 ja1Var = (ja1) this.f31661b;
                ja1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ja1Var.e.setAlpha(1.0f - floatValue3);
                ig.g gVar = ja1Var.f34830b;
                gVar.f11173z0.f13639f = floatValue3;
                ja1Var.f34831c.invalidate();
                gVar.invalidate();
                return;
            case 13:
                wd1 wd1Var = (wd1) this.f31661b;
                wd1Var.getClass();
                wd1Var.f38827o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wd1Var.f38848x0.invalidate();
                wd1Var.C0.invalidate();
                wd1Var.R1.setAlpha(wd1Var.f38827o1);
                wd1Var.Q1.invalidate();
                wd1Var.V0();
                return;
            case 14:
                wd1 wd1Var2 = ((kd1) this.f31661b).f35129a;
                wd1Var2.f38827o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wd1Var2.f38848x0.invalidate();
                wd1Var2.C0.invalidate();
                wd1Var2.R1.setAlpha(wd1Var2.f38827o1);
                wd1Var2.Q1.invalidate();
                wd1Var2.V0();
                return;
            case 15:
                te1 te1Var = (te1) this.f31661b;
                te1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = te1Var.f37648a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(te1Var.f37648a.getChildAt(i11));
                    int i12 = te1Var.d.e;
                    if (R >= i12 && i12 > 0) {
                        te1Var.f37648a.getChildAt(i11).setAlpha(te1Var.E);
                    } else {
                        te1Var.f37648a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 16:
                ye1 ye1Var = (ye1) this.f31661b;
                ye1Var.getClass();
                ye1Var.f39830c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ye1Var.invalidate();
                return;
            case 17:
                eg1 eg1Var = (eg1) this.f31661b;
                eg1Var.getClass();
                eg1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                bg1 bg1Var = (bg1) this.f31661b;
                bg1Var.getClass();
                bg1Var.f32154f5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bg1Var.f0();
                return;
            case 19:
                cg1 cg1Var = (cg1) this.f31661b;
                cg1Var.getClass();
                cg1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ui1 ui1Var = (ui1) this.f31661b;
                ui1Var.getClass();
                ui1Var.f38027y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui1Var.G();
                return;
        }
    }
}
