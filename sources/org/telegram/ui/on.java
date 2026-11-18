package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
public final class on extends AnimatorListenerAdapter {
    public final int f50635a;
    public boolean f50636b;
    public final Object f50637c;

    public on(int i7, Object obj, boolean z10) {
        this.f50635a = i7;
        this.f50637c = obj;
        this.f50636b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f50635a) {
            case 0:
                ((rn) this.f50637c).h = null;
                return;
            case 1:
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) this.f50637c;
                AnimatorSet animatorSet = y9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    y9Var.h = null;
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.Components.si) this.f50637c).W2 = null;
                return;
            case 4:
                this.f50636b = true;
                return;
            case 9:
                org.telegram.ui.Components.qz qzVar = (org.telegram.ui.Components.qz) this.f50637c;
                AnimatorSet animatorSet2 = qzVar.f38946q1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    qzVar.f38946q1 = null;
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.x50 x50Var = (org.telegram.ui.Components.x50) this.f50637c;
                AnimatorSet animatorSet3 = x50Var.S1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    x50Var.S1 = null;
                    return;
                }
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f50637c;
                if (animator.equals(pipRoundVideoView.f33007r)) {
                    pipRoundVideoView.f33007r = null;
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.gt0) this.f50637c).R1 = null;
                return;
            case 25:
                org.telegram.ui.Components.k51 k51Var = (org.telegram.ui.Components.k51) this.f50637c;
                AnimatorSet animatorSet4 = k51Var.f36685o1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    k51Var.f36685o1 = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.o51 o51Var = (org.telegram.ui.Components.o51) this.f50637c;
                AnimatorSet animatorSet5 = o51Var.f37989t1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    o51Var.f37989t1 = null;
                    return;
                }
                return;
            case 28:
                ((qr) this.f50637c).f51327x = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        RadialProgressView radialProgressView;
        float f10;
        int i7;
        Drawable[] drawableArr;
        Drawable drawable;
        RadialProgressView radialProgressView2;
        int i10 = this.f50635a;
        int i11 = 8;
        float f11 = 1.0f;
        float f12 = 0.0f;
        Object obj = this.f50637c;
        switch (i10) {
            case 0:
                rn rnVar = (rn) obj;
                if (rnVar.h != null && (radialProgressView = rnVar.f51692n) != null) {
                    if (!this.f50636b) {
                        radialProgressView.setVisibility(4);
                        rnVar.f51684f.setVisibility(4);
                    }
                    rnVar.h = null;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) obj;
                AnimatorSet animatorSet = y9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f50636b) {
                        y9Var.f42413c.setVisibility(4);
                        return;
                    } else {
                        y9Var.f42412b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 2:
                org.telegram.ui.Components.mc mcVar = (org.telegram.ui.Components.mc) obj;
                if (animator == mcVar.f37433g) {
                    mcVar.f37433g = null;
                    if (!this.f50636b) {
                        f11 = 0.0f;
                    }
                    mcVar.f37435j = f11;
                    mcVar.b();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.si siVar = (org.telegram.ui.Components.si) obj;
                if (siVar.W2 != null) {
                    if (this.f50636b) {
                        if (siVar.Q2) {
                            org.telegram.ui.Components.ki kiVar = siVar.f39732w2;
                            if (kiVar == null || kiVar.N()) {
                                siVar.f39729v3.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.r0 r0Var = siVar.f39666c3;
                    if (r0Var != null) {
                        r0Var.setVisibility(4);
                    }
                    if (siVar.O2 != 0 || !siVar.f39702o3) {
                        siVar.Y2.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.go goVar = (org.telegram.ui.Components.go) obj;
                if (!this.f50636b) {
                    org.telegram.ui.Components.q9 q9Var = goVar.h;
                    goVar.h = goVar.f35540n;
                    goVar.f35540n = q9Var;
                    q9Var.setVisibility(8);
                    goVar.f35540n.setAlpha(0.0f);
                    goVar.h.setVisibility(0);
                    goVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 5:
                boolean z10 = this.f50636b;
                org.telegram.ui.Components.to toVar = (org.telegram.ui.Components.to) obj;
                if (animator == toVar.f40064e) {
                    if (!z10) {
                        f11 = 0.0f;
                    }
                    toVar.d = f11;
                    toVar.setShown(f11);
                    if (!z10) {
                        toVar.setVisibility(8);
                    }
                    toVar.a(true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) obj;
                if (!this.f50636b) {
                    f11 = 0.0f;
                }
                lpVar.f37169a2 = f11;
                lpVar.D1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * lpVar.f37169a2);
                return;
            case 7:
                if (!this.f50636b) {
                    ((org.telegram.ui.Components.kq) obj).I.setVisibility(8);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.hv hvVar = (org.telegram.ui.Components.hv) obj;
                org.telegram.ui.Components.lv lvVar = hvVar.O;
                if (lvVar.V && !hvVar.h) {
                    if (!this.f50636b && !hvVar.f35990n) {
                        hvVar.setBackground(null);
                        return;
                    } else if (hvVar.getBackground() == null) {
                        hvVar.setBackground(org.telegram.ui.ActionBar.n6.a0(lvVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 9:
                org.telegram.ui.Components.qz qzVar = (org.telegram.ui.Components.qz) obj;
                AnimatorSet animatorSet2 = qzVar.f38946q1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f50636b) {
                        qzVar.f38947r1.setVisibility(4);
                    }
                    qzVar.f38946q1 = null;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.c00 c00Var = (org.telegram.ui.Components.c00) obj;
                if (!this.f50636b) {
                    f11 = 0.0f;
                }
                c00Var.f33831n = f11;
                c00Var.invalidate();
                return;
            case 11:
                org.telegram.ui.Components.z10 z10Var = (org.telegram.ui.Components.z10) obj;
                org.telegram.ui.Components.x10 x10Var = z10Var.f42712a;
                if (!z10Var.H) {
                    if (this.f50636b) {
                        f12 = 1.0f;
                    }
                    z10Var.f42718d0 = f12;
                    z10Var.W.setPinnedProgress(f12);
                    x10Var.setScaleX(1.0f - (z10Var.f42718d0 * 0.6f));
                    x10Var.setScaleY(1.0f - (z10Var.f42718d0 * 0.6f));
                    if (z10Var.Y) {
                        z10Var.j();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                View view = (View) obj;
                if (!this.f50636b) {
                    i11 = 4;
                }
                view.setVisibility(i11);
                return;
            case 13:
                org.telegram.ui.Components.x50 x50Var = (org.telegram.ui.Components.x50) obj;
                AnimatorSet animatorSet3 = x50Var.S1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f50636b) {
                        x50Var.T1.setVisibility(4);
                    }
                    x50Var.S1 = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.j60 j60Var = (org.telegram.ui.Components.j60) obj;
                boolean z11 = this.f50636b;
                if (!z11) {
                    f11 = 0.0f;
                }
                j60Var.f36354c2 = f11;
                j60Var.f30192b.invalidate();
                if (!z11) {
                    j60Var.Q1.setVisibility(8);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.ua0 ua0Var = (org.telegram.ui.Components.ua0) obj;
                if (ua0Var.getParent() != null) {
                    ((ViewGroup) ua0Var.getParent()).removeView(ua0Var);
                }
                boolean z12 = this.f50636b;
                mk mkVar = (mk) ua0Var;
                org.telegram.messenger.jj jjVar = mkVar.I.f46237x5;
                if (jjVar != null) {
                    jjVar.f24887x = null;
                }
                if (z12) {
                    org.telegram.messenger.g0.h3(new lk(mkVar, 1), 15L);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.oa0 oa0Var = (org.telegram.ui.Components.oa0) obj;
                oa0Var.Q = null;
                oa0Var.h(this.f50636b, false);
                return;
            case 17:
                org.telegram.ui.Components.pc0 pc0Var = (org.telegram.ui.Components.pc0) obj;
                TextView textView = pc0Var.f38378x;
                bi.p2 p2Var = pc0Var.f38367e;
                if (this.f50636b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                p2Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                p2Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                p2Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, f10));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, f10));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, f10));
                pc0Var.f38376s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) obj;
                if (animator.equals(pipRoundVideoView.f33007r)) {
                    if (!this.f50636b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f33007r = null;
                    return;
                }
                return;
            case 19:
                boolean z13 = this.f50636b;
                org.telegram.ui.Components.cm0 cm0Var = (org.telegram.ui.Components.cm0) obj;
                if (animator == cm0Var.H) {
                    if (!z13) {
                        f11 = 0.0f;
                    }
                    cm0Var.G = f11;
                    cm0Var.setShown(f11);
                    if (!z13) {
                        cm0Var.setVisibility(8);
                    }
                    cm0Var.b(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.gt0 gt0Var = (org.telegram.ui.Components.gt0) obj;
                if (gt0Var.R1 != null) {
                    gt0Var.R1 = null;
                    if (!this.f50636b) {
                        gt0Var.E0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.j01 j01Var = (org.telegram.ui.Components.j01) obj;
                if (!this.f50636b) {
                    f11 = 0.0f;
                }
                j01Var.N = f11;
                j01Var.invalidate();
                return;
            case 22:
                boolean z14 = this.f50636b;
                org.telegram.ui.Components.z11 z11Var = (org.telegram.ui.Components.z11) obj;
                long j3 = z11Var.f42737f;
                if (z11Var.f42736e0 == animator) {
                    if (!z14) {
                        f11 = 0.0f;
                    }
                    z11Var.V = f11;
                    z11Var.p();
                    z11Var.W = false;
                    ImageView imageView = z11Var.I;
                    int i12 = 2131231887;
                    if (z11Var.T) {
                        i7 = 2131231887;
                    } else {
                        i7 = 2131231884;
                    }
                    imageView.setImageResource(i7);
                    ImageView imageView2 = z11Var.H;
                    if (!z11Var.T) {
                        i12 = 2131231885;
                    }
                    imageView2.setImageResource(i12);
                    z11Var.f42736e0 = null;
                    org.telegram.messenger.mp.u1(z11Var.f42735e).h7.edit().putBoolean("topicssidetabs" + j3, z11Var.U).putBoolean("topicssidetabsb" + j3, z11Var.T).apply();
                    Boolean bool = z11Var.f42734d0;
                    if (bool != null && z14 != bool.booleanValue()) {
                        boolean booleanValue = z11Var.f42734d0.booleanValue();
                        z11Var.f42734d0 = null;
                        z11Var.d(booleanValue);
                    }
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Components.ap0(this, 20));
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Components.u11 u11Var = (org.telegram.ui.Components.u11) obj;
                if (!this.f50636b) {
                    f11 = 0.0f;
                }
                u11Var.G = f11;
                u11Var.h();
                return;
            case 24:
                org.telegram.ui.Components.y11 y11Var = (org.telegram.ui.Components.y11) obj;
                if (!this.f50636b) {
                    f11 = 0.0f;
                }
                y11Var.V = f11;
                y11Var.h();
                y11Var.g();
                return;
            case 25:
                org.telegram.ui.Components.k51 k51Var = (org.telegram.ui.Components.k51) obj;
                AnimatorSet animatorSet4 = k51Var.f36685o1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f50636b) {
                        k51Var.f36686p1.setVisibility(4);
                    }
                    k51Var.f36685o1 = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.o51 o51Var = (org.telegram.ui.Components.o51) obj;
                AnimatorSet animatorSet5 = o51Var.f37989t1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f50636b) {
                        o51Var.f37988s1.setVisibility(4);
                    }
                    o51Var.f37989t1 = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.voip.q2 q2Var = (org.telegram.ui.Components.voip.q2) obj;
                q2Var.f41170w = null;
                if (this.f50636b) {
                    TextView[] textViewArr = q2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!q2Var.H && (drawable = (drawableArr = q2Var.f41165e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                q2Var.H = false;
                if (!q2Var.P) {
                    q2Var.f41167n = q2Var.f41168r;
                }
                q2Var.f41169s = 0.0f;
                q2Var.invalidate();
                return;
            case 28:
                qr qrVar = (qr) obj;
                if (qrVar.f51327x != null && (radialProgressView2 = qrVar.f51325s) != null) {
                    if (!this.f50636b) {
                        radialProgressView2.setVisibility(4);
                        qrVar.f51326w.setVisibility(4);
                    }
                    qrVar.f51327x = null;
                    return;
                }
                return;
            default:
                ez ezVar = (ez) obj;
                if (!this.f50636b) {
                    f11 = 0.0f;
                }
                ezVar.f47397s = f11;
                ezVar.invalidate();
                return;
        }
    }

    public on(View view) {
        this.f50635a = 12;
        this.f50637c = view;
        this.f50636b = true;
    }

    public on(View view, boolean z10) {
        this.f50635a = 12;
        this.f50637c = view;
        this.f50636b = z10;
    }

    public on(org.telegram.ui.Components.go goVar) {
        this.f50635a = 4;
        this.f50637c = goVar;
    }
}
