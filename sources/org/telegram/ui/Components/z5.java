package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
public final class z5 extends AnimatorListenerAdapter {
    public final int f40875a;
    public final Object f40876b;

    public z5(Object obj, int i7) {
        this.f40875a = i7;
        this.f40876b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40875a) {
            case 13:
                ((ll) this.f40876b).f35695a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40875a) {
            case 0:
                a6 a6Var = (a6) this.f40876b;
                a6Var.d = null;
                a6Var.f31700b.clear();
                return;
            case 1:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f40876b;
                animatedPhoneNumberEditText.M1 = null;
                animatedPhoneNumberEditText.K1.clear();
                return;
            case 2:
                super.onAnimationEnd(animator);
                i6 i6Var = (i6) this.f40876b;
                i6Var.b();
                i6Var.f34520o = null;
                i6Var.f34515j = 0.0f;
                i6Var.f34518m = 0.0f;
                i6Var.f34517l = 0.0f;
                i6Var.f34516k = 0.0f;
                i6Var.f34523r = 0.0f;
                i6Var.f34522q = 0.0f;
                i6Var.invalidateSelf();
                Runnable runnable = i6Var.f34509b0;
                if (runnable != null) {
                    runnable.run();
                }
                i6Var.f34525t = null;
                CharSequence charSequence = i6Var.f34526u;
                if (charSequence != null) {
                    i6Var.t(charSequence, true, i6Var.v);
                    i6Var.f34526u = null;
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
                l9 l9Var = (l9) this.f40876b;
                l9Var.setVisibility(8);
                l9Var.setImageDrawable(null);
                l9Var.setAlpha(1.0f);
                return;
            case 4:
                t8 t8Var = (t8) ((org.telegram.messenger.c9) this.f40876b).f21755j1;
                t8Var.f38270f = false;
                t8Var.f38269e.setVisibility(8);
                return;
            case 5:
                y8 y8Var = (y8) this.f40876b;
                if (y8Var.f40580f != null) {
                    y8Var.f40579e = 1.0f;
                    y8Var.k();
                    if (y8Var.f40581g) {
                        y8Var.f40581g = false;
                        Runnable runnable2 = y8Var.f40583j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    y8Var.d();
                }
                y8Var.f40580f = null;
                return;
            case 6:
                ((ze) this.f40876b).f40942f.f31017b0.setVisibility(8);
                return;
            case 7:
                ((dg) this.f40876b).f32882d0 = 1.0f;
                return;
            case 8:
                ((di) ((hh) this.f40876b).d).f32975q1.setVisibility(8);
                return;
            case 9:
                ((kh) this.f40876b).d.f32979r1.setVisibility(8);
                return;
            case 10:
                di diVar = (di) this.f40876b;
                diVar.T2 = null;
                if (!diVar.f32956k3) {
                    if (diVar.R2.getTag() == null && diVar.K2 == 0 && !diVar.N2) {
                        diVar.U2.setVisibility(4);
                    }
                    diVar.f32931c3.setVisibility(4);
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
                vj vjVar = (vj) this.f40876b;
                vjVar.f38986s.setVisibility(8);
                vjVar.f38984n = 0;
                kj kjVar = vjVar.f38985r;
                kjVar.setAlpha(1.0f);
                kjVar.setScaleX(1.0f);
                kjVar.setScaleY(1.0f);
                kjVar.setTranslationX(0.0f);
                kjVar.invalidate();
                return;
            case 12:
                uj ujVar = (uj) this.f40876b;
                if (ujVar.X.H.getTag() == null) {
                    ujVar.X.H.setVisibility(4);
                }
                ujVar.X.I = null;
                return;
            case 13:
                ll llVar = (ll) this.f40876b;
                if (animator.equals(llVar.f35695a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = llVar.f35695a;
                    chatAttachAlertPhotoLayout.f31193c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 14:
                am amVar = (am) this.f40876b;
                bm bmVar = amVar.P;
                bmVar.J = null;
                bmVar.K = false;
                amVar.invalidate();
                return;
            case 15:
                yl ylVar = (yl) this.f40876b;
                ylVar.f40662b.R = true;
                ylVar.O.f41072z.invalidate();
                return;
            case 16:
                vo voVar = (vo) this.f40876b;
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
                xz0 xz0Var2 = (xz0) this.f40876b;
                xz0Var2.f40491c = null;
                xz0Var2.f40489a.setShader(null);
                xz0Var2.f40494n = null;
                xz0Var2.f40495r = null;
                xz0Var2.setImageDrawable(null);
                org.telegram.messenger.g0.E2(xz0Var2);
                return;
            case 18:
                CheckBox checkBox = (CheckBox) this.f40876b;
                if (animator.equals(checkBox.f31241s)) {
                    checkBox.f31241s = null;
                }
                if (!checkBox.f31244y) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 19:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f40876b;
                if (animator.equals(checkBoxBase.f31258p)) {
                    checkBoxBase.f31258p = null;
                }
                if (!checkBoxBase.f31259q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 20:
                bq bqVar = (bq) this.f40876b;
                bqVar.f32293l = 1.0f;
                bqVar.f32296o = null;
                bqVar.f32297p = null;
                bqVar.f32298q = null;
                View view = bqVar.H;
                if (view != null) {
                    if (bqVar.h == 0 && bqVar.G) {
                        view.setVisibility(8);
                    }
                    bqVar.H.invalidate();
                }
                bqVar.f32286c = -1;
                return;
            case 21:
                kt ktVar = (kt) this.f40876b;
                ktVar.O = false;
                ktVar.d.setTranslationY(0.0f);
                ktVar.d.setAlpha(0.0f);
                ktVar.c(0.0f);
                ktVar.R = 0.0f;
                ktVar.j();
                return;
            case 22:
                ((st) this.f40876b).f38118a.F1 = false;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((ju) this.f40876b).d = null;
                return;
            case 24:
                ((gy) this.f40876b).W = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((px) this.f40876b).f37093n = null;
                return;
            case 26:
                ((cz) this.f40876b).a();
                return;
            case 27:
                ez ezVar = (ez) this.f40876b;
                ezVar.U = ezVar.f33382c0;
                ezVar.f33380b0 = ezVar.f33387f0;
                ezVar.V = ezVar.f33383d0;
                ezVar.W = ezVar.f33385e0;
                ezVar.f33382c0 = -1;
                ezVar.f33383d0 = -1;
                ezVar.f33385e0 = -1;
                ezVar.f33387f0 = -1;
                return;
            case 28:
                rz rzVar = (rz) this.f40876b;
                rzVar.f37798w = 1.0f;
                rzVar.invalidate();
                return;
            default:
                n40 n40Var = (n40) this.f40876b;
                if (animator == n40Var.W) {
                    n40Var.c(true);
                    n40Var.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
