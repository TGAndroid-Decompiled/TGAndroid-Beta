package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
public final class x5 extends AnimatorListenerAdapter {
    public final int f41590a;
    public final Object f41591b;

    public x5(Object obj, int i7) {
        this.f41590a = i7;
        this.f41591b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41590a) {
            case 13:
                ((sl) this.f41591b).f39333a.P = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41590a) {
            case 0:
                y5 y5Var = (y5) this.f41591b;
                y5Var.d = null;
                y5Var.f41870b.clear();
                return;
            case 1:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f41591b;
                animatedPhoneNumberEditText.S1 = null;
                animatedPhoneNumberEditText.Q1.clear();
                return;
            case 2:
                super.onAnimationEnd(animator);
                g6 g6Var = (g6) this.f41591b;
                g6Var.b();
                g6Var.f34846o = null;
                g6Var.f34841j = 0.0f;
                g6Var.f34844m = 0.0f;
                g6Var.f34843l = 0.0f;
                g6Var.f34842k = 0.0f;
                g6Var.f34849r = 0.0f;
                g6Var.f34848q = 0.0f;
                g6Var.invalidateSelf();
                Runnable runnable = g6Var.f34836c0;
                if (runnable != null) {
                    runnable.run();
                }
                g6Var.f34851t = null;
                CharSequence charSequence = g6Var.f34852u;
                if (charSequence != null) {
                    g6Var.t(charSequence, true, g6Var.v);
                    g6Var.f34852u = null;
                    g6Var.v = false;
                    return;
                }
                dg dgVar = g6Var.J;
                if (dgVar != null) {
                    dgVar.run();
                    return;
                }
                return;
            case 3:
                i9 i9Var = (i9) this.f41591b;
                i9Var.setVisibility(8);
                i9Var.setImageDrawable(null);
                i9Var.setAlpha(1.0f);
                return;
            case 4:
                q8 q8Var = (q8) ((org.telegram.messenger.b9) this.f41591b).n1;
                q8Var.f38569f = false;
                q8Var.f38568e.setVisibility(8);
                return;
            case 5:
                v8 v8Var = (v8) this.f41591b;
                if (v8Var.f40327f != null) {
                    v8Var.f40326e = 1.0f;
                    v8Var.k();
                    if (v8Var.f40328g) {
                        v8Var.f40328g = false;
                        Runnable runnable2 = v8Var.f40330j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    v8Var.d();
                }
                v8Var.f40327f = null;
                return;
            case 6:
                ((ze) this.f41591b).f42347f.f32170c0.setVisibility(8);
                return;
            case 7:
                ((jg) this.f41591b).f35974g0 = 1.0f;
                return;
            case 8:
                ((ki) ((oh) this.f41591b).d).f36488u1.setVisibility(8);
                return;
            case 9:
                ((rh) this.f41591b).d.f36492v1.setVisibility(8);
                return;
            case 10:
                ki kiVar = (ki) this.f41591b;
                kiVar.X2 = null;
                if (!kiVar.f36467o3) {
                    if (kiVar.V2.getTag() == null && kiVar.O2 == 0 && !kiVar.R2) {
                        kiVar.Y2.setVisibility(4);
                    }
                    kiVar.f36442g3.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.q0 q0Var = kiVar.f36431c3;
                if (q0Var != null) {
                    q0Var.setVisibility(4);
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                dk dkVar = (dk) this.f41591b;
                dkVar.f33953s.setVisibility(8);
                dkVar.f33951n = 0;
                rj rjVar = dkVar.f33952r;
                rjVar.setAlpha(1.0f);
                rjVar.setScaleX(1.0f);
                rjVar.setScaleY(1.0f);
                rjVar.setTranslationX(0.0f);
                rjVar.invalidate();
                return;
            case 12:
                ck ckVar = (ck) this.f41591b;
                if (ckVar.Y.I.getTag() == null) {
                    ckVar.Y.I.setVisibility(4);
                }
                ckVar.Y.J = null;
                return;
            case 13:
                sl slVar = (sl) this.f41591b;
                if (animator.equals(slVar.f39333a.P)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = slVar.f39333a;
                    chatAttachAlertPhotoLayout.f32376d0 = true;
                    chatAttachAlertPhotoLayout.P = null;
                    return;
                }
                return;
            case 14:
                hm hmVar = (hm) this.f41591b;
                im imVar = hmVar.Q;
                imVar.K = null;
                imVar.L = false;
                hmVar.invalidate();
                return;
            case 15:
                fm fmVar = (fm) this.f41591b;
                fmVar.f34629b.R = true;
                fmVar.O.f35025z.invalidate();
                return;
            case 16:
                ep epVar = (ep) this.f41591b;
                zz0 zz0Var = epVar.L1;
                if (zz0Var != null) {
                    if (zz0Var.getParent() != null) {
                        ((ViewGroup) epVar.L1.getParent()).removeView(epVar.L1);
                    }
                    epVar.L1 = null;
                }
                epVar.N1 = null;
                super.onAnimationEnd(animator);
                return;
            case 17:
                zz0 zz0Var2 = (zz0) this.f41591b;
                zz0Var2.f42525c = null;
                zz0Var2.f42523a.setShader(null);
                zz0Var2.f42528n = null;
                zz0Var2.f42529r = null;
                zz0Var2.setImageDrawable(null);
                org.telegram.messenger.g0.E2(zz0Var2);
                return;
            case 18:
                CheckBox checkBox = (CheckBox) this.f41591b;
                if (animator.equals(checkBox.f32423s)) {
                    checkBox.f32423s = null;
                }
                if (!checkBox.f32426y) {
                    checkBox.H = null;
                    return;
                }
                return;
            case 19:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f41591b;
                if (animator.equals(checkBoxBase.f32440p)) {
                    checkBoxBase.f32440p = null;
                }
                if (!checkBoxBase.f32441q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 20:
                jq jqVar = (jq) this.f41591b;
                jqVar.f36138l = 1.0f;
                jqVar.f36141o = null;
                jqVar.f36142p = null;
                jqVar.f36143q = null;
                View view = jqVar.H;
                if (view != null) {
                    if (jqVar.h == 0 && jqVar.G) {
                        view.setVisibility(8);
                    }
                    jqVar.H.invalidate();
                }
                jqVar.f36131c = -1;
                return;
            case 21:
                rt rtVar = (rt) this.f41591b;
                rtVar.P = false;
                rtVar.d.setTranslationY(0.0f);
                rtVar.d.setAlpha(0.0f);
                rtVar.c(0.0f);
                rtVar.S = 0.0f;
                rtVar.j();
                return;
            case 22:
                ((yt) this.f41591b).f42155a.J1 = false;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((pu) this.f41591b).d = null;
                return;
            case 24:
                ((ly) this.f41591b).f36929a0 = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((ux) this.f41591b).f40184n = null;
                return;
            case 26:
                ((gz) this.f41591b).a();
                return;
            case 27:
                iz izVar = (iz) this.f41591b;
                izVar.V = izVar.f35774d0;
                izVar.f35773c0 = izVar.f35779g0;
                izVar.W = izVar.f35776e0;
                izVar.f35769a0 = izVar.f35778f0;
                izVar.f35774d0 = -1;
                izVar.f35776e0 = -1;
                izVar.f35778f0 = -1;
                izVar.f35779g0 = -1;
                return;
            case 28:
                vz vzVar = (vz) this.f41591b;
                vzVar.f41205w = 1.0f;
                vzVar.invalidate();
                return;
            default:
                q40 q40Var = (q40) this.f41591b;
                if (animator == q40Var.f38487b0) {
                    q40Var.d(true);
                    q40Var.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
