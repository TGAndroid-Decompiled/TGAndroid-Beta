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
import org.telegram.ui.ProfileActivity;
public final class l00 extends AnimatorListenerAdapter {
    public final int f26501a;
    public final boolean f26502b;
    public final Object f26503c;

    public l00(int i10, Object obj, boolean z4) {
        this.f26501a = i10;
        this.f26503c = obj;
        this.f26502b = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26501a) {
            case 0:
                n00 n00Var = (n00) this.f26503c;
                AnimatorSet animatorSet = n00Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    n00Var.e = null;
                    return;
                }
                return;
            case 4:
                s60 s60Var = (s60) this.f26503c;
                AnimatorSet animatorSet2 = s60Var.U;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s60Var.U = null;
                    return;
                }
                return;
            case 9:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f26503c;
                if (animator.equals(pipRoundVideoView.f23075r)) {
                    pipRoundVideoView.f23075r = null;
                    return;
                }
                return;
            case 11:
                ((yu0) this.f26503c).K1 = null;
                return;
            case 15:
                m61 m61Var = (m61) this.f26503c;
                AnimatorSet animatorSet3 = m61Var.d;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    m61Var.d = null;
                    return;
                }
                return;
            case 16:
                q61 q61Var = (q61) this.f26503c;
                AnimatorSet animatorSet4 = q61Var.f28070r;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    q61Var.f28070r = null;
                    return;
                }
                return;
            case 18:
                ((org.telegram.ui.ns) this.f26503c).f36722w = null;
                return;
            case 22:
                ((org.telegram.ui.e70) this.f26503c).h = null;
                return;
            case 25:
                org.telegram.ui.fq0 fq0Var = (org.telegram.ui.fq0) this.f26503c;
                if (animator.equals(fq0Var.f34324h0)) {
                    fq0Var.f34324h0 = null;
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
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        Drawable[] drawableArr;
        Drawable drawable;
        RadialProgressView radialProgressView;
        float f18;
        float f19;
        float dp;
        org.telegram.ui.kd kdVar;
        float f20;
        float f21;
        switch (this.f26501a) {
            case 0:
                n00 n00Var = (n00) this.f26503c;
                AnimatorSet animatorSet = n00Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f26502b) {
                        n00Var.f27150f.setVisibility(4);
                    }
                    n00Var.e = null;
                    return;
                }
                return;
            case 1:
                y00 y00Var = (y00) this.f26503c;
                if (this.f26502b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                y00Var.h = f10;
                y00Var.invalidate();
                return;
            case 2:
                a30 a30Var = (a30) this.f26503c;
                y20 y20Var = a30Var.f23279a;
                if (!a30Var.C) {
                    if (this.f26502b) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    a30Var.Y = f11;
                    a30Var.R.setPinnedProgress(f11);
                    y20Var.setScaleX(1.0f - (a30Var.Y * 0.6f));
                    y20Var.setScaleY(1.0f - (a30Var.Y * 0.6f));
                    if (a30Var.T) {
                        a30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                super.onAnimationEnd(animator);
                View view = (View) this.f26503c;
                if (this.f26502b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 4:
                s60 s60Var = (s60) this.f26503c;
                AnimatorSet animatorSet2 = s60Var.U;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f26502b) {
                        s60Var.V.setVisibility(4);
                    }
                    s60Var.U = null;
                    return;
                }
                return;
            case 5:
                c70 c70Var = (c70) this.f26503c;
                boolean z4 = this.f26502b;
                if (z4) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                c70Var.f23867e0 = f12;
                c70.W(c70Var).invalidate();
                if (!z4) {
                    c70Var.S.setVisibility(8);
                    return;
                }
                return;
            case 6:
                wb0 wb0Var = (wb0) this.f26503c;
                if (wb0Var.getParent() != null) {
                    ((ViewGroup) wb0Var.getParent()).removeView(wb0Var);
                }
                org.telegram.ui.fl flVar = (org.telegram.ui.fl) wb0Var;
                MessagePreviewParams messagePreviewParams = flVar.E.f39976c5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (this.f26502b) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.el(flVar, 0), 15L);
                    return;
                }
                return;
            case 7:
                qb0 qb0Var = (qb0) this.f26503c;
                qb0Var.M = null;
                qb0Var.g(this.f26502b, false);
                return;
            case 8:
                vd0 vd0Var = (vd0) this.f26503c;
                TextView textView = vd0Var.f29440w;
                dh.d dVar = vd0Var.e;
                if (this.f26502b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                dVar.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f13));
                dVar.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f13));
                dVar.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f13));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f13));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f13));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f13));
                vd0Var.f29439s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f13));
                return;
            case 9:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f26503c;
                if (animator.equals(pipRoundVideoView.f23075r)) {
                    if (!this.f26502b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f23075r = null;
                    return;
                }
                return;
            case 10:
                on0 on0Var = (on0) this.f26503c;
                if (animator == on0Var.D) {
                    boolean z10 = this.f26502b;
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    on0Var.C = f14;
                    on0Var.setShown(f14);
                    if (!z10) {
                        on0Var.setVisibility(8);
                    }
                    on0Var.b(true);
                    return;
                }
                return;
            case 11:
                yu0 yu0Var = (yu0) this.f26503c;
                if (yu0Var.K1 != null) {
                    yu0Var.K1 = null;
                    if (!this.f26502b) {
                        yu0Var.f31158y0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                w11 w11Var = (w11) this.f26503c;
                if (this.f26502b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                w11Var.J = f15;
                w11Var.invalidate();
                return;
            case 13:
                r21 r21Var = (r21) this.f26503c;
                if (this.f26502b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                r21Var.C = f16;
                r21Var.h();
                return;
            case 14:
                v21 v21Var = (v21) this.f26503c;
                if (this.f26502b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                v21Var.N = f17;
                v21Var.h();
                v21Var.g();
                return;
            case 15:
                m61 m61Var = (m61) this.f26503c;
                AnimatorSet animatorSet3 = m61Var.d;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f26502b) {
                        m61Var.e.setVisibility(4);
                    }
                    m61Var.d = null;
                    return;
                }
                return;
            case 16:
                q61 q61Var = (q61) this.f26503c;
                AnimatorSet animatorSet4 = q61Var.f28070r;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f26502b) {
                        q61Var.f28069n.setVisibility(4);
                    }
                    q61Var.f28070r = null;
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f26503c;
                v2Var.v = null;
                if (this.f26502b) {
                    TextView[] textViewArr = v2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!v2Var.D && (drawable = (drawableArr = v2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                v2Var.D = false;
                if (!v2Var.L) {
                    v2Var.f30001n = v2Var.f30002r;
                }
                v2Var.f30003s = 0.0f;
                v2Var.invalidate();
                return;
            case 18:
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) this.f26503c;
                if (nsVar.f36722w != null && (radialProgressView = nsVar.f36721s) != null) {
                    if (!this.f26502b) {
                        radialProgressView.setVisibility(4);
                        nsVar.v.setVisibility(4);
                    }
                    nsVar.f36722w = null;
                    return;
                }
                return;
            case 19:
                org.telegram.ui.gz gzVar = (org.telegram.ui.gz) this.f26503c;
                if (this.f26502b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                gzVar.f34707r = f18;
                p9 p9Var = gzVar.f34704c;
                int i11 = org.telegram.ui.ActionBar.j6.C6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i11, gzVar.f34702a);
                int i12 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(gzVar.f34707r, v02, org.telegram.ui.ActionBar.j6.v0(i12, gzVar.f34702a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                p9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                gzVar.f34704c.invalidate();
                gzVar.f34705f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - gzVar.f34707r, org.telegram.ui.ActionBar.j6.v0(i11, gzVar.f34702a), org.telegram.ui.ActionBar.j6.v0(i12, gzVar.f34702a)), mode));
                gzVar.f34705f.invalidate();
                return;
            case 20:
                org.telegram.ui.u00 u00Var = (org.telegram.ui.u00) this.f26503c;
                if (this.f26502b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                u00Var.f38795s = f19;
                u00Var.invalidate();
                return;
            case 21:
                org.telegram.ui.c60 c60Var = (org.telegram.ui.c60) this.f26503c;
                c60Var.R2 = null;
                org.telegram.ui.ActionBar.k5 subtitleTextView = c60Var.L.getSubtitleTextView();
                if (this.f26502b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
            case 22:
                org.telegram.ui.e70 e70Var = (org.telegram.ui.e70) this.f26503c;
                if (e70Var.h != null && (kdVar = e70Var.f33918f) != null) {
                    if (this.f26502b) {
                        kdVar.setVisibility(4);
                    } else {
                        e70Var.f33919n.setVisibility(4);
                    }
                    e70Var.h = null;
                    return;
                }
                return;
            case 23:
                org.telegram.ui.ng0 ng0Var = (org.telegram.ui.ng0) this.f26503c;
                if (!this.f26502b) {
                    ng0Var.S.setVisibility(4);
                }
                AnimatorSet animatorSet5 = ng0Var.I;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    ng0Var.I = null;
                    return;
                }
                return;
            case 24:
                if (!this.f26502b) {
                    ((PasscodeActivity) this.f26503c).v.setVisibility(8);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.fq0 fq0Var = (org.telegram.ui.fq0) this.f26503c;
                if (animator.equals(fq0Var.f34324h0)) {
                    if (!this.f26502b) {
                        fq0Var.W.setVisibility(4);
                        fq0Var.X.setVisibility(4);
                    }
                    fq0Var.f34324h0 = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.rv0 rv0Var = (org.telegram.ui.rv0) this.f26503c;
                if (this.f26502b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                rv0Var.B = f20;
                return;
            case 27:
                org.telegram.ui.j01 j01Var = (org.telegram.ui.j01) this.f26503c;
                if (j01Var.h) {
                    org.telegram.ui.ActionBar.w0 w0Var = j01Var.f35196n.R0;
                    if (w0Var != null) {
                        w0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = j01Var.f35196n;
                    if (profileActivity.K0) {
                        profileActivity.P0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = j01Var.f35196n;
                    if (profileActivity2.I0) {
                        profileActivity2.N0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = j01Var.f35196n;
                    if (profileActivity3.J0) {
                        profileActivity3.O0.setVisibility(8);
                    }
                } else {
                    j01Var.setVisibility(8);
                }
                j01Var.f35196n.l5(false);
                return;
            case 28:
                org.telegram.ui.o11 o11Var = (org.telegram.ui.o11) this.f26503c;
                if (this.f26502b) {
                    o11Var.f36768c.setVisibility(8);
                    return;
                } else {
                    o11Var.f36769f.setVisibility(8);
                    return;
                }
            default:
                org.telegram.ui.p41 p41Var = (org.telegram.ui.p41) this.f26503c;
                if (this.f26502b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                p41Var.v = f21;
                if (p41Var.P) {
                    p41Var.K.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f26501a) {
            case 23:
                if (this.f26502b) {
                    ((org.telegram.ui.ng0) this.f26503c).S.setVisibility(0);
                    return;
                }
                return;
            case 24:
                if (this.f26502b) {
                    ((PasscodeActivity) this.f26503c).v.setVisibility(0);
                    return;
                }
                return;
            case 25:
            case 26:
            default:
                super.onAnimationStart(animator);
                return;
            case 27:
                org.telegram.ui.j01 j01Var = (org.telegram.ui.j01) this.f26503c;
                org.telegram.ui.ActionBar.w0 w0Var = j01Var.f35196n.R0;
                if (w0Var != null && !this.f26502b) {
                    w0Var.setClickable(true);
                }
                ProfileActivity profileActivity = j01Var.f35196n;
                if (profileActivity.K0) {
                    profileActivity.P0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = j01Var.f35196n;
                if (profileActivity2.I0) {
                    profileActivity2.N0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = j01Var.f35196n;
                if (profileActivity3.J0) {
                    profileActivity3.O0.setVisibility(0);
                }
                j01Var.setVisibility(0);
                j01Var.f35196n.l5(false);
                return;
            case 28:
                org.telegram.ui.o11 o11Var = (org.telegram.ui.o11) this.f26503c;
                if (this.f26502b) {
                    o11Var.f36769f.setAlpha(0.0f);
                    o11Var.f36769f.setVisibility(0);
                    return;
                }
                o11Var.f36768c.setAlpha(0.0f);
                o11Var.f36768c.setVisibility(0);
                return;
        }
    }

    public l00(View view) {
        this.f26501a = 3;
        this.f26503c = view;
        this.f26502b = true;
    }

    public l00(View view, boolean z4) {
        this.f26501a = 3;
        this.f26503c = view;
        this.f26502b = z4;
    }
}
