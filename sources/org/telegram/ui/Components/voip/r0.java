package org.telegram.ui.Components.voip;

import ai.l4;
import ai.z5;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.mi1;
import org.telegram.ui.s00;
import org.telegram.ui.yd;
import org.telegram.ui.zt0;
import yh.c4;
import yh.k7;
import yh.l8;
import yh.y3;
public final class r0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29549a;
    public final Object f29550b;

    public r0(a6.i iVar, View view) {
        this.f29549a = 14;
        this.f29550b = iVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        yh.p2 p2Var;
        boolean z10;
        int i10 = this.f29549a;
        Object obj = this.f29550b;
        switch (i10) {
            case 0:
                s0 s0Var = (s0) obj;
                s0Var.getClass();
                s0Var.f29562i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 1:
                mi1 mi1Var = (mi1) obj;
                mi1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                b1 b1Var = mi1Var.f29272c;
                b1Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * mi1Var.E));
                b1Var.requestLayout();
                return;
            case 2:
                j1 j1Var = (j1) obj;
                j1Var.getClass();
                j1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                u1 u1Var = (u1) obj;
                u1Var.getClass();
                u1Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                return;
            case 4:
                m2 m2Var = (m2) obj;
                m2Var.getClass();
                m2Var.f29462s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2Var.f29457b.invalidate();
                return;
            case 5:
                l4 l4Var = (l4) obj;
                ((z5) l4Var.f1177b).f29034a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l4Var.invalidate();
                return;
            case 6:
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w1Var.U = floatValue;
                w1Var.V.setAlpha(floatValue);
                w1Var.invalidate();
                return;
            case 7:
                org.telegram.ui.k0 k0Var = (org.telegram.ui.k0) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.f39096a0 = floatValue2;
                k0Var.j(floatValue2);
                k0Var.f39098b0.setAlpha(k0Var.f39096a0);
                k0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * k0Var.f39096a0);
                k0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * k0Var.f39096a0);
                k0Var.invalidate();
                return;
            case 8:
                ((zt0) ((qg.x0) obj)).K.f31242e0.invalidate();
                return;
            case 9:
                qg.s1 s1Var = (qg.s1) obj;
                s1Var.getClass();
                s1Var.f41957n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                return;
            case 10:
                qg.z1 z1Var = (qg.z1) obj;
                z1Var.getClass();
                z1Var.f42063x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z1Var.invalidate();
                return;
            case 11:
                pg.n nVar = (pg.n) obj;
                nVar.f42063x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 12:
                qg.n2 n2Var = (qg.n2) obj;
                n2Var.getClass();
                n2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                qg.t2 t2Var = (qg.t2) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.f41982y = floatValue3;
                yd ydVar = t2Var.f41975c;
                ydVar.setAlpha(floatValue3);
                ydVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.f41982y));
                ydVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.f41982y));
                t2Var.f41974b.invalidate();
                return;
            case 14:
                ((View) ((g.b0) ((a6.i) obj).f302b).d.getParent()).invalidate();
                return;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.f22337l0;
                limitPreviewView.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue4 < 0.5f) {
                    f7 = (floatValue4 / 0.5f) * (-7.0f);
                } else {
                    f7 = (1.0f - ((floatValue4 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f22341b0 = f7;
                return;
            case 16:
                rg.p0 p0Var = (rg.p0) obj;
                p0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.d.invalidate();
                rg.o0 o0Var = p0Var.e;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
            case 17:
                ((rg.w1) obj).f42850a.f42832o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 18:
                tg.b bVar = (tg.b) obj;
                bVar.getClass();
                bVar.f43413b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            case 19:
                xg.i iVar = (xg.i) obj;
                iVar.getClass();
                iVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                y3 y3Var = (y3) obj;
                y3Var.Y0.f8876c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var.T1();
                return;
            case 21:
                ((yh.y2) obj).h.invalidate();
                return;
            case 22:
                yh.q2 q2Var = (yh.q2) obj;
                q2Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.E = floatValue5;
                if (floatValue5 >= 0.8f && (p2Var = q2Var.H) != null && (z10 = p2Var.f47910l) && z10) {
                    p2Var.f47910l = false;
                    p2Var.b();
                }
                q2Var.invalidate();
                return;
            case 23:
                View view = (View) obj;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                return;
            case 24:
                c4 c4Var = (c4) obj;
                c4Var.getClass();
                c4Var.f47325y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c4Var.invalidate();
                return;
            case 25:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s00 s00Var = ((k7) obj).f47680c;
                s00Var.setScaleX(floatValue6);
                s00Var.setScaleY(floatValue6);
                return;
            case 26:
                l8 l8Var = (l8) obj;
                l8Var.getClass();
                l8Var.f47731c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l8Var.invalidate();
                return;
            default:
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zg.s sVar = ((zg.u) obj).f49490b;
                if (sVar != null) {
                    sVar.setAlpha(floatValue7);
                    return;
                }
                return;
        }
    }

    public r0(Object obj, int i10) {
        this.f29549a = i10;
        this.f29550b = obj;
    }
}
