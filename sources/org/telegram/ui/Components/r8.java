package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class r8 extends AnimatorListenerAdapter {
    public final int f27579a;
    public final Object f27580b;

    public r8(Object obj, int i10) {
        this.f27579a = i10;
        this.f27580b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27579a) {
            case 9:
                ((xl) this.f27580b).f30005a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27579a) {
            case 0:
                e9 e9Var = ((s8) this.f27580b).f27871b;
                e9Var.f23612f = false;
                e9Var.e.setVisibility(8);
                return;
            case 1:
                j9 j9Var = (j9) this.f27580b;
                if (j9Var.f25202f != null) {
                    j9Var.e = 1.0f;
                    j9Var.n();
                    if (j9Var.f25203g) {
                        j9Var.f25203g = false;
                        Runnable runnable = j9Var.f25205j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    j9Var.f();
                }
                j9Var.f25202f = null;
                return;
            case 2:
                ((rf) this.f27580b).f27615f.f21709b0.setVisibility(8);
                return;
            case 3:
                ((ug) this.f27580b).f28487d0 = 1.0f;
                return;
            case 4:
                ((di) this.f27580b).f23408c.f29704s.setVisibility(8);
                return;
            case 5:
                ((fi) this.f27580b).d.v.setVisibility(8);
                return;
            case 6:
                wi wiVar = (wi) this.f27580b;
                wiVar.Z0 = null;
                if (!wiVar.f29698q1) {
                    if (wiVar.X0.getTag() == null && wiVar.Q0 == 0 && !wiVar.T0) {
                        wiVar.f29649a1.setVisibility(4);
                    }
                    wiVar.f29675i1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.v0 v0Var = wiVar.f29662e1;
                if (v0Var != null) {
                    v0Var.setVisibility(4);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                pk pkVar = (pk) this.f27580b;
                pkVar.f27069s.setVisibility(8);
                pkVar.f27067n = 0;
                ek ekVar = pkVar.f27068r;
                ekVar.setAlpha(1.0f);
                ekVar.setScaleX(1.0f);
                ekVar.setScaleY(1.0f);
                ekVar.setTranslationX(0.0f);
                ekVar.invalidate();
                return;
            case 8:
                ok okVar = (ok) this.f27580b;
                if (okVar.X.H.getTag() == null) {
                    okVar.X.H.setVisibility(4);
                }
                okVar.X.I = null;
                return;
            case 9:
                xl xlVar = (xl) this.f27580b;
                if (animator.equals(xlVar.f30005a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xlVar.f30005a;
                    chatAttachAlertPhotoLayout.f21878c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 10:
                qm qmVar = (qm) this.f27580b;
                rm rmVar = qmVar.P;
                rmVar.J = null;
                rmVar.K = false;
                qmVar.invalidate();
                return;
            case 11:
                np npVar = (np) this.f27580b;
                ci.tb tbVar = npVar.R;
                if (tbVar != null) {
                    if (tbVar.getParent() != null) {
                        ((ViewGroup) npVar.R.getParent()).removeView(npVar.R);
                    }
                    npVar.R = null;
                }
                npVar.T = null;
                super.onAnimationEnd(animator);
                return;
            case 12:
                CheckBox checkBox = (CheckBox) this.f27580b;
                if (animator.equals(checkBox.f21926s)) {
                    checkBox.f21926s = null;
                }
                if (!checkBox.f21928x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f27580b;
                if (animator.equals(checkBoxBase.f21942p)) {
                    checkBoxBase.f21942p = null;
                }
                if (!checkBoxBase.f21943q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 14:
                nq nqVar = (nq) this.f27580b;
                if (nqVar.K == nqVar.L) {
                    nqVar.G.setVisibility(4);
                }
                nqVar.f26491y = null;
                return;
            case 15:
                wq wqVar = (wq) this.f27580b;
                wqVar.f29780l = 1.0f;
                wqVar.f29783o = null;
                wqVar.f29784p = null;
                wqVar.f29785q = null;
                View view = wqVar.H;
                if (view != null) {
                    if (wqVar.h == 0 && wqVar.G) {
                        view.setVisibility(8);
                    }
                    wqVar.H.invalidate();
                }
                wqVar.f29774c = -1;
                return;
            case 16:
                ku kuVar = (ku) this.f27580b;
                kuVar.O = false;
                kuVar.d.setTranslationY(0.0f);
                kuVar.d.setAlpha(0.0f);
                kuVar.c(0.0f);
                kuVar.R = 0.0f;
                kuVar.j();
                return;
            case 17:
                ((su) this.f27580b).f27992a.O = false;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((kv) this.f27580b).d = null;
                return;
            case 19:
                ((lz) this.f27580b).W = null;
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((uy) this.f27580b).f28598n = null;
                return;
            case 21:
                ((j00) this.f27580b).a();
                return;
            case 22:
                l00 l00Var = (l00) this.f27580b;
                l00Var.U = l00Var.f25738c0;
                l00Var.f25736b0 = l00Var.f25742f0;
                l00Var.V = l00Var.f25739d0;
                l00Var.W = l00Var.f25740e0;
                l00Var.f25738c0 = -1;
                l00Var.f25739d0 = -1;
                l00Var.f25740e0 = -1;
                l00Var.f25742f0 = -1;
                return;
            case 23:
                z00 z00Var = (z00) this.f27580b;
                z00Var.f30495s = 1.0f;
                z00Var.invalidate();
                return;
            case 24:
                o70 o70Var = (o70) this.f27580b;
                m70 m70Var = o70Var.f26673x;
                if (m70Var != null) {
                    m70Var.setProgress(1.0f);
                    o70Var.f26673x.invalidate();
                }
                o70Var.m0 = null;
                return;
            case 25:
                m00 m00Var = (m00) this.f27580b;
                ((x70) m00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) m00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 26:
                l80 l80Var = (l80) this.f27580b;
                if (!l80Var.f25841f) {
                    l80Var.f25840c.setVisibility(8);
                    return;
                }
                return;
            case 27:
                s80 s80Var = (s80) this.f27580b;
                FrameLayout frameLayout = s80Var.f27873b;
                ci.r6 r6Var = (ci.r6) s80Var.f27874c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ga) s80Var.d);
                return;
            case 28:
                ob0 ob0Var = (ob0) this.f27580b;
                ob0Var.f26708c0.h = null;
                ob0Var.e(ob0Var.S, ob0Var.R);
                return;
            default:
                NumberTextView numberTextView = (NumberTextView) this.f27580b;
                numberTextView.d = null;
                numberTextView.f22042b.clear();
                return;
        }
    }
}
