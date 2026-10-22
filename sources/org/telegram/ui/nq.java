package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.CheckBoxBase;
public final class nq extends AnimatorListenerAdapter {
    public final int f39675a;
    public final Object f39676b;

    public nq(Object obj, int i10) {
        this.f39675a = i10;
        this.f39676b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39675a) {
            case 14:
                ((org.telegram.ui.Components.hm) this.f39676b).f26922a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39675a) {
            case 0:
                oq oqVar = (oq) this.f39676b;
                View view = oqVar.f39960b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((hr) oqVar.d).f37725c.removeView(view);
                return;
            case 1:
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.f39676b;
                i6Var.d = null;
                i6Var.f27136b.clear();
                return;
            case 2:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f39676b;
                animatedPhoneNumberEditText.f23905n = null;
                animatedPhoneNumberEditText.f23904f.clear();
                return;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) this.f39676b;
                p6Var.b();
                p6Var.f29240o = null;
                p6Var.f29235j = 0.0f;
                p6Var.f29238m = 0.0f;
                p6Var.f29237l = 0.0f;
                p6Var.f29236k = 0.0f;
                p6Var.f29243r = 0.0f;
                p6Var.f29242q = 0.0f;
                p6Var.invalidateSelf();
                Runnable runnable = p6Var.f29230b0;
                if (runnable != null) {
                    runnable.run();
                }
                p6Var.f29245t = null;
                CharSequence charSequence = p6Var.f29246u;
                if (charSequence != null) {
                    p6Var.t(charSequence, true, p6Var.v);
                    p6Var.f29246u = null;
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
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f39676b;
                w9Var.setVisibility(8);
                w9Var.setImageDrawable(null);
                w9Var.setAlpha(1.0f);
                return;
            case 5:
                org.telegram.ui.Components.e9 e9Var = ((org.telegram.ui.Components.s8) this.f39676b).f30219b;
                e9Var.f25850f = false;
                e9Var.e.setVisibility(8);
                return;
            case 6:
                org.telegram.ui.Components.j9 j9Var = (org.telegram.ui.Components.j9) this.f39676b;
                if (j9Var.f27454f != null) {
                    j9Var.e = 1.0f;
                    j9Var.n();
                    if (j9Var.f27455g) {
                        j9Var.f27455g = false;
                        Runnable runnable2 = j9Var.f27457j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    j9Var.f();
                }
                j9Var.f27454f = null;
                return;
            case 7:
                ((org.telegram.ui.Components.rf) this.f39676b).f29930f.f23919b0.setVisibility(8);
                return;
            case 8:
                ((org.telegram.ui.Components.vg) this.f39676b).f31240d0 = 1.0f;
                return;
            case 9:
                ((org.telegram.ui.Components.ti) ((org.telegram.ui.Components.bi) this.f39676b).d).f30588s.setVisibility(8);
                return;
            case 10:
                ((org.telegram.ui.Components.di) this.f39676b).d.v.setVisibility(8);
                return;
            case 11:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) this.f39676b;
                tiVar.f30540c1 = null;
                if (!tiVar.f30593t1) {
                    if (tiVar.f30533a1.getTag() == null && tiVar.T0 == 0 && !tiVar.W0) {
                        tiVar.f30543d1.setVisibility(4);
                    }
                    tiVar.l1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var = tiVar.f30556h1;
                if (u0Var != null) {
                    u0Var.setVisibility(4);
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.nk nkVar = (org.telegram.ui.Components.nk) this.f39676b;
                nkVar.f28827s.setVisibility(8);
                nkVar.f28825n = 0;
                org.telegram.ui.Components.ck ckVar = nkVar.f28826r;
                ckVar.setAlpha(1.0f);
                ckVar.setScaleX(1.0f);
                ckVar.setScaleY(1.0f);
                ckVar.setTranslationX(0.0f);
                ckVar.invalidate();
                return;
            case 13:
                org.telegram.ui.Components.mk mkVar = (org.telegram.ui.Components.mk) this.f39676b;
                if (mkVar.X.H.getTag() == null) {
                    mkVar.X.H.setVisibility(4);
                }
                mkVar.X.I = null;
                return;
            case 14:
                org.telegram.ui.Components.hm hmVar = (org.telegram.ui.Components.hm) this.f39676b;
                if (animator.equals(hmVar.f26922a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hmVar.f26922a;
                    chatAttachAlertPhotoLayout.f24089c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) this.f39676b;
                org.telegram.ui.Components.bn bnVar = anVar.P;
                bnVar.J = null;
                bnVar.K = false;
                anVar.invalidate();
                return;
            case 16:
                org.telegram.ui.Components.wp wpVar = (org.telegram.ui.Components.wp) this.f39676b;
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
                CheckBox checkBox = (CheckBox) this.f39676b;
                if (animator.equals(checkBox.f24137s)) {
                    checkBox.f24137s = null;
                }
                if (!checkBox.f24139x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 18:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f39676b;
                if (animator.equals(checkBoxBase.f24153p)) {
                    checkBoxBase.f24153p = null;
                }
                if (!checkBoxBase.f24154q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.wq wqVar = (org.telegram.ui.Components.wq) this.f39676b;
                if (wqVar.K == wqVar.L) {
                    wqVar.G.setVisibility(4);
                }
                wqVar.f32241y = null;
                return;
            case 20:
                org.telegram.ui.Components.fr frVar = (org.telegram.ui.Components.fr) this.f39676b;
                frVar.f26351l = 1.0f;
                frVar.f26354o = null;
                frVar.f26355p = null;
                frVar.f26356q = null;
                View view2 = frVar.H;
                if (view2 != null) {
                    if (frVar.h == 0 && frVar.G) {
                        view2.setVisibility(8);
                    }
                    frVar.H.invalidate();
                }
                frVar.f26345c = -1;
                return;
            case 21:
                org.telegram.ui.Components.qu quVar = (org.telegram.ui.Components.qu) this.f39676b;
                quVar.O = false;
                quVar.d.setTranslationY(0.0f);
                quVar.d.setAlpha(0.0f);
                quVar.c(0.0f);
                quVar.R = 0.0f;
                quVar.j();
                return;
            case 22:
                ((org.telegram.ui.Components.yu) this.f39676b).f32736a.O = false;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.rv) this.f39676b).d = null;
                return;
            case 24:
                ((org.telegram.ui.Components.tz) this.f39676b).W = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.cz) this.f39676b).f25289n = null;
                return;
            case 26:
                ((org.telegram.ui.Components.q00) this.f39676b).a();
                return;
            case 27:
                org.telegram.ui.Components.s00 s00Var = (org.telegram.ui.Components.s00) this.f39676b;
                s00Var.U = s00Var.f30073c0;
                s00Var.f30071b0 = s00Var.f30077f0;
                s00Var.V = s00Var.f30074d0;
                s00Var.W = s00Var.f30075e0;
                s00Var.f30073c0 = -1;
                s00Var.f30074d0 = -1;
                s00Var.f30075e0 = -1;
                s00Var.f30077f0 = -1;
                return;
            case 28:
                org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) this.f39676b;
                g10Var.f26472s = 1.0f;
                g10Var.invalidate();
                return;
            default:
                org.telegram.ui.Components.l60 l60Var = (org.telegram.ui.Components.l60) this.f39676b;
                if (animator == l60Var.W) {
                    l60Var.c(true);
                    l60Var.setVisibility(4);
                    return;
                }
                return;
        }
    }

    public nq(oq oqVar, s4.n0 n0Var) {
        this.f39675a = 0;
        this.f39676b = oqVar;
    }
}
