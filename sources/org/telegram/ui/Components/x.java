package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
public final class x extends AnimatorListenerAdapter {
    public final int f41832a;
    public final Object f41833b;

    public x(Object obj, int i7) {
        this.f41832a = i7;
        this.f41833b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41832a) {
            case 14:
                ((zl) this.f41833b).f42899a.P = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41832a) {
            case 0:
                y yVar = (y) this.f41833b;
                yVar.O = null;
                yVar.M = yVar.N;
                yVar.requestLayout();
                return;
            case 1:
                f6 f6Var = (f6) this.f41833b;
                f6Var.d = null;
                f6Var.f34951b.clear();
                return;
            case 2:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f41833b;
                animatedPhoneNumberEditText.S1 = null;
                animatedPhoneNumberEditText.Q1.clear();
                return;
            case 3:
                super.onAnimationEnd(animator);
                m6 m6Var = (m6) this.f41833b;
                m6Var.b();
                m6Var.f37390o = null;
                m6Var.f37385j = 0.0f;
                m6Var.f37388m = 0.0f;
                m6Var.f37387l = 0.0f;
                m6Var.f37386k = 0.0f;
                m6Var.f37393r = 0.0f;
                m6Var.f37392q = 0.0f;
                m6Var.invalidateSelf();
                Runnable runnable = m6Var.f37380c0;
                if (runnable != null) {
                    runnable.run();
                }
                m6Var.f37395t = null;
                CharSequence charSequence = m6Var.f37396u;
                if (charSequence != null) {
                    m6Var.t(charSequence, true, m6Var.v);
                    m6Var.f37396u = null;
                    m6Var.v = false;
                    return;
                }
                lg lgVar = m6Var.J;
                if (lgVar != null) {
                    lgVar.run();
                    return;
                }
                return;
            case 4:
                q9 q9Var = (q9) this.f41833b;
                q9Var.setVisibility(8);
                q9Var.setImageDrawable(null);
                q9Var.setAlpha(1.0f);
                return;
            case 5:
                y8 y8Var = (y8) ((org.telegram.messenger.b9) this.f41833b).n1;
                y8Var.f42401f = false;
                y8Var.f42400e.setVisibility(8);
                return;
            case 6:
                d9 d9Var = (d9) this.f41833b;
                if (d9Var.f34307f != null) {
                    d9Var.f34306e = 1.0f;
                    d9Var.k();
                    if (d9Var.f34308g) {
                        d9Var.f34308g = false;
                        Runnable runnable2 = d9Var.f34310j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    d9Var.d();
                }
                d9Var.f34307f = null;
                return;
            case 7:
                ((jf) this.f41833b).f36427f.f32558c0.setVisibility(8);
                return;
            case 8:
                ((sg) this.f41833b).f39629g0 = 1.0f;
                return;
            case 9:
                ((si) ((wh) this.f41833b).d).f39723u1.setVisibility(8);
                return;
            case 10:
                ((zh) this.f41833b).d.f39727v1.setVisibility(8);
                return;
            case 11:
                si siVar = (si) this.f41833b;
                siVar.X2 = null;
                if (!siVar.f39702o3) {
                    if (siVar.V2.getTag() == null && siVar.O2 == 0 && !siVar.R2) {
                        siVar.Y2.setVisibility(4);
                    }
                    siVar.f39677g3.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.r0 r0Var = siVar.f39666c3;
                if (r0Var != null) {
                    r0Var.setVisibility(4);
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                kk kkVar = (kk) this.f41833b;
                kkVar.f36782s.setVisibility(8);
                kkVar.f36780n = 0;
                yj yjVar = kkVar.f36781r;
                yjVar.setAlpha(1.0f);
                yjVar.setScaleX(1.0f);
                yjVar.setScaleY(1.0f);
                yjVar.setTranslationX(0.0f);
                yjVar.invalidate();
                return;
            case 13:
                jk jkVar = (jk) this.f41833b;
                if (jkVar.Y.I.getTag() == null) {
                    jkVar.Y.I.setVisibility(4);
                }
                jkVar.Y.J = null;
                return;
            case 14:
                zl zlVar = (zl) this.f41833b;
                if (animator.equals(zlVar.f42899a.P)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = zlVar.f42899a;
                    chatAttachAlertPhotoLayout.f32773d0 = true;
                    chatAttachAlertPhotoLayout.P = null;
                    return;
                }
                return;
            case 15:
                om omVar = (om) this.f41833b;
                pm pmVar = omVar.Q;
                pmVar.K = null;
                pmVar.L = false;
                omVar.invalidate();
                return;
            case 16:
                mm mmVar = (mm) this.f41833b;
                mmVar.f37562b.R = true;
                mmVar.O.f37828z.invalidate();
                return;
            case 17:
                lp lpVar = (lp) this.f41833b;
                g01 g01Var = lpVar.L1;
                if (g01Var != null) {
                    if (g01Var.getParent() != null) {
                        ((ViewGroup) lpVar.L1.getParent()).removeView(lpVar.L1);
                    }
                    lpVar.L1 = null;
                }
                lpVar.N1 = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                g01 g01Var2 = (g01) this.f41833b;
                g01Var2.f35277c = null;
                g01Var2.f35275a.setShader(null);
                g01Var2.f35280n = null;
                g01Var2.f35281r = null;
                g01Var2.setImageDrawable(null);
                org.telegram.messenger.g0.E2(g01Var2);
                return;
            case 19:
                CheckBox checkBox = (CheckBox) this.f41833b;
                if (animator.equals(checkBox.f32820s)) {
                    checkBox.f32820s = null;
                }
                if (!checkBox.f32823y) {
                    checkBox.H = null;
                    return;
                }
                return;
            case 20:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f41833b;
                if (animator.equals(checkBoxBase.f32837p)) {
                    checkBoxBase.f32837p = null;
                }
                if (!checkBoxBase.f32838q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 21:
                qq qqVar = (qq) this.f41833b;
                qqVar.f38872l = 1.0f;
                qqVar.f38875o = null;
                qqVar.f38876p = null;
                qqVar.f38877q = null;
                View view = qqVar.H;
                if (view != null) {
                    if (qqVar.h == 0 && qqVar.G) {
                        view.setVisibility(8);
                    }
                    qqVar.H.invalidate();
                }
                qqVar.f38865c = -1;
                return;
            case 22:
                wt wtVar = (wt) this.f41833b;
                wtVar.P = false;
                wtVar.d.setTranslationY(0.0f);
                wtVar.d.setAlpha(0.0f);
                wtVar.c(0.0f);
                wtVar.S = 0.0f;
                wtVar.j();
                return;
            case 23:
                ((du) this.f41833b).f34508a.J1 = false;
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((uu) this.f41833b).d = null;
                return;
            case 25:
                ((ry) this.f41833b).f39333a0 = null;
                return;
            case 26:
                super.onAnimationEnd(animator);
                ((zx) this.f41833b).f42965n = null;
                return;
            case 27:
                ((nz) this.f41833b).a();
                return;
            case 28:
                c00 c00Var = (c00) this.f41833b;
                c00Var.f33834w = 1.0f;
                c00Var.invalidate();
                return;
            default:
                y40 y40Var = (y40) this.f41833b;
                if (animator == y40Var.f42295b0) {
                    y40Var.d(true);
                    y40Var.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
