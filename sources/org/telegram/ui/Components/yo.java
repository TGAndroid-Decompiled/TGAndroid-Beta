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
import org.telegram.ui.PasscodeActivity;
public final class yo extends AnimatorListenerAdapter {
    public final int f29460a;
    public final boolean f29461b;
    public final Object f29462c;

    public yo(int i10, Object obj, boolean z10) {
        this.f29460a = i10;
        this.f29462c = obj;
        this.f29461b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29460a) {
            case 4:
                u00 u00Var = (u00) this.f29462c;
                AnimatorSet animatorSet = u00Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    u00Var.e = null;
                    return;
                }
                return;
            case 8:
                a70 a70Var = (a70) this.f29462c;
                AnimatorSet animatorSet2 = a70Var.X;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    a70Var.X = null;
                    return;
                }
                return;
            case 13:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f29462c;
                if (animator.equals(pipRoundVideoView.f21170r)) {
                    pipRoundVideoView.f21170r = null;
                    return;
                }
                return;
            case 15:
                ((iv0) this.f29462c).N1 = null;
                return;
            case 19:
                x61 x61Var = (x61) this.f29462c;
                AnimatorSet animatorSet3 = x61Var.d;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    x61Var.d = null;
                    return;
                }
                return;
            case 20:
                b71 b71Var = (b71) this.f29462c;
                AnimatorSet animatorSet4 = b71Var.f21748r;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    b71Var.f21748r = null;
                    return;
                }
                return;
            case 22:
                ((org.telegram.ui.ts) this.f29462c).f37007w = null;
                return;
            case 26:
                ((org.telegram.ui.k70) this.f29462c).h = null;
                return;
            case 29:
                org.telegram.ui.br0 br0Var = (org.telegram.ui.br0) this.f29462c;
                if (animator.equals(br0Var.f31377k0)) {
                    br0Var.f31377k0 = null;
                    return;
                }
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
        int i10;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        Drawable[] drawableArr;
        Drawable drawable;
        RadialProgressView radialProgressView;
        float f19;
        float f20;
        float dp;
        org.telegram.ui.kd kdVar;
        switch (this.f29460a) {
            case 0:
                zo zoVar = (zo) this.f29462c;
                if (animator == zoVar.e) {
                    boolean z10 = this.f29461b;
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    zoVar.d = f7;
                    zoVar.setShown(f7);
                    if (!z10) {
                        zoVar.setVisibility(8);
                    }
                    zoVar.a(true);
                    return;
                }
                return;
            case 1:
                sp spVar = (sp) this.f29462c;
                if (this.f29461b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                spVar.f27140g0 = f10;
                spVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * spVar.f27140g0);
                return;
            case 2:
                if (!this.f29461b) {
                    ((sq) this.f29462c).H.setVisibility(8);
                    return;
                }
                return;
            case 3:
                cw cwVar = (cw) this.f29462c;
                gw gwVar = cwVar.J;
                if (gwVar.U && !cwVar.h) {
                    if (!this.f29461b && !cwVar.f22236n) {
                        cwVar.setBackground(null);
                        return;
                    } else if (cwVar.getBackground() == null) {
                        cwVar.setBackground(org.telegram.ui.ActionBar.j6.Y(gwVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                u00 u00Var = (u00) this.f29462c;
                AnimatorSet animatorSet = u00Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f29461b) {
                        u00Var.f27536f.setVisibility(4);
                    }
                    u00Var.e = null;
                    return;
                }
                return;
            case 5:
                g10 g10Var = (g10) this.f29462c;
                if (this.f29461b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                g10Var.h = f11;
                g10Var.invalidate();
                return;
            case 6:
                j30 j30Var = (j30) this.f29462c;
                h30 h30Var = j30Var.f24209a;
                if (!j30Var.F) {
                    if (this.f29461b) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    j30Var.f24212b0 = f12;
                    j30Var.U.setPinnedProgress(f12);
                    h30Var.setScaleX(1.0f - (j30Var.f24212b0 * 0.6f));
                    h30Var.setScaleY(1.0f - (j30Var.f24212b0 * 0.6f));
                    if (j30Var.W) {
                        j30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                View view = (View) this.f29462c;
                if (this.f29461b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 8:
                a70 a70Var = (a70) this.f29462c;
                AnimatorSet animatorSet2 = a70Var.X;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f29461b) {
                        a70Var.Y.setVisibility(4);
                    }
                    a70Var.X = null;
                    return;
                }
                return;
            case 9:
                k70 k70Var = (k70) this.f29462c;
                boolean z11 = this.f29461b;
                if (z11) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                k70Var.f24633h0 = f13;
                k70.W(k70Var).invalidate();
                if (!z11) {
                    k70Var.V.setVisibility(8);
                    return;
                }
                return;
            case 10:
                ec0 ec0Var = (ec0) this.f29462c;
                if (ec0Var.getParent() != null) {
                    ((ViewGroup) ec0Var.getParent()).removeView(ec0Var);
                }
                org.telegram.ui.kl klVar = (org.telegram.ui.kl) ec0Var;
                MessagePreviewParams messagePreviewParams = klVar.H.f32324f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (this.f29461b) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.jl(klVar, 0), 15L);
                    return;
                }
                return;
            case 11:
                yb0 yb0Var = (yb0) this.f29462c;
                yb0Var.P = null;
                yb0Var.g(this.f29461b, false);
                return;
            case 12:
                be0 be0Var = (be0) this.f29462c;
                TextView textView = be0Var.f21815w;
                bi.l4 l4Var = be0Var.e;
                if (this.f29461b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                l4Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f14));
                l4Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f14));
                l4Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f14));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f14));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f14));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f14));
                be0Var.f21814s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f14));
                return;
            case 13:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f29462c;
                if (animator.equals(pipRoundVideoView.f21170r)) {
                    if (!this.f29461b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f21170r = null;
                    return;
                }
                return;
            case 14:
                rn0 rn0Var = (rn0) this.f29462c;
                if (animator == rn0Var.G) {
                    boolean z12 = this.f29461b;
                    if (z12) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    rn0Var.F = f15;
                    rn0Var.setShown(f15);
                    if (!z12) {
                        rn0Var.setVisibility(8);
                    }
                    rn0Var.b(true);
                    return;
                }
                return;
            case 15:
                iv0 iv0Var = (iv0) this.f29462c;
                if (iv0Var.N1 != null) {
                    iv0Var.N1 = null;
                    if (!this.f29461b) {
                        iv0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                super.onAnimationEnd(animator);
                i21 i21Var = (i21) this.f29462c;
                if (this.f29461b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                i21Var.M = f16;
                i21Var.invalidate();
                return;
            case 17:
                f31 f31Var = (f31) this.f29462c;
                if (this.f29461b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                f31Var.F = f17;
                f31Var.h();
                return;
            case 18:
                j31 j31Var = (j31) this.f29462c;
                if (this.f29461b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                j31Var.Q = f18;
                j31Var.h();
                j31Var.g();
                return;
            case 19:
                x61 x61Var = (x61) this.f29462c;
                AnimatorSet animatorSet3 = x61Var.d;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f29461b) {
                        x61Var.e.setVisibility(4);
                    }
                    x61Var.d = null;
                    return;
                }
                return;
            case 20:
                b71 b71Var = (b71) this.f29462c;
                AnimatorSet animatorSet4 = b71Var.f21748r;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f29461b) {
                        b71Var.f21747n.setVisibility(4);
                    }
                    b71Var.f21748r = null;
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.f29462c;
                u2Var.v = null;
                if (this.f29461b) {
                    TextView[] textViewArr = u2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!u2Var.G && (drawable = (drawableArr = u2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                u2Var.G = false;
                if (!u2Var.O) {
                    u2Var.f28485n = u2Var.f28486r;
                }
                u2Var.f28487s = 0.0f;
                u2Var.invalidate();
                return;
            case 22:
                org.telegram.ui.ts tsVar = (org.telegram.ui.ts) this.f29462c;
                if (tsVar.f37007w != null && (radialProgressView = tsVar.f37006s) != null) {
                    if (!this.f29461b) {
                        radialProgressView.setVisibility(4);
                        tsVar.v.setVisibility(4);
                    }
                    tsVar.f37007w = null;
                    return;
                }
                return;
            case 23:
                org.telegram.ui.nz nzVar = (org.telegram.ui.nz) this.f29462c;
                if (this.f29461b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                nzVar.f35365r = f19;
                w9 w9Var = nzVar.f35362c;
                int i11 = org.telegram.ui.ActionBar.j6.C6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i11, nzVar.f35360a);
                int i12 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(nzVar.f35365r, v02, org.telegram.ui.ActionBar.j6.v0(i12, nzVar.f35360a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                nzVar.f35362c.invalidate();
                nzVar.f35363f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - nzVar.f35365r, org.telegram.ui.ActionBar.j6.v0(i11, nzVar.f35360a), org.telegram.ui.ActionBar.j6.v0(i12, nzVar.f35360a)), mode));
                nzVar.f35363f.invalidate();
                return;
            case 24:
                org.telegram.ui.a10 a10Var = (org.telegram.ui.a10) this.f29462c;
                if (this.f29461b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                a10Var.f30772s = f20;
                a10Var.invalidate();
                return;
            case 25:
                org.telegram.ui.j60 j60Var = (org.telegram.ui.j60) this.f29462c;
                j60Var.U2 = null;
                org.telegram.ui.ActionBar.l5 subtitleTextView = j60Var.O.getSubtitleTextView();
                if (this.f29461b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
            case 26:
                org.telegram.ui.k70 k70Var2 = (org.telegram.ui.k70) this.f29462c;
                if (k70Var2.h != null && (kdVar = k70Var2.f34250f) != null) {
                    if (this.f29461b) {
                        kdVar.setVisibility(4);
                    } else {
                        k70Var2.f34251n.setVisibility(4);
                    }
                    k70Var2.h = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.xg0 xg0Var = (org.telegram.ui.xg0) this.f29462c;
                if (!this.f29461b) {
                    xg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet5 = xg0Var.L;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    xg0Var.L = null;
                    return;
                }
                return;
            case 28:
                if (!this.f29461b) {
                    ((PasscodeActivity) this.f29462c).v.setVisibility(8);
                    return;
                }
                return;
            default:
                org.telegram.ui.br0 br0Var = (org.telegram.ui.br0) this.f29462c;
                if (animator.equals(br0Var.f31377k0)) {
                    if (!this.f29461b) {
                        br0Var.Z.setVisibility(4);
                        br0Var.f31364a0.setVisibility(4);
                    }
                    br0Var.f31377k0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29460a) {
            case 27:
                if (this.f29461b) {
                    ((org.telegram.ui.xg0) this.f29462c).V.setVisibility(0);
                    return;
                }
                return;
            case 28:
                if (this.f29461b) {
                    ((PasscodeActivity) this.f29462c).v.setVisibility(0);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public yo(View view) {
        this.f29460a = 7;
        this.f29462c = view;
        this.f29461b = true;
    }

    public yo(View view, boolean z10) {
        this.f29460a = 7;
        this.f29462c = view;
        this.f29461b = z10;
    }
}
