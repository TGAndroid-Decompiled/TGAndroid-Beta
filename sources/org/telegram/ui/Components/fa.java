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
public final class fa extends AnimatorListenerAdapter {
    public final int f26366a;
    public boolean f26367b;
    public final Object f26368c;

    public fa(int i10, Object obj, boolean z10) {
        this.f26366a = i10;
        this.f26368c = obj;
        this.f26367b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26366a) {
            case 0:
                ga gaVar = (ga) this.f26368c;
                AnimatorSet animatorSet = gaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    gaVar.h = null;
                    return;
                }
                return;
            case 2:
                ((yi) this.f26368c).f33221b1 = null;
                return;
            case 3:
                this.f26367b = true;
                return;
            case 8:
                e10 e10Var = (e10) this.f26368c;
                AnimatorSet animatorSet2 = e10Var.f25852e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    e10Var.f25852e = null;
                    return;
                }
                return;
            case 12:
                u70 u70Var = (u70) this.f26368c;
                AnimatorSet animatorSet3 = u70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    u70Var.X = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f26368c;
                if (animator.equals(pipRoundVideoView.f24222r)) {
                    pipRoundVideoView.f24222r = null;
                    return;
                }
                return;
            case 19:
                ((cw0) this.f26368c).N1 = null;
                return;
            case 23:
                q71 q71Var = (q71) this.f26368c;
                AnimatorSet animatorSet4 = q71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    q71Var.d = null;
                    return;
                }
                return;
            case 24:
                u71 u71Var = (u71) this.f26368c;
                AnimatorSet animatorSet5 = u71Var.f31414r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    u71Var.f31414r = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.qs) this.f26368c).f41224w = null;
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
        switch (this.f26366a) {
            case 0:
                ga gaVar = (ga) this.f26368c;
                AnimatorSet animatorSet = gaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f26367b) {
                        gaVar.f26658c.setVisibility(4);
                        return;
                    } else {
                        gaVar.f26657b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                bd bdVar = (bd) this.f26368c;
                if (animator == bdVar.f24927g) {
                    bdVar.f24927g = null;
                    if (this.f26367b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    bdVar.f24929j = f7;
                    bdVar.b();
                    return;
                }
                return;
            case 2:
                yi yiVar = (yi) this.f26368c;
                if (yiVar.f33221b1 != null) {
                    if (this.f26367b) {
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
                    org.telegram.ui.ActionBar.v0 v0Var = yiVar.f33242h1;
                    if (v0Var != null) {
                        v0Var.setVisibility(4);
                    }
                    if (yiVar.T0 != 0 || !yiVar.f33279t1) {
                        yiVar.f33228d1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                zo zoVar = (zo) this.f26368c;
                if (!this.f26367b) {
                    y9 y9Var = zoVar.h;
                    zoVar.h = zoVar.f33638n;
                    zoVar.f33638n = y9Var;
                    y9Var.setVisibility(8);
                    zoVar.f33638n.setAlpha(0.0f);
                    zoVar.h.setVisibility(0);
                    zoVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z10 = this.f26367b;
                jp jpVar = (jp) this.f26368c;
                if (animator == jpVar.f27746e) {
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
                cq cqVar = (cq) this.f26368c;
                if (this.f26367b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                cqVar.f25370g0 = f11;
                cqVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * cqVar.f25370g0);
                return;
            case 6:
                if (!this.f26367b) {
                    ((cr) this.f26368c).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                pw pwVar = (pw) this.f26368c;
                tw twVar = pwVar.J;
                if (twVar.U && !pwVar.h) {
                    if (!this.f26367b && !pwVar.f29875n) {
                        pwVar.setBackground(null);
                        return;
                    } else if (pwVar.getBackground() == null) {
                        pwVar.setBackground(org.telegram.ui.ActionBar.i6.Z(twVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                e10 e10Var = (e10) this.f26368c;
                AnimatorSet animatorSet2 = e10Var.f25852e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f26367b) {
                        e10Var.f25853f.setVisibility(4);
                    }
                    e10Var.f25852e = null;
                    return;
                }
                return;
            case 9:
                p10 p10Var = (p10) this.f26368c;
                if (this.f26367b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                p10Var.h = f12;
                p10Var.invalidate();
                return;
            case 10:
                r30 r30Var = (r30) this.f26368c;
                p30 p30Var = r30Var.f30354a;
                if (!r30Var.F) {
                    if (this.f26367b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    r30Var.f30357b0 = f13;
                    r30Var.U.setPinnedProgress(f13);
                    p30Var.setScaleX(1.0f - (r30Var.f30357b0 * 0.6f));
                    p30Var.setScaleY(1.0f - (r30Var.f30357b0 * 0.6f));
                    if (r30Var.W) {
                        r30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) this.f26368c;
                if (this.f26367b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 12:
                u70 u70Var = (u70) this.f26368c;
                AnimatorSet animatorSet3 = u70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f26367b) {
                        u70Var.Y.setVisibility(4);
                    }
                    u70Var.X = null;
                    return;
                }
                return;
            case 13:
                e80 e80Var = (e80) this.f26368c;
                boolean z11 = this.f26367b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                e80Var.f25947h0 = f14;
                e80.X(e80Var).invalidate();
                if (!z11) {
                    e80Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                wc0 wc0Var = (wc0) this.f26368c;
                if (wc0Var.getParent() != null) {
                    ((ViewGroup) wc0Var.getParent()).removeView(wc0Var);
                }
                boolean z12 = this.f26367b;
                org.telegram.ui.jl jlVar = (org.telegram.ui.jl) wc0Var;
                MessagePreviewParams messagePreviewParams = jlVar.H.f44815f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.il(jlVar, 0), 15L);
                    return;
                }
                return;
            case 15:
                qc0 qc0Var = (qc0) this.f26368c;
                qc0Var.P = null;
                qc0Var.g(this.f26367b, false);
                return;
            case 16:
                ue0 ue0Var = (ue0) this.f26368c;
                TextView textView = ue0Var.f31483w;
                ai.x5 x5Var = ue0Var.f31478e;
                if (this.f26367b) {
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
                ue0Var.f31482s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f26368c;
                if (animator.equals(pipRoundVideoView.f24222r)) {
                    if (!this.f26367b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f24222r = null;
                    return;
                }
                return;
            case 18:
                boolean z13 = this.f26367b;
                oo0 oo0Var = (oo0) this.f26368c;
                if (animator == oo0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    oo0Var.F = f16;
                    oo0Var.setShown(f16);
                    if (!z13) {
                        oo0Var.setVisibility(8);
                    }
                    oo0Var.b(true);
                    return;
                }
                return;
            case 19:
                cw0 cw0Var = (cw0) this.f26368c;
                if (cw0Var.N1 != null) {
                    cw0Var.N1 = null;
                    if (!this.f26367b) {
                        cw0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                a31 a31Var = (a31) this.f26368c;
                if (this.f26367b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                a31Var.M = f17;
                a31Var.invalidate();
                return;
            case 21:
                y31 y31Var = (y31) this.f26368c;
                if (this.f26367b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                y31Var.F = f18;
                y31Var.h();
                return;
            case 22:
                c41 c41Var = (c41) this.f26368c;
                if (this.f26367b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                c41Var.Q = f19;
                c41Var.h();
                c41Var.g();
                return;
            case 23:
                q71 q71Var = (q71) this.f26368c;
                AnimatorSet animatorSet4 = q71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f26367b) {
                        q71Var.f30081e.setVisibility(4);
                    }
                    q71Var.d = null;
                    return;
                }
                return;
            case 24:
                u71 u71Var = (u71) this.f26368c;
                AnimatorSet animatorSet5 = u71Var.f31414r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f26367b) {
                        u71Var.f31413n.setVisibility(4);
                    }
                    u71Var.f31414r = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f26368c;
                v2Var.v = null;
                if (this.f26367b) {
                    TextView[] textViewArr = v2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!v2Var.G && (drawable = (drawableArr = v2Var.f32394e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                v2Var.G = false;
                if (!v2Var.O) {
                    v2Var.f32396n = v2Var.f32397r;
                }
                v2Var.f32398s = 0.0f;
                v2Var.invalidate();
                return;
            case 26:
                org.telegram.ui.qs qsVar = (org.telegram.ui.qs) this.f26368c;
                if (qsVar.f41224w != null && (radialProgressView = qsVar.f41223s) != null) {
                    if (!this.f26367b) {
                        radialProgressView.setVisibility(4);
                        qsVar.v.setVisibility(4);
                    }
                    qsVar.f41224w = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.kz kzVar = (org.telegram.ui.kz) this.f26368c;
                if (this.f26367b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                kzVar.f39422r = f20;
                y9 y9Var2 = kzVar.f39418c;
                int i11 = org.telegram.ui.ActionBar.i6.C6;
                int w02 = org.telegram.ui.ActionBar.i6.w0(i11, kzVar.f39416a);
                int i12 = org.telegram.ui.ActionBar.i6.Oh;
                int d = i0.a.d(kzVar.f39422r, w02, org.telegram.ui.ActionBar.i6.w0(i12, kzVar.f39416a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                y9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                kzVar.f39418c.invalidate();
                kzVar.f39420f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - kzVar.f39422r, org.telegram.ui.ActionBar.i6.w0(i11, kzVar.f39416a), org.telegram.ui.ActionBar.i6.w0(i12, kzVar.f39416a)), mode));
                kzVar.f39420f.invalidate();
                return;
            case 28:
                org.telegram.ui.y00 y00Var = (org.telegram.ui.y00) this.f26368c;
                if (this.f26367b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                y00Var.f44230s = f21;
                y00Var.invalidate();
                return;
            default:
                org.telegram.ui.g60 g60Var = (org.telegram.ui.g60) this.f26368c;
                g60Var.U2 = null;
                org.telegram.ui.ActionBar.j5 subtitleTextView = g60Var.O.getSubtitleTextView();
                if (this.f26367b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
        }
    }

    public fa(View view) {
        this.f26366a = 11;
        this.f26368c = view;
        this.f26367b = true;
    }

    public fa(View view, boolean z10) {
        this.f26366a = 11;
        this.f26368c = view;
        this.f26367b = z10;
    }

    public fa(zo zoVar) {
        this.f26366a = 3;
        this.f26368c = zoVar;
    }
}
