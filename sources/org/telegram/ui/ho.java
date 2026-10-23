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
    public final int f37887a;
    public boolean f37888b;
    public final Object f37889c;

    public ho(int i10, Object obj, boolean z10) {
        this.f37887a = i10;
        this.f37889c = obj;
        this.f37888b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37887a) {
            case 0:
                ((ko) this.f37889c).h = null;
                return;
            case 1:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.f37889c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    daVar.h = null;
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.Components.ti) this.f37889c).f30717b1 = null;
                return;
            case 4:
                this.f37888b = true;
                return;
            case 9:
                org.telegram.ui.Components.v00 v00Var = (org.telegram.ui.Components.v00) this.f37889c;
                AnimatorSet animatorSet2 = v00Var.f31268f;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    v00Var.f31268f = null;
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.m70 m70Var = (org.telegram.ui.Components.m70) this.f37889c;
                AnimatorSet animatorSet3 = m70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    m70Var.X = null;
                    return;
                }
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f37889c;
                if (animator.equals(pipRoundVideoView.f24408r)) {
                    pipRoundVideoView.f24408r = null;
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.xv0) this.f37889c).O1 = null;
                return;
            case 24:
                org.telegram.ui.Components.o71 o71Var = (org.telegram.ui.Components.o71) this.f37889c;
                AnimatorSet animatorSet4 = o71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    o71Var.d = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.s71 s71Var = (org.telegram.ui.Components.s71) this.f37889c;
                AnimatorSet animatorSet5 = s71Var.f30406r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    s71Var.f30406r = null;
                    return;
                }
                return;
            case 27:
                ((hs) this.f37889c).f37925w = null;
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
        switch (this.f37887a) {
            case 0:
                ko koVar = (ko) this.f37889c;
                if (koVar.h != null && (radialProgressView = koVar.f38999n) != null) {
                    if (!this.f37888b) {
                        radialProgressView.setVisibility(4);
                        koVar.f38991f.setVisibility(4);
                    }
                    koVar.h = null;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.f37889c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f37888b) {
                        daVar.f25536c.setVisibility(4);
                        return;
                    } else {
                        daVar.f25535b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 2:
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) this.f37889c;
                if (animator == ycVar.f32871g) {
                    ycVar.f32871g = null;
                    if (this.f37888b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ycVar.f32873j = f7;
                    ycVar.b();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) this.f37889c;
                if (tiVar.f30717b1 != null) {
                    if (this.f37888b) {
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
                    org.telegram.ui.ActionBar.u0 u0Var = tiVar.f30737h1;
                    if (u0Var != null) {
                        u0Var.setVisibility(4);
                    }
                    if (tiVar.T0 != 0 || !tiVar.f30774t1) {
                        tiVar.f30724d1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.to toVar = (org.telegram.ui.Components.to) this.f37889c;
                if (!this.f37888b) {
                    org.telegram.ui.Components.w9 w9Var = toVar.h;
                    toVar.h = toVar.f30877n;
                    toVar.f30877n = w9Var;
                    w9Var.setVisibility(8);
                    toVar.f30877n.setAlpha(0.0f);
                    toVar.h.setVisibility(0);
                    toVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 5:
                boolean z10 = this.f37888b;
                org.telegram.ui.Components.dp dpVar = (org.telegram.ui.Components.dp) this.f37889c;
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
                org.telegram.ui.Components.wp wpVar = (org.telegram.ui.Components.wp) this.f37889c;
                if (this.f37888b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                wpVar.f32291f0 = f11;
                wpVar.I.setTranslationY((-AndroidUtilities.dp(7.0f)) * wpVar.f32291f0);
                return;
            case 7:
                if (!this.f37888b) {
                    ((org.telegram.ui.Components.wq) this.f37889c).H.setVisibility(8);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.gw gwVar = (org.telegram.ui.Components.gw) this.f37889c;
                org.telegram.ui.Components.kw kwVar = gwVar.N;
                if (kwVar.U && !gwVar.h) {
                    if (!this.f37888b && !gwVar.f26729n) {
                        gwVar.setBackground(null);
                        return;
                    } else if (gwVar.getBackground() == null) {
                        gwVar.setBackground(org.telegram.ui.ActionBar.k6.Z(kwVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 9:
                org.telegram.ui.Components.v00 v00Var = (org.telegram.ui.Components.v00) this.f37889c;
                AnimatorSet animatorSet2 = v00Var.f31268f;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f37888b) {
                        v00Var.h.setVisibility(4);
                    }
                    v00Var.f31268f = null;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) this.f37889c;
                if (this.f37888b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                g10Var.f26505n = f12;
                g10Var.invalidate();
                return;
            case 11:
                org.telegram.ui.Components.i30 i30Var = (org.telegram.ui.Components.i30) this.f37889c;
                org.telegram.ui.Components.f30 f30Var = i30Var.f27186a;
                if (!i30Var.F) {
                    if (this.f37888b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    i30Var.f27189b0 = f13;
                    i30Var.U.setPinnedProgress(f13);
                    f30Var.setScaleX(1.0f - (i30Var.f27189b0 * 0.6f));
                    f30Var.setScaleY(1.0f - (i30Var.f27189b0 * 0.6f));
                    if (i30Var.W) {
                        i30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                View view = (View) this.f37889c;
                if (this.f37888b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 13:
                org.telegram.ui.Components.m70 m70Var = (org.telegram.ui.Components.m70) this.f37889c;
                AnimatorSet animatorSet3 = m70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f37888b) {
                        m70Var.Y.setVisibility(4);
                    }
                    m70Var.X = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.x70 x70Var = (org.telegram.ui.Components.x70) this.f37889c;
                boolean z11 = this.f37888b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                x70Var.f32458h0 = f14;
                org.telegram.ui.Components.x70.W(x70Var).invalidate();
                if (!z11) {
                    x70Var.V.setVisibility(8);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.rc0 rc0Var = (org.telegram.ui.Components.rc0) this.f37889c;
                if (rc0Var.getParent() != null) {
                    ((ViewGroup) rc0Var.getParent()).removeView(rc0Var);
                }
                boolean z12 = this.f37888b;
                bl blVar = (bl) rc0Var;
                MessagePreviewParams messagePreviewParams = blVar.H.f41663r5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new al(blVar, 0), 15L);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.lc0 lc0Var = (org.telegram.ui.Components.lc0) this.f37889c;
                lc0Var.P = null;
                lc0Var.h(this.f37888b, false);
                return;
            case 17:
                org.telegram.ui.Components.pe0 pe0Var = (org.telegram.ui.Components.pe0) this.f37889c;
                TextView textView = pe0Var.f29540w;
                ci.h4 h4Var = pe0Var.e;
                if (this.f37888b) {
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
                pe0Var.f29539s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f37889c;
                if (animator.equals(pipRoundVideoView.f24408r)) {
                    if (!this.f37888b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f24408r = null;
                    return;
                }
                return;
            case 19:
                boolean z13 = this.f37888b;
                org.telegram.ui.Components.jo0 jo0Var = (org.telegram.ui.Components.jo0) this.f37889c;
                if (animator == jo0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    jo0Var.F = f16;
                    jo0Var.setShown(f16);
                    if (!z13) {
                        jo0Var.setVisibility(8);
                    }
                    jo0Var.b(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.xv0 xv0Var = (org.telegram.ui.Components.xv0) this.f37889c;
                if (xv0Var.O1 != null) {
                    xv0Var.O1 = null;
                    if (!this.f37888b) {
                        xv0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.v21 v21Var = (org.telegram.ui.Components.v21) this.f37889c;
                if (this.f37888b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                v21Var.M = f17;
                v21Var.invalidate();
                return;
            case 22:
                org.telegram.ui.Components.r31 r31Var = (org.telegram.ui.Components.r31) this.f37889c;
                if (this.f37888b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                r31Var.F = f18;
                r31Var.h();
                return;
            case 23:
                org.telegram.ui.Components.v31 v31Var = (org.telegram.ui.Components.v31) this.f37889c;
                if (this.f37888b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                v31Var.U = f19;
                v31Var.h();
                v31Var.g();
                return;
            case 24:
                org.telegram.ui.Components.o71 o71Var = (org.telegram.ui.Components.o71) this.f37889c;
                AnimatorSet animatorSet4 = o71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f37888b) {
                        o71Var.e.setVisibility(4);
                    }
                    o71Var.d = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.s71 s71Var = (org.telegram.ui.Components.s71) this.f37889c;
                AnimatorSet animatorSet5 = s71Var.f30406r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f37888b) {
                        s71Var.f30405n.setVisibility(4);
                    }
                    s71Var.f30406r = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f37889c;
                t2Var.v = null;
                if (this.f37888b) {
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
                    t2Var.f31942n = t2Var.f31943r;
                }
                t2Var.f31944s = 0.0f;
                t2Var.invalidate();
                return;
            case 27:
                hs hsVar = (hs) this.f37889c;
                if (hsVar.f37925w != null && (radialProgressView2 = hsVar.f37924s) != null) {
                    if (!this.f37888b) {
                        radialProgressView2.setVisibility(4);
                        hsVar.v.setVisibility(4);
                    }
                    hsVar.f37925w = null;
                    return;
                }
                return;
            case 28:
                vy vyVar = (vy) this.f37889c;
                if (this.f37888b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                vyVar.f42861r = f20;
                org.telegram.ui.Components.w9 w9Var2 = vyVar.f42858c;
                int i11 = org.telegram.ui.ActionBar.k6.C6;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i11, vyVar.f42856a);
                int i12 = org.telegram.ui.ActionBar.k6.Oh;
                int f22 = i0.a.f(vyVar.f42861r, w02, org.telegram.ui.ActionBar.k6.w0(i12, vyVar.f42856a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var2.setColorFilter(new PorterDuffColorFilter(f22, mode));
                vyVar.f42858c.invalidate();
                vyVar.f42859f.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - vyVar.f42861r, org.telegram.ui.ActionBar.k6.w0(i11, vyVar.f42856a), org.telegram.ui.ActionBar.k6.w0(i12, vyVar.f42856a)), mode));
                vyVar.f42859f.invalidate();
                return;
            default:
                j00 j00Var = (j00) this.f37889c;
                if (this.f37888b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                j00Var.f38426s = f21;
                j00Var.invalidate();
                return;
        }
    }

    public ho(View view) {
        this.f37887a = 12;
        this.f37889c = view;
        this.f37888b = true;
    }

    public ho(View view, boolean z10) {
        this.f37887a = 12;
        this.f37889c = view;
        this.f37888b = z10;
    }

    public ho(org.telegram.ui.Components.to toVar) {
        this.f37887a = 4;
        this.f37889c = toVar;
    }
}
