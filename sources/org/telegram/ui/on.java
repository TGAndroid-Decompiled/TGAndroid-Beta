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
    public final int f50605a;
    public boolean f50606b;
    public final Object f50607c;

    public on(int i7, Object obj, boolean z10) {
        this.f50605a = i7;
        this.f50607c = obj;
        this.f50606b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f50605a) {
            case 0:
                ((rn) this.f50607c).h = null;
                return;
            case 1:
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) this.f50607c;
                AnimatorSet animatorSet = y9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    y9Var.h = null;
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.Components.ui) this.f50607c).W2 = null;
                return;
            case 4:
                this.f50606b = true;
                return;
            case 9:
                org.telegram.ui.Components.sz szVar = (org.telegram.ui.Components.sz) this.f50607c;
                AnimatorSet animatorSet2 = szVar.f39685q1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    szVar.f39685q1 = null;
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.a60 a60Var = (org.telegram.ui.Components.a60) this.f50607c;
                AnimatorSet animatorSet3 = a60Var.S1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    a60Var.S1 = null;
                    return;
                }
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f50607c;
                if (animator.equals(pipRoundVideoView.f33009r)) {
                    pipRoundVideoView.f33009r = null;
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.jt0) this.f50607c).R1 = null;
                return;
            case 25:
                org.telegram.ui.Components.n51 n51Var = (org.telegram.ui.Components.n51) this.f50607c;
                AnimatorSet animatorSet4 = n51Var.f37743o1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    n51Var.f37743o1 = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.r51 r51Var = (org.telegram.ui.Components.r51) this.f50607c;
                AnimatorSet animatorSet5 = r51Var.f39041t1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    r51Var.f39041t1 = null;
                    return;
                }
                return;
            case 28:
                ((qr) this.f50607c).f51279x = null;
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
        int i10 = this.f50605a;
        int i11 = 8;
        float f11 = 1.0f;
        float f12 = 0.0f;
        Object obj = this.f50607c;
        switch (i10) {
            case 0:
                rn rnVar = (rn) obj;
                if (rnVar.h != null && (radialProgressView = rnVar.f51692n) != null) {
                    if (!this.f50606b) {
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
                    if (!this.f50606b) {
                        y9Var.f42339c.setVisibility(4);
                        return;
                    } else {
                        y9Var.f42338b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 2:
                org.telegram.ui.Components.mc mcVar = (org.telegram.ui.Components.mc) obj;
                if (animator == mcVar.f37436g) {
                    mcVar.f37436g = null;
                    if (!this.f50606b) {
                        f11 = 0.0f;
                    }
                    mcVar.f37438j = f11;
                    mcVar.b();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.ui uiVar = (org.telegram.ui.Components.ui) obj;
                if (uiVar.W2 != null) {
                    if (this.f50606b) {
                        if (uiVar.Q2) {
                            org.telegram.ui.Components.mi miVar = uiVar.f40425w2;
                            if (miVar == null || miVar.N()) {
                                uiVar.f40422v3.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.q0 q0Var = uiVar.f40359c3;
                    if (q0Var != null) {
                        q0Var.setVisibility(4);
                    }
                    if (uiVar.O2 != 0 || !uiVar.f40395o3) {
                        uiVar.Y2.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.io ioVar = (org.telegram.ui.Components.io) obj;
                if (!this.f50606b) {
                    org.telegram.ui.Components.q9 q9Var = ioVar.h;
                    ioVar.h = ioVar.f36249n;
                    ioVar.f36249n = q9Var;
                    q9Var.setVisibility(8);
                    ioVar.f36249n.setAlpha(0.0f);
                    ioVar.h.setVisibility(0);
                    ioVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 5:
                boolean z10 = this.f50606b;
                org.telegram.ui.Components.vo voVar = (org.telegram.ui.Components.vo) obj;
                if (animator == voVar.f40842e) {
                    if (!z10) {
                        f11 = 0.0f;
                    }
                    voVar.d = f11;
                    voVar.setShown(f11);
                    if (!z10) {
                        voVar.setVisibility(8);
                    }
                    voVar.a(true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.np npVar = (org.telegram.ui.Components.np) obj;
                if (!this.f50606b) {
                    f11 = 0.0f;
                }
                npVar.f37878a2 = f11;
                npVar.D1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * npVar.f37878a2);
                return;
            case 7:
                if (!this.f50606b) {
                    ((org.telegram.ui.Components.mq) obj).I.setVisibility(8);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.jv jvVar = (org.telegram.ui.Components.jv) obj;
                org.telegram.ui.Components.nv nvVar = jvVar.O;
                if (nvVar.V && !jvVar.h) {
                    if (!this.f50606b && !jvVar.f36659n) {
                        jvVar.setBackground(null);
                        return;
                    } else if (jvVar.getBackground() == null) {
                        jvVar.setBackground(org.telegram.ui.ActionBar.m6.a0(nvVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 9:
                org.telegram.ui.Components.sz szVar = (org.telegram.ui.Components.sz) obj;
                AnimatorSet animatorSet2 = szVar.f39685q1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f50606b) {
                        szVar.f39686r1.setVisibility(4);
                    }
                    szVar.f39685q1 = null;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.e00 e00Var = (org.telegram.ui.Components.e00) obj;
                if (!this.f50606b) {
                    f11 = 0.0f;
                }
                e00Var.f34618n = f11;
                e00Var.invalidate();
                return;
            case 11:
                org.telegram.ui.Components.c20 c20Var = (org.telegram.ui.Components.c20) obj;
                org.telegram.ui.Components.a20 a20Var = c20Var.f33947a;
                if (!c20Var.H) {
                    if (this.f50606b) {
                        f12 = 1.0f;
                    }
                    c20Var.f33953d0 = f12;
                    c20Var.W.setPinnedProgress(f12);
                    a20Var.setScaleX(1.0f - (c20Var.f33953d0 * 0.6f));
                    a20Var.setScaleY(1.0f - (c20Var.f33953d0 * 0.6f));
                    if (c20Var.Y) {
                        c20Var.j();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                View view = (View) obj;
                if (!this.f50606b) {
                    i11 = 4;
                }
                view.setVisibility(i11);
                return;
            case 13:
                org.telegram.ui.Components.a60 a60Var = (org.telegram.ui.Components.a60) obj;
                AnimatorSet animatorSet3 = a60Var.S1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f50606b) {
                        a60Var.T1.setVisibility(4);
                    }
                    a60Var.S1 = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.l60 l60Var = (org.telegram.ui.Components.l60) obj;
                boolean z11 = this.f50606b;
                if (!z11) {
                    f11 = 0.0f;
                }
                l60Var.f37078c2 = f11;
                l60Var.f30142b.invalidate();
                if (!z11) {
                    l60Var.Q1.setVisibility(8);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.wa0 wa0Var = (org.telegram.ui.Components.wa0) obj;
                if (wa0Var.getParent() != null) {
                    ((ViewGroup) wa0Var.getParent()).removeView(wa0Var);
                }
                boolean z12 = this.f50606b;
                mk mkVar = (mk) wa0Var;
                org.telegram.messenger.kj kjVar = mkVar.I.f46208x5;
                if (kjVar != null) {
                    kjVar.f25063x = null;
                }
                if (z12) {
                    org.telegram.messenger.g0.h3(new lk(mkVar, 1), 15L);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.qa0 qa0Var = (org.telegram.ui.Components.qa0) obj;
                qa0Var.Q = null;
                qa0Var.h(this.f50606b, false);
                return;
            case 17:
                org.telegram.ui.Components.qc0 qc0Var = (org.telegram.ui.Components.qc0) obj;
                TextView textView = qc0Var.f38843x;
                bi.v2 v2Var = qc0Var.f38832e;
                if (this.f50606b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                v2Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                v2Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                v2Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, f10));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, f10));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, f10));
                qc0Var.f38841s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) obj;
                if (animator.equals(pipRoundVideoView.f33009r)) {
                    if (!this.f50606b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f33009r = null;
                    return;
                }
                return;
            case 19:
                boolean z13 = this.f50606b;
                org.telegram.ui.Components.em0 em0Var = (org.telegram.ui.Components.em0) obj;
                if (animator == em0Var.H) {
                    if (!z13) {
                        f11 = 0.0f;
                    }
                    em0Var.G = f11;
                    em0Var.setShown(f11);
                    if (!z13) {
                        em0Var.setVisibility(8);
                    }
                    em0Var.b(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.jt0 jt0Var = (org.telegram.ui.Components.jt0) obj;
                if (jt0Var.R1 != null) {
                    jt0Var.R1 = null;
                    if (!this.f50606b) {
                        jt0Var.E0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.k01 k01Var = (org.telegram.ui.Components.k01) obj;
                if (!this.f50606b) {
                    f11 = 0.0f;
                }
                k01Var.N = f11;
                k01Var.invalidate();
                return;
            case 22:
                boolean z14 = this.f50606b;
                org.telegram.ui.Components.a21 a21Var = (org.telegram.ui.Components.a21) obj;
                long j3 = a21Var.f33255f;
                if (a21Var.f33254e0 == animator) {
                    if (!z14) {
                        f11 = 0.0f;
                    }
                    a21Var.V = f11;
                    a21Var.p();
                    a21Var.W = false;
                    ImageView imageView = a21Var.I;
                    int i12 = 2131231887;
                    if (a21Var.T) {
                        i7 = 2131231887;
                    } else {
                        i7 = 2131231884;
                    }
                    imageView.setImageResource(i7);
                    ImageView imageView2 = a21Var.H;
                    if (!a21Var.T) {
                        i12 = 2131231885;
                    }
                    imageView2.setImageResource(i12);
                    a21Var.f33254e0 = null;
                    org.telegram.messenger.np.u1(a21Var.f33253e).h7.edit().putBoolean("topicssidetabs" + j3, a21Var.U).putBoolean("topicssidetabsb" + j3, a21Var.T).apply();
                    Boolean bool = a21Var.f33252d0;
                    if (bool != null && z14 != bool.booleanValue()) {
                        boolean booleanValue = a21Var.f33252d0.booleanValue();
                        a21Var.f33252d0 = null;
                        a21Var.d(booleanValue);
                    }
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Components.cp0(this, 20));
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Components.v11 v11Var = (org.telegram.ui.Components.v11) obj;
                if (!this.f50606b) {
                    f11 = 0.0f;
                }
                v11Var.G = f11;
                v11Var.h();
                return;
            case 24:
                org.telegram.ui.Components.z11 z11Var = (org.telegram.ui.Components.z11) obj;
                if (!this.f50606b) {
                    f11 = 0.0f;
                }
                z11Var.V = f11;
                z11Var.h();
                z11Var.g();
                return;
            case 25:
                org.telegram.ui.Components.n51 n51Var = (org.telegram.ui.Components.n51) obj;
                AnimatorSet animatorSet4 = n51Var.f37743o1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f50606b) {
                        n51Var.f37744p1.setVisibility(4);
                    }
                    n51Var.f37743o1 = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.r51 r51Var = (org.telegram.ui.Components.r51) obj;
                AnimatorSet animatorSet5 = r51Var.f39041t1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f50606b) {
                        r51Var.f39040s1.setVisibility(4);
                    }
                    r51Var.f39041t1 = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.voip.q2 q2Var = (org.telegram.ui.Components.voip.q2) obj;
                q2Var.f41268w = null;
                if (this.f50606b) {
                    TextView[] textViewArr = q2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!q2Var.H && (drawable = (drawableArr = q2Var.f41263e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                q2Var.H = false;
                if (!q2Var.P) {
                    q2Var.f41265n = q2Var.f41266r;
                }
                q2Var.f41267s = 0.0f;
                q2Var.invalidate();
                return;
            case 28:
                qr qrVar = (qr) obj;
                if (qrVar.f51279x != null && (radialProgressView2 = qrVar.f51277s) != null) {
                    if (!this.f50606b) {
                        radialProgressView2.setVisibility(4);
                        qrVar.f51278w.setVisibility(4);
                    }
                    qrVar.f51279x = null;
                    return;
                }
                return;
            default:
                ez ezVar = (ez) obj;
                if (!this.f50606b) {
                    f11 = 0.0f;
                }
                ezVar.f47387s = f11;
                ezVar.invalidate();
                return;
        }
    }

    public on(View view) {
        this.f50605a = 12;
        this.f50607c = view;
        this.f50606b = true;
    }

    public on(View view, boolean z10) {
        this.f50605a = 12;
        this.f50607c = view;
        this.f50606b = z10;
    }

    public on(org.telegram.ui.Components.io ioVar) {
        this.f50605a = 4;
        this.f50607c = ioVar;
    }
}
