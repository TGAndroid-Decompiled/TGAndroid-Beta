package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class b21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34608a;
    public final Object f34609b;

    public b21(Object obj, int i10) {
        this.f34608a = i10;
        this.f34609b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34608a) {
            case 0:
                d21 d21Var = (d21) this.f34609b;
                d21Var.f35631y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d21Var.a();
                return;
            case 1:
                q21 q21Var = (q21) this.f34609b;
                q21Var.f39691y = AndroidUtilities.lerp(q21Var.E, valueAnimator.getAnimatedFraction());
                q21Var.h.setTextColor(i0.a.d(q21Var.f39691y, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21061z6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false)));
                q21Var.f39687r.setAlpha((q21Var.f39691y / 2.0f) + 0.5f);
                return;
            case 2:
                ((g31) this.f34609b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                f31 f31Var = (f31) this.f34609b;
                f31Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f31Var.O.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = ((z41) this.f34609b).d;
                secretMediaViewer.f34058a0.f39031k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f34058a0.invalidate();
                return;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((z41) this.f34609b).d;
                secretMediaViewer2.f34058a0.f39031k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f34058a0.invalidate();
                return;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.em0) this.f34609b).f25734b).f34058a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                k51 k51Var = (k51) this.f34609b;
                k51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (k51Var.S) {
                    k51Var.N.invalidate();
                    return;
                }
                return;
            case 8:
                ((z51) this.f34609b).f43298e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                y61 y61Var = (y61) this.f34609b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y61Var.f43006r = floatValue;
                View view = y61Var.f43003e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.ig0 ig0Var = y61Var.d;
                if (ig0Var != null) {
                    ig0Var.invalidate();
                    return;
                }
                return;
            case 10:
                f71 f71Var = (f71) this.f34609b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f71Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f71Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.pr.f29467g.getInterpolation(f71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(f71Var.L, i10, itemsCount, 4.0f);
                    j1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    j1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 11:
                i91.a0((i91) this.f34609b, valueAnimator);
                return;
            case 12:
                la1 la1Var = (la1) this.f34609b;
                la1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                la1Var.f38254e.setAlpha(1.0f - floatValue3);
                jg.g gVar = la1Var.f38252b;
                gVar.f13699z0.f15458f = floatValue3;
                la1Var.f38253c.invalidate();
                gVar.invalidate();
                return;
            case 13:
                wd1 wd1Var = (wd1) this.f34609b;
                wd1Var.getClass();
                wd1Var.f41956o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wd1Var.f41977x0.invalidate();
                wd1Var.C0.invalidate();
                wd1Var.R1.setAlpha(wd1Var.f41956o1);
                wd1Var.Q1.invalidate();
                wd1Var.V0();
                return;
            case 14:
                wd1 wd1Var2 = ((kd1) this.f34609b).f38010a;
                wd1Var2.f41956o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wd1Var2.f41977x0.invalidate();
                wd1Var2.C0.invalidate();
                wd1Var2.R1.setAlpha(wd1Var2.f41956o1);
                wd1Var2.Q1.invalidate();
                wd1Var2.V0();
                return;
            case 15:
                te1 te1Var = (te1) this.f34609b;
                te1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = te1Var.f40728a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(te1Var.f40728a.getChildAt(i11));
                    int i12 = te1Var.d.f39854e;
                    if (R >= i12 && i12 > 0) {
                        te1Var.f40728a.getChildAt(i11).setAlpha(te1Var.E);
                    } else {
                        te1Var.f40728a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 16:
                ye1 ye1Var = (ye1) this.f34609b;
                ye1Var.getClass();
                ye1Var.f43095c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ye1Var.invalidate();
                return;
            case 17:
                eg1 eg1Var = (eg1) this.f34609b;
                eg1Var.getClass();
                eg1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                bg1 bg1Var = (bg1) this.f34609b;
                bg1Var.getClass();
                bg1Var.f34800f5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bg1Var.f0();
                return;
            case 19:
                cg1 cg1Var = (cg1) this.f34609b;
                cg1Var.getClass();
                cg1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ui1 ui1Var = (ui1) this.f34609b;
                ui1Var.getClass();
                ui1Var.f41153y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui1Var.G();
                return;
        }
    }
}
