package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
public final class t9 extends AnimatorListenerAdapter {
    public final int f38298a;
    public boolean f38299b;
    public final Object f38300c;

    public t9(int i7, Object obj, boolean z9) {
        this.f38298a = i7;
        this.f38300c = obj;
        this.f38299b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38298a) {
            case 0:
                u9 u9Var = (u9) this.f38300c;
                AnimatorSet animatorSet = u9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    u9Var.h = null;
                    return;
                }
                return;
            case 2:
                ((di) this.f38300c).S2 = null;
                return;
            case 3:
                this.f38299b = true;
                return;
            case 8:
                fz fzVar = (fz) this.f38300c;
                AnimatorSet animatorSet2 = fzVar.f33722m1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fzVar.f33722m1 = null;
                    return;
                }
                return;
            case 12:
                m50 m50Var = (m50) this.f38300c;
                AnimatorSet animatorSet3 = m50Var.O1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    m50Var.O1 = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f38300c;
                if (animator.equals(pipRoundVideoView.f31427r)) {
                    pipRoundVideoView.f31427r = null;
                    return;
                }
                return;
            case 19:
                ((xs0) this.f38300c).Q1 = null;
                return;
            case 24:
                r41 r41Var = (r41) this.f38300c;
                AnimatorSet animatorSet4 = r41Var.f37614k1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    r41Var.f37614k1 = null;
                    return;
                }
                return;
            case 25:
                w41 w41Var = (w41) this.f38300c;
                AnimatorSet animatorSet5 = w41Var.f39836p1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    w41Var.f39836p1 = null;
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.nr) this.f38300c).f48101x = null;
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
        int i10 = this.f38298a;
        int i11 = 8;
        float f11 = 1.0f;
        float f12 = 0.0f;
        Object obj = this.f38300c;
        switch (i10) {
            case 0:
                u9 u9Var = (u9) obj;
                AnimatorSet animatorSet = u9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f38299b) {
                        u9Var.f38565c.setVisibility(4);
                        return;
                    } else {
                        u9Var.f38564b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                ic icVar = (ic) obj;
                if (animator == icVar.f34591g) {
                    icVar.f34591g = null;
                    if (!this.f38299b) {
                        f11 = 0.0f;
                    }
                    icVar.f34593j = f11;
                    icVar.b();
                    return;
                }
                return;
            case 2:
                di diVar = (di) obj;
                if (diVar.S2 != null) {
                    if (this.f38299b) {
                        if (diVar.M2) {
                            vh vhVar = diVar.f32942s2;
                            if (vhVar == null || vhVar.M()) {
                                diVar.f32939r3.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.r0 r0Var = diVar.Y2;
                    if (r0Var != null) {
                        r0Var.setVisibility(4);
                    }
                    if (diVar.K2 != 0 || !diVar.f32914k3) {
                        diVar.U2.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                pn pnVar = (pn) obj;
                if (!this.f38299b) {
                    l9 l9Var = pnVar.h;
                    pnVar.h = pnVar.f37127n;
                    pnVar.f37127n = l9Var;
                    l9Var.setVisibility(8);
                    pnVar.f37127n.setAlpha(0.0f);
                    pnVar.h.setVisibility(0);
                    pnVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z9 = this.f38299b;
                co coVar = (co) obj;
                if (animator == coVar.f32630e) {
                    if (!z9) {
                        f11 = 0.0f;
                    }
                    coVar.d = f11;
                    coVar.setShown(f11);
                    if (!z9) {
                        coVar.setVisibility(8);
                    }
                    coVar.a(true);
                    return;
                }
                return;
            case 5:
                vo voVar = (vo) obj;
                if (!this.f38299b) {
                    f11 = 0.0f;
                }
                voVar.W1 = f11;
                voVar.f39014z1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * voVar.W1);
                return;
            case 6:
                if (!this.f38299b) {
                    ((vp) obj).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                wu wuVar = (wu) obj;
                av avVar = wuVar.N;
                if (avVar.U && !wuVar.h) {
                    if (!this.f38299b && !wuVar.f40090n) {
                        wuVar.setBackground(null);
                        return;
                    } else if (wuVar.getBackground() == null) {
                        wuVar.setBackground(org.telegram.ui.ActionBar.k6.a0(avVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                fz fzVar = (fz) obj;
                AnimatorSet animatorSet2 = fzVar.f33722m1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f38299b) {
                        fzVar.n1.setVisibility(4);
                    }
                    fzVar.f33722m1 = null;
                    return;
                }
                return;
            case 9:
                rz rzVar = (rz) obj;
                if (!this.f38299b) {
                    f11 = 0.0f;
                }
                rzVar.f37894n = f11;
                rzVar.invalidate();
                return;
            case 10:
                p10 p10Var = (p10) obj;
                n10 n10Var = p10Var.f36847a;
                if (!p10Var.G) {
                    if (this.f38299b) {
                        f12 = 1.0f;
                    }
                    p10Var.f36852c0 = f12;
                    p10Var.V.setPinnedProgress(f12);
                    n10Var.setScaleX(1.0f - (p10Var.f36852c0 * 0.6f));
                    n10Var.setScaleY(1.0f - (p10Var.f36852c0 * 0.6f));
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
                if (!this.f38299b) {
                    i11 = 4;
                }
                view.setVisibility(i11);
                return;
            case 12:
                m50 m50Var = (m50) obj;
                AnimatorSet animatorSet3 = m50Var.O1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f38299b) {
                        m50Var.P1.setVisibility(4);
                    }
                    m50Var.O1 = null;
                    return;
                }
                return;
            case 13:
                x50 x50Var = (x50) obj;
                boolean z10 = this.f38299b;
                if (!z10) {
                    f11 = 0.0f;
                }
                x50Var.Y1 = f11;
                x50Var.f28615b.invalidate();
                if (!z10) {
                    x50Var.M1.setVisibility(8);
                    return;
                }
                return;
            case 14:
                ia0 ia0Var = (ia0) obj;
                if (ia0Var.getParent() != null) {
                    ((ViewGroup) ia0Var.getParent()).removeView(ia0Var);
                }
                boolean z11 = this.f38299b;
                org.telegram.ui.lk lkVar = (org.telegram.ui.lk) ia0Var;
                org.telegram.messenger.mj mjVar = lkVar.H.f43966v5;
                if (mjVar != null) {
                    mjVar.f24038x = null;
                }
                if (z11) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.kk(lkVar, 1), 15L);
                    return;
                }
                return;
            case 15:
                ca0 ca0Var = (ca0) obj;
                ca0Var.P = null;
                ca0Var.h(this.f38299b, false);
                return;
            case 16:
                ec0 ec0Var = (ec0) obj;
                TextView textView = ec0Var.f33215x;
                di.a4 a4Var = ec0Var.f33205e;
                if (this.f38299b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                a4Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                a4Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                a4Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, f10));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, f10));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, f10));
                ec0Var.f33213s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) obj;
                if (animator.equals(pipRoundVideoView.f31427r)) {
                    if (!this.f38299b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f31427r = null;
                    return;
                }
                return;
            case 18:
                boolean z12 = this.f38299b;
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
                xs0 xs0Var = (xs0) obj;
                if (xs0Var.Q1 != null) {
                    xs0Var.Q1 = null;
                    if (!this.f38299b) {
                        xs0Var.D0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                yz0 yz0Var = (yz0) obj;
                if (!this.f38299b) {
                    f11 = 0.0f;
                }
                yz0Var.M = f11;
                yz0Var.invalidate();
                return;
            case 21:
                boolean z13 = this.f38299b;
                g11 g11Var = (g11) obj;
                long j3 = g11Var.f33788f;
                if (g11Var.f33785d0 == animator) {
                    if (!z13) {
                        f11 = 0.0f;
                    }
                    g11Var.U = f11;
                    g11Var.p();
                    g11Var.V = false;
                    ImageView imageView = g11Var.H;
                    int i12 = 2131231886;
                    if (g11Var.S) {
                        i7 = 2131231886;
                    } else {
                        i7 = 2131231883;
                    }
                    imageView.setImageResource(i7);
                    ImageView imageView2 = g11Var.G;
                    if (!g11Var.S) {
                        i12 = 2131231884;
                    }
                    imageView2.setImageResource(i12);
                    g11Var.f33785d0 = null;
                    org.telegram.messenger.qp.s1(g11Var.f33786e).f24759e7.edit().putBoolean("topicssidetabs" + j3, g11Var.T).putBoolean("topicssidetabsb" + j3, g11Var.S).apply();
                    Boolean bool = g11Var.f33784c0;
                    if (bool != null && z13 != bool.booleanValue()) {
                        boolean booleanValue = g11Var.f33784c0.booleanValue();
                        g11Var.f33784c0 = null;
                        g11Var.d(booleanValue);
                    }
                    org.telegram.messenger.g0.h3(new ir0(this, 17));
                    return;
                }
                return;
            case 22:
                b11 b11Var = (b11) obj;
                if (!this.f38299b) {
                    f11 = 0.0f;
                }
                b11Var.F = f11;
                b11Var.h();
                return;
            case 23:
                f11 f11Var = (f11) obj;
                if (!this.f38299b) {
                    f11 = 0.0f;
                }
                f11Var.U = f11;
                f11Var.h();
                f11Var.g();
                return;
            case 24:
                r41 r41Var = (r41) obj;
                AnimatorSet animatorSet4 = r41Var.f37614k1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f38299b) {
                        r41Var.l1.setVisibility(4);
                    }
                    r41Var.f37614k1 = null;
                    return;
                }
                return;
            case 25:
                w41 w41Var = (w41) obj;
                AnimatorSet animatorSet5 = w41Var.f39836p1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f38299b) {
                        w41Var.f39835o1.setVisibility(4);
                    }
                    w41Var.f39836p1 = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) obj;
                n2Var.f39371w = null;
                if (this.f38299b) {
                    TextView[] textViewArr = n2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!n2Var.G && (drawable = (drawableArr = n2Var.f39366e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                n2Var.G = false;
                if (!n2Var.O) {
                    n2Var.f39368n = n2Var.f39369r;
                }
                n2Var.f39370s = 0.0f;
                n2Var.invalidate();
                return;
            case 27:
                org.telegram.ui.nr nrVar = (org.telegram.ui.nr) obj;
                if (nrVar.f48101x != null && (radialProgressView = nrVar.f48099s) != null) {
                    if (!this.f38299b) {
                        radialProgressView.setVisibility(4);
                        nrVar.f48100w.setVisibility(4);
                    }
                    nrVar.f48101x = null;
                    return;
                }
                return;
            case 28:
                org.telegram.ui.az azVar = (org.telegram.ui.az) obj;
                if (!this.f38299b) {
                    f11 = 0.0f;
                }
                azVar.f44114s = f11;
                azVar.invalidate();
                return;
            default:
                org.telegram.ui.c40 c40Var = (org.telegram.ui.c40) obj;
                c40Var.L4 = null;
                org.telegram.ui.ActionBar.k5 subtitleTextView = c40Var.F1.getSubtitleTextView();
                if (!this.f38299b) {
                    f12 = org.telegram.messenger.g0.L(20.0f);
                }
                subtitleTextView.setTranslationY(f12);
                return;
        }
    }

    public t9(View view) {
        this.f38298a = 11;
        this.f38300c = view;
        this.f38299b = true;
    }

    public t9(View view, boolean z9) {
        this.f38298a = 11;
        this.f38300c = view;
        this.f38299b = z9;
    }

    public t9(pn pnVar) {
        this.f38298a = 3;
        this.f38300c = pnVar;
    }
}
