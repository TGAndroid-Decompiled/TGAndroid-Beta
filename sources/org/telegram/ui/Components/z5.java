package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
public final class z5 extends AnimatorListenerAdapter {
    public final int f40871a;
    public final Object f40872b;

    public z5(Object obj, int i7) {
        this.f40871a = i7;
        this.f40872b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40871a) {
            case 13:
                ((ll) this.f40872b).f35675a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40871a) {
            case 0:
                a6 a6Var = (a6) this.f40872b;
                a6Var.d = null;
                a6Var.f31700b.clear();
                return;
            case 1:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f40872b;
                animatedPhoneNumberEditText.M1 = null;
                animatedPhoneNumberEditText.K1.clear();
                return;
            case 2:
                super.onAnimationEnd(animator);
                i6 i6Var = (i6) this.f40872b;
                i6Var.b();
                i6Var.f34489o = null;
                i6Var.f34484j = 0.0f;
                i6Var.f34487m = 0.0f;
                i6Var.f34486l = 0.0f;
                i6Var.f34485k = 0.0f;
                i6Var.f34492r = 0.0f;
                i6Var.f34491q = 0.0f;
                i6Var.invalidateSelf();
                Runnable runnable = i6Var.f34478b0;
                if (runnable != null) {
                    runnable.run();
                }
                i6Var.f34494t = null;
                CharSequence charSequence = i6Var.f34495u;
                if (charSequence != null) {
                    i6Var.t(charSequence, true, i6Var.v);
                    i6Var.f34495u = null;
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
                l9 l9Var = (l9) this.f40872b;
                l9Var.setVisibility(8);
                l9Var.setImageDrawable(null);
                l9Var.setAlpha(1.0f);
                return;
            case 4:
                t8 t8Var = (t8) ((org.telegram.messenger.c9) this.f40872b).f21749j1;
                t8Var.f38281f = false;
                t8Var.f38280e.setVisibility(8);
                return;
            case 5:
                y8 y8Var = (y8) this.f40872b;
                if (y8Var.f40568f != null) {
                    y8Var.f40567e = 1.0f;
                    y8Var.k();
                    if (y8Var.f40569g) {
                        y8Var.f40569g = false;
                        Runnable runnable2 = y8Var.f40571j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    y8Var.d();
                }
                y8Var.f40568f = null;
                return;
            case 6:
                ((ze) this.f40872b).f40922f.f31016b0.setVisibility(8);
                return;
            case 7:
                ((dg) this.f40872b).f32853d0 = 1.0f;
                return;
            case 8:
                ((di) ((hh) this.f40872b).d).f32946q1.setVisibility(8);
                return;
            case 9:
                ((kh) this.f40872b).d.f32950r1.setVisibility(8);
                return;
            case 10:
                di diVar = (di) this.f40872b;
                diVar.T2 = null;
                if (!diVar.f32927k3) {
                    if (diVar.R2.getTag() == null && diVar.K2 == 0 && !diVar.N2) {
                        diVar.U2.setVisibility(4);
                    }
                    diVar.f32902c3.setVisibility(4);
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
                vj vjVar = (vj) this.f40872b;
                vjVar.f38965s.setVisibility(8);
                vjVar.f38963n = 0;
                kj kjVar = vjVar.f38964r;
                kjVar.setAlpha(1.0f);
                kjVar.setScaleX(1.0f);
                kjVar.setScaleY(1.0f);
                kjVar.setTranslationX(0.0f);
                kjVar.invalidate();
                return;
            case 12:
                uj ujVar = (uj) this.f40872b;
                if (ujVar.X.H.getTag() == null) {
                    ujVar.X.H.setVisibility(4);
                }
                ujVar.X.I = null;
                return;
            case 13:
                ll llVar = (ll) this.f40872b;
                if (animator.equals(llVar.f35675a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = llVar.f35675a;
                    chatAttachAlertPhotoLayout.f31192c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 14:
                am amVar = (am) this.f40872b;
                bm bmVar = amVar.P;
                bmVar.J = null;
                bmVar.K = false;
                amVar.invalidate();
                return;
            case 15:
                yl ylVar = (yl) this.f40872b;
                ylVar.f40650b.R = true;
                ylVar.O.f41052z.invalidate();
                return;
            case 16:
                vo voVar = (vo) this.f40872b;
                wz0 wz0Var = voVar.H1;
                if (wz0Var != null) {
                    if (wz0Var.getParent() != null) {
                        ((ViewGroup) voVar.H1.getParent()).removeView(voVar.H1);
                    }
                    voVar.H1 = null;
                }
                voVar.J1 = null;
                super.onAnimationEnd(animator);
                return;
            case 17:
                wz0 wz0Var2 = (wz0) this.f40872b;
                wz0Var2.f40120c = null;
                wz0Var2.f40118a.setShader(null);
                wz0Var2.f40123n = null;
                wz0Var2.f40124r = null;
                wz0Var2.setImageDrawable(null);
                org.telegram.messenger.g0.E2(wz0Var2);
                return;
            case 18:
                CheckBox checkBox = (CheckBox) this.f40872b;
                if (animator.equals(checkBox.f31240s)) {
                    checkBox.f31240s = null;
                }
                if (!checkBox.f31243y) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 19:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f40872b;
                if (animator.equals(checkBoxBase.f31257p)) {
                    checkBoxBase.f31257p = null;
                }
                if (!checkBoxBase.f31258q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 20:
                bq bqVar = (bq) this.f40872b;
                bqVar.f32259l = 1.0f;
                bqVar.f32262o = null;
                bqVar.f32263p = null;
                bqVar.f32264q = null;
                View view = bqVar.H;
                if (view != null) {
                    if (bqVar.h == 0 && bqVar.G) {
                        view.setVisibility(8);
                    }
                    bqVar.H.invalidate();
                }
                bqVar.f32252c = -1;
                return;
            case 21:
                kt ktVar = (kt) this.f40872b;
                ktVar.O = false;
                ktVar.d.setTranslationY(0.0f);
                ktVar.d.setAlpha(0.0f);
                ktVar.c(0.0f);
                ktVar.R = 0.0f;
                ktVar.j();
                return;
            case 22:
                ((st) this.f40872b).f38114a.F1 = false;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((ju) this.f40872b).d = null;
                return;
            case 24:
                ((gy) this.f40872b).W = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((px) this.f40872b).f37077n = null;
                return;
            case 26:
                ((cz) this.f40872b).a();
                return;
            case 27:
                ez ezVar = (ez) this.f40872b;
                ezVar.U = ezVar.f33376c0;
                ezVar.f33374b0 = ezVar.f33381f0;
                ezVar.V = ezVar.f33377d0;
                ezVar.W = ezVar.f33379e0;
                ezVar.f33376c0 = -1;
                ezVar.f33377d0 = -1;
                ezVar.f33379e0 = -1;
                ezVar.f33381f0 = -1;
                return;
            case 28:
                rz rzVar = (rz) this.f40872b;
                rzVar.f37840w = 1.0f;
                rzVar.invalidate();
                return;
            default:
                n40 n40Var = (n40) this.f40872b;
                if (animator == n40Var.W) {
                    n40Var.c(true);
                    n40Var.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
