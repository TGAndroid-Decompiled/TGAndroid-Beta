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
public final class ba extends AnimatorListenerAdapter {
    public final int f22930a;
    public boolean f22931b;
    public final Object f22932c;

    public ba(int i10, Object obj, boolean z10) {
        this.f22930a = i10;
        this.f22932c = obj;
        this.f22931b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f22930a) {
            case 0:
                ca caVar = (ca) this.f22932c;
                AnimatorSet animatorSet = caVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    caVar.h = null;
                    return;
                }
                return;
            case 2:
                ((vi) this.f22932c).Y0 = null;
                return;
            case 3:
                this.f22931b = true;
                return;
            case 8:
                n00 n00Var = (n00) this.f22932c;
                AnimatorSet animatorSet2 = n00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    n00Var.e = null;
                    return;
                }
                return;
            case 12:
                c70 c70Var = (c70) this.f22932c;
                AnimatorSet animatorSet3 = c70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    c70Var.X = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f22932c;
                if (animator.equals(pipRoundVideoView.f22322r)) {
                    pipRoundVideoView.f22322r = null;
                    return;
                }
                return;
            case 19:
                ((lv0) this.f22932c).N1 = null;
                return;
            case 23:
                a71 a71Var = (a71) this.f22932c;
                AnimatorSet animatorSet4 = a71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    a71Var.d = null;
                    return;
                }
                return;
            case 24:
                e71 e71Var = (e71) this.f22932c;
                AnimatorSet animatorSet5 = e71Var.f23878r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    e71Var.f23878r = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.ss) this.f22932c).f37541w = null;
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
        switch (this.f22930a) {
            case 0:
                ca caVar = (ca) this.f22932c;
                AnimatorSet animatorSet = caVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f22931b) {
                        caVar.f23324c.setVisibility(4);
                        return;
                    } else {
                        caVar.f23323b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                yc ycVar = (yc) this.f22932c;
                if (animator == ycVar.f30631g) {
                    ycVar.f30631g = null;
                    if (this.f22931b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ycVar.f30632i = f7;
                    ycVar.b();
                    return;
                }
                return;
            case 2:
                vi viVar = (vi) this.f22932c;
                if (viVar.Y0 != null) {
                    if (this.f22931b) {
                        if (viVar.S0) {
                            ni niVar = viVar.f29157y0;
                            if (niVar == null || niVar.J()) {
                                viVar.f29154x1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.v0 v0Var = viVar.f29093e1;
                    if (v0Var != null) {
                        v0Var.setVisibility(4);
                    }
                    if (viVar.Q0 != 0 || !viVar.f29129q1) {
                        viVar.f29080a1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                jo joVar = (jo) this.f22932c;
                if (!this.f22931b) {
                    v9 v9Var = joVar.h;
                    joVar.h = joVar.f25421n;
                    joVar.f25421n = v9Var;
                    v9Var.setVisibility(8);
                    joVar.f25421n.setAlpha(0.0f);
                    joVar.h.setVisibility(0);
                    joVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z10 = this.f22931b;
                to toVar = (to) this.f22932c;
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
                mp mpVar = (mp) this.f22932c;
                if (this.f22931b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                mpVar.f26504g0 = f11;
                mpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * mpVar.f26504g0);
                return;
            case 6:
                if (!this.f22931b) {
                    ((mq) this.f22932c).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                zv zvVar = (zv) this.f22932c;
                dw dwVar = zvVar.J;
                if (dwVar.U && !zvVar.h) {
                    if (!this.f22931b && !zvVar.f30965n) {
                        zvVar.setBackground(null);
                        return;
                    } else if (zvVar.getBackground() == null) {
                        zvVar.setBackground(org.telegram.ui.ActionBar.j6.Y(dwVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                n00 n00Var = (n00) this.f22932c;
                AnimatorSet animatorSet2 = n00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f22931b) {
                        n00Var.f26577f.setVisibility(4);
                    }
                    n00Var.e = null;
                    return;
                }
                return;
            case 9:
                y00 y00Var = (y00) this.f22932c;
                if (this.f22931b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                y00Var.h = f12;
                y00Var.invalidate();
                return;
            case 10:
                z20 z20Var = (z20) this.f22932c;
                x20 x20Var = z20Var.f30793a;
                if (!z20Var.F) {
                    if (this.f22931b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    z20Var.f30796b0 = f13;
                    z20Var.U.setPinnedProgress(f13);
                    x20Var.setScaleX(1.0f - (z20Var.f30796b0 * 0.6f));
                    x20Var.setScaleY(1.0f - (z20Var.f30796b0 * 0.6f));
                    if (z20Var.W) {
                        z20Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) this.f22932c;
                if (this.f22931b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 12:
                c70 c70Var = (c70) this.f22932c;
                AnimatorSet animatorSet3 = c70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f22931b) {
                        c70Var.Y.setVisibility(4);
                    }
                    c70Var.X = null;
                    return;
                }
                return;
            case 13:
                m70 m70Var = (m70) this.f22932c;
                boolean z11 = this.f22931b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                m70Var.f26357h0 = f14;
                m70.W(m70Var).invalidate();
                if (!z11) {
                    m70Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                gc0 gc0Var = (gc0) this.f22932c;
                if (gc0Var.getParent() != null) {
                    ((ViewGroup) gc0Var.getParent()).removeView(gc0Var);
                }
                boolean z12 = this.f22931b;
                org.telegram.ui.gl glVar = (org.telegram.ui.gl) gc0Var;
                MessagePreviewParams messagePreviewParams = glVar.H.f40332f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.fl(glVar, 0), 15L);
                    return;
                }
                return;
            case 15:
                ac0 ac0Var = (ac0) this.f22932c;
                ac0Var.P = null;
                ac0Var.g(this.f22931b, false);
                return;
            case 16:
                de0 de0Var = (de0) this.f22932c;
                TextView textView = de0Var.f23674w;
                ai.x5 x5Var = de0Var.e;
                if (this.f22931b) {
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
                de0Var.f23673s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f22932c;
                if (animator.equals(pipRoundVideoView.f22322r)) {
                    if (!this.f22931b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f22322r = null;
                    return;
                }
                return;
            case 18:
                boolean z13 = this.f22931b;
                wn0 wn0Var = (wn0) this.f22932c;
                if (animator == wn0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    wn0Var.F = f16;
                    wn0Var.setShown(f16);
                    if (!z13) {
                        wn0Var.setVisibility(8);
                    }
                    wn0Var.b(true);
                    return;
                }
                return;
            case 19:
                lv0 lv0Var = (lv0) this.f22932c;
                if (lv0Var.N1 != null) {
                    lv0Var.N1 = null;
                    if (!this.f22931b) {
                        lv0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                k21 k21Var = (k21) this.f22932c;
                if (this.f22931b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                k21Var.M = f17;
                k21Var.invalidate();
                return;
            case 21:
                i31 i31Var = (i31) this.f22932c;
                if (this.f22931b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                i31Var.F = f18;
                i31Var.h();
                return;
            case 22:
                m31 m31Var = (m31) this.f22932c;
                if (this.f22931b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                m31Var.Q = f19;
                m31Var.h();
                m31Var.g();
                return;
            case 23:
                a71 a71Var = (a71) this.f22932c;
                AnimatorSet animatorSet4 = a71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f22931b) {
                        a71Var.e.setVisibility(4);
                    }
                    a71Var.d = null;
                    return;
                }
                return;
            case 24:
                e71 e71Var = (e71) this.f22932c;
                AnimatorSet animatorSet5 = e71Var.f23878r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f22931b) {
                        e71Var.f23877n.setVisibility(4);
                    }
                    e71Var.f23878r = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f22932c;
                v2Var.v = null;
                if (this.f22931b) {
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
                    v2Var.f29681n = v2Var.f29682r;
                }
                v2Var.f29683s = 0.0f;
                v2Var.invalidate();
                return;
            case 26:
                org.telegram.ui.ss ssVar = (org.telegram.ui.ss) this.f22932c;
                if (ssVar.f37541w != null && (radialProgressView = ssVar.f37540s) != null) {
                    if (!this.f22931b) {
                        radialProgressView.setVisibility(4);
                        ssVar.v.setVisibility(4);
                    }
                    ssVar.f37541w = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.lz lzVar = (org.telegram.ui.lz) this.f22932c;
                if (this.f22931b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                lzVar.f35571r = f20;
                v9 v9Var2 = lzVar.f35568c;
                int i11 = org.telegram.ui.ActionBar.j6.C6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i11, lzVar.f35566a);
                int i12 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(lzVar.f35571r, v02, org.telegram.ui.ActionBar.j6.v0(i12, lzVar.f35566a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                v9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                lzVar.f35568c.invalidate();
                lzVar.f35569f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - lzVar.f35571r, org.telegram.ui.ActionBar.j6.v0(i11, lzVar.f35566a), org.telegram.ui.ActionBar.j6.v0(i12, lzVar.f35566a)), mode));
                lzVar.f35569f.invalidate();
                return;
            case 28:
                org.telegram.ui.y00 y00Var2 = (org.telegram.ui.y00) this.f22932c;
                if (this.f22931b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                y00Var2.f39785s = f21;
                y00Var2.invalidate();
                return;
            default:
                org.telegram.ui.i60 i60Var = (org.telegram.ui.i60) this.f22932c;
                i60Var.U2 = null;
                org.telegram.ui.ActionBar.j5 subtitleTextView = i60Var.O.getSubtitleTextView();
                if (this.f22931b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
        }
    }

    public ba(View view) {
        this.f22930a = 11;
        this.f22932c = view;
        this.f22931b = true;
    }

    public ba(View view, boolean z10) {
        this.f22930a = 11;
        this.f22932c = view;
        this.f22931b = z10;
    }

    public ba(jo joVar) {
        this.f22930a = 3;
        this.f22932c = joVar;
    }
}
