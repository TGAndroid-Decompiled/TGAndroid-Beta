package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class t8 extends AnimatorListenerAdapter {
    public final int f31050a;
    public final Object f31051b;

    public t8(Object obj, int i10) {
        this.f31050a = i10;
        this.f31051b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31050a) {
            case 9:
                ((nm) this.f31051b).f29091a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31050a) {
            case 0:
                g9 g9Var = ((u8) this.f31051b).f31332b;
                g9Var.f26639f = false;
                g9Var.f26638e.setVisibility(8);
                return;
            case 1:
                l9 l9Var = (l9) this.f31051b;
                if (l9Var.f28242f != null) {
                    l9Var.f28241e = 1.0f;
                    l9Var.n();
                    if (l9Var.f28243g) {
                        l9Var.f28243g = false;
                        Runnable runnable = l9Var.f28245j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    l9Var.f();
                }
                l9Var.f28242f = null;
                return;
            case 2:
                ((uf) this.f31051b).f31422f.f23850b0.setVisibility(8);
                return;
            case 3:
                ((xg) this.f31051b).f32900d0 = 1.0f;
                return;
            case 4:
                ((yi) ((fi) this.f31051b).d).f33255s.setVisibility(8);
                return;
            case 5:
                ((hi) this.f31051b).d.v.setVisibility(8);
                return;
            case 6:
                yi yiVar = (yi) this.f31051b;
                yiVar.f33206c1 = null;
                if (!yiVar.f33260t1) {
                    if (yiVar.f33199a1.getTag() == null && yiVar.T0 == 0 && !yiVar.W0) {
                        yiVar.f33209d1.setVisibility(4);
                    }
                    yiVar.l1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var = yiVar.f33223h1;
                if (u0Var != null) {
                    u0Var.setVisibility(4);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                sk skVar = (sk) this.f31051b;
                skVar.f30770s.setVisibility(8);
                skVar.f30768n = 0;
                hk hkVar = skVar.f30769r;
                hkVar.setAlpha(1.0f);
                hkVar.setScaleX(1.0f);
                hkVar.setScaleY(1.0f);
                hkVar.setTranslationX(0.0f);
                hkVar.invalidate();
                return;
            case 8:
                rk rkVar = (rk) this.f31051b;
                if (rkVar.X.H.getTag() == null) {
                    rkVar.X.H.setVisibility(4);
                }
                rkVar.X.I = null;
                return;
            case 9:
                nm nmVar = (nm) this.f31051b;
                if (animator.equals(nmVar.f29091a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = nmVar.f29091a;
                    chatAttachAlertPhotoLayout.f24022c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 10:
                gn gnVar = (gn) this.f31051b;
                hn hnVar = gnVar.P;
                hnVar.J = null;
                hnVar.K = false;
                gnVar.invalidate();
                return;
            case 11:
                cq cqVar = (cq) this.f31051b;
                ci.tb tbVar = cqVar.R;
                if (tbVar != null) {
                    if (tbVar.getParent() != null) {
                        ((ViewGroup) cqVar.R.getParent()).removeView(cqVar.R);
                    }
                    cqVar.R = null;
                }
                cqVar.T = null;
                super.onAnimationEnd(animator);
                return;
            case 12:
                CheckBox checkBox = (CheckBox) this.f31051b;
                if (animator.equals(checkBox.f24071s)) {
                    checkBox.f24071s = null;
                }
                if (!checkBox.f24073x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f31051b;
                if (animator.equals(checkBoxBase.f24088p)) {
                    checkBoxBase.f24088p = null;
                }
                if (!checkBoxBase.f24089q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 14:
                cr crVar = (cr) this.f31051b;
                if (crVar.K == crVar.L) {
                    crVar.G.setVisibility(4);
                }
                crVar.f25305y = null;
                return;
            case 15:
                lr lrVar = (lr) this.f31051b;
                lrVar.f28429l = 1.0f;
                lrVar.f28432o = null;
                lrVar.f28433p = null;
                lrVar.f28434q = null;
                View view = lrVar.H;
                if (view != null) {
                    if (lrVar.h == 0 && lrVar.G) {
                        view.setVisibility(8);
                    }
                    lrVar.H.invalidate();
                }
                lrVar.f28422c = -1;
                return;
            case 16:
                av avVar = (av) this.f31051b;
                avVar.O = false;
                avVar.d.setTranslationY(0.0f);
                avVar.d.setAlpha(0.0f);
                avVar.c(0.0f);
                avVar.R = 0.0f;
                avVar.j();
                return;
            case 17:
                ((iv) this.f31051b).f27469a.O = false;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((aw) this.f31051b).d = null;
                return;
            case 19:
                ((b00) this.f31051b).W = null;
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((jz) this.f31051b).f27780n = null;
                return;
            case 21:
                ((z00) this.f31051b).a();
                return;
            case 22:
                b10 b10Var = (b10) this.f31051b;
                b10Var.U = b10Var.f24749c0;
                b10Var.f24747b0 = b10Var.f24754f0;
                b10Var.V = b10Var.f24750d0;
                b10Var.W = b10Var.f24752e0;
                b10Var.f24749c0 = -1;
                b10Var.f24750d0 = -1;
                b10Var.f24752e0 = -1;
                b10Var.f24754f0 = -1;
                return;
            case 23:
                p10 p10Var = (p10) this.f31051b;
                p10Var.f29578s = 1.0f;
                p10Var.invalidate();
                return;
            case 24:
                t60 t60Var = (t60) this.f31051b;
                if (animator == t60Var.W) {
                    t60Var.c(true);
                    t60Var.setVisibility(4);
                    return;
                }
                return;
            case 25:
                q80 q80Var = (q80) this.f31051b;
                o80 o80Var = q80Var.f30087x;
                if (o80Var != null) {
                    o80Var.setProgress(1.0f);
                    q80Var.f30087x.invalidate();
                }
                q80Var.m0 = null;
                return;
            case 26:
                c10 c10Var = (c10) this.f31051b;
                ((z80) c10Var.f25060e).E = false;
                TextView[] textViewArr = (TextView[]) c10Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 27:
                n90 n90Var = (n90) this.f31051b;
                if (!n90Var.f29011f) {
                    n90Var.f29009c.setVisibility(8);
                    return;
                }
                return;
            case 28:
                u90 u90Var = (u90) this.f31051b;
                FrameLayout frameLayout = u90Var.f31355b;
                ci.r6 r6Var = (ci.r6) u90Var.f31356c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.da) u90Var.d);
                return;
            default:
                qc0 qc0Var = (qc0) this.f31051b;
                qc0Var.f30132c0.h = null;
                qc0Var.e(qc0Var.S, qc0Var.R);
                return;
        }
    }
}
