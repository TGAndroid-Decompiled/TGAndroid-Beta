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
    public final int f39676a;
    public final Object f39677b;

    public nq(Object obj, int i10) {
        this.f39676a = i10;
        this.f39677b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39676a) {
            case 14:
                ((org.telegram.ui.Components.hm) this.f39677b).f26923a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39676a) {
            case 0:
                oq oqVar = (oq) this.f39677b;
                View view = oqVar.f39961b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((hr) oqVar.d).f37726c.removeView(view);
                return;
            case 1:
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.f39677b;
                i6Var.d = null;
                i6Var.f27137b.clear();
                return;
            case 2:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f39677b;
                animatedPhoneNumberEditText.f23906n = null;
                animatedPhoneNumberEditText.f23905f.clear();
                return;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) this.f39677b;
                p6Var.b();
                p6Var.f29241o = null;
                p6Var.f29236j = 0.0f;
                p6Var.f29239m = 0.0f;
                p6Var.f29238l = 0.0f;
                p6Var.f29237k = 0.0f;
                p6Var.f29244r = 0.0f;
                p6Var.f29243q = 0.0f;
                p6Var.invalidateSelf();
                Runnable runnable = p6Var.f29231b0;
                if (runnable != null) {
                    runnable.run();
                }
                p6Var.f29246t = null;
                CharSequence charSequence = p6Var.f29247u;
                if (charSequence != null) {
                    p6Var.t(charSequence, true, p6Var.v);
                    p6Var.f29247u = null;
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
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f39677b;
                w9Var.setVisibility(8);
                w9Var.setImageDrawable(null);
                w9Var.setAlpha(1.0f);
                return;
            case 5:
                org.telegram.ui.Components.e9 e9Var = ((org.telegram.ui.Components.s8) this.f39677b).f30220b;
                e9Var.f25851f = false;
                e9Var.e.setVisibility(8);
                return;
            case 6:
                org.telegram.ui.Components.j9 j9Var = (org.telegram.ui.Components.j9) this.f39677b;
                if (j9Var.f27455f != null) {
                    j9Var.e = 1.0f;
                    j9Var.n();
                    if (j9Var.f27456g) {
                        j9Var.f27456g = false;
                        Runnable runnable2 = j9Var.f27458j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    j9Var.f();
                }
                j9Var.f27455f = null;
                return;
            case 7:
                ((org.telegram.ui.Components.rf) this.f39677b).f29931f.f23920b0.setVisibility(8);
                return;
            case 8:
                ((org.telegram.ui.Components.vg) this.f39677b).f31241d0 = 1.0f;
                return;
            case 9:
                ((org.telegram.ui.Components.ti) ((org.telegram.ui.Components.bi) this.f39677b).d).f30589s.setVisibility(8);
                return;
            case 10:
                ((org.telegram.ui.Components.di) this.f39677b).d.v.setVisibility(8);
                return;
            case 11:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) this.f39677b;
                tiVar.f30541c1 = null;
                if (!tiVar.f30594t1) {
                    if (tiVar.f30534a1.getTag() == null && tiVar.T0 == 0 && !tiVar.W0) {
                        tiVar.f30544d1.setVisibility(4);
                    }
                    tiVar.l1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var = tiVar.f30557h1;
                if (u0Var != null) {
                    u0Var.setVisibility(4);
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.nk nkVar = (org.telegram.ui.Components.nk) this.f39677b;
                nkVar.f28828s.setVisibility(8);
                nkVar.f28826n = 0;
                org.telegram.ui.Components.ck ckVar = nkVar.f28827r;
                ckVar.setAlpha(1.0f);
                ckVar.setScaleX(1.0f);
                ckVar.setScaleY(1.0f);
                ckVar.setTranslationX(0.0f);
                ckVar.invalidate();
                return;
            case 13:
                org.telegram.ui.Components.mk mkVar = (org.telegram.ui.Components.mk) this.f39677b;
                if (mkVar.X.H.getTag() == null) {
                    mkVar.X.H.setVisibility(4);
                }
                mkVar.X.I = null;
                return;
            case 14:
                org.telegram.ui.Components.hm hmVar = (org.telegram.ui.Components.hm) this.f39677b;
                if (animator.equals(hmVar.f26923a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hmVar.f26923a;
                    chatAttachAlertPhotoLayout.f24090c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) this.f39677b;
                org.telegram.ui.Components.bn bnVar = anVar.P;
                bnVar.J = null;
                bnVar.K = false;
                anVar.invalidate();
                return;
            case 16:
                org.telegram.ui.Components.wp wpVar = (org.telegram.ui.Components.wp) this.f39677b;
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
                CheckBox checkBox = (CheckBox) this.f39677b;
                if (animator.equals(checkBox.f24138s)) {
                    checkBox.f24138s = null;
                }
                if (!checkBox.f24140x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 18:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f39677b;
                if (animator.equals(checkBoxBase.f24154p)) {
                    checkBoxBase.f24154p = null;
                }
                if (!checkBoxBase.f24155q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.wq wqVar = (org.telegram.ui.Components.wq) this.f39677b;
                if (wqVar.K == wqVar.L) {
                    wqVar.G.setVisibility(4);
                }
                wqVar.f32242y = null;
                return;
            case 20:
                org.telegram.ui.Components.fr frVar = (org.telegram.ui.Components.fr) this.f39677b;
                frVar.f26352l = 1.0f;
                frVar.f26355o = null;
                frVar.f26356p = null;
                frVar.f26357q = null;
                View view2 = frVar.H;
                if (view2 != null) {
                    if (frVar.h == 0 && frVar.G) {
                        view2.setVisibility(8);
                    }
                    frVar.H.invalidate();
                }
                frVar.f26346c = -1;
                return;
            case 21:
                org.telegram.ui.Components.qu quVar = (org.telegram.ui.Components.qu) this.f39677b;
                quVar.O = false;
                quVar.d.setTranslationY(0.0f);
                quVar.d.setAlpha(0.0f);
                quVar.c(0.0f);
                quVar.R = 0.0f;
                quVar.j();
                return;
            case 22:
                ((org.telegram.ui.Components.yu) this.f39677b).f32737a.O = false;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.rv) this.f39677b).d = null;
                return;
            case 24:
                ((org.telegram.ui.Components.tz) this.f39677b).W = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.cz) this.f39677b).f25290n = null;
                return;
            case 26:
                ((org.telegram.ui.Components.q00) this.f39677b).a();
                return;
            case 27:
                org.telegram.ui.Components.s00 s00Var = (org.telegram.ui.Components.s00) this.f39677b;
                s00Var.U = s00Var.f30074c0;
                s00Var.f30072b0 = s00Var.f30078f0;
                s00Var.V = s00Var.f30075d0;
                s00Var.W = s00Var.f30076e0;
                s00Var.f30074c0 = -1;
                s00Var.f30075d0 = -1;
                s00Var.f30076e0 = -1;
                s00Var.f30078f0 = -1;
                return;
            case 28:
                org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) this.f39677b;
                g10Var.f26473s = 1.0f;
                g10Var.invalidate();
                return;
            default:
                org.telegram.ui.Components.l60 l60Var = (org.telegram.ui.Components.l60) this.f39677b;
                if (animator == l60Var.W) {
                    l60Var.c(true);
                    l60Var.setVisibility(4);
                    return;
                }
                return;
        }
    }

    public nq(oq oqVar, s4.n0 n0Var) {
        this.f39676a = 0;
        this.f39677b = oqVar;
    }
}
