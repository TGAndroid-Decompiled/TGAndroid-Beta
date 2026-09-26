package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class r8 extends AnimatorListenerAdapter {
    public final int f27901a;
    public final Object f27902b;

    public r8(Object obj, int i10) {
        this.f27901a = i10;
        this.f27902b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27901a) {
            case 9:
                ((xl) this.f27902b).f30355a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27901a) {
            case 0:
                e9 e9Var = ((s8) this.f27902b).f28200b;
                e9Var.f23883f = false;
                e9Var.e.setVisibility(8);
                return;
            case 1:
                j9 j9Var = (j9) this.f27902b;
                if (j9Var.f25341f != null) {
                    j9Var.e = 1.0f;
                    j9Var.n();
                    if (j9Var.f25342g) {
                        j9Var.f25342g = false;
                        Runnable runnable = j9Var.f25344j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    j9Var.f();
                }
                j9Var.f25341f = null;
                return;
            case 2:
                ((sf) this.f27902b).f28239f.f21960b0.setVisibility(8);
                return;
            case 3:
                ((vg) this.f27902b).f29140d0 = 1.0f;
                return;
            case 4:
                ((di) this.f27902b).f23622c.f30044s.setVisibility(8);
                return;
            case 5:
                ((fi) this.f27902b).d.v.setVisibility(8);
                return;
            case 6:
                wi wiVar = (wi) this.f27902b;
                wiVar.Z0 = null;
                if (!wiVar.f30038q1) {
                    if (wiVar.X0.getTag() == null && wiVar.Q0 == 0 && !wiVar.T0) {
                        wiVar.f29989a1.setVisibility(4);
                    }
                    wiVar.f30015i1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var = wiVar.f30002e1;
                if (u0Var != null) {
                    u0Var.setVisibility(4);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                pk pkVar = (pk) this.f27902b;
                pkVar.f27374s.setVisibility(8);
                pkVar.f27372n = 0;
                ek ekVar = pkVar.f27373r;
                ekVar.setAlpha(1.0f);
                ekVar.setScaleX(1.0f);
                ekVar.setScaleY(1.0f);
                ekVar.setTranslationX(0.0f);
                ekVar.invalidate();
                return;
            case 8:
                ok okVar = (ok) this.f27902b;
                if (okVar.X.H.getTag() == null) {
                    okVar.X.H.setVisibility(4);
                }
                okVar.X.I = null;
                return;
            case 9:
                xl xlVar = (xl) this.f27902b;
                if (animator.equals(xlVar.f30355a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xlVar.f30355a;
                    chatAttachAlertPhotoLayout.f22129c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 10:
                qm qmVar = (qm) this.f27902b;
                rm rmVar = qmVar.P;
                rmVar.J = null;
                rmVar.K = false;
                qmVar.invalidate();
                return;
            case 11:
                np npVar = (np) this.f27902b;
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
                CheckBox checkBox = (CheckBox) this.f27902b;
                if (animator.equals(checkBox.f22177s)) {
                    checkBox.f22177s = null;
                }
                if (!checkBox.f22179x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f27902b;
                if (animator.equals(checkBoxBase.f22193p)) {
                    checkBoxBase.f22193p = null;
                }
                if (!checkBoxBase.f22194q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 14:
                nq nqVar = (nq) this.f27902b;
                if (nqVar.K == nqVar.L) {
                    nqVar.G.setVisibility(4);
                }
                nqVar.f26785y = null;
                return;
            case 15:
                wq wqVar = (wq) this.f27902b;
                wqVar.f30156l = 1.0f;
                wqVar.f30159o = null;
                wqVar.f30160p = null;
                wqVar.f30161q = null;
                View view = wqVar.H;
                if (view != null) {
                    if (wqVar.h == 0 && wqVar.G) {
                        view.setVisibility(8);
                    }
                    wqVar.H.invalidate();
                }
                wqVar.f30150c = -1;
                return;
            case 16:
                ku kuVar = (ku) this.f27902b;
                kuVar.O = false;
                kuVar.d.setTranslationY(0.0f);
                kuVar.d.setAlpha(0.0f);
                kuVar.c(0.0f);
                kuVar.R = 0.0f;
                kuVar.j();
                return;
            case 17:
                ((su) this.f27902b).f28327a.O = false;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((kv) this.f27902b).d = null;
                return;
            case 19:
                ((lz) this.f27902b).W = null;
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((uy) this.f27902b).f28949n = null;
                return;
            case 21:
                ((j00) this.f27902b).a();
                return;
            case 22:
                l00 l00Var = (l00) this.f27902b;
                l00Var.U = l00Var.f25939c0;
                l00Var.f25937b0 = l00Var.f25943f0;
                l00Var.V = l00Var.f25940d0;
                l00Var.W = l00Var.f25941e0;
                l00Var.f25939c0 = -1;
                l00Var.f25940d0 = -1;
                l00Var.f25941e0 = -1;
                l00Var.f25943f0 = -1;
                return;
            case 23:
                z00 z00Var = (z00) this.f27902b;
                z00Var.f30750s = 1.0f;
                z00Var.invalidate();
                return;
            case 24:
                b60 b60Var = (b60) this.f27902b;
                if (animator == b60Var.W) {
                    b60Var.c(true);
                    b60Var.setVisibility(4);
                    return;
                }
                return;
            case 25:
                y70 y70Var = (y70) this.f27902b;
                w70 w70Var = y70Var.f30558x;
                if (w70Var != null) {
                    w70Var.setProgress(1.0f);
                    y70Var.f30558x.invalidate();
                }
                y70Var.m0 = null;
                return;
            case 26:
                m00 m00Var = (m00) this.f27902b;
                ((h80) m00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) m00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 27:
                v80 v80Var = (v80) this.f27902b;
                if (!v80Var.f29075f) {
                    v80Var.f29074c.setVisibility(8);
                    return;
                }
                return;
            case 28:
                c90 c90Var = (c90) this.f27902b;
                FrameLayout frameLayout = c90Var.f23291b;
                ci.r6 r6Var = (ci.r6) c90Var.f23292c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.fa) c90Var.d);
                return;
            default:
                zb0 zb0Var = (zb0) this.f27902b;
                zb0Var.f30839c0.h = null;
                zb0Var.e(zb0Var.S, zb0Var.R);
                return;
        }
    }
}
