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
public final class fo extends AnimatorListenerAdapter {
    public final int f37046a;
    public boolean f37047b;
    public final Object f37048c;

    public fo(int i10, Object obj, boolean z10) {
        this.f37046a = i10;
        this.f37048c = obj;
        this.f37047b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37046a) {
            case 0:
                ((io) this.f37048c).h = null;
                return;
            case 1:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.f37048c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    daVar.h = null;
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.Components.ti) this.f37048c).f30533b1 = null;
                return;
            case 4:
                this.f37047b = true;
                return;
            case 9:
                org.telegram.ui.Components.v00 v00Var = (org.telegram.ui.Components.v00) this.f37048c;
                AnimatorSet animatorSet2 = v00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    v00Var.e = null;
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.l70 l70Var = (org.telegram.ui.Components.l70) this.f37048c;
                AnimatorSet animatorSet3 = l70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    l70Var.X = null;
                    return;
                }
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f37048c;
                if (animator.equals(pipRoundVideoView.f24264r)) {
                    pipRoundVideoView.f24264r = null;
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.uv0) this.f37048c).N1 = null;
                return;
            case 24:
                org.telegram.ui.Components.h71 h71Var = (org.telegram.ui.Components.h71) this.f37048c;
                AnimatorSet animatorSet4 = h71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    h71Var.d = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.l71 l71Var = (org.telegram.ui.Components.l71) this.f37048c;
                AnimatorSet animatorSet5 = l71Var.f28092r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    l71Var.f28092r = null;
                    return;
                }
                return;
            case 27:
                ((fs) this.f37048c).f37074w = null;
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
        switch (this.f37046a) {
            case 0:
                io ioVar = (io) this.f37048c;
                if (ioVar.h != null && (radialProgressView = ioVar.f38049n) != null) {
                    if (!this.f37047b) {
                        radialProgressView.setVisibility(4);
                        ioVar.f38041f.setVisibility(4);
                    }
                    ioVar.h = null;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.f37048c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f37047b) {
                        daVar.f25420c.setVisibility(4);
                        return;
                    } else {
                        daVar.f25419b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 2:
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) this.f37048c;
                if (animator == ycVar.f32631g) {
                    ycVar.f32631g = null;
                    if (this.f37047b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ycVar.f32633j = f7;
                    ycVar.b();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) this.f37048c;
                if (tiVar.f30533b1 != null) {
                    if (this.f37047b) {
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
                    org.telegram.ui.ActionBar.u0 u0Var = tiVar.f30553h1;
                    if (u0Var != null) {
                        u0Var.setVisibility(4);
                    }
                    if (tiVar.T0 != 0 || !tiVar.f30590t1) {
                        tiVar.f30540d1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.to toVar = (org.telegram.ui.Components.to) this.f37048c;
                if (!this.f37047b) {
                    org.telegram.ui.Components.w9 w9Var = toVar.h;
                    toVar.h = toVar.f30632n;
                    toVar.f30632n = w9Var;
                    w9Var.setVisibility(8);
                    toVar.f30632n.setAlpha(0.0f);
                    toVar.h.setVisibility(0);
                    toVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 5:
                boolean z10 = this.f37047b;
                org.telegram.ui.Components.dp dpVar = (org.telegram.ui.Components.dp) this.f37048c;
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
                org.telegram.ui.Components.wp wpVar = (org.telegram.ui.Components.wp) this.f37048c;
                if (this.f37047b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                wpVar.f32213g0 = f11;
                wpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * wpVar.f32213g0);
                return;
            case 7:
                if (!this.f37047b) {
                    ((org.telegram.ui.Components.wq) this.f37048c).H.setVisibility(8);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.gw gwVar = (org.telegram.ui.Components.gw) this.f37048c;
                org.telegram.ui.Components.kw kwVar = gwVar.J;
                if (kwVar.U && !gwVar.h) {
                    if (!this.f37047b && !gwVar.f26677n) {
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
                org.telegram.ui.Components.v00 v00Var = (org.telegram.ui.Components.v00) this.f37048c;
                AnimatorSet animatorSet2 = v00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f37047b) {
                        v00Var.f31102f.setVisibility(4);
                    }
                    v00Var.e = null;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) this.f37048c;
                if (this.f37047b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                g10Var.h = f12;
                g10Var.invalidate();
                return;
            case 11:
                org.telegram.ui.Components.i30 i30Var = (org.telegram.ui.Components.i30) this.f37048c;
                org.telegram.ui.Components.f30 f30Var = i30Var.f27101a;
                if (!i30Var.F) {
                    if (this.f37047b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    i30Var.f27104b0 = f13;
                    i30Var.U.setPinnedProgress(f13);
                    f30Var.setScaleX(1.0f - (i30Var.f27104b0 * 0.6f));
                    f30Var.setScaleY(1.0f - (i30Var.f27104b0 * 0.6f));
                    if (i30Var.W) {
                        i30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                View view = (View) this.f37048c;
                if (this.f37047b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 13:
                org.telegram.ui.Components.l70 l70Var = (org.telegram.ui.Components.l70) this.f37048c;
                AnimatorSet animatorSet3 = l70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f37047b) {
                        l70Var.Y.setVisibility(4);
                    }
                    l70Var.X = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.v70 v70Var = (org.telegram.ui.Components.v70) this.f37048c;
                boolean z11 = this.f37047b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                v70Var.f31175h0 = f14;
                org.telegram.ui.Components.v70.X(v70Var).invalidate();
                if (!z11) {
                    v70Var.V.setVisibility(8);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.oc0 oc0Var = (org.telegram.ui.Components.oc0) this.f37048c;
                if (oc0Var.getParent() != null) {
                    ((ViewGroup) oc0Var.getParent()).removeView(oc0Var);
                }
                boolean z12 = this.f37047b;
                al alVar = (al) oc0Var;
                MessagePreviewParams messagePreviewParams = alVar.H.f40682f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new zk(alVar, 0), 15L);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.ic0 ic0Var = (org.telegram.ui.Components.ic0) this.f37048c;
                ic0Var.P = null;
                ic0Var.h(this.f37047b, false);
                return;
            case 17:
                org.telegram.ui.Components.me0 me0Var = (org.telegram.ui.Components.me0) this.f37048c;
                TextView textView = me0Var.f28506w;
                ci.i4 i4Var = me0Var.e;
                if (this.f37047b) {
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
                me0Var.f28505s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f37048c;
                if (animator.equals(pipRoundVideoView.f24264r)) {
                    if (!this.f37047b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f24264r = null;
                    return;
                }
                return;
            case 19:
                boolean z13 = this.f37047b;
                org.telegram.ui.Components.go0 go0Var = (org.telegram.ui.Components.go0) this.f37048c;
                if (animator == go0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    go0Var.F = f16;
                    go0Var.setShown(f16);
                    if (!z13) {
                        go0Var.setVisibility(8);
                    }
                    go0Var.b(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.uv0 uv0Var = (org.telegram.ui.Components.uv0) this.f37048c;
                if (uv0Var.N1 != null) {
                    uv0Var.N1 = null;
                    if (!this.f37047b) {
                        uv0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.r21 r21Var = (org.telegram.ui.Components.r21) this.f37048c;
                if (this.f37047b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                r21Var.M = f17;
                r21Var.invalidate();
                return;
            case 22:
                org.telegram.ui.Components.m31 m31Var = (org.telegram.ui.Components.m31) this.f37048c;
                if (this.f37047b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                m31Var.F = f18;
                m31Var.h();
                return;
            case 23:
                org.telegram.ui.Components.r31 r31Var = (org.telegram.ui.Components.r31) this.f37048c;
                if (this.f37047b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                r31Var.Q = f19;
                r31Var.h();
                r31Var.g();
                return;
            case 24:
                org.telegram.ui.Components.h71 h71Var = (org.telegram.ui.Components.h71) this.f37048c;
                AnimatorSet animatorSet4 = h71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f37047b) {
                        h71Var.e.setVisibility(4);
                    }
                    h71Var.d = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.l71 l71Var = (org.telegram.ui.Components.l71) this.f37048c;
                AnimatorSet animatorSet5 = l71Var.f28092r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f37047b) {
                        l71Var.f28091n.setVisibility(4);
                    }
                    l71Var.f28092r = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f37048c;
                t2Var.v = null;
                if (this.f37047b) {
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
                    t2Var.f31757n = t2Var.f31758r;
                }
                t2Var.f31759s = 0.0f;
                t2Var.invalidate();
                return;
            case 27:
                fs fsVar = (fs) this.f37048c;
                if (fsVar.f37074w != null && (radialProgressView2 = fsVar.f37073s) != null) {
                    if (!this.f37047b) {
                        radialProgressView2.setVisibility(4);
                        fsVar.v.setVisibility(4);
                    }
                    fsVar.f37074w = null;
                    return;
                }
                return;
            case 28:
                ty tyVar = (ty) this.f37048c;
                if (this.f37047b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                tyVar.f41770r = f20;
                org.telegram.ui.Components.w9 w9Var2 = tyVar.f41767c;
                int i11 = org.telegram.ui.ActionBar.h6.C6;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i11, tyVar.f41765a);
                int i12 = org.telegram.ui.ActionBar.h6.Oh;
                int f22 = i0.a.f(tyVar.f41770r, w02, org.telegram.ui.ActionBar.h6.w0(i12, tyVar.f41765a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var2.setColorFilter(new PorterDuffColorFilter(f22, mode));
                tyVar.f41767c.invalidate();
                tyVar.f41768f.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - tyVar.f41770r, org.telegram.ui.ActionBar.h6.w0(i11, tyVar.f41765a), org.telegram.ui.ActionBar.h6.w0(i12, tyVar.f41765a)), mode));
                tyVar.f41768f.invalidate();
                return;
            default:
                g00 g00Var = (g00) this.f37048c;
                if (this.f37047b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                g00Var.f37160s = f21;
                g00Var.invalidate();
                return;
        }
    }

    public fo(View view) {
        this.f37046a = 12;
        this.f37048c = view;
        this.f37047b = true;
    }

    public fo(View view, boolean z10) {
        this.f37046a = 12;
        this.f37048c = view;
        this.f37047b = z10;
    }

    public fo(org.telegram.ui.Components.to toVar) {
        this.f37046a = 4;
        this.f37048c = toVar;
    }
}
