package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class r8 extends AnimatorListenerAdapter {
    public final int f30290a;
    public final Object f30291b;

    public r8(Object obj, int i10) {
        this.f30290a = i10;
        this.f30291b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30290a) {
            case 9:
                ((zl) this.f30291b).f33511a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30290a) {
            case 0:
                e9 e9Var = ((s8) this.f30291b).f30646b;
                e9Var.f26008f = false;
                e9Var.f26007e.setVisibility(8);
                return;
            case 1:
                j9 j9Var = (j9) this.f30291b;
                if (j9Var.f27664f != null) {
                    j9Var.f27663e = 1.0f;
                    j9Var.n();
                    if (j9Var.f27665g) {
                        j9Var.f27665g = false;
                        Runnable runnable = j9Var.f27667j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    j9Var.f();
                }
                j9Var.f27664f = null;
                return;
            case 2:
                ((tf) this.f30291b).f31031f.f23854b0.setVisibility(8);
                return;
            case 3:
                ((wg) this.f30291b).f32537d0 = 1.0f;
                return;
            case 4:
                ((ai) this.f30291b).f24534c.f32851s.setVisibility(8);
                return;
            case 5:
                ((di) this.f30291b).d.v.setVisibility(8);
                return;
            case 6:
                xi xiVar = (xi) this.f30291b;
                xiVar.Z0 = null;
                if (!xiVar.f32845q1) {
                    if (xiVar.X0.getTag() == null && xiVar.Q0 == 0 && !xiVar.T0) {
                        xiVar.f32795a1.setVisibility(4);
                    }
                    xiVar.f32822i1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.v0 v0Var = xiVar.f32809e1;
                if (v0Var != null) {
                    v0Var.setVisibility(4);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                rk rkVar = (rk) this.f30291b;
                rkVar.f30433s.setVisibility(8);
                rkVar.f30431n = 0;
                gk gkVar = rkVar.f30432r;
                gkVar.setAlpha(1.0f);
                gkVar.setScaleX(1.0f);
                gkVar.setScaleY(1.0f);
                gkVar.setTranslationX(0.0f);
                gkVar.invalidate();
                return;
            case 8:
                qk qkVar = (qk) this.f30291b;
                if (qkVar.X.H.getTag() == null) {
                    qkVar.X.H.setVisibility(4);
                }
                qkVar.X.I = null;
                return;
            case 9:
                zl zlVar = (zl) this.f30291b;
                if (animator.equals(zlVar.f33511a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = zlVar.f33511a;
                    chatAttachAlertPhotoLayout.f24026c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 10:
                sm smVar = (sm) this.f30291b;
                tm tmVar = smVar.P;
                tmVar.J = null;
                tmVar.K = false;
                smVar.invalidate();
                return;
            case 11:
                pp ppVar = (pp) this.f30291b;
                ci.sb sbVar = ppVar.R;
                if (sbVar != null) {
                    if (sbVar.getParent() != null) {
                        ((ViewGroup) ppVar.R.getParent()).removeView(ppVar.R);
                    }
                    ppVar.R = null;
                }
                ppVar.T = null;
                super.onAnimationEnd(animator);
                return;
            case 12:
                CheckBox checkBox = (CheckBox) this.f30291b;
                if (animator.equals(checkBox.f24075s)) {
                    checkBox.f24075s = null;
                }
                if (!checkBox.f24077x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f30291b;
                if (animator.equals(checkBoxBase.f24092p)) {
                    checkBoxBase.f24092p = null;
                }
                if (!checkBoxBase.f24093q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 14:
                pq pqVar = (pq) this.f30291b;
                if (pqVar.K == pqVar.L) {
                    pqVar.G.setVisibility(4);
                }
                pqVar.f29722y = null;
                return;
            case 15:
                yq yqVar = (yq) this.f30291b;
                yqVar.f33219l = 1.0f;
                yqVar.f33222o = null;
                yqVar.f33223p = null;
                yqVar.f33224q = null;
                View view = yqVar.H;
                if (view != null) {
                    if (yqVar.h == 0 && yqVar.G) {
                        view.setVisibility(8);
                    }
                    yqVar.H.invalidate();
                }
                yqVar.f33212c = -1;
                return;
            case 16:
                mu muVar = (mu) this.f30291b;
                muVar.O = false;
                muVar.d.setTranslationY(0.0f);
                muVar.d.setAlpha(0.0f);
                muVar.c(0.0f);
                muVar.R = 0.0f;
                muVar.j();
                return;
            case 17:
                ((vu) this.f30291b).f32353a.O = false;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((nv) this.f30291b).d = null;
                return;
            case 19:
                ((nz) this.f30291b).W = null;
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((wy) this.f30291b).f32670n = null;
                return;
            case 21:
                ((l00) this.f30291b).a();
                return;
            case 22:
                n00 n00Var = (n00) this.f30291b;
                n00Var.U = n00Var.f28768c0;
                n00Var.f28766b0 = n00Var.f28773f0;
                n00Var.V = n00Var.f28769d0;
                n00Var.W = n00Var.f28771e0;
                n00Var.f28768c0 = -1;
                n00Var.f28769d0 = -1;
                n00Var.f28771e0 = -1;
                n00Var.f28773f0 = -1;
                return;
            case 23:
                b10 b10Var = (b10) this.f30291b;
                b10Var.f24750s = 1.0f;
                b10Var.invalidate();
                return;
            case 24:
                e60 e60Var = (e60) this.f30291b;
                if (animator == e60Var.W) {
                    e60Var.c(true);
                    e60Var.setVisibility(4);
                    return;
                }
                return;
            case 25:
                b80 b80Var = (b80) this.f30291b;
                z70 z70Var = b80Var.f24848x;
                if (z70Var != null) {
                    z70Var.setProgress(1.0f);
                    b80Var.f24848x.invalidate();
                }
                b80Var.m0 = null;
                return;
            case 26:
                o00 o00Var = (o00) this.f30291b;
                ((k80) o00Var.f29176e).E = false;
                TextView[] textViewArr = (TextView[]) o00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 27:
                y80 y80Var = (y80) this.f30291b;
                if (!y80Var.f33107f) {
                    y80Var.f33105c.setVisibility(8);
                    return;
                }
                return;
            case 28:
                f90 f90Var = (f90) this.f30291b;
                FrameLayout frameLayout = f90Var.f26388b;
                ci.r6 r6Var = (ci.r6) f90Var.f26389c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.fa) f90Var.d);
                return;
            default:
                cc0 cc0Var = (cc0) this.f30291b;
                cc0Var.f25320c0.h = null;
                cc0Var.e(cc0Var.S, cc0Var.R);
                return;
        }
    }
}
