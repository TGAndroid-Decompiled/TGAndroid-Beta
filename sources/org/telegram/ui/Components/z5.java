package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
public final class z5 extends AnimatorListenerAdapter {
    public final int f40894a;
    public final Object f40895b;

    public z5(Object obj, int i7) {
        this.f40894a = i7;
        this.f40895b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40894a) {
            case 13:
                ((ll) this.f40895b).f35713a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40894a) {
            case 0:
                a6 a6Var = (a6) this.f40895b;
                a6Var.d = null;
                a6Var.f31709b.clear();
                return;
            case 1:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f40895b;
                animatedPhoneNumberEditText.M1 = null;
                animatedPhoneNumberEditText.K1.clear();
                return;
            case 2:
                super.onAnimationEnd(animator);
                i6 i6Var = (i6) this.f40895b;
                i6Var.b();
                i6Var.f34564o = null;
                i6Var.f34559j = 0.0f;
                i6Var.f34562m = 0.0f;
                i6Var.f34561l = 0.0f;
                i6Var.f34560k = 0.0f;
                i6Var.f34567r = 0.0f;
                i6Var.f34566q = 0.0f;
                i6Var.invalidateSelf();
                Runnable runnable = i6Var.f34553b0;
                if (runnable != null) {
                    runnable.run();
                }
                i6Var.f34569t = null;
                CharSequence charSequence = i6Var.f34570u;
                if (charSequence != null) {
                    i6Var.t(charSequence, true, i6Var.v);
                    i6Var.f34570u = null;
                    i6Var.v = false;
                    return;
                }
                xf xfVar = i6Var.I;
                if (xfVar != null) {
                    xfVar.run();
                    return;
                }
                return;
            case 3:
                l9 l9Var = (l9) this.f40895b;
                l9Var.setVisibility(8);
                l9Var.setImageDrawable(null);
                l9Var.setAlpha(1.0f);
                return;
            case 4:
                t8 t8Var = (t8) ((org.telegram.messenger.c9) this.f40895b).f21791j1;
                t8Var.f38298f = false;
                t8Var.f38297e.setVisibility(8);
                return;
            case 5:
                y8 y8Var = (y8) this.f40895b;
                if (y8Var.f40606f != null) {
                    y8Var.f40605e = 1.0f;
                    y8Var.k();
                    if (y8Var.f40607g) {
                        y8Var.f40607g = false;
                        Runnable runnable2 = y8Var.f40609j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    y8Var.d();
                }
                y8Var.f40606f = null;
                return;
            case 6:
                ((ze) this.f40895b).f40961f.f31021b0.setVisibility(8);
                return;
            case 7:
                ((dg) this.f40895b).f32890d0 = 1.0f;
                return;
            case 8:
                ((di) ((hh) this.f40895b).d).f32983q1.setVisibility(8);
                return;
            case 9:
                ((kh) this.f40895b).d.f32987r1.setVisibility(8);
                return;
            case 10:
                di diVar = (di) this.f40895b;
                diVar.T2 = null;
                if (!diVar.f32964k3) {
                    if (diVar.R2.getTag() == null && diVar.K2 == 0 && !diVar.N2) {
                        diVar.U2.setVisibility(4);
                    }
                    diVar.f32939c3.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.r0 r0Var = diVar.Y2;
                if (r0Var != null) {
                    r0Var.setVisibility(4);
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                vj vjVar = (vj) this.f40895b;
                vjVar.f39021s.setVisibility(8);
                vjVar.f39019n = 0;
                kj kjVar = vjVar.f39020r;
                kjVar.setAlpha(1.0f);
                kjVar.setScaleX(1.0f);
                kjVar.setScaleY(1.0f);
                kjVar.setTranslationX(0.0f);
                kjVar.invalidate();
                return;
            case 12:
                uj ujVar = (uj) this.f40895b;
                if (ujVar.X.H.getTag() == null) {
                    ujVar.X.H.setVisibility(4);
                }
                ujVar.X.I = null;
                return;
            case 13:
                ll llVar = (ll) this.f40895b;
                if (animator.equals(llVar.f35713a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = llVar.f35713a;
                    chatAttachAlertPhotoLayout.f31197c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 14:
                am amVar = (am) this.f40895b;
                bm bmVar = amVar.P;
                bmVar.J = null;
                bmVar.K = false;
                amVar.invalidate();
                return;
            case 15:
                yl ylVar = (yl) this.f40895b;
                ylVar.f40688b.R = true;
                ylVar.O.f41091z.invalidate();
                return;
            case 16:
                vo voVar = (vo) this.f40895b;
                xz0 xz0Var = voVar.H1;
                if (xz0Var != null) {
                    if (xz0Var.getParent() != null) {
                        ((ViewGroup) voVar.H1.getParent()).removeView(voVar.H1);
                    }
                    voVar.H1 = null;
                }
                voVar.J1 = null;
                super.onAnimationEnd(animator);
                return;
            case 17:
                xz0 xz0Var2 = (xz0) this.f40895b;
                xz0Var2.f40517c = null;
                xz0Var2.f40515a.setShader(null);
                xz0Var2.f40520n = null;
                xz0Var2.f40521r = null;
                xz0Var2.setImageDrawable(null);
                org.telegram.messenger.g0.E2(xz0Var2);
                return;
            case 18:
                CheckBox checkBox = (CheckBox) this.f40895b;
                if (animator.equals(checkBox.f31245s)) {
                    checkBox.f31245s = null;
                }
                if (!checkBox.f31248y) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 19:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f40895b;
                if (animator.equals(checkBoxBase.f31262p)) {
                    checkBoxBase.f31262p = null;
                }
                if (!checkBoxBase.f31263q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 20:
                bq bqVar = (bq) this.f40895b;
                bqVar.f32314l = 1.0f;
                bqVar.f32317o = null;
                bqVar.f32318p = null;
                bqVar.f32319q = null;
                View view = bqVar.H;
                if (view != null) {
                    if (bqVar.h == 0 && bqVar.G) {
                        view.setVisibility(8);
                    }
                    bqVar.H.invalidate();
                }
                bqVar.f32307c = -1;
                return;
            case 21:
                lt ltVar = (lt) this.f40895b;
                ltVar.O = false;
                ltVar.d.setTranslationY(0.0f);
                ltVar.d.setAlpha(0.0f);
                ltVar.c(0.0f);
                ltVar.R = 0.0f;
                ltVar.j();
                return;
            case 22:
                ((tt) this.f40895b).f38419a.F1 = false;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((ku) this.f40895b).d = null;
                return;
            case 24:
                ((hy) this.f40895b).W = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((qx) this.f40895b).f37447n = null;
                return;
            case 26:
                ((dz) this.f40895b).a();
                return;
            case 27:
                fz fzVar = (fz) this.f40895b;
                fzVar.U = fzVar.f33703c0;
                fzVar.f33701b0 = fzVar.f33708f0;
                fzVar.V = fzVar.f33704d0;
                fzVar.W = fzVar.f33706e0;
                fzVar.f33703c0 = -1;
                fzVar.f33704d0 = -1;
                fzVar.f33706e0 = -1;
                fzVar.f33708f0 = -1;
                return;
            case 28:
                sz szVar = (sz) this.f40895b;
                szVar.f38184w = 1.0f;
                szVar.invalidate();
                return;
            default:
                n40 n40Var = (n40) this.f40895b;
                if (animator == n40Var.f36210a0) {
                    n40Var.d(true);
                    n40Var.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
