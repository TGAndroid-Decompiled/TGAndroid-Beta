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
    public final int f23284a;
    public boolean f23285b;
    public final Object f23286c;

    public ca(int i10, Object obj, boolean z10) {
        this.f23284a = i10;
        this.f23286c = obj;
        this.f23285b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23284a) {
            case 0:
                da daVar = (da) this.f23286c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    daVar.h = null;
                    return;
                }
                return;
            case 2:
                ((wi) this.f23286c).Y0 = null;
                return;
            case 3:
                this.f23285b = true;
                return;
            case 8:
                p00 p00Var = (p00) this.f23286c;
                AnimatorSet animatorSet2 = p00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    p00Var.e = null;
                    return;
                }
                return;
            case 12:
                d70 d70Var = (d70) this.f23286c;
                AnimatorSet animatorSet3 = d70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    d70Var.X = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f23286c;
                if (animator.equals(pipRoundVideoView.f22307r)) {
                    pipRoundVideoView.f22307r = null;
                    return;
                }
                return;
            case 19:
                ((kv0) this.f23286c).N1 = null;
                return;
            case 23:
                y61 y61Var = (y61) this.f23286c;
                AnimatorSet animatorSet4 = y61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    y61Var.d = null;
                    return;
                }
                return;
            case 24:
                c71 c71Var = (c71) this.f23286c;
                AnimatorSet animatorSet5 = c71Var.f23261r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    c71Var.f23261r = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.ms) this.f23286c).f35658w = null;
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
        switch (this.f23284a) {
            case 0:
                da daVar = (da) this.f23286c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f23285b) {
                        daVar.f23641c.setVisibility(4);
                        return;
                    } else {
                        daVar.f23640b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                yc ycVar = (yc) this.f23286c;
                if (animator == ycVar.f30623g) {
                    ycVar.f30623g = null;
                    if (this.f23285b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ycVar.f30624i = f7;
                    ycVar.b();
                    return;
                }
                return;
            case 2:
                wi wiVar = (wi) this.f23286c;
                if (wiVar.Y0 != null) {
                    if (this.f23285b) {
                        if (wiVar.S0) {
                            oi oiVar = wiVar.f30081y0;
                            if (oiVar == null || oiVar.J()) {
                                wiVar.f30078x1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.u0 u0Var = wiVar.f30017e1;
                    if (u0Var != null) {
                        u0Var.setVisibility(4);
                    }
                    if (wiVar.Q0 != 0 || !wiVar.f30053q1) {
                        wiVar.f30004a1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                lo loVar = (lo) this.f23286c;
                if (!this.f23285b) {
                    w9 w9Var = loVar.h;
                    loVar.h = loVar.f26132n;
                    loVar.f26132n = w9Var;
                    w9Var.setVisibility(8);
                    loVar.f26132n.setAlpha(0.0f);
                    loVar.h.setVisibility(0);
                    loVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z10 = this.f23285b;
                vo voVar = (vo) this.f23286c;
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
                op opVar = (op) this.f23286c;
                if (this.f23285b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                opVar.f27076g0 = f11;
                opVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * opVar.f27076g0);
                return;
            case 6:
                if (!this.f23285b) {
                    ((oq) this.f23286c).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                aw awVar = (aw) this.f23286c;
                ew ewVar = awVar.J;
                if (ewVar.U && !awVar.h) {
                    if (!this.f23285b && !awVar.f22772n) {
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
                p00 p00Var = (p00) this.f23286c;
                AnimatorSet animatorSet2 = p00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f23285b) {
                        p00Var.f27175f.setVisibility(4);
                    }
                    p00Var.e = null;
                    return;
                }
                return;
            case 9:
                a10 a10Var = (a10) this.f23286c;
                if (this.f23285b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                a10Var.h = f12;
                a10Var.invalidate();
                return;
            case 10:
                b30 b30Var = (b30) this.f23286c;
                z20 z20Var = b30Var.f22876a;
                if (!b30Var.F) {
                    if (this.f23285b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    b30Var.f22879b0 = f13;
                    b30Var.U.setPinnedProgress(f13);
                    z20Var.setScaleX(1.0f - (b30Var.f22879b0 * 0.6f));
                    z20Var.setScaleY(1.0f - (b30Var.f22879b0 * 0.6f));
                    if (b30Var.W) {
                        b30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) this.f23286c;
                if (this.f23285b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 12:
                d70 d70Var = (d70) this.f23286c;
                AnimatorSet animatorSet3 = d70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f23285b) {
                        d70Var.Y.setVisibility(4);
                    }
                    d70Var.X = null;
                    return;
                }
                return;
            case 13:
                n70 n70Var = (n70) this.f23286c;
                boolean z11 = this.f23285b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                n70Var.f26695h0 = f14;
                n70.W(n70Var).invalidate();
                if (!z11) {
                    n70Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                gc0 gc0Var = (gc0) this.f23286c;
                if (gc0Var.getParent() != null) {
                    ((ViewGroup) gc0Var.getParent()).removeView(gc0Var);
                }
                boolean z12 = this.f23285b;
                org.telegram.ui.el elVar = (org.telegram.ui.el) gc0Var;
                MessagePreviewParams messagePreviewParams = elVar.H.f39476f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.dl(elVar, 0), 15L);
                    return;
                }
                return;
            case 15:
                ac0 ac0Var = (ac0) this.f23286c;
                ac0Var.P = null;
                ac0Var.g(this.f23285b, false);
                return;
            case 16:
                de0 de0Var = (de0) this.f23286c;
                TextView textView = de0Var.f23687w;
                ai.w5 w5Var = de0Var.e;
                if (this.f23285b) {
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
                de0Var.f23686s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f23286c;
                if (animator.equals(pipRoundVideoView.f22307r)) {
                    if (!this.f23285b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f22307r = null;
                    return;
                }
                return;
            case 18:
                boolean z13 = this.f23285b;
                vn0 vn0Var = (vn0) this.f23286c;
                if (animator == vn0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    vn0Var.F = f16;
                    vn0Var.setShown(f16);
                    if (!z13) {
                        vn0Var.setVisibility(8);
                    }
                    vn0Var.b(true);
                    return;
                }
                return;
            case 19:
                kv0 kv0Var = (kv0) this.f23286c;
                if (kv0Var.N1 != null) {
                    kv0Var.N1 = null;
                    if (!this.f23285b) {
                        kv0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                i21 i21Var = (i21) this.f23286c;
                if (this.f23285b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                i21Var.M = f17;
                i21Var.invalidate();
                return;
            case 21:
                g31 g31Var = (g31) this.f23286c;
                if (this.f23285b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                g31Var.F = f18;
                g31Var.h();
                return;
            case 22:
                k31 k31Var = (k31) this.f23286c;
                if (this.f23285b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                k31Var.Q = f19;
                k31Var.h();
                k31Var.g();
                return;
            case 23:
                y61 y61Var = (y61) this.f23286c;
                AnimatorSet animatorSet4 = y61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f23285b) {
                        y61Var.e.setVisibility(4);
                    }
                    y61Var.d = null;
                    return;
                }
                return;
            case 24:
                c71 c71Var = (c71) this.f23286c;
                AnimatorSet animatorSet5 = c71Var.f23261r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f23285b) {
                        c71Var.f23260n.setVisibility(4);
                    }
                    c71Var.f23261r = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f23286c;
                w2Var.v = null;
                if (this.f23285b) {
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
                    w2Var.f29645n = w2Var.f29646r;
                }
                w2Var.f29647s = 0.0f;
                w2Var.invalidate();
                return;
            case 26:
                org.telegram.ui.ms msVar = (org.telegram.ui.ms) this.f23286c;
                if (msVar.f35658w != null && (radialProgressView = msVar.f35657s) != null) {
                    if (!this.f23285b) {
                        radialProgressView.setVisibility(4);
                        msVar.v.setVisibility(4);
                    }
                    msVar.f35658w = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.hz hzVar = (org.telegram.ui.hz) this.f23286c;
                if (this.f23285b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                hzVar.f34331r = f20;
                w9 w9Var2 = hzVar.f34328c;
                int i11 = org.telegram.ui.ActionBar.h6.C6;
                int v02 = org.telegram.ui.ActionBar.h6.v0(i11, hzVar.f34326a);
                int i12 = org.telegram.ui.ActionBar.h6.Oh;
                int d = i0.a.d(hzVar.f34331r, v02, org.telegram.ui.ActionBar.h6.v0(i12, hzVar.f34326a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                hzVar.f34328c.invalidate();
                hzVar.f34329f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - hzVar.f34331r, org.telegram.ui.ActionBar.h6.v0(i11, hzVar.f34326a), org.telegram.ui.ActionBar.h6.v0(i12, hzVar.f34326a)), mode));
                hzVar.f34329f.invalidate();
                return;
            case 28:
                org.telegram.ui.u00 u00Var = (org.telegram.ui.u00) this.f23286c;
                if (this.f23285b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                u00Var.f38270s = f21;
                u00Var.invalidate();
                return;
            default:
                org.telegram.ui.d60 d60Var = (org.telegram.ui.d60) this.f23286c;
                d60Var.U2 = null;
                org.telegram.ui.ActionBar.h5 subtitleTextView = d60Var.O.getSubtitleTextView();
                if (this.f23285b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
        }
    }

    public ca(View view) {
        this.f23284a = 11;
        this.f23286c = view;
        this.f23285b = true;
    }

    public ca(View view, boolean z10) {
        this.f23284a = 11;
        this.f23286c = view;
        this.f23285b = z10;
    }

    public ca(lo loVar) {
        this.f23284a = 3;
        this.f23286c = loVar;
    }
}
