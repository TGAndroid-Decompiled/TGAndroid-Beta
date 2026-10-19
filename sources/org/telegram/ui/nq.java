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
    public final int f39666a;
    public final Object f39667b;

    public nq(Object obj, int i10) {
        this.f39666a = i10;
        this.f39667b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39666a) {
            case 14:
                ((org.telegram.ui.Components.hm) this.f39667b).f26898a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39666a) {
            case 0:
                oq oqVar = (oq) this.f39667b;
                View view = oqVar.f39951b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((hr) oqVar.d).f37715c.removeView(view);
                return;
            case 1:
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.f39667b;
                i6Var.d = null;
                i6Var.f27082b.clear();
                return;
            case 2:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f39667b;
                animatedPhoneNumberEditText.f23899n = null;
                animatedPhoneNumberEditText.f23898f.clear();
                return;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) this.f39667b;
                p6Var.b();
                p6Var.f29191o = null;
                p6Var.f29186j = 0.0f;
                p6Var.f29189m = 0.0f;
                p6Var.f29188l = 0.0f;
                p6Var.f29187k = 0.0f;
                p6Var.f29194r = 0.0f;
                p6Var.f29193q = 0.0f;
                p6Var.invalidateSelf();
                Runnable runnable = p6Var.f29181b0;
                if (runnable != null) {
                    runnable.run();
                }
                p6Var.f29196t = null;
                CharSequence charSequence = p6Var.f29197u;
                if (charSequence != null) {
                    p6Var.t(charSequence, true, p6Var.v);
                    p6Var.f29197u = null;
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
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f39667b;
                w9Var.setVisibility(8);
                w9Var.setImageDrawable(null);
                w9Var.setAlpha(1.0f);
                return;
            case 5:
                org.telegram.ui.Components.e9 e9Var = ((org.telegram.ui.Components.s8) this.f39667b).f30207b;
                e9Var.f25858f = false;
                e9Var.e.setVisibility(8);
                return;
            case 6:
                org.telegram.ui.Components.j9 j9Var = (org.telegram.ui.Components.j9) this.f39667b;
                if (j9Var.f27456f != null) {
                    j9Var.e = 1.0f;
                    j9Var.n();
                    if (j9Var.f27457g) {
                        j9Var.f27457g = false;
                        Runnable runnable2 = j9Var.f27459j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    j9Var.f();
                }
                j9Var.f27456f = null;
                return;
            case 7:
                ((org.telegram.ui.Components.rf) this.f39667b).f29931f.f23913b0.setVisibility(8);
                return;
            case 8:
                ((org.telegram.ui.Components.vg) this.f39667b).f31269d0 = 1.0f;
                return;
            case 9:
                ((org.telegram.ui.Components.ti) ((org.telegram.ui.Components.bi) this.f39667b).d).f30573s.setVisibility(8);
                return;
            case 10:
                ((org.telegram.ui.Components.di) this.f39667b).d.v.setVisibility(8);
                return;
            case 11:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) this.f39667b;
                tiVar.f30525c1 = null;
                if (!tiVar.f30578t1) {
                    if (tiVar.f30518a1.getTag() == null && tiVar.T0 == 0 && !tiVar.W0) {
                        tiVar.f30528d1.setVisibility(4);
                    }
                    tiVar.l1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var = tiVar.f30541h1;
                if (u0Var != null) {
                    u0Var.setVisibility(4);
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.nk nkVar = (org.telegram.ui.Components.nk) this.f39667b;
                nkVar.f28791s.setVisibility(8);
                nkVar.f28789n = 0;
                org.telegram.ui.Components.ck ckVar = nkVar.f28790r;
                ckVar.setAlpha(1.0f);
                ckVar.setScaleX(1.0f);
                ckVar.setScaleY(1.0f);
                ckVar.setTranslationX(0.0f);
                ckVar.invalidate();
                return;
            case 13:
                org.telegram.ui.Components.mk mkVar = (org.telegram.ui.Components.mk) this.f39667b;
                if (mkVar.X.H.getTag() == null) {
                    mkVar.X.H.setVisibility(4);
                }
                mkVar.X.I = null;
                return;
            case 14:
                org.telegram.ui.Components.hm hmVar = (org.telegram.ui.Components.hm) this.f39667b;
                if (animator.equals(hmVar.f26898a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hmVar.f26898a;
                    chatAttachAlertPhotoLayout.f24083c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) this.f39667b;
                org.telegram.ui.Components.bn bnVar = anVar.P;
                bnVar.J = null;
                bnVar.K = false;
                anVar.invalidate();
                return;
            case 16:
                org.telegram.ui.Components.wp wpVar = (org.telegram.ui.Components.wp) this.f39667b;
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
                CheckBox checkBox = (CheckBox) this.f39667b;
                if (animator.equals(checkBox.f24131s)) {
                    checkBox.f24131s = null;
                }
                if (!checkBox.f24133x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 18:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f39667b;
                if (animator.equals(checkBoxBase.f24147p)) {
                    checkBoxBase.f24147p = null;
                }
                if (!checkBoxBase.f24148q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.wq wqVar = (org.telegram.ui.Components.wq) this.f39667b;
                if (wqVar.K == wqVar.L) {
                    wqVar.G.setVisibility(4);
                }
                wqVar.f32200y = null;
                return;
            case 20:
                org.telegram.ui.Components.fr frVar = (org.telegram.ui.Components.fr) this.f39667b;
                frVar.f26349l = 1.0f;
                frVar.f26352o = null;
                frVar.f26353p = null;
                frVar.f26354q = null;
                View view2 = frVar.H;
                if (view2 != null) {
                    if (frVar.h == 0 && frVar.G) {
                        view2.setVisibility(8);
                    }
                    frVar.H.invalidate();
                }
                frVar.f26343c = -1;
                return;
            case 21:
                org.telegram.ui.Components.qu quVar = (org.telegram.ui.Components.qu) this.f39667b;
                quVar.O = false;
                quVar.d.setTranslationY(0.0f);
                quVar.d.setAlpha(0.0f);
                quVar.c(0.0f);
                quVar.R = 0.0f;
                quVar.j();
                return;
            case 22:
                ((org.telegram.ui.Components.yu) this.f39667b).f32749a.O = false;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.rv) this.f39667b).d = null;
                return;
            case 24:
                ((org.telegram.ui.Components.tz) this.f39667b).W = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.cz) this.f39667b).f25367n = null;
                return;
            case 26:
                ((org.telegram.ui.Components.q00) this.f39667b).a();
                return;
            case 27:
                org.telegram.ui.Components.s00 s00Var = (org.telegram.ui.Components.s00) this.f39667b;
                s00Var.U = s00Var.f30076c0;
                s00Var.f30074b0 = s00Var.f30080f0;
                s00Var.V = s00Var.f30077d0;
                s00Var.W = s00Var.f30078e0;
                s00Var.f30076c0 = -1;
                s00Var.f30077d0 = -1;
                s00Var.f30078e0 = -1;
                s00Var.f30080f0 = -1;
                return;
            case 28:
                org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) this.f39667b;
                g10Var.f26428s = 1.0f;
                g10Var.invalidate();
                return;
            default:
                org.telegram.ui.Components.l60 l60Var = (org.telegram.ui.Components.l60) this.f39667b;
                if (animator == l60Var.W) {
                    l60Var.c(true);
                    l60Var.setVisibility(4);
                    return;
                }
                return;
        }
    }

    public nq(oq oqVar, s4.n0 n0Var) {
        this.f39666a = 0;
        this.f39667b = oqVar;
    }
}
