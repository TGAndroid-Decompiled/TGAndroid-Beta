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
    public final int f37950a;
    public boolean f37951b;
    public final Object f37952c;

    public s9(int i3, Object obj, boolean z10) {
        this.f37950a = i3;
        this.f37952c = obj;
        this.f37951b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37950a) {
            case 0:
                t9 t9Var = (t9) this.f37952c;
                AnimatorSet animatorSet = t9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    t9Var.h = null;
                    return;
                }
                return;
            case 2:
                ((bi) this.f37952c).T2 = null;
                return;
            case 3:
                this.f37951b = true;
                return;
            case 8:
                cz czVar = (cz) this.f37952c;
                AnimatorSet animatorSet2 = czVar.f32860n1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    czVar.f32860n1 = null;
                    return;
                }
                return;
            case 12:
                i50 i50Var = (i50) this.f37952c;
                AnimatorSet animatorSet3 = i50Var.P1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    i50Var.P1 = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f37952c;
                if (animator.equals(pipRoundVideoView.f31503r)) {
                    pipRoundVideoView.f31503r = null;
                    return;
                }
                return;
            case 19:
                ((ws0) this.f37952c).R1 = null;
                return;
            case 24:
                r41 r41Var = (r41) this.f37952c;
                AnimatorSet animatorSet4 = r41Var.f37648l1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    r41Var.f37648l1 = null;
                    return;
                }
                return;
            case 25:
                v41 v41Var = (v41) this.f37952c;
                AnimatorSet animatorSet5 = v41Var.f38998q1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    v41Var.f38998q1 = null;
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.lr) this.f37952c).f47424x = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i3;
        Drawable[] drawableArr;
        Drawable drawable;
        RadialProgressView radialProgressView;
        int i10 = this.f37950a;
        int i11 = 8;
        float f11 = 1.0f;
        float f12 = 0.0f;
        Object obj = this.f37952c;
        switch (i10) {
            case 0:
                t9 t9Var = (t9) obj;
                AnimatorSet animatorSet = t9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f37951b) {
                        t9Var.f38355c.setVisibility(4);
                        return;
                    } else {
                        t9Var.f38354b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                gc gcVar = (gc) obj;
                if (animator == gcVar.f34048g) {
                    gcVar.f34048g = null;
                    if (!this.f37951b) {
                        f11 = 0.0f;
                    }
                    gcVar.f34050j = f11;
                    gcVar.b();
                    return;
                }
                return;
            case 2:
                bi biVar = (bi) obj;
                if (biVar.T2 != null) {
                    if (this.f37951b) {
                        if (biVar.N2) {
                            th thVar = biVar.f32275t2;
                            if (thVar == null || thVar.M()) {
                                biVar.f32272s3.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.q0 q0Var = biVar.Z2;
                    if (q0Var != null) {
                        q0Var.setVisibility(4);
                    }
                    if (biVar.L2 != 0 || !biVar.f32246l3) {
                        biVar.V2.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                on onVar = (on) obj;
                if (!this.f37951b) {
                    k9 k9Var = onVar.h;
                    onVar.h = onVar.f36864n;
                    onVar.f36864n = k9Var;
                    k9Var.setVisibility(8);
                    onVar.f36864n.setAlpha(0.0f);
                    onVar.h.setVisibility(0);
                    onVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z10 = this.f37951b;
                bo boVar = (bo) obj;
                if (animator == boVar.f32333e) {
                    if (!z10) {
                        f11 = 0.0f;
                    }
                    boVar.d = f11;
                    boVar.setShown(f11);
                    if (!z10) {
                        boVar.setVisibility(8);
                    }
                    boVar.a(true);
                    return;
                }
                return;
            case 5:
                vo voVar = (vo) obj;
                if (!this.f37951b) {
                    f11 = 0.0f;
                }
                voVar.X1 = f11;
                voVar.A1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * voVar.X1);
                return;
            case 6:
                if (!this.f37951b) {
                    ((vp) obj).I.setVisibility(8);
                    return;
                }
                return;
            case 7:
                vu vuVar = (vu) obj;
                zu zuVar = vuVar.O;
                if (zuVar.V && !vuVar.h) {
                    if (!this.f37951b && !vuVar.f39800n) {
                        vuVar.setBackground(null);
                        return;
                    } else if (vuVar.getBackground() == null) {
                        vuVar.setBackground(org.telegram.ui.ActionBar.k6.a0(zuVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                cz czVar = (cz) obj;
                AnimatorSet animatorSet2 = czVar.f32860n1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f37951b) {
                        czVar.f32861o1.setVisibility(4);
                    }
                    czVar.f32860n1 = null;
                    return;
                }
                return;
            case 9:
                nz nzVar = (nz) obj;
                if (!this.f37951b) {
                    f11 = 0.0f;
                }
                nzVar.f36657n = f11;
                nzVar.invalidate();
                return;
            case 10:
                l10 l10Var = (l10) obj;
                j10 j10Var = l10Var.f35547a;
                if (!l10Var.G) {
                    if (this.f37951b) {
                        f12 = 1.0f;
                    }
                    l10Var.f35552c0 = f12;
                    l10Var.V.setPinnedProgress(f12);
                    j10Var.setScaleX(1.0f - (l10Var.f35552c0 * 0.6f));
                    j10Var.setScaleY(1.0f - (l10Var.f35552c0 * 0.6f));
                    if (l10Var.X) {
                        l10Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) obj;
                if (!this.f37951b) {
                    i11 = 4;
                }
                view.setVisibility(i11);
                return;
            case 12:
                i50 i50Var = (i50) obj;
                AnimatorSet animatorSet3 = i50Var.P1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f37951b) {
                        i50Var.Q1.setVisibility(4);
                    }
                    i50Var.P1 = null;
                    return;
                }
                return;
            case 13:
                t50 t50Var = (t50) obj;
                boolean z11 = this.f37951b;
                if (!z11) {
                    f11 = 0.0f;
                }
                t50Var.Z1 = f11;
                t50Var.f28586b.invalidate();
                if (!z11) {
                    t50Var.N1.setVisibility(8);
                    return;
                }
                return;
            case 14:
                da0 da0Var = (da0) obj;
                if (da0Var.getParent() != null) {
                    ((ViewGroup) da0Var.getParent()).removeView(da0Var);
                }
                boolean z12 = this.f37951b;
                org.telegram.ui.hk hkVar = (org.telegram.ui.hk) da0Var;
                org.telegram.messenger.dj djVar = hkVar.I.f51526w5;
                if (djVar != null) {
                    djVar.f22217x = null;
                }
                if (z12) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.gk(hkVar, 1), 15L);
                    return;
                }
                return;
            case 15:
                x90 x90Var = (x90) obj;
                x90Var.Q = null;
                x90Var.h(this.f37951b, false);
                return;
            case 16:
                zb0 zb0Var = (zb0) obj;
                TextView textView = zb0Var.f41016x;
                ai.d2 d2Var = zb0Var.f41005e;
                if (this.f37951b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                d2Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                d2Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                d2Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, f10));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, f10));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, f10));
                zb0Var.f41014s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) obj;
                if (animator.equals(pipRoundVideoView.f31503r)) {
                    if (!this.f37951b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f31503r = null;
                    return;
                }
                return;
            case 18:
                boolean z13 = this.f37951b;
                tl0 tl0Var = (tl0) obj;
                if (animator == tl0Var.H) {
                    if (!z13) {
                        f11 = 0.0f;
                    }
                    tl0Var.G = f11;
                    tl0Var.setShown(f11);
                    if (!z13) {
                        tl0Var.setVisibility(8);
                    }
                    tl0Var.b(true);
                    return;
                }
                return;
            case 19:
                ws0 ws0Var = (ws0) obj;
                if (ws0Var.R1 != null) {
                    ws0Var.R1 = null;
                    if (!this.f37951b) {
                        ws0Var.E0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                yz0 yz0Var = (yz0) obj;
                if (!this.f37951b) {
                    f11 = 0.0f;
                }
                yz0Var.N = f11;
                yz0Var.invalidate();
                return;
            case 21:
                boolean z14 = this.f37951b;
                g11 g11Var = (g11) obj;
                long j10 = g11Var.f33927f;
                if (g11Var.f33926e0 == animator) {
                    if (!z14) {
                        f11 = 0.0f;
                    }
                    g11Var.V = f11;
                    g11Var.p();
                    g11Var.W = false;
                    ImageView imageView = g11Var.I;
                    int i12 = 2131231886;
                    if (g11Var.T) {
                        i3 = 2131231886;
                    } else {
                        i3 = 2131231883;
                    }
                    imageView.setImageResource(i3);
                    ImageView imageView2 = g11Var.H;
                    if (!g11Var.T) {
                        i12 = 2131231884;
                    }
                    imageView2.setImageResource(i12);
                    g11Var.f33926e0 = null;
                    org.telegram.messenger.hp.s1(g11Var.f33925e).f22999e7.edit().putBoolean("topicssidetabs" + j10, g11Var.U).putBoolean("topicssidetabsb" + j10, g11Var.T).apply();
                    Boolean bool = g11Var.f33924d0;
                    if (bool != null && z14 != bool.booleanValue()) {
                        boolean booleanValue = g11Var.f33924d0.booleanValue();
                        g11Var.f33924d0 = null;
                        g11Var.d(booleanValue);
                    }
                    org.telegram.messenger.g0.h3(new sp0(this, 19));
                    return;
                }
                return;
            case 22:
                b11 b11Var = (b11) obj;
                if (!this.f37951b) {
                    f11 = 0.0f;
                }
                b11Var.G = f11;
                b11Var.h();
                return;
            case 23:
                f11 f11Var = (f11) obj;
                if (!this.f37951b) {
                    f11 = 0.0f;
                }
                f11Var.V = f11;
                f11Var.h();
                f11Var.g();
                return;
            case 24:
                r41 r41Var = (r41) obj;
                AnimatorSet animatorSet4 = r41Var.f37648l1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f37951b) {
                        r41Var.m1.setVisibility(4);
                    }
                    r41Var.f37648l1 = null;
                    return;
                }
                return;
            case 25:
                v41 v41Var = (v41) obj;
                AnimatorSet animatorSet5 = v41Var.f38998q1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f37951b) {
                        v41Var.f38997p1.setVisibility(4);
                    }
                    v41Var.f38998q1 = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.c2 c2Var = (org.telegram.ui.Components.voip.c2) obj;
                c2Var.f39281w = null;
                if (this.f37951b) {
                    TextView[] textViewArr = c2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!c2Var.H && (drawable = (drawableArr = c2Var.f39276e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                c2Var.H = false;
                if (!c2Var.P) {
                    c2Var.f39278n = c2Var.f39279r;
                }
                c2Var.f39280s = 0.0f;
                c2Var.invalidate();
                return;
            case 27:
                org.telegram.ui.lr lrVar = (org.telegram.ui.lr) obj;
                if (lrVar.f47424x != null && (radialProgressView = lrVar.f47422s) != null) {
                    if (!this.f37951b) {
                        radialProgressView.setVisibility(4);
                        lrVar.f47423w.setVisibility(4);
                    }
                    lrVar.f47424x = null;
                    return;
                }
                return;
            case 28:
                org.telegram.ui.yy yyVar = (org.telegram.ui.yy) obj;
                if (!this.f37951b) {
                    f11 = 0.0f;
                }
                yyVar.f52447s = f11;
                yyVar.invalidate();
                return;
            default:
                org.telegram.ui.x30 x30Var = (org.telegram.ui.x30) obj;
                x30Var.M4 = null;
                org.telegram.ui.ActionBar.k5 subtitleTextView = x30Var.G1.getSubtitleTextView();
                if (!this.f37951b) {
                    f12 = org.telegram.messenger.g0.L(20.0f);
                }
                subtitleTextView.setTranslationY(f12);
                return;
        }
    }

    public s9(View view) {
        this.f37950a = 11;
        this.f37952c = view;
        this.f37951b = true;
    }

    public s9(View view, boolean z10) {
        this.f37950a = 11;
        this.f37952c = view;
        this.f37951b = z10;
    }

    public s9(on onVar) {
        this.f37950a = 3;
        this.f37952c = onVar;
    }
}
