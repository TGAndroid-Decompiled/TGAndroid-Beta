package org.telegram.ui.Components.voip;

import ai.m4;
import ai.z5;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.bu0;
import org.telegram.ui.ce;
import org.telegram.ui.qi1;
import org.telegram.ui.u00;
import yh.d7;
import yh.e8;
import yh.s3;
import yh.w3;
public final class s0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31934a;
    public final Object f31935b;

    public s0(Object obj, int i10) {
        this.f31934a = i10;
        this.f31935b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        yh.l2 l2Var;
        boolean z10;
        int i10 = this.f31934a;
        Object obj = this.f31935b;
        switch (i10) {
            case 0:
                t0 t0Var = (t0) obj;
                t0Var.getClass();
                t0Var.f31949i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 1:
                qi1 qi1Var = (qi1) obj;
                qi1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                c1 c1Var = qi1Var.f31646c;
                c1Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * qi1Var.E));
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
                n2Var.f31834b.invalidate();
                return;
            case 5:
                m4 m4Var = (m4) obj;
                ((z5) m4Var.f1389b).f32994a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f43420a0 = floatValue2;
                l0Var.j(floatValue2);
                l0Var.f43422b0.setAlpha(l0Var.f43420a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.f43420a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.f43420a0);
                l0Var.invalidate();
                return;
            case 8:
                ((bu0) ((qg.w0) obj)).K.f33743e0.invalidate();
                return;
            case 9:
                qg.r1 r1Var = (qg.r1) obj;
                r1Var.getClass();
                r1Var.f46480n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                return;
            case 10:
                qg.z1 z1Var = (qg.z1) obj;
                z1Var.getClass();
                z1Var.f46598x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z1Var.invalidate();
                return;
            case 11:
                pg.n nVar = (pg.n) obj;
                nVar.f46598x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                u2Var.f46527y = floatValue3;
                ce ceVar = u2Var.f46519c;
                ceVar.setAlpha(floatValue3);
                ceVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.f46527y));
                ceVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.f46527y));
                u2Var.f46518b.invalidate();
                return;
            case 14:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.f24012l0;
                limitPreviewView.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue4 < 0.5f) {
                    f7 = (floatValue4 / 0.5f) * (-7.0f);
                } else {
                    f7 = (1.0f - ((floatValue4 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f24016b0 = f7;
                return;
            case 15:
                rg.q0 q0Var = (rg.q0) obj;
                q0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q0Var.d.invalidate();
                rg.o0 o0Var = q0Var.f47620e;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
            case 16:
                ((rg.w1) obj).f47725a.f47710o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 17:
                ((sg.f) obj).f48268a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 18:
                tg.b bVar = (tg.b) obj;
                bVar.getClass();
                bVar.f48532b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            case 19:
                xg.i iVar = (xg.i) obj;
                iVar.getClass();
                iVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                s3 s3Var = (s3) obj;
                s3Var.Z0.f9643c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                if (floatValue5 >= 0.8f && (l2Var = m2Var.H) != null && (z10 = l2Var.f53059l) && z10) {
                    l2Var.f53059l = false;
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
                w3Var.f53577y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var.invalidate();
                return;
            case 25:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u00 u00Var = ((d7) obj).f52631c;
                u00Var.setScaleX(floatValue6);
                u00Var.setScaleY(floatValue6);
                return;
            case 26:
                e8 e8Var = (e8) obj;
                e8Var.getClass();
                e8Var.f52686c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e8Var.invalidate();
                return;
            default:
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zg.s sVar = ((zg.t) obj).f54895b;
                if (sVar != null) {
                    sVar.setAlpha(floatValue7);
                    return;
                }
                return;
        }
    }
}
