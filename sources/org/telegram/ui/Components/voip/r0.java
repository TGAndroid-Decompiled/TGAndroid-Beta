package org.telegram.ui.Components.voip;

import ai.l4;
import ai.y5;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.fi1;
import org.telegram.ui.p00;
import org.telegram.ui.st0;
import org.telegram.ui.xd;
import yh.c4;
import yh.k7;
import yh.l8;
import yh.y3;
public final class r0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29155a;
    public final Object f29156b;

    public r0(a6.i iVar, View view) {
        this.f29155a = 14;
        this.f29156b = iVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        yh.p2 p2Var;
        boolean z10;
        int i10 = this.f29155a;
        Object obj = this.f29156b;
        switch (i10) {
            case 0:
                s0 s0Var = (s0) obj;
                s0Var.getClass();
                s0Var.f29168i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 1:
                fi1 fi1Var = (fi1) obj;
                fi1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                b1 b1Var = fi1Var.f28878c;
                b1Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * fi1Var.E));
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
                m2Var.f29068s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2Var.f29063b.invalidate();
                return;
            case 5:
                l4 l4Var = (l4) obj;
                ((y5) l4Var.f1180b).f29579a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l4Var.invalidate();
                return;
            case 6:
                org.telegram.ui.web.u1 u1Var2 = (org.telegram.ui.web.u1) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var2.U = floatValue;
                u1Var2.V.setAlpha(floatValue);
                u1Var2.invalidate();
                return;
            case 7:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f38846a0 = floatValue2;
                l0Var.j(floatValue2);
                l0Var.f38848b0.setAlpha(l0Var.f38846a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.f38846a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.f38846a0);
                l0Var.invalidate();
                return;
            case 8:
                ((st0) ((qg.z0) obj)).K.f30908e0.invalidate();
                return;
            case 9:
                qg.u1 u1Var3 = (qg.u1) obj;
                u1Var3.getClass();
                u1Var3.f41620n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var3.invalidate();
                return;
            case 10:
                qg.b2 b2Var = (qg.b2) obj;
                b2Var.getClass();
                b2Var.f41271x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b2Var.invalidate();
                return;
            case 11:
                pg.n nVar = (pg.n) obj;
                nVar.f41271x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 12:
                qg.p2 p2Var2 = (qg.p2) obj;
                p2Var2.getClass();
                p2Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                qg.v2 v2Var = (qg.v2) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.f41645y = floatValue3;
                xd xdVar = v2Var.f41638c;
                xdVar.setAlpha(floatValue3);
                xdVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.f41645y));
                xdVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.f41645y));
                v2Var.f41637b.invalidate();
                return;
            case 14:
                ((View) ((g.b0) ((a6.i) obj).f303b).d.getParent()).invalidate();
                return;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.f22071l0;
                limitPreviewView.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue4 < 0.5f) {
                    f7 = (floatValue4 / 0.5f) * (-7.0f);
                } else {
                    f7 = (1.0f - ((floatValue4 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f22075b0 = f7;
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
                ((rg.v1) obj).f42473a.f42458o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 18:
                tg.b bVar = (tg.b) obj;
                bVar.getClass();
                bVar.f43037b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            case 19:
                xg.i iVar = (xg.i) obj;
                iVar.getClass();
                iVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                y3 y3Var = (y3) obj;
                y3Var.Y0.f8860c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                if (floatValue5 >= 0.8f && (p2Var = q2Var.H) != null && (z10 = p2Var.f47538l) && z10) {
                    p2Var.f47538l = false;
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
                c4Var.f46953y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c4Var.invalidate();
                return;
            case 25:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p00 p00Var = ((k7) obj).f47306c;
                p00Var.setScaleX(floatValue6);
                p00Var.setScaleY(floatValue6);
                return;
            case 26:
                l8 l8Var = (l8) obj;
                l8Var.getClass();
                l8Var.f47361c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l8Var.invalidate();
                return;
            default:
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zg.s sVar = ((zg.t) obj).f49113b;
                if (sVar != null) {
                    sVar.setAlpha(floatValue7);
                    return;
                }
                return;
        }
    }

    public r0(Object obj, int i10) {
        this.f29155a = i10;
        this.f29156b = obj;
    }
}
