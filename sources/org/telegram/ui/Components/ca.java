package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagePreviewParams;
public final class ca extends AnimatorListenerAdapter {
    public final int f23258a;
    public boolean f23259b;
    public final Object f23260c;

    public ca(int i10, Object obj, boolean z10) {
        this.f23258a = i10;
        this.f23260c = obj;
        this.f23259b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23258a) {
            case 0:
                da daVar = (da) this.f23260c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    daVar.h = null;
                    return;
                }
                return;
            case 2:
                ((wi) this.f23260c).Y0 = null;
                return;
            case 3:
                this.f23259b = true;
                return;
            case 8:
                p00 p00Var = (p00) this.f23260c;
                AnimatorSet animatorSet2 = p00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    p00Var.e = null;
                    return;
                }
                return;
            case 12:
                e70 e70Var = (e70) this.f23260c;
                AnimatorSet animatorSet3 = e70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    e70Var.X = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f23260c;
                if (animator.equals(pipRoundVideoView.f22307r)) {
                    pipRoundVideoView.f22307r = null;
                    return;
                }
                return;
            case 19:
                ((lv0) this.f23260c).N1 = null;
                return;
            case 23:
                z61 z61Var = (z61) this.f23260c;
                AnimatorSet animatorSet4 = z61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    z61Var.d = null;
                    return;
                }
                return;
            case 24:
                d71 d71Var = (d71) this.f23260c;
                AnimatorSet animatorSet5 = d71Var.f23576r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    d71Var.f23576r = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.ms) this.f23260c).f35659w = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        Drawable[] drawableArr;
        Drawable drawable;
        RadialProgressView radialProgressView;
        float f20;
        float f21;
        float dp;
        switch (this.f23258a) {
            case 0:
                da daVar = (da) this.f23260c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f23259b) {
                        daVar.f23609c.setVisibility(4);
                        return;
                    } else {
                        daVar.f23608b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                yc ycVar = (yc) this.f23260c;
                if (animator == ycVar.f30641g) {
                    ycVar.f30641g = null;
                    if (this.f23259b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ycVar.f30642i = f7;
                    ycVar.b();
                    return;
                }
                return;
            case 2:
                wi wiVar = (wi) this.f23260c;
                if (wiVar.Y0 != null) {
                    if (this.f23259b) {
                        if (wiVar.S0) {
                            oi oiVar = wiVar.f30003y0;
                            if (oiVar == null || oiVar.J()) {
                                wiVar.f30000x1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.u0 u0Var = wiVar.f29939e1;
                    if (u0Var != null) {
                        u0Var.setVisibility(4);
                    }
                    if (wiVar.Q0 != 0 || !wiVar.f29975q1) {
                        wiVar.f29926a1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                lo loVar = (lo) this.f23260c;
                if (!this.f23259b) {
                    w9 w9Var = loVar.h;
                    loVar.h = loVar.f26048n;
                    loVar.f26048n = w9Var;
                    w9Var.setVisibility(8);
                    loVar.f26048n.setAlpha(0.0f);
                    loVar.h.setVisibility(0);
                    loVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z10 = this.f23259b;
                vo voVar = (vo) this.f23260c;
                if (animator == voVar.e) {
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    voVar.d = f10;
                    voVar.setShown(f10);
                    if (!z10) {
                        voVar.setVisibility(8);
                    }
                    voVar.a(true);
                    return;
                }
                return;
            case 5:
                op opVar = (op) this.f23260c;
                if (this.f23259b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                opVar.f27146g0 = f11;
                opVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * opVar.f27146g0);
                return;
            case 6:
                if (!this.f23259b) {
                    ((oq) this.f23260c).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                aw awVar = (aw) this.f23260c;
                ew ewVar = awVar.J;
                if (ewVar.U && !awVar.h) {
                    if (!this.f23259b && !awVar.f22754n) {
                        awVar.setBackground(null);
                        return;
                    } else if (awVar.getBackground() == null) {
                        awVar.setBackground(org.telegram.ui.ActionBar.h6.Y(ewVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                p00 p00Var = (p00) this.f23260c;
                AnimatorSet animatorSet2 = p00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f23259b) {
                        p00Var.f27210f.setVisibility(4);
                    }
                    p00Var.e = null;
                    return;
                }
                return;
            case 9:
                a10 a10Var = (a10) this.f23260c;
                if (this.f23259b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                a10Var.h = f12;
                a10Var.invalidate();
                return;
            case 10:
                c30 c30Var = (c30) this.f23260c;
                a30 a30Var = c30Var.f23181a;
                if (!c30Var.F) {
                    if (this.f23259b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    c30Var.f23184b0 = f13;
                    c30Var.U.setPinnedProgress(f13);
                    a30Var.setScaleX(1.0f - (c30Var.f23184b0 * 0.6f));
                    a30Var.setScaleY(1.0f - (c30Var.f23184b0 * 0.6f));
                    if (c30Var.W) {
                        c30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) this.f23260c;
                if (this.f23259b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 12:
                e70 e70Var = (e70) this.f23260c;
                AnimatorSet animatorSet3 = e70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f23259b) {
                        e70Var.Y.setVisibility(4);
                    }
                    e70Var.X = null;
                    return;
                }
                return;
            case 13:
                o70 o70Var = (o70) this.f23260c;
                boolean z11 = this.f23259b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                o70Var.f26984h0 = f14;
                o70.W(o70Var).invalidate();
                if (!z11) {
                    o70Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                hc0 hc0Var = (hc0) this.f23260c;
                if (hc0Var.getParent() != null) {
                    ((ViewGroup) hc0Var.getParent()).removeView(hc0Var);
                }
                boolean z12 = this.f23259b;
                org.telegram.ui.el elVar = (org.telegram.ui.el) hc0Var;
                MessagePreviewParams messagePreviewParams = elVar.H.f39477f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.dl(elVar, 0), 15L);
                    return;
                }
                return;
            case 15:
                bc0 bc0Var = (bc0) this.f23260c;
                bc0Var.P = null;
                bc0Var.g(this.f23259b, false);
                return;
            case 16:
                ee0 ee0Var = (ee0) this.f23260c;
                TextView textView = ee0Var.f23999w;
                ai.w5 w5Var = ee0Var.e;
                if (this.f23259b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                w5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f15));
                w5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f15));
                w5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f15));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f15));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f15));
                ee0Var.f23998s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f23260c;
                if (animator.equals(pipRoundVideoView.f22307r)) {
                    if (!this.f23259b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f22307r = null;
                    return;
                }
                return;
            case 18:
                boolean z13 = this.f23259b;
                wn0 wn0Var = (wn0) this.f23260c;
                if (animator == wn0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    wn0Var.F = f16;
                    wn0Var.setShown(f16);
                    if (!z13) {
                        wn0Var.setVisibility(8);
                    }
                    wn0Var.b(true);
                    return;
                }
                return;
            case 19:
                lv0 lv0Var = (lv0) this.f23260c;
                if (lv0Var.N1 != null) {
                    lv0Var.N1 = null;
                    if (!this.f23259b) {
                        lv0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                j21 j21Var = (j21) this.f23260c;
                if (this.f23259b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                j21Var.M = f17;
                j21Var.invalidate();
                return;
            case 21:
                h31 h31Var = (h31) this.f23260c;
                if (this.f23259b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                h31Var.F = f18;
                h31Var.h();
                return;
            case 22:
                l31 l31Var = (l31) this.f23260c;
                if (this.f23259b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                l31Var.Q = f19;
                l31Var.h();
                l31Var.g();
                return;
            case 23:
                z61 z61Var = (z61) this.f23260c;
                AnimatorSet animatorSet4 = z61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f23259b) {
                        z61Var.e.setVisibility(4);
                    }
                    z61Var.d = null;
                    return;
                }
                return;
            case 24:
                d71 d71Var = (d71) this.f23260c;
                AnimatorSet animatorSet5 = d71Var.f23576r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f23259b) {
                        d71Var.f23575n.setVisibility(4);
                    }
                    d71Var.f23576r = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f23260c;
                w2Var.v = null;
                if (this.f23259b) {
                    TextView[] textViewArr = w2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!w2Var.G && (drawable = (drawableArr = w2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                w2Var.G = false;
                if (!w2Var.O) {
                    w2Var.f29649n = w2Var.f29650r;
                }
                w2Var.f29651s = 0.0f;
                w2Var.invalidate();
                return;
            case 26:
                org.telegram.ui.ms msVar = (org.telegram.ui.ms) this.f23260c;
                if (msVar.f35659w != null && (radialProgressView = msVar.f35658s) != null) {
                    if (!this.f23259b) {
                        radialProgressView.setVisibility(4);
                        msVar.v.setVisibility(4);
                    }
                    msVar.f35659w = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.hz hzVar = (org.telegram.ui.hz) this.f23260c;
                if (this.f23259b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                hzVar.f34332r = f20;
                w9 w9Var2 = hzVar.f34329c;
                int i11 = org.telegram.ui.ActionBar.h6.C6;
                int v02 = org.telegram.ui.ActionBar.h6.v0(i11, hzVar.f34327a);
                int i12 = org.telegram.ui.ActionBar.h6.Oh;
                int d = i0.a.d(hzVar.f34332r, v02, org.telegram.ui.ActionBar.h6.v0(i12, hzVar.f34327a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                hzVar.f34329c.invalidate();
                hzVar.f34330f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - hzVar.f34332r, org.telegram.ui.ActionBar.h6.v0(i11, hzVar.f34327a), org.telegram.ui.ActionBar.h6.v0(i12, hzVar.f34327a)), mode));
                hzVar.f34330f.invalidate();
                return;
            case 28:
                org.telegram.ui.u00 u00Var = (org.telegram.ui.u00) this.f23260c;
                if (this.f23259b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                u00Var.f38271s = f21;
                u00Var.invalidate();
                return;
            default:
                org.telegram.ui.d60 d60Var = (org.telegram.ui.d60) this.f23260c;
                d60Var.U2 = null;
                org.telegram.ui.ActionBar.h5 subtitleTextView = d60Var.O.getSubtitleTextView();
                if (this.f23259b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
        }
    }

    public ca(View view) {
        this.f23258a = 11;
        this.f23260c = view;
        this.f23259b = true;
    }

    public ca(View view, boolean z10) {
        this.f23258a = 11;
        this.f23260c = view;
        this.f23259b = z10;
    }

    public ca(lo loVar) {
        this.f23258a = 3;
        this.f23260c = loVar;
    }
}
