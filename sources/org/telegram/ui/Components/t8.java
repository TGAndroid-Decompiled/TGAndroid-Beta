package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class t8 extends AnimatorListenerAdapter {
    public final int f30783a;
    public final Object f30784b;

    public t8(Object obj, int i10) {
        this.f30783a = i10;
        this.f30784b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30783a) {
            case 9:
                ((pm) this.f30784b).f29549a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30783a) {
            case 0:
                g9 g9Var = ((u8) this.f30784b).f31102b;
                g9Var.f26356f = false;
                g9Var.f26355e.setVisibility(8);
                return;
            case 1:
                l9 l9Var = (l9) this.f30784b;
                if (l9Var.f28113f != null) {
                    l9Var.f28112e = 1.0f;
                    l9Var.n();
                    if (l9Var.f28114g) {
                        l9Var.f28114g = false;
                        Runnable runnable = l9Var.f28116j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    l9Var.f();
                }
                l9Var.f28113f = null;
                return;
            case 2:
                ((wf) this.f30784b).f32382f.f23623b0.setVisibility(8);
                return;
            case 3:
                ((zg) this.f30784b).f33358d0 = 1.0f;
                return;
            case 4:
                ((aj) ((hi) this.f30784b).d).f24381s.setVisibility(8);
                return;
            case 5:
                ((ji) this.f30784b).d.v.setVisibility(8);
                return;
            case 6:
                aj ajVar = (aj) this.f30784b;
                ajVar.f24332c1 = null;
                if (!ajVar.f24386t1) {
                    if (ajVar.f24325a1.getTag() == null && ajVar.T0 == 0 && !ajVar.W0) {
                        ajVar.f24335d1.setVisibility(4);
                    }
                    ajVar.l1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var = ajVar.f24349h1;
                if (u0Var != null) {
                    u0Var.setVisibility(4);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                uk ukVar = (uk) this.f30784b;
                ukVar.f31195s.setVisibility(8);
                ukVar.f31193n = 0;
                jk jkVar = ukVar.f31194r;
                jkVar.setAlpha(1.0f);
                jkVar.setScaleX(1.0f);
                jkVar.setScaleY(1.0f);
                jkVar.setTranslationX(0.0f);
                jkVar.invalidate();
                return;
            case 8:
                tk tkVar = (tk) this.f30784b;
                if (tkVar.X.H.getTag() == null) {
                    tkVar.X.H.setVisibility(4);
                }
                tkVar.X.I = null;
                return;
            case 9:
                pm pmVar = (pm) this.f30784b;
                if (animator.equals(pmVar.f29549a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = pmVar.f29549a;
                    chatAttachAlertPhotoLayout.f23807c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 10:
                in inVar = (in) this.f30784b;
                jn jnVar = inVar.P;
                jnVar.J = null;
                jnVar.K = false;
                inVar.invalidate();
                return;
            case 11:
                eq eqVar = (eq) this.f30784b;
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
                CheckBox checkBox = (CheckBox) this.f30784b;
                if (animator.equals(checkBox.f23856s)) {
                    checkBox.f23856s = null;
                }
                if (!checkBox.f23858x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f30784b;
                if (animator.equals(checkBoxBase.f23873p)) {
                    checkBoxBase.f23873p = null;
                }
                if (!checkBoxBase.f23874q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 14:
                er erVar = (er) this.f30784b;
                if (erVar.K == erVar.L) {
                    erVar.G.setVisibility(4);
                }
                erVar.f25779y = null;
                return;
            case 15:
                nr nrVar = (nr) this.f30784b;
                nrVar.f28934l = 1.0f;
                nrVar.f28937o = null;
                nrVar.f28938p = null;
                nrVar.f28939q = null;
                View view = nrVar.H;
                if (view != null) {
                    if (nrVar.h == 0 && nrVar.G) {
                        view.setVisibility(8);
                    }
                    nrVar.H.invalidate();
                }
                nrVar.f28927c = -1;
                return;
            case 16:
                cv cvVar = (cv) this.f30784b;
                cvVar.O = false;
                cvVar.d.setTranslationY(0.0f);
                cvVar.d.setAlpha(0.0f);
                cvVar.c(0.0f);
                cvVar.R = 0.0f;
                cvVar.j();
                return;
            case 17:
                ((kv) this.f30784b).f27951a.O = false;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((cw) this.f30784b).d = null;
                return;
            case 19:
                ((d00) this.f30784b).W = null;
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((lz) this.f30784b).f28327n = null;
                return;
            case 21:
                ((b10) this.f30784b).a();
                return;
            case 22:
                d10 d10Var = (d10) this.f30784b;
                d10Var.U = d10Var.f25168c0;
                d10Var.f25166b0 = d10Var.f25173f0;
                d10Var.V = d10Var.f25169d0;
                d10Var.W = d10Var.f25171e0;
                d10Var.f25168c0 = -1;
                d10Var.f25169d0 = -1;
                d10Var.f25171e0 = -1;
                d10Var.f25173f0 = -1;
                return;
            case 23:
                r10 r10Var = (r10) this.f30784b;
                r10Var.f29982s = 1.0f;
                r10Var.invalidate();
                return;
            case 24:
                v60 v60Var = (v60) this.f30784b;
                if (animator == v60Var.W) {
                    v60Var.c(true);
                    v60Var.setVisibility(4);
                    return;
                }
                return;
            case 25:
                s80 s80Var = (s80) this.f30784b;
                q80 q80Var = s80Var.f30476x;
                if (q80Var != null) {
                    q80Var.setProgress(1.0f);
                    s80Var.f30476x.invalidate();
                }
                s80Var.m0 = null;
                return;
            case 26:
                e10 e10Var = (e10) this.f30784b;
                ((c90) e10Var.f25539e).E = false;
                TextView[] textViewArr = (TextView[]) e10Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 27:
                q90 q90Var = (q90) this.f30784b;
                if (!q90Var.f29802f) {
                    q90Var.f29800c.setVisibility(8);
                    return;
                }
                return;
            case 28:
                x90 x90Var = (x90) this.f30784b;
                FrameLayout frameLayout = x90Var.f32688b;
                ci.r6 r6Var = (ci.r6) x90Var.f32689c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.da) x90Var.d);
                return;
            default:
                tc0 tc0Var = (tc0) this.f30784b;
                tc0Var.f30856c0.h = null;
                tc0Var.e(tc0Var.S, tc0Var.R);
                return;
        }
    }
}
