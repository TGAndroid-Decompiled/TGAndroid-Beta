package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
public final class w5 extends AnimatorListenerAdapter {
    public final int f32005a;
    public final Object f32006b;

    public w5(Object obj, int i10) {
        this.f32005a = i10;
        this.f32006b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32005a) {
            case 13:
                ((rl) this.f32006b).f29950a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32005a) {
            case 0:
                x5 x5Var = (x5) this.f32006b;
                x5Var.d = null;
                x5Var.f32352b.clear();
                return;
            case 1:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f32006b;
                animatedPhoneNumberEditText.M1 = null;
                animatedPhoneNumberEditText.K1.clear();
                return;
            case 2:
                super.onAnimationEnd(animator);
                e6 e6Var = (e6) this.f32006b;
                e6Var.b();
                e6Var.f25706o = null;
                e6Var.f25701j = 0.0f;
                e6Var.f25704m = 0.0f;
                e6Var.f25703l = 0.0f;
                e6Var.f25702k = 0.0f;
                e6Var.f25709r = 0.0f;
                e6Var.f25708q = 0.0f;
                e6Var.invalidateSelf();
                Runnable runnable = e6Var.f25696b0;
                if (runnable != null) {
                    runnable.run();
                }
                e6Var.f25711t = null;
                CharSequence charSequence = e6Var.f25712u;
                if (charSequence != null) {
                    e6Var.t(charSequence, true, e6Var.v);
                    e6Var.f25712u = null;
                    e6Var.v = false;
                    return;
                }
                tf tfVar = e6Var.I;
                if (tfVar != null) {
                    tfVar.run();
                    return;
                }
                return;
            case 3:
                g9 g9Var = (g9) this.f32006b;
                g9Var.setVisibility(8);
                g9Var.setImageDrawable(null);
                g9Var.setAlpha(1.0f);
                return;
            case 4:
                o8 o8Var = (o8) ((org.telegram.messenger.h9) this.f32006b).f15851j1;
                o8Var.f28992f = false;
                o8Var.e.setVisibility(8);
                return;
            case 5:
                t8 t8Var = (t8) this.f32006b;
                if (t8Var.f30482f != null) {
                    t8Var.e = 1.0f;
                    t8Var.k();
                    if (t8Var.f30483g) {
                        t8Var.f30483g = false;
                        Runnable runnable2 = t8Var.f30485j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    t8Var.d();
                }
                t8Var.f30482f = null;
                return;
            case 6:
                ((ue) this.f32006b).f30911f.f23680b0.setVisibility(8);
                return;
            case 7:
                ((zf) this.f32006b).f33035d0 = 1.0f;
                return;
            case 8:
                ((bi) ((eh) this.f32006b).d).f24712q1.setVisibility(8);
                return;
            case 9:
                ((hh) this.f32006b).d.f24716r1.setVisibility(8);
                return;
            case 10:
                bi biVar = (bi) this.f32006b;
                biVar.T2 = null;
                if (!biVar.f24692k3) {
                    if (biVar.R2.getTag() == null && biVar.K2 == 0 && !biVar.N2) {
                        biVar.U2.setVisibility(4);
                    }
                    biVar.f24665c3.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.t0 t0Var = biVar.Y2;
                if (t0Var != null) {
                    t0Var.setVisibility(4);
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                xj xjVar = (xj) this.f32006b;
                xjVar.f32488s.setVisibility(8);
                xjVar.f32486n = 0;
                lj ljVar = xjVar.f32487r;
                ljVar.setAlpha(1.0f);
                ljVar.setScaleX(1.0f);
                ljVar.setScaleY(1.0f);
                ljVar.setTranslationX(0.0f);
                ljVar.invalidate();
                return;
            case 12:
                wj wjVar = (wj) this.f32006b;
                if (wjVar.X.H.getTag() == null) {
                    wjVar.X.H.setVisibility(4);
                }
                wjVar.X.I = null;
                return;
            case 13:
                rl rlVar = (rl) this.f32006b;
                if (animator.equals(rlVar.f29950a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = rlVar.f29950a;
                    chatAttachAlertPhotoLayout.f23854c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 14:
                im imVar = (im) this.f32006b;
                jm jmVar = imVar.P;
                jmVar.J = null;
                jmVar.K = false;
                imVar.invalidate();
                return;
            case 15:
                gm gmVar = (gm) this.f32006b;
                gmVar.f26416b.R = true;
                gmVar.O.f26779z.invalidate();
                return;
            case 16:
                dp dpVar = (dp) this.f32006b;
                b11 b11Var = dpVar.H1;
                if (b11Var != null) {
                    if (b11Var.getParent() != null) {
                        ((ViewGroup) dpVar.H1.getParent()).removeView(dpVar.H1);
                    }
                    dpVar.H1 = null;
                }
                dpVar.J1 = null;
                super.onAnimationEnd(animator);
                return;
            case 17:
                b11 b11Var2 = (b11) this.f32006b;
                b11Var2.f24497c = null;
                b11Var2.f24495a.setShader(null);
                b11Var2.f24499n = null;
                b11Var2.f24500r = null;
                b11Var2.setImageDrawable(null);
                org.telegram.messenger.i0.E2(b11Var2);
                return;
            case 18:
                CheckBox checkBox = (CheckBox) this.f32006b;
                if (animator.equals(checkBox.f23902s)) {
                    checkBox.f23902s = null;
                }
                if (!checkBox.f23905y) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 19:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f32006b;
                if (animator.equals(checkBoxBase.f23918p)) {
                    checkBoxBase.f23918p = null;
                }
                if (!checkBoxBase.f23919q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 20:
                kq kqVar = (kq) this.f32006b;
                kqVar.f27875l = 1.0f;
                kqVar.f27878o = null;
                kqVar.f27879p = null;
                kqVar.f27880q = null;
                View view = kqVar.H;
                if (view != null) {
                    if (kqVar.h == 0 && kqVar.G) {
                        view.setVisibility(8);
                    }
                    kqVar.H.invalidate();
                }
                kqVar.f27869c = -1;
                return;
            case 21:
                wt wtVar = (wt) this.f32006b;
                wtVar.O = false;
                wtVar.d.setTranslationY(0.0f);
                wtVar.d.setAlpha(0.0f);
                wtVar.c(0.0f);
                wtVar.R = 0.0f;
                wtVar.j();
                return;
            case 22:
                ((du) this.f32006b).f25534a.F1 = false;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((vu) this.f32006b).d = null;
                return;
            case 24:
                ((vy) this.f32006b).W = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((ey) this.f32006b).f25892n = null;
                return;
            case 26:
                ((rz) this.f32006b).a();
                return;
            case 27:
                tz tzVar = (tz) this.f32006b;
                tzVar.U = tzVar.f30706c0;
                tzVar.f30704b0 = tzVar.f30710f0;
                tzVar.V = tzVar.f30707d0;
                tzVar.W = tzVar.f30708e0;
                tzVar.f30706c0 = -1;
                tzVar.f30707d0 = -1;
                tzVar.f30708e0 = -1;
                tzVar.f30710f0 = -1;
                return;
            case 28:
                f00 f00Var = (f00) this.f32006b;
                f00Var.f25912w = 1.0f;
                f00Var.invalidate();
                return;
            default:
                d50 d50Var = (d50) this.f32006b;
                if (animator == d50Var.W) {
                    d50Var.c(true);
                    d50Var.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
