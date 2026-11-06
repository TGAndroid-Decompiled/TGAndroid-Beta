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
    public final int f38289a;
    public boolean f38290b;
    public final Object f38291c;

    public t9(int i7, Object obj, boolean z9) {
        this.f38289a = i7;
        this.f38291c = obj;
        this.f38290b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38289a) {
            case 0:
                u9 u9Var = (u9) this.f38291c;
                AnimatorSet animatorSet = u9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    u9Var.h = null;
                    return;
                }
                return;
            case 2:
                ((di) this.f38291c).S2 = null;
                return;
            case 3:
                this.f38290b = true;
                return;
            case 8:
                fz fzVar = (fz) this.f38291c;
                AnimatorSet animatorSet2 = fzVar.f33666m1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fzVar.f33666m1 = null;
                    return;
                }
                return;
            case 12:
                m50 m50Var = (m50) this.f38291c;
                AnimatorSet animatorSet3 = m50Var.O1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    m50Var.O1 = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f38291c;
                if (animator.equals(pipRoundVideoView.f31427r)) {
                    pipRoundVideoView.f31427r = null;
                    return;
                }
                return;
            case 19:
                ((xs0) this.f38291c).Q1 = null;
                return;
            case 24:
                w41 w41Var = (w41) this.f38291c;
                AnimatorSet animatorSet4 = w41Var.f39852k1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    w41Var.f39852k1 = null;
                    return;
                }
                return;
            case 25:
                a51 a51Var = (a51) this.f38291c;
                AnimatorSet animatorSet5 = a51Var.f31688p1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    a51Var.f31688p1 = null;
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.nr) this.f38291c).f48126x = null;
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
        int i10 = this.f38289a;
        int i11 = 8;
        float f11 = 1.0f;
        float f12 = 0.0f;
        Object obj = this.f38291c;
        switch (i10) {
            case 0:
                u9 u9Var = (u9) obj;
                AnimatorSet animatorSet = u9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f38290b) {
                        u9Var.f38556c.setVisibility(4);
                        return;
                    } else {
                        u9Var.f38555b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                ic icVar = (ic) obj;
                if (animator == icVar.f34554g) {
                    icVar.f34554g = null;
                    if (!this.f38290b) {
                        f11 = 0.0f;
                    }
                    icVar.f34556j = f11;
                    icVar.b();
                    return;
                }
                return;
            case 2:
                di diVar = (di) obj;
                if (diVar.S2 != null) {
                    if (this.f38290b) {
                        if (diVar.M2) {
                            vh vhVar = diVar.f32955s2;
                            if (vhVar == null || vhVar.M()) {
                                diVar.f32952r3.setVisibility(4);
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
                    if (diVar.K2 != 0 || !diVar.f32927k3) {
                        diVar.U2.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                pn pnVar = (pn) obj;
                if (!this.f38290b) {
                    l9 l9Var = pnVar.h;
                    pnVar.h = pnVar.f37006n;
                    pnVar.f37006n = l9Var;
                    l9Var.setVisibility(8);
                    pnVar.f37006n.setAlpha(0.0f);
                    pnVar.h.setVisibility(0);
                    pnVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z9 = this.f38290b;
                co coVar = (co) obj;
                if (animator == coVar.f32634e) {
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
                if (!this.f38290b) {
                    f11 = 0.0f;
                }
                voVar.W1 = f11;
                voVar.f39011z1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * voVar.W1);
                return;
            case 6:
                if (!this.f38290b) {
                    ((vp) obj).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                wu wuVar = (wu) obj;
                av avVar = wuVar.N;
                if (avVar.U && !wuVar.h) {
                    if (!this.f38290b && !wuVar.f40097n) {
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
                AnimatorSet animatorSet2 = fzVar.f33666m1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f38290b) {
                        fzVar.n1.setVisibility(4);
                    }
                    fzVar.f33666m1 = null;
                    return;
                }
                return;
            case 9:
                rz rzVar = (rz) obj;
                if (!this.f38290b) {
                    f11 = 0.0f;
                }
                rzVar.f37837n = f11;
                rzVar.invalidate();
                return;
            case 10:
                p10 p10Var = (p10) obj;
                n10 n10Var = p10Var.f36731a;
                if (!p10Var.G) {
                    if (this.f38290b) {
                        f12 = 1.0f;
                    }
                    p10Var.f36736c0 = f12;
                    p10Var.V.setPinnedProgress(f12);
                    n10Var.setScaleX(1.0f - (p10Var.f36736c0 * 0.6f));
                    n10Var.setScaleY(1.0f - (p10Var.f36736c0 * 0.6f));
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
                if (!this.f38290b) {
                    i11 = 4;
                }
                view.setVisibility(i11);
                return;
            case 12:
                m50 m50Var = (m50) obj;
                AnimatorSet animatorSet3 = m50Var.O1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f38290b) {
                        m50Var.P1.setVisibility(4);
                    }
                    m50Var.O1 = null;
                    return;
                }
                return;
            case 13:
                x50 x50Var = (x50) obj;
                boolean z10 = this.f38290b;
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
                boolean z11 = this.f38290b;
                org.telegram.ui.lk lkVar = (org.telegram.ui.lk) ia0Var;
                org.telegram.messenger.mj mjVar = lkVar.H.f43991v5;
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
                ca0Var.h(this.f38290b, false);
                return;
            case 16:
                ec0 ec0Var = (ec0) obj;
                TextView textView = ec0Var.f33211x;
                di.a4 a4Var = ec0Var.f33201e;
                if (this.f38290b) {
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
                ec0Var.f33209s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) obj;
                if (animator.equals(pipRoundVideoView.f31427r)) {
                    if (!this.f38290b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f31427r = null;
                    return;
                }
                return;
            case 18:
                boolean z12 = this.f38290b;
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
                    if (!this.f38290b) {
                        xs0Var.D0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                yz0 yz0Var = (yz0) obj;
                if (!this.f38290b) {
                    f11 = 0.0f;
                }
                yz0Var.M = f11;
                yz0Var.invalidate();
                return;
            case 21:
                boolean z13 = this.f38290b;
                l11 l11Var = (l11) obj;
                long j3 = l11Var.f35487f;
                if (l11Var.f35484d0 == animator) {
                    if (!z13) {
                        f11 = 0.0f;
                    }
                    l11Var.U = f11;
                    l11Var.p();
                    l11Var.V = false;
                    ImageView imageView = l11Var.H;
                    int i12 = 2131231886;
                    if (l11Var.S) {
                        i7 = 2131231886;
                    } else {
                        i7 = 2131231883;
                    }
                    imageView.setImageResource(i7);
                    ImageView imageView2 = l11Var.G;
                    if (!l11Var.S) {
                        i12 = 2131231884;
                    }
                    imageView2.setImageResource(i12);
                    l11Var.f35484d0 = null;
                    org.telegram.messenger.qp.s1(l11Var.f35485e).f24759e7.edit().putBoolean("topicssidetabs" + j3, l11Var.T).putBoolean("topicssidetabsb" + j3, l11Var.S).apply();
                    Boolean bool = l11Var.f35483c0;
                    if (bool != null && z13 != bool.booleanValue()) {
                        boolean booleanValue = l11Var.f35483c0.booleanValue();
                        l11Var.f35483c0 = null;
                        l11Var.d(booleanValue);
                    }
                    org.telegram.messenger.g0.h3(new ir0(this, 18));
                    return;
                }
                return;
            case 22:
                g11 g11Var = (g11) obj;
                if (!this.f38290b) {
                    f11 = 0.0f;
                }
                g11Var.F = f11;
                g11Var.h();
                return;
            case 23:
                k11 k11Var = (k11) obj;
                if (!this.f38290b) {
                    f11 = 0.0f;
                }
                k11Var.U = f11;
                k11Var.h();
                k11Var.g();
                return;
            case 24:
                w41 w41Var = (w41) obj;
                AnimatorSet animatorSet4 = w41Var.f39852k1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f38290b) {
                        w41Var.l1.setVisibility(4);
                    }
                    w41Var.f39852k1 = null;
                    return;
                }
                return;
            case 25:
                a51 a51Var = (a51) obj;
                AnimatorSet animatorSet5 = a51Var.f31688p1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f38290b) {
                        a51Var.f31687o1.setVisibility(4);
                    }
                    a51Var.f31688p1 = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) obj;
                n2Var.f39368w = null;
                if (this.f38290b) {
                    TextView[] textViewArr = n2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!n2Var.G && (drawable = (drawableArr = n2Var.f39363e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                n2Var.G = false;
                if (!n2Var.O) {
                    n2Var.f39365n = n2Var.f39366r;
                }
                n2Var.f39367s = 0.0f;
                n2Var.invalidate();
                return;
            case 27:
                org.telegram.ui.nr nrVar = (org.telegram.ui.nr) obj;
                if (nrVar.f48126x != null && (radialProgressView = nrVar.f48124s) != null) {
                    if (!this.f38290b) {
                        radialProgressView.setVisibility(4);
                        nrVar.f48125w.setVisibility(4);
                    }
                    nrVar.f48126x = null;
                    return;
                }
                return;
            case 28:
                org.telegram.ui.az azVar = (org.telegram.ui.az) obj;
                if (!this.f38290b) {
                    f11 = 0.0f;
                }
                azVar.f44130s = f11;
                azVar.invalidate();
                return;
            default:
                org.telegram.ui.c40 c40Var = (org.telegram.ui.c40) obj;
                c40Var.L4 = null;
                org.telegram.ui.ActionBar.k5 subtitleTextView = c40Var.F1.getSubtitleTextView();
                if (!this.f38290b) {
                    f12 = org.telegram.messenger.g0.L(20.0f);
                }
                subtitleTextView.setTranslationY(f12);
                return;
        }
    }

    public t9(View view) {
        this.f38289a = 11;
        this.f38291c = view;
        this.f38290b = true;
    }

    public t9(View view, boolean z9) {
        this.f38289a = 11;
        this.f38291c = view;
        this.f38290b = z9;
    }

    public t9(pn pnVar) {
        this.f38289a = 3;
        this.f38291c = pnVar;
    }
}
