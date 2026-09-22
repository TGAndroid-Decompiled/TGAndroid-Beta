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
public final class aa extends AnimatorListenerAdapter {
    public final int f22341a;
    public boolean f22342b;
    public final Object f22343c;

    public aa(int i10, Object obj, boolean z10) {
        this.f22341a = i10;
        this.f22343c = obj;
        this.f22342b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f22341a) {
            case 0:
                ba baVar = (ba) this.f22343c;
                AnimatorSet animatorSet = baVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    baVar.h = null;
                    return;
                }
                return;
            case 2:
                ((vi) this.f22343c).Y0 = null;
                return;
            case 3:
                this.f22342b = true;
                return;
            case 8:
                n00 n00Var = (n00) this.f22343c;
                AnimatorSet animatorSet2 = n00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    n00Var.e = null;
                    return;
                }
                return;
            case 12:
                r60 r60Var = (r60) this.f22343c;
                AnimatorSet animatorSet3 = r60Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    r60Var.X = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f22343c;
                if (animator.equals(pipRoundVideoView.f22082r)) {
                    pipRoundVideoView.f22082r = null;
                    return;
                }
                return;
            case 19:
                ((yu0) this.f22343c).N1 = null;
                return;
            case 23:
                k61 k61Var = (k61) this.f22343c;
                AnimatorSet animatorSet4 = k61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    k61Var.d = null;
                    return;
                }
                return;
            case 24:
                o61 o61Var = (o61) this.f22343c;
                AnimatorSet animatorSet5 = o61Var.f26705r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    o61Var.f26705r = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.ss) this.f22343c).f37453w = null;
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
        switch (this.f22341a) {
            case 0:
                ba baVar = (ba) this.f22343c;
                AnimatorSet animatorSet = baVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f22342b) {
                        baVar.f22722c.setVisibility(4);
                        return;
                    } else {
                        baVar.f22721b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                wc wcVar = (wc) this.f22343c;
                if (animator == wcVar.f29689g) {
                    wcVar.f29689g = null;
                    if (this.f22342b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    wcVar.f29690i = f7;
                    wcVar.b();
                    return;
                }
                return;
            case 2:
                vi viVar = (vi) this.f22343c;
                if (viVar.Y0 != null) {
                    if (this.f22342b) {
                        if (viVar.S0) {
                            ni niVar = viVar.f28808y0;
                            if (niVar == null || niVar.J()) {
                                viVar.f28805x1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.v0 v0Var = viVar.f28744e1;
                    if (v0Var != null) {
                        v0Var.setVisibility(4);
                    }
                    if (viVar.Q0 != 0 || !viVar.f28780q1) {
                        viVar.f28731a1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                jo joVar = (jo) this.f22343c;
                if (!this.f22342b) {
                    u9 u9Var = joVar.h;
                    joVar.h = joVar.f25384n;
                    joVar.f25384n = u9Var;
                    u9Var.setVisibility(8);
                    joVar.f25384n.setAlpha(0.0f);
                    joVar.h.setVisibility(0);
                    joVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z10 = this.f22342b;
                to toVar = (to) this.f22343c;
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
                mp mpVar = (mp) this.f22343c;
                if (this.f22342b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                mpVar.f26201g0 = f11;
                mpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * mpVar.f26201g0);
                return;
            case 6:
                if (!this.f22342b) {
                    ((mq) this.f22343c).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                yv yvVar = (yv) this.f22343c;
                cw cwVar = yvVar.J;
                if (cwVar.U && !yvVar.h) {
                    if (!this.f22342b && !yvVar.f30405n) {
                        yvVar.setBackground(null);
                        return;
                    } else if (yvVar.getBackground() == null) {
                        yvVar.setBackground(org.telegram.ui.ActionBar.i6.Y(cwVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                n00 n00Var = (n00) this.f22343c;
                AnimatorSet animatorSet2 = n00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f22342b) {
                        n00Var.f26277f.setVisibility(4);
                    }
                    n00Var.e = null;
                    return;
                }
                return;
            case 9:
                y00 y00Var = (y00) this.f22343c;
                if (this.f22342b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                y00Var.h = f12;
                y00Var.invalidate();
                return;
            case 10:
                z20 z20Var = (z20) this.f22343c;
                x20 x20Var = z20Var.f30453a;
                if (!z20Var.F) {
                    if (this.f22342b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    z20Var.f30456b0 = f13;
                    z20Var.U.setPinnedProgress(f13);
                    x20Var.setScaleX(1.0f - (z20Var.f30456b0 * 0.6f));
                    x20Var.setScaleY(1.0f - (z20Var.f30456b0 * 0.6f));
                    if (z20Var.W) {
                        z20Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) this.f22343c;
                if (this.f22342b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 12:
                r60 r60Var = (r60) this.f22343c;
                AnimatorSet animatorSet3 = r60Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f22342b) {
                        r60Var.Y.setVisibility(4);
                    }
                    r60Var.X = null;
                    return;
                }
                return;
            case 13:
                b70 b70Var = (b70) this.f22343c;
                boolean z11 = this.f22342b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                b70Var.f22674h0 = f14;
                b70.W(b70Var).invalidate();
                if (!z11) {
                    b70Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                vb0 vb0Var = (vb0) this.f22343c;
                if (vb0Var.getParent() != null) {
                    ((ViewGroup) vb0Var.getParent()).removeView(vb0Var);
                }
                boolean z12 = this.f22342b;
                org.telegram.ui.il ilVar = (org.telegram.ui.il) vb0Var;
                MessagePreviewParams messagePreviewParams = ilVar.H.f32301f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.hl(ilVar, 0), 15L);
                    return;
                }
                return;
            case 15:
                pb0 pb0Var = (pb0) this.f22343c;
                pb0Var.P = null;
                pb0Var.g(this.f22342b, false);
                return;
            case 16:
                sd0 sd0Var = (sd0) this.f22343c;
                TextView textView = sd0Var.f27836w;
                ai.x5 x5Var = sd0Var.e;
                if (this.f22342b) {
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
                sd0Var.f27835s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f22343c;
                if (animator.equals(pipRoundVideoView.f22082r)) {
                    if (!this.f22342b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f22082r = null;
                    return;
                }
                return;
            case 18:
                boolean z13 = this.f22342b;
                hn0 hn0Var = (hn0) this.f22343c;
                if (animator == hn0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    hn0Var.F = f16;
                    hn0Var.setShown(f16);
                    if (!z13) {
                        hn0Var.setVisibility(8);
                    }
                    hn0Var.b(true);
                    return;
                }
                return;
            case 19:
                yu0 yu0Var = (yu0) this.f22343c;
                if (yu0Var.N1 != null) {
                    yu0Var.N1 = null;
                    if (!this.f22342b) {
                        yu0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                u11 u11Var = (u11) this.f22343c;
                if (this.f22342b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                u11Var.M = f17;
                u11Var.invalidate();
                return;
            case 21:
                s21 s21Var = (s21) this.f22343c;
                if (this.f22342b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                s21Var.F = f18;
                s21Var.h();
                return;
            case 22:
                w21 w21Var = (w21) this.f22343c;
                if (this.f22342b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                w21Var.Q = f19;
                w21Var.h();
                w21Var.g();
                return;
            case 23:
                k61 k61Var = (k61) this.f22343c;
                AnimatorSet animatorSet4 = k61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f22342b) {
                        k61Var.e.setVisibility(4);
                    }
                    k61Var.d = null;
                    return;
                }
                return;
            case 24:
                o61 o61Var = (o61) this.f22343c;
                AnimatorSet animatorSet5 = o61Var.f26705r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f22342b) {
                        o61Var.f26704n.setVisibility(4);
                    }
                    o61Var.f26705r = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f22343c;
                v2Var.v = null;
                if (this.f22342b) {
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
                    v2Var.f29313n = v2Var.f29314r;
                }
                v2Var.f29315s = 0.0f;
                v2Var.invalidate();
                return;
            case 26:
                org.telegram.ui.ss ssVar = (org.telegram.ui.ss) this.f22343c;
                if (ssVar.f37453w != null && (radialProgressView = ssVar.f37452s) != null) {
                    if (!this.f22342b) {
                        radialProgressView.setVisibility(4);
                        ssVar.v.setVisibility(4);
                    }
                    ssVar.f37453w = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.lz lzVar = (org.telegram.ui.lz) this.f22343c;
                if (this.f22342b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                lzVar.f35567r = f20;
                u9 u9Var2 = lzVar.f35564c;
                int i11 = org.telegram.ui.ActionBar.i6.C6;
                int v02 = org.telegram.ui.ActionBar.i6.v0(i11, lzVar.f35562a);
                int i12 = org.telegram.ui.ActionBar.i6.Oh;
                int d = i0.a.d(lzVar.f35567r, v02, org.telegram.ui.ActionBar.i6.v0(i12, lzVar.f35562a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                u9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                lzVar.f35564c.invalidate();
                lzVar.f35565f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - lzVar.f35567r, org.telegram.ui.ActionBar.i6.v0(i11, lzVar.f35562a), org.telegram.ui.ActionBar.i6.v0(i12, lzVar.f35562a)), mode));
                lzVar.f35565f.invalidate();
                return;
            case 28:
                org.telegram.ui.y00 y00Var2 = (org.telegram.ui.y00) this.f22343c;
                if (this.f22342b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                y00Var2.f39724s = f21;
                y00Var2.invalidate();
                return;
            default:
                org.telegram.ui.i60 i60Var = (org.telegram.ui.i60) this.f22343c;
                i60Var.U2 = null;
                org.telegram.ui.ActionBar.j5 subtitleTextView = i60Var.O.getSubtitleTextView();
                if (this.f22342b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
        }
    }

    public aa(View view) {
        this.f22341a = 11;
        this.f22343c = view;
        this.f22342b = true;
    }

    public aa(View view, boolean z10) {
        this.f22341a = 11;
        this.f22343c = view;
        this.f22342b = z10;
    }

    public aa(jo joVar) {
        this.f22341a = 3;
        this.f22343c = joVar;
    }
}
