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
    public final int f38328a;
    public boolean f38329b;
    public final Object f38330c;

    public t9(int i7, Object obj, boolean z9) {
        this.f38328a = i7;
        this.f38330c = obj;
        this.f38329b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38328a) {
            case 0:
                u9 u9Var = (u9) this.f38330c;
                AnimatorSet animatorSet = u9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    u9Var.h = null;
                    return;
                }
                return;
            case 2:
                ((di) this.f38330c).S2 = null;
                return;
            case 3:
                this.f38329b = true;
                return;
            case 8:
                gz gzVar = (gz) this.f38330c;
                AnimatorSet animatorSet2 = gzVar.f34101m1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    gzVar.f34101m1 = null;
                    return;
                }
                return;
            case 12:
                n50 n50Var = (n50) this.f38330c;
                AnimatorSet animatorSet3 = n50Var.O1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    n50Var.O1 = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f38330c;
                if (animator.equals(pipRoundVideoView.f31437r)) {
                    pipRoundVideoView.f31437r = null;
                    return;
                }
                return;
            case 19:
                ((zs0) this.f38330c).Q1 = null;
                return;
            case 24:
                y41 y41Var = (y41) this.f38330c;
                AnimatorSet animatorSet4 = y41Var.f40590k1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    y41Var.f40590k1 = null;
                    return;
                }
                return;
            case 25:
                c51 c51Var = (c51) this.f38330c;
                AnimatorSet animatorSet5 = c51Var.f32533p1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    c51Var.f32533p1 = null;
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.pr) this.f38330c).f48796x = null;
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
        int i10 = this.f38328a;
        int i11 = 8;
        float f11 = 1.0f;
        float f12 = 0.0f;
        Object obj = this.f38330c;
        switch (i10) {
            case 0:
                u9 u9Var = (u9) obj;
                AnimatorSet animatorSet = u9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f38329b) {
                        u9Var.f38648c.setVisibility(4);
                        return;
                    } else {
                        u9Var.f38647b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                ic icVar = (ic) obj;
                if (animator == icVar.f34701g) {
                    icVar.f34701g = null;
                    if (!this.f38329b) {
                        f11 = 0.0f;
                    }
                    icVar.f34703j = f11;
                    icVar.b();
                    return;
                }
                return;
            case 2:
                di diVar = (di) obj;
                if (diVar.S2 != null) {
                    if (this.f38329b) {
                        if (diVar.M2) {
                            vh vhVar = diVar.f33047s2;
                            if (vhVar == null || vhVar.M()) {
                                diVar.f33044r3.setVisibility(4);
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
                    if (diVar.K2 != 0 || !diVar.f33019k3) {
                        diVar.U2.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                pn pnVar = (pn) obj;
                if (!this.f38329b) {
                    l9 l9Var = pnVar.h;
                    pnVar.h = pnVar.f37052n;
                    pnVar.f37052n = l9Var;
                    l9Var.setVisibility(8);
                    pnVar.f37052n.setAlpha(0.0f);
                    pnVar.h.setVisibility(0);
                    pnVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z9 = this.f38329b;
                co coVar = (co) obj;
                if (animator == coVar.f32730e) {
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
                if (!this.f38329b) {
                    f11 = 0.0f;
                }
                voVar.W1 = f11;
                voVar.f39158z1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * voVar.W1);
                return;
            case 6:
                if (!this.f38329b) {
                    ((vp) obj).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                xu xuVar = (xu) obj;
                bv bvVar = xuVar.N;
                if (bvVar.U && !xuVar.h) {
                    if (!this.f38329b && !xuVar.f40504n) {
                        xuVar.setBackground(null);
                        return;
                    } else if (xuVar.getBackground() == null) {
                        xuVar.setBackground(org.telegram.ui.ActionBar.l6.a0(bvVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                gz gzVar = (gz) obj;
                AnimatorSet animatorSet2 = gzVar.f34101m1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f38329b) {
                        gzVar.n1.setVisibility(4);
                    }
                    gzVar.f34101m1 = null;
                    return;
                }
                return;
            case 9:
                sz szVar = (sz) obj;
                if (!this.f38329b) {
                    f11 = 0.0f;
                }
                szVar.f38192n = f11;
                szVar.invalidate();
                return;
            case 10:
                q10 q10Var = (q10) obj;
                n10 n10Var = q10Var.f37164a;
                if (!q10Var.G) {
                    if (this.f38329b) {
                        f12 = 1.0f;
                    }
                    q10Var.f37169c0 = f12;
                    q10Var.V.setPinnedProgress(f12);
                    n10Var.setScaleX(1.0f - (q10Var.f37169c0 * 0.6f));
                    n10Var.setScaleY(1.0f - (q10Var.f37169c0 * 0.6f));
                    if (q10Var.X) {
                        q10Var.j();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) obj;
                if (!this.f38329b) {
                    i11 = 4;
                }
                view.setVisibility(i11);
                return;
            case 12:
                n50 n50Var = (n50) obj;
                AnimatorSet animatorSet3 = n50Var.O1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f38329b) {
                        n50Var.P1.setVisibility(4);
                    }
                    n50Var.O1 = null;
                    return;
                }
                return;
            case 13:
                y50 y50Var = (y50) obj;
                boolean z10 = this.f38329b;
                if (!z10) {
                    f11 = 0.0f;
                }
                y50Var.Y1 = f11;
                y50Var.f28624b.invalidate();
                if (!z10) {
                    y50Var.M1.setVisibility(8);
                    return;
                }
                return;
            case 14:
                ja0 ja0Var = (ja0) obj;
                if (ja0Var.getParent() != null) {
                    ((ViewGroup) ja0Var.getParent()).removeView(ja0Var);
                }
                boolean z11 = this.f38329b;
                org.telegram.ui.nk nkVar = (org.telegram.ui.nk) ja0Var;
                org.telegram.messenger.mj mjVar = nkVar.H.f44653v5;
                if (mjVar != null) {
                    mjVar.f24050x = null;
                }
                if (z11) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.mk(nkVar, 1), 15L);
                    return;
                }
                return;
            case 15:
                da0 da0Var = (da0) obj;
                da0Var.P = null;
                da0Var.h(this.f38329b, false);
                return;
            case 16:
                fc0 fc0Var = (fc0) obj;
                TextView textView = fc0Var.f33635x;
                di.b4 b4Var = fc0Var.f33625e;
                if (this.f38329b) {
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
                fc0Var.f33633s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) obj;
                if (animator.equals(pipRoundVideoView.f31437r)) {
                    if (!this.f38329b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f31437r = null;
                    return;
                }
                return;
            case 18:
                boolean z12 = this.f38329b;
                rl0 rl0Var = (rl0) obj;
                if (animator == rl0Var.G) {
                    if (!z12) {
                        f11 = 0.0f;
                    }
                    rl0Var.F = f11;
                    rl0Var.setShown(f11);
                    if (!z12) {
                        rl0Var.setVisibility(8);
                    }
                    rl0Var.b(true);
                    return;
                }
                return;
            case 19:
                zs0 zs0Var = (zs0) obj;
                if (zs0Var.Q1 != null) {
                    zs0Var.Q1 = null;
                    if (!this.f38329b) {
                        zs0Var.D0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                a01 a01Var = (a01) obj;
                if (!this.f38329b) {
                    f11 = 0.0f;
                }
                a01Var.M = f11;
                a01Var.invalidate();
                return;
            case 21:
                boolean z13 = this.f38329b;
                n11 n11Var = (n11) obj;
                long j3 = n11Var.f36210f;
                if (n11Var.f36207d0 == animator) {
                    if (!z13) {
                        f11 = 0.0f;
                    }
                    n11Var.U = f11;
                    n11Var.p();
                    n11Var.V = false;
                    ImageView imageView = n11Var.H;
                    int i12 = 2131231886;
                    if (n11Var.S) {
                        i7 = 2131231886;
                    } else {
                        i7 = 2131231883;
                    }
                    imageView.setImageResource(i7);
                    ImageView imageView2 = n11Var.G;
                    if (!n11Var.S) {
                        i12 = 2131231884;
                    }
                    imageView2.setImageResource(i12);
                    n11Var.f36207d0 = null;
                    org.telegram.messenger.qp.s1(n11Var.f36208e).f24774e7.edit().putBoolean("topicssidetabs" + j3, n11Var.T).putBoolean("topicssidetabsb" + j3, n11Var.S).apply();
                    Boolean bool = n11Var.f36206c0;
                    if (bool != null && z13 != bool.booleanValue()) {
                        boolean booleanValue = n11Var.f36206c0.booleanValue();
                        n11Var.f36206c0 = null;
                        n11Var.d(booleanValue);
                    }
                    org.telegram.messenger.g0.h3(new kr0(this, 18));
                    return;
                }
                return;
            case 22:
                i11 i11Var = (i11) obj;
                if (!this.f38329b) {
                    f11 = 0.0f;
                }
                i11Var.F = f11;
                i11Var.h();
                return;
            case 23:
                m11 m11Var = (m11) obj;
                if (!this.f38329b) {
                    f11 = 0.0f;
                }
                m11Var.U = f11;
                m11Var.h();
                m11Var.g();
                return;
            case 24:
                y41 y41Var = (y41) obj;
                AnimatorSet animatorSet4 = y41Var.f40590k1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f38329b) {
                        y41Var.l1.setVisibility(4);
                    }
                    y41Var.f40590k1 = null;
                    return;
                }
                return;
            case 25:
                c51 c51Var = (c51) obj;
                AnimatorSet animatorSet5 = c51Var.f32533p1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f38329b) {
                        c51Var.f32532o1.setVisibility(4);
                    }
                    c51Var.f32533p1 = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) obj;
                n2Var.f39513w = null;
                if (this.f38329b) {
                    TextView[] textViewArr = n2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!n2Var.G && (drawable = (drawableArr = n2Var.f39508e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                n2Var.G = false;
                if (!n2Var.O) {
                    n2Var.f39510n = n2Var.f39511r;
                }
                n2Var.f39512s = 0.0f;
                n2Var.invalidate();
                return;
            case 27:
                org.telegram.ui.pr prVar = (org.telegram.ui.pr) obj;
                if (prVar.f48796x != null && (radialProgressView = prVar.f48794s) != null) {
                    if (!this.f38329b) {
                        radialProgressView.setVisibility(4);
                        prVar.f48795w.setVisibility(4);
                    }
                    prVar.f48796x = null;
                    return;
                }
                return;
            case 28:
                org.telegram.ui.cz czVar = (org.telegram.ui.cz) obj;
                if (!this.f38329b) {
                    f11 = 0.0f;
                }
                czVar.f44780s = f11;
                czVar.invalidate();
                return;
            default:
                org.telegram.ui.e40 e40Var = (org.telegram.ui.e40) obj;
                e40Var.L4 = null;
                org.telegram.ui.ActionBar.l5 subtitleTextView = e40Var.F1.getSubtitleTextView();
                if (!this.f38329b) {
                    f12 = org.telegram.messenger.g0.L(20.0f);
                }
                subtitleTextView.setTranslationY(f12);
                return;
        }
    }

    public t9(View view) {
        this.f38328a = 11;
        this.f38330c = view;
        this.f38329b = true;
    }

    public t9(View view, boolean z9) {
        this.f38328a = 11;
        this.f38330c = view;
        this.f38329b = z9;
    }

    public t9(pn pnVar) {
        this.f38328a = 3;
        this.f38330c = pnVar;
    }
}
