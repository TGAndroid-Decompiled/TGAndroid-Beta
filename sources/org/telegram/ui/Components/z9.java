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
public final class z9 extends AnimatorListenerAdapter {
    public final int f35295a;
    public boolean f35296b;
    public final Object f35297c;

    public z9(int i10, Object obj, boolean z10) {
        this.f35295a = i10;
        this.f35297c = obj;
        this.f35296b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35295a) {
            case 0:
                aa aaVar = (aa) this.f35297c;
                AnimatorSet animatorSet = aaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    aaVar.h = null;
                    return;
                }
                return;
            case 2:
                ((ni) this.f35297c).U0 = null;
                return;
            case 3:
                this.f35296b = true;
                return;
            case 8:
                j00 j00Var = (j00) this.f35297c;
                AnimatorSet animatorSet2 = j00Var.f29515e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    j00Var.f29515e = null;
                    return;
                }
                return;
            case 12:
                n60 n60Var = (n60) this.f35297c;
                AnimatorSet animatorSet3 = n60Var.T;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    n60Var.T = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f35297c;
                if (animator.equals(pipRoundVideoView.f26441r)) {
                    pipRoundVideoView.f26441r = null;
                    return;
                }
                return;
            case 19:
                ((qu0) this.f35297c).J1 = null;
                return;
            case 23:
                b61 b61Var = (b61) this.f35297c;
                AnimatorSet animatorSet4 = b61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    b61Var.d = null;
                    return;
                }
                return;
            case 24:
                f61 f61Var = (f61) this.f35297c;
                AnimatorSet animatorSet5 = f61Var.f28333r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    f61Var.f28333r = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.hs) this.f35297c).f39011w = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f9;
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
        switch (this.f35295a) {
            case 0:
                aa aaVar = (aa) this.f35297c;
                AnimatorSet animatorSet = aaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f35296b) {
                        aaVar.f26724c.setVisibility(4);
                        return;
                    } else {
                        aaVar.f26723b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                uc ucVar = (uc) this.f35297c;
                if (animator == ucVar.f33192g) {
                    ucVar.f33192g = null;
                    if (this.f35296b) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    ucVar.f33193i = f9;
                    ucVar.b();
                    return;
                }
                return;
            case 2:
                ni niVar = (ni) this.f35297c;
                if (niVar.U0 != null) {
                    if (this.f35296b) {
                        if (niVar.O0) {
                            fi fiVar = niVar.f31051u0;
                            if (fiVar == null || fiVar.I()) {
                                niVar.f31049t1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.w0 w0Var = niVar.f30988a1;
                    if (w0Var != null) {
                        w0Var.setVisibility(4);
                    }
                    if (niVar.M0 != 0 || !niVar.f31025m1) {
                        niVar.W0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                co coVar = (co) this.f35297c;
                if (!this.f35296b) {
                    t9 t9Var = coVar.h;
                    coVar.h = coVar.f27517n;
                    coVar.f27517n = t9Var;
                    t9Var.setVisibility(8);
                    coVar.f27517n.setAlpha(0.0f);
                    coVar.h.setVisibility(0);
                    coVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z10 = this.f35296b;
                no noVar = (no) this.f35297c;
                if (animator == noVar.f31101e) {
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    noVar.d = f10;
                    noVar.setShown(f10);
                    if (!z10) {
                        noVar.setVisibility(8);
                    }
                    noVar.a(true);
                    return;
                }
                return;
            case 5:
                gp gpVar = (gp) this.f35297c;
                if (this.f35296b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                gpVar.f28935c0 = f11;
                gpVar.F.setTranslationY((-AndroidUtilities.dp(7.0f)) * gpVar.f28935c0);
                return;
            case 6:
                if (!this.f35296b) {
                    ((gq) this.f35297c).D.setVisibility(8);
                    return;
                }
                return;
            case 7:
                pv pvVar = (pv) this.f35297c;
                tv tvVar = pvVar.F;
                if (tvVar.Q && !pvVar.h) {
                    if (!this.f35296b && !pvVar.f31782n) {
                        pvVar.setBackground(null);
                        return;
                    } else if (pvVar.getBackground() == null) {
                        pvVar.setBackground(org.telegram.ui.ActionBar.g6.Y(tvVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                j00 j00Var = (j00) this.f35297c;
                AnimatorSet animatorSet2 = j00Var.f29515e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f35296b) {
                        j00Var.f29516f.setVisibility(4);
                    }
                    j00Var.f29515e = null;
                    return;
                }
                return;
            case 9:
                u00 u00Var = (u00) this.f35297c;
                if (this.f35296b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                u00Var.h = f12;
                u00Var.invalidate();
                return;
            case 10:
                w20 w20Var = (w20) this.f35297c;
                t20 t20Var = w20Var.f34275a;
                if (!w20Var.B) {
                    if (this.f35296b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    w20Var.X = f13;
                    w20Var.Q.setPinnedProgress(f13);
                    t20Var.setScaleX(1.0f - (w20Var.X * 0.6f));
                    t20Var.setScaleY(1.0f - (w20Var.X * 0.6f));
                    if (w20Var.S) {
                        w20Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) this.f35297c;
                if (this.f35296b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 12:
                n60 n60Var = (n60) this.f35297c;
                AnimatorSet animatorSet3 = n60Var.T;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f35296b) {
                        n60Var.U.setVisibility(4);
                    }
                    n60Var.T = null;
                    return;
                }
                return;
            case 13:
                x60 x60Var = (x60) this.f35297c;
                boolean z11 = this.f35296b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                x60Var.f34607d0 = f14;
                x60.W(x60Var).invalidate();
                if (!z11) {
                    x60Var.R.setVisibility(8);
                    return;
                }
                return;
            case 14:
                rb0 rb0Var = (rb0) this.f35297c;
                if (rb0Var.getParent() != null) {
                    ((ViewGroup) rb0Var.getParent()).removeView(rb0Var);
                }
                boolean z12 = this.f35296b;
                org.telegram.ui.zk zkVar = (org.telegram.ui.zk) rb0Var;
                MessagePreviewParams messagePreviewParams = zkVar.D.f42755b5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.yk(zkVar, 0), 15L);
                    return;
                }
                return;
            case 15:
                lb0 lb0Var = (lb0) this.f35297c;
                lb0Var.L = null;
                lb0Var.g(this.f35296b, false);
                return;
            case 16:
                nd0 nd0Var = (nd0) this.f35297c;
                TextView textView = nd0Var.f30968w;
                bh.d dVar = nd0Var.f30963e;
                if (this.f35296b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                dVar.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f15));
                dVar.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f15));
                dVar.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f15));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f15));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f15));
                nd0Var.f30967s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f35297c;
                if (animator.equals(pipRoundVideoView.f26441r)) {
                    if (!this.f35296b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f26441r = null;
                    return;
                }
                return;
            case 18:
                boolean z13 = this.f35296b;
                en0 en0Var = (en0) this.f35297c;
                if (animator == en0Var.C) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    en0Var.B = f16;
                    en0Var.setShown(f16);
                    if (!z13) {
                        en0Var.setVisibility(8);
                    }
                    en0Var.b(true);
                    return;
                }
                return;
            case 19:
                qu0 qu0Var = (qu0) this.f35297c;
                if (qu0Var.J1 != null) {
                    qu0Var.J1 = null;
                    if (!this.f35296b) {
                        qu0Var.f32107x0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                l11 l11Var = (l11) this.f35297c;
                if (this.f35296b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                l11Var.I = f17;
                l11Var.invalidate();
                return;
            case 21:
                h21 h21Var = (h21) this.f35297c;
                if (this.f35296b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                h21Var.B = f18;
                h21Var.h();
                return;
            case 22:
                l21 l21Var = (l21) this.f35297c;
                if (this.f35296b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                l21Var.M = f19;
                l21Var.h();
                l21Var.g();
                return;
            case 23:
                b61 b61Var = (b61) this.f35297c;
                AnimatorSet animatorSet4 = b61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f35296b) {
                        b61Var.f26988e.setVisibility(4);
                    }
                    b61Var.d = null;
                    return;
                }
                return;
            case 24:
                f61 f61Var = (f61) this.f35297c;
                AnimatorSet animatorSet5 = f61Var.f28333r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f35296b) {
                        f61Var.f28332n.setVisibility(4);
                    }
                    f61Var.f28333r = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.x2 x2Var = (org.telegram.ui.Components.voip.x2) this.f35297c;
                x2Var.v = null;
                if (this.f35296b) {
                    TextView[] textViewArr = x2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!x2Var.C && (drawable = (drawableArr = x2Var.f34119e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                x2Var.C = false;
                if (!x2Var.K) {
                    x2Var.f34121n = x2Var.f34122r;
                }
                x2Var.f34123s = 0.0f;
                x2Var.invalidate();
                return;
            case 26:
                org.telegram.ui.hs hsVar = (org.telegram.ui.hs) this.f35297c;
                if (hsVar.f39011w != null && (radialProgressView = hsVar.f39010s) != null) {
                    if (!this.f35296b) {
                        radialProgressView.setVisibility(4);
                        hsVar.v.setVisibility(4);
                    }
                    hsVar.f39011w = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.wy wyVar = (org.telegram.ui.wy) this.f35297c;
                if (this.f35296b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                wyVar.f44404r = f20;
                t9 t9Var2 = wyVar.f44400c;
                int i11 = org.telegram.ui.ActionBar.g6.C6;
                int v02 = org.telegram.ui.ActionBar.g6.v0(i11, wyVar.f44398a);
                int i12 = org.telegram.ui.ActionBar.g6.Oh;
                int d = i0.a.d(wyVar.f44404r, v02, org.telegram.ui.ActionBar.g6.v0(i12, wyVar.f44398a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                t9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                wyVar.f44400c.invalidate();
                wyVar.f44402f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - wyVar.f44404r, org.telegram.ui.ActionBar.g6.v0(i11, wyVar.f44398a), org.telegram.ui.ActionBar.g6.v0(i12, wyVar.f44398a)), mode));
                wyVar.f44402f.invalidate();
                return;
            case 28:
                org.telegram.ui.i00 i00Var = (org.telegram.ui.i00) this.f35297c;
                if (this.f35296b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                i00Var.f39098s = f21;
                i00Var.invalidate();
                return;
            default:
                org.telegram.ui.r50 r50Var = (org.telegram.ui.r50) this.f35297c;
                r50Var.Q2 = null;
                org.telegram.ui.ActionBar.h5 subtitleTextView = r50Var.K.getSubtitleTextView();
                if (this.f35296b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
        }
    }

    public z9(View view) {
        this.f35295a = 11;
        this.f35297c = view;
        this.f35296b = true;
    }

    public z9(View view, boolean z10) {
        this.f35295a = 11;
        this.f35297c = view;
        this.f35296b = z10;
    }

    public z9(co coVar) {
        this.f35295a = 3;
        this.f35297c = coVar;
    }
}
