package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
public final class s9 extends AnimatorListenerAdapter {
    public final int f37902a;
    public boolean f37903b;
    public final Object f37904c;

    public s9(int i7, Object obj, boolean z9) {
        this.f37902a = i7;
        this.f37904c = obj;
        this.f37903b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37902a) {
            case 0:
                t9 t9Var = (t9) this.f37904c;
                AnimatorSet animatorSet = t9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    t9Var.h = null;
                    return;
                }
                return;
            case 2:
                ((ci) this.f37904c).V2 = null;
                return;
            case 3:
                this.f37903b = true;
                return;
            case 8:
                fz fzVar = (fz) this.f37904c;
                AnimatorSet animatorSet2 = fzVar.f33694p1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fzVar.f33694p1 = null;
                    return;
                }
                return;
            case 12:
                m50 m50Var = (m50) this.f37904c;
                AnimatorSet animatorSet3 = m50Var.R1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    m50Var.R1 = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f37904c;
                if (animator.equals(pipRoundVideoView.f31448r)) {
                    pipRoundVideoView.f31448r = null;
                    return;
                }
                return;
            case 19:
                ((ys0) this.f37904c).Q1 = null;
                return;
            case 24:
                y41 y41Var = (y41) this.f37904c;
                AnimatorSet animatorSet4 = y41Var.n1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    y41Var.n1 = null;
                    return;
                }
                return;
            case 25:
                c51 c51Var = (c51) this.f37904c;
                AnimatorSet animatorSet5 = c51Var.f32468s1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    c51Var.f32468s1 = null;
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.qr) this.f37904c).f49141x = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i7;
        Drawable[] drawableArr;
        Drawable drawable;
        RadialProgressView radialProgressView;
        int i10 = this.f37902a;
        int i11 = 8;
        float f11 = 1.0f;
        float f12 = 0.0f;
        Object obj = this.f37904c;
        switch (i10) {
            case 0:
                t9 t9Var = (t9) obj;
                AnimatorSet animatorSet = t9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f37903b) {
                        t9Var.f38236c.setVisibility(4);
                        return;
                    } else {
                        t9Var.f38235b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                hc hcVar = (hc) obj;
                if (animator == hcVar.f34301g) {
                    hcVar.f34301g = null;
                    if (!this.f37903b) {
                        f11 = 0.0f;
                    }
                    hcVar.f34303j = f11;
                    hcVar.b();
                    return;
                }
                return;
            case 2:
                ci ciVar = (ci) obj;
                if (ciVar.V2 != null) {
                    if (this.f37903b) {
                        if (ciVar.P2) {
                            uh uhVar = ciVar.f32660v2;
                            if (uhVar == null || uhVar.M()) {
                                ciVar.f32657u3.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.r0 r0Var = ciVar.f32595b3;
                    if (r0Var != null) {
                        r0Var.setVisibility(4);
                    }
                    if (ciVar.N2 != 0 || !ciVar.f32630n3) {
                        ciVar.X2.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                on onVar = (on) obj;
                if (!this.f37903b) {
                    k9 k9Var = onVar.h;
                    onVar.h = onVar.f36646n;
                    onVar.f36646n = k9Var;
                    k9Var.setVisibility(8);
                    onVar.f36646n.setAlpha(0.0f);
                    onVar.h.setVisibility(0);
                    onVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z9 = this.f37903b;
                bo boVar = (bo) obj;
                if (animator == boVar.f32305e) {
                    if (!z9) {
                        f11 = 0.0f;
                    }
                    boVar.d = f11;
                    boVar.setShown(f11);
                    if (!z9) {
                        boVar.setVisibility(8);
                    }
                    boVar.a(true);
                    return;
                }
                return;
            case 5:
                vo voVar = (vo) obj;
                if (!this.f37903b) {
                    f11 = 0.0f;
                }
                voVar.Z1 = f11;
                voVar.C1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * voVar.Z1);
                return;
            case 6:
                if (!this.f37903b) {
                    ((vp) obj).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                wu wuVar = (wu) obj;
                av avVar = wuVar.N;
                if (avVar.U && !wuVar.h) {
                    if (!this.f37903b && !wuVar.f40092n) {
                        wuVar.setBackground(null);
                        return;
                    } else if (wuVar.getBackground() == null) {
                        wuVar.setBackground(org.telegram.ui.ActionBar.m6.a0(avVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                fz fzVar = (fz) obj;
                AnimatorSet animatorSet2 = fzVar.f33694p1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f37903b) {
                        fzVar.f33695q1.setVisibility(4);
                    }
                    fzVar.f33694p1 = null;
                    return;
                }
                return;
            case 9:
                rz rzVar = (rz) obj;
                if (!this.f37903b) {
                    f11 = 0.0f;
                }
                rzVar.f37776n = f11;
                rzVar.invalidate();
                return;
            case 10:
                p10 p10Var = (p10) obj;
                m10 m10Var = p10Var.f36763a;
                if (!p10Var.G) {
                    if (this.f37903b) {
                        f12 = 1.0f;
                    }
                    p10Var.f36768c0 = f12;
                    p10Var.V.setPinnedProgress(f12);
                    m10Var.setScaleX(1.0f - (p10Var.f36768c0 * 0.6f));
                    m10Var.setScaleY(1.0f - (p10Var.f36768c0 * 0.6f));
                    if (p10Var.X) {
                        p10Var.j();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) obj;
                if (!this.f37903b) {
                    i11 = 4;
                }
                view.setVisibility(i11);
                return;
            case 12:
                m50 m50Var = (m50) obj;
                AnimatorSet animatorSet3 = m50Var.R1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f37903b) {
                        m50Var.S1.setVisibility(4);
                    }
                    m50Var.R1 = null;
                    return;
                }
                return;
            case 13:
                x50 x50Var = (x50) obj;
                boolean z10 = this.f37903b;
                if (!z10) {
                    f11 = 0.0f;
                }
                x50Var.f40185b2 = f11;
                x50Var.f28672b.invalidate();
                if (!z10) {
                    x50Var.P1.setVisibility(8);
                    return;
                }
                return;
            case 14:
                ia0 ia0Var = (ia0) obj;
                if (ia0Var.getParent() != null) {
                    ((ViewGroup) ia0Var.getParent()).removeView(ia0Var);
                }
                boolean z11 = this.f37903b;
                org.telegram.ui.nk nkVar = (org.telegram.ui.nk) ia0Var;
                org.telegram.messenger.mj mjVar = nkVar.H.f44694v5;
                if (mjVar != null) {
                    mjVar.f24054x = null;
                }
                if (z11) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.mk(nkVar, 1), 15L);
                    return;
                }
                return;
            case 15:
                ca0 ca0Var = (ca0) obj;
                ca0Var.P = null;
                ca0Var.h(this.f37903b, false);
                return;
            case 16:
                ec0 ec0Var = (ec0) obj;
                TextView textView = ec0Var.f33221x;
                di.b4 b4Var = ec0Var.f33211e;
                if (this.f37903b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                b4Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                b4Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                b4Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, f10));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, f10));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, f10));
                ec0Var.f33219s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) obj;
                if (animator.equals(pipRoundVideoView.f31448r)) {
                    if (!this.f37903b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f31448r = null;
                    return;
                }
                return;
            case 18:
                boolean z12 = this.f37903b;
                ql0 ql0Var = (ql0) obj;
                if (animator == ql0Var.G) {
                    if (!z12) {
                        f11 = 0.0f;
                    }
                    ql0Var.F = f11;
                    ql0Var.setShown(f11);
                    if (!z12) {
                        ql0Var.setVisibility(8);
                    }
                    ql0Var.b(true);
                    return;
                }
                return;
            case 19:
                ys0 ys0Var = (ys0) obj;
                if (ys0Var.Q1 != null) {
                    ys0Var.Q1 = null;
                    if (!this.f37903b) {
                        ys0Var.D0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                zz0 zz0Var = (zz0) obj;
                if (!this.f37903b) {
                    f11 = 0.0f;
                }
                zz0Var.M = f11;
                zz0Var.invalidate();
                return;
            case 21:
                boolean z13 = this.f37903b;
                m11 m11Var = (m11) obj;
                long j3 = m11Var.f35803f;
                if (m11Var.f35800d0 == animator) {
                    if (!z13) {
                        f11 = 0.0f;
                    }
                    m11Var.U = f11;
                    m11Var.p();
                    m11Var.V = false;
                    ImageView imageView = m11Var.H;
                    int i12 = 2131231886;
                    if (m11Var.S) {
                        i7 = 2131231886;
                    } else {
                        i7 = 2131231883;
                    }
                    imageView.setImageResource(i7);
                    ImageView imageView2 = m11Var.G;
                    if (!m11Var.S) {
                        i12 = 2131231884;
                    }
                    imageView2.setImageResource(i12);
                    m11Var.f35800d0 = null;
                    org.telegram.messenger.qp.s1(m11Var.f35801e).f24778e7.edit().putBoolean("topicssidetabs" + j3, m11Var.T).putBoolean("topicssidetabsb" + j3, m11Var.S).apply();
                    Boolean bool = m11Var.f35799c0;
                    if (bool != null && z13 != bool.booleanValue()) {
                        boolean booleanValue = m11Var.f35799c0.booleanValue();
                        m11Var.f35799c0 = null;
                        m11Var.d(booleanValue);
                    }
                    org.telegram.messenger.g0.h3(new jr0(this, 18));
                    return;
                }
                return;
            case 22:
                h11 h11Var = (h11) obj;
                if (!this.f37903b) {
                    f11 = 0.0f;
                }
                h11Var.F = f11;
                h11Var.h();
                return;
            case 23:
                l11 l11Var = (l11) obj;
                if (!this.f37903b) {
                    f11 = 0.0f;
                }
                l11Var.U = f11;
                l11Var.h();
                l11Var.g();
                return;
            case 24:
                y41 y41Var = (y41) obj;
                AnimatorSet animatorSet4 = y41Var.n1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f37903b) {
                        y41Var.f40500o1.setVisibility(4);
                    }
                    y41Var.n1 = null;
                    return;
                }
                return;
            case 25:
                c51 c51Var = (c51) obj;
                AnimatorSet animatorSet5 = c51Var.f32468s1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f37903b) {
                        c51Var.f32467r1.setVisibility(4);
                    }
                    c51Var.f32468s1 = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) obj;
                n2Var.f39433w = null;
                if (this.f37903b) {
                    TextView[] textViewArr = n2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!n2Var.G && (drawable = (drawableArr = n2Var.f39428e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                n2Var.G = false;
                if (!n2Var.O) {
                    n2Var.f39430n = n2Var.f39431r;
                }
                n2Var.f39432s = 0.0f;
                n2Var.invalidate();
                return;
            case 27:
                org.telegram.ui.qr qrVar = (org.telegram.ui.qr) obj;
                if (qrVar.f49141x != null && (radialProgressView = qrVar.f49139s) != null) {
                    if (!this.f37903b) {
                        radialProgressView.setVisibility(4);
                        qrVar.f49140w.setVisibility(4);
                    }
                    qrVar.f49141x = null;
                    return;
                }
                return;
            case 28:
                org.telegram.ui.dz dzVar = (org.telegram.ui.dz) obj;
                if (!this.f37903b) {
                    f11 = 0.0f;
                }
                dzVar.f45078s = f11;
                dzVar.invalidate();
                return;
            default:
                org.telegram.ui.f40 f40Var = (org.telegram.ui.f40) obj;
                f40Var.O4 = null;
                org.telegram.ui.ActionBar.m5 subtitleTextView = f40Var.I1.getSubtitleTextView();
                if (!this.f37903b) {
                    f12 = org.telegram.messenger.g0.L(20.0f);
                }
                subtitleTextView.setTranslationY(f12);
                return;
        }
    }

    public s9(View view) {
        this.f37902a = 11;
        this.f37904c = view;
        this.f37903b = true;
    }

    public s9(View view, boolean z9) {
        this.f37902a = 11;
        this.f37904c = view;
        this.f37903b = z9;
    }

    public s9(on onVar) {
        this.f37902a = 3;
        this.f37904c = onVar;
    }
}
