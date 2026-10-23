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
    public final int f40521a;
    public final Object f40522b;

    public pq(Object obj, int i10) {
        this.f40521a = i10;
        this.f40522b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40521a) {
            case 14:
                ((org.telegram.ui.Components.hm) this.f40522b).f26984a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40521a) {
            case 0:
                qq qqVar = (qq) this.f40522b;
                View view = qqVar.f40905b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((jr) qqVar.d).f38634c.removeView(view);
                return;
            case 1:
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.f40522b;
                i6Var.d = null;
                i6Var.f27213b.clear();
                return;
            case 2:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f40522b;
                animatedPhoneNumberEditText.f24044n = null;
                animatedPhoneNumberEditText.f24043f.clear();
                return;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) this.f40522b;
                p6Var.b();
                p6Var.f29448o = null;
                p6Var.f29443j = 0.0f;
                p6Var.f29446m = 0.0f;
                p6Var.f29445l = 0.0f;
                p6Var.f29444k = 0.0f;
                p6Var.f29451r = 0.0f;
                p6Var.f29450q = 0.0f;
                p6Var.invalidateSelf();
                Runnable runnable = p6Var.f29438b0;
                if (runnable != null) {
                    runnable.run();
                }
                p6Var.f29453t = null;
                CharSequence charSequence = p6Var.f29454u;
                if (charSequence != null) {
                    p6Var.t(charSequence, true, p6Var.v);
                    p6Var.f29454u = null;
                    p6Var.v = false;
                    return;
                }
                org.telegram.ui.Components.pg pgVar = p6Var.I;
                if (pgVar != null) {
                    pgVar.run();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f40522b;
                w9Var.setVisibility(8);
                w9Var.setImageDrawable(null);
                w9Var.setAlpha(1.0f);
                return;
            case 5:
                org.telegram.ui.Components.e9 e9Var = ((org.telegram.ui.Components.s8) this.f40522b).f30411b;
                e9Var.f25930f = false;
                e9Var.e.setVisibility(8);
                return;
            case 6:
                org.telegram.ui.Components.j9 j9Var = (org.telegram.ui.Components.j9) this.f40522b;
                if (j9Var.f27612f != null) {
                    j9Var.e = 1.0f;
                    j9Var.n();
                    if (j9Var.f27613g) {
                        j9Var.f27613g = false;
                        Runnable runnable2 = j9Var.f27615j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    j9Var.f();
                }
                j9Var.f27612f = null;
                return;
            case 7:
                ((org.telegram.ui.Components.rf) this.f40522b).f30161f.f24058b0.setVisibility(8);
                return;
            case 8:
                ((org.telegram.ui.Components.vg) this.f40522b).f31453d0 = 1.0f;
                return;
            case 9:
                ((org.telegram.ui.Components.ti) ((org.telegram.ui.Components.bi) this.f40522b).d).f30769s.setVisibility(8);
                return;
            case 10:
                ((org.telegram.ui.Components.di) this.f40522b).d.v.setVisibility(8);
                return;
            case 11:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) this.f40522b;
                tiVar.f30721c1 = null;
                if (!tiVar.f30774t1) {
                    if (tiVar.f30714a1.getTag() == null && tiVar.T0 == 0 && !tiVar.W0) {
                        tiVar.f30724d1.setVisibility(4);
                    }
                    tiVar.l1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var = tiVar.f30737h1;
                if (u0Var != null) {
                    u0Var.setVisibility(4);
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.nk nkVar = (org.telegram.ui.Components.nk) this.f40522b;
                nkVar.f28978s.setVisibility(8);
                nkVar.f28976n = 0;
                org.telegram.ui.Components.ck ckVar = nkVar.f28977r;
                ckVar.setAlpha(1.0f);
                ckVar.setScaleX(1.0f);
                ckVar.setScaleY(1.0f);
                ckVar.setTranslationX(0.0f);
                ckVar.invalidate();
                return;
            case 13:
                org.telegram.ui.Components.mk mkVar = (org.telegram.ui.Components.mk) this.f40522b;
                if (mkVar.X.H.getTag() == null) {
                    mkVar.X.H.setVisibility(4);
                }
                mkVar.X.I = null;
                return;
            case 14:
                org.telegram.ui.Components.hm hmVar = (org.telegram.ui.Components.hm) this.f40522b;
                if (animator.equals(hmVar.f26984a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hmVar.f26984a;
                    chatAttachAlertPhotoLayout.f24231c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) this.f40522b;
                org.telegram.ui.Components.bn bnVar = anVar.P;
                bnVar.J = null;
                bnVar.K = false;
                anVar.invalidate();
                return;
            case 16:
                org.telegram.ui.Components.wp wpVar = (org.telegram.ui.Components.wp) this.f40522b;
                org.telegram.ui.Components.t21 t21Var = wpVar.Q;
                if (t21Var != null) {
                    if (t21Var.getParent() != null) {
                        ((ViewGroup) wpVar.Q.getParent()).removeView(wpVar.Q);
                    }
                    wpVar.Q = null;
                }
                wpVar.S = null;
                super.onAnimationEnd(animator);
                return;
            case 17:
                org.telegram.ui.Components.t21 t21Var2 = (org.telegram.ui.Components.t21) this.f40522b;
                t21Var2.f30622c = null;
                t21Var2.f30620a.setShader(null);
                t21Var2.f30624n = null;
                t21Var2.f30625r = null;
                t21Var2.setImageDrawable(null);
                AndroidUtilities.removeFromParent(t21Var2);
                return;
            case 18:
                CheckBox checkBox = (CheckBox) this.f40522b;
                if (animator.equals(checkBox.f24279s)) {
                    checkBox.f24279s = null;
                }
                if (!checkBox.f24281x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 19:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f40522b;
                if (animator.equals(checkBoxBase.f24295p)) {
                    checkBoxBase.f24295p = null;
                }
                if (!checkBoxBase.f24296q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.wq wqVar = (org.telegram.ui.Components.wq) this.f40522b;
                if (wqVar.K == wqVar.L) {
                    wqVar.G.setVisibility(4);
                }
                wqVar.f32329y = null;
                return;
            case 21:
                org.telegram.ui.Components.er erVar = (org.telegram.ui.Components.er) this.f40522b;
                erVar.f26039l = 1.0f;
                erVar.f26042o = null;
                erVar.f26043p = null;
                erVar.f26044q = null;
                View view2 = erVar.H;
                if (view2 != null) {
                    if (erVar.h == 0 && erVar.G) {
                        view2.setVisibility(8);
                    }
                    erVar.H.invalidate();
                }
                erVar.f26033c = -1;
                return;
            case 22:
                org.telegram.ui.Components.qu quVar = (org.telegram.ui.Components.qu) this.f40522b;
                quVar.O = false;
                quVar.d.setTranslationY(0.0f);
                quVar.d.setAlpha(0.0f);
                quVar.c(0.0f);
                quVar.R = 0.0f;
                quVar.j();
                return;
            case 23:
                ((org.telegram.ui.Components.yu) this.f40522b).f33041a.O = false;
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.rv) this.f40522b).d = null;
                return;
            case 25:
                ((org.telegram.ui.Components.tz) this.f40522b).W = null;
                return;
            case 26:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.cz) this.f40522b).f25456n = null;
                return;
            case 27:
                ((org.telegram.ui.Components.q00) this.f40522b).a();
                return;
            case 28:
                org.telegram.ui.Components.s00 s00Var = (org.telegram.ui.Components.s00) this.f40522b;
                s00Var.U = s00Var.f30309c0;
                s00Var.f30307b0 = s00Var.f30313f0;
                s00Var.V = s00Var.f30310d0;
                s00Var.W = s00Var.f30311e0;
                s00Var.f30309c0 = -1;
                s00Var.f30310d0 = -1;
                s00Var.f30311e0 = -1;
                s00Var.f30313f0 = -1;
                return;
            default:
                org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) this.f40522b;
                g10Var.v = 1.0f;
                g10Var.invalidate();
                return;
        }
    }

    public pq(qq qqVar, s4.n0 n0Var) {
        this.f40521a = 0;
        this.f40522b = qqVar;
    }
}
