package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class t8 extends AnimatorListenerAdapter {
    public final int f31044a;
    public final Object f31045b;

    public t8(Object obj, int i10) {
        this.f31044a = i10;
        this.f31045b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31044a) {
            case 9:
                ((nm) this.f31045b).f29149a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31044a) {
            case 0:
                g9 g9Var = ((u8) this.f31045b).f31419b;
                g9Var.f26646f = false;
                g9Var.f26645e.setVisibility(8);
                return;
            case 1:
                l9 l9Var = (l9) this.f31045b;
                if (l9Var.f28253f != null) {
                    l9Var.f28252e = 1.0f;
                    l9Var.n();
                    if (l9Var.f28254g) {
                        l9Var.f28254g = false;
                        Runnable runnable = l9Var.f28256j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    l9Var.f();
                }
                l9Var.f28253f = null;
                return;
            case 2:
                ((uf) this.f31045b).f31490f.f23862b0.setVisibility(8);
                return;
            case 3:
                ((xg) this.f31045b).f32924d0 = 1.0f;
                return;
            case 4:
                ((yi) ((fi) this.f31045b).d).f33274s.setVisibility(8);
                return;
            case 5:
                ((hi) this.f31045b).d.v.setVisibility(8);
                return;
            case 6:
                yi yiVar = (yi) this.f31045b;
                yiVar.f33225c1 = null;
                if (!yiVar.f33279t1) {
                    if (yiVar.f33218a1.getTag() == null && yiVar.T0 == 0 && !yiVar.W0) {
                        yiVar.f33228d1.setVisibility(4);
                    }
                    yiVar.l1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.v0 v0Var = yiVar.f33242h1;
                if (v0Var != null) {
                    v0Var.setVisibility(4);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                sk skVar = (sk) this.f31045b;
                skVar.f30811s.setVisibility(8);
                skVar.f30809n = 0;
                hk hkVar = skVar.f30810r;
                hkVar.setAlpha(1.0f);
                hkVar.setScaleX(1.0f);
                hkVar.setScaleY(1.0f);
                hkVar.setTranslationX(0.0f);
                hkVar.invalidate();
                return;
            case 8:
                rk rkVar = (rk) this.f31045b;
                if (rkVar.X.H.getTag() == null) {
                    rkVar.X.H.setVisibility(4);
                }
                rkVar.X.I = null;
                return;
            case 9:
                nm nmVar = (nm) this.f31045b;
                if (animator.equals(nmVar.f29149a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = nmVar.f29149a;
                    chatAttachAlertPhotoLayout.f24034c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 10:
                gn gnVar = (gn) this.f31045b;
                hn hnVar = gnVar.P;
                hnVar.J = null;
                hnVar.K = false;
                gnVar.invalidate();
                return;
            case 11:
                cq cqVar = (cq) this.f31045b;
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
                CheckBox checkBox = (CheckBox) this.f31045b;
                if (animator.equals(checkBox.f24083s)) {
                    checkBox.f24083s = null;
                }
                if (!checkBox.f24085x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f31045b;
                if (animator.equals(checkBoxBase.f24100p)) {
                    checkBoxBase.f24100p = null;
                }
                if (!checkBoxBase.f24101q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 14:
                cr crVar = (cr) this.f31045b;
                if (crVar.K == crVar.L) {
                    crVar.G.setVisibility(4);
                }
                crVar.f25401y = null;
                return;
            case 15:
                lr lrVar = (lr) this.f31045b;
                lrVar.f28515l = 1.0f;
                lrVar.f28518o = null;
                lrVar.f28519p = null;
                lrVar.f28520q = null;
                View view = lrVar.H;
                if (view != null) {
                    if (lrVar.h == 0 && lrVar.G) {
                        view.setVisibility(8);
                    }
                    lrVar.H.invalidate();
                }
                lrVar.f28508c = -1;
                return;
            case 16:
                av avVar = (av) this.f31045b;
                avVar.O = false;
                avVar.d.setTranslationY(0.0f);
                avVar.d.setAlpha(0.0f);
                avVar.c(0.0f);
                avVar.R = 0.0f;
                avVar.j();
                return;
            case 17:
                ((iv) this.f31045b).f27461a.O = false;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((aw) this.f31045b).d = null;
                return;
            case 19:
                ((b00) this.f31045b).W = null;
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((jz) this.f31045b).f27825n = null;
                return;
            case 21:
                ((z00) this.f31045b).a();
                return;
            case 22:
                b10 b10Var = (b10) this.f31045b;
                b10Var.U = b10Var.f24775c0;
                b10Var.f24773b0 = b10Var.f24780f0;
                b10Var.V = b10Var.f24776d0;
                b10Var.W = b10Var.f24778e0;
                b10Var.f24775c0 = -1;
                b10Var.f24776d0 = -1;
                b10Var.f24778e0 = -1;
                b10Var.f24780f0 = -1;
                return;
            case 23:
                p10 p10Var = (p10) this.f31045b;
                p10Var.f29652s = 1.0f;
                p10Var.invalidate();
                return;
            case 24:
                t60 t60Var = (t60) this.f31045b;
                if (animator == t60Var.W) {
                    t60Var.c(true);
                    t60Var.setVisibility(4);
                    return;
                }
                return;
            case 25:
                q80 q80Var = (q80) this.f31045b;
                o80 o80Var = q80Var.f30124x;
                if (o80Var != null) {
                    o80Var.setProgress(1.0f);
                    q80Var.f30124x.invalidate();
                }
                q80Var.m0 = null;
                return;
            case 26:
                c10 c10Var = (c10) this.f31045b;
                ((z80) c10Var.f25129e).E = false;
                TextView[] textViewArr = (TextView[]) c10Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 27:
                n90 n90Var = (n90) this.f31045b;
                if (!n90Var.f29077f) {
                    n90Var.f29075c.setVisibility(8);
                    return;
                }
                return;
            case 28:
                u90 u90Var = (u90) this.f31045b;
                FrameLayout frameLayout = u90Var.f31427b;
                ci.r6 r6Var = (ci.r6) u90Var.f31428c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.da) u90Var.d);
                return;
            default:
                qc0 qc0Var = (qc0) this.f31045b;
                qc0Var.f30183c0.h = null;
                qc0Var.e(qc0Var.S, qc0Var.R);
                return;
        }
    }
}
