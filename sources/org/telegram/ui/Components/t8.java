package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class t8 extends AnimatorListenerAdapter {
    public final int f31156a;
    public final Object f31157b;

    public t8(Object obj, int i10) {
        this.f31156a = i10;
        this.f31157b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31156a) {
            case 9:
                ((nm) this.f31157b).f29191a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31156a) {
            case 0:
                g9 g9Var = ((u8) this.f31157b).f31476b;
                g9Var.f26693f = false;
                g9Var.f26692e.setVisibility(8);
                return;
            case 1:
                l9 l9Var = (l9) this.f31157b;
                if (l9Var.f28292f != null) {
                    l9Var.f28291e = 1.0f;
                    l9Var.n();
                    if (l9Var.f28293g) {
                        l9Var.f28293g = false;
                        Runnable runnable = l9Var.f28295j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    l9Var.f();
                }
                l9Var.f28292f = null;
                return;
            case 2:
                ((uf) this.f31157b).f31572f.f23886b0.setVisibility(8);
                return;
            case 3:
                ((xg) this.f31157b).f32962d0 = 1.0f;
                return;
            case 4:
                ((yi) ((fi) this.f31157b).d).f33328s.setVisibility(8);
                return;
            case 5:
                ((hi) this.f31157b).d.v.setVisibility(8);
                return;
            case 6:
                yi yiVar = (yi) this.f31157b;
                yiVar.f33279c1 = null;
                if (!yiVar.f33333t1) {
                    if (yiVar.f33272a1.getTag() == null && yiVar.T0 == 0 && !yiVar.W0) {
                        yiVar.f33282d1.setVisibility(4);
                    }
                    yiVar.l1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var = yiVar.f33296h1;
                if (u0Var != null) {
                    u0Var.setVisibility(4);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                sk skVar = (sk) this.f31157b;
                skVar.f30891s.setVisibility(8);
                skVar.f30889n = 0;
                hk hkVar = skVar.f30890r;
                hkVar.setAlpha(1.0f);
                hkVar.setScaleX(1.0f);
                hkVar.setScaleY(1.0f);
                hkVar.setTranslationX(0.0f);
                hkVar.invalidate();
                return;
            case 8:
                rk rkVar = (rk) this.f31157b;
                if (rkVar.X.H.getTag() == null) {
                    rkVar.X.H.setVisibility(4);
                }
                rkVar.X.I = null;
                return;
            case 9:
                nm nmVar = (nm) this.f31157b;
                if (animator.equals(nmVar.f29191a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = nmVar.f29191a;
                    chatAttachAlertPhotoLayout.f24058c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 10:
                gn gnVar = (gn) this.f31157b;
                hn hnVar = gnVar.P;
                hnVar.J = null;
                hnVar.K = false;
                gnVar.invalidate();
                return;
            case 11:
                cq cqVar = (cq) this.f31157b;
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
                CheckBox checkBox = (CheckBox) this.f31157b;
                if (animator.equals(checkBox.f24107s)) {
                    checkBox.f24107s = null;
                }
                if (!checkBox.f24109x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f31157b;
                if (animator.equals(checkBoxBase.f24124p)) {
                    checkBoxBase.f24124p = null;
                }
                if (!checkBoxBase.f24125q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 14:
                cr crVar = (cr) this.f31157b;
                if (crVar.K == crVar.L) {
                    crVar.G.setVisibility(4);
                }
                crVar.f25463y = null;
                return;
            case 15:
                lr lrVar = (lr) this.f31157b;
                lrVar.f28591l = 1.0f;
                lrVar.f28594o = null;
                lrVar.f28595p = null;
                lrVar.f28596q = null;
                View view = lrVar.H;
                if (view != null) {
                    if (lrVar.h == 0 && lrVar.G) {
                        view.setVisibility(8);
                    }
                    lrVar.H.invalidate();
                }
                lrVar.f28584c = -1;
                return;
            case 16:
                av avVar = (av) this.f31157b;
                avVar.O = false;
                avVar.d.setTranslationY(0.0f);
                avVar.d.setAlpha(0.0f);
                avVar.c(0.0f);
                avVar.R = 0.0f;
                avVar.j();
                return;
            case 17:
                ((iv) this.f31157b).f27518a.O = false;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((aw) this.f31157b).d = null;
                return;
            case 19:
                ((b00) this.f31157b).W = null;
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((jz) this.f31157b).f27884n = null;
                return;
            case 21:
                ((z00) this.f31157b).a();
                return;
            case 22:
                b10 b10Var = (b10) this.f31157b;
                b10Var.U = b10Var.f24817c0;
                b10Var.f24815b0 = b10Var.f24822f0;
                b10Var.V = b10Var.f24818d0;
                b10Var.W = b10Var.f24820e0;
                b10Var.f24817c0 = -1;
                b10Var.f24818d0 = -1;
                b10Var.f24820e0 = -1;
                b10Var.f24822f0 = -1;
                return;
            case 23:
                p10 p10Var = (p10) this.f31157b;
                p10Var.f29684s = 1.0f;
                p10Var.invalidate();
                return;
            case 24:
                s60 s60Var = (s60) this.f31157b;
                if (animator == s60Var.W) {
                    s60Var.c(true);
                    s60Var.setVisibility(4);
                    return;
                }
                return;
            case 25:
                p80 p80Var = (p80) this.f31157b;
                n80 n80Var = p80Var.f29783x;
                if (n80Var != null) {
                    n80Var.setProgress(1.0f);
                    p80Var.f29783x.invalidate();
                }
                p80Var.m0 = null;
                return;
            case 26:
                c10 c10Var = (c10) this.f31157b;
                ((y80) c10Var.f25167e).E = false;
                TextView[] textViewArr = (TextView[]) c10Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 27:
                m90 m90Var = (m90) this.f31157b;
                if (!m90Var.f28804f) {
                    m90Var.f28802c.setVisibility(8);
                    return;
                }
                return;
            case 28:
                t90 t90Var = (t90) this.f31157b;
                FrameLayout frameLayout = t90Var.f31181b;
                ci.r6 r6Var = (ci.r6) t90Var.f31182c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.da) t90Var.d);
                return;
            default:
                pc0 pc0Var = (pc0) this.f31157b;
                pc0Var.f29848c0.h = null;
                pc0Var.e(pc0Var.S, pc0Var.R);
                return;
        }
    }
}
