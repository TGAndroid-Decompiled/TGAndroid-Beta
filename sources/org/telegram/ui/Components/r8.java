package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class r8 extends AnimatorListenerAdapter {
    public final int f30373a;
    public final Object f30374b;

    public r8(Object obj, int i10) {
        this.f30373a = i10;
        this.f30374b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30373a) {
            case 9:
                ((zl) this.f30374b).f33526a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30373a) {
            case 0:
                e9 e9Var = ((s8) this.f30374b).f30720b;
                e9Var.f26076f = false;
                e9Var.f26075e.setVisibility(8);
                return;
            case 1:
                j9 j9Var = (j9) this.f30374b;
                if (j9Var.f27743f != null) {
                    j9Var.f27742e = 1.0f;
                    j9Var.n();
                    if (j9Var.f27744g) {
                        j9Var.f27744g = false;
                        Runnable runnable = j9Var.f27746j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    j9Var.f();
                }
                j9Var.f27743f = null;
                return;
            case 2:
                ((tf) this.f30374b).f31125f.f23862b0.setVisibility(8);
                return;
            case 3:
                ((wg) this.f30374b).f32626d0 = 1.0f;
                return;
            case 4:
                ((ai) this.f30374b).f24605c.f32949s.setVisibility(8);
                return;
            case 5:
                ((di) this.f30374b).d.v.setVisibility(8);
                return;
            case 6:
                xi xiVar = (xi) this.f30374b;
                xiVar.Z0 = null;
                if (!xiVar.f32943q1) {
                    if (xiVar.X0.getTag() == null && xiVar.Q0 == 0 && !xiVar.T0) {
                        xiVar.f32893a1.setVisibility(4);
                    }
                    xiVar.f32920i1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.v0 v0Var = xiVar.f32907e1;
                if (v0Var != null) {
                    v0Var.setVisibility(4);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                rk rkVar = (rk) this.f30374b;
                rkVar.f30522s.setVisibility(8);
                rkVar.f30520n = 0;
                gk gkVar = rkVar.f30521r;
                gkVar.setAlpha(1.0f);
                gkVar.setScaleX(1.0f);
                gkVar.setScaleY(1.0f);
                gkVar.setTranslationX(0.0f);
                gkVar.invalidate();
                return;
            case 8:
                qk qkVar = (qk) this.f30374b;
                if (qkVar.X.H.getTag() == null) {
                    qkVar.X.H.setVisibility(4);
                }
                qkVar.X.I = null;
                return;
            case 9:
                zl zlVar = (zl) this.f30374b;
                if (animator.equals(zlVar.f33526a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = zlVar.f33526a;
                    chatAttachAlertPhotoLayout.f24034c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 10:
                sm smVar = (sm) this.f30374b;
                tm tmVar = smVar.P;
                tmVar.J = null;
                tmVar.K = false;
                smVar.invalidate();
                return;
            case 11:
                pp ppVar = (pp) this.f30374b;
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
                CheckBox checkBox = (CheckBox) this.f30374b;
                if (animator.equals(checkBox.f24083s)) {
                    checkBox.f24083s = null;
                }
                if (!checkBox.f24085x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f30374b;
                if (animator.equals(checkBoxBase.f24100p)) {
                    checkBoxBase.f24100p = null;
                }
                if (!checkBoxBase.f24101q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 14:
                pq pqVar = (pq) this.f30374b;
                if (pqVar.K == pqVar.L) {
                    pqVar.G.setVisibility(4);
                }
                pqVar.f29824y = null;
                return;
            case 15:
                yq yqVar = (yq) this.f30374b;
                yqVar.f33320l = 1.0f;
                yqVar.f33323o = null;
                yqVar.f33324p = null;
                yqVar.f33325q = null;
                View view = yqVar.H;
                if (view != null) {
                    if (yqVar.h == 0 && yqVar.G) {
                        view.setVisibility(8);
                    }
                    yqVar.H.invalidate();
                }
                yqVar.f33313c = -1;
                return;
            case 16:
                mu muVar = (mu) this.f30374b;
                muVar.O = false;
                muVar.d.setTranslationY(0.0f);
                muVar.d.setAlpha(0.0f);
                muVar.c(0.0f);
                muVar.R = 0.0f;
                muVar.j();
                return;
            case 17:
                ((vu) this.f30374b).f32424a.O = false;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((nv) this.f30374b).d = null;
                return;
            case 19:
                ((nz) this.f30374b).W = null;
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((wy) this.f30374b).f32746n = null;
                return;
            case 21:
                ((l00) this.f30374b).a();
                return;
            case 22:
                n00 n00Var = (n00) this.f30374b;
                n00Var.U = n00Var.f28879c0;
                n00Var.f28877b0 = n00Var.f28884f0;
                n00Var.V = n00Var.f28880d0;
                n00Var.W = n00Var.f28882e0;
                n00Var.f28879c0 = -1;
                n00Var.f28880d0 = -1;
                n00Var.f28882e0 = -1;
                n00Var.f28884f0 = -1;
                return;
            case 23:
                b10 b10Var = (b10) this.f30374b;
                b10Var.f24800s = 1.0f;
                b10Var.invalidate();
                return;
            case 24:
                e60 e60Var = (e60) this.f30374b;
                if (animator == e60Var.W) {
                    e60Var.c(true);
                    e60Var.setVisibility(4);
                    return;
                }
                return;
            case 25:
                b80 b80Var = (b80) this.f30374b;
                z70 z70Var = b80Var.f24889x;
                if (z70Var != null) {
                    z70Var.setProgress(1.0f);
                    b80Var.f24889x.invalidate();
                }
                b80Var.m0 = null;
                return;
            case 26:
                o00 o00Var = (o00) this.f30374b;
                ((k80) o00Var.f29279e).E = false;
                TextView[] textViewArr = (TextView[]) o00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 27:
                y80 y80Var = (y80) this.f30374b;
                if (!y80Var.f33235f) {
                    y80Var.f33233c.setVisibility(8);
                    return;
                }
                return;
            case 28:
                f90 f90Var = (f90) this.f30374b;
                FrameLayout frameLayout = f90Var.f26430b;
                ci.r6 r6Var = (ci.r6) f90Var.f26431c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.fa) f90Var.d);
                return;
            default:
                cc0 cc0Var = (cc0) this.f30374b;
                cc0Var.f25374c0.h = null;
                cc0Var.e(cc0Var.S, cc0Var.R);
                return;
        }
    }
}
