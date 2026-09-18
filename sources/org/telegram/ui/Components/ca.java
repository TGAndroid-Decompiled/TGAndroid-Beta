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
    public final int f23229a;
    public boolean f23230b;
    public final Object f23231c;

    public ca(int i10, Object obj, boolean z10) {
        this.f23229a = i10;
        this.f23231c = obj;
        this.f23230b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23229a) {
            case 0:
                da daVar = (da) this.f23231c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    daVar.h = null;
                    return;
                }
                return;
            case 2:
                ((vi) this.f23231c).Y0 = null;
                return;
            case 3:
                this.f23230b = true;
                return;
            case 8:
                n00 n00Var = (n00) this.f23231c;
                AnimatorSet animatorSet2 = n00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    n00Var.e = null;
                    return;
                }
                return;
            case 12:
                a70 a70Var = (a70) this.f23231c;
                AnimatorSet animatorSet3 = a70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    a70Var.X = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f23231c;
                if (animator.equals(pipRoundVideoView.f22271r)) {
                    pipRoundVideoView.f22271r = null;
                    return;
                }
                return;
            case 19:
                ((kv0) this.f23231c).N1 = null;
                return;
            case 23:
                z61 z61Var = (z61) this.f23231c;
                AnimatorSet animatorSet4 = z61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    z61Var.d = null;
                    return;
                }
                return;
            case 24:
                d71 d71Var = (d71) this.f23231c;
                AnimatorSet animatorSet5 = d71Var.f23473r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    d71Var.f23473r = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.ss) this.f23231c).f37462w = null;
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
        switch (this.f23229a) {
            case 0:
                da daVar = (da) this.f23231c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f23230b) {
                        daVar.f23501c.setVisibility(4);
                        return;
                    } else {
                        daVar.f23500b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                yc ycVar = (yc) this.f23231c;
                if (animator == ycVar.f30549g) {
                    ycVar.f30549g = null;
                    if (this.f23230b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ycVar.f30550i = f7;
                    ycVar.b();
                    return;
                }
                return;
            case 2:
                vi viVar = (vi) this.f23231c;
                if (viVar.Y0 != null) {
                    if (this.f23230b) {
                        if (viVar.S0) {
                            ni niVar = viVar.f29082y0;
                            if (niVar == null || niVar.J()) {
                                viVar.f29079x1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.v0 v0Var = viVar.f29018e1;
                    if (v0Var != null) {
                        v0Var.setVisibility(4);
                    }
                    if (viVar.Q0 != 0 || !viVar.f29054q1) {
                        viVar.f29005a1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                jo joVar = (jo) this.f23231c;
                if (!this.f23230b) {
                    w9 w9Var = joVar.h;
                    joVar.h = joVar.f25393n;
                    joVar.f25393n = w9Var;
                    w9Var.setVisibility(8);
                    joVar.f25393n.setAlpha(0.0f);
                    joVar.h.setVisibility(0);
                    joVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z10 = this.f23230b;
                to toVar = (to) this.f23231c;
                if (animator == toVar.e) {
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    toVar.d = f10;
                    toVar.setShown(f10);
                    if (!z10) {
                        toVar.setVisibility(8);
                    }
                    toVar.a(true);
                    return;
                }
                return;
            case 5:
                mp mpVar = (mp) this.f23231c;
                if (this.f23230b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                mpVar.f26483g0 = f11;
                mpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * mpVar.f26483g0);
                return;
            case 6:
                if (!this.f23230b) {
                    ((mq) this.f23231c).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                yv yvVar = (yv) this.f23231c;
                cw cwVar = yvVar.J;
                if (cwVar.U && !yvVar.h) {
                    if (!this.f23230b && !yvVar.f30676n) {
                        yvVar.setBackground(null);
                        return;
                    } else if (yvVar.getBackground() == null) {
                        yvVar.setBackground(org.telegram.ui.ActionBar.j6.Y(cwVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                n00 n00Var = (n00) this.f23231c;
                AnimatorSet animatorSet2 = n00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f23230b) {
                        n00Var.f26575f.setVisibility(4);
                    }
                    n00Var.e = null;
                    return;
                }
                return;
            case 9:
                y00 y00Var = (y00) this.f23231c;
                if (this.f23230b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                y00Var.h = f12;
                y00Var.invalidate();
                return;
            case 10:
                z20 z20Var = (z20) this.f23231c;
                x20 x20Var = z20Var.f30712a;
                if (!z20Var.F) {
                    if (this.f23230b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    z20Var.f30715b0 = f13;
                    z20Var.U.setPinnedProgress(f13);
                    x20Var.setScaleX(1.0f - (z20Var.f30715b0 * 0.6f));
                    x20Var.setScaleY(1.0f - (z20Var.f30715b0 * 0.6f));
                    if (z20Var.W) {
                        z20Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) this.f23231c;
                if (this.f23230b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 12:
                a70 a70Var = (a70) this.f23231c;
                AnimatorSet animatorSet3 = a70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f23230b) {
                        a70Var.Y.setVisibility(4);
                    }
                    a70Var.X = null;
                    return;
                }
                return;
            case 13:
                k70 k70Var = (k70) this.f23231c;
                boolean z11 = this.f23230b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                k70Var.f25607h0 = f14;
                k70.W(k70Var).invalidate();
                if (!z11) {
                    k70Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                ec0 ec0Var = (ec0) this.f23231c;
                if (ec0Var.getParent() != null) {
                    ((ViewGroup) ec0Var.getParent()).removeView(ec0Var);
                }
                boolean z12 = this.f23230b;
                org.telegram.ui.fl flVar = (org.telegram.ui.fl) ec0Var;
                MessagePreviewParams messagePreviewParams = flVar.H.f40269f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.el(flVar, 1), 15L);
                    return;
                }
                return;
            case 15:
                yb0 yb0Var = (yb0) this.f23231c;
                yb0Var.P = null;
                yb0Var.g(this.f23230b, false);
                return;
            case 16:
                be0 be0Var = (be0) this.f23231c;
                TextView textView = be0Var.f22990w;
                ai.x5 x5Var = be0Var.e;
                if (this.f23230b) {
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
                be0Var.f22989s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f23231c;
                if (animator.equals(pipRoundVideoView.f22271r)) {
                    if (!this.f23230b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f22271r = null;
                    return;
                }
                return;
            case 18:
                boolean z13 = this.f23230b;
                vn0 vn0Var = (vn0) this.f23231c;
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
                kv0 kv0Var = (kv0) this.f23231c;
                if (kv0Var.N1 != null) {
                    kv0Var.N1 = null;
                    if (!this.f23230b) {
                        kv0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                j21 j21Var = (j21) this.f23231c;
                if (this.f23230b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                j21Var.M = f17;
                j21Var.invalidate();
                return;
            case 21:
                h31 h31Var = (h31) this.f23231c;
                if (this.f23230b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                h31Var.F = f18;
                h31Var.h();
                return;
            case 22:
                l31 l31Var = (l31) this.f23231c;
                if (this.f23230b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                l31Var.Q = f19;
                l31Var.h();
                l31Var.g();
                return;
            case 23:
                z61 z61Var = (z61) this.f23231c;
                AnimatorSet animatorSet4 = z61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f23230b) {
                        z61Var.e.setVisibility(4);
                    }
                    z61Var.d = null;
                    return;
                }
                return;
            case 24:
                d71 d71Var = (d71) this.f23231c;
                AnimatorSet animatorSet5 = d71Var.f23473r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f23230b) {
                        d71Var.f23472n.setVisibility(4);
                    }
                    d71Var.f23473r = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f23231c;
                v2Var.v = null;
                if (this.f23230b) {
                    TextView[] textViewArr = v2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!v2Var.G && (drawable = (drawableArr = v2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                v2Var.G = false;
                if (!v2Var.O) {
                    v2Var.f29612n = v2Var.f29613r;
                }
                v2Var.f29614s = 0.0f;
                v2Var.invalidate();
                return;
            case 26:
                org.telegram.ui.ss ssVar = (org.telegram.ui.ss) this.f23231c;
                if (ssVar.f37462w != null && (radialProgressView = ssVar.f37461s) != null) {
                    if (!this.f23230b) {
                        radialProgressView.setVisibility(4);
                        ssVar.v.setVisibility(4);
                    }
                    ssVar.f37462w = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.lz lzVar = (org.telegram.ui.lz) this.f23231c;
                if (this.f23230b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                lzVar.f35474r = f20;
                w9 w9Var2 = lzVar.f35471c;
                int i11 = org.telegram.ui.ActionBar.j6.C6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i11, lzVar.f35469a);
                int i12 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(lzVar.f35474r, v02, org.telegram.ui.ActionBar.j6.v0(i12, lzVar.f35469a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                lzVar.f35471c.invalidate();
                lzVar.f35472f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - lzVar.f35474r, org.telegram.ui.ActionBar.j6.v0(i11, lzVar.f35469a), org.telegram.ui.ActionBar.j6.v0(i12, lzVar.f35469a)), mode));
                lzVar.f35472f.invalidate();
                return;
            case 28:
                org.telegram.ui.y00 y00Var2 = (org.telegram.ui.y00) this.f23231c;
                if (this.f23230b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                y00Var2.f39660s = f21;
                y00Var2.invalidate();
                return;
            default:
                org.telegram.ui.i60 i60Var = (org.telegram.ui.i60) this.f23231c;
                i60Var.U2 = null;
                org.telegram.ui.ActionBar.j5 subtitleTextView = i60Var.O.getSubtitleTextView();
                if (this.f23230b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
        }
    }

    public ca(View view) {
        this.f23229a = 11;
        this.f23231c = view;
        this.f23230b = true;
    }

    public ca(View view, boolean z10) {
        this.f23229a = 11;
        this.f23231c = view;
        this.f23230b = z10;
    }

    public ca(jo joVar) {
        this.f23229a = 3;
        this.f23231c = joVar;
    }
}
