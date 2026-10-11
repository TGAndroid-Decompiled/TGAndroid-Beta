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
public final class ea extends AnimatorListenerAdapter {
    public final int f25939a;
    public boolean f25940b;
    public final Object f25941c;

    public ea(int i10, Object obj, boolean z10) {
        this.f25939a = i10;
        this.f25941c = obj;
        this.f25940b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25939a) {
            case 0:
                fa faVar = (fa) this.f25941c;
                AnimatorSet animatorSet = faVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    faVar.h = null;
                    return;
                }
                return;
            case 2:
                ((yi) this.f25941c).f33202b1 = null;
                return;
            case 3:
                this.f25940b = true;
                return;
            case 8:
                e10 e10Var = (e10) this.f25941c;
                AnimatorSet animatorSet2 = e10Var.f25794e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    e10Var.f25794e = null;
                    return;
                }
                return;
            case 12:
                u70 u70Var = (u70) this.f25941c;
                AnimatorSet animatorSet3 = u70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    u70Var.X = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f25941c;
                if (animator.equals(pipRoundVideoView.f24210r)) {
                    pipRoundVideoView.f24210r = null;
                    return;
                }
                return;
            case 19:
                ((dw0) this.f25941c).N1 = null;
                return;
            case 23:
                r71 r71Var = (r71) this.f25941c;
                AnimatorSet animatorSet4 = r71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    r71Var.d = null;
                    return;
                }
                return;
            case 24:
                v71 v71Var = (v71) this.f25941c;
                AnimatorSet animatorSet5 = v71Var.f31698r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    v71Var.f31698r = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.ps) this.f25941c).f40951w = null;
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
        switch (this.f25939a) {
            case 0:
                fa faVar = (fa) this.f25941c;
                AnimatorSet animatorSet = faVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f25940b) {
                        faVar.f26309c.setVisibility(4);
                        return;
                    } else {
                        faVar.f26308b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                bd bdVar = (bd) this.f25941c;
                if (animator == bdVar.f24912g) {
                    bdVar.f24912g = null;
                    if (this.f25940b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    bdVar.f24914j = f7;
                    bdVar.b();
                    return;
                }
                return;
            case 2:
                yi yiVar = (yi) this.f25941c;
                if (yiVar.f33202b1 != null) {
                    if (this.f25940b) {
                        if (yiVar.V0) {
                            qi qiVar = yiVar.B0;
                            if (qiVar == null || qiVar.L()) {
                                yiVar.A1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.u0 u0Var = yiVar.f33223h1;
                    if (u0Var != null) {
                        u0Var.setVisibility(4);
                    }
                    if (yiVar.T0 != 0 || !yiVar.f33260t1) {
                        yiVar.f33209d1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                zo zoVar = (zo) this.f25941c;
                if (!this.f25940b) {
                    y9 y9Var = zoVar.h;
                    zoVar.h = zoVar.f33623n;
                    zoVar.f33623n = y9Var;
                    y9Var.setVisibility(8);
                    zoVar.f33623n.setAlpha(0.0f);
                    zoVar.h.setVisibility(0);
                    zoVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z10 = this.f25940b;
                jp jpVar = (jp) this.f25941c;
                if (animator == jpVar.f27719e) {
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    jpVar.d = f10;
                    jpVar.setShown(f10);
                    if (!z10) {
                        jpVar.setVisibility(8);
                    }
                    jpVar.a(true);
                    return;
                }
                return;
            case 5:
                cq cqVar = (cq) this.f25941c;
                if (this.f25940b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                cqVar.f25271g0 = f11;
                cqVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * cqVar.f25271g0);
                return;
            case 6:
                if (!this.f25940b) {
                    ((cr) this.f25941c).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                pw pwVar = (pw) this.f25941c;
                tw twVar = pwVar.J;
                if (twVar.U && !pwVar.h) {
                    if (!this.f25940b && !pwVar.f29859n) {
                        pwVar.setBackground(null);
                        return;
                    } else if (pwVar.getBackground() == null) {
                        pwVar.setBackground(org.telegram.ui.ActionBar.h6.Z(twVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                e10 e10Var = (e10) this.f25941c;
                AnimatorSet animatorSet2 = e10Var.f25794e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f25940b) {
                        e10Var.f25795f.setVisibility(4);
                    }
                    e10Var.f25794e = null;
                    return;
                }
                return;
            case 9:
                p10 p10Var = (p10) this.f25941c;
                if (this.f25940b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                p10Var.h = f12;
                p10Var.invalidate();
                return;
            case 10:
                r30 r30Var = (r30) this.f25941c;
                p30 p30Var = r30Var.f30319a;
                if (!r30Var.F) {
                    if (this.f25940b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    r30Var.f30322b0 = f13;
                    r30Var.U.setPinnedProgress(f13);
                    p30Var.setScaleX(1.0f - (r30Var.f30322b0 * 0.6f));
                    p30Var.setScaleY(1.0f - (r30Var.f30322b0 * 0.6f));
                    if (r30Var.W) {
                        r30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) this.f25941c;
                if (this.f25940b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 12:
                u70 u70Var = (u70) this.f25941c;
                AnimatorSet animatorSet3 = u70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f25940b) {
                        u70Var.Y.setVisibility(4);
                    }
                    u70Var.X = null;
                    return;
                }
                return;
            case 13:
                e80 e80Var = (e80) this.f25941c;
                boolean z11 = this.f25940b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                e80Var.f25905h0 = f14;
                e80.X(e80Var).invalidate();
                if (!z11) {
                    e80Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                wc0 wc0Var = (wc0) this.f25941c;
                if (wc0Var.getParent() != null) {
                    ((ViewGroup) wc0Var.getParent()).removeView(wc0Var);
                }
                boolean z12 = this.f25940b;
                org.telegram.ui.jl jlVar = (org.telegram.ui.jl) wc0Var;
                MessagePreviewParams messagePreviewParams = jlVar.H.f44770f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.il(jlVar, 0), 15L);
                    return;
                }
                return;
            case 15:
                qc0 qc0Var = (qc0) this.f25941c;
                qc0Var.P = null;
                qc0Var.g(this.f25940b, false);
                return;
            case 16:
                ue0 ue0Var = (ue0) this.f25941c;
                TextView textView = ue0Var.f31415w;
                ai.x5 x5Var = ue0Var.f31410e;
                if (this.f25940b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                x5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f15));
                x5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f15));
                x5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f15));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f15));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f15));
                ue0Var.f31414s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f25941c;
                if (animator.equals(pipRoundVideoView.f24210r)) {
                    if (!this.f25940b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f24210r = null;
                    return;
                }
                return;
            case 18:
                boolean z13 = this.f25940b;
                po0 po0Var = (po0) this.f25941c;
                if (animator == po0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    po0Var.F = f16;
                    po0Var.setShown(f16);
                    if (!z13) {
                        po0Var.setVisibility(8);
                    }
                    po0Var.b(true);
                    return;
                }
                return;
            case 19:
                dw0 dw0Var = (dw0) this.f25941c;
                if (dw0Var.N1 != null) {
                    dw0Var.N1 = null;
                    if (!this.f25940b) {
                        dw0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                b31 b31Var = (b31) this.f25941c;
                if (this.f25940b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                b31Var.M = f17;
                b31Var.invalidate();
                return;
            case 21:
                z31 z31Var = (z31) this.f25941c;
                if (this.f25940b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                z31Var.F = f18;
                z31Var.h();
                return;
            case 22:
                d41 d41Var = (d41) this.f25941c;
                if (this.f25940b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                d41Var.Q = f19;
                d41Var.h();
                d41Var.g();
                return;
            case 23:
                r71 r71Var = (r71) this.f25941c;
                AnimatorSet animatorSet4 = r71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f25940b) {
                        r71Var.f30382e.setVisibility(4);
                    }
                    r71Var.d = null;
                    return;
                }
                return;
            case 24:
                v71 v71Var = (v71) this.f25941c;
                AnimatorSet animatorSet5 = v71Var.f31698r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f25940b) {
                        v71Var.f31697n.setVisibility(4);
                    }
                    v71Var.f31698r = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f25941c;
                w2Var.v = null;
                if (this.f25940b) {
                    TextView[] textViewArr = w2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!w2Var.G && (drawable = (drawableArr = w2Var.f32388e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                w2Var.G = false;
                if (!w2Var.O) {
                    w2Var.f32390n = w2Var.f32391r;
                }
                w2Var.f32392s = 0.0f;
                w2Var.invalidate();
                return;
            case 26:
                org.telegram.ui.ps psVar = (org.telegram.ui.ps) this.f25941c;
                if (psVar.f40951w != null && (radialProgressView = psVar.f40950s) != null) {
                    if (!this.f25940b) {
                        radialProgressView.setVisibility(4);
                        psVar.v.setVisibility(4);
                    }
                    psVar.f40951w = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.jz jzVar = (org.telegram.ui.jz) this.f25941c;
                if (this.f25940b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                jzVar.f39150r = f20;
                y9 y9Var2 = jzVar.f39146c;
                int i11 = org.telegram.ui.ActionBar.h6.C6;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i11, jzVar.f39144a);
                int i12 = org.telegram.ui.ActionBar.h6.Oh;
                int d = i0.a.d(jzVar.f39150r, w02, org.telegram.ui.ActionBar.h6.w0(i12, jzVar.f39144a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                y9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                jzVar.f39146c.invalidate();
                jzVar.f39148f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - jzVar.f39150r, org.telegram.ui.ActionBar.h6.w0(i11, jzVar.f39144a), org.telegram.ui.ActionBar.h6.w0(i12, jzVar.f39144a)), mode));
                jzVar.f39148f.invalidate();
                return;
            case 28:
                org.telegram.ui.x00 x00Var = (org.telegram.ui.x00) this.f25941c;
                if (this.f25940b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                x00Var.f43911s = f21;
                x00Var.invalidate();
                return;
            default:
                org.telegram.ui.g60 g60Var = (org.telegram.ui.g60) this.f25941c;
                g60Var.U2 = null;
                org.telegram.ui.ActionBar.h5 subtitleTextView = g60Var.O.getSubtitleTextView();
                if (this.f25940b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
        }
    }

    public ea(View view) {
        this.f25939a = 11;
        this.f25941c = view;
        this.f25940b = true;
    }

    public ea(View view, boolean z10) {
        this.f25939a = 11;
        this.f25941c = view;
        this.f25940b = z10;
    }

    public ea(zo zoVar) {
        this.f25939a = 3;
        this.f25941c = zoVar;
    }
}
