package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class q8 extends AnimatorListenerAdapter {
    public final int f27534a;
    public final Object f27535b;

    public q8(Object obj, int i10) {
        this.f27534a = i10;
        this.f27535b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27534a) {
            case 9:
                ((wl) this.f27535b).f30065a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27534a) {
            case 0:
                d9 d9Var = ((r8) this.f27535b).f27803b;
                d9Var.f23525f = false;
                d9Var.e.setVisibility(8);
                return;
            case 1:
                i9 i9Var = (i9) this.f27535b;
                if (i9Var.f24949f != null) {
                    i9Var.e = 1.0f;
                    i9Var.n();
                    if (i9Var.f24950g) {
                        i9Var.f24950g = false;
                        Runnable runnable = i9Var.f24952j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    i9Var.f();
                }
                i9Var.f24949f = null;
                return;
            case 2:
                ((rf) this.f27535b).f27855f.f21960b0.setVisibility(8);
                return;
            case 3:
                ((ug) this.f27535b).f28663d0 = 1.0f;
                return;
            case 4:
                ((ci) this.f27535b).f23294c.f29137s.setVisibility(8);
                return;
            case 5:
                ((ei) this.f27535b).d.v.setVisibility(8);
                return;
            case 6:
                vi viVar = (vi) this.f27535b;
                viVar.Z0 = null;
                if (!viVar.f29131q1) {
                    if (viVar.X0.getTag() == null && viVar.Q0 == 0 && !viVar.T0) {
                        viVar.f29082a1.setVisibility(4);
                    }
                    viVar.f29108i1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.v0 v0Var = viVar.f29095e1;
                if (v0Var != null) {
                    v0Var.setVisibility(4);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                ok okVar = (ok) this.f27535b;
                okVar.f26966s.setVisibility(8);
                okVar.f26964n = 0;
                dk dkVar = okVar.f26965r;
                dkVar.setAlpha(1.0f);
                dkVar.setScaleX(1.0f);
                dkVar.setScaleY(1.0f);
                dkVar.setTranslationX(0.0f);
                dkVar.invalidate();
                return;
            case 8:
                nk nkVar = (nk) this.f27535b;
                if (nkVar.X.H.getTag() == null) {
                    nkVar.X.H.setVisibility(4);
                }
                nkVar.X.I = null;
                return;
            case 9:
                wl wlVar = (wl) this.f27535b;
                if (animator.equals(wlVar.f30065a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wlVar.f30065a;
                    chatAttachAlertPhotoLayout.f22128c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 10:
                pm pmVar = (pm) this.f27535b;
                qm qmVar = pmVar.P;
                qmVar.J = null;
                qmVar.K = false;
                pmVar.invalidate();
                return;
            case 11:
                mp mpVar = (mp) this.f27535b;
                ci.wb wbVar = mpVar.R;
                if (wbVar != null) {
                    if (wbVar.getParent() != null) {
                        ((ViewGroup) mpVar.R.getParent()).removeView(mpVar.R);
                    }
                    mpVar.R = null;
                }
                mpVar.T = null;
                super.onAnimationEnd(animator);
                return;
            case 12:
                CheckBox checkBox = (CheckBox) this.f27535b;
                if (animator.equals(checkBox.f22176s)) {
                    checkBox.f22176s = null;
                }
                if (!checkBox.f22178x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f27535b;
                if (animator.equals(checkBoxBase.f22192p)) {
                    checkBoxBase.f22192p = null;
                }
                if (!checkBoxBase.f22193q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 14:
                mq mqVar = (mq) this.f27535b;
                if (mqVar.K == mqVar.L) {
                    mqVar.G.setVisibility(4);
                }
                mqVar.f26477y = null;
                return;
            case 15:
                vq vqVar = (vq) this.f27535b;
                vqVar.f29803l = 1.0f;
                vqVar.f29806o = null;
                vqVar.f29807p = null;
                vqVar.f29808q = null;
                View view = vqVar.H;
                if (view != null) {
                    if (vqVar.h == 0 && vqVar.G) {
                        view.setVisibility(8);
                    }
                    vqVar.H.invalidate();
                }
                vqVar.f29797c = -1;
                return;
            case 16:
                ju juVar = (ju) this.f27535b;
                juVar.O = false;
                juVar.d.setTranslationY(0.0f);
                juVar.d.setAlpha(0.0f);
                juVar.c(0.0f);
                juVar.R = 0.0f;
                juVar.j();
                return;
            case 17:
                ((ru) this.f27535b).f27957a.O = false;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((kv) this.f27535b).d = null;
                return;
            case 19:
                ((kz) this.f27535b).W = null;
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((ty) this.f27535b).f28479n = null;
                return;
            case 21:
                ((i00) this.f27535b).a();
                return;
            case 22:
                k00 k00Var = (k00) this.f27535b;
                k00Var.U = k00Var.f25575c0;
                k00Var.f25573b0 = k00Var.f25579f0;
                k00Var.V = k00Var.f25576d0;
                k00Var.W = k00Var.f25577e0;
                k00Var.f25575c0 = -1;
                k00Var.f25576d0 = -1;
                k00Var.f25577e0 = -1;
                k00Var.f25579f0 = -1;
                return;
            case 23:
                y00 y00Var = (y00) this.f27535b;
                y00Var.f30419s = 1.0f;
                y00Var.invalidate();
                return;
            case 24:
                z50 z50Var = (z50) this.f27535b;
                if (animator == z50Var.R) {
                    z50Var.c(true);
                    z50Var.setVisibility(4);
                    return;
                }
                return;
            case 25:
                v70 v70Var = (v70) this.f27535b;
                t70 t70Var = v70Var.f28998x;
                if (t70Var != null) {
                    t70Var.setProgress(1.0f);
                    v70Var.f28998x.invalidate();
                }
                v70Var.m0 = null;
                return;
            case 26:
                l00 l00Var = (l00) this.f27535b;
                ((e80) l00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) l00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 27:
                s80 s80Var = (s80) this.f27535b;
                if (!s80Var.f28079f) {
                    s80Var.f28078c.setVisibility(8);
                    return;
                }
                return;
            case 28:
                z80 z80Var = (z80) this.f27535b;
                FrameLayout frameLayout = z80Var.f30780b;
                ci.s6 s6Var = (ci.s6) z80Var.f30781c;
                if (s6Var.getParent() != null) {
                    frameLayout.removeView(s6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ga) z80Var.d);
                return;
            default:
                xb0 xb0Var = (xb0) this.f27535b;
                xb0Var.f30229c0.h = null;
                xb0Var.e(xb0Var.S, xb0Var.R);
                return;
        }
    }
}
