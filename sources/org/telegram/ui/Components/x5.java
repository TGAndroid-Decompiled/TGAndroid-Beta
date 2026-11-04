package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
public final class x5 extends AnimatorListenerAdapter {
    public final int f40235a;
    public final Object f40236b;

    public x5(Object obj, int i3) {
        this.f40235a = i3;
        this.f40236b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40235a) {
            case 13:
                ((kl) this.f40236b).f35433a.P = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40235a) {
            case 0:
                y5 y5Var = (y5) this.f40236b;
                y5Var.d = null;
                y5Var.f40618b.clear();
                return;
            case 1:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f40236b;
                animatedPhoneNumberEditText.N1 = null;
                animatedPhoneNumberEditText.L1.clear();
                return;
            case 2:
                super.onAnimationEnd(animator);
                g6 g6Var = (g6) this.f40236b;
                g6Var.b();
                g6Var.f33995o = null;
                g6Var.f33990j = 0.0f;
                g6Var.f33993m = 0.0f;
                g6Var.f33992l = 0.0f;
                g6Var.f33991k = 0.0f;
                g6Var.f33998r = 0.0f;
                g6Var.f33997q = 0.0f;
                g6Var.invalidateSelf();
                Runnable runnable = g6Var.f33984b0;
                if (runnable != null) {
                    runnable.run();
                }
                g6Var.f34000t = null;
                CharSequence charSequence = g6Var.f34001u;
                if (charSequence != null) {
                    g6Var.t(charSequence, true, g6Var.v);
                    g6Var.f34001u = null;
                    g6Var.v = false;
                    return;
                }
                vf vfVar = g6Var.I;
                if (vfVar != null) {
                    vfVar.run();
                    return;
                }
                return;
            case 3:
                k9 k9Var = (k9) this.f40236b;
                k9Var.setVisibility(8);
                k9Var.setImageDrawable(null);
                k9Var.setAlpha(1.0f);
                return;
            case 4:
                r8 r8Var = (r8) ((org.telegram.messenger.b9) this.f40236b).k1;
                r8Var.f37674f = false;
                r8Var.f37673e.setVisibility(8);
                return;
            case 5:
                w8 w8Var = (w8) this.f40236b;
                if (w8Var.f39951f != null) {
                    w8Var.f39950e = 1.0f;
                    w8Var.k();
                    if (w8Var.f39952g) {
                        w8Var.f39952g = false;
                        Runnable runnable2 = w8Var.f39954j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    w8Var.d();
                }
                w8Var.f39951f = null;
                return;
            case 6:
                ((xe) this.f40236b).f40327f.f31098c0.setVisibility(8);
                return;
            case 7:
                ((bg) this.f40236b).f32187e0 = 1.0f;
                return;
            case 8:
                ((bi) ((eh) this.f40236b).d).f32266r1.setVisibility(8);
                return;
            case 9:
                ((hh) this.f40236b).d.f32270s1.setVisibility(8);
                return;
            case 10:
                bi biVar = (bi) this.f40236b;
                biVar.U2 = null;
                if (!biVar.f32246l3) {
                    if (biVar.S2.getTag() == null && biVar.L2 == 0 && !biVar.O2) {
                        biVar.V2.setVisibility(4);
                    }
                    biVar.f32221d3.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.q0 q0Var = biVar.Z2;
                if (q0Var != null) {
                    q0Var.setVisibility(4);
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                uj ujVar = (uj) this.f40236b;
                ujVar.f38771s.setVisibility(8);
                ujVar.f38769n = 0;
                jj jjVar = ujVar.f38770r;
                jjVar.setAlpha(1.0f);
                jjVar.setScaleX(1.0f);
                jjVar.setScaleY(1.0f);
                jjVar.setTranslationX(0.0f);
                jjVar.invalidate();
                return;
            case 12:
                tj tjVar = (tj) this.f40236b;
                if (tjVar.Y.I.getTag() == null) {
                    tjVar.Y.I.setVisibility(4);
                }
                tjVar.Y.J = null;
                return;
            case 13:
                kl klVar = (kl) this.f40236b;
                if (animator.equals(klVar.f35433a.P)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = klVar.f35433a;
                    chatAttachAlertPhotoLayout.f31269d0 = true;
                    chatAttachAlertPhotoLayout.P = null;
                    return;
                }
                return;
            case 14:
                zl zlVar = (zl) this.f40236b;
                am amVar = zlVar.Q;
                amVar.K = null;
                amVar.L = false;
                zlVar.invalidate();
                return;
            case 15:
                xl xlVar = (xl) this.f40236b;
                xlVar.f40390b.R = true;
                xlVar.O.f40783z.invalidate();
                return;
            case 16:
                vo voVar = (vo) this.f40236b;
                wz0 wz0Var = voVar.I1;
                if (wz0Var != null) {
                    if (wz0Var.getParent() != null) {
                        ((ViewGroup) voVar.I1.getParent()).removeView(voVar.I1);
                    }
                    voVar.I1 = null;
                }
                voVar.K1 = null;
                super.onAnimationEnd(animator);
                return;
            case 17:
                wz0 wz0Var2 = (wz0) this.f40236b;
                wz0Var2.f40176c = null;
                wz0Var2.f40174a.setShader(null);
                wz0Var2.f40179n = null;
                wz0Var2.f40180r = null;
                wz0Var2.setImageDrawable(null);
                org.telegram.messenger.g0.E2(wz0Var2);
                return;
            case 18:
                CheckBox checkBox = (CheckBox) this.f40236b;
                if (animator.equals(checkBox.f31316s)) {
                    checkBox.f31316s = null;
                }
                if (!checkBox.f31319y) {
                    checkBox.H = null;
                    return;
                }
                return;
            case 19:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f40236b;
                if (animator.equals(checkBoxBase.f31333p)) {
                    checkBoxBase.f31333p = null;
                }
                if (!checkBoxBase.f31334q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 20:
                cq cqVar = (cq) this.f40236b;
                cqVar.f32805l = 1.0f;
                cqVar.f32808o = null;
                cqVar.f32809p = null;
                cqVar.f32810q = null;
                View view = cqVar.H;
                if (view != null) {
                    if (cqVar.h == 0 && cqVar.G) {
                        view.setVisibility(8);
                    }
                    cqVar.H.invalidate();
                }
                cqVar.f32798c = -1;
                return;
            case 21:
                jt jtVar = (jt) this.f40236b;
                jtVar.P = false;
                jtVar.d.setTranslationY(0.0f);
                jtVar.d.setAlpha(0.0f);
                jtVar.c(0.0f);
                jtVar.S = 0.0f;
                jtVar.j();
                return;
            case 22:
                ((qt) this.f40236b).f37524a.G1 = false;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((iu) this.f40236b).d = null;
                return;
            case 24:
                ((ey) this.f40236b).f33518a0 = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((nx) this.f40236b).f36641n = null;
                return;
            case 26:
                ((zy) this.f40236b).a();
                return;
            case 27:
                bz bzVar = (bz) this.f40236b;
                bzVar.V = bzVar.f32448d0;
                bzVar.f32447c0 = bzVar.f32453g0;
                bzVar.W = bzVar.f32450e0;
                bzVar.f32443a0 = bzVar.f32452f0;
                bzVar.f32448d0 = -1;
                bzVar.f32450e0 = -1;
                bzVar.f32452f0 = -1;
                bzVar.f32453g0 = -1;
                return;
            case 28:
                nz nzVar = (nz) this.f40236b;
                nzVar.f36660w = 1.0f;
                nzVar.invalidate();
                return;
            default:
                j40 j40Var = (j40) this.f40236b;
                if (animator == j40Var.f34928a0) {
                    j40Var.c(true);
                    j40Var.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
