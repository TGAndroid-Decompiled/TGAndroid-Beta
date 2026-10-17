package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.CheckBoxBase;
public final class pq extends AnimatorListenerAdapter {
    public final int f40216a;
    public final Object f40217b;

    public pq(Object obj, int i10) {
        this.f40216a = i10;
        this.f40217b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40216a) {
            case 14:
                ((org.telegram.ui.Components.hm) this.f40217b).f26905a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40216a) {
            case 0:
                qq qqVar = (qq) this.f40217b;
                View view = qqVar.f40485b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((jr) qqVar.d).f38270c.removeView(view);
                return;
            case 1:
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.f40217b;
                i6Var.d = null;
                i6Var.f27083b.clear();
                return;
            case 2:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f40217b;
                animatedPhoneNumberEditText.f23898n = null;
                animatedPhoneNumberEditText.f23897f.clear();
                return;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) this.f40217b;
                p6Var.b();
                p6Var.f29204o = null;
                p6Var.f29199j = 0.0f;
                p6Var.f29202m = 0.0f;
                p6Var.f29201l = 0.0f;
                p6Var.f29200k = 0.0f;
                p6Var.f29207r = 0.0f;
                p6Var.f29206q = 0.0f;
                p6Var.invalidateSelf();
                Runnable runnable = p6Var.f29195c0;
                if (runnable != null) {
                    runnable.run();
                }
                p6Var.f29209t = null;
                CharSequence charSequence = p6Var.f29210u;
                if (charSequence != null) {
                    p6Var.t(charSequence, true, p6Var.v);
                    p6Var.f29210u = null;
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
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f40217b;
                w9Var.setVisibility(8);
                w9Var.setImageDrawable(null);
                w9Var.setAlpha(1.0f);
                return;
            case 5:
                org.telegram.ui.Components.e9 e9Var = ((org.telegram.ui.Components.s8) this.f40217b).f30215b;
                e9Var.f25879f = false;
                e9Var.e.setVisibility(8);
                return;
            case 6:
                org.telegram.ui.Components.j9 j9Var = (org.telegram.ui.Components.j9) this.f40217b;
                if (j9Var.f27452f != null) {
                    j9Var.e = 1.0f;
                    j9Var.n();
                    if (j9Var.f27453g) {
                        j9Var.f27453g = false;
                        Runnable runnable2 = j9Var.f27455j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    j9Var.f();
                }
                j9Var.f27452f = null;
                return;
            case 7:
                ((org.telegram.ui.Components.rf) this.f40217b).f29925f.f23912b0.setVisibility(8);
                return;
            case 8:
                ((org.telegram.ui.Components.vg) this.f40217b).f31260d0 = 1.0f;
                return;
            case 9:
                ((org.telegram.ui.Components.ti) ((org.telegram.ui.Components.bi) this.f40217b).d).f30613s.setVisibility(8);
                return;
            case 10:
                ((org.telegram.ui.Components.di) this.f40217b).d.v.setVisibility(8);
                return;
            case 11:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) this.f40217b;
                tiVar.f30565c1 = null;
                if (!tiVar.f30618t1) {
                    if (tiVar.f30558a1.getTag() == null && tiVar.T0 == 0 && !tiVar.W0) {
                        tiVar.f30568d1.setVisibility(4);
                    }
                    tiVar.l1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var = tiVar.f30581h1;
                if (u0Var != null) {
                    u0Var.setVisibility(4);
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.nk nkVar = (org.telegram.ui.Components.nk) this.f40217b;
                nkVar.f28775s.setVisibility(8);
                nkVar.f28773n = 0;
                org.telegram.ui.Components.ck ckVar = nkVar.f28774r;
                ckVar.setAlpha(1.0f);
                ckVar.setScaleX(1.0f);
                ckVar.setScaleY(1.0f);
                ckVar.setTranslationX(0.0f);
                ckVar.invalidate();
                return;
            case 13:
                org.telegram.ui.Components.mk mkVar = (org.telegram.ui.Components.mk) this.f40217b;
                if (mkVar.X.H.getTag() == null) {
                    mkVar.X.H.setVisibility(4);
                }
                mkVar.X.I = null;
                return;
            case 14:
                org.telegram.ui.Components.hm hmVar = (org.telegram.ui.Components.hm) this.f40217b;
                if (animator.equals(hmVar.f26905a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hmVar.f26905a;
                    chatAttachAlertPhotoLayout.f24082c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) this.f40217b;
                org.telegram.ui.Components.bn bnVar = anVar.P;
                bnVar.J = null;
                bnVar.K = false;
                anVar.invalidate();
                return;
            case 16:
                org.telegram.ui.Components.wp wpVar = (org.telegram.ui.Components.wp) this.f40217b;
                ei.db dbVar = wpVar.R;
                if (dbVar != null) {
                    if (dbVar.getParent() != null) {
                        ((ViewGroup) wpVar.R.getParent()).removeView(wpVar.R);
                    }
                    wpVar.R = null;
                }
                wpVar.T = null;
                super.onAnimationEnd(animator);
                return;
            case 17:
                CheckBox checkBox = (CheckBox) this.f40217b;
                if (animator.equals(checkBox.f24130s)) {
                    checkBox.f24130s = null;
                }
                if (!checkBox.f24132x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 18:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f40217b;
                if (animator.equals(checkBoxBase.f24146p)) {
                    checkBoxBase.f24146p = null;
                }
                if (!checkBoxBase.f24147q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.wq wqVar = (org.telegram.ui.Components.wq) this.f40217b;
                if (wqVar.K == wqVar.L) {
                    wqVar.G.setVisibility(4);
                }
                wqVar.f32203y = null;
                return;
            case 20:
                org.telegram.ui.Components.fr frVar = (org.telegram.ui.Components.fr) this.f40217b;
                frVar.f26362l = 1.0f;
                frVar.f26365o = null;
                frVar.f26366p = null;
                frVar.f26367q = null;
                View view2 = frVar.H;
                if (view2 != null) {
                    if (frVar.h == 0 && frVar.G) {
                        view2.setVisibility(8);
                    }
                    frVar.H.invalidate();
                }
                frVar.f26356c = -1;
                return;
            case 21:
                org.telegram.ui.Components.qu quVar = (org.telegram.ui.Components.qu) this.f40217b;
                quVar.O = false;
                quVar.d.setTranslationY(0.0f);
                quVar.d.setAlpha(0.0f);
                quVar.c(0.0f);
                quVar.R = 0.0f;
                quVar.j();
                return;
            case 22:
                ((org.telegram.ui.Components.yu) this.f40217b).f32758a.O = false;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.rv) this.f40217b).d = null;
                return;
            case 24:
                ((org.telegram.ui.Components.tz) this.f40217b).W = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.cz) this.f40217b).f25408n = null;
                return;
            case 26:
                ((org.telegram.ui.Components.q00) this.f40217b).a();
                return;
            case 27:
                org.telegram.ui.Components.s00 s00Var = (org.telegram.ui.Components.s00) this.f40217b;
                s00Var.U = s00Var.f30096c0;
                s00Var.f30094b0 = s00Var.f30100f0;
                s00Var.V = s00Var.f30097d0;
                s00Var.W = s00Var.f30098e0;
                s00Var.f30096c0 = -1;
                s00Var.f30097d0 = -1;
                s00Var.f30098e0 = -1;
                s00Var.f30100f0 = -1;
                return;
            case 28:
                org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) this.f40217b;
                g10Var.f26441s = 1.0f;
                g10Var.invalidate();
                return;
            default:
                org.telegram.ui.Components.l60 l60Var = (org.telegram.ui.Components.l60) this.f40217b;
                if (animator == l60Var.W) {
                    l60Var.c(true);
                    l60Var.setVisibility(4);
                    return;
                }
                return;
        }
    }

    public pq(qq qqVar, s4.n0 n0Var) {
        this.f40216a = 0;
        this.f40217b = qqVar;
    }
}
