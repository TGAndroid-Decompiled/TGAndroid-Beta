package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class r8 extends AnimatorListenerAdapter {
    public final int f30291a;
    public final Object f30292b;

    public r8(Object obj, int i10) {
        this.f30291a = i10;
        this.f30292b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30291a) {
            case 9:
                ((zl) this.f30292b).f33512a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30291a) {
            case 0:
                e9 e9Var = ((s8) this.f30292b).f30647b;
                e9Var.f26009f = false;
                e9Var.f26008e.setVisibility(8);
                return;
            case 1:
                j9 j9Var = (j9) this.f30292b;
                if (j9Var.f27665f != null) {
                    j9Var.f27664e = 1.0f;
                    j9Var.n();
                    if (j9Var.f27666g) {
                        j9Var.f27666g = false;
                        Runnable runnable = j9Var.f27668j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    j9Var.f();
                }
                j9Var.f27665f = null;
                return;
            case 2:
                ((tf) this.f30292b).f31032f.f23855b0.setVisibility(8);
                return;
            case 3:
                ((wg) this.f30292b).f32538d0 = 1.0f;
                return;
            case 4:
                ((ai) this.f30292b).f24535c.f32852s.setVisibility(8);
                return;
            case 5:
                ((di) this.f30292b).d.v.setVisibility(8);
                return;
            case 6:
                xi xiVar = (xi) this.f30292b;
                xiVar.Z0 = null;
                if (!xiVar.f32846q1) {
                    if (xiVar.X0.getTag() == null && xiVar.Q0 == 0 && !xiVar.T0) {
                        xiVar.f32796a1.setVisibility(4);
                    }
                    xiVar.f32823i1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.v0 v0Var = xiVar.f32810e1;
                if (v0Var != null) {
                    v0Var.setVisibility(4);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                rk rkVar = (rk) this.f30292b;
                rkVar.f30434s.setVisibility(8);
                rkVar.f30432n = 0;
                gk gkVar = rkVar.f30433r;
                gkVar.setAlpha(1.0f);
                gkVar.setScaleX(1.0f);
                gkVar.setScaleY(1.0f);
                gkVar.setTranslationX(0.0f);
                gkVar.invalidate();
                return;
            case 8:
                qk qkVar = (qk) this.f30292b;
                if (qkVar.X.H.getTag() == null) {
                    qkVar.X.H.setVisibility(4);
                }
                qkVar.X.I = null;
                return;
            case 9:
                zl zlVar = (zl) this.f30292b;
                if (animator.equals(zlVar.f33512a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = zlVar.f33512a;
                    chatAttachAlertPhotoLayout.f24027c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 10:
                sm smVar = (sm) this.f30292b;
                tm tmVar = smVar.P;
                tmVar.J = null;
                tmVar.K = false;
                smVar.invalidate();
                return;
            case 11:
                pp ppVar = (pp) this.f30292b;
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
                CheckBox checkBox = (CheckBox) this.f30292b;
                if (animator.equals(checkBox.f24076s)) {
                    checkBox.f24076s = null;
                }
                if (!checkBox.f24078x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f30292b;
                if (animator.equals(checkBoxBase.f24093p)) {
                    checkBoxBase.f24093p = null;
                }
                if (!checkBoxBase.f24094q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 14:
                pq pqVar = (pq) this.f30292b;
                if (pqVar.K == pqVar.L) {
                    pqVar.G.setVisibility(4);
                }
                pqVar.f29723y = null;
                return;
            case 15:
                yq yqVar = (yq) this.f30292b;
                yqVar.f33220l = 1.0f;
                yqVar.f33223o = null;
                yqVar.f33224p = null;
                yqVar.f33225q = null;
                View view = yqVar.H;
                if (view != null) {
                    if (yqVar.h == 0 && yqVar.G) {
                        view.setVisibility(8);
                    }
                    yqVar.H.invalidate();
                }
                yqVar.f33213c = -1;
                return;
            case 16:
                mu muVar = (mu) this.f30292b;
                muVar.O = false;
                muVar.d.setTranslationY(0.0f);
                muVar.d.setAlpha(0.0f);
                muVar.c(0.0f);
                muVar.R = 0.0f;
                muVar.j();
                return;
            case 17:
                ((vu) this.f30292b).f32354a.O = false;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((nv) this.f30292b).d = null;
                return;
            case 19:
                ((nz) this.f30292b).W = null;
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((wy) this.f30292b).f32671n = null;
                return;
            case 21:
                ((l00) this.f30292b).a();
                return;
            case 22:
                n00 n00Var = (n00) this.f30292b;
                n00Var.U = n00Var.f28769c0;
                n00Var.f28767b0 = n00Var.f28774f0;
                n00Var.V = n00Var.f28770d0;
                n00Var.W = n00Var.f28772e0;
                n00Var.f28769c0 = -1;
                n00Var.f28770d0 = -1;
                n00Var.f28772e0 = -1;
                n00Var.f28774f0 = -1;
                return;
            case 23:
                b10 b10Var = (b10) this.f30292b;
                b10Var.f24751s = 1.0f;
                b10Var.invalidate();
                return;
            case 24:
                e60 e60Var = (e60) this.f30292b;
                if (animator == e60Var.W) {
                    e60Var.c(true);
                    e60Var.setVisibility(4);
                    return;
                }
                return;
            case 25:
                b80 b80Var = (b80) this.f30292b;
                z70 z70Var = b80Var.f24849x;
                if (z70Var != null) {
                    z70Var.setProgress(1.0f);
                    b80Var.f24849x.invalidate();
                }
                b80Var.m0 = null;
                return;
            case 26:
                o00 o00Var = (o00) this.f30292b;
                ((k80) o00Var.f29177e).E = false;
                TextView[] textViewArr = (TextView[]) o00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 27:
                y80 y80Var = (y80) this.f30292b;
                if (!y80Var.f33108f) {
                    y80Var.f33106c.setVisibility(8);
                    return;
                }
                return;
            case 28:
                f90 f90Var = (f90) this.f30292b;
                FrameLayout frameLayout = f90Var.f26389b;
                ci.r6 r6Var = (ci.r6) f90Var.f26390c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.fa) f90Var.d);
                return;
            default:
                cc0 cc0Var = (cc0) this.f30292b;
                cc0Var.f25321c0.h = null;
                cc0Var.e(cc0Var.S, cc0Var.R);
                return;
        }
    }
}
