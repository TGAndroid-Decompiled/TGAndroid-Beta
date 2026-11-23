package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.r9;
import org.telegram.ui.Wallet.y6;
import org.telegram.ui.rf;
public final class s0 extends AnimatorListenerAdapter {
    public final int f30036a;
    public final float f30037b;
    public final Object f30038c;

    public s0(Object obj, float f10, int i7) {
        this.f30036a = i7;
        this.f30038c = obj;
        this.f30037b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f30036a;
        float f10 = this.f30037b;
        Object obj = this.f30038c;
        switch (i7) {
            case 0:
                v0 v0Var = (v0) obj;
                v0Var.U = null;
                v0Var.f30169a = f10;
                v0Var.invalidate();
                return;
            case 1:
                l3 l3Var = (l3) obj;
                l3Var.f29257i = f10;
                m3 m3Var = l3Var.f29252b;
                if (m3Var != null) {
                    m3Var.invalidate();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) obj;
                m6Var.G = f10;
                m6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                t7 t7Var = (t7) obj;
                t7Var.f31937w = f10;
                colorMatrix.setSaturation(f10);
                if (n6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - t7Var.f31937w) * (-0.3f));
                }
                t7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                r9 r9Var = (r9) obj;
                r9Var.f39239g = f10;
                r9Var.invalidateSelf();
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                chatActivityEnterView.D6 = null;
                chatActivityEnterView.E6 = false;
                if (!chatActivityEnterView.O2) {
                    hf hfVar = chatActivityEnterView.F0;
                    if (hfVar != null) {
                        hfVar.setText("");
                        chatActivityEnterView.F0.setAlpha(1.0f);
                    }
                    ai.l0 l0Var = chatActivityEnterView.f32709j1;
                    if (l0Var != null) {
                        l0Var.j();
                    }
                    chatActivityEnterView.R0.invalidate();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new rf(this, f10, 3));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(kr.f36859g);
                    ofFloat.start();
                    return;
                }
                return;
            case 6:
                jf0 jf0Var = (jf0) obj;
                jf0Var.I.e();
                jf0Var.f36399b = f10;
                if (f10 <= 0.0f) {
                    jf0Var.H = -1;
                }
                jf0Var.c(true);
                jf0Var.f36402f = false;
                if (jf0Var.Q != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    jf0Var.Q.run();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Wallet.x3 x3Var = (org.telegram.ui.Wallet.x3) obj;
                y6 y6Var = x3Var.f45378r;
                y6Var.getClass();
                y6Var.setLayerType(0, null);
                if (f10 == 0.0f) {
                    x3Var.b();
                    return;
                } else if (!x3Var.S) {
                    ValueAnimator valueAnimator = x3Var.Q;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(x3Var.R, 1.0f);
                    x3Var.Q = ofFloat2;
                    ofFloat2.setDuration(320L);
                    x3Var.Q.setInterpolator(kr.f36859g);
                    x3Var.Q.addUpdateListener(new org.telegram.ui.Wallet.q3(x3Var, 0));
                    x3Var.Q.start();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.o6 o6Var = (org.telegram.ui.Wallet.o6) obj;
                if (o6Var.f44808n0 == animator) {
                    o6Var.f44808n0 = null;
                    o6Var.R0(f10);
                    o6Var.f44815s0.l(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f30036a) {
            case 6:
                jf0 jf0Var = (jf0) this.f30038c;
                jf0Var.f36402f = true;
                jf0Var.f36400c = this.f30037b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
