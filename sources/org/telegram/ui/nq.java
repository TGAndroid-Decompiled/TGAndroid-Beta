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
    public final int f39672a;
    public final Object f39673b;

    public nq(Object obj, int i10) {
        this.f39672a = i10;
        this.f39673b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39672a) {
            case 14:
                ((org.telegram.ui.Components.hm) this.f39673b).f26919a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39672a) {
            case 0:
                oq oqVar = (oq) this.f39673b;
                View view = oqVar.f39957b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((hr) oqVar.d).f37721c.removeView(view);
                return;
            case 1:
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.f39673b;
                i6Var.d = null;
                i6Var.f27133b.clear();
                return;
            case 2:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f39673b;
                animatedPhoneNumberEditText.f23902n = null;
                animatedPhoneNumberEditText.f23901f.clear();
                return;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) this.f39673b;
                p6Var.b();
                p6Var.f29236o = null;
                p6Var.f29231j = 0.0f;
                p6Var.f29234m = 0.0f;
                p6Var.f29233l = 0.0f;
                p6Var.f29232k = 0.0f;
                p6Var.f29239r = 0.0f;
                p6Var.f29238q = 0.0f;
                p6Var.invalidateSelf();
                Runnable runnable = p6Var.f29226b0;
                if (runnable != null) {
                    runnable.run();
                }
                p6Var.f29241t = null;
                CharSequence charSequence = p6Var.f29242u;
                if (charSequence != null) {
                    p6Var.t(charSequence, true, p6Var.v);
                    p6Var.f29242u = null;
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
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f39673b;
                w9Var.setVisibility(8);
                w9Var.setImageDrawable(null);
                w9Var.setAlpha(1.0f);
                return;
            case 5:
                org.telegram.ui.Components.e9 e9Var = ((org.telegram.ui.Components.s8) this.f39673b).f30215b;
                e9Var.f25847f = false;
                e9Var.e.setVisibility(8);
                return;
            case 6:
                org.telegram.ui.Components.j9 j9Var = (org.telegram.ui.Components.j9) this.f39673b;
                if (j9Var.f27451f != null) {
                    j9Var.e = 1.0f;
                    j9Var.n();
                    if (j9Var.f27452g) {
                        j9Var.f27452g = false;
                        Runnable runnable2 = j9Var.f27454j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    j9Var.f();
                }
                j9Var.f27451f = null;
                return;
            case 7:
                ((org.telegram.ui.Components.rf) this.f39673b).f29926f.f23916b0.setVisibility(8);
                return;
            case 8:
                ((org.telegram.ui.Components.vg) this.f39673b).f31236d0 = 1.0f;
                return;
            case 9:
                ((org.telegram.ui.Components.ti) ((org.telegram.ui.Components.bi) this.f39673b).d).f30584s.setVisibility(8);
                return;
            case 10:
                ((org.telegram.ui.Components.di) this.f39673b).d.v.setVisibility(8);
                return;
            case 11:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) this.f39673b;
                tiVar.f30536c1 = null;
                if (!tiVar.f30589t1) {
                    if (tiVar.f30529a1.getTag() == null && tiVar.T0 == 0 && !tiVar.W0) {
                        tiVar.f30539d1.setVisibility(4);
                    }
                    tiVar.l1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var = tiVar.f30552h1;
                if (u0Var != null) {
                    u0Var.setVisibility(4);
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.nk nkVar = (org.telegram.ui.Components.nk) this.f39673b;
                nkVar.f28823s.setVisibility(8);
                nkVar.f28821n = 0;
                org.telegram.ui.Components.ck ckVar = nkVar.f28822r;
                ckVar.setAlpha(1.0f);
                ckVar.setScaleX(1.0f);
                ckVar.setScaleY(1.0f);
                ckVar.setTranslationX(0.0f);
                ckVar.invalidate();
                return;
            case 13:
                org.telegram.ui.Components.mk mkVar = (org.telegram.ui.Components.mk) this.f39673b;
                if (mkVar.X.H.getTag() == null) {
                    mkVar.X.H.setVisibility(4);
                }
                mkVar.X.I = null;
                return;
            case 14:
                org.telegram.ui.Components.hm hmVar = (org.telegram.ui.Components.hm) this.f39673b;
                if (animator.equals(hmVar.f26919a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hmVar.f26919a;
                    chatAttachAlertPhotoLayout.f24086c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) this.f39673b;
                org.telegram.ui.Components.bn bnVar = anVar.P;
                bnVar.J = null;
                bnVar.K = false;
                anVar.invalidate();
                return;
            case 16:
                org.telegram.ui.Components.wp wpVar = (org.telegram.ui.Components.wp) this.f39673b;
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
                CheckBox checkBox = (CheckBox) this.f39673b;
                if (animator.equals(checkBox.f24134s)) {
                    checkBox.f24134s = null;
                }
                if (!checkBox.f24136x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 18:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f39673b;
                if (animator.equals(checkBoxBase.f24150p)) {
                    checkBoxBase.f24150p = null;
                }
                if (!checkBoxBase.f24151q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.wq wqVar = (org.telegram.ui.Components.wq) this.f39673b;
                if (wqVar.K == wqVar.L) {
                    wqVar.G.setVisibility(4);
                }
                wqVar.f32237y = null;
                return;
            case 20:
                org.telegram.ui.Components.fr frVar = (org.telegram.ui.Components.fr) this.f39673b;
                frVar.f26348l = 1.0f;
                frVar.f26351o = null;
                frVar.f26352p = null;
                frVar.f26353q = null;
                View view2 = frVar.H;
                if (view2 != null) {
                    if (frVar.h == 0 && frVar.G) {
                        view2.setVisibility(8);
                    }
                    frVar.H.invalidate();
                }
                frVar.f26342c = -1;
                return;
            case 21:
                org.telegram.ui.Components.qu quVar = (org.telegram.ui.Components.qu) this.f39673b;
                quVar.O = false;
                quVar.d.setTranslationY(0.0f);
                quVar.d.setAlpha(0.0f);
                quVar.c(0.0f);
                quVar.R = 0.0f;
                quVar.j();
                return;
            case 22:
                ((org.telegram.ui.Components.yu) this.f39673b).f32732a.O = false;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.rv) this.f39673b).d = null;
                return;
            case 24:
                ((org.telegram.ui.Components.tz) this.f39673b).W = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.cz) this.f39673b).f25286n = null;
                return;
            case 26:
                ((org.telegram.ui.Components.q00) this.f39673b).a();
                return;
            case 27:
                org.telegram.ui.Components.s00 s00Var = (org.telegram.ui.Components.s00) this.f39673b;
                s00Var.U = s00Var.f30069c0;
                s00Var.f30067b0 = s00Var.f30073f0;
                s00Var.V = s00Var.f30070d0;
                s00Var.W = s00Var.f30071e0;
                s00Var.f30069c0 = -1;
                s00Var.f30070d0 = -1;
                s00Var.f30071e0 = -1;
                s00Var.f30073f0 = -1;
                return;
            case 28:
                org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) this.f39673b;
                g10Var.f26469s = 1.0f;
                g10Var.invalidate();
                return;
            default:
                org.telegram.ui.Components.l60 l60Var = (org.telegram.ui.Components.l60) this.f39673b;
                if (animator == l60Var.W) {
                    l60Var.c(true);
                    l60Var.setVisibility(4);
                    return;
                }
                return;
        }
    }

    public nq(oq oqVar, s4.n0 n0Var) {
        this.f39672a = 0;
        this.f39673b = oqVar;
    }
}
