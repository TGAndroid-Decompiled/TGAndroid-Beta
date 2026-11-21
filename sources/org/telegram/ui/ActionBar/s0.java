package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Wallet.x6;
import org.telegram.ui.rf;
public final class s0 extends AnimatorListenerAdapter {
    public final int f29971a;
    public final float f29972b;
    public final Object f29973c;

    public s0(Object obj, float f10, int i7) {
        this.f29971a = i7;
        this.f29973c = obj;
        this.f29972b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f29971a;
        float f10 = this.f29972b;
        Object obj = this.f29973c;
        switch (i7) {
            case 0:
                v0 v0Var = (v0) obj;
                v0Var.U = null;
                v0Var.f30106a = f10;
                v0Var.invalidate();
                return;
            case 1:
                l3 l3Var = (l3) obj;
                l3Var.f29203i = f10;
                m3 m3Var = l3Var.f29198b;
                if (m3Var != null) {
                    m3Var.invalidate();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) obj;
                n6Var.G = f10;
                n6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                u7 u7Var = (u7) obj;
                u7Var.f32065w = f10;
                colorMatrix.setSaturation(f10);
                if (m6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - u7Var.f32065w) * (-0.3f));
                }
                u7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                s9 s9Var = (s9) obj;
                s9Var.f39536g = f10;
                s9Var.invalidateSelf();
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                chatActivityEnterView.D6 = null;
                chatActivityEnterView.E6 = false;
                if (!chatActivityEnterView.O2) {
                    gf gfVar = chatActivityEnterView.F0;
                    if (gfVar != null) {
                        gfVar.setText("");
                        chatActivityEnterView.F0.setAlpha(1.0f);
                    }
                    ai.p0 p0Var = chatActivityEnterView.f32642j1;
                    if (p0Var != null) {
                        p0Var.k();
                    }
                    chatActivityEnterView.R0.invalidate();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new rf(this, f10, 3));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(nr.f37957g);
                    ofFloat.start();
                    return;
                }
                return;
            case 6:
                kf0 kf0Var = (kf0) obj;
                kf0Var.I.e();
                kf0Var.f36896b = f10;
                if (f10 <= 0.0f) {
                    kf0Var.H = -1;
                }
                kf0Var.c(true);
                kf0Var.f36899f = false;
                if (kf0Var.Q != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    kf0Var.Q.run();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Wallet.w3 w3Var = (org.telegram.ui.Wallet.w3) obj;
                x6 x6Var = w3Var.f45247r;
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
                    w3Var.Q.setInterpolator(nr.f37957g);
                    w3Var.Q.addUpdateListener(new org.telegram.ui.Wallet.p3(w3Var, 0));
                    w3Var.Q.start();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.n6 n6Var2 = (org.telegram.ui.Wallet.n6) obj;
                if (n6Var2.f44676n0 == animator) {
                    n6Var2.f44676n0 = null;
                    n6Var2.R0(f10);
                    n6Var2.f44683s0.j(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29971a) {
            case 6:
                kf0 kf0Var = (kf0) this.f29973c;
                kf0Var.f36899f = true;
                kf0Var.f36897c = this.f29972b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
