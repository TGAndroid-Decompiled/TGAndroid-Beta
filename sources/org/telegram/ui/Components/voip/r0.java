package org.telegram.ui.Components.voip;

import ai.l4;
import ai.y5;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.fi1;
import org.telegram.ui.s00;
import org.telegram.ui.ut0;
import org.telegram.ui.zd;
import yh.b4;
import yh.l7;
import yh.m8;
import yh.x3;
public final class r0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32107a;
    public final Object f32108b;

    public r0(a4.m mVar, View view) {
        this.f32107a = 14;
        this.f32108b = mVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        yh.p2 p2Var;
        boolean z10;
        int i10 = this.f32107a;
        Object obj = this.f32108b;
        switch (i10) {
            case 0:
                s0 s0Var = (s0) obj;
                s0Var.getClass();
                s0Var.f32133i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 1:
                fi1 fi1Var = (fi1) obj;
                fi1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                b1 b1Var = fi1Var.f31811c;
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
                n2Var.f32034s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var.f32028b.invalidate();
                return;
            case 5:
                l4 l4Var = (l4) obj;
                ((y5) l4Var.f1275b).f32493a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
                l0Var.f42373a0 = floatValue2;
                l0Var.j(floatValue2);
                l0Var.f42375b0.setAlpha(l0Var.f42373a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.f42373a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.f42373a0);
                l0Var.invalidate();
                return;
            case 8:
                ((ut0) ((qg.w0) obj)).K.f33901e0.invalidate();
                return;
            case 9:
                qg.r1 r1Var = (qg.r1) obj;
                r1Var.getClass();
                r1Var.f45322n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                return;
            case 10:
                qg.y1 y1Var = (qg.y1) obj;
                y1Var.getClass();
                y1Var.f45439x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y1Var.invalidate();
                return;
            case 11:
                pg.n nVar = (pg.n) obj;
                nVar.f45439x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                t2Var.f45361y = floatValue3;
                zd zdVar = t2Var.f45353c;
                zdVar.setAlpha(floatValue3);
                zdVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.f45361y));
                zdVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.f45361y));
                t2Var.f45352b.invalidate();
                return;
            case 14:
                ((View) ((g.b0) ((a4.m) obj).f297b).d.getParent()).invalidate();
                return;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.f24235l0;
                limitPreviewView.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue4 < 0.5f) {
                    f7 = (floatValue4 / 0.5f) * (-7.0f);
                } else {
                    f7 = (1.0f - ((floatValue4 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f24239b0 = f7;
                return;
            case 16:
                rg.q0 q0Var = (rg.q0) obj;
                q0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q0Var.d.invalidate();
                rg.p0 p0Var = q0Var.f46256e;
                if (p0Var != null) {
                    p0Var.invalidate();
                    return;
                }
                return;
            case 17:
                ((rg.y1) obj).f46400a.f46377o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 18:
                tg.b bVar = (tg.b) obj;
                bVar.getClass();
                bVar.f46985b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            case 19:
                xg.i iVar = (xg.i) obj;
                iVar.getClass();
                iVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                x3 x3Var = (x3) obj;
                x3Var.Y0.f9635c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var.T1();
                return;
            case 21:
                ((yh.x2) obj).h.invalidate();
                return;
            case 22:
                yh.q2 q2Var = (yh.q2) obj;
                q2Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.E = floatValue5;
                if (floatValue5 >= 0.8f && (p2Var = q2Var.H) != null && (z10 = p2Var.f51798l) && z10) {
                    p2Var.f51798l = false;
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
                b4 b4Var = (b4) obj;
                b4Var.getClass();
                b4Var.f51135y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var.invalidate();
                return;
            case 25:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s00 s00Var = ((l7) obj).f51591c;
                s00Var.setScaleX(floatValue6);
                s00Var.setScaleY(floatValue6);
                return;
            case 26:
                m8 m8Var = (m8) obj;
                m8Var.getClass();
                m8Var.f51654c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m8Var.invalidate();
                return;
            default:
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zg.s sVar = ((zg.t) obj).f53531b;
                if (sVar != null) {
                    sVar.setAlpha(floatValue7);
                    return;
                }
                return;
        }
    }

    public r0(Object obj, int i10) {
        this.f32107a = i10;
        this.f32108b = obj;
    }
}
