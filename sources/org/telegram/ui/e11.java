package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class e11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36369a;
    public final Object f36370b;

    public e11(Object obj, int i10) {
        this.f36369a = i10;
        this.f36370b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36369a) {
            case 0:
                g11 g11Var = (g11) this.f36370b;
                g11Var.f37113y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g11Var.b();
                return;
            case 1:
                u11 u11Var = (u11) this.f36370b;
                u11Var.f41867y = AndroidUtilities.lerp(u11Var.E, valueAnimator.getAnimatedFraction());
                u11Var.h.setTextColor(i0.b.f(u11Var.f41867y, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21391z6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false)));
                u11Var.f41863r.setAlpha((u11Var.f41867y / 2.0f) + 0.5f);
                return;
            case 2:
                SecretMediaViewer secretMediaViewer = ((o31) this.f36370b).d;
                secretMediaViewer.f33770a0.f42932k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f33770a0.invalidate();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer2 = ((o31) this.f36370b).d;
                secretMediaViewer2.f33770a0.f42932k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f33770a0.invalidate();
                return;
            case 4:
                ((SecretMediaViewer) ((org.telegram.ui.Components.cn0) this.f36370b).f25311b).f33770a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 5:
                z31 z31Var = (z31) this.f36370b;
                z31Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (z31Var.S) {
                    z31Var.N.invalidate();
                    return;
                }
                return;
            case 6:
                ((p41) this.f36370b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 7:
                o51 o51Var = (o51) this.f36370b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o51Var.f39663r = floatValue;
                View view = o51Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.dh0 dh0Var = o51Var.d;
                if (dh0Var != null) {
                    dh0Var.invalidate();
                    return;
                }
                return;
            case 8:
                v51 v51Var = (v51) this.f36370b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v51Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = v51Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.i1 i1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.bs.f25031g.getInterpolation(v51Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(v51Var.L, i10, itemsCount, 4.0f);
                    i1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    i1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 9:
                z71.a0((z71) this.f36370b, valueAnimator);
                return;
            case 10:
                b91 b91Var = (b91) this.f36370b;
                b91Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b91Var.e.setAlpha(1.0f - floatValue3);
                jg.g gVar = b91Var.f35605b;
                gVar.f14484z0.f16066f = floatValue3;
                b91Var.f35606c.invalidate();
                gVar.invalidate();
                return;
            case 11:
                mc1 mc1Var = (mc1) this.f36370b;
                mc1Var.getClass();
                mc1Var.f39138o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mc1Var.f39159x0.invalidate();
                mc1Var.C0.invalidate();
                mc1Var.R1.setAlpha(mc1Var.f39138o1);
                mc1Var.Q1.invalidate();
                mc1Var.V0();
                return;
            case 12:
                mc1 mc1Var2 = ((ac1) this.f36370b).f35391a;
                mc1Var2.f39138o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mc1Var2.f39159x0.invalidate();
                mc1Var2.C0.invalidate();
                mc1Var2.R1.setAlpha(mc1Var2.f39138o1);
                mc1Var2.Q1.invalidate();
                mc1Var2.V0();
                return;
            case 13:
                id1 id1Var = (id1) this.f36370b;
                id1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = id1Var.f37852a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(id1Var.f37852a.getChildAt(i11));
                    int i12 = id1Var.d.e;
                    if (R >= i12 && i12 > 0) {
                        id1Var.f37852a.getChildAt(i11).setAlpha(id1Var.E);
                    } else {
                        id1Var.f37852a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 14:
                nd1 nd1Var = (nd1) this.f36370b;
                nd1Var.getClass();
                nd1Var.f39429c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nd1Var.invalidate();
                return;
            case 15:
                te1 te1Var = (te1) this.f36370b;
                te1Var.getClass();
                te1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                qe1 qe1Var = (qe1) this.f36370b;
                qe1Var.getClass();
                qe1Var.f40411j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qe1Var.f0();
                return;
            case 17:
                re1 re1Var = (re1) this.f36370b;
                re1Var.getClass();
                re1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                jh1 jh1Var = (jh1) this.f36370b;
                jh1Var.getClass();
                jh1Var.f38217y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jh1Var.F();
                return;
        }
    }
}
