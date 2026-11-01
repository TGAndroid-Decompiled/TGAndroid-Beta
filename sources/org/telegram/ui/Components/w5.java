package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
public final class w5 extends AnimatorListenerAdapter {
    public final int f32083a;
    public final Object f32084b;

    public w5(Object obj, int i10) {
        this.f32083a = i10;
        this.f32084b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32083a) {
            case 13:
                ((rl) this.f32084b).f30012a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32083a) {
            case 0:
                x5 x5Var = (x5) this.f32084b;
                x5Var.d = null;
                x5Var.f32422b.clear();
                return;
            case 1:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f32084b;
                animatedPhoneNumberEditText.M1 = null;
                animatedPhoneNumberEditText.K1.clear();
                return;
            case 2:
                super.onAnimationEnd(animator);
                e6 e6Var = (e6) this.f32084b;
                e6Var.b();
                e6Var.f25755o = null;
                e6Var.f25750j = 0.0f;
                e6Var.f25753m = 0.0f;
                e6Var.f25752l = 0.0f;
                e6Var.f25751k = 0.0f;
                e6Var.f25758r = 0.0f;
                e6Var.f25757q = 0.0f;
                e6Var.invalidateSelf();
                Runnable runnable = e6Var.f25745b0;
                if (runnable != null) {
                    runnable.run();
                }
                e6Var.f25760t = null;
                CharSequence charSequence = e6Var.f25761u;
                if (charSequence != null) {
                    e6Var.t(charSequence, true, e6Var.v);
                    e6Var.f25761u = null;
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
                g9 g9Var = (g9) this.f32084b;
                g9Var.setVisibility(8);
                g9Var.setImageDrawable(null);
                g9Var.setAlpha(1.0f);
                return;
            case 4:
                o8 o8Var = (o8) ((org.telegram.messenger.i9) this.f32084b).f16244j1;
                o8Var.f29049f = false;
                o8Var.e.setVisibility(8);
                return;
            case 5:
                t8 t8Var = (t8) this.f32084b;
                if (t8Var.f30554f != null) {
                    t8Var.e = 1.0f;
                    t8Var.k();
                    if (t8Var.f30555g) {
                        t8Var.f30555g = false;
                        Runnable runnable2 = t8Var.f30557j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    t8Var.d();
                }
                t8Var.f30554f = null;
                return;
            case 6:
                ((ue) this.f32084b).f30945f.f23681b0.setVisibility(8);
                return;
            case 7:
                ((zf) this.f32084b).f33131d0 = 1.0f;
                return;
            case 8:
                ((bi) ((eh) this.f32084b).d).f24803q1.setVisibility(8);
                return;
            case 9:
                ((hh) this.f32084b).d.f24807r1.setVisibility(8);
                return;
            case 10:
                bi biVar = (bi) this.f32084b;
                biVar.T2 = null;
                if (!biVar.f24783k3) {
                    if (biVar.R2.getTag() == null && biVar.K2 == 0 && !biVar.N2) {
                        biVar.U2.setVisibility(4);
                    }
                    biVar.f24756c3.setVisibility(4);
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
                xj xjVar = (xj) this.f32084b;
                xjVar.f32588s.setVisibility(8);
                xjVar.f32586n = 0;
                lj ljVar = xjVar.f32587r;
                ljVar.setAlpha(1.0f);
                ljVar.setScaleX(1.0f);
                ljVar.setScaleY(1.0f);
                ljVar.setTranslationX(0.0f);
                ljVar.invalidate();
                return;
            case 12:
                wj wjVar = (wj) this.f32084b;
                if (wjVar.X.H.getTag() == null) {
                    wjVar.X.H.setVisibility(4);
                }
                wjVar.X.I = null;
                return;
            case 13:
                rl rlVar = (rl) this.f32084b;
                if (animator.equals(rlVar.f30012a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = rlVar.f30012a;
                    chatAttachAlertPhotoLayout.f23855c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 14:
                im imVar = (im) this.f32084b;
                jm jmVar = imVar.P;
                jmVar.J = null;
                jmVar.K = false;
                imVar.invalidate();
                return;
            case 15:
                gm gmVar = (gm) this.f32084b;
                gmVar.f26477b.R = true;
                gmVar.O.f26857z.invalidate();
                return;
            case 16:
                dp dpVar = (dp) this.f32084b;
                c11 c11Var = dpVar.H1;
                if (c11Var != null) {
                    if (c11Var.getParent() != null) {
                        ((ViewGroup) dpVar.H1.getParent()).removeView(dpVar.H1);
                    }
                    dpVar.H1 = null;
                }
                dpVar.J1 = null;
                super.onAnimationEnd(animator);
                return;
            case 17:
                c11 c11Var2 = (c11) this.f32084b;
                c11Var2.f24973c = null;
                c11Var2.f24971a.setShader(null);
                c11Var2.f24975n = null;
                c11Var2.f24976r = null;
                c11Var2.setImageDrawable(null);
                org.telegram.messenger.i0.E2(c11Var2);
                return;
            case 18:
                CheckBox checkBox = (CheckBox) this.f32084b;
                if (animator.equals(checkBox.f23903s)) {
                    checkBox.f23903s = null;
                }
                if (!checkBox.f23906y) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 19:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f32084b;
                if (animator.equals(checkBoxBase.f23919p)) {
                    checkBoxBase.f23919p = null;
                }
                if (!checkBoxBase.f23920q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 20:
                kq kqVar = (kq) this.f32084b;
                kqVar.f27928l = 1.0f;
                kqVar.f27931o = null;
                kqVar.f27932p = null;
                kqVar.f27933q = null;
                View view = kqVar.H;
                if (view != null) {
                    if (kqVar.h == 0 && kqVar.G) {
                        view.setVisibility(8);
                    }
                    kqVar.H.invalidate();
                }
                kqVar.f27922c = -1;
                return;
            case 21:
                wt wtVar = (wt) this.f32084b;
                wtVar.O = false;
                wtVar.d.setTranslationY(0.0f);
                wtVar.d.setAlpha(0.0f);
                wtVar.c(0.0f);
                wtVar.R = 0.0f;
                wtVar.j();
                return;
            case 22:
                ((du) this.f32084b).f25589a.F1 = false;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((vu) this.f32084b).d = null;
                return;
            case 24:
                ((vy) this.f32084b).W = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((ey) this.f32084b).f25969n = null;
                return;
            case 26:
                ((rz) this.f32084b).a();
                return;
            case 27:
                tz tzVar = (tz) this.f32084b;
                tzVar.U = tzVar.f30752c0;
                tzVar.f30750b0 = tzVar.f30756f0;
                tzVar.V = tzVar.f30753d0;
                tzVar.W = tzVar.f30754e0;
                tzVar.f30752c0 = -1;
                tzVar.f30753d0 = -1;
                tzVar.f30754e0 = -1;
                tzVar.f30756f0 = -1;
                return;
            case 28:
                f00 f00Var = (f00) this.f32084b;
                f00Var.f25993w = 1.0f;
                f00Var.invalidate();
                return;
            default:
                d50 d50Var = (d50) this.f32084b;
                if (animator == d50Var.W) {
                    d50Var.c(true);
                    d50Var.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
