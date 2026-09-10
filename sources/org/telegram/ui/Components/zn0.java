package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.si1;
public final class zn0 extends AnimatorListenerAdapter {
    public final int f29774a;
    public final Object f29775b;

    public zn0(Object obj, int i10) {
        this.f29774a = i10;
        this.f29775b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f29774a) {
            case 0:
                ((ho0) this.f29775b).M0.setVisibility(8);
                return;
            case 1:
                hp0 hp0Var = (hp0) this.f29775b;
                if (animator == hp0Var.h) {
                    hp0Var.h = null;
                    return;
                }
                return;
            case 2:
                ((rq0) this.f29775b).e = null;
                return;
            case 3:
                zq0 zq0Var = (zq0) this.f29775b;
                if (zq0Var.getParent() != null) {
                    ((ViewGroup) zq0Var.getParent()).removeView(zq0Var);
                    return;
                }
                return;
            case 4:
                ct0 ct0Var = (ct0) this.f29775b;
                View view = ct0Var.f22223c;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ct0Var.f22221a.removeView(view);
                return;
            case 5:
                pv0 pv0Var = (pv0) this.f29775b;
                if (pv0Var.f26256f == animator) {
                    pv0Var.f26256f = null;
                    return;
                }
                return;
            case 6:
                hx0 hx0Var = (hx0) this.f29775b;
                hx0.x1(hx0Var, ((Float) hx0Var.f23791p3.getAnimatedValue()).floatValue());
                hx0Var.f23791p3 = null;
                return;
            case 7:
                hy0 hy0Var = (hy0) this.f29775b;
                hy0Var.f23829x.setVisibility(8);
                hy0Var.F.setImageDrawable(null);
                return;
            case 8:
                int i10 = 0;
                while (true) {
                    oy0[] oy0VarArr = (oy0[]) this.f29775b;
                    if (i10 < oy0VarArr.length) {
                        oy0 oy0Var = oy0VarArr[i10];
                        if (oy0Var != null) {
                            oy0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 9:
                super.onAnimationEnd(animator);
                ((py0) this.f29775b).H = null;
                return;
            case 10:
                ((sy0) this.f29775b).e = false;
                return;
            case 11:
                ((a11) this.f29775b).setVisibility(4);
                return;
            case 12:
                ((m21) this.f29775b).setVisibility(8);
                return;
            case 13:
                org.telegram.ui.u7 u7Var = ((f31) this.f29775b).f22838f;
                u7Var.setScaleX(1.0f);
                u7Var.setScaleY(1.0f);
                u7Var.invalidate();
                return;
            case 14:
                j31 j31Var = (j31) this.f29775b;
                j31Var.K = 1.0f;
                j31Var.h.invalidate();
                return;
            case 15:
                ((r51) this.f29775b).L = null;
                return;
            case 16:
                UndoView undoView = (UndoView) this.f29775b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 17:
                y61 y61Var = (y61) this.f29775b;
                if (y61Var.f29257a.getTag() == null) {
                    y61Var.f29257a.setVisibility(4);
                    return;
                }
                return;
            case 18:
                super.onAnimationEnd(animator);
                z61 z61Var = (z61) this.f29775b;
                z61Var.f29606b = 0.0f;
                z61Var.setTranslationY(0.0f);
                z61Var.f29605a = null;
                return;
            case 19:
                u81 u81Var = (u81) this.f29775b;
                u81Var.J = false;
                u81Var.setEnabled(true);
                t81 t81Var = u81Var.f27640y;
                if (t81Var != null) {
                    ((l2.h) t81Var).z(1.0f);
                }
                u81Var.invalidate();
                return;
            case 20:
                ((o91) this.f29775b).f25722e0 = null;
                return;
            case 21:
                ((q91) this.f29775b).K = null;
                return;
            case 22:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f29775b).view.setEnabled(true);
                return;
            case 23:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.f29775b).f28304s0;
                if (tVar.f28440x0.getParent() != null) {
                    tVar.f28409a.removeView(tVar.f28440x0);
                    return;
                }
                return;
            case 24:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.w0 w0Var = (org.telegram.ui.Components.voip.w0) this.f29775b;
                if (w0Var.getParent() != null) {
                    ((ViewGroup) w0Var.getParent()).removeView(w0Var);
                    return;
                }
                return;
            case 25:
                si1 si1Var = (si1) this.f29775b;
                if (!si1Var.f28066a) {
                    si1Var.V.v.S = true;
                    si1Var.V.v.invalidate();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.p1 p1Var = (org.telegram.ui.Components.voip.p1) this.f29775b;
                p1Var.f28343i = false;
                p1Var.f28346l.setAlpha(35);
                p1Var.f28345k.setAlpha(102);
                p1Var.f28344j.setAlpha(35);
                p1Var.c();
                return;
            case 27:
                org.telegram.ui.Components.voip.t1 t1Var = ((org.telegram.ui.Components.voip.r1) this.f29775b).f28371c;
                t1Var.O = false;
                t1Var.requestLayout();
                return;
            case 28:
                org.telegram.ui.Components.voip.r2 r2Var = (org.telegram.ui.Components.voip.r2) this.f29775b;
                r2Var.N = 0.0f;
                r2Var.O = 0.0f;
                org.telegram.ui.Components.voip.q2 q2Var = r2Var.d;
                q2Var.setScaleX(r2Var.T);
                q2Var.setScaleY(r2Var.T);
                TextureView textureView = r2Var.e;
                if (textureView != null) {
                    textureView.setScaleX(r2Var.U);
                    textureView.setScaleY(r2Var.U);
                }
                r2Var.setTranslationY(0.0f);
                r2Var.setTranslationX(0.0f);
                r2Var.W = r2Var.V;
                r2Var.f28375b0 = null;
                return;
            default:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.f29775b;
                if (u2Var.P) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                u2Var.Q = f7;
                u2Var.a(u2Var.R, u2Var.S);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29774a) {
            case 22:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f29775b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public zn0(ct0 ct0Var, s4.o0 o0Var) {
        this.f29774a = 4;
        this.f29775b = ct0Var;
    }
}
