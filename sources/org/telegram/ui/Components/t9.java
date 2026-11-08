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
    public final int f38306a;
    public boolean f38307b;
    public final Object f38308c;

    public t9(int i7, Object obj, boolean z9) {
        this.f38306a = i7;
        this.f38308c = obj;
        this.f38307b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38306a) {
            case 0:
                u9 u9Var = (u9) this.f38308c;
                AnimatorSet animatorSet = u9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    u9Var.h = null;
                    return;
                }
                return;
            case 2:
                ((di) this.f38308c).S2 = null;
                return;
            case 3:
                this.f38307b = true;
                return;
            case 8:
                gz gzVar = (gz) this.f38308c;
                AnimatorSet animatorSet2 = gzVar.f34047m1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    gzVar.f34047m1 = null;
                    return;
                }
                return;
            case 12:
                m50 m50Var = (m50) this.f38308c;
                AnimatorSet animatorSet3 = m50Var.O1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    m50Var.O1 = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f38308c;
                if (animator.equals(pipRoundVideoView.f31432r)) {
                    pipRoundVideoView.f31432r = null;
                    return;
                }
                return;
            case 19:
                ((xs0) this.f38308c).Q1 = null;
                return;
            case 24:
                x41 x41Var = (x41) this.f38308c;
                AnimatorSet animatorSet4 = x41Var.f40205k1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    x41Var.f40205k1 = null;
                    return;
                }
                return;
            case 25:
                b51 b51Var = (b51) this.f38308c;
                AnimatorSet animatorSet5 = b51Var.f32046p1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    b51Var.f32046p1 = null;
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.nr) this.f38308c).f48125x = null;
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
        int i10 = this.f38306a;
        int i11 = 8;
        float f11 = 1.0f;
        float f12 = 0.0f;
        Object obj = this.f38308c;
        switch (i10) {
            case 0:
                u9 u9Var = (u9) obj;
                AnimatorSet animatorSet = u9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f38307b) {
                        u9Var.f38567c.setVisibility(4);
                        return;
                    } else {
                        u9Var.f38566b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                ic icVar = (ic) obj;
                if (animator == icVar.f34628g) {
                    icVar.f34628g = null;
                    if (!this.f38307b) {
                        f11 = 0.0f;
                    }
                    icVar.f34630j = f11;
                    icVar.b();
                    return;
                }
                return;
            case 2:
                di diVar = (di) obj;
                if (diVar.S2 != null) {
                    if (this.f38307b) {
                        if (diVar.M2) {
                            vh vhVar = diVar.f32992s2;
                            if (vhVar == null || vhVar.M()) {
                                diVar.f32989r3.setVisibility(4);
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
                    if (diVar.K2 != 0 || !diVar.f32964k3) {
                        diVar.U2.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                pn pnVar = (pn) obj;
                if (!this.f38307b) {
                    l9 l9Var = pnVar.h;
                    pnVar.h = pnVar.f37048n;
                    pnVar.f37048n = l9Var;
                    l9Var.setVisibility(8);
                    pnVar.f37048n.setAlpha(0.0f);
                    pnVar.h.setVisibility(0);
                    pnVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z9 = this.f38307b;
                co coVar = (co) obj;
                if (animator == coVar.f32652e) {
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
                if (!this.f38307b) {
                    f11 = 0.0f;
                }
                voVar.W1 = f11;
                voVar.f39067z1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * voVar.W1);
                return;
            case 6:
                if (!this.f38307b) {
                    ((vp) obj).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                xu xuVar = (xu) obj;
                bv bvVar = xuVar.N;
                if (bvVar.U && !xuVar.h) {
                    if (!this.f38307b && !xuVar.f40485n) {
                        xuVar.setBackground(null);
                        return;
                    } else if (xuVar.getBackground() == null) {
                        xuVar.setBackground(org.telegram.ui.ActionBar.k6.a0(bvVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                gz gzVar = (gz) obj;
                AnimatorSet animatorSet2 = gzVar.f34047m1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f38307b) {
                        gzVar.n1.setVisibility(4);
                    }
                    gzVar.f34047m1 = null;
                    return;
                }
                return;
            case 9:
                sz szVar = (sz) obj;
                if (!this.f38307b) {
                    f11 = 0.0f;
                }
                szVar.f38181n = f11;
                szVar.invalidate();
                return;
            case 10:
                p10 p10Var = (p10) obj;
                n10 n10Var = p10Var.f36764a;
                if (!p10Var.G) {
                    if (this.f38307b) {
                        f12 = 1.0f;
                    }
                    p10Var.f36769c0 = f12;
                    p10Var.V.setPinnedProgress(f12);
                    n10Var.setScaleX(1.0f - (p10Var.f36769c0 * 0.6f));
                    n10Var.setScaleY(1.0f - (p10Var.f36769c0 * 0.6f));
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
                if (!this.f38307b) {
                    i11 = 4;
                }
                view.setVisibility(i11);
                return;
            case 12:
                m50 m50Var = (m50) obj;
                AnimatorSet animatorSet3 = m50Var.O1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f38307b) {
                        m50Var.P1.setVisibility(4);
                    }
                    m50Var.O1 = null;
                    return;
                }
                return;
            case 13:
                x50 x50Var = (x50) obj;
                boolean z10 = this.f38307b;
                if (!z10) {
                    f11 = 0.0f;
                }
                x50Var.Y1 = f11;
                x50Var.f28619b.invalidate();
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
                boolean z11 = this.f38307b;
                org.telegram.ui.lk lkVar = (org.telegram.ui.lk) ia0Var;
                org.telegram.messenger.mj mjVar = lkVar.H.f43996v5;
                if (mjVar != null) {
                    mjVar.f24050x = null;
                }
                if (z11) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.kk(lkVar, 1), 15L);
                    return;
                }
                return;
            case 15:
                ca0 ca0Var = (ca0) obj;
                ca0Var.P = null;
                ca0Var.h(this.f38307b, false);
                return;
            case 16:
                ec0 ec0Var = (ec0) obj;
                TextView textView = ec0Var.f33261x;
                di.a4 a4Var = ec0Var.f33251e;
                if (this.f38307b) {
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
                ec0Var.f33259s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) obj;
                if (animator.equals(pipRoundVideoView.f31432r)) {
                    if (!this.f38307b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f31432r = null;
                    return;
                }
                return;
            case 18:
                boolean z12 = this.f38307b;
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
                    if (!this.f38307b) {
                        xs0Var.D0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                zz0 zz0Var = (zz0) obj;
                if (!this.f38307b) {
                    f11 = 0.0f;
                }
                zz0Var.M = f11;
                zz0Var.invalidate();
                return;
            case 21:
                boolean z13 = this.f38307b;
                m11 m11Var = (m11) obj;
                long j3 = m11Var.f35852f;
                if (m11Var.f35849d0 == animator) {
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
                    m11Var.f35849d0 = null;
                    org.telegram.messenger.qp.s1(m11Var.f35850e).f24774e7.edit().putBoolean("topicssidetabs" + j3, m11Var.T).putBoolean("topicssidetabsb" + j3, m11Var.S).apply();
                    Boolean bool = m11Var.f35848c0;
                    if (bool != null && z13 != bool.booleanValue()) {
                        boolean booleanValue = m11Var.f35848c0.booleanValue();
                        m11Var.f35848c0 = null;
                        m11Var.d(booleanValue);
                    }
                    org.telegram.messenger.g0.h3(new ir0(this, 18));
                    return;
                }
                return;
            case 22:
                h11 h11Var = (h11) obj;
                if (!this.f38307b) {
                    f11 = 0.0f;
                }
                h11Var.F = f11;
                h11Var.h();
                return;
            case 23:
                l11 l11Var = (l11) obj;
                if (!this.f38307b) {
                    f11 = 0.0f;
                }
                l11Var.U = f11;
                l11Var.h();
                l11Var.g();
                return;
            case 24:
                x41 x41Var = (x41) obj;
                AnimatorSet animatorSet4 = x41Var.f40205k1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f38307b) {
                        x41Var.l1.setVisibility(4);
                    }
                    x41Var.f40205k1 = null;
                    return;
                }
                return;
            case 25:
                b51 b51Var = (b51) obj;
                AnimatorSet animatorSet5 = b51Var.f32046p1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f38307b) {
                        b51Var.f32045o1.setVisibility(4);
                    }
                    b51Var.f32046p1 = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) obj;
                n2Var.f39424w = null;
                if (this.f38307b) {
                    TextView[] textViewArr = n2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!n2Var.G && (drawable = (drawableArr = n2Var.f39419e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                n2Var.G = false;
                if (!n2Var.O) {
                    n2Var.f39421n = n2Var.f39422r;
                }
                n2Var.f39423s = 0.0f;
                n2Var.invalidate();
                return;
            case 27:
                org.telegram.ui.nr nrVar = (org.telegram.ui.nr) obj;
                if (nrVar.f48125x != null && (radialProgressView = nrVar.f48123s) != null) {
                    if (!this.f38307b) {
                        radialProgressView.setVisibility(4);
                        nrVar.f48124w.setVisibility(4);
                    }
                    nrVar.f48125x = null;
                    return;
                }
                return;
            case 28:
                org.telegram.ui.az azVar = (org.telegram.ui.az) obj;
                if (!this.f38307b) {
                    f11 = 0.0f;
                }
                azVar.f44135s = f11;
                azVar.invalidate();
                return;
            default:
                org.telegram.ui.c40 c40Var = (org.telegram.ui.c40) obj;
                c40Var.L4 = null;
                org.telegram.ui.ActionBar.k5 subtitleTextView = c40Var.F1.getSubtitleTextView();
                if (!this.f38307b) {
                    f12 = org.telegram.messenger.g0.L(20.0f);
                }
                subtitleTextView.setTranslationY(f12);
                return;
        }
    }

    public t9(View view) {
        this.f38306a = 11;
        this.f38308c = view;
        this.f38307b = true;
    }

    public t9(View view, boolean z9) {
        this.f38306a = 11;
        this.f38308c = view;
        this.f38307b = z9;
    }

    public t9(pn pnVar) {
        this.f38306a = 3;
        this.f38308c = pnVar;
    }
}
