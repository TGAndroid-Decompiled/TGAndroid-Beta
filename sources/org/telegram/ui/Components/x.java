package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
public final class x extends AnimatorListenerAdapter {
    public final int f41780a;
    public final Object f41781b;

    public x(Object obj, int i7) {
        this.f41780a = i7;
        this.f41781b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41780a) {
            case 14:
                ((zl) this.f41781b).f42919a.P = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41780a) {
            case 0:
                y yVar = (y) this.f41781b;
                yVar.O = null;
                yVar.M = yVar.N;
                yVar.requestLayout();
                return;
            case 1:
                f6 f6Var = (f6) this.f41781b;
                f6Var.d = null;
                f6Var.f35013b.clear();
                return;
            case 2:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f41781b;
                animatedPhoneNumberEditText.S1 = null;
                animatedPhoneNumberEditText.Q1.clear();
                return;
            case 3:
                super.onAnimationEnd(animator);
                m6 m6Var = (m6) this.f41781b;
                m6Var.b();
                m6Var.f37407o = null;
                m6Var.f37402j = 0.0f;
                m6Var.f37405m = 0.0f;
                m6Var.f37404l = 0.0f;
                m6Var.f37403k = 0.0f;
                m6Var.f37410r = 0.0f;
                m6Var.f37409q = 0.0f;
                m6Var.invalidateSelf();
                Runnable runnable = m6Var.f37397c0;
                if (runnable != null) {
                    runnable.run();
                }
                m6Var.f37412t = null;
                CharSequence charSequence = m6Var.f37413u;
                if (charSequence != null) {
                    m6Var.t(charSequence, true, m6Var.v);
                    m6Var.f37413u = null;
                    m6Var.v = false;
                    return;
                }
                ng ngVar = m6Var.J;
                if (ngVar != null) {
                    ngVar.run();
                    return;
                }
                return;
            case 4:
                p9 p9Var = (p9) this.f41781b;
                p9Var.setVisibility(8);
                p9Var.setImageDrawable(null);
                p9Var.setAlpha(1.0f);
                return;
            case 5:
                x8 x8Var = (x8) ((org.telegram.messenger.b9) this.f41781b).n1;
                x8Var.f41925f = false;
                x8Var.f41924e.setVisibility(8);
                return;
            case 6:
                c9 c9Var = (c9) this.f41781b;
                if (c9Var.f33953f != null) {
                    c9Var.f33952e = 1.0f;
                    c9Var.k();
                    if (c9Var.f33954g) {
                        c9Var.f33954g = false;
                        Runnable runnable2 = c9Var.f33956j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    c9Var.d();
                }
                c9Var.f33953f = null;
                return;
            case 7:
                ((kf) this.f41781b).f36735f.f32653c0.setVisibility(8);
                return;
            case 8:
                ((tg) this.f41781b).f39926g0 = 1.0f;
                return;
            case 9:
                ((ti) ((xh) this.f41781b).d).f40020u1.setVisibility(8);
                return;
            case 10:
                ((ai) this.f41781b).d.f40024v1.setVisibility(8);
                return;
            case 11:
                ti tiVar = (ti) this.f41781b;
                tiVar.X2 = null;
                if (!tiVar.f39999o3) {
                    if (tiVar.V2.getTag() == null && tiVar.O2 == 0 && !tiVar.R2) {
                        tiVar.Y2.setVisibility(4);
                    }
                    tiVar.f39974g3.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.q0 q0Var = tiVar.f39963c3;
                if (q0Var != null) {
                    q0Var.setVisibility(4);
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                kk kkVar = (kk) this.f41781b;
                kkVar.f36767s.setVisibility(8);
                kkVar.f36765n = 0;
                zj zjVar = kkVar.f36766r;
                zjVar.setAlpha(1.0f);
                zjVar.setScaleX(1.0f);
                zjVar.setScaleY(1.0f);
                zjVar.setTranslationX(0.0f);
                zjVar.invalidate();
                return;
            case 13:
                jk jkVar = (jk) this.f41781b;
                if (jkVar.Y.I.getTag() == null) {
                    jkVar.Y.I.setVisibility(4);
                }
                jkVar.Y.J = null;
                return;
            case 14:
                zl zlVar = (zl) this.f41781b;
                if (animator.equals(zlVar.f42919a.P)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = zlVar.f42919a;
                    chatAttachAlertPhotoLayout.f32873d0 = true;
                    chatAttachAlertPhotoLayout.P = null;
                    return;
                }
                return;
            case 15:
                om omVar = (om) this.f41781b;
                pm pmVar = omVar.Q;
                pmVar.K = null;
                pmVar.L = false;
                omVar.invalidate();
                return;
            case 16:
                mm mmVar = (mm) this.f41781b;
                mmVar.f37480b.R = true;
                mmVar.O.f37872z.invalidate();
                return;
            case 17:
                kp kpVar = (kp) this.f41781b;
                h01 h01Var = kpVar.L1;
                if (h01Var != null) {
                    if (h01Var.getParent() != null) {
                        ((ViewGroup) kpVar.L1.getParent()).removeView(kpVar.L1);
                    }
                    kpVar.L1 = null;
                }
                kpVar.N1 = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                h01 h01Var2 = (h01) this.f41781b;
                h01Var2.f35600c = null;
                h01Var2.f35598a.setShader(null);
                h01Var2.f35603n = null;
                h01Var2.f35604r = null;
                h01Var2.setImageDrawable(null);
                org.telegram.messenger.g0.E2(h01Var2);
                return;
            case 19:
                CheckBox checkBox = (CheckBox) this.f41781b;
                if (animator.equals(checkBox.f32920s)) {
                    checkBox.f32920s = null;
                }
                if (!checkBox.f32923y) {
                    checkBox.H = null;
                    return;
                }
                return;
            case 20:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f41781b;
                if (animator.equals(checkBoxBase.f32937p)) {
                    checkBoxBase.f32937p = null;
                }
                if (!checkBoxBase.f32938q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 21:
                pq pqVar = (pq) this.f41781b;
                pqVar.f38550l = 1.0f;
                pqVar.f38553o = null;
                pqVar.f38554p = null;
                pqVar.f38555q = null;
                View view = pqVar.H;
                if (view != null) {
                    if (pqVar.h == 0 && pqVar.G) {
                        view.setVisibility(8);
                    }
                    pqVar.H.invalidate();
                }
                pqVar.f38543c = -1;
                return;
            case 22:
                wt wtVar = (wt) this.f41781b;
                wtVar.P = false;
                wtVar.d.setTranslationY(0.0f);
                wtVar.d.setAlpha(0.0f);
                wtVar.c(0.0f);
                wtVar.S = 0.0f;
                wtVar.j();
                return;
            case 23:
                ((du) this.f41781b).f34454a.J1 = false;
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((uu) this.f41781b).d = null;
                return;
            case 25:
                ((qy) this.f41781b).f39035a0 = null;
                return;
            case 26:
                super.onAnimationEnd(animator);
                ((yx) this.f41781b).f42583n = null;
                return;
            case 27:
                ((mz) this.f41781b).a();
                return;
            case 28:
                c00 c00Var = (c00) this.f41781b;
                c00Var.f33872w = 1.0f;
                c00Var.invalidate();
                return;
            default:
                y40 y40Var = (y40) this.f41781b;
                if (animator == y40Var.f42323b0) {
                    y40Var.d(true);
                    y40Var.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
