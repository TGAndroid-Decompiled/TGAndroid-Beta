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
public final class jo extends AnimatorListenerAdapter {
    public final int f40705a;
    public boolean f40706b;
    public final Object f40707c;

    public jo(int i10, Object obj, boolean z10) {
        this.f40705a = i10;
        this.f40707c = obj;
        this.f40706b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40705a) {
            case 0:
                ((mo) this.f40707c).h = null;
                return;
            case 1:
                org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) this.f40707c;
                AnimatorSet animatorSet = haVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    haVar.h = null;
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.Components.ti) this.f40707c).f33008b1 = null;
                return;
            case 4:
                this.f40706b = true;
                return;
            case 9:
                org.telegram.ui.Components.v00 v00Var = (org.telegram.ui.Components.v00) this.f40707c;
                AnimatorSet animatorSet2 = v00Var.f33522f;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    v00Var.f33522f = null;
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.n70 n70Var = (org.telegram.ui.Components.n70) this.f40707c;
                AnimatorSet animatorSet3 = n70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    n70Var.X = null;
                    return;
                }
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f40707c;
                if (animator.equals(pipRoundVideoView.f26201r)) {
                    pipRoundVideoView.f26201r = null;
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.aw0) this.f40707c).Q1 = null;
                return;
            case 24:
                org.telegram.ui.Components.x71 x71Var = (org.telegram.ui.Components.x71) this.f40707c;
                AnimatorSet animatorSet4 = x71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    x71Var.d = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.b81 b81Var = (org.telegram.ui.Components.b81) this.f40707c;
                AnimatorSet animatorSet5 = b81Var.f26782r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    b81Var.f26782r = null;
                    return;
                }
                return;
            case 27:
                ((js) this.f40707c).f40739w = null;
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
        switch (this.f40705a) {
            case 0:
                mo moVar = (mo) this.f40707c;
                if (moVar.h != null && (radialProgressView = moVar.f41613n) != null) {
                    if (!this.f40706b) {
                        radialProgressView.setVisibility(4);
                        moVar.f41605f.setVisibility(4);
                    }
                    moVar.h = null;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) this.f40707c;
                AnimatorSet animatorSet = haVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f40706b) {
                        haVar.f28892c.setVisibility(4);
                        return;
                    } else {
                        haVar.f28891b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 2:
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) this.f40707c;
                if (animator == xcVar.f34689g) {
                    xcVar.f34689g = null;
                    if (this.f40706b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    xcVar.f34691j = f7;
                    xcVar.b();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) this.f40707c;
                if (tiVar.f33008b1 != null) {
                    if (this.f40706b) {
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
                    org.telegram.ui.ActionBar.w0 w0Var = tiVar.f33028h1;
                    if (w0Var != null) {
                        w0Var.setVisibility(4);
                    }
                    if (tiVar.T0 != 0 || !tiVar.f33065t1) {
                        tiVar.f33015d1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.vo voVar = (org.telegram.ui.Components.vo) this.f40707c;
                if (!this.f40706b) {
                    org.telegram.ui.Components.y9 y9Var = voVar.h;
                    voVar.h = voVar.f33700n;
                    voVar.f33700n = y9Var;
                    y9Var.setVisibility(8);
                    voVar.f33700n.setAlpha(0.0f);
                    voVar.h.setVisibility(0);
                    voVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 5:
                boolean z10 = this.f40706b;
                org.telegram.ui.Components.fp fpVar = (org.telegram.ui.Components.fp) this.f40707c;
                if (animator == fpVar.e) {
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    fpVar.d = f10;
                    fpVar.setShown(f10);
                    if (!z10) {
                        fpVar.setVisibility(8);
                    }
                    fpVar.a(true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.yp ypVar = (org.telegram.ui.Components.yp) this.f40707c;
                if (this.f40706b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ypVar.f35100f0 = f11;
                ypVar.I.setTranslationY((-AndroidUtilities.dp(7.0f)) * ypVar.f35100f0);
                return;
            case 7:
                if (!this.f40706b) {
                    ((org.telegram.ui.Components.yq) this.f40707c).H.setVisibility(8);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.gw gwVar = (org.telegram.ui.Components.gw) this.f40707c;
                org.telegram.ui.Components.kw kwVar = gwVar.N;
                if (kwVar.U && !gwVar.h) {
                    if (!this.f40706b && !gwVar.f28727n) {
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
                org.telegram.ui.Components.v00 v00Var = (org.telegram.ui.Components.v00) this.f40707c;
                AnimatorSet animatorSet2 = v00Var.f33522f;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f40706b) {
                        v00Var.h.setVisibility(4);
                    }
                    v00Var.f33522f = null;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.j10 j10Var = (org.telegram.ui.Components.j10) this.f40707c;
                if (this.f40706b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                j10Var.f29441n = f12;
                j10Var.invalidate();
                return;
            case 11:
                org.telegram.ui.Components.k30 k30Var = (org.telegram.ui.Components.k30) this.f40707c;
                org.telegram.ui.Components.h30 h30Var = k30Var.f29788a;
                if (!k30Var.F) {
                    if (this.f40706b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    k30Var.f29791b0 = f13;
                    k30Var.U.setPinnedProgress(f13);
                    h30Var.setScaleX(1.0f - (k30Var.f29791b0 * 0.6f));
                    h30Var.setScaleY(1.0f - (k30Var.f29791b0 * 0.6f));
                    if (k30Var.W) {
                        k30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                View view = (View) this.f40707c;
                if (this.f40706b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 13:
                org.telegram.ui.Components.n70 n70Var = (org.telegram.ui.Components.n70) this.f40707c;
                AnimatorSet animatorSet3 = n70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f40706b) {
                        n70Var.Y.setVisibility(4);
                    }
                    n70Var.X = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.y70 y70Var = (org.telegram.ui.Components.y70) this.f40707c;
                boolean z11 = this.f40706b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                y70Var.f34951h0 = f14;
                org.telegram.ui.Components.y70.W(y70Var).invalidate();
                if (!z11) {
                    y70Var.V.setVisibility(8);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.nc0 nc0Var = (org.telegram.ui.Components.nc0) this.f40707c;
                if (nc0Var.getParent() != null) {
                    ((ViewGroup) nc0Var.getParent()).removeView(nc0Var);
                }
                boolean z12 = this.f40706b;
                cl clVar = (cl) nc0Var;
                MessagePreviewParams messagePreviewParams = clVar.H.f44397r5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new bl(clVar, 0), 15L);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.hc0 hc0Var = (org.telegram.ui.Components.hc0) this.f40707c;
                hc0Var.P = null;
                hc0Var.h(this.f40706b, false);
                return;
            case 17:
                org.telegram.ui.Components.le0 le0Var = (org.telegram.ui.Components.le0) this.f40707c;
                TextView textView = le0Var.f30200w;
                di.i4 i4Var = le0Var.e;
                if (this.f40706b) {
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
                le0Var.f30199s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f40707c;
                if (animator.equals(pipRoundVideoView.f26201r)) {
                    if (!this.f40706b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f26201r = null;
                    return;
                }
                return;
            case 19:
                boolean z13 = this.f40706b;
                org.telegram.ui.Components.oo0 oo0Var = (org.telegram.ui.Components.oo0) this.f40707c;
                if (animator == oo0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    oo0Var.F = f16;
                    oo0Var.setShown(f16);
                    if (!z13) {
                        oo0Var.setVisibility(8);
                    }
                    oo0Var.b(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.aw0 aw0Var = (org.telegram.ui.Components.aw0) this.f40707c;
                if (aw0Var.Q1 != null) {
                    aw0Var.Q1 = null;
                    if (!this.f40706b) {
                        aw0Var.D0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.d31 d31Var = (org.telegram.ui.Components.d31) this.f40707c;
                if (this.f40706b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                d31Var.M = f17;
                d31Var.invalidate();
                return;
            case 22:
                org.telegram.ui.Components.z31 z31Var = (org.telegram.ui.Components.z31) this.f40707c;
                if (this.f40706b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                z31Var.F = f18;
                z31Var.h();
                return;
            case 23:
                org.telegram.ui.Components.d41 d41Var = (org.telegram.ui.Components.d41) this.f40707c;
                if (this.f40706b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                d41Var.U = f19;
                d41Var.h();
                d41Var.g();
                return;
            case 24:
                org.telegram.ui.Components.x71 x71Var = (org.telegram.ui.Components.x71) this.f40707c;
                AnimatorSet animatorSet4 = x71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f40706b) {
                        x71Var.e.setVisibility(4);
                    }
                    x71Var.d = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.b81 b81Var = (org.telegram.ui.Components.b81) this.f40707c;
                AnimatorSet animatorSet5 = b81Var.f26782r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f40706b) {
                        b81Var.f26781n.setVisibility(4);
                    }
                    b81Var.f26782r = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f40707c;
                w2Var.v = null;
                if (this.f40706b) {
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
                    w2Var.f34191n = w2Var.f34192r;
                }
                w2Var.f34193s = 0.0f;
                w2Var.invalidate();
                return;
            case 27:
                js jsVar = (js) this.f40707c;
                if (jsVar.f40739w != null && (radialProgressView2 = jsVar.f40738s) != null) {
                    if (!this.f40706b) {
                        radialProgressView2.setVisibility(4);
                        jsVar.v.setVisibility(4);
                    }
                    jsVar.f40739w = null;
                    return;
                }
                return;
            case 28:
                ty tyVar = (ty) this.f40707c;
                if (this.f40706b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                tyVar.f43939r = f20;
                org.telegram.ui.Components.y9 y9Var2 = tyVar.f43936c;
                int i11 = org.telegram.ui.ActionBar.y6.C6;
                int w02 = org.telegram.ui.ActionBar.y6.w0(i11, tyVar.f43934a);
                int i12 = org.telegram.ui.ActionBar.y6.Oh;
                int f22 = i0.a.f(tyVar.f43939r, w02, org.telegram.ui.ActionBar.y6.w0(i12, tyVar.f43934a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                y9Var2.setColorFilter(new PorterDuffColorFilter(f22, mode));
                tyVar.f43936c.invalidate();
                tyVar.f43937f.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - tyVar.f43939r, org.telegram.ui.ActionBar.y6.w0(i11, tyVar.f43934a), org.telegram.ui.ActionBar.y6.w0(i12, tyVar.f43934a)), mode));
                tyVar.f43937f.invalidate();
                return;
            default:
                h00 h00Var = (h00) this.f40707c;
                if (this.f40706b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                h00Var.f39819s = f21;
                h00Var.invalidate();
                return;
        }
    }

    public jo(View view) {
        this.f40705a = 12;
        this.f40707c = view;
        this.f40706b = true;
    }

    public jo(View view, boolean z10) {
        this.f40705a = 12;
        this.f40707c = view;
        this.f40706b = z10;
    }

    public jo(org.telegram.ui.Components.vo voVar) {
        this.f40705a = 4;
        this.f40707c = voVar;
    }
}
