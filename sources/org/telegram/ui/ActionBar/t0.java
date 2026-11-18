package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.if0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Wallet.x6;
import org.telegram.ui.rf;
public final class t0 extends AnimatorListenerAdapter {
    public final int f29990a;
    public final float f29991b;
    public final Object f29992c;

    public t0(Object obj, float f10, int i7) {
        this.f29990a = i7;
        this.f29992c = obj;
        this.f29991b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f29990a;
        float f10 = this.f29991b;
        Object obj = this.f29992c;
        switch (i7) {
            case 0:
                w0 w0Var = (w0) obj;
                w0Var.U = null;
                w0Var.f30125a = f10;
                w0Var.invalidate();
                return;
            case 1:
                m3 m3Var = (m3) obj;
                m3Var.f29223i = f10;
                n3 n3Var = m3Var.f29218b;
                if (n3Var != null) {
                    n3Var.invalidate();
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
                t7Var.f31989w = f10;
                colorMatrix.setSaturation(f10);
                if (n6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - t7Var.f31989w) * (-0.3f));
                }
                t7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                s9 s9Var = (s9) obj;
                s9Var.f39527g = f10;
                s9Var.invalidateSelf();
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                chatActivityEnterView.B6 = null;
                chatActivityEnterView.C6 = false;
                if (!chatActivityEnterView.M2) {
                    gf gfVar = chatActivityEnterView.F0;
                    if (gfVar != null) {
                        gfVar.setText("");
                        chatActivityEnterView.F0.setAlpha(1.0f);
                    }
                    ai.n0 n0Var = chatActivityEnterView.f32614j1;
                    if (n0Var != null) {
                        n0Var.j();
                    }
                    chatActivityEnterView.R0.invalidate();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new rf(this, f10, 3));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(lr.f37209g);
                    ofFloat.start();
                    return;
                }
                return;
            case 6:
                if0 if0Var = (if0) obj;
                if0Var.I.e();
                if0Var.f36113b = f10;
                if (f10 <= 0.0f) {
                    if0Var.H = -1;
                }
                if0Var.c(true);
                if0Var.f36116f = false;
                if (if0Var.Q != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    if0Var.Q.run();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Wallet.w3 w3Var = (org.telegram.ui.Wallet.w3) obj;
                x6 x6Var = w3Var.f45206r;
                x6Var.getClass();
                x6Var.setLayerType(0, null);
                if (f10 == 0.0f) {
                    w3Var.b();
                    return;
                } else if (!w3Var.S) {
                    ValueAnimator valueAnimator = w3Var.Q;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(w3Var.R, 1.0f);
                    w3Var.Q = ofFloat2;
                    ofFloat2.setDuration(320L);
                    w3Var.Q.setInterpolator(lr.f37209g);
                    w3Var.Q.addUpdateListener(new org.telegram.ui.Wallet.p3(w3Var, 0));
                    w3Var.Q.start();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) obj;
                if (n6Var.f44636n0 == animator) {
                    n6Var.f44636n0 = null;
                    n6Var.R0(f10);
                    n6Var.f44643s0.j(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29990a) {
            case 6:
                if0 if0Var = (if0) this.f29992c;
                if0Var.f36116f = true;
                if0Var.f36114c = this.f29991b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
