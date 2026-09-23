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
    public final int f22990a;
    public boolean f22991b;
    public final Object f22992c;

    public ca(int i10, Object obj, boolean z10) {
        this.f22990a = i10;
        this.f22992c = obj;
        this.f22991b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f22990a) {
            case 0:
                da daVar = (da) this.f22992c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    daVar.h = null;
                    return;
                }
                return;
            case 2:
                ((wi) this.f22992c).Y0 = null;
                return;
            case 3:
                this.f22991b = true;
                return;
            case 8:
                o00 o00Var = (o00) this.f22992c;
                AnimatorSet animatorSet2 = o00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    o00Var.e = null;
                    return;
                }
                return;
            case 12:
                s60 s60Var = (s60) this.f22992c;
                AnimatorSet animatorSet3 = s60Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    s60Var.X = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f22992c;
                if (animator.equals(pipRoundVideoView.f22056r)) {
                    pipRoundVideoView.f22056r = null;
                    return;
                }
                return;
            case 19:
                ((yu0) this.f22992c).N1 = null;
                return;
            case 23:
                j61 j61Var = (j61) this.f22992c;
                AnimatorSet animatorSet4 = j61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    j61Var.d = null;
                    return;
                }
                return;
            case 24:
                n61 n61Var = (n61) this.f22992c;
                AnimatorSet animatorSet5 = n61Var.f26358r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    n61Var.f26358r = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.ns) this.f22992c).f35593w = null;
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
        switch (this.f22990a) {
            case 0:
                da daVar = (da) this.f22992c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f22991b) {
                        daVar.f23357c.setVisibility(4);
                        return;
                    } else {
                        daVar.f23356b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                yc ycVar = (yc) this.f22992c;
                if (animator == ycVar.f30208g) {
                    ycVar.f30208g = null;
                    if (this.f22991b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ycVar.f30209i = f7;
                    ycVar.b();
                    return;
                }
                return;
            case 2:
                wi wiVar = (wi) this.f22992c;
                if (wiVar.Y0 != null) {
                    if (this.f22991b) {
                        if (wiVar.S0) {
                            oi oiVar = wiVar.f29726y0;
                            if (oiVar == null || oiVar.J()) {
                                wiVar.f29723x1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.v0 v0Var = wiVar.f29662e1;
                    if (v0Var != null) {
                        v0Var.setVisibility(4);
                    }
                    if (wiVar.Q0 != 0 || !wiVar.f29698q1) {
                        wiVar.f29649a1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ko koVar = (ko) this.f22992c;
                if (!this.f22991b) {
                    w9 w9Var = koVar.h;
                    koVar.h = koVar.f25637n;
                    koVar.f25637n = w9Var;
                    w9Var.setVisibility(8);
                    koVar.f25637n.setAlpha(0.0f);
                    koVar.h.setVisibility(0);
                    koVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z10 = this.f22991b;
                uo uoVar = (uo) this.f22992c;
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
                np npVar = (np) this.f22992c;
                if (this.f22991b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                npVar.f26468g0 = f11;
                npVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * npVar.f26468g0);
                return;
            case 6:
                if (!this.f22991b) {
                    ((nq) this.f22992c).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                zv zvVar = (zv) this.f22992c;
                dw dwVar = zvVar.J;
                if (dwVar.U && !zvVar.h) {
                    if (!this.f22991b && !zvVar.f30664n) {
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
                o00 o00Var = (o00) this.f22992c;
                AnimatorSet animatorSet2 = o00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f22991b) {
                        o00Var.f26556f.setVisibility(4);
                    }
                    o00Var.e = null;
                    return;
                }
                return;
            case 9:
                z00 z00Var = (z00) this.f22992c;
                if (this.f22991b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                z00Var.h = f12;
                z00Var.invalidate();
                return;
            case 10:
                a30 a30Var = (a30) this.f22992c;
                y20 y20Var = a30Var.f22335a;
                if (!a30Var.F) {
                    if (this.f22991b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    a30Var.f22338b0 = f13;
                    a30Var.U.setPinnedProgress(f13);
                    y20Var.setScaleX(1.0f - (a30Var.f22338b0 * 0.6f));
                    y20Var.setScaleY(1.0f - (a30Var.f22338b0 * 0.6f));
                    if (a30Var.W) {
                        a30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) this.f22992c;
                if (this.f22991b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 12:
                s60 s60Var = (s60) this.f22992c;
                AnimatorSet animatorSet3 = s60Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f22991b) {
                        s60Var.Y.setVisibility(4);
                    }
                    s60Var.X = null;
                    return;
                }
                return;
            case 13:
                c70 c70Var = (c70) this.f22992c;
                boolean z11 = this.f22991b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                c70Var.f22958h0 = f14;
                c70.W(c70Var).invalidate();
                if (!z11) {
                    c70Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                ub0 ub0Var = (ub0) this.f22992c;
                if (ub0Var.getParent() != null) {
                    ((ViewGroup) ub0Var.getParent()).removeView(ub0Var);
                }
                boolean z12 = this.f22991b;
                org.telegram.ui.fl flVar = (org.telegram.ui.fl) ub0Var;
                MessagePreviewParams messagePreviewParams = flVar.H.f39378f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.el(flVar, 0), 15L);
                    return;
                }
                return;
            case 15:
                ob0 ob0Var = (ob0) this.f22992c;
                ob0Var.P = null;
                ob0Var.g(this.f22991b, false);
                return;
            case 16:
                sd0 sd0Var = (sd0) this.f22992c;
                TextView textView = sd0Var.f27920w;
                ai.w5 w5Var = sd0Var.e;
                if (this.f22991b) {
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
                sd0Var.f27919s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f22992c;
                if (animator.equals(pipRoundVideoView.f22056r)) {
                    if (!this.f22991b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f22056r = null;
                    return;
                }
                return;
            case 18:
                boolean z13 = this.f22991b;
                in0 in0Var = (in0) this.f22992c;
                if (animator == in0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    in0Var.F = f16;
                    in0Var.setShown(f16);
                    if (!z13) {
                        in0Var.setVisibility(8);
                    }
                    in0Var.b(true);
                    return;
                }
                return;
            case 19:
                yu0 yu0Var = (yu0) this.f22992c;
                if (yu0Var.N1 != null) {
                    yu0Var.N1 = null;
                    if (!this.f22991b) {
                        yu0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                t11 t11Var = (t11) this.f22992c;
                if (this.f22991b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                t11Var.M = f17;
                t11Var.invalidate();
                return;
            case 21:
                r21 r21Var = (r21) this.f22992c;
                if (this.f22991b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                r21Var.F = f18;
                r21Var.h();
                return;
            case 22:
                v21 v21Var = (v21) this.f22992c;
                if (this.f22991b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                v21Var.Q = f19;
                v21Var.h();
                v21Var.g();
                return;
            case 23:
                j61 j61Var = (j61) this.f22992c;
                AnimatorSet animatorSet4 = j61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f22991b) {
                        j61Var.e.setVisibility(4);
                    }
                    j61Var.d = null;
                    return;
                }
                return;
            case 24:
                n61 n61Var = (n61) this.f22992c;
                AnimatorSet animatorSet5 = n61Var.f26358r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f22991b) {
                        n61Var.f26357n.setVisibility(4);
                    }
                    n61Var.f26358r = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f22992c;
                v2Var.v = null;
                if (this.f22991b) {
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
                    v2Var.f29287n = v2Var.f29288r;
                }
                v2Var.f29289s = 0.0f;
                v2Var.invalidate();
                return;
            case 26:
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) this.f22992c;
                if (nsVar.f35593w != null && (radialProgressView = nsVar.f35592s) != null) {
                    if (!this.f22991b) {
                        radialProgressView.setVisibility(4);
                        nsVar.v.setVisibility(4);
                    }
                    nsVar.f35593w = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.iz izVar = (org.telegram.ui.iz) this.f22992c;
                if (this.f22991b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                izVar.f34289r = f20;
                w9 w9Var2 = izVar.f34286c;
                int i11 = org.telegram.ui.ActionBar.h6.C6;
                int v02 = org.telegram.ui.ActionBar.h6.v0(i11, izVar.f34284a);
                int i12 = org.telegram.ui.ActionBar.h6.Oh;
                int d = i0.a.d(izVar.f34289r, v02, org.telegram.ui.ActionBar.h6.v0(i12, izVar.f34284a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                izVar.f34286c.invalidate();
                izVar.f34287f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - izVar.f34289r, org.telegram.ui.ActionBar.h6.v0(i11, izVar.f34284a), org.telegram.ui.ActionBar.h6.v0(i12, izVar.f34284a)), mode));
                izVar.f34287f.invalidate();
                return;
            case 28:
                org.telegram.ui.v00 v00Var = (org.telegram.ui.v00) this.f22992c;
                if (this.f22991b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                v00Var.f38251s = f21;
                v00Var.invalidate();
                return;
            default:
                org.telegram.ui.f60 f60Var = (org.telegram.ui.f60) this.f22992c;
                f60Var.U2 = null;
                org.telegram.ui.ActionBar.i5 subtitleTextView = f60Var.O.getSubtitleTextView();
                if (this.f22991b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
        }
    }

    public ca(View view) {
        this.f22990a = 11;
        this.f22992c = view;
        this.f22991b = true;
    }

    public ca(View view, boolean z10) {
        this.f22990a = 11;
        this.f22992c = view;
        this.f22991b = z10;
    }

    public ca(ko koVar) {
        this.f22990a = 3;
        this.f22992c = koVar;
    }
}
