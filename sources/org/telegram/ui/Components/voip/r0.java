package org.telegram.ui.Components.voip;

import ai.l4;
import ai.z5;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.mi1;
import org.telegram.ui.s00;
import org.telegram.ui.xd;
import org.telegram.ui.zt0;
import yh.a4;
import yh.e4;
import yh.m7;
import yh.n8;
public final class r0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29184a;
    public final Object f29185b;

    public r0(a6.i iVar, View view) {
        this.f29184a = 14;
        this.f29185b = iVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        yh.r2 r2Var;
        boolean z10;
        int i10 = this.f29184a;
        Object obj = this.f29185b;
        switch (i10) {
            case 0:
                s0 s0Var = (s0) obj;
                s0Var.getClass();
                s0Var.f29197i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 1:
                mi1 mi1Var = (mi1) obj;
                mi1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                b1 b1Var = mi1Var.f28907c;
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
                m2Var.f29097s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2Var.f29092b.invalidate();
                return;
            case 5:
                l4 l4Var = (l4) obj;
                ((z5) l4Var.f1175b).f28314a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l4Var.invalidate();
                return;
            case 6:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var.U = floatValue;
                v1Var.V.setAlpha(floatValue);
                v1Var.invalidate();
                return;
            case 7:
                org.telegram.ui.k0 k0Var = (org.telegram.ui.k0) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.f39107a0 = floatValue2;
                k0Var.j(floatValue2);
                k0Var.f39109b0.setAlpha(k0Var.f39107a0);
                k0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * k0Var.f39107a0);
                k0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * k0Var.f39107a0);
                k0Var.invalidate();
                return;
            case 8:
                ((zt0) ((qg.z0) obj)).K.f30936e0.invalidate();
                return;
            case 9:
                qg.u1 u1Var2 = (qg.u1) obj;
                u1Var2.getClass();
                u1Var2.f41668n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var2.invalidate();
                return;
            case 10:
                qg.b2 b2Var = (qg.b2) obj;
                b2Var.getClass();
                b2Var.f41319x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b2Var.invalidate();
                return;
            case 11:
                pg.n nVar = (pg.n) obj;
                nVar.f41319x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 12:
                qg.p2 p2Var = (qg.p2) obj;
                p2Var.getClass();
                p2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                qg.v2 v2Var = (qg.v2) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.f41693y = floatValue3;
                xd xdVar = v2Var.f41686c;
                xdVar.setAlpha(floatValue3);
                xdVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.f41693y));
                xdVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.f41693y));
                v2Var.f41685b.invalidate();
                return;
            case 14:
                ((View) ((g.b0) ((a6.i) obj).f301b).d.getParent()).invalidate();
                return;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.f22100l0;
                limitPreviewView.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue4 < 0.5f) {
                    f7 = (floatValue4 / 0.5f) * (-7.0f);
                } else {
                    f7 = (1.0f - ((floatValue4 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f22104b0 = f7;
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
                ((rg.v1) obj).f42522a.f42507o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 18:
                tg.b bVar = (tg.b) obj;
                bVar.getClass();
                bVar.f43086b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            case 19:
                xg.i iVar = (xg.i) obj;
                iVar.getClass();
                iVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                a4 a4Var = (a4) obj;
                a4Var.Y0.f8872c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a4Var.T1();
                return;
            case 21:
                ((yh.a3) obj).h.invalidate();
                return;
            case 22:
                yh.s2 s2Var = (yh.s2) obj;
                s2Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2Var.E = floatValue5;
                if (floatValue5 >= 0.8f && (r2Var = s2Var.H) != null && (z10 = r2Var.f47704l) && z10) {
                    r2Var.f47704l = false;
                    r2Var.b();
                }
                s2Var.invalidate();
                return;
            case 23:
                View view = (View) obj;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                return;
            case 24:
                e4 e4Var = (e4) obj;
                e4Var.getClass();
                e4Var.f47117y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e4Var.invalidate();
                return;
            case 25:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s00 s00Var = ((m7) obj).f47470c;
                s00Var.setScaleX(floatValue6);
                s00Var.setScaleY(floatValue6);
                return;
            case 26:
                n8 n8Var = (n8) obj;
                n8Var.getClass();
                n8Var.f47522c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n8Var.invalidate();
                return;
            default:
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zg.s sVar = ((zg.t) obj).f49169b;
                if (sVar != null) {
                    sVar.setAlpha(floatValue7);
                    return;
                }
                return;
        }
    }

    public r0(Object obj, int i10) {
        this.f29184a = i10;
        this.f29185b = obj;
    }
}
