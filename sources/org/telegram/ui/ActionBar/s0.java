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
    public final int f29940a;
    public final float f29941b;
    public final Object f29942c;

    public s0(Object obj, float f10, int i7) {
        this.f29940a = i7;
        this.f29942c = obj;
        this.f29941b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f29940a;
        float f10 = this.f29941b;
        Object obj = this.f29942c;
        switch (i7) {
            case 0:
                v0 v0Var = (v0) obj;
                v0Var.U = null;
                v0Var.f30075a = f10;
                v0Var.invalidate();
                return;
            case 1:
                l3 l3Var = (l3) obj;
                l3Var.f29172i = f10;
                m3 m3Var = l3Var.f29167b;
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
                u7Var.f32034w = f10;
                colorMatrix.setSaturation(f10);
                if (m6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - u7Var.f32034w) * (-0.3f));
                }
                u7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                s9 s9Var = (s9) obj;
                s9Var.f39484g = f10;
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
                    ai.k0 k0Var = chatActivityEnterView.f32611j1;
                    if (k0Var != null) {
                        k0Var.k();
                    }
                    chatActivityEnterView.R0.invalidate();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new rf(this, f10, 3));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(nr.f37918g);
                    ofFloat.start();
                    return;
                }
                return;
            case 6:
                kf0 kf0Var = (kf0) obj;
                kf0Var.I.e();
                kf0Var.f36864b = f10;
                if (f10 <= 0.0f) {
                    kf0Var.H = -1;
                }
                kf0Var.c(true);
                kf0Var.f36867f = false;
                if (kf0Var.Q != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    kf0Var.Q.run();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Wallet.w3 w3Var = (org.telegram.ui.Wallet.w3) obj;
                x6 x6Var = w3Var.f45216r;
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
                    w3Var.Q.setInterpolator(nr.f37918g);
                    w3Var.Q.addUpdateListener(new org.telegram.ui.Wallet.p3(w3Var, 0));
                    w3Var.Q.start();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.n6 n6Var2 = (org.telegram.ui.Wallet.n6) obj;
                if (n6Var2.f44646n0 == animator) {
                    n6Var2.f44646n0 = null;
                    n6Var2.R0(f10);
                    n6Var2.f44653s0.j(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29940a) {
            case 6:
                kf0 kf0Var = (kf0) this.f29942c;
                kf0Var.f36867f = true;
                kf0Var.f36865c = this.f29941b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
