package org.telegram.ui.Components.voip;

import ai.m4;
import ai.z5;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.au0;
import org.telegram.ui.pi1;
import org.telegram.ui.s00;
import org.telegram.ui.yd;
import yh.d7;
import yh.e8;
import yh.s3;
import yh.w3;
public final class r0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32254a;
    public final Object f32255b;

    public r0(Object obj, int i10) {
        this.f32254a = i10;
        this.f32255b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        yh.l2 l2Var;
        boolean z10;
        int i10 = this.f32254a;
        Object obj = this.f32255b;
        switch (i10) {
            case 0:
                s0 s0Var = (s0) obj;
                s0Var.getClass();
                s0Var.f32269i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 1:
                pi1 pi1Var = (pi1) obj;
                pi1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                b1 b1Var = pi1Var.f31956c;
                b1Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * pi1Var.E));
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
                m2Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2Var.f32155b.invalidate();
                return;
            case 5:
                m4 m4Var = (m4) obj;
                ((z5) m4Var.f1391b).f33135a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                m4Var.invalidate();
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
                l0Var.f43521a0 = floatValue2;
                l0Var.j(floatValue2);
                l0Var.f43523b0.setAlpha(l0Var.f43521a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.f43521a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.f43521a0);
                l0Var.invalidate();
                return;
            case 8:
                ((au0) ((qg.w0) obj)).K.f33942e0.invalidate();
                return;
            case 9:
                qg.r1 r1Var = (qg.r1) obj;
                r1Var.getClass();
                r1Var.f46579n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                return;
            case 10:
                qg.z1 z1Var = (qg.z1) obj;
                z1Var.getClass();
                z1Var.f46697x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z1Var.invalidate();
                return;
            case 11:
                pg.n nVar = (pg.n) obj;
                nVar.f46697x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 12:
                qg.o2 o2Var = (qg.o2) obj;
                o2Var.getClass();
                o2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                qg.u2 u2Var = (qg.u2) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var.f46626y = floatValue3;
                yd ydVar = u2Var.f46618c;
                ydVar.setAlpha(floatValue3);
                ydVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.f46626y));
                ydVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.f46626y));
                u2Var.f46617b.invalidate();
                return;
            case 14:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.f24238l0;
                limitPreviewView.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue4 < 0.5f) {
                    f7 = (floatValue4 / 0.5f) * (-7.0f);
                } else {
                    f7 = (1.0f - ((floatValue4 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f24242b0 = f7;
                return;
            case 15:
                rg.p0 p0Var = (rg.p0) obj;
                p0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.d.invalidate();
                rg.o0 o0Var = p0Var.f47426e;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
            case 16:
                ((rg.w1) obj).f47547a.f47532o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 17:
                ((sg.f) obj).f48073a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 18:
                tg.b bVar = (tg.b) obj;
                bVar.getClass();
                bVar.f48337b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            case 19:
                xg.i iVar = (xg.i) obj;
                iVar.getClass();
                iVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                s3 s3Var = (s3) obj;
                s3Var.Z0.f9646c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s3Var.U1();
                return;
            case 21:
                ((yh.t2) obj).h.invalidate();
                return;
            case 22:
                yh.m2 m2Var2 = (yh.m2) obj;
                m2Var2.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2Var2.E = floatValue5;
                if (floatValue5 >= 0.8f && (l2Var = m2Var2.H) != null && (z10 = l2Var.f52867l) && z10) {
                    l2Var.f52867l = false;
                    l2Var.b();
                }
                m2Var2.invalidate();
                return;
            case 23:
                View view = (View) obj;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                return;
            case 24:
                w3 w3Var = (w3) obj;
                w3Var.getClass();
                w3Var.f53385y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var.invalidate();
                return;
            case 25:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s00 s00Var = ((d7) obj).f52445c;
                s00Var.setScaleX(floatValue6);
                s00Var.setScaleY(floatValue6);
                return;
            case 26:
                e8 e8Var = (e8) obj;
                e8Var.getClass();
                e8Var.f52506c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e8Var.invalidate();
                return;
            default:
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zg.s sVar = ((zg.t) obj).f54707b;
                if (sVar != null) {
                    sVar.setAlpha(floatValue7);
                    return;
                }
                return;
        }
    }
}
