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
public final class da extends AnimatorListenerAdapter {
    public final int f23595a;
    public boolean f23596b;
    public final Object f23597c;

    public da(int i10, Object obj, boolean z10) {
        this.f23595a = i10;
        this.f23597c = obj;
        this.f23596b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23595a) {
            case 0:
                ea eaVar = (ea) this.f23597c;
                AnimatorSet animatorSet = eaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    eaVar.h = null;
                    return;
                }
                return;
            case 2:
                ((xi) this.f23597c).Y0 = null;
                return;
            case 3:
                this.f23596b = true;
                return;
            case 8:
                q00 q00Var = (q00) this.f23597c;
                AnimatorSet animatorSet2 = q00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q00Var.e = null;
                    return;
                }
                return;
            case 12:
                f70 f70Var = (f70) this.f23597c;
                AnimatorSet animatorSet3 = f70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    f70Var.X = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f23597c;
                if (animator.equals(pipRoundVideoView.f22329r)) {
                    pipRoundVideoView.f22329r = null;
                    return;
                }
                return;
            case 19:
                ((mv0) this.f23597c).N1 = null;
                return;
            case 23:
                a71 a71Var = (a71) this.f23597c;
                AnimatorSet animatorSet4 = a71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    a71Var.d = null;
                    return;
                }
                return;
            case 24:
                e71 e71Var = (e71) this.f23597c;
                AnimatorSet animatorSet5 = e71Var.f23900r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    e71Var.f23900r = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.ms) this.f23597c).f35773w = null;
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
        switch (this.f23595a) {
            case 0:
                ea eaVar = (ea) this.f23597c;
                AnimatorSet animatorSet = eaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f23596b) {
                        eaVar.f23929c.setVisibility(4);
                        return;
                    } else {
                        eaVar.f23928b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                zc zcVar = (zc) this.f23597c;
                if (animator == zcVar.f30948g) {
                    zcVar.f30948g = null;
                    if (this.f23596b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    zcVar.f30949i = f7;
                    zcVar.b();
                    return;
                }
                return;
            case 2:
                xi xiVar = (xi) this.f23597c;
                if (xiVar.Y0 != null) {
                    if (this.f23596b) {
                        if (xiVar.S0) {
                            pi piVar = xiVar.f30331y0;
                            if (piVar == null || piVar.J()) {
                                xiVar.f30328x1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.u0 u0Var = xiVar.f30267e1;
                    if (u0Var != null) {
                        u0Var.setVisibility(4);
                    }
                    if (xiVar.Q0 != 0 || !xiVar.f30303q1) {
                        xiVar.f30254a1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                mo moVar = (mo) this.f23597c;
                if (!this.f23596b) {
                    w9 w9Var = moVar.h;
                    moVar.h = moVar.f26338n;
                    moVar.f26338n = w9Var;
                    w9Var.setVisibility(8);
                    moVar.f26338n.setAlpha(0.0f);
                    moVar.h.setVisibility(0);
                    moVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z10 = this.f23596b;
                wo woVar = (wo) this.f23597c;
                if (animator == woVar.e) {
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    woVar.d = f10;
                    woVar.setShown(f10);
                    if (!z10) {
                        woVar.setVisibility(8);
                    }
                    woVar.a(true);
                    return;
                }
                return;
            case 5:
                pp ppVar = (pp) this.f23597c;
                if (this.f23596b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ppVar.f27432g0 = f11;
                ppVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * ppVar.f27432g0);
                return;
            case 6:
                if (!this.f23596b) {
                    ((pq) this.f23597c).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                bw bwVar = (bw) this.f23597c;
                fw fwVar = bwVar.J;
                if (fwVar.U && !bwVar.h) {
                    if (!this.f23596b && !bwVar.f23039n) {
                        bwVar.setBackground(null);
                        return;
                    } else if (bwVar.getBackground() == null) {
                        bwVar.setBackground(org.telegram.ui.ActionBar.h6.Y(fwVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                q00 q00Var = (q00) this.f23597c;
                AnimatorSet animatorSet2 = q00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f23596b) {
                        q00Var.f27507f.setVisibility(4);
                    }
                    q00Var.e = null;
                    return;
                }
                return;
            case 9:
                b10 b10Var = (b10) this.f23597c;
                if (this.f23596b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                b10Var.h = f12;
                b10Var.invalidate();
                return;
            case 10:
                d30 d30Var = (d30) this.f23597c;
                b30 b30Var = d30Var.f23499a;
                if (!d30Var.F) {
                    if (this.f23596b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    d30Var.f23502b0 = f13;
                    d30Var.U.setPinnedProgress(f13);
                    b30Var.setScaleX(1.0f - (d30Var.f23502b0 * 0.6f));
                    b30Var.setScaleY(1.0f - (d30Var.f23502b0 * 0.6f));
                    if (d30Var.W) {
                        d30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) this.f23597c;
                if (this.f23596b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 12:
                f70 f70Var = (f70) this.f23597c;
                AnimatorSet animatorSet3 = f70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f23596b) {
                        f70Var.Y.setVisibility(4);
                    }
                    f70Var.X = null;
                    return;
                }
                return;
            case 13:
                p70 p70Var = (p70) this.f23597c;
                boolean z11 = this.f23596b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                p70Var.f27270h0 = f14;
                p70.W(p70Var).invalidate();
                if (!z11) {
                    p70Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                ic0 ic0Var = (ic0) this.f23597c;
                if (ic0Var.getParent() != null) {
                    ((ViewGroup) ic0Var.getParent()).removeView(ic0Var);
                }
                boolean z12 = this.f23596b;
                org.telegram.ui.el elVar = (org.telegram.ui.el) ic0Var;
                MessagePreviewParams messagePreviewParams = elVar.H.f39570f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.dl(elVar, 0), 15L);
                    return;
                }
                return;
            case 15:
                cc0 cc0Var = (cc0) this.f23597c;
                cc0Var.P = null;
                cc0Var.g(this.f23596b, false);
                return;
            case 16:
                fe0 fe0Var = (fe0) this.f23597c;
                TextView textView = fe0Var.f24286w;
                ai.w5 w5Var = fe0Var.e;
                if (this.f23596b) {
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
                fe0Var.f24285s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f23597c;
                if (animator.equals(pipRoundVideoView.f22329r)) {
                    if (!this.f23596b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f22329r = null;
                    return;
                }
                return;
            case 18:
                boolean z13 = this.f23596b;
                xn0 xn0Var = (xn0) this.f23597c;
                if (animator == xn0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    xn0Var.F = f16;
                    xn0Var.setShown(f16);
                    if (!z13) {
                        xn0Var.setVisibility(8);
                    }
                    xn0Var.b(true);
                    return;
                }
                return;
            case 19:
                mv0 mv0Var = (mv0) this.f23597c;
                if (mv0Var.N1 != null) {
                    mv0Var.N1 = null;
                    if (!this.f23596b) {
                        mv0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                k21 k21Var = (k21) this.f23597c;
                if (this.f23596b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                k21Var.M = f17;
                k21Var.invalidate();
                return;
            case 21:
                i31 i31Var = (i31) this.f23597c;
                if (this.f23596b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                i31Var.F = f18;
                i31Var.h();
                return;
            case 22:
                m31 m31Var = (m31) this.f23597c;
                if (this.f23596b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                m31Var.Q = f19;
                m31Var.h();
                m31Var.g();
                return;
            case 23:
                a71 a71Var = (a71) this.f23597c;
                AnimatorSet animatorSet4 = a71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f23596b) {
                        a71Var.e.setVisibility(4);
                    }
                    a71Var.d = null;
                    return;
                }
                return;
            case 24:
                e71 e71Var = (e71) this.f23597c;
                AnimatorSet animatorSet5 = e71Var.f23900r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f23596b) {
                        e71Var.f23899n.setVisibility(4);
                    }
                    e71Var.f23900r = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f23597c;
                w2Var.v = null;
                if (this.f23596b) {
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
                    w2Var.f29646n = w2Var.f29647r;
                }
                w2Var.f29648s = 0.0f;
                w2Var.invalidate();
                return;
            case 26:
                org.telegram.ui.ms msVar = (org.telegram.ui.ms) this.f23597c;
                if (msVar.f35773w != null && (radialProgressView = msVar.f35772s) != null) {
                    if (!this.f23596b) {
                        radialProgressView.setVisibility(4);
                        msVar.v.setVisibility(4);
                    }
                    msVar.f35773w = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.hz hzVar = (org.telegram.ui.hz) this.f23597c;
                if (this.f23596b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                hzVar.f34427r = f20;
                w9 w9Var2 = hzVar.f34424c;
                int i11 = org.telegram.ui.ActionBar.h6.C6;
                int v02 = org.telegram.ui.ActionBar.h6.v0(i11, hzVar.f34422a);
                int i12 = org.telegram.ui.ActionBar.h6.Oh;
                int d = i0.a.d(hzVar.f34427r, v02, org.telegram.ui.ActionBar.h6.v0(i12, hzVar.f34422a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                hzVar.f34424c.invalidate();
                hzVar.f34425f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - hzVar.f34427r, org.telegram.ui.ActionBar.h6.v0(i11, hzVar.f34422a), org.telegram.ui.ActionBar.h6.v0(i12, hzVar.f34422a)), mode));
                hzVar.f34425f.invalidate();
                return;
            case 28:
                org.telegram.ui.u00 u00Var = (org.telegram.ui.u00) this.f23597c;
                if (this.f23596b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                u00Var.f38361s = f21;
                u00Var.invalidate();
                return;
            default:
                org.telegram.ui.d60 d60Var = (org.telegram.ui.d60) this.f23597c;
                d60Var.U2 = null;
                org.telegram.ui.ActionBar.h5 subtitleTextView = d60Var.O.getSubtitleTextView();
                if (this.f23596b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
        }
    }

    public da(View view) {
        this.f23595a = 11;
        this.f23597c = view;
        this.f23596b = true;
    }

    public da(View view, boolean z10) {
        this.f23595a = 11;
        this.f23597c = view;
        this.f23596b = z10;
    }

    public da(mo moVar) {
        this.f23595a = 3;
        this.f23597c = moVar;
    }
}
