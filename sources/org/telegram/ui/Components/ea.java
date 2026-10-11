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
    public final int f26030a;
    public boolean f26031b;
    public final Object f26032c;

    public ea(int i10, Object obj, boolean z10) {
        this.f26030a = i10;
        this.f26032c = obj;
        this.f26031b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26030a) {
            case 0:
                fa faVar = (fa) this.f26032c;
                AnimatorSet animatorSet = faVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    faVar.h = null;
                    return;
                }
                return;
            case 2:
                ((yi) this.f26032c).f33275b1 = null;
                return;
            case 3:
                this.f26031b = true;
                return;
            case 8:
                e10 e10Var = (e10) this.f26032c;
                AnimatorSet animatorSet2 = e10Var.f25930e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    e10Var.f25930e = null;
                    return;
                }
                return;
            case 12:
                t70 t70Var = (t70) this.f26032c;
                AnimatorSet animatorSet3 = t70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    t70Var.X = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f26032c;
                if (animator.equals(pipRoundVideoView.f24246r)) {
                    pipRoundVideoView.f24246r = null;
                    return;
                }
                return;
            case 19:
                ((cw0) this.f26032c).N1 = null;
                return;
            case 23:
                q71 q71Var = (q71) this.f26032c;
                AnimatorSet animatorSet4 = q71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    q71Var.d = null;
                    return;
                }
                return;
            case 24:
                u71 u71Var = (u71) this.f26032c;
                AnimatorSet animatorSet5 = u71Var.f31471r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    u71Var.f31471r = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.ps) this.f26032c).f40985w = null;
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
        switch (this.f26030a) {
            case 0:
                fa faVar = (fa) this.f26032c;
                AnimatorSet animatorSet = faVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f26031b) {
                        faVar.f26406c.setVisibility(4);
                        return;
                    } else {
                        faVar.f26405b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                bd bdVar = (bd) this.f26032c;
                if (animator == bdVar.f24980g) {
                    bdVar.f24980g = null;
                    if (this.f26031b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    bdVar.f24982j = f7;
                    bdVar.b();
                    return;
                }
                return;
            case 2:
                yi yiVar = (yi) this.f26032c;
                if (yiVar.f33275b1 != null) {
                    if (this.f26031b) {
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
                    org.telegram.ui.ActionBar.u0 u0Var = yiVar.f33296h1;
                    if (u0Var != null) {
                        u0Var.setVisibility(4);
                    }
                    if (yiVar.T0 != 0 || !yiVar.f33333t1) {
                        yiVar.f33282d1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                zo zoVar = (zo) this.f26032c;
                if (!this.f26031b) {
                    y9 y9Var = zoVar.h;
                    zoVar.h = zoVar.f33662n;
                    zoVar.f33662n = y9Var;
                    y9Var.setVisibility(8);
                    zoVar.f33662n.setAlpha(0.0f);
                    zoVar.h.setVisibility(0);
                    zoVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z10 = this.f26031b;
                jp jpVar = (jp) this.f26032c;
                if (animator == jpVar.f27805e) {
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
                cq cqVar = (cq) this.f26032c;
                if (this.f26031b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                cqVar.f25432g0 = f11;
                cqVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * cqVar.f25432g0);
                return;
            case 6:
                if (!this.f26031b) {
                    ((cr) this.f26032c).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                pw pwVar = (pw) this.f26032c;
                tw twVar = pwVar.J;
                if (twVar.U && !pwVar.h) {
                    if (!this.f26031b && !pwVar.f29978n) {
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
                e10 e10Var = (e10) this.f26032c;
                AnimatorSet animatorSet2 = e10Var.f25930e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f26031b) {
                        e10Var.f25931f.setVisibility(4);
                    }
                    e10Var.f25930e = null;
                    return;
                }
                return;
            case 9:
                p10 p10Var = (p10) this.f26032c;
                if (this.f26031b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                p10Var.h = f12;
                p10Var.invalidate();
                return;
            case 10:
                r30 r30Var = (r30) this.f26032c;
                p30 p30Var = r30Var.f30388a;
                if (!r30Var.F) {
                    if (this.f26031b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    r30Var.f30391b0 = f13;
                    r30Var.U.setPinnedProgress(f13);
                    p30Var.setScaleX(1.0f - (r30Var.f30391b0 * 0.6f));
                    p30Var.setScaleY(1.0f - (r30Var.f30391b0 * 0.6f));
                    if (r30Var.W) {
                        r30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) this.f26032c;
                if (this.f26031b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 12:
                t70 t70Var = (t70) this.f26032c;
                AnimatorSet animatorSet3 = t70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f26031b) {
                        t70Var.Y.setVisibility(4);
                    }
                    t70Var.X = null;
                    return;
                }
                return;
            case 13:
                d80 d80Var = (d80) this.f26032c;
                boolean z11 = this.f26031b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                d80Var.f25662h0 = f14;
                d80.X(d80Var).invalidate();
                if (!z11) {
                    d80Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                vc0 vc0Var = (vc0) this.f26032c;
                if (vc0Var.getParent() != null) {
                    ((ViewGroup) vc0Var.getParent()).removeView(vc0Var);
                }
                boolean z12 = this.f26031b;
                org.telegram.ui.jl jlVar = (org.telegram.ui.jl) vc0Var;
                MessagePreviewParams messagePreviewParams = jlVar.H.f44804f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.il(jlVar, 0), 15L);
                    return;
                }
                return;
            case 15:
                pc0 pc0Var = (pc0) this.f26032c;
                pc0Var.P = null;
                pc0Var.g(this.f26031b, false);
                return;
            case 16:
                te0 te0Var = (te0) this.f26032c;
                TextView textView = te0Var.f31232w;
                ai.x5 x5Var = te0Var.f31227e;
                if (this.f26031b) {
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
                te0Var.f31231s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f26032c;
                if (animator.equals(pipRoundVideoView.f24246r)) {
                    if (!this.f26031b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f24246r = null;
                    return;
                }
                return;
            case 18:
                boolean z13 = this.f26031b;
                oo0 oo0Var = (oo0) this.f26032c;
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
                cw0 cw0Var = (cw0) this.f26032c;
                if (cw0Var.N1 != null) {
                    cw0Var.N1 = null;
                    if (!this.f26031b) {
                        cw0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                a31 a31Var = (a31) this.f26032c;
                if (this.f26031b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                a31Var.M = f17;
                a31Var.invalidate();
                return;
            case 21:
                y31 y31Var = (y31) this.f26032c;
                if (this.f26031b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                y31Var.F = f18;
                y31Var.h();
                return;
            case 22:
                c41 c41Var = (c41) this.f26032c;
                if (this.f26031b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                c41Var.Q = f19;
                c41Var.h();
                c41Var.g();
                return;
            case 23:
                q71 q71Var = (q71) this.f26032c;
                AnimatorSet animatorSet4 = q71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f26031b) {
                        q71Var.f30187e.setVisibility(4);
                    }
                    q71Var.d = null;
                    return;
                }
                return;
            case 24:
                u71 u71Var = (u71) this.f26032c;
                AnimatorSet animatorSet5 = u71Var.f31471r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f26031b) {
                        u71Var.f31470n.setVisibility(4);
                    }
                    u71Var.f31471r = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f26032c;
                w2Var.v = null;
                if (this.f26031b) {
                    TextView[] textViewArr = w2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!w2Var.G && (drawable = (drawableArr = w2Var.f32452e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                w2Var.G = false;
                if (!w2Var.O) {
                    w2Var.f32454n = w2Var.f32455r;
                }
                w2Var.f32456s = 0.0f;
                w2Var.invalidate();
                return;
            case 26:
                org.telegram.ui.ps psVar = (org.telegram.ui.ps) this.f26032c;
                if (psVar.f40985w != null && (radialProgressView = psVar.f40984s) != null) {
                    if (!this.f26031b) {
                        radialProgressView.setVisibility(4);
                        psVar.v.setVisibility(4);
                    }
                    psVar.f40985w = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.jz jzVar = (org.telegram.ui.jz) this.f26032c;
                if (this.f26031b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                jzVar.f39184r = f20;
                y9 y9Var2 = jzVar.f39180c;
                int i11 = org.telegram.ui.ActionBar.h6.C6;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i11, jzVar.f39178a);
                int i12 = org.telegram.ui.ActionBar.h6.Oh;
                int d = i0.a.d(jzVar.f39184r, w02, org.telegram.ui.ActionBar.h6.w0(i12, jzVar.f39178a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                y9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                jzVar.f39180c.invalidate();
                jzVar.f39182f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - jzVar.f39184r, org.telegram.ui.ActionBar.h6.w0(i11, jzVar.f39178a), org.telegram.ui.ActionBar.h6.w0(i12, jzVar.f39178a)), mode));
                jzVar.f39182f.invalidate();
                return;
            case 28:
                org.telegram.ui.x00 x00Var = (org.telegram.ui.x00) this.f26032c;
                if (this.f26031b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                x00Var.f43945s = f21;
                x00Var.invalidate();
                return;
            default:
                org.telegram.ui.g60 g60Var = (org.telegram.ui.g60) this.f26032c;
                g60Var.U2 = null;
                org.telegram.ui.ActionBar.h5 subtitleTextView = g60Var.O.getSubtitleTextView();
                if (this.f26031b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
        }
    }

    public ea(View view) {
        this.f26030a = 11;
        this.f26032c = view;
        this.f26031b = true;
    }

    public ea(View view, boolean z10) {
        this.f26030a = 11;
        this.f26032c = view;
        this.f26031b = z10;
    }

    public ea(zo zoVar) {
        this.f26030a = 3;
        this.f26032c = zoVar;
    }
}
