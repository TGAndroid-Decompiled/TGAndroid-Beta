package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class a9 extends AnimatorListenerAdapter {
    public final int f25193a;
    public final Object f25194b;

    public a9(Object obj, int i10) {
        this.f25193a = i10;
        this.f25194b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25193a) {
            case 8:
                ((ul) this.f25194b).f31643a.L = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25193a) {
            case 0:
                c9 c9Var = (c9) this.f25194b;
                if (c9Var.f25844f != null) {
                    c9Var.f25843e = 1.0f;
                    c9Var.n();
                    if (c9Var.f25845g) {
                        c9Var.f25845g = false;
                        Runnable runnable = c9Var.f25847j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    c9Var.f();
                }
                c9Var.f25844f = null;
                return;
            case 1:
                ((hf) this.f25194b).f27498f.V.setVisibility(8);
                return;
            case 2:
                ((lg) this.f25194b).f28735a0 = 1.0f;
                return;
            case 3:
                ((sh) this.f25194b).f31061c.f29108s.setVisibility(8);
                return;
            case 4:
                ((uh) this.f25194b).d.v.setVisibility(8);
                return;
            case 5:
                mi miVar = (mi) this.f25194b;
                miVar.W0 = null;
                if (!miVar.f29093n1) {
                    if (miVar.U0.getTag() == null && miVar.N0 == 0 && !miVar.Q0) {
                        miVar.X0.setVisibility(4);
                    }
                    miVar.f29070f1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.w0 w0Var = miVar.f29055b1;
                if (w0Var != null) {
                    w0Var.setVisibility(4);
                    return;
                }
                return;
            case 6:
                super.onAnimationEnd(animator);
                jk jkVar = (jk) this.f25194b;
                jkVar.f28133s.setVisibility(8);
                jkVar.f28131n = 0;
                xj xjVar = jkVar.f28132r;
                xjVar.setAlpha(1.0f);
                xjVar.setScaleX(1.0f);
                xjVar.setScaleY(1.0f);
                xjVar.setTranslationX(0.0f);
                xjVar.invalidate();
                return;
            case 7:
                ik ikVar = (ik) this.f25194b;
                if (ikVar.U.E.getTag() == null) {
                    ikVar.U.E.setVisibility(4);
                }
                ikVar.U.F = null;
                return;
            case 8:
                ul ulVar = (ul) this.f25194b;
                if (animator.equals(ulVar.f31643a.L)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ulVar.f31643a;
                    chatAttachAlertPhotoLayout.W = true;
                    chatAttachAlertPhotoLayout.L = null;
                    return;
                }
                return;
            case 9:
                om omVar = (om) this.f25194b;
                pm pmVar = omVar.M;
                pmVar.G = null;
                pmVar.H = false;
                omVar.invalidate();
                return;
            case 10:
                mp mpVar = (mp) this.f25194b;
                wo woVar = mpVar.O;
                if (woVar != null) {
                    if (woVar.getParent() != null) {
                        ((ViewGroup) mpVar.O.getParent()).removeView(mpVar.O);
                    }
                    mpVar.O = null;
                }
                mpVar.Q = null;
                super.onAnimationEnd(animator);
                return;
            case 11:
                CheckBox checkBox = (CheckBox) this.f25194b;
                if (animator.equals(checkBox.f24793s)) {
                    checkBox.f24793s = null;
                }
                if (!checkBox.f24795x) {
                    checkBox.D = null;
                    return;
                }
                return;
            case 12:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f25194b;
                if (animator.equals(checkBoxBase.f24810p)) {
                    checkBoxBase.f24810p = null;
                }
                if (!checkBoxBase.f24811q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 13:
                mq mqVar = (mq) this.f25194b;
                if (mqVar.H == mqVar.I) {
                    mqVar.D.setVisibility(4);
                }
                mqVar.f29236y = null;
                return;
            case 14:
                vq vqVar = (vq) this.f25194b;
                vqVar.f32516l = 1.0f;
                vqVar.f32519o = null;
                vqVar.f32520p = null;
                vqVar.f32521q = null;
                View view = vqVar.H;
                if (view != null) {
                    if (vqVar.h == 0 && vqVar.G) {
                        view.setVisibility(8);
                    }
                    vqVar.H.invalidate();
                }
                vqVar.f32509c = -1;
                return;
            case 15:
                fu fuVar = (fu) this.f25194b;
                fuVar.L = false;
                fuVar.d.setTranslationY(0.0f);
                fuVar.d.setAlpha(0.0f);
                fuVar.c(0.0f);
                fuVar.O = 0.0f;
                fuVar.j();
                return;
            case 16:
                ((nu) this.f25194b).f29579a.L = false;
                return;
            case 17:
                super.onAnimationEnd(animator);
                ((fv) this.f25194b).d = null;
                return;
            case 18:
                ((mz) this.f25194b).T = null;
                return;
            case 19:
                super.onAnimationEnd(animator);
                ((uy) this.f25194b).f31710n = null;
                return;
            case 20:
                ((j00) this.f25194b).a();
                return;
            case 21:
                l00 l00Var = (l00) this.f25194b;
                l00Var.R = l00Var.W;
                l00Var.V = l00Var.f28540c0;
                l00Var.S = l00Var.f28536a0;
                l00Var.T = l00Var.f28538b0;
                l00Var.W = -1;
                l00Var.f28536a0 = -1;
                l00Var.f28538b0 = -1;
                l00Var.f28540c0 = -1;
                return;
            case 22:
                z00 z00Var = (z00) this.f25194b;
                z00Var.f33715s = 1.0f;
                z00Var.invalidate();
                return;
            case 23:
                q70 q70Var = (q70) this.f25194b;
                o70 o70Var = q70Var.f30337x;
                if (o70Var != null) {
                    o70Var.setProgress(1.0f);
                    q70Var.f30337x.invalidate();
                }
                q70Var.m0 = null;
                return;
            case 24:
                m00 m00Var = (m00) this.f25194b;
                ((a80) m00Var.f28915e).B = false;
                TextView[] textViewArr = (TextView[]) m00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 25:
                n80 n80Var = (n80) this.f25194b;
                if (!n80Var.f29417f) {
                    n80Var.f29415c.setVisibility(8);
                    return;
                }
                return;
            case 26:
                u80 u80Var = (u80) this.f25194b;
                FrameLayout frameLayout = u80Var.f31556b;
                fg.i0 i0Var = (fg.i0) u80Var.f31557c;
                if (i0Var.getParent() != null) {
                    frameLayout.removeView(i0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ba) u80Var.d);
                return;
            case 27:
                sb0 sb0Var = (sb0) this.f25194b;
                sb0Var.W.h = null;
                sb0Var.e(sb0Var.P, sb0Var.O);
                return;
            case 28:
                NumberTextView numberTextView = (NumberTextView) this.f25194b;
                numberTextView.d = null;
                numberTextView.f24912b.clear();
                return;
            default:
                xd0 xd0Var = (xd0) this.f25194b;
                xd0Var.setVisibility(8);
                xd0Var.h();
                xd0Var.M = 0.0f;
                xd0Var.f(0.0f);
                xd0Var.setAlpha(0.0f);
                return;
        }
    }
}
