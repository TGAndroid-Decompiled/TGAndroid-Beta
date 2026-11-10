package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
public final class y5 extends AnimatorListenerAdapter {
    public final int f40504a;
    public final Object f40505b;

    public y5(Object obj, int i7) {
        this.f40504a = i7;
        this.f40505b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40504a) {
            case 13:
                ((kl) this.f40505b).f35366a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40504a) {
            case 0:
                z5 z5Var = (z5) this.f40505b;
                z5Var.d = null;
                z5Var.f40858b.clear();
                return;
            case 1:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f40505b;
                animatedPhoneNumberEditText.M1 = null;
                animatedPhoneNumberEditText.K1.clear();
                return;
            case 2:
                super.onAnimationEnd(animator);
                h6 h6Var = (h6) this.f40505b;
                h6Var.b();
                h6Var.f34199o = null;
                h6Var.f34194j = 0.0f;
                h6Var.f34197m = 0.0f;
                h6Var.f34196l = 0.0f;
                h6Var.f34195k = 0.0f;
                h6Var.f34202r = 0.0f;
                h6Var.f34201q = 0.0f;
                h6Var.invalidateSelf();
                Runnable runnable = h6Var.f34188b0;
                if (runnable != null) {
                    runnable.run();
                }
                h6Var.f34204t = null;
                CharSequence charSequence = h6Var.f34205u;
                if (charSequence != null) {
                    h6Var.t(charSequence, true, h6Var.v);
                    h6Var.f34205u = null;
                    h6Var.v = false;
                    return;
                }
                wf wfVar = h6Var.I;
                if (wfVar != null) {
                    wfVar.run();
                    return;
                }
                return;
            case 3:
                k9 k9Var = (k9) this.f40505b;
                k9Var.setVisibility(8);
                k9Var.setImageDrawable(null);
                k9Var.setAlpha(1.0f);
                return;
            case 4:
                s8 s8Var = (s8) ((org.telegram.messenger.c9) this.f40505b).f21795m1;
                s8Var.f37893f = false;
                s8Var.f37892e.setVisibility(8);
                return;
            case 5:
                x8 x8Var = (x8) this.f40505b;
                if (x8Var.f40235f != null) {
                    x8Var.f40234e = 1.0f;
                    x8Var.k();
                    if (x8Var.f40236g) {
                        x8Var.f40236g = false;
                        Runnable runnable2 = x8Var.f40238j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    x8Var.d();
                }
                x8Var.f40235f = null;
                return;
            case 6:
                ((ye) this.f40505b).f40565f.f31037b0.setVisibility(8);
                return;
            case 7:
                ((cg) this.f40505b).f32564d0 = 1.0f;
                return;
            case 8:
                ((ci) ((gh) this.f40505b).d).f32651t1.setVisibility(8);
                return;
            case 9:
                ((jh) this.f40505b).d.f32655u1.setVisibility(8);
                return;
            case 10:
                ci ciVar = (ci) this.f40505b;
                ciVar.W2 = null;
                if (!ciVar.f32630n3) {
                    if (ciVar.U2.getTag() == null && ciVar.N2 == 0 && !ciVar.Q2) {
                        ciVar.X2.setVisibility(4);
                    }
                    ciVar.f32606f3.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.r0 r0Var = ciVar.f32595b3;
                if (r0Var != null) {
                    r0Var.setVisibility(4);
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                uj ujVar = (uj) this.f40505b;
                ujVar.f38699s.setVisibility(8);
                ujVar.f38697n = 0;
                jj jjVar = ujVar.f38698r;
                jjVar.setAlpha(1.0f);
                jjVar.setScaleX(1.0f);
                jjVar.setScaleY(1.0f);
                jjVar.setTranslationX(0.0f);
                jjVar.invalidate();
                return;
            case 12:
                tj tjVar = (tj) this.f40505b;
                if (tjVar.X.H.getTag() == null) {
                    tjVar.X.H.setVisibility(4);
                }
                tjVar.X.I = null;
                return;
            case 13:
                kl klVar = (kl) this.f40505b;
                if (animator.equals(klVar.f35366a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = klVar.f35366a;
                    chatAttachAlertPhotoLayout.f31213c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 14:
                zl zlVar = (zl) this.f40505b;
                am amVar = zlVar.P;
                amVar.J = null;
                amVar.K = false;
                zlVar.invalidate();
                return;
            case 15:
                xl xlVar = (xl) this.f40505b;
                xlVar.f40328b.R = true;
                xlVar.O.f40617z.invalidate();
                return;
            case 16:
                vo voVar = (vo) this.f40505b;
                xz0 xz0Var = voVar.K1;
                if (xz0Var != null) {
                    if (xz0Var.getParent() != null) {
                        ((ViewGroup) voVar.K1.getParent()).removeView(voVar.K1);
                    }
                    voVar.K1 = null;
                }
                voVar.M1 = null;
                super.onAnimationEnd(animator);
                return;
            case 17:
                xz0 xz0Var2 = (xz0) this.f40505b;
                xz0Var2.f40442c = null;
                xz0Var2.f40440a.setShader(null);
                xz0Var2.f40445n = null;
                xz0Var2.f40446r = null;
                xz0Var2.setImageDrawable(null);
                org.telegram.messenger.g0.E2(xz0Var2);
                return;
            case 18:
                CheckBox checkBox = (CheckBox) this.f40505b;
                if (animator.equals(checkBox.f31261s)) {
                    checkBox.f31261s = null;
                }
                if (!checkBox.f31264y) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 19:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f40505b;
                if (animator.equals(checkBoxBase.f31278p)) {
                    checkBoxBase.f31278p = null;
                }
                if (!checkBoxBase.f31279q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 20:
                bq bqVar = (bq) this.f40505b;
                bqVar.f32330l = 1.0f;
                bqVar.f32333o = null;
                bqVar.f32334p = null;
                bqVar.f32335q = null;
                View view = bqVar.H;
                if (view != null) {
                    if (bqVar.h == 0 && bqVar.G) {
                        view.setVisibility(8);
                    }
                    bqVar.H.invalidate();
                }
                bqVar.f32323c = -1;
                return;
            case 21:
                kt ktVar = (kt) this.f40505b;
                ktVar.O = false;
                ktVar.d.setTranslationY(0.0f);
                ktVar.d.setAlpha(0.0f);
                ktVar.c(0.0f);
                ktVar.R = 0.0f;
                ktVar.j();
                return;
            case 22:
                ((st) this.f40505b).f38059a.I1 = false;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((ju) this.f40505b).d = null;
                return;
            case 24:
                ((gy) this.f40505b).W = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((px) this.f40505b).f37092n = null;
                return;
            case 26:
                ((cz) this.f40505b).a();
                return;
            case 27:
                ez ezVar = (ez) this.f40505b;
                ezVar.U = ezVar.f33368c0;
                ezVar.f33366b0 = ezVar.f33373f0;
                ezVar.V = ezVar.f33369d0;
                ezVar.W = ezVar.f33371e0;
                ezVar.f33368c0 = -1;
                ezVar.f33369d0 = -1;
                ezVar.f33371e0 = -1;
                ezVar.f33373f0 = -1;
                return;
            case 28:
                rz rzVar = (rz) this.f40505b;
                rzVar.f37779w = 1.0f;
                rzVar.invalidate();
                return;
            default:
                n40 n40Var = (n40) this.f40505b;
                if (animator == n40Var.f36208a0) {
                    n40Var.d(true);
                    n40Var.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
