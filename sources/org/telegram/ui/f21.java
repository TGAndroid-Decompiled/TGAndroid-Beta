package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class f21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35723a;
    public final Object f35724b;

    public f21(Object obj, int i10) {
        this.f35723a = i10;
        this.f35724b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35723a) {
            case 0:
                h21 h21Var = (h21) this.f35724b;
                h21Var.f36590y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h21Var.a();
                return;
            case 1:
                v21 v21Var = (v21) this.f35724b;
                v21Var.f40878y = AndroidUtilities.lerp(v21Var.E, valueAnimator.getAnimatedFraction());
                v21Var.h.setTextColor(i0.a.d(v21Var.f40878y, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20305z6, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q6, false)));
                v21Var.f40874r.setAlpha((v21Var.f40878y / 2.0f) + 0.5f);
                return;
            case 2:
                ((l31) this.f35724b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                k31 k31Var = (k31) this.f35724b;
                k31Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k31Var.O.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = ((g51) this.f35724b).d;
                secretMediaViewer.f32728a0.f41082k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f32728a0.invalidate();
                return;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((g51) this.f35724b).d;
                secretMediaViewer2.f32728a0.f41082k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f32728a0.invalidate();
                return;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.gn0) this.f35724b).f25369b).f32728a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                r51 r51Var = (r51) this.f35724b;
                r51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (r51Var.S) {
                    r51Var.N.invalidate();
                    return;
                }
                return;
            case 8:
                ((h61) this.f35724b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                g71 g71Var = (g71) this.f35724b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g71Var.f36332r = floatValue;
                View view = g71Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.jh0 jh0Var = g71Var.d;
                if (jh0Var != null) {
                    jh0Var.invalidate();
                    return;
                }
                return;
            case 10:
                n71 n71Var = (n71) this.f35724b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n71Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = n71Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.i1 i1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.es.f24772g.getInterpolation(n71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(n71Var.L, i10, itemsCount, 4.0f);
                    i1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    i1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 11:
                o91.a0((o91) this.f35724b, valueAnimator);
                return;
            case 12:
                ra1 ra1Var = (ra1) this.f35724b;
                ra1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ra1Var.e.setAlpha(1.0f - floatValue3);
                jg.g gVar = ra1Var.f39719b;
                gVar.f13073z0.f14729f = floatValue3;
                ra1Var.f39720c.invalidate();
                gVar.invalidate();
                return;
            case 13:
                ce1 ce1Var = (ce1) this.f35724b;
                ce1Var.getClass();
                ce1Var.f34894o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ce1Var.f34915x0.invalidate();
                ce1Var.C0.invalidate();
                ce1Var.R1.setAlpha(ce1Var.f34894o1);
                ce1Var.Q1.invalidate();
                ce1Var.V0();
                return;
            case 14:
                ce1 ce1Var2 = ((qd1) this.f35724b).f39392a;
                ce1Var2.f34894o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ce1Var2.f34915x0.invalidate();
                ce1Var2.C0.invalidate();
                ce1Var2.R1.setAlpha(ce1Var2.f34894o1);
                ce1Var2.Q1.invalidate();
                ce1Var2.V0();
                return;
            case 15:
                af1 af1Var = (af1) this.f35724b;
                af1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = af1Var.f34199a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(af1Var.f34199a.getChildAt(i11));
                    int i12 = af1Var.d.e;
                    if (R >= i12 && i12 > 0) {
                        af1Var.f34199a.getChildAt(i11).setAlpha(af1Var.E);
                    } else {
                        af1Var.f34199a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 16:
                ff1 ff1Var = (ff1) this.f35724b;
                ff1Var.getClass();
                ff1Var.f35825c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ff1Var.invalidate();
                return;
            case 17:
                lg1 lg1Var = (lg1) this.f35724b;
                lg1Var.getClass();
                lg1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                ig1 ig1Var = (ig1) this.f35724b;
                ig1Var.getClass();
                ig1Var.f37126j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig1Var.f0();
                return;
            case 19:
                jg1 jg1Var = (jg1) this.f35724b;
                jg1Var.getClass();
                jg1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                dj1 dj1Var = (dj1) this.f35724b;
                dj1Var.getClass();
                dj1Var.f35319y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dj1Var.F();
                return;
        }
    }
}
