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
public final class u9 extends AnimatorListenerAdapter {
    public final int f32964a;
    public boolean f32965b;
    public final Object f32966c;

    public u9(int i9, Object obj, boolean z10) {
        this.f32964a = i9;
        this.f32966c = obj;
        this.f32965b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32964a) {
            case 0:
                v9 v9Var = (v9) this.f32966c;
                AnimatorSet animatorSet = v9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    v9Var.h = null;
                    return;
                }
                return;
            case 2:
                ((ki) this.f32966c).U0 = null;
                return;
            case 3:
                this.f32965b = true;
                return;
            case 8:
                yz yzVar = (yz) this.f32966c;
                AnimatorSet animatorSet2 = yzVar.f35113e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    yzVar.f35113e = null;
                    return;
                }
                return;
            case 12:
                a60 a60Var = (a60) this.f32966c;
                AnimatorSet animatorSet3 = a60Var.T;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    a60Var.T = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f32966c;
                if (animator.equals(pipRoundVideoView.f26430r)) {
                    pipRoundVideoView.f26430r = null;
                    return;
                }
                return;
            case 19:
                ((eu0) this.f32966c).J1 = null;
                return;
            case 23:
                o51 o51Var = (o51) this.f32966c;
                AnimatorSet animatorSet4 = o51Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    o51Var.d = null;
                    return;
                }
                return;
            case 24:
                s51 s51Var = (s51) this.f32966c;
                AnimatorSet animatorSet5 = s51Var.f32374r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    s51Var.f32374r = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.is) this.f32966c).f39277w = null;
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
        float f12;
        float f13;
        float f14;
        int i9;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        Drawable[] drawableArr;
        Drawable drawable;
        RadialProgressView radialProgressView;
        float f21;
        float f22;
        float dp;
        switch (this.f32964a) {
            case 0:
                v9 v9Var = (v9) this.f32966c;
                AnimatorSet animatorSet = v9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f32965b) {
                        v9Var.f33329c.setVisibility(4);
                        return;
                    } else {
                        v9Var.f33328b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                pc pcVar = (pc) this.f32966c;
                if (animator == pcVar.f31611g) {
                    pcVar.f31611g = null;
                    if (this.f32965b) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    pcVar.f31612i = f10;
                    pcVar.b();
                    return;
                }
                return;
            case 2:
                ki kiVar = (ki) this.f32966c;
                if (kiVar.U0 != null) {
                    if (this.f32965b) {
                        if (kiVar.O0) {
                            ci ciVar = kiVar.f30160u0;
                            if (ciVar == null || ciVar.I()) {
                                kiVar.f30158t1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.w0 w0Var = kiVar.f30097a1;
                    if (w0Var != null) {
                        w0Var.setVisibility(4);
                    }
                    if (kiVar.M0 != 0 || !kiVar.f30134m1) {
                        kiVar.W0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                yn ynVar = (yn) this.f32966c;
                if (!this.f32965b) {
                    o9 o9Var = ynVar.h;
                    ynVar.h = ynVar.f35033n;
                    ynVar.f35033n = o9Var;
                    o9Var.setVisibility(8);
                    ynVar.f35033n.setAlpha(0.0f);
                    ynVar.h.setVisibility(0);
                    ynVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z10 = this.f32965b;
                jo joVar = (jo) this.f32966c;
                if (animator == joVar.f29807e) {
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    joVar.d = f11;
                    joVar.setShown(f11);
                    if (!z10) {
                        joVar.setVisibility(8);
                    }
                    joVar.a(true);
                    return;
                }
                return;
            case 5:
                cp cpVar = (cp) this.f32966c;
                if (this.f32965b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                cpVar.f27524c0 = f12;
                cpVar.F.setTranslationY((-AndroidUtilities.dp(7.0f)) * cpVar.f27524c0);
                return;
            case 6:
                if (!this.f32965b) {
                    ((cq) this.f32966c).D.setVisibility(8);
                    return;
                }
                return;
            case 7:
                jv jvVar = (jv) this.f32966c;
                nv nvVar = jvVar.F;
                if (nvVar.Q && !jvVar.h) {
                    if (!this.f32965b && !jvVar.f29850n) {
                        jvVar.setBackground(null);
                        return;
                    } else if (jvVar.getBackground() == null) {
                        jvVar.setBackground(org.telegram.ui.ActionBar.f6.Y(nvVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                yz yzVar = (yz) this.f32966c;
                AnimatorSet animatorSet2 = yzVar.f35113e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f32965b) {
                        yzVar.f35114f.setVisibility(4);
                    }
                    yzVar.f35113e = null;
                    return;
                }
                return;
            case 9:
                j00 j00Var = (j00) this.f32966c;
                if (this.f32965b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                j00Var.h = f13;
                j00Var.invalidate();
                return;
            case 10:
                j20 j20Var = (j20) this.f32966c;
                h20 h20Var = j20Var.f29598a;
                if (!j20Var.B) {
                    if (this.f32965b) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    j20Var.X = f14;
                    j20Var.Q.setPinnedProgress(f14);
                    h20Var.setScaleX(1.0f - (j20Var.X * 0.6f));
                    h20Var.setScaleY(1.0f - (j20Var.X * 0.6f));
                    if (j20Var.S) {
                        j20Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) this.f32966c;
                if (this.f32965b) {
                    i9 = 8;
                } else {
                    i9 = 4;
                }
                view.setVisibility(i9);
                return;
            case 12:
                a60 a60Var = (a60) this.f32966c;
                AnimatorSet animatorSet3 = a60Var.T;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f32965b) {
                        a60Var.U.setVisibility(4);
                    }
                    a60Var.T = null;
                    return;
                }
                return;
            case 13:
                k60 k60Var = (k60) this.f32966c;
                boolean z11 = this.f32965b;
                if (z11) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                k60Var.f29977d0 = f15;
                k60.V(k60Var).invalidate();
                if (!z11) {
                    k60Var.R.setVisibility(8);
                    return;
                }
                return;
            case 14:
                cb0 cb0Var = (cb0) this.f32966c;
                if (cb0Var.getParent() != null) {
                    ((ViewGroup) cb0Var.getParent()).removeView(cb0Var);
                }
                boolean z12 = this.f32965b;
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) cb0Var;
                MessagePreviewParams messagePreviewParams = wkVar.D.f41857b5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.vk(wkVar, 0), 15L);
                    return;
                }
                return;
            case 15:
                wa0 wa0Var = (wa0) this.f32966c;
                wa0Var.L = null;
                wa0Var.g(this.f32965b, false);
                return;
            case 16:
                yc0 yc0Var = (yc0) this.f32966c;
                TextView textView = yc0Var.f34948w;
                dh.g gVar = yc0Var.f34943e;
                if (this.f32965b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                gVar.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f16));
                gVar.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f16));
                gVar.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f16));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f16));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f16));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f16));
                yc0Var.f34947s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f16));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f32966c;
                if (animator.equals(pipRoundVideoView.f26430r)) {
                    if (!this.f32965b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f26430r = null;
                    return;
                }
                return;
            case 18:
                boolean z13 = this.f32965b;
                sm0 sm0Var = (sm0) this.f32966c;
                if (animator == sm0Var.C) {
                    if (z13) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    sm0Var.B = f17;
                    sm0Var.setShown(f17);
                    if (!z13) {
                        sm0Var.setVisibility(8);
                    }
                    sm0Var.b(true);
                    return;
                }
                return;
            case 19:
                eu0 eu0Var = (eu0) this.f32966c;
                if (eu0Var.J1 != null) {
                    eu0Var.J1 = null;
                    if (!this.f32965b) {
                        eu0Var.f28174x0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                a11 a11Var = (a11) this.f32966c;
                if (this.f32965b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                a11Var.I = f18;
                a11Var.invalidate();
                return;
            case 21:
                v11 v11Var = (v11) this.f32966c;
                if (this.f32965b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                v11Var.B = f19;
                v11Var.h();
                return;
            case 22:
                a21 a21Var = (a21) this.f32966c;
                if (this.f32965b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                a21Var.M = f20;
                a21Var.h();
                a21Var.g();
                return;
            case 23:
                o51 o51Var = (o51) this.f32966c;
                AnimatorSet animatorSet4 = o51Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f32965b) {
                        o51Var.f31299e.setVisibility(4);
                    }
                    o51Var.d = null;
                    return;
                }
                return;
            case 24:
                s51 s51Var = (s51) this.f32966c;
                AnimatorSet animatorSet5 = s51Var.f32374r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f32965b) {
                        s51Var.f32373n.setVisibility(4);
                    }
                    s51Var.f32374r = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.f32966c;
                u2Var.v = null;
                if (this.f32965b) {
                    TextView[] textViewArr = u2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!u2Var.C && (drawable = (drawableArr = u2Var.f33888e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                u2Var.C = false;
                if (!u2Var.K) {
                    u2Var.f33890n = u2Var.f33891r;
                }
                u2Var.f33892s = 0.0f;
                u2Var.invalidate();
                return;
            case 26:
                org.telegram.ui.is isVar = (org.telegram.ui.is) this.f32966c;
                if (isVar.f39277w != null && (radialProgressView = isVar.f39276s) != null) {
                    if (!this.f32965b) {
                        radialProgressView.setVisibility(4);
                        isVar.v.setVisibility(4);
                    }
                    isVar.f39277w = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.f32966c;
                if (this.f32965b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                uyVar.f43340r = f21;
                o9 o9Var2 = uyVar.f43336c;
                int i10 = org.telegram.ui.ActionBar.f6.C6;
                int v02 = org.telegram.ui.ActionBar.f6.v0(i10, uyVar.f43334a);
                int i11 = org.telegram.ui.ActionBar.f6.Oh;
                int d = i0.a.d(uyVar.f43340r, v02, org.telegram.ui.ActionBar.f6.v0(i11, uyVar.f43334a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                o9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                uyVar.f43336c.invalidate();
                uyVar.f43338f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - uyVar.f43340r, org.telegram.ui.ActionBar.f6.v0(i10, uyVar.f43334a), org.telegram.ui.ActionBar.f6.v0(i11, uyVar.f43334a)), mode));
                uyVar.f43338f.invalidate();
                return;
            case 28:
                org.telegram.ui.g00 g00Var = (org.telegram.ui.g00) this.f32966c;
                if (this.f32965b) {
                    f22 = 1.0f;
                } else {
                    f22 = 0.0f;
                }
                g00Var.f38398s = f22;
                g00Var.invalidate();
                return;
            default:
                org.telegram.ui.o50 o50Var = (org.telegram.ui.o50) this.f32966c;
                o50Var.Q2 = null;
                org.telegram.ui.ActionBar.h5 subtitleTextView = o50Var.K.getSubtitleTextView();
                if (this.f32965b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
        }
    }

    public u9(View view) {
        this.f32964a = 11;
        this.f32966c = view;
        this.f32965b = true;
    }

    public u9(View view, boolean z10) {
        this.f32964a = 11;
        this.f32966c = view;
        this.f32965b = z10;
    }

    public u9(yn ynVar) {
        this.f32964a = 3;
        this.f32966c = ynVar;
    }
}
