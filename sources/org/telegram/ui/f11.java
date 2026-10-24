package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class f11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37171a;
    public final Object f37172b;

    public f11(Object obj, int i10) {
        this.f37171a = i10;
        this.f37172b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37171a) {
            case 0:
                h11 h11Var = (h11) this.f37172b;
                h11Var.f37719y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h11Var.b();
                return;
            case 1:
                v11 v11Var = (v11) this.f37172b;
                v11Var.f42545y = AndroidUtilities.lerp(v11Var.E, valueAnimator.getAnimatedFraction());
                v11Var.h.setTextColor(i0.a.f(v11Var.f42545y, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21589z6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false)));
                v11Var.f42541r.setAlpha((v11Var.f42545y / 2.0f) + 0.5f);
                return;
            case 2:
                SecretMediaViewer secretMediaViewer = ((p31) this.f37172b).d;
                secretMediaViewer.f34088a0.f43408k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f34088a0.invalidate();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer2 = ((p31) this.f37172b).d;
                secretMediaViewer2.f34088a0.f43408k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f34088a0.invalidate();
                return;
            case 4:
                ((SecretMediaViewer) ((org.telegram.ui.Components.fn0) this.f37172b).f26397b).f34088a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 5:
                a41 a41Var = (a41) this.f37172b;
                a41Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (a41Var.S) {
                    a41Var.N.invalidate();
                    return;
                }
                return;
            case 6:
                ((q41) this.f37172b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 7:
                p51 p51Var = (p51) this.f37172b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p51Var.f40340r = floatValue;
                View view = p51Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.gh0 gh0Var = p51Var.d;
                if (gh0Var != null) {
                    gh0Var.invalidate();
                    return;
                }
                return;
            case 8:
                w51 w51Var = (w51) this.f37172b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w51Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w51Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.i1 i1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.zr.f33338g.getInterpolation(w51Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(w51Var.L, i10, itemsCount, 4.0f);
                    i1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    i1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 9:
                b81.a0((b81) this.f37172b, valueAnimator);
                return;
            case 10:
                d91 d91Var = (d91) this.f37172b;
                d91Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d91Var.e.setAlpha(1.0f - floatValue3);
                jg.g gVar = d91Var.f36540b;
                gVar.f14534z0.f16135f = floatValue3;
                d91Var.f36541c.invalidate();
                gVar.invalidate();
                return;
            case 11:
                pc1 pc1Var = (pc1) this.f37172b;
                pc1Var.getClass();
                pc1Var.f40486p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pc1Var.f40508y0.invalidate();
                pc1Var.D0.invalidate();
                pc1Var.S1.setAlpha(pc1Var.f40486p1);
                pc1Var.R1.invalidate();
                pc1Var.V0();
                return;
            case 12:
                pc1 pc1Var2 = ((dc1) this.f37172b).f36583a;
                pc1Var2.f40486p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pc1Var2.f40508y0.invalidate();
                pc1Var2.D0.invalidate();
                pc1Var2.S1.setAlpha(pc1Var2.f40486p1);
                pc1Var2.R1.invalidate();
                pc1Var2.V0();
                return;
            case 13:
                ld1 ld1Var = (ld1) this.f37172b;
                ld1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = ld1Var.f39202a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(ld1Var.f39202a.getChildAt(i11));
                    int i12 = ld1Var.d.e;
                    if (R >= i12 && i12 > 0) {
                        ld1Var.f39202a.getChildAt(i11).setAlpha(ld1Var.E);
                    } else {
                        ld1Var.f39202a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 14:
                qd1 qd1Var = (qd1) this.f37172b;
                qd1Var.getClass();
                qd1Var.f40795c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qd1Var.invalidate();
                return;
            case 15:
                xe1 xe1Var = (xe1) this.f37172b;
                xe1Var.getClass();
                xe1Var.R0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                te1 te1Var = (te1) this.f37172b;
                te1Var.getClass();
                te1Var.f42034j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                te1Var.e0();
                return;
            case 17:
                ve1 ve1Var = (ve1) this.f37172b;
                ve1Var.getClass();
                ve1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                nh1 nh1Var = (nh1) this.f37172b;
                nh1Var.getClass();
                nh1Var.f39871y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nh1Var.F();
                return;
        }
    }
}
