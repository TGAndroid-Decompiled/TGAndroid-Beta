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
    public final int f50624a;
    public boolean f50625b;
    public final Object f50626c;

    public on(int i7, Object obj, boolean z10) {
        this.f50624a = i7;
        this.f50626c = obj;
        this.f50625b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f50624a) {
            case 0:
                ((rn) this.f50626c).h = null;
                return;
            case 1:
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) this.f50626c;
                AnimatorSet animatorSet = y9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    y9Var.h = null;
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.Components.ui) this.f50626c).W2 = null;
                return;
            case 4:
                this.f50625b = true;
                return;
            case 9:
                org.telegram.ui.Components.sz szVar = (org.telegram.ui.Components.sz) this.f50626c;
                AnimatorSet animatorSet2 = szVar.f39738q1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    szVar.f39738q1 = null;
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.a60 a60Var = (org.telegram.ui.Components.a60) this.f50626c;
                AnimatorSet animatorSet3 = a60Var.S1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    a60Var.S1 = null;
                    return;
                }
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f50626c;
                if (animator.equals(pipRoundVideoView.f33040r)) {
                    pipRoundVideoView.f33040r = null;
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.jt0) this.f50626c).R1 = null;
                return;
            case 25:
                org.telegram.ui.Components.n51 n51Var = (org.telegram.ui.Components.n51) this.f50626c;
                AnimatorSet animatorSet4 = n51Var.f37783o1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    n51Var.f37783o1 = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.r51 r51Var = (org.telegram.ui.Components.r51) this.f50626c;
                AnimatorSet animatorSet5 = r51Var.f39077t1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    r51Var.f39077t1 = null;
                    return;
                }
                return;
            case 28:
                ((qr) this.f50626c).f51341x = null;
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
        int i10 = this.f50624a;
        int i11 = 8;
        float f11 = 1.0f;
        float f12 = 0.0f;
        Object obj = this.f50626c;
        switch (i10) {
            case 0:
                rn rnVar = (rn) obj;
                if (rnVar.h != null && (radialProgressView = rnVar.f51656n) != null) {
                    if (!this.f50625b) {
                        radialProgressView.setVisibility(4);
                        rnVar.f51648f.setVisibility(4);
                    }
                    rnVar.h = null;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) obj;
                AnimatorSet animatorSet = y9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f50625b) {
                        y9Var.f42369c.setVisibility(4);
                        return;
                    } else {
                        y9Var.f42368b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 2:
                org.telegram.ui.Components.mc mcVar = (org.telegram.ui.Components.mc) obj;
                if (animator == mcVar.f37478g) {
                    mcVar.f37478g = null;
                    if (!this.f50625b) {
                        f11 = 0.0f;
                    }
                    mcVar.f37480j = f11;
                    mcVar.b();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.ui uiVar = (org.telegram.ui.Components.ui) obj;
                if (uiVar.W2 != null) {
                    if (this.f50625b) {
                        if (uiVar.Q2) {
                            org.telegram.ui.Components.mi miVar = uiVar.f40448w2;
                            if (miVar == null || miVar.N()) {
                                uiVar.f40445v3.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.q0 q0Var = uiVar.f40382c3;
                    if (q0Var != null) {
                        q0Var.setVisibility(4);
                    }
                    if (uiVar.O2 != 0 || !uiVar.f40418o3) {
                        uiVar.Y2.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.io ioVar = (org.telegram.ui.Components.io) obj;
                if (!this.f50625b) {
                    org.telegram.ui.Components.q9 q9Var = ioVar.h;
                    ioVar.h = ioVar.f36297n;
                    ioVar.f36297n = q9Var;
                    q9Var.setVisibility(8);
                    ioVar.f36297n.setAlpha(0.0f);
                    ioVar.h.setVisibility(0);
                    ioVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 5:
                boolean z10 = this.f50625b;
                org.telegram.ui.Components.vo voVar = (org.telegram.ui.Components.vo) obj;
                if (animator == voVar.f40879e) {
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
                if (!this.f50625b) {
                    f11 = 0.0f;
                }
                npVar.f37917a2 = f11;
                npVar.D1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * npVar.f37917a2);
                return;
            case 7:
                if (!this.f50625b) {
                    ((org.telegram.ui.Components.mq) obj).I.setVisibility(8);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.kv kvVar = (org.telegram.ui.Components.kv) obj;
                org.telegram.ui.Components.ov ovVar = kvVar.O;
                if (ovVar.V && !kvVar.h) {
                    if (!this.f50625b && !kvVar.f36994n) {
                        kvVar.setBackground(null);
                        return;
                    } else if (kvVar.getBackground() == null) {
                        kvVar.setBackground(org.telegram.ui.ActionBar.m6.a0(ovVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 9:
                org.telegram.ui.Components.sz szVar = (org.telegram.ui.Components.sz) obj;
                AnimatorSet animatorSet2 = szVar.f39738q1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f50625b) {
                        szVar.f39739r1.setVisibility(4);
                    }
                    szVar.f39738q1 = null;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.e00 e00Var = (org.telegram.ui.Components.e00) obj;
                if (!this.f50625b) {
                    f11 = 0.0f;
                }
                e00Var.f34633n = f11;
                e00Var.invalidate();
                return;
            case 11:
                org.telegram.ui.Components.c20 c20Var = (org.telegram.ui.Components.c20) obj;
                org.telegram.ui.Components.a20 a20Var = c20Var.f33989a;
                if (!c20Var.H) {
                    if (this.f50625b) {
                        f12 = 1.0f;
                    }
                    c20Var.f33995d0 = f12;
                    c20Var.W.setPinnedProgress(f12);
                    a20Var.setScaleX(1.0f - (c20Var.f33995d0 * 0.6f));
                    a20Var.setScaleY(1.0f - (c20Var.f33995d0 * 0.6f));
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
                if (!this.f50625b) {
                    i11 = 4;
                }
                view.setVisibility(i11);
                return;
            case 13:
                org.telegram.ui.Components.a60 a60Var = (org.telegram.ui.Components.a60) obj;
                AnimatorSet animatorSet3 = a60Var.S1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f50625b) {
                        a60Var.T1.setVisibility(4);
                    }
                    a60Var.S1 = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.l60 l60Var = (org.telegram.ui.Components.l60) obj;
                boolean z11 = this.f50625b;
                if (!z11) {
                    f11 = 0.0f;
                }
                l60Var.f37116c2 = f11;
                l60Var.f30173b.invalidate();
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
                boolean z12 = this.f50625b;
                mk mkVar = (mk) wa0Var;
                org.telegram.messenger.jj jjVar = mkVar.I.f46251x5;
                if (jjVar != null) {
                    jjVar.f24912x = null;
                }
                if (z12) {
                    org.telegram.messenger.g0.h3(new lk(mkVar, 1), 15L);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.qa0 qa0Var = (org.telegram.ui.Components.qa0) obj;
                qa0Var.Q = null;
                qa0Var.h(this.f50625b, false);
                return;
            case 17:
                org.telegram.ui.Components.qc0 qc0Var = (org.telegram.ui.Components.qc0) obj;
                TextView textView = qc0Var.f38896x;
                bi.t2 t2Var = qc0Var.f38885e;
                if (this.f50625b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                t2Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                t2Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                t2Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, f10));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, f10));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, f10));
                qc0Var.f38894s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) obj;
                if (animator.equals(pipRoundVideoView.f33040r)) {
                    if (!this.f50625b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f33040r = null;
                    return;
                }
                return;
            case 19:
                boolean z13 = this.f50625b;
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
                    if (!this.f50625b) {
                        jt0Var.E0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.l01 l01Var = (org.telegram.ui.Components.l01) obj;
                if (!this.f50625b) {
                    f11 = 0.0f;
                }
                l01Var.N = f11;
                l01Var.invalidate();
                return;
            case 22:
                boolean z14 = this.f50625b;
                org.telegram.ui.Components.b21 b21Var = (org.telegram.ui.Components.b21) obj;
                long j3 = b21Var.f33712f;
                if (b21Var.f33711e0 == animator) {
                    if (!z14) {
                        f11 = 0.0f;
                    }
                    b21Var.V = f11;
                    b21Var.p();
                    b21Var.W = false;
                    ImageView imageView = b21Var.I;
                    int i12 = 2131231887;
                    if (b21Var.T) {
                        i7 = 2131231887;
                    } else {
                        i7 = 2131231884;
                    }
                    imageView.setImageResource(i7);
                    ImageView imageView2 = b21Var.H;
                    if (!b21Var.T) {
                        i12 = 2131231885;
                    }
                    imageView2.setImageResource(i12);
                    b21Var.f33711e0 = null;
                    org.telegram.messenger.mp.u1(b21Var.f33710e).h7.edit().putBoolean("topicssidetabs" + j3, b21Var.U).putBoolean("topicssidetabsb" + j3, b21Var.T).apply();
                    Boolean bool = b21Var.f33709d0;
                    if (bool != null && z14 != bool.booleanValue()) {
                        boolean booleanValue = b21Var.f33709d0.booleanValue();
                        b21Var.f33709d0 = null;
                        b21Var.d(booleanValue);
                    }
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Components.cp0(this, 20));
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Components.w11 w11Var = (org.telegram.ui.Components.w11) obj;
                if (!this.f50625b) {
                    f11 = 0.0f;
                }
                w11Var.G = f11;
                w11Var.h();
                return;
            case 24:
                org.telegram.ui.Components.a21 a21Var = (org.telegram.ui.Components.a21) obj;
                if (!this.f50625b) {
                    f11 = 0.0f;
                }
                a21Var.V = f11;
                a21Var.h();
                a21Var.g();
                return;
            case 25:
                org.telegram.ui.Components.n51 n51Var = (org.telegram.ui.Components.n51) obj;
                AnimatorSet animatorSet4 = n51Var.f37783o1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f50625b) {
                        n51Var.f37784p1.setVisibility(4);
                    }
                    n51Var.f37783o1 = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.r51 r51Var = (org.telegram.ui.Components.r51) obj;
                AnimatorSet animatorSet5 = r51Var.f39077t1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f50625b) {
                        r51Var.f39076s1.setVisibility(4);
                    }
                    r51Var.f39077t1 = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.voip.q2 q2Var = (org.telegram.ui.Components.voip.q2) obj;
                q2Var.f41305w = null;
                if (this.f50625b) {
                    TextView[] textViewArr = q2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!q2Var.H && (drawable = (drawableArr = q2Var.f41300e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                q2Var.H = false;
                if (!q2Var.P) {
                    q2Var.f41302n = q2Var.f41303r;
                }
                q2Var.f41304s = 0.0f;
                q2Var.invalidate();
                return;
            case 28:
                qr qrVar = (qr) obj;
                if (qrVar.f51341x != null && (radialProgressView2 = qrVar.f51339s) != null) {
                    if (!this.f50625b) {
                        radialProgressView2.setVisibility(4);
                        qrVar.f51340w.setVisibility(4);
                    }
                    qrVar.f51341x = null;
                    return;
                }
                return;
            default:
                ez ezVar = (ez) obj;
                if (!this.f50625b) {
                    f11 = 0.0f;
                }
                ezVar.f47422s = f11;
                ezVar.invalidate();
                return;
        }
    }

    public on(View view) {
        this.f50624a = 12;
        this.f50626c = view;
        this.f50625b = true;
    }

    public on(View view, boolean z10) {
        this.f50624a = 12;
        this.f50626c = view;
        this.f50625b = z10;
    }

    public on(org.telegram.ui.Components.io ioVar) {
        this.f50624a = 4;
        this.f50626c = ioVar;
    }
}
