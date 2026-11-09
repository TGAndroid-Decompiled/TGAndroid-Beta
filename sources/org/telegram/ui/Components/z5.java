package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
public final class z5 extends AnimatorListenerAdapter {
    public final int f40908a;
    public final Object f40909b;

    public z5(Object obj, int i7) {
        this.f40908a = i7;
        this.f40909b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40908a) {
            case 13:
                ((ll) this.f40909b).f35764a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40908a) {
            case 0:
                a6 a6Var = (a6) this.f40909b;
                a6Var.d = null;
                a6Var.f31716b.clear();
                return;
            case 1:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f40909b;
                animatedPhoneNumberEditText.M1 = null;
                animatedPhoneNumberEditText.K1.clear();
                return;
            case 2:
                super.onAnimationEnd(animator);
                i6 i6Var = (i6) this.f40909b;
                i6Var.b();
                i6Var.f34599o = null;
                i6Var.f34594j = 0.0f;
                i6Var.f34597m = 0.0f;
                i6Var.f34596l = 0.0f;
                i6Var.f34595k = 0.0f;
                i6Var.f34602r = 0.0f;
                i6Var.f34601q = 0.0f;
                i6Var.invalidateSelf();
                Runnable runnable = i6Var.f34588b0;
                if (runnable != null) {
                    runnable.run();
                }
                i6Var.f34604t = null;
                CharSequence charSequence = i6Var.f34605u;
                if (charSequence != null) {
                    i6Var.t(charSequence, true, i6Var.v);
                    i6Var.f34605u = null;
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
                l9 l9Var = (l9) this.f40909b;
                l9Var.setVisibility(8);
                l9Var.setImageDrawable(null);
                l9Var.setAlpha(1.0f);
                return;
            case 4:
                t8 t8Var = (t8) ((org.telegram.messenger.c9) this.f40909b).f21791j1;
                t8Var.f38320f = false;
                t8Var.f38319e.setVisibility(8);
                return;
            case 5:
                y8 y8Var = (y8) this.f40909b;
                if (y8Var.f40648f != null) {
                    y8Var.f40647e = 1.0f;
                    y8Var.k();
                    if (y8Var.f40649g) {
                        y8Var.f40649g = false;
                        Runnable runnable2 = y8Var.f40651j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    y8Var.d();
                }
                y8Var.f40648f = null;
                return;
            case 6:
                ((ze) this.f40909b).f40969f.f31026b0.setVisibility(8);
                return;
            case 7:
                ((dg) this.f40909b).f32960d0 = 1.0f;
                return;
            case 8:
                ((di) ((hh) this.f40909b).d).f33038q1.setVisibility(8);
                return;
            case 9:
                ((kh) this.f40909b).d.f33042r1.setVisibility(8);
                return;
            case 10:
                di diVar = (di) this.f40909b;
                diVar.T2 = null;
                if (!diVar.f33019k3) {
                    if (diVar.R2.getTag() == null && diVar.K2 == 0 && !diVar.N2) {
                        diVar.U2.setVisibility(4);
                    }
                    diVar.f32994c3.setVisibility(4);
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
                vj vjVar = (vj) this.f40909b;
                vjVar.f39114s.setVisibility(8);
                vjVar.f39112n = 0;
                kj kjVar = vjVar.f39113r;
                kjVar.setAlpha(1.0f);
                kjVar.setScaleX(1.0f);
                kjVar.setScaleY(1.0f);
                kjVar.setTranslationX(0.0f);
                kjVar.invalidate();
                return;
            case 12:
                uj ujVar = (uj) this.f40909b;
                if (ujVar.X.H.getTag() == null) {
                    ujVar.X.H.setVisibility(4);
                }
                ujVar.X.I = null;
                return;
            case 13:
                ll llVar = (ll) this.f40909b;
                if (animator.equals(llVar.f35764a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = llVar.f35764a;
                    chatAttachAlertPhotoLayout.f31202c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 14:
                am amVar = (am) this.f40909b;
                bm bmVar = amVar.P;
                bmVar.J = null;
                bmVar.K = false;
                amVar.invalidate();
                return;
            case 15:
                yl ylVar = (yl) this.f40909b;
                ylVar.f40741b.R = true;
                ylVar.O.f41021z.invalidate();
                return;
            case 16:
                vo voVar = (vo) this.f40909b;
                yz0 yz0Var = voVar.H1;
                if (yz0Var != null) {
                    if (yz0Var.getParent() != null) {
                        ((ViewGroup) voVar.H1.getParent()).removeView(voVar.H1);
                    }
                    voVar.H1 = null;
                }
                voVar.J1 = null;
                super.onAnimationEnd(animator);
                return;
            case 17:
                yz0 yz0Var2 = (yz0) this.f40909b;
                yz0Var2.f40847c = null;
                yz0Var2.f40845a.setShader(null);
                yz0Var2.f40850n = null;
                yz0Var2.f40851r = null;
                yz0Var2.setImageDrawable(null);
                org.telegram.messenger.g0.E2(yz0Var2);
                return;
            case 18:
                CheckBox checkBox = (CheckBox) this.f40909b;
                if (animator.equals(checkBox.f31250s)) {
                    checkBox.f31250s = null;
                }
                if (!checkBox.f31253y) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 19:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f40909b;
                if (animator.equals(checkBoxBase.f31267p)) {
                    checkBoxBase.f31267p = null;
                }
                if (!checkBoxBase.f31268q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 20:
                bq bqVar = (bq) this.f40909b;
                bqVar.f32371l = 1.0f;
                bqVar.f32374o = null;
                bqVar.f32375p = null;
                bqVar.f32376q = null;
                View view = bqVar.H;
                if (view != null) {
                    if (bqVar.h == 0 && bqVar.G) {
                        view.setVisibility(8);
                    }
                    bqVar.H.invalidate();
                }
                bqVar.f32364c = -1;
                return;
            case 21:
                lt ltVar = (lt) this.f40909b;
                ltVar.O = false;
                ltVar.d.setTranslationY(0.0f);
                ltVar.d.setAlpha(0.0f);
                ltVar.c(0.0f);
                ltVar.R = 0.0f;
                ltVar.j();
                return;
            case 22:
                ((tt) this.f40909b).f38487a.F1 = false;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((ku) this.f40909b).d = null;
                return;
            case 24:
                ((hy) this.f40909b).W = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((qx) this.f40909b).f37494n = null;
                return;
            case 26:
                ((dz) this.f40909b).a();
                return;
            case 27:
                fz fzVar = (fz) this.f40909b;
                fzVar.U = fzVar.f33770c0;
                fzVar.f33768b0 = fzVar.f33775f0;
                fzVar.V = fzVar.f33771d0;
                fzVar.W = fzVar.f33773e0;
                fzVar.f33770c0 = -1;
                fzVar.f33771d0 = -1;
                fzVar.f33773e0 = -1;
                fzVar.f33775f0 = -1;
                return;
            case 28:
                sz szVar = (sz) this.f40909b;
                szVar.f38195w = 1.0f;
                szVar.invalidate();
                return;
            default:
                o40 o40Var = (o40) this.f40909b;
                if (animator == o40Var.f36616a0) {
                    o40Var.d(true);
                    o40Var.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
