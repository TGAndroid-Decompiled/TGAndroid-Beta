package org.telegram.ui.Components.voip;

import ai.l4;
import ai.y5;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.fi1;
import org.telegram.ui.o00;
import org.telegram.ui.rt0;
import org.telegram.ui.xd;
import yh.b4;
import yh.k7;
import yh.l8;
import yh.x3;
public final class r0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29579a;
    public final Object f29580b;

    public r0(a6.i iVar, View view) {
        this.f29579a = 14;
        this.f29580b = iVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        yh.o2 o2Var;
        boolean z10;
        int i10 = this.f29579a;
        Object obj = this.f29580b;
        switch (i10) {
            case 0:
                s0 s0Var = (s0) obj;
                s0Var.getClass();
                s0Var.f29602i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 1:
                fi1 fi1Var = (fi1) obj;
                fi1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                b1 b1Var = fi1Var.f29303c;
                b1Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * fi1Var.E));
                b1Var.requestLayout();
                return;
            case 2:
                k1 k1Var = (k1) obj;
                k1Var.getClass();
                k1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                v1 v1Var = (v1) obj;
                v1Var.getClass();
                v1Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var.invalidate();
                return;
            case 4:
                n2 n2Var = (n2) obj;
                n2Var.getClass();
                n2Var.f29510s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var.f29505b.invalidate();
                return;
            case 5:
                l4 l4Var = (l4) obj;
                ((y5) l4Var.f1180b).f29942a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l4Var.invalidate();
                return;
            case 6:
                org.telegram.ui.web.v1 v1Var2 = (org.telegram.ui.web.v1) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var2.U = floatValue;
                v1Var2.V.setAlpha(floatValue);
                v1Var2.invalidate();
                return;
            case 7:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f39227a0 = floatValue2;
                l0Var.j(floatValue2);
                l0Var.f39229b0.setAlpha(l0Var.f39227a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.f39227a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.f39227a0);
                l0Var.invalidate();
                return;
            case 8:
                ((rt0) ((qg.x0) obj)).K.f31223e0.invalidate();
                return;
            case 9:
                qg.s1 s1Var = (qg.s1) obj;
                s1Var.getClass();
                s1Var.f41922n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                return;
            case 10:
                qg.z1 z1Var = (qg.z1) obj;
                z1Var.getClass();
                z1Var.f42028x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z1Var.invalidate();
                return;
            case 11:
                pg.n nVar = (pg.n) obj;
                nVar.f42028x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 12:
                qg.n2 n2Var2 = (qg.n2) obj;
                n2Var2.getClass();
                n2Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                qg.t2 t2Var = (qg.t2) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.f41947y = floatValue3;
                xd xdVar = t2Var.f41940c;
                xdVar.setAlpha(floatValue3);
                xdVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.f41947y));
                xdVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.f41947y));
                t2Var.f41939b.invalidate();
                return;
            case 14:
                ((View) ((g.b0) ((a6.i) obj).f303b).d.getParent()).invalidate();
                return;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.f22322l0;
                limitPreviewView.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue4 < 0.5f) {
                    f7 = (floatValue4 / 0.5f) * (-7.0f);
                } else {
                    f7 = (1.0f - ((floatValue4 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f22326b0 = f7;
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
                ((rg.w1) obj).f42815a.f42797o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 18:
                tg.b bVar = (tg.b) obj;
                bVar.getClass();
                bVar.f43378b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            case 19:
                xg.i iVar = (xg.i) obj;
                iVar.getClass();
                iVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                x3 x3Var = (x3) obj;
                x3Var.Y0.f8859c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var.T1();
                return;
            case 21:
                ((yh.x2) obj).h.invalidate();
                return;
            case 22:
                yh.p2 p2Var = (yh.p2) obj;
                p2Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var.E = floatValue5;
                if (floatValue5 >= 0.8f && (o2Var = p2Var.H) != null && (z10 = o2Var.f47808l) && z10) {
                    o2Var.f47808l = false;
                    o2Var.b();
                }
                p2Var.invalidate();
                return;
            case 23:
                View view = (View) obj;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                return;
            case 24:
                b4 b4Var = (b4) obj;
                b4Var.getClass();
                b4Var.f47235y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var.invalidate();
                return;
            case 25:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o00 o00Var = ((k7) obj).f47623c;
                o00Var.setScaleX(floatValue6);
                o00Var.setScaleY(floatValue6);
                return;
            case 26:
                l8 l8Var = (l8) obj;
                l8Var.getClass();
                l8Var.f47679c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l8Var.invalidate();
                return;
            default:
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zg.s sVar = ((zg.t) obj).f49440b;
                if (sVar != null) {
                    sVar.setAlpha(floatValue7);
                    return;
                }
                return;
        }
    }

    public r0(Object obj, int i10) {
        this.f29579a = i10;
        this.f29580b = obj;
    }
}
