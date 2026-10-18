package org.telegram.ui;

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
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
public final class ho extends AnimatorListenerAdapter {
    public final int f37572a;
    public boolean f37573b;
    public final Object f37574c;

    public ho(int i10, Object obj, boolean z10) {
        this.f37572a = i10;
        this.f37574c = obj;
        this.f37573b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37572a) {
            case 0:
                ((ko) this.f37574c).h = null;
                return;
            case 1:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.f37574c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    daVar.h = null;
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.Components.ti) this.f37574c).f30561b1 = null;
                return;
            case 4:
                this.f37573b = true;
                return;
            case 9:
                org.telegram.ui.Components.v00 v00Var = (org.telegram.ui.Components.v00) this.f37574c;
                AnimatorSet animatorSet2 = v00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    v00Var.e = null;
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.l70 l70Var = (org.telegram.ui.Components.l70) this.f37574c;
                AnimatorSet animatorSet3 = l70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    l70Var.X = null;
                    return;
                }
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f37574c;
                if (animator.equals(pipRoundVideoView.f24260r)) {
                    pipRoundVideoView.f24260r = null;
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.sv0) this.f37574c).N1 = null;
                return;
            case 24:
                org.telegram.ui.Components.f71 f71Var = (org.telegram.ui.Components.f71) this.f37574c;
                AnimatorSet animatorSet4 = f71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    f71Var.d = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.j71 j71Var = (org.telegram.ui.Components.j71) this.f37574c;
                AnimatorSet animatorSet5 = j71Var.f27433r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    j71Var.f27433r = null;
                    return;
                }
                return;
            case 27:
                ((hs) this.f37574c).f37600w = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        RadialProgressView radialProgressView;
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
        RadialProgressView radialProgressView2;
        float f20;
        float f21;
        switch (this.f37572a) {
            case 0:
                ko koVar = (ko) this.f37574c;
                if (koVar.h != null && (radialProgressView = koVar.f38562n) != null) {
                    if (!this.f37573b) {
                        radialProgressView.setVisibility(4);
                        koVar.f38554f.setVisibility(4);
                    }
                    koVar.h = null;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.f37574c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f37573b) {
                        daVar.f25539c.setVisibility(4);
                        return;
                    } else {
                        daVar.f25538b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 2:
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) this.f37574c;
                if (animator == ycVar.f32605g) {
                    ycVar.f32605g = null;
                    if (this.f37573b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ycVar.f32607j = f7;
                    ycVar.b();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) this.f37574c;
                if (tiVar.f30561b1 != null) {
                    if (this.f37573b) {
                        if (tiVar.V0) {
                            org.telegram.ui.Components.li liVar = tiVar.B0;
                            if (liVar == null || liVar.L()) {
                                tiVar.A1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.u0 u0Var = tiVar.f30581h1;
                    if (u0Var != null) {
                        u0Var.setVisibility(4);
                    }
                    if (tiVar.T0 != 0 || !tiVar.f30618t1) {
                        tiVar.f30568d1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.to toVar = (org.telegram.ui.Components.to) this.f37574c;
                if (!this.f37573b) {
                    org.telegram.ui.Components.w9 w9Var = toVar.h;
                    toVar.h = toVar.f30682n;
                    toVar.f30682n = w9Var;
                    w9Var.setVisibility(8);
                    toVar.f30682n.setAlpha(0.0f);
                    toVar.h.setVisibility(0);
                    toVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 5:
                boolean z10 = this.f37573b;
                org.telegram.ui.Components.dp dpVar = (org.telegram.ui.Components.dp) this.f37574c;
                if (animator == dpVar.e) {
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    dpVar.d = f10;
                    dpVar.setShown(f10);
                    if (!z10) {
                        dpVar.setVisibility(8);
                    }
                    dpVar.a(true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.wp wpVar = (org.telegram.ui.Components.wp) this.f37574c;
                if (this.f37573b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                wpVar.f32179g0 = f11;
                wpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * wpVar.f32179g0);
                return;
            case 7:
                if (!this.f37573b) {
                    ((org.telegram.ui.Components.wq) this.f37574c).H.setVisibility(8);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.gw gwVar = (org.telegram.ui.Components.gw) this.f37574c;
                org.telegram.ui.Components.kw kwVar = gwVar.J;
                if (kwVar.U && !gwVar.h) {
                    if (!this.f37573b && !gwVar.f26682n) {
                        gwVar.setBackground(null);
                        return;
                    } else if (gwVar.getBackground() == null) {
                        gwVar.setBackground(org.telegram.ui.ActionBar.h6.Z(kwVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 9:
                org.telegram.ui.Components.v00 v00Var = (org.telegram.ui.Components.v00) this.f37574c;
                AnimatorSet animatorSet2 = v00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f37573b) {
                        v00Var.f31123f.setVisibility(4);
                    }
                    v00Var.e = null;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) this.f37574c;
                if (this.f37573b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                g10Var.h = f12;
                g10Var.invalidate();
                return;
            case 11:
                org.telegram.ui.Components.i30 i30Var = (org.telegram.ui.Components.i30) this.f37574c;
                org.telegram.ui.Components.f30 f30Var = i30Var.f27051a;
                if (!i30Var.F) {
                    if (this.f37573b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    i30Var.f27054b0 = f13;
                    i30Var.U.setPinnedProgress(f13);
                    f30Var.setScaleX(1.0f - (i30Var.f27054b0 * 0.6f));
                    f30Var.setScaleY(1.0f - (i30Var.f27054b0 * 0.6f));
                    if (i30Var.W) {
                        i30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                View view = (View) this.f37574c;
                if (this.f37573b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 13:
                org.telegram.ui.Components.l70 l70Var = (org.telegram.ui.Components.l70) this.f37574c;
                AnimatorSet animatorSet3 = l70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f37573b) {
                        l70Var.Y.setVisibility(4);
                    }
                    l70Var.X = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.v70 v70Var = (org.telegram.ui.Components.v70) this.f37574c;
                boolean z11 = this.f37573b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                v70Var.f31200h0 = f14;
                org.telegram.ui.Components.v70.X(v70Var).invalidate();
                if (!z11) {
                    v70Var.V.setVisibility(8);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.oc0 oc0Var = (org.telegram.ui.Components.oc0) this.f37574c;
                if (oc0Var.getParent() != null) {
                    ((ViewGroup) oc0Var.getParent()).removeView(oc0Var);
                }
                boolean z12 = this.f37573b;
                cl clVar = (cl) oc0Var;
                MessagePreviewParams messagePreviewParams = clVar.H.f41200f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new bl(clVar, 0), 15L);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.ic0 ic0Var = (org.telegram.ui.Components.ic0) this.f37574c;
                ic0Var.P = null;
                ic0Var.h(this.f37573b, false);
                return;
            case 17:
                org.telegram.ui.Components.le0 le0Var = (org.telegram.ui.Components.le0) this.f37574c;
                TextView textView = le0Var.f28219w;
                ci.h4 h4Var = le0Var.e;
                if (this.f37573b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                h4Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f15));
                h4Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f15));
                h4Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f15));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f15));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f15));
                le0Var.f28218s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f37574c;
                if (animator.equals(pipRoundVideoView.f24260r)) {
                    if (!this.f37573b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f24260r = null;
                    return;
                }
                return;
            case 19:
                boolean z13 = this.f37573b;
                org.telegram.ui.Components.fo0 fo0Var = (org.telegram.ui.Components.fo0) this.f37574c;
                if (animator == fo0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    fo0Var.F = f16;
                    fo0Var.setShown(f16);
                    if (!z13) {
                        fo0Var.setVisibility(8);
                    }
                    fo0Var.b(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.sv0 sv0Var = (org.telegram.ui.Components.sv0) this.f37574c;
                if (sv0Var.N1 != null) {
                    sv0Var.N1 = null;
                    if (!this.f37573b) {
                        sv0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.p21 p21Var = (org.telegram.ui.Components.p21) this.f37574c;
                if (this.f37573b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                p21Var.M = f17;
                p21Var.invalidate();
                return;
            case 22:
                org.telegram.ui.Components.k31 k31Var = (org.telegram.ui.Components.k31) this.f37574c;
                if (this.f37573b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                k31Var.F = f18;
                k31Var.h();
                return;
            case 23:
                org.telegram.ui.Components.p31 p31Var = (org.telegram.ui.Components.p31) this.f37574c;
                if (this.f37573b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                p31Var.Q = f19;
                p31Var.h();
                p31Var.g();
                return;
            case 24:
                org.telegram.ui.Components.f71 f71Var = (org.telegram.ui.Components.f71) this.f37574c;
                AnimatorSet animatorSet4 = f71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f37573b) {
                        f71Var.e.setVisibility(4);
                    }
                    f71Var.d = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.j71 j71Var = (org.telegram.ui.Components.j71) this.f37574c;
                AnimatorSet animatorSet5 = j71Var.f27433r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f37573b) {
                        j71Var.f27432n.setVisibility(4);
                    }
                    j71Var.f27433r = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f37574c;
                t2Var.v = null;
                if (this.f37573b) {
                    TextView[] textViewArr = t2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!t2Var.G && (drawable = (drawableArr = t2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                t2Var.G = false;
                if (!t2Var.O) {
                    t2Var.f31796n = t2Var.f31797r;
                }
                t2Var.f31798s = 0.0f;
                t2Var.invalidate();
                return;
            case 27:
                hs hsVar = (hs) this.f37574c;
                if (hsVar.f37600w != null && (radialProgressView2 = hsVar.f37599s) != null) {
                    if (!this.f37573b) {
                        radialProgressView2.setVisibility(4);
                        hsVar.v.setVisibility(4);
                    }
                    hsVar.f37600w = null;
                    return;
                }
                return;
            case 28:
                vy vyVar = (vy) this.f37574c;
                if (this.f37573b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                vyVar.f42293r = f20;
                org.telegram.ui.Components.w9 w9Var2 = vyVar.f42290c;
                int i11 = org.telegram.ui.ActionBar.h6.C6;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i11, vyVar.f42288a);
                int i12 = org.telegram.ui.ActionBar.h6.Oh;
                int f22 = i0.a.f(vyVar.f42293r, w02, org.telegram.ui.ActionBar.h6.w0(i12, vyVar.f42288a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var2.setColorFilter(new PorterDuffColorFilter(f22, mode));
                vyVar.f42290c.invalidate();
                vyVar.f42291f.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - vyVar.f42293r, org.telegram.ui.ActionBar.h6.w0(i11, vyVar.f42288a), org.telegram.ui.ActionBar.h6.w0(i12, vyVar.f42288a)), mode));
                vyVar.f42291f.invalidate();
                return;
            default:
                i00 i00Var = (i00) this.f37574c;
                if (this.f37573b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                i00Var.f37686s = f21;
                i00Var.invalidate();
                return;
        }
    }

    public ho(View view) {
        this.f37572a = 12;
        this.f37574c = view;
        this.f37573b = true;
    }

    public ho(View view, boolean z10) {
        this.f37572a = 12;
        this.f37574c = view;
        this.f37573b = z10;
    }

    public ho(org.telegram.ui.Components.to toVar) {
        this.f37572a = 4;
        this.f37574c = toVar;
    }
}
