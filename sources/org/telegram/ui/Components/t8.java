package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class t8 extends AnimatorListenerAdapter {
    public final int f31085a;
    public final Object f31086b;

    public t8(Object obj, int i10) {
        this.f31085a = i10;
        this.f31086b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31085a) {
            case 9:
                ((nm) this.f31086b).f29209a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31085a) {
            case 0:
                g9 g9Var = ((u8) this.f31086b).f31394b;
                g9Var.f26629f = false;
                g9Var.f26628e.setVisibility(8);
                return;
            case 1:
                l9 l9Var = (l9) this.f31086b;
                if (l9Var.f28372f != null) {
                    l9Var.f28371e = 1.0f;
                    l9Var.n();
                    if (l9Var.f28373g) {
                        l9Var.f28373g = false;
                        Runnable runnable = l9Var.f28375j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    l9Var.f();
                }
                l9Var.f28372f = null;
                return;
            case 2:
                ((uf) this.f31086b).f31484f.f23858b0.setVisibility(8);
                return;
            case 3:
                ((xg) this.f31086b).f32834d0 = 1.0f;
                return;
            case 4:
                ((yi) ((fi) this.f31086b).d).f33267s.setVisibility(8);
                return;
            case 5:
                ((hi) this.f31086b).d.v.setVisibility(8);
                return;
            case 6:
                yi yiVar = (yi) this.f31086b;
                yiVar.f33218c1 = null;
                if (!yiVar.f33272t1) {
                    if (yiVar.f33211a1.getTag() == null && yiVar.T0 == 0 && !yiVar.W0) {
                        yiVar.f33221d1.setVisibility(4);
                    }
                    yiVar.l1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.v0 v0Var = yiVar.f33235h1;
                if (v0Var != null) {
                    v0Var.setVisibility(4);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                sk skVar = (sk) this.f31086b;
                skVar.f30838s.setVisibility(8);
                skVar.f30836n = 0;
                hk hkVar = skVar.f30837r;
                hkVar.setAlpha(1.0f);
                hkVar.setScaleX(1.0f);
                hkVar.setScaleY(1.0f);
                hkVar.setTranslationX(0.0f);
                hkVar.invalidate();
                return;
            case 8:
                rk rkVar = (rk) this.f31086b;
                if (rkVar.X.H.getTag() == null) {
                    rkVar.X.H.setVisibility(4);
                }
                rkVar.X.I = null;
                return;
            case 9:
                nm nmVar = (nm) this.f31086b;
                if (animator.equals(nmVar.f29209a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = nmVar.f29209a;
                    chatAttachAlertPhotoLayout.f24030c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 10:
                gn gnVar = (gn) this.f31086b;
                hn hnVar = gnVar.P;
                hnVar.J = null;
                hnVar.K = false;
                gnVar.invalidate();
                return;
            case 11:
                cq cqVar = (cq) this.f31086b;
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
                CheckBox checkBox = (CheckBox) this.f31086b;
                if (animator.equals(checkBox.f24079s)) {
                    checkBox.f24079s = null;
                }
                if (!checkBox.f24081x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f31086b;
                if (animator.equals(checkBoxBase.f24096p)) {
                    checkBoxBase.f24096p = null;
                }
                if (!checkBoxBase.f24097q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 14:
                cr crVar = (cr) this.f31086b;
                if (crVar.K == crVar.L) {
                    crVar.G.setVisibility(4);
                }
                crVar.f25498y = null;
                return;
            case 15:
                lr lrVar = (lr) this.f31086b;
                lrVar.f28559l = 1.0f;
                lrVar.f28562o = null;
                lrVar.f28563p = null;
                lrVar.f28564q = null;
                View view = lrVar.H;
                if (view != null) {
                    if (lrVar.h == 0 && lrVar.G) {
                        view.setVisibility(8);
                    }
                    lrVar.H.invalidate();
                }
                lrVar.f28552c = -1;
                return;
            case 16:
                zu zuVar = (zu) this.f31086b;
                zuVar.O = false;
                zuVar.d.setTranslationY(0.0f);
                zuVar.d.setAlpha(0.0f);
                zuVar.c(0.0f);
                zuVar.R = 0.0f;
                zuVar.j();
                return;
            case 17:
                ((hv) this.f31086b).f27144a.O = false;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((zv) this.f31086b).d = null;
                return;
            case 19:
                ((a00) this.f31086b).W = null;
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((iz) this.f31086b).f27522n = null;
                return;
            case 21:
                ((y00) this.f31086b).a();
                return;
            case 22:
                a10 a10Var = (a10) this.f31086b;
                a10Var.U = a10Var.f24503c0;
                a10Var.f24501b0 = a10Var.f24508f0;
                a10Var.V = a10Var.f24504d0;
                a10Var.W = a10Var.f24506e0;
                a10Var.f24503c0 = -1;
                a10Var.f24504d0 = -1;
                a10Var.f24506e0 = -1;
                a10Var.f24508f0 = -1;
                return;
            case 23:
                o10 o10Var = (o10) this.f31086b;
                o10Var.f29336s = 1.0f;
                o10Var.invalidate();
                return;
            case 24:
                s60 s60Var = (s60) this.f31086b;
                if (animator == s60Var.W) {
                    s60Var.c(true);
                    s60Var.setVisibility(4);
                    return;
                }
                return;
            case 25:
                p80 p80Var = (p80) this.f31086b;
                n80 n80Var = p80Var.f29793x;
                if (n80Var != null) {
                    n80Var.setProgress(1.0f);
                    p80Var.f29793x.invalidate();
                }
                p80Var.m0 = null;
                return;
            case 26:
                b10 b10Var = (b10) this.f31086b;
                ((y80) b10Var.f24844e).E = false;
                TextView[] textViewArr = (TextView[]) b10Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 27:
                m90 m90Var = (m90) this.f31086b;
                if (!m90Var.f28783f) {
                    m90Var.f28781c.setVisibility(8);
                    return;
                }
                return;
            case 28:
                t90 t90Var = (t90) this.f31086b;
                FrameLayout frameLayout = t90Var.f31095b;
                ci.r6 r6Var = (ci.r6) t90Var.f31096c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.da) t90Var.d);
                return;
            default:
                pc0 pc0Var = (pc0) this.f31086b;
                pc0Var.f29845c0.h = null;
                pc0Var.e(pc0Var.S, pc0Var.R);
                return;
        }
    }
}
