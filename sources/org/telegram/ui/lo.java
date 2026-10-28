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
public final class lo extends AnimatorListenerAdapter {
    public final int f41220a;
    public boolean f41221b;
    public final Object f41222c;

    public lo(int i10, Object obj, boolean z10) {
        this.f41220a = i10;
        this.f41222c = obj;
        this.f41221b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41220a) {
            case 0:
                ((oo) this.f41222c).h = null;
                return;
            case 1:
                org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) this.f41222c;
                AnimatorSet animatorSet = haVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    haVar.h = null;
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.Components.ti) this.f41222c).f32977b1 = null;
                return;
            case 4:
                this.f41221b = true;
                return;
            case 9:
                org.telegram.ui.Components.v00 v00Var = (org.telegram.ui.Components.v00) this.f41222c;
                AnimatorSet animatorSet2 = v00Var.f33505f;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    v00Var.f33505f = null;
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.o70 o70Var = (org.telegram.ui.Components.o70) this.f41222c;
                AnimatorSet animatorSet3 = o70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    o70Var.X = null;
                    return;
                }
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f41222c;
                if (animator.equals(pipRoundVideoView.f26203r)) {
                    pipRoundVideoView.f26203r = null;
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.bw0) this.f41222c).Q1 = null;
                return;
            case 24:
                org.telegram.ui.Components.y71 y71Var = (org.telegram.ui.Components.y71) this.f41222c;
                AnimatorSet animatorSet4 = y71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    y71Var.d = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.c81 c81Var = (org.telegram.ui.Components.c81) this.f41222c;
                AnimatorSet animatorSet5 = c81Var.f27095r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    c81Var.f27095r = null;
                    return;
                }
                return;
            case 27:
                ((ls) this.f41222c).f41254w = null;
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
        switch (this.f41220a) {
            case 0:
                oo ooVar = (oo) this.f41222c;
                if (ooVar.h != null && (radialProgressView = ooVar.f42145n) != null) {
                    if (!this.f41221b) {
                        radialProgressView.setVisibility(4);
                        ooVar.f42137f.setVisibility(4);
                    }
                    ooVar.h = null;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) this.f41222c;
                AnimatorSet animatorSet = haVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f41221b) {
                        haVar.f28924c.setVisibility(4);
                        return;
                    } else {
                        haVar.f28923b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 2:
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) this.f41222c;
                if (animator == xcVar.f34724g) {
                    xcVar.f34724g = null;
                    if (this.f41221b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    xcVar.f34726j = f7;
                    xcVar.b();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) this.f41222c;
                if (tiVar.f32977b1 != null) {
                    if (this.f41221b) {
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
                    org.telegram.ui.ActionBar.w0 w0Var = tiVar.f32997h1;
                    if (w0Var != null) {
                        w0Var.setVisibility(4);
                    }
                    if (tiVar.T0 != 0 || !tiVar.f33034t1) {
                        tiVar.f32984d1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.vo voVar = (org.telegram.ui.Components.vo) this.f41222c;
                if (!this.f41221b) {
                    org.telegram.ui.Components.y9 y9Var = voVar.h;
                    voVar.h = voVar.f33806n;
                    voVar.f33806n = y9Var;
                    y9Var.setVisibility(8);
                    voVar.f33806n.setAlpha(0.0f);
                    voVar.h.setVisibility(0);
                    voVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 5:
                boolean z10 = this.f41221b;
                org.telegram.ui.Components.gp gpVar = (org.telegram.ui.Components.gp) this.f41222c;
                if (animator == gpVar.e) {
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    gpVar.d = f10;
                    gpVar.setShown(f10);
                    if (!z10) {
                        gpVar.setVisibility(8);
                    }
                    gpVar.a(true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.zp zpVar = (org.telegram.ui.Components.zp) this.f41222c;
                if (this.f41221b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                zpVar.f35416f0 = f11;
                zpVar.I.setTranslationY((-AndroidUtilities.dp(7.0f)) * zpVar.f35416f0);
                return;
            case 7:
                if (!this.f41221b) {
                    ((org.telegram.ui.Components.yq) this.f41222c).H.setVisibility(8);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.gw gwVar = (org.telegram.ui.Components.gw) this.f41222c;
                org.telegram.ui.Components.kw kwVar = gwVar.N;
                if (kwVar.U && !gwVar.h) {
                    if (!this.f41221b && !gwVar.f28767n) {
                        gwVar.setBackground(null);
                        return;
                    } else if (gwVar.getBackground() == null) {
                        gwVar.setBackground(org.telegram.ui.ActionBar.y6.Z(kwVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 9:
                org.telegram.ui.Components.v00 v00Var = (org.telegram.ui.Components.v00) this.f41222c;
                AnimatorSet animatorSet2 = v00Var.f33505f;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f41221b) {
                        v00Var.h.setVisibility(4);
                    }
                    v00Var.f33505f = null;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.j10 j10Var = (org.telegram.ui.Components.j10) this.f41222c;
                if (this.f41221b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                j10Var.f29464n = f12;
                j10Var.invalidate();
                return;
            case 11:
                org.telegram.ui.Components.k30 k30Var = (org.telegram.ui.Components.k30) this.f41222c;
                org.telegram.ui.Components.h30 h30Var = k30Var.f29837a;
                if (!k30Var.F) {
                    if (this.f41221b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    k30Var.f29840b0 = f13;
                    k30Var.U.setPinnedProgress(f13);
                    h30Var.setScaleX(1.0f - (k30Var.f29840b0 * 0.6f));
                    h30Var.setScaleY(1.0f - (k30Var.f29840b0 * 0.6f));
                    if (k30Var.W) {
                        k30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                View view = (View) this.f41222c;
                if (this.f41221b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 13:
                org.telegram.ui.Components.o70 o70Var = (org.telegram.ui.Components.o70) this.f41222c;
                AnimatorSet animatorSet3 = o70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f41221b) {
                        o70Var.Y.setVisibility(4);
                    }
                    o70Var.X = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.z70 z70Var = (org.telegram.ui.Components.z70) this.f41222c;
                boolean z11 = this.f41221b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                z70Var.f35268h0 = f14;
                org.telegram.ui.Components.z70.W(z70Var).invalidate();
                if (!z11) {
                    z70Var.V.setVisibility(8);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.oc0 oc0Var = (org.telegram.ui.Components.oc0) this.f41222c;
                if (oc0Var.getParent() != null) {
                    ((ViewGroup) oc0Var.getParent()).removeView(oc0Var);
                }
                boolean z12 = this.f41221b;
                el elVar = (el) oc0Var;
                MessagePreviewParams messagePreviewParams = elVar.H.f45317v5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new dl(elVar, 0), 15L);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.ic0 ic0Var = (org.telegram.ui.Components.ic0) this.f41222c;
                ic0Var.P = null;
                ic0Var.h(this.f41221b, false);
                return;
            case 17:
                org.telegram.ui.Components.me0 me0Var = (org.telegram.ui.Components.me0) this.f41222c;
                TextView textView = me0Var.f30528w;
                di.i4 i4Var = me0Var.e;
                if (this.f41221b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                i4Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f15));
                i4Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f15));
                i4Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f15));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f15));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f15));
                me0Var.f30527s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f41222c;
                if (animator.equals(pipRoundVideoView.f26203r)) {
                    if (!this.f41221b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f26203r = null;
                    return;
                }
                return;
            case 19:
                boolean z13 = this.f41221b;
                org.telegram.ui.Components.po0 po0Var = (org.telegram.ui.Components.po0) this.f41222c;
                if (animator == po0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    po0Var.F = f16;
                    po0Var.setShown(f16);
                    if (!z13) {
                        po0Var.setVisibility(8);
                    }
                    po0Var.b(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.bw0 bw0Var = (org.telegram.ui.Components.bw0) this.f41222c;
                if (bw0Var.Q1 != null) {
                    bw0Var.Q1 = null;
                    if (!this.f41221b) {
                        bw0Var.D0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.e31 e31Var = (org.telegram.ui.Components.e31) this.f41222c;
                if (this.f41221b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                e31Var.M = f17;
                e31Var.invalidate();
                return;
            case 22:
                org.telegram.ui.Components.a41 a41Var = (org.telegram.ui.Components.a41) this.f41222c;
                if (this.f41221b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                a41Var.F = f18;
                a41Var.h();
                return;
            case 23:
                org.telegram.ui.Components.e41 e41Var = (org.telegram.ui.Components.e41) this.f41222c;
                if (this.f41221b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                e41Var.U = f19;
                e41Var.h();
                e41Var.g();
                return;
            case 24:
                org.telegram.ui.Components.y71 y71Var = (org.telegram.ui.Components.y71) this.f41222c;
                AnimatorSet animatorSet4 = y71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f41221b) {
                        y71Var.e.setVisibility(4);
                    }
                    y71Var.d = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.c81 c81Var = (org.telegram.ui.Components.c81) this.f41222c;
                AnimatorSet animatorSet5 = c81Var.f27095r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f41221b) {
                        c81Var.f27094n.setVisibility(4);
                    }
                    c81Var.f27095r = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f41222c;
                w2Var.v = null;
                if (this.f41221b) {
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
                    w2Var.f34296n = w2Var.f34297r;
                }
                w2Var.f34298s = 0.0f;
                w2Var.invalidate();
                return;
            case 27:
                ls lsVar = (ls) this.f41222c;
                if (lsVar.f41254w != null && (radialProgressView2 = lsVar.f41253s) != null) {
                    if (!this.f41221b) {
                        radialProgressView2.setVisibility(4);
                        lsVar.v.setVisibility(4);
                    }
                    lsVar.f41254w = null;
                    return;
                }
                return;
            case 28:
                vy vyVar = (vy) this.f41222c;
                if (this.f41221b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                vyVar.f44445r = f20;
                org.telegram.ui.Components.y9 y9Var2 = vyVar.f44442c;
                int i11 = org.telegram.ui.ActionBar.y6.C6;
                int w02 = org.telegram.ui.ActionBar.y6.w0(i11, vyVar.f44440a);
                int i12 = org.telegram.ui.ActionBar.y6.Oh;
                int f22 = i0.a.f(vyVar.f44445r, w02, org.telegram.ui.ActionBar.y6.w0(i12, vyVar.f44440a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                y9Var2.setColorFilter(new PorterDuffColorFilter(f22, mode));
                vyVar.f44442c.invalidate();
                vyVar.f44443f.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - vyVar.f44445r, org.telegram.ui.ActionBar.y6.w0(i11, vyVar.f44440a), org.telegram.ui.ActionBar.y6.w0(i12, vyVar.f44440a)), mode));
                vyVar.f44443f.invalidate();
                return;
            default:
                j00 j00Var = (j00) this.f41222c;
                if (this.f41221b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                j00Var.f40306s = f21;
                j00Var.invalidate();
                return;
        }
    }

    public lo(View view) {
        this.f41220a = 12;
        this.f41222c = view;
        this.f41221b = true;
    }

    public lo(View view, boolean z10) {
        this.f41220a = 12;
        this.f41222c = view;
        this.f41221b = z10;
    }

    public lo(org.telegram.ui.Components.vo voVar) {
        this.f41220a = 4;
        this.f41222c = voVar;
    }
}
