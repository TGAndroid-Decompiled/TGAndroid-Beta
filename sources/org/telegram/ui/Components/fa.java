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
    public final int f26320a;
    public boolean f26321b;
    public final Object f26322c;

    public fa(int i10, Object obj, boolean z10) {
        this.f26320a = i10;
        this.f26322c = obj;
        this.f26321b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26320a) {
            case 0:
                ga gaVar = (ga) this.f26322c;
                AnimatorSet animatorSet = gaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    gaVar.h = null;
                    return;
                }
                return;
            case 2:
                ((yi) this.f26322c).f33214b1 = null;
                return;
            case 3:
                this.f26321b = true;
                return;
            case 8:
                d10 d10Var = (d10) this.f26322c;
                AnimatorSet animatorSet2 = d10Var.f25547e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    d10Var.f25547e = null;
                    return;
                }
                return;
            case 12:
                t70 t70Var = (t70) this.f26322c;
                AnimatorSet animatorSet3 = t70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    t70Var.X = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f26322c;
                if (animator.equals(pipRoundVideoView.f24218r)) {
                    pipRoundVideoView.f24218r = null;
                    return;
                }
                return;
            case 19:
                ((bw0) this.f26322c).N1 = null;
                return;
            case 23:
                p71 p71Var = (p71) this.f26322c;
                AnimatorSet animatorSet4 = p71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    p71Var.d = null;
                    return;
                }
                return;
            case 24:
                t71 t71Var = (t71) this.f26322c;
                AnimatorSet animatorSet5 = t71Var.f31080r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    t71Var.f31080r = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.qs) this.f26322c).f41180w = null;
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
        switch (this.f26320a) {
            case 0:
                ga gaVar = (ga) this.f26322c;
                AnimatorSet animatorSet = gaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f26321b) {
                        gaVar.f26641c.setVisibility(4);
                        return;
                    } else {
                        gaVar.f26640b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                bd bdVar = (bd) this.f26322c;
                if (animator == bdVar.f24976g) {
                    bdVar.f24976g = null;
                    if (this.f26321b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    bdVar.f24978j = f7;
                    bdVar.b();
                    return;
                }
                return;
            case 2:
                yi yiVar = (yi) this.f26322c;
                if (yiVar.f33214b1 != null) {
                    if (this.f26321b) {
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
                    org.telegram.ui.ActionBar.v0 v0Var = yiVar.f33235h1;
                    if (v0Var != null) {
                        v0Var.setVisibility(4);
                    }
                    if (yiVar.T0 != 0 || !yiVar.f33272t1) {
                        yiVar.f33221d1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                zo zoVar = (zo) this.f26322c;
                if (!this.f26321b) {
                    y9 y9Var = zoVar.h;
                    zoVar.h = zoVar.f33610n;
                    zoVar.f33610n = y9Var;
                    y9Var.setVisibility(8);
                    zoVar.f33610n.setAlpha(0.0f);
                    zoVar.h.setVisibility(0);
                    zoVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z10 = this.f26321b;
                jp jpVar = (jp) this.f26322c;
                if (animator == jpVar.f27754e) {
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
                cq cqVar = (cq) this.f26322c;
                if (this.f26321b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                cqVar.f25471g0 = f11;
                cqVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * cqVar.f25471g0);
                return;
            case 6:
                if (!this.f26321b) {
                    ((cr) this.f26322c).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                ow owVar = (ow) this.f26322c;
                sw swVar = owVar.J;
                if (swVar.U && !owVar.h) {
                    if (!this.f26321b && !owVar.f29588n) {
                        owVar.setBackground(null);
                        return;
                    } else if (owVar.getBackground() == null) {
                        owVar.setBackground(org.telegram.ui.ActionBar.i6.Z(swVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                d10 d10Var = (d10) this.f26322c;
                AnimatorSet animatorSet2 = d10Var.f25547e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f26321b) {
                        d10Var.f25548f.setVisibility(4);
                    }
                    d10Var.f25547e = null;
                    return;
                }
                return;
            case 9:
                o10 o10Var = (o10) this.f26322c;
                if (this.f26321b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                o10Var.h = f12;
                o10Var.invalidate();
                return;
            case 10:
                q30 q30Var = (q30) this.f26322c;
                o30 o30Var = q30Var.f30011a;
                if (!q30Var.F) {
                    if (this.f26321b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    q30Var.f30014b0 = f13;
                    q30Var.U.setPinnedProgress(f13);
                    o30Var.setScaleX(1.0f - (q30Var.f30014b0 * 0.6f));
                    o30Var.setScaleY(1.0f - (q30Var.f30014b0 * 0.6f));
                    if (q30Var.W) {
                        q30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) this.f26322c;
                if (this.f26321b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 12:
                t70 t70Var = (t70) this.f26322c;
                AnimatorSet animatorSet3 = t70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f26321b) {
                        t70Var.Y.setVisibility(4);
                    }
                    t70Var.X = null;
                    return;
                }
                return;
            case 13:
                d80 d80Var = (d80) this.f26322c;
                boolean z11 = this.f26321b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                d80Var.f25627h0 = f14;
                d80.X(d80Var).invalidate();
                if (!z11) {
                    d80Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                vc0 vc0Var = (vc0) this.f26322c;
                if (vc0Var.getParent() != null) {
                    ((ViewGroup) vc0Var.getParent()).removeView(vc0Var);
                }
                boolean z12 = this.f26321b;
                org.telegram.ui.jl jlVar = (org.telegram.ui.jl) vc0Var;
                MessagePreviewParams messagePreviewParams = jlVar.H.f44771f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.il(jlVar, 0), 15L);
                    return;
                }
                return;
            case 15:
                pc0 pc0Var = (pc0) this.f26322c;
                pc0Var.P = null;
                pc0Var.g(this.f26321b, false);
                return;
            case 16:
                te0 te0Var = (te0) this.f26322c;
                TextView textView = te0Var.f31170w;
                ai.x5 x5Var = te0Var.f31165e;
                if (this.f26321b) {
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
                te0Var.f31169s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f26322c;
                if (animator.equals(pipRoundVideoView.f24218r)) {
                    if (!this.f26321b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f24218r = null;
                    return;
                }
                return;
            case 18:
                boolean z13 = this.f26321b;
                no0 no0Var = (no0) this.f26322c;
                if (animator == no0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    no0Var.F = f16;
                    no0Var.setShown(f16);
                    if (!z13) {
                        no0Var.setVisibility(8);
                    }
                    no0Var.b(true);
                    return;
                }
                return;
            case 19:
                bw0 bw0Var = (bw0) this.f26322c;
                if (bw0Var.N1 != null) {
                    bw0Var.N1 = null;
                    if (!this.f26321b) {
                        bw0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                z21 z21Var = (z21) this.f26322c;
                if (this.f26321b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                z21Var.M = f17;
                z21Var.invalidate();
                return;
            case 21:
                x31 x31Var = (x31) this.f26322c;
                if (this.f26321b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                x31Var.F = f18;
                x31Var.h();
                return;
            case 22:
                b41 b41Var = (b41) this.f26322c;
                if (this.f26321b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                b41Var.Q = f19;
                b41Var.h();
                b41Var.g();
                return;
            case 23:
                p71 p71Var = (p71) this.f26322c;
                AnimatorSet animatorSet4 = p71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f26321b) {
                        p71Var.f29754e.setVisibility(4);
                    }
                    p71Var.d = null;
                    return;
                }
                return;
            case 24:
                t71 t71Var = (t71) this.f26322c;
                AnimatorSet animatorSet5 = t71Var.f31080r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f26321b) {
                        t71Var.f31079n.setVisibility(4);
                    }
                    t71Var.f31080r = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f26322c;
                v2Var.v = null;
                if (this.f26321b) {
                    TextView[] textViewArr = v2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!v2Var.G && (drawable = (drawableArr = v2Var.f32329e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                v2Var.G = false;
                if (!v2Var.O) {
                    v2Var.f32331n = v2Var.f32332r;
                }
                v2Var.f32333s = 0.0f;
                v2Var.invalidate();
                return;
            case 26:
                org.telegram.ui.qs qsVar = (org.telegram.ui.qs) this.f26322c;
                if (qsVar.f41180w != null && (radialProgressView = qsVar.f41179s) != null) {
                    if (!this.f26321b) {
                        radialProgressView.setVisibility(4);
                        qsVar.v.setVisibility(4);
                    }
                    qsVar.f41180w = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.kz kzVar = (org.telegram.ui.kz) this.f26322c;
                if (this.f26321b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                kzVar.f39378r = f20;
                y9 y9Var2 = kzVar.f39374c;
                int i11 = org.telegram.ui.ActionBar.i6.C6;
                int w02 = org.telegram.ui.ActionBar.i6.w0(i11, kzVar.f39372a);
                int i12 = org.telegram.ui.ActionBar.i6.Oh;
                int d = i0.a.d(kzVar.f39378r, w02, org.telegram.ui.ActionBar.i6.w0(i12, kzVar.f39372a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                y9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                kzVar.f39374c.invalidate();
                kzVar.f39376f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - kzVar.f39378r, org.telegram.ui.ActionBar.i6.w0(i11, kzVar.f39372a), org.telegram.ui.ActionBar.i6.w0(i12, kzVar.f39372a)), mode));
                kzVar.f39376f.invalidate();
                return;
            case 28:
                org.telegram.ui.y00 y00Var = (org.telegram.ui.y00) this.f26322c;
                if (this.f26321b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                y00Var.f44186s = f21;
                y00Var.invalidate();
                return;
            default:
                org.telegram.ui.g60 g60Var = (org.telegram.ui.g60) this.f26322c;
                g60Var.U2 = null;
                org.telegram.ui.ActionBar.j5 subtitleTextView = g60Var.O.getSubtitleTextView();
                if (this.f26321b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
        }
    }

    public fa(View view) {
        this.f26320a = 11;
        this.f26322c = view;
        this.f26321b = true;
    }

    public fa(View view, boolean z10) {
        this.f26320a = 11;
        this.f26322c = view;
        this.f26321b = z10;
    }

    public fa(zo zoVar) {
        this.f26320a = 3;
        this.f26322c = zoVar;
    }
}
