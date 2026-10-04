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
    public final int f25674a;
    public boolean f25675b;
    public final Object f25676c;

    public da(int i10, Object obj, boolean z10) {
        this.f25674a = i10;
        this.f25676c = obj;
        this.f25675b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25674a) {
            case 0:
                ea eaVar = (ea) this.f25676c;
                AnimatorSet animatorSet = eaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    eaVar.h = null;
                    return;
                }
                return;
            case 2:
                ((xi) this.f25676c).Y0 = null;
                return;
            case 3:
                this.f25675b = true;
                return;
            case 8:
                q00 q00Var = (q00) this.f25676c;
                AnimatorSet animatorSet2 = q00Var.f29851e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q00Var.f29851e = null;
                    return;
                }
                return;
            case 12:
                f70 f70Var = (f70) this.f25676c;
                AnimatorSet animatorSet3 = f70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    f70Var.X = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f25676c;
                if (animator.equals(pipRoundVideoView.f24215r)) {
                    pipRoundVideoView.f24215r = null;
                    return;
                }
                return;
            case 19:
                ((pv0) this.f25676c).N1 = null;
                return;
            case 23:
                j71 j71Var = (j71) this.f25676c;
                AnimatorSet animatorSet4 = j71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    j71Var.d = null;
                    return;
                }
                return;
            case 24:
                n71 n71Var = (n71) this.f25676c;
                AnimatorSet animatorSet5 = n71Var.f28893r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    n71Var.f28893r = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.qs) this.f25676c).f39811w = null;
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
        switch (this.f25674a) {
            case 0:
                ea eaVar = (ea) this.f25676c;
                AnimatorSet animatorSet = eaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f25675b) {
                        eaVar.f26018c.setVisibility(4);
                        return;
                    } else {
                        eaVar.f26017b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                zc zcVar = (zc) this.f25676c;
                if (animator == zcVar.f33473g) {
                    zcVar.f33473g = null;
                    if (this.f25675b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    zcVar.f33474i = f7;
                    zcVar.b();
                    return;
                }
                return;
            case 2:
                xi xiVar = (xi) this.f25676c;
                if (xiVar.Y0 != null) {
                    if (this.f25675b) {
                        if (xiVar.S0) {
                            pi piVar = xiVar.f32874y0;
                            if (piVar == null || piVar.H()) {
                                xiVar.f32871x1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.v0 v0Var = xiVar.f32810e1;
                    if (v0Var != null) {
                        v0Var.setVisibility(4);
                    }
                    if (xiVar.Q0 != 0 || !xiVar.f32846q1) {
                        xiVar.f32796a1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                mo moVar = (mo) this.f25676c;
                if (!this.f25675b) {
                    w9 w9Var = moVar.h;
                    moVar.h = moVar.f28667n;
                    moVar.f28667n = w9Var;
                    w9Var.setVisibility(8);
                    moVar.f28667n.setAlpha(0.0f);
                    moVar.h.setVisibility(0);
                    moVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z10 = this.f25675b;
                wo woVar = (wo) this.f25676c;
                if (animator == woVar.f32588e) {
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
                pp ppVar = (pp) this.f25676c;
                if (this.f25675b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ppVar.f29692g0 = f11;
                ppVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * ppVar.f29692g0);
                return;
            case 6:
                if (!this.f25675b) {
                    ((pq) this.f25676c).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                cw cwVar = (cw) this.f25676c;
                gw gwVar = cwVar.J;
                if (gwVar.U && !cwVar.h) {
                    if (!this.f25675b && !cwVar.f25462n) {
                        cwVar.setBackground(null);
                        return;
                    } else if (cwVar.getBackground() == null) {
                        cwVar.setBackground(org.telegram.ui.ActionBar.i6.Y(gwVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                q00 q00Var = (q00) this.f25676c;
                AnimatorSet animatorSet2 = q00Var.f29851e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f25675b) {
                        q00Var.f29852f.setVisibility(4);
                    }
                    q00Var.f29851e = null;
                    return;
                }
                return;
            case 9:
                b10 b10Var = (b10) this.f25676c;
                if (this.f25675b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                b10Var.h = f12;
                b10Var.invalidate();
                return;
            case 10:
                d30 d30Var = (d30) this.f25676c;
                b30 b30Var = d30Var.f25534a;
                if (!d30Var.F) {
                    if (this.f25675b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    d30Var.f25537b0 = f13;
                    d30Var.U.setPinnedProgress(f13);
                    b30Var.setScaleX(1.0f - (d30Var.f25537b0 * 0.6f));
                    b30Var.setScaleY(1.0f - (d30Var.f25537b0 * 0.6f));
                    if (d30Var.W) {
                        d30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) this.f25676c;
                if (this.f25675b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 12:
                f70 f70Var = (f70) this.f25676c;
                AnimatorSet animatorSet3 = f70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f25675b) {
                        f70Var.Y.setVisibility(4);
                    }
                    f70Var.X = null;
                    return;
                }
                return;
            case 13:
                p70 p70Var = (p70) this.f25676c;
                boolean z11 = this.f25675b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                p70Var.f29537h0 = f14;
                p70.U(p70Var).invalidate();
                if (!z11) {
                    p70Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                ic0 ic0Var = (ic0) this.f25676c;
                if (ic0Var.getParent() != null) {
                    ((ViewGroup) ic0Var.getParent()).removeView(ic0Var);
                }
                boolean z12 = this.f25675b;
                org.telegram.ui.el elVar = (org.telegram.ui.el) ic0Var;
                MessagePreviewParams messagePreviewParams = elVar.H.f43307d5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.dl(elVar, 0), 15L);
                    return;
                }
                return;
            case 15:
                cc0 cc0Var = (cc0) this.f25676c;
                cc0Var.P = null;
                cc0Var.g(this.f25675b, false);
                return;
            case 16:
                ee0 ee0Var = (ee0) this.f25676c;
                TextView textView = ee0Var.f26060w;
                ai.w5 w5Var = ee0Var.f26055e;
                if (this.f25675b) {
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
                ee0Var.f26059s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f25676c;
                if (animator.equals(pipRoundVideoView.f24215r)) {
                    if (!this.f25675b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f24215r = null;
                    return;
                }
                return;
            case 18:
                boolean z13 = this.f25675b;
                ao0 ao0Var = (ao0) this.f25676c;
                if (animator == ao0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    ao0Var.F = f16;
                    ao0Var.setShown(f16);
                    if (!z13) {
                        ao0Var.setVisibility(8);
                    }
                    ao0Var.b(true);
                    return;
                }
                return;
            case 19:
                pv0 pv0Var = (pv0) this.f25676c;
                if (pv0Var.N1 != null) {
                    pv0Var.N1 = null;
                    if (!this.f25675b) {
                        pv0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                s21 s21Var = (s21) this.f25676c;
                if (this.f25675b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                s21Var.M = f17;
                s21Var.invalidate();
                return;
            case 21:
                q31 q31Var = (q31) this.f25676c;
                if (this.f25675b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                q31Var.F = f18;
                q31Var.h();
                return;
            case 22:
                u31 u31Var = (u31) this.f25676c;
                if (this.f25675b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                u31Var.Q = f19;
                u31Var.h();
                u31Var.g();
                return;
            case 23:
                j71 j71Var = (j71) this.f25676c;
                AnimatorSet animatorSet4 = j71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f25675b) {
                        j71Var.f27619e.setVisibility(4);
                    }
                    j71Var.d = null;
                    return;
                }
                return;
            case 24:
                n71 n71Var = (n71) this.f25676c;
                AnimatorSet animatorSet5 = n71Var.f28893r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f25675b) {
                        n71Var.f28892n.setVisibility(4);
                    }
                    n71Var.f28893r = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f25676c;
                w2Var.v = null;
                if (this.f25675b) {
                    TextView[] textViewArr = w2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!w2Var.G && (drawable = (drawableArr = w2Var.f32260e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                w2Var.G = false;
                if (!w2Var.O) {
                    w2Var.f32262n = w2Var.f32263r;
                }
                w2Var.f32264s = 0.0f;
                w2Var.invalidate();
                return;
            case 26:
                org.telegram.ui.qs qsVar = (org.telegram.ui.qs) this.f25676c;
                if (qsVar.f39811w != null && (radialProgressView = qsVar.f39810s) != null) {
                    if (!this.f25675b) {
                        radialProgressView.setVisibility(4);
                        qsVar.v.setVisibility(4);
                    }
                    qsVar.f39811w = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.lz lzVar = (org.telegram.ui.lz) this.f25676c;
                if (this.f25675b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                lzVar.f38370r = f20;
                w9 w9Var2 = lzVar.f38366c;
                int i11 = org.telegram.ui.ActionBar.i6.C6;
                int v02 = org.telegram.ui.ActionBar.i6.v0(i11, lzVar.f38364a);
                int i12 = org.telegram.ui.ActionBar.i6.Oh;
                int d = i0.a.d(lzVar.f38370r, v02, org.telegram.ui.ActionBar.i6.v0(i12, lzVar.f38364a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                lzVar.f38366c.invalidate();
                lzVar.f38368f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - lzVar.f38370r, org.telegram.ui.ActionBar.i6.v0(i11, lzVar.f38364a), org.telegram.ui.ActionBar.i6.v0(i12, lzVar.f38364a)), mode));
                lzVar.f38368f.invalidate();
                return;
            case 28:
                org.telegram.ui.y00 y00Var = (org.telegram.ui.y00) this.f25676c;
                if (this.f25675b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                y00Var.f42984s = f21;
                y00Var.invalidate();
                return;
            default:
                org.telegram.ui.h60 h60Var = (org.telegram.ui.h60) this.f25676c;
                h60Var.U2 = null;
                org.telegram.ui.ActionBar.i5 subtitleTextView = h60Var.O.getSubtitleTextView();
                if (this.f25675b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
        }
    }

    public da(View view) {
        this.f25674a = 11;
        this.f25676c = view;
        this.f25675b = true;
    }

    public da(View view, boolean z10) {
        this.f25674a = 11;
        this.f25676c = view;
        this.f25675b = z10;
    }

    public da(mo moVar) {
        this.f25674a = 3;
        this.f25676c = moVar;
    }
}
