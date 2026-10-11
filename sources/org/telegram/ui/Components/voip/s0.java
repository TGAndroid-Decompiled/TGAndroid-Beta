package org.telegram.ui.Components.voip;

import ai.m4;
import ai.z5;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.ni1;
import org.telegram.ui.r00;
import org.telegram.ui.xd;
import org.telegram.ui.zt0;
import yh.d7;
import yh.e8;
import yh.s3;
import yh.w3;
public final class s0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32248a;
    public final Object f32249b;

    public s0(Object obj, int i10) {
        this.f32248a = i10;
        this.f32249b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        yh.l2 l2Var;
        boolean z10;
        int i10 = this.f32248a;
        Object obj = this.f32249b;
        switch (i10) {
            case 0:
                t0 t0Var = (t0) obj;
                t0Var.getClass();
                t0Var.f32263i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 1:
                ni1 ni1Var = (ni1) obj;
                ni1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                c1 c1Var = ni1Var.f31960c;
                c1Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * ni1Var.E));
                c1Var.requestLayout();
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
                n2Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var.f32149b.invalidate();
                return;
            case 5:
                m4 m4Var = (m4) obj;
                ((z5) m4Var.f1391b).f33130a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                m4Var.invalidate();
                return;
            case 6:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.U = floatValue;
                u1Var.V.setAlpha(floatValue);
                u1Var.invalidate();
                return;
            case 7:
                org.telegram.ui.k0 k0Var = (org.telegram.ui.k0) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.f43665a0 = floatValue2;
                k0Var.j(floatValue2);
                k0Var.f43667b0.setAlpha(k0Var.f43665a0);
                k0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * k0Var.f43665a0);
                k0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * k0Var.f43665a0);
                k0Var.invalidate();
                return;
            case 8:
                ((zt0) ((qg.w0) obj)).K.f33932e0.invalidate();
                return;
            case 9:
                qg.r1 r1Var = (qg.r1) obj;
                r1Var.getClass();
                r1Var.f46614n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                return;
            case 10:
                qg.y1 y1Var = (qg.y1) obj;
                y1Var.getClass();
                y1Var.f46725x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y1Var.invalidate();
                return;
            case 11:
                pg.n nVar = (pg.n) obj;
                nVar.f46725x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                t2Var.f46651y = floatValue3;
                xd xdVar = t2Var.f46643c;
                xdVar.setAlpha(floatValue3);
                xdVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.f46651y));
                xdVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.f46651y));
                t2Var.f46642b.invalidate();
                return;
            case 14:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.f24226l0;
                limitPreviewView.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue4 < 0.5f) {
                    f7 = (floatValue4 / 0.5f) * (-7.0f);
                } else {
                    f7 = (1.0f - ((floatValue4 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f24230b0 = f7;
                return;
            case 15:
                rg.p0 p0Var = (rg.p0) obj;
                p0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.d.invalidate();
                rg.o0 o0Var = p0Var.f47472e;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
            case 16:
                ((rg.w1) obj).f47593a.f47578o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 17:
                ((sg.f) obj).f48119a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 18:
                tg.b bVar = (tg.b) obj;
                bVar.getClass();
                bVar.f48360b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            case 19:
                xg.i iVar = (xg.i) obj;
                iVar.getClass();
                iVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                s3 s3Var = (s3) obj;
                s3Var.Z0.f9645c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s3Var.U1();
                return;
            case 21:
                ((yh.t2) obj).h.invalidate();
                return;
            case 22:
                yh.m2 m2Var = (yh.m2) obj;
                m2Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2Var.E = floatValue5;
                if (floatValue5 >= 0.8f && (l2Var = m2Var.H) != null && (z10 = l2Var.f52910l) && z10) {
                    l2Var.f52910l = false;
                    l2Var.b();
                }
                m2Var.invalidate();
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
                w3Var.f53428y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var.invalidate();
                return;
            case 25:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r00 r00Var = ((d7) obj).f52488c;
                r00Var.setScaleX(floatValue6);
                r00Var.setScaleY(floatValue6);
                return;
            case 26:
                e8 e8Var = (e8) obj;
                e8Var.getClass();
                e8Var.f52537c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e8Var.invalidate();
                return;
            default:
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zg.s sVar = ((zg.t) obj).f54750b;
                if (sVar != null) {
                    sVar.setAlpha(floatValue7);
                    return;
                }
                return;
        }
    }
}
