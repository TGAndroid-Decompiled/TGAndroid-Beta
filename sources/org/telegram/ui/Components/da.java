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
    public final int f25734a;
    public boolean f25735b;
    public final Object f25736c;

    public da(int i10, Object obj, boolean z10) {
        this.f25734a = i10;
        this.f25736c = obj;
        this.f25735b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25734a) {
            case 0:
                ea eaVar = (ea) this.f25736c;
                AnimatorSet animatorSet = eaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    eaVar.h = null;
                    return;
                }
                return;
            case 2:
                ((xi) this.f25736c).Y0 = null;
                return;
            case 3:
                this.f25735b = true;
                return;
            case 8:
                q00 q00Var = (q00) this.f25736c;
                AnimatorSet animatorSet2 = q00Var.f29889e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q00Var.f29889e = null;
                    return;
                }
                return;
            case 12:
                f70 f70Var = (f70) this.f25736c;
                AnimatorSet animatorSet3 = f70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    f70Var.X = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f25736c;
                if (animator.equals(pipRoundVideoView.f24222r)) {
                    pipRoundVideoView.f24222r = null;
                    return;
                }
                return;
            case 19:
                ((qv0) this.f25736c).N1 = null;
                return;
            case 23:
                k71 k71Var = (k71) this.f25736c;
                AnimatorSet animatorSet4 = k71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    k71Var.d = null;
                    return;
                }
                return;
            case 24:
                o71 o71Var = (o71) this.f25736c;
                AnimatorSet animatorSet5 = o71Var.f29393r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    o71Var.f29393r = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.qs) this.f25736c).f39877w = null;
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
        switch (this.f25734a) {
            case 0:
                ea eaVar = (ea) this.f25736c;
                AnimatorSet animatorSet = eaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f25735b) {
                        eaVar.f26092c.setVisibility(4);
                        return;
                    } else {
                        eaVar.f26091b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                zc zcVar = (zc) this.f25736c;
                if (animator == zcVar.f33487g) {
                    zcVar.f33487g = null;
                    if (this.f25735b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    zcVar.f33488i = f7;
                    zcVar.b();
                    return;
                }
                return;
            case 2:
                xi xiVar = (xi) this.f25736c;
                if (xiVar.Y0 != null) {
                    if (this.f25735b) {
                        if (xiVar.S0) {
                            pi piVar = xiVar.f32971y0;
                            if (piVar == null || piVar.H()) {
                                xiVar.f32968x1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.v0 v0Var = xiVar.f32907e1;
                    if (v0Var != null) {
                        v0Var.setVisibility(4);
                    }
                    if (xiVar.Q0 != 0 || !xiVar.f32943q1) {
                        xiVar.f32893a1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                mo moVar = (mo) this.f25736c;
                if (!this.f25735b) {
                    w9 w9Var = moVar.h;
                    moVar.h = moVar.f28751n;
                    moVar.f28751n = w9Var;
                    w9Var.setVisibility(8);
                    moVar.f28751n.setAlpha(0.0f);
                    moVar.h.setVisibility(0);
                    moVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z10 = this.f25735b;
                wo woVar = (wo) this.f25736c;
                if (animator == woVar.f32676e) {
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
                pp ppVar = (pp) this.f25736c;
                if (this.f25735b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ppVar.f29790g0 = f11;
                ppVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * ppVar.f29790g0);
                return;
            case 6:
                if (!this.f25735b) {
                    ((pq) this.f25736c).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                cw cwVar = (cw) this.f25736c;
                gw gwVar = cwVar.J;
                if (gwVar.U && !cwVar.h) {
                    if (!this.f25735b && !cwVar.f25533n) {
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
                q00 q00Var = (q00) this.f25736c;
                AnimatorSet animatorSet2 = q00Var.f29889e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f25735b) {
                        q00Var.f29890f.setVisibility(4);
                    }
                    q00Var.f29889e = null;
                    return;
                }
                return;
            case 9:
                b10 b10Var = (b10) this.f25736c;
                if (this.f25735b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                b10Var.h = f12;
                b10Var.invalidate();
                return;
            case 10:
                d30 d30Var = (d30) this.f25736c;
                b30 b30Var = d30Var.f25601a;
                if (!d30Var.F) {
                    if (this.f25735b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    d30Var.f25604b0 = f13;
                    d30Var.U.setPinnedProgress(f13);
                    b30Var.setScaleX(1.0f - (d30Var.f25604b0 * 0.6f));
                    b30Var.setScaleY(1.0f - (d30Var.f25604b0 * 0.6f));
                    if (d30Var.W) {
                        d30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) this.f25736c;
                if (this.f25735b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 12:
                f70 f70Var = (f70) this.f25736c;
                AnimatorSet animatorSet3 = f70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f25735b) {
                        f70Var.Y.setVisibility(4);
                    }
                    f70Var.X = null;
                    return;
                }
                return;
            case 13:
                p70 p70Var = (p70) this.f25736c;
                boolean z11 = this.f25735b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                p70Var.f29624h0 = f14;
                p70.U(p70Var).invalidate();
                if (!z11) {
                    p70Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                ic0 ic0Var = (ic0) this.f25736c;
                if (ic0Var.getParent() != null) {
                    ((ViewGroup) ic0Var.getParent()).removeView(ic0Var);
                }
                boolean z12 = this.f25735b;
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
                cc0 cc0Var = (cc0) this.f25736c;
                cc0Var.P = null;
                cc0Var.g(this.f25735b, false);
                return;
            case 16:
                ee0 ee0Var = (ee0) this.f25736c;
                TextView textView = ee0Var.f26134w;
                ai.w5 w5Var = ee0Var.f26129e;
                if (this.f25735b) {
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
                ee0Var.f26133s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f25736c;
                if (animator.equals(pipRoundVideoView.f24222r)) {
                    if (!this.f25735b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f24222r = null;
                    return;
                }
                return;
            case 18:
                boolean z13 = this.f25735b;
                ao0 ao0Var = (ao0) this.f25736c;
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
                qv0 qv0Var = (qv0) this.f25736c;
                if (qv0Var.N1 != null) {
                    qv0Var.N1 = null;
                    if (!this.f25735b) {
                        qv0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                t21 t21Var = (t21) this.f25736c;
                if (this.f25735b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                t21Var.M = f17;
                t21Var.invalidate();
                return;
            case 21:
                r31 r31Var = (r31) this.f25736c;
                if (this.f25735b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                r31Var.F = f18;
                r31Var.h();
                return;
            case 22:
                v31 v31Var = (v31) this.f25736c;
                if (this.f25735b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                v31Var.Q = f19;
                v31Var.h();
                v31Var.g();
                return;
            case 23:
                k71 k71Var = (k71) this.f25736c;
                AnimatorSet animatorSet4 = k71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f25735b) {
                        k71Var.f28080e.setVisibility(4);
                    }
                    k71Var.d = null;
                    return;
                }
                return;
            case 24:
                o71 o71Var = (o71) this.f25736c;
                AnimatorSet animatorSet5 = o71Var.f29393r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f25735b) {
                        o71Var.f29392n.setVisibility(4);
                    }
                    o71Var.f29393r = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f25736c;
                w2Var.v = null;
                if (this.f25735b) {
                    TextView[] textViewArr = w2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!w2Var.G && (drawable = (drawableArr = w2Var.f32333e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                w2Var.G = false;
                if (!w2Var.O) {
                    w2Var.f32335n = w2Var.f32336r;
                }
                w2Var.f32337s = 0.0f;
                w2Var.invalidate();
                return;
            case 26:
                org.telegram.ui.qs qsVar = (org.telegram.ui.qs) this.f25736c;
                if (qsVar.f39877w != null && (radialProgressView = qsVar.f39876s) != null) {
                    if (!this.f25735b) {
                        radialProgressView.setVisibility(4);
                        qsVar.v.setVisibility(4);
                    }
                    qsVar.f39877w = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.lz lzVar = (org.telegram.ui.lz) this.f25736c;
                if (this.f25735b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                lzVar.f38429r = f20;
                w9 w9Var2 = lzVar.f38425c;
                int i11 = org.telegram.ui.ActionBar.i6.C6;
                int v02 = org.telegram.ui.ActionBar.i6.v0(i11, lzVar.f38423a);
                int i12 = org.telegram.ui.ActionBar.i6.Oh;
                int d = i0.a.d(lzVar.f38429r, v02, org.telegram.ui.ActionBar.i6.v0(i12, lzVar.f38423a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                lzVar.f38425c.invalidate();
                lzVar.f38427f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - lzVar.f38429r, org.telegram.ui.ActionBar.i6.v0(i11, lzVar.f38423a), org.telegram.ui.ActionBar.i6.v0(i12, lzVar.f38423a)), mode));
                lzVar.f38427f.invalidate();
                return;
            case 28:
                org.telegram.ui.y00 y00Var = (org.telegram.ui.y00) this.f25736c;
                if (this.f25735b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                y00Var.f43053s = f21;
                y00Var.invalidate();
                return;
            default:
                org.telegram.ui.h60 h60Var = (org.telegram.ui.h60) this.f25736c;
                h60Var.U2 = null;
                org.telegram.ui.ActionBar.i5 subtitleTextView = h60Var.O.getSubtitleTextView();
                if (this.f25735b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
        }
    }

    public da(View view) {
        this.f25734a = 11;
        this.f25736c = view;
        this.f25735b = true;
    }

    public da(View view, boolean z10) {
        this.f25734a = 11;
        this.f25736c = view;
        this.f25735b = z10;
    }

    public da(mo moVar) {
        this.f25734a = 3;
        this.f25736c = moVar;
    }
}
