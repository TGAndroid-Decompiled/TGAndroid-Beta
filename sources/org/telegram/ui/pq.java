package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.CheckBoxBase;
public final class pq extends AnimatorListenerAdapter {
    public final int f40617a;
    public final Object f40618b;

    public pq(Object obj, int i10) {
        this.f40617a = i10;
        this.f40618b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40617a) {
            case 14:
                ((org.telegram.ui.Components.fm) this.f40618b).f26392a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40617a) {
            case 0:
                qq qqVar = (qq) this.f40618b;
                View view = qqVar.f40917b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((jr) qqVar.d).f38622c.removeView(view);
                return;
            case 1:
                org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) this.f40618b;
                g6Var.d = null;
                g6Var.f26565b.clear();
                return;
            case 2:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f40618b;
                animatedPhoneNumberEditText.f24045n = null;
                animatedPhoneNumberEditText.f24044f.clear();
                return;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.f40618b;
                n6Var.b();
                n6Var.f28808o = null;
                n6Var.f28803j = 0.0f;
                n6Var.f28806m = 0.0f;
                n6Var.f28805l = 0.0f;
                n6Var.f28804k = 0.0f;
                n6Var.f28811r = 0.0f;
                n6Var.f28810q = 0.0f;
                n6Var.invalidateSelf();
                Runnable runnable = n6Var.f28798b0;
                if (runnable != null) {
                    runnable.run();
                }
                n6Var.f28813t = null;
                CharSequence charSequence = n6Var.f28814u;
                if (charSequence != null) {
                    n6Var.t(charSequence, true, n6Var.v);
                    n6Var.f28814u = null;
                    n6Var.v = false;
                    return;
                }
                org.telegram.ui.Components.ng ngVar = n6Var.I;
                if (ngVar != null) {
                    ngVar.run();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.u9 u9Var = (org.telegram.ui.Components.u9) this.f40618b;
                u9Var.setVisibility(8);
                u9Var.setImageDrawable(null);
                u9Var.setAlpha(1.0f);
                return;
            case 5:
                org.telegram.ui.Components.c9 c9Var = ((org.telegram.ui.Components.q8) this.f40618b).f29821b;
                c9Var.f25261f = false;
                c9Var.e.setVisibility(8);
                return;
            case 6:
                org.telegram.ui.Components.h9 h9Var = (org.telegram.ui.Components.h9) this.f40618b;
                if (h9Var.f26949f != null) {
                    h9Var.e = 1.0f;
                    h9Var.n();
                    if (h9Var.f26950g) {
                        h9Var.f26950g = false;
                        Runnable runnable2 = h9Var.f26952j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    h9Var.f();
                }
                h9Var.f26949f = null;
                return;
            case 7:
                ((org.telegram.ui.Components.pf) this.f40618b).f29555f.f24059b0.setVisibility(8);
                return;
            case 8:
                ((org.telegram.ui.Components.tg) this.f40618b).f30817d0 = 1.0f;
                return;
            case 9:
                ((org.telegram.ui.Components.ri) ((org.telegram.ui.Components.zh) this.f40618b).d).f30185s.setVisibility(8);
                return;
            case 10:
                ((org.telegram.ui.Components.bi) this.f40618b).d.v.setVisibility(8);
                return;
            case 11:
                org.telegram.ui.Components.ri riVar = (org.telegram.ui.Components.ri) this.f40618b;
                riVar.f30137c1 = null;
                if (!riVar.f30190t1) {
                    if (riVar.f30130a1.getTag() == null && riVar.T0 == 0 && !riVar.W0) {
                        riVar.f30140d1.setVisibility(4);
                    }
                    riVar.l1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var = riVar.f30153h1;
                if (u0Var != null) {
                    u0Var.setVisibility(4);
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.lk lkVar = (org.telegram.ui.Components.lk) this.f40618b;
                lkVar.f28359s.setVisibility(8);
                lkVar.f28357n = 0;
                org.telegram.ui.Components.ak akVar = lkVar.f28358r;
                akVar.setAlpha(1.0f);
                akVar.setScaleX(1.0f);
                akVar.setScaleY(1.0f);
                akVar.setTranslationX(0.0f);
                akVar.invalidate();
                return;
            case 13:
                org.telegram.ui.Components.kk kkVar = (org.telegram.ui.Components.kk) this.f40618b;
                if (kkVar.X.H.getTag() == null) {
                    kkVar.X.H.setVisibility(4);
                }
                kkVar.X.I = null;
                return;
            case 14:
                org.telegram.ui.Components.fm fmVar = (org.telegram.ui.Components.fm) this.f40618b;
                if (animator.equals(fmVar.f26392a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = fmVar.f26392a;
                    chatAttachAlertPhotoLayout.f24232c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.ym ymVar = (org.telegram.ui.Components.ym) this.f40618b;
                org.telegram.ui.Components.zm zmVar = ymVar.P;
                zmVar.J = null;
                zmVar.K = false;
                ymVar.invalidate();
                return;
            case 16:
                org.telegram.ui.Components.up upVar = (org.telegram.ui.Components.up) this.f40618b;
                org.telegram.ui.Components.s21 s21Var = upVar.Q;
                if (s21Var != null) {
                    if (s21Var.getParent() != null) {
                        ((ViewGroup) upVar.Q.getParent()).removeView(upVar.Q);
                    }
                    upVar.Q = null;
                }
                upVar.S = null;
                super.onAnimationEnd(animator);
                return;
            case 17:
                org.telegram.ui.Components.s21 s21Var2 = (org.telegram.ui.Components.s21) this.f40618b;
                s21Var2.f30421c = null;
                s21Var2.f30419a.setShader(null);
                s21Var2.f30423n = null;
                s21Var2.f30424r = null;
                s21Var2.setImageDrawable(null);
                AndroidUtilities.removeFromParent(s21Var2);
                return;
            case 18:
                CheckBox checkBox = (CheckBox) this.f40618b;
                if (animator.equals(checkBox.f24280s)) {
                    checkBox.f24280s = null;
                }
                if (!checkBox.f24282x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 19:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f40618b;
                if (animator.equals(checkBoxBase.f24296p)) {
                    checkBoxBase.f24296p = null;
                }
                if (!checkBoxBase.f24297q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.uq uqVar = (org.telegram.ui.Components.uq) this.f40618b;
                if (uqVar.K == uqVar.L) {
                    uqVar.G.setVisibility(4);
                }
                uqVar.f31212y = null;
                return;
            case 21:
                org.telegram.ui.Components.cr crVar = (org.telegram.ui.Components.cr) this.f40618b;
                crVar.f25445l = 1.0f;
                crVar.f25448o = null;
                crVar.f25449p = null;
                crVar.f25450q = null;
                View view2 = crVar.H;
                if (view2 != null) {
                    if (crVar.h == 0 && crVar.G) {
                        view2.setVisibility(8);
                    }
                    crVar.H.invalidate();
                }
                crVar.f25439c = -1;
                return;
            case 22:
                org.telegram.ui.Components.ou ouVar = (org.telegram.ui.Components.ou) this.f40618b;
                ouVar.O = false;
                ouVar.d.setTranslationY(0.0f);
                ouVar.d.setAlpha(0.0f);
                ouVar.c(0.0f);
                ouVar.R = 0.0f;
                ouVar.j();
                return;
            case 23:
                ((org.telegram.ui.Components.wu) this.f40618b).f32350a.O = false;
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.pv) this.f40618b).d = null;
                return;
            case 25:
                ((org.telegram.ui.Components.rz) this.f40618b).W = null;
                return;
            case 26:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.az) this.f40618b).f24850n = null;
                return;
            case 27:
                ((org.telegram.ui.Components.o00) this.f40618b).a();
                return;
            case 28:
                org.telegram.ui.Components.q00 q00Var = (org.telegram.ui.Components.q00) this.f40618b;
                q00Var.U = q00Var.f29710c0;
                q00Var.f29708b0 = q00Var.f29714f0;
                q00Var.V = q00Var.f29711d0;
                q00Var.W = q00Var.f29712e0;
                q00Var.f29710c0 = -1;
                q00Var.f29711d0 = -1;
                q00Var.f29712e0 = -1;
                q00Var.f29714f0 = -1;
                return;
            default:
                org.telegram.ui.Components.e10 e10Var = (org.telegram.ui.Components.e10) this.f40618b;
                e10Var.v = 1.0f;
                e10Var.invalidate();
                return;
        }
    }

    public pq(qq qqVar, s4.n0 n0Var) {
        this.f40617a = 0;
        this.f40618b = qqVar;
    }
}
