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
    public final int f23294a;
    public boolean f23295b;
    public final Object f23296c;

    public ca(int i10, Object obj, boolean z10) {
        this.f23294a = i10;
        this.f23296c = obj;
        this.f23295b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23294a) {
            case 0:
                da daVar = (da) this.f23296c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    daVar.h = null;
                    return;
                }
                return;
            case 2:
                ((wi) this.f23296c).Y0 = null;
                return;
            case 3:
                this.f23295b = true;
                return;
            case 8:
                o00 o00Var = (o00) this.f23296c;
                AnimatorSet animatorSet2 = o00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    o00Var.e = null;
                    return;
                }
                return;
            case 12:
                c70 c70Var = (c70) this.f23296c;
                AnimatorSet animatorSet3 = c70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    c70Var.X = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f23296c;
                if (animator.equals(pipRoundVideoView.f22308r)) {
                    pipRoundVideoView.f22308r = null;
                    return;
                }
                return;
            case 19:
                ((jv0) this.f23296c).N1 = null;
                return;
            case 23:
                x61 x61Var = (x61) this.f23296c;
                AnimatorSet animatorSet4 = x61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    x61Var.d = null;
                    return;
                }
                return;
            case 24:
                b71 b71Var = (b71) this.f23296c;
                AnimatorSet animatorSet5 = b71Var.f22918r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    b71Var.f22918r = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.ms) this.f23296c).f35660w = null;
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
        switch (this.f23294a) {
            case 0:
                da daVar = (da) this.f23296c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f23295b) {
                        daVar.f23551c.setVisibility(4);
                        return;
                    } else {
                        daVar.f23550b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                yc ycVar = (yc) this.f23296c;
                if (animator == ycVar.f30590g) {
                    ycVar.f30590g = null;
                    if (this.f23295b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ycVar.f30591i = f7;
                    ycVar.b();
                    return;
                }
                return;
            case 2:
                wi wiVar = (wi) this.f23296c;
                if (wiVar.Y0 != null) {
                    if (this.f23295b) {
                        if (wiVar.S0) {
                            oi oiVar = wiVar.f30067y0;
                            if (oiVar == null || oiVar.J()) {
                                wiVar.f30064x1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.u0 u0Var = wiVar.f30003e1;
                    if (u0Var != null) {
                        u0Var.setVisibility(4);
                    }
                    if (wiVar.Q0 != 0 || !wiVar.f30039q1) {
                        wiVar.f29990a1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ko koVar = (ko) this.f23296c;
                if (!this.f23295b) {
                    w9 w9Var = koVar.h;
                    koVar.h = koVar.f25841n;
                    koVar.f25841n = w9Var;
                    w9Var.setVisibility(8);
                    koVar.f25841n.setAlpha(0.0f);
                    koVar.h.setVisibility(0);
                    koVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z10 = this.f23295b;
                uo uoVar = (uo) this.f23296c;
                if (animator == uoVar.e) {
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    uoVar.d = f10;
                    uoVar.setShown(f10);
                    if (!z10) {
                        uoVar.setVisibility(8);
                    }
                    uoVar.a(true);
                    return;
                }
                return;
            case 5:
                np npVar = (np) this.f23296c;
                if (this.f23295b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                npVar.f26762g0 = f11;
                npVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * npVar.f26762g0);
                return;
            case 6:
                if (!this.f23295b) {
                    ((nq) this.f23296c).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                zv zvVar = (zv) this.f23296c;
                dw dwVar = zvVar.J;
                if (dwVar.U && !zvVar.h) {
                    if (!this.f23295b && !zvVar.f31002n) {
                        zvVar.setBackground(null);
                        return;
                    } else if (zvVar.getBackground() == null) {
                        zvVar.setBackground(org.telegram.ui.ActionBar.h6.Y(dwVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                o00 o00Var = (o00) this.f23296c;
                AnimatorSet animatorSet2 = o00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f23295b) {
                        o00Var.f26862f.setVisibility(4);
                    }
                    o00Var.e = null;
                    return;
                }
                return;
            case 9:
                z00 z00Var = (z00) this.f23296c;
                if (this.f23295b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                z00Var.h = f12;
                z00Var.invalidate();
                return;
            case 10:
                a30 a30Var = (a30) this.f23296c;
                y20 y20Var = a30Var.f22573a;
                if (!a30Var.F) {
                    if (this.f23295b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    a30Var.f22576b0 = f13;
                    a30Var.U.setPinnedProgress(f13);
                    y20Var.setScaleX(1.0f - (a30Var.f22576b0 * 0.6f));
                    y20Var.setScaleY(1.0f - (a30Var.f22576b0 * 0.6f));
                    if (a30Var.W) {
                        a30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) this.f23296c;
                if (this.f23295b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 12:
                c70 c70Var = (c70) this.f23296c;
                AnimatorSet animatorSet3 = c70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f23295b) {
                        c70Var.Y.setVisibility(4);
                    }
                    c70Var.X = null;
                    return;
                }
                return;
            case 13:
                m70 m70Var = (m70) this.f23296c;
                boolean z11 = this.f23295b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                m70Var.f26383h0 = f14;
                m70.W(m70Var).invalidate();
                if (!z11) {
                    m70Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                fc0 fc0Var = (fc0) this.f23296c;
                if (fc0Var.getParent() != null) {
                    ((ViewGroup) fc0Var.getParent()).removeView(fc0Var);
                }
                boolean z12 = this.f23295b;
                org.telegram.ui.el elVar = (org.telegram.ui.el) fc0Var;
                MessagePreviewParams messagePreviewParams = elVar.H.f39478f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.dl(elVar, 0), 15L);
                    return;
                }
                return;
            case 15:
                zb0 zb0Var = (zb0) this.f23296c;
                zb0Var.P = null;
                zb0Var.g(this.f23295b, false);
                return;
            case 16:
                ce0 ce0Var = (ce0) this.f23296c;
                TextView textView = ce0Var.f23328w;
                ai.w5 w5Var = ce0Var.e;
                if (this.f23295b) {
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
                ce0Var.f23327s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f23296c;
                if (animator.equals(pipRoundVideoView.f22308r)) {
                    if (!this.f23295b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f22308r = null;
                    return;
                }
                return;
            case 18:
                boolean z13 = this.f23295b;
                un0 un0Var = (un0) this.f23296c;
                if (animator == un0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    un0Var.F = f16;
                    un0Var.setShown(f16);
                    if (!z13) {
                        un0Var.setVisibility(8);
                    }
                    un0Var.b(true);
                    return;
                }
                return;
            case 19:
                jv0 jv0Var = (jv0) this.f23296c;
                if (jv0Var.N1 != null) {
                    jv0Var.N1 = null;
                    if (!this.f23295b) {
                        jv0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                h21 h21Var = (h21) this.f23296c;
                if (this.f23295b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                h21Var.M = f17;
                h21Var.invalidate();
                return;
            case 21:
                f31 f31Var = (f31) this.f23296c;
                if (this.f23295b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                f31Var.F = f18;
                f31Var.h();
                return;
            case 22:
                j31 j31Var = (j31) this.f23296c;
                if (this.f23295b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                j31Var.Q = f19;
                j31Var.h();
                j31Var.g();
                return;
            case 23:
                x61 x61Var = (x61) this.f23296c;
                AnimatorSet animatorSet4 = x61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f23295b) {
                        x61Var.e.setVisibility(4);
                    }
                    x61Var.d = null;
                    return;
                }
                return;
            case 24:
                b71 b71Var = (b71) this.f23296c;
                AnimatorSet animatorSet5 = b71Var.f22918r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f23295b) {
                        b71Var.f22917n.setVisibility(4);
                    }
                    b71Var.f22918r = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f23296c;
                w2Var.v = null;
                if (this.f23295b) {
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
                    w2Var.f29729n = w2Var.f29730r;
                }
                w2Var.f29731s = 0.0f;
                w2Var.invalidate();
                return;
            case 26:
                org.telegram.ui.ms msVar = (org.telegram.ui.ms) this.f23296c;
                if (msVar.f35660w != null && (radialProgressView = msVar.f35659s) != null) {
                    if (!this.f23295b) {
                        radialProgressView.setVisibility(4);
                        msVar.v.setVisibility(4);
                    }
                    msVar.f35660w = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.hz hzVar = (org.telegram.ui.hz) this.f23296c;
                if (this.f23295b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                hzVar.f34333r = f20;
                w9 w9Var2 = hzVar.f34330c;
                int i11 = org.telegram.ui.ActionBar.h6.C6;
                int v02 = org.telegram.ui.ActionBar.h6.v0(i11, hzVar.f34328a);
                int i12 = org.telegram.ui.ActionBar.h6.Oh;
                int d = i0.a.d(hzVar.f34333r, v02, org.telegram.ui.ActionBar.h6.v0(i12, hzVar.f34328a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                hzVar.f34330c.invalidate();
                hzVar.f34331f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - hzVar.f34333r, org.telegram.ui.ActionBar.h6.v0(i11, hzVar.f34328a), org.telegram.ui.ActionBar.h6.v0(i12, hzVar.f34328a)), mode));
                hzVar.f34331f.invalidate();
                return;
            case 28:
                org.telegram.ui.u00 u00Var = (org.telegram.ui.u00) this.f23296c;
                if (this.f23295b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                u00Var.f38272s = f21;
                u00Var.invalidate();
                return;
            default:
                org.telegram.ui.d60 d60Var = (org.telegram.ui.d60) this.f23296c;
                d60Var.U2 = null;
                org.telegram.ui.ActionBar.h5 subtitleTextView = d60Var.O.getSubtitleTextView();
                if (this.f23295b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
        }
    }

    public ca(View view) {
        this.f23294a = 11;
        this.f23296c = view;
        this.f23295b = true;
    }

    public ca(View view, boolean z10) {
        this.f23294a = 11;
        this.f23296c = view;
        this.f23295b = z10;
    }

    public ca(ko koVar) {
        this.f23294a = 3;
        this.f23296c = koVar;
    }
}
