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
    public final int f25643a;
    public boolean f25644b;
    public final Object f25645c;

    public ea(int i10, Object obj, boolean z10) {
        this.f25643a = i10;
        this.f25645c = obj;
        this.f25644b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25643a) {
            case 0:
                fa faVar = (fa) this.f25645c;
                AnimatorSet animatorSet = faVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    faVar.h = null;
                    return;
                }
                return;
            case 2:
                ((aj) this.f25645c).f24328b1 = null;
                return;
            case 3:
                this.f25644b = true;
                return;
            case 8:
                g10 g10Var = (g10) this.f25645c;
                AnimatorSet animatorSet2 = g10Var.f26215e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    g10Var.f26215e = null;
                    return;
                }
                return;
            case 12:
                w70 w70Var = (w70) this.f25645c;
                AnimatorSet animatorSet3 = w70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    w70Var.X = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f25645c;
                if (animator.equals(pipRoundVideoView.f23995r)) {
                    pipRoundVideoView.f23995r = null;
                    return;
                }
                return;
            case 19:
                ((hw0) this.f25645c).N1 = null;
                return;
            case 23:
                u71 u71Var = (u71) this.f25645c;
                AnimatorSet animatorSet4 = u71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    u71Var.d = null;
                    return;
                }
                return;
            case 24:
                y71 y71Var = (y71) this.f25645c;
                AnimatorSet animatorSet5 = y71Var.f32974r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    y71Var.f32974r = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.ts) this.f25645c).f42281w = null;
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
        switch (this.f25643a) {
            case 0:
                fa faVar = (fa) this.f25645c;
                AnimatorSet animatorSet = faVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f25644b) {
                        faVar.f25986c.setVisibility(4);
                        return;
                    } else {
                        faVar.f25985b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                ad adVar = (ad) this.f25645c;
                if (animator == adVar.f24285g) {
                    adVar.f24285g = null;
                    if (this.f25644b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    adVar.f24287j = f7;
                    adVar.b();
                    return;
                }
                return;
            case 2:
                aj ajVar = (aj) this.f25645c;
                if (ajVar.f24328b1 != null) {
                    if (this.f25644b) {
                        if (ajVar.V0) {
                            si siVar = ajVar.B0;
                            if (siVar == null || siVar.L()) {
                                ajVar.A1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.u0 u0Var = ajVar.f24349h1;
                    if (u0Var != null) {
                        u0Var.setVisibility(4);
                    }
                    if (ajVar.T0 != 0 || !ajVar.f24386t1) {
                        ajVar.f24335d1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                bp bpVar = (bp) this.f25645c;
                if (!this.f25644b) {
                    y9 y9Var = bpVar.h;
                    bpVar.h = bpVar.f24707n;
                    bpVar.f24707n = y9Var;
                    y9Var.setVisibility(8);
                    bpVar.f24707n.setAlpha(0.0f);
                    bpVar.h.setVisibility(0);
                    bpVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z10 = this.f25644b;
                lp lpVar = (lp) this.f25645c;
                if (animator == lpVar.f28259e) {
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    lpVar.d = f10;
                    lpVar.setShown(f10);
                    if (!z10) {
                        lpVar.setVisibility(8);
                    }
                    lpVar.a(true);
                    return;
                }
                return;
            case 5:
                eq eqVar = (eq) this.f25645c;
                if (this.f25644b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                eqVar.f25754g0 = f11;
                eqVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * eqVar.f25754g0);
                return;
            case 6:
                if (!this.f25644b) {
                    ((er) this.f25645c).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                rw rwVar = (rw) this.f25645c;
                vw vwVar = rwVar.J;
                if (vwVar.U && !rwVar.h) {
                    if (!this.f25644b && !rwVar.f30264n) {
                        rwVar.setBackground(null);
                        return;
                    } else if (rwVar.getBackground() == null) {
                        rwVar.setBackground(org.telegram.ui.ActionBar.h6.Z(vwVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                g10 g10Var = (g10) this.f25645c;
                AnimatorSet animatorSet2 = g10Var.f26215e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f25644b) {
                        g10Var.f26216f.setVisibility(4);
                    }
                    g10Var.f26215e = null;
                    return;
                }
                return;
            case 9:
                r10 r10Var = (r10) this.f25645c;
                if (this.f25644b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                r10Var.h = f12;
                r10Var.invalidate();
                return;
            case 10:
                t30 t30Var = (t30) this.f25645c;
                r30 r30Var = t30Var.f30741a;
                if (!t30Var.F) {
                    if (this.f25644b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    t30Var.f30744b0 = f13;
                    t30Var.U.setPinnedProgress(f13);
                    r30Var.setScaleX(1.0f - (t30Var.f30744b0 * 0.6f));
                    r30Var.setScaleY(1.0f - (t30Var.f30744b0 * 0.6f));
                    if (t30Var.W) {
                        t30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) this.f25645c;
                if (this.f25644b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 12:
                w70 w70Var = (w70) this.f25645c;
                AnimatorSet animatorSet3 = w70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f25644b) {
                        w70Var.Y.setVisibility(4);
                    }
                    w70Var.X = null;
                    return;
                }
                return;
            case 13:
                g80 g80Var = (g80) this.f25645c;
                boolean z11 = this.f25644b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                g80Var.f26330h0 = f14;
                g80.X(g80Var).invalidate();
                if (!z11) {
                    g80Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                zc0 zc0Var = (zc0) this.f25645c;
                if (zc0Var.getParent() != null) {
                    ((ViewGroup) zc0Var.getParent()).removeView(zc0Var);
                }
                boolean z12 = this.f25644b;
                org.telegram.ui.nl nlVar = (org.telegram.ui.nl) zc0Var;
                MessagePreviewParams messagePreviewParams = nlVar.H.f37259f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ml(nlVar, 0), 15L);
                    return;
                }
                return;
            case 15:
                tc0 tc0Var = (tc0) this.f25645c;
                tc0Var.P = null;
                tc0Var.g(this.f25644b, false);
                return;
            case 16:
                xe0 xe0Var = (xe0) this.f25645c;
                TextView textView = xe0Var.f32748w;
                ai.x5 x5Var = xe0Var.f32743e;
                if (this.f25644b) {
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
                xe0Var.f32747s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f25645c;
                if (animator.equals(pipRoundVideoView.f23995r)) {
                    if (!this.f25644b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f23995r = null;
                    return;
                }
                return;
            case 18:
                boolean z13 = this.f25644b;
                to0 to0Var = (to0) this.f25645c;
                if (animator == to0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    to0Var.F = f16;
                    to0Var.setShown(f16);
                    if (!z13) {
                        to0Var.setVisibility(8);
                    }
                    to0Var.b(true);
                    return;
                }
                return;
            case 19:
                hw0 hw0Var = (hw0) this.f25645c;
                if (hw0Var.N1 != null) {
                    hw0Var.N1 = null;
                    if (!this.f25644b) {
                        hw0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                f31 f31Var = (f31) this.f25645c;
                if (this.f25644b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                f31Var.M = f17;
                f31Var.invalidate();
                return;
            case 21:
                c41 c41Var = (c41) this.f25645c;
                if (this.f25644b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                c41Var.F = f18;
                c41Var.h();
                return;
            case 22:
                g41 g41Var = (g41) this.f25645c;
                if (this.f25644b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                g41Var.Q = f19;
                g41Var.h();
                g41Var.g();
                return;
            case 23:
                u71 u71Var = (u71) this.f25645c;
                AnimatorSet animatorSet4 = u71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f25644b) {
                        u71Var.f31099e.setVisibility(4);
                    }
                    u71Var.d = null;
                    return;
                }
                return;
            case 24:
                y71 y71Var = (y71) this.f25645c;
                AnimatorSet animatorSet5 = y71Var.f32974r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f25644b) {
                        y71Var.f32973n.setVisibility(4);
                    }
                    y71Var.f32974r = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f25645c;
                w2Var.v = null;
                if (this.f25644b) {
                    TextView[] textViewArr = w2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!w2Var.G && (drawable = (drawableArr = w2Var.f32088e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                w2Var.G = false;
                if (!w2Var.O) {
                    w2Var.f32090n = w2Var.f32091r;
                }
                w2Var.f32092s = 0.0f;
                w2Var.invalidate();
                return;
            case 26:
                org.telegram.ui.ts tsVar = (org.telegram.ui.ts) this.f25645c;
                if (tsVar.f42281w != null && (radialProgressView = tsVar.f42280s) != null) {
                    if (!this.f25644b) {
                        radialProgressView.setVisibility(4);
                        tsVar.v.setVisibility(4);
                    }
                    tsVar.f42281w = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.mz mzVar = (org.telegram.ui.mz) this.f25645c;
                if (this.f25644b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                mzVar.f40156r = f20;
                y9 y9Var2 = mzVar.f40152c;
                int i11 = org.telegram.ui.ActionBar.h6.C6;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i11, mzVar.f40150a);
                int i12 = org.telegram.ui.ActionBar.h6.Oh;
                int d = i0.a.d(mzVar.f40156r, w02, org.telegram.ui.ActionBar.h6.w0(i12, mzVar.f40150a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                y9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                mzVar.f40152c.invalidate();
                mzVar.f40154f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - mzVar.f40156r, org.telegram.ui.ActionBar.h6.w0(i11, mzVar.f40150a), org.telegram.ui.ActionBar.h6.w0(i12, mzVar.f40150a)), mode));
                mzVar.f40154f.invalidate();
                return;
            case 28:
                org.telegram.ui.a10 a10Var = (org.telegram.ui.a10) this.f25645c;
                if (this.f25644b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                a10Var.f35659s = f21;
                a10Var.invalidate();
                return;
            default:
                org.telegram.ui.i60 i60Var = (org.telegram.ui.i60) this.f25645c;
                i60Var.U2 = null;
                org.telegram.ui.ActionBar.h5 subtitleTextView = i60Var.O.getSubtitleTextView();
                if (this.f25644b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
        }
    }

    public ea(View view) {
        this.f25643a = 11;
        this.f25645c = view;
        this.f25644b = true;
    }

    public ea(View view, boolean z10) {
        this.f25643a = 11;
        this.f25645c = view;
        this.f25644b = z10;
    }

    public ea(bp bpVar) {
        this.f25643a = 3;
        this.f25645c = bpVar;
    }
}
