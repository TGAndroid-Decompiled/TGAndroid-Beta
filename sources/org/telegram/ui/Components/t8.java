package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class t8 extends AnimatorListenerAdapter {
    public final int f30786a;
    public final Object f30787b;

    public t8(Object obj, int i10) {
        this.f30786a = i10;
        this.f30787b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30786a) {
            case 9:
                ((pm) this.f30787b).f29528a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30786a) {
            case 0:
                g9 g9Var = ((u8) this.f30787b).f31097b;
                g9Var.f26354f = false;
                g9Var.f26353e.setVisibility(8);
                return;
            case 1:
                l9 l9Var = (l9) this.f30787b;
                if (l9Var.f28098f != null) {
                    l9Var.f28097e = 1.0f;
                    l9Var.n();
                    if (l9Var.f28099g) {
                        l9Var.f28099g = false;
                        Runnable runnable = l9Var.f28101j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    l9Var.f();
                }
                l9Var.f28098f = null;
                return;
            case 2:
                ((wf) this.f30787b).f32368f.f23624b0.setVisibility(8);
                return;
            case 3:
                ((zg) this.f30787b).f33366d0 = 1.0f;
                return;
            case 4:
                ((aj) ((hi) this.f30787b).d).f24377s.setVisibility(8);
                return;
            case 5:
                ((ji) this.f30787b).d.v.setVisibility(8);
                return;
            case 6:
                aj ajVar = (aj) this.f30787b;
                ajVar.f24328c1 = null;
                if (!ajVar.f24382t1) {
                    if (ajVar.f24321a1.getTag() == null && ajVar.T0 == 0 && !ajVar.W0) {
                        ajVar.f24331d1.setVisibility(4);
                    }
                    ajVar.l1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var = ajVar.f24345h1;
                if (u0Var != null) {
                    u0Var.setVisibility(4);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                uk ukVar = (uk) this.f30787b;
                ukVar.f31187s.setVisibility(8);
                ukVar.f31185n = 0;
                jk jkVar = ukVar.f31186r;
                jkVar.setAlpha(1.0f);
                jkVar.setScaleX(1.0f);
                jkVar.setScaleY(1.0f);
                jkVar.setTranslationX(0.0f);
                jkVar.invalidate();
                return;
            case 8:
                tk tkVar = (tk) this.f30787b;
                if (tkVar.X.H.getTag() == null) {
                    tkVar.X.H.setVisibility(4);
                }
                tkVar.X.I = null;
                return;
            case 9:
                pm pmVar = (pm) this.f30787b;
                if (animator.equals(pmVar.f29528a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = pmVar.f29528a;
                    chatAttachAlertPhotoLayout.f23808c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 10:
                in inVar = (in) this.f30787b;
                jn jnVar = inVar.P;
                jnVar.J = null;
                jnVar.K = false;
                inVar.invalidate();
                return;
            case 11:
                eq eqVar = (eq) this.f30787b;
                ci.tb tbVar = eqVar.R;
                if (tbVar != null) {
                    if (tbVar.getParent() != null) {
                        ((ViewGroup) eqVar.R.getParent()).removeView(eqVar.R);
                    }
                    eqVar.R = null;
                }
                eqVar.T = null;
                super.onAnimationEnd(animator);
                return;
            case 12:
                CheckBox checkBox = (CheckBox) this.f30787b;
                if (animator.equals(checkBox.f23857s)) {
                    checkBox.f23857s = null;
                }
                if (!checkBox.f23859x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f30787b;
                if (animator.equals(checkBoxBase.f23874p)) {
                    checkBoxBase.f23874p = null;
                }
                if (!checkBoxBase.f23875q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 14:
                er erVar = (er) this.f30787b;
                if (erVar.K == erVar.L) {
                    erVar.G.setVisibility(4);
                }
                erVar.f25779y = null;
                return;
            case 15:
                nr nrVar = (nr) this.f30787b;
                nrVar.f28938l = 1.0f;
                nrVar.f28941o = null;
                nrVar.f28942p = null;
                nrVar.f28943q = null;
                View view = nrVar.H;
                if (view != null) {
                    if (nrVar.h == 0 && nrVar.G) {
                        view.setVisibility(8);
                    }
                    nrVar.H.invalidate();
                }
                nrVar.f28931c = -1;
                return;
            case 16:
                cv cvVar = (cv) this.f30787b;
                cvVar.O = false;
                cvVar.d.setTranslationY(0.0f);
                cvVar.d.setAlpha(0.0f);
                cvVar.c(0.0f);
                cvVar.R = 0.0f;
                cvVar.j();
                return;
            case 17:
                ((kv) this.f30787b).f27936a.O = false;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((cw) this.f30787b).d = null;
                return;
            case 19:
                ((d00) this.f30787b).W = null;
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((lz) this.f30787b).f28322n = null;
                return;
            case 21:
                ((b10) this.f30787b).a();
                return;
            case 22:
                d10 d10Var = (d10) this.f30787b;
                d10Var.U = d10Var.f25160c0;
                d10Var.f25158b0 = d10Var.f25165f0;
                d10Var.V = d10Var.f25161d0;
                d10Var.W = d10Var.f25163e0;
                d10Var.f25160c0 = -1;
                d10Var.f25161d0 = -1;
                d10Var.f25163e0 = -1;
                d10Var.f25165f0 = -1;
                return;
            case 23:
                r10 r10Var = (r10) this.f30787b;
                r10Var.f29983s = 1.0f;
                r10Var.invalidate();
                return;
            case 24:
                v60 v60Var = (v60) this.f30787b;
                if (animator == v60Var.W) {
                    v60Var.c(true);
                    v60Var.setVisibility(4);
                    return;
                }
                return;
            case 25:
                s80 s80Var = (s80) this.f30787b;
                q80 q80Var = s80Var.f30472x;
                if (q80Var != null) {
                    q80Var.setProgress(1.0f);
                    s80Var.f30472x.invalidate();
                }
                s80Var.m0 = null;
                return;
            case 26:
                e10 e10Var = (e10) this.f30787b;
                ((c90) e10Var.f25544e).E = false;
                TextView[] textViewArr = (TextView[]) e10Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 27:
                q90 q90Var = (q90) this.f30787b;
                if (!q90Var.f29780f) {
                    q90Var.f29778c.setVisibility(8);
                    return;
                }
                return;
            case 28:
                x90 x90Var = (x90) this.f30787b;
                FrameLayout frameLayout = x90Var.f32687b;
                ci.r6 r6Var = (ci.r6) x90Var.f32688c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.da) x90Var.d);
                return;
            default:
                tc0 tc0Var = (tc0) this.f30787b;
                tc0Var.f30859c0.h = null;
                tc0Var.e(tc0Var.S, tc0Var.R);
                return;
        }
    }
}
