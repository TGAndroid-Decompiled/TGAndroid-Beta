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
    public final int f37909a;
    public boolean f37910b;
    public final Object f37911c;

    public ho(int i10, Object obj, boolean z10) {
        this.f37909a = i10;
        this.f37911c = obj;
        this.f37910b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37909a) {
            case 0:
                ((ko) this.f37911c).h = null;
                return;
            case 1:
                org.telegram.ui.Components.ba baVar = (org.telegram.ui.Components.ba) this.f37911c;
                AnimatorSet animatorSet = baVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    baVar.h = null;
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.Components.ri) this.f37911c).f30133b1 = null;
                return;
            case 4:
                this.f37910b = true;
                return;
            case 9:
                org.telegram.ui.Components.t00 t00Var = (org.telegram.ui.Components.t00) this.f37911c;
                AnimatorSet animatorSet2 = t00Var.f30674f;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t00Var.f30674f = null;
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.k70 k70Var = (org.telegram.ui.Components.k70) this.f37911c;
                AnimatorSet animatorSet3 = k70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    k70Var.X = null;
                    return;
                }
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f37911c;
                if (animator.equals(pipRoundVideoView.f24409r)) {
                    pipRoundVideoView.f24409r = null;
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.wv0) this.f37911c).O1 = null;
                return;
            case 24:
                org.telegram.ui.Components.n71 n71Var = (org.telegram.ui.Components.n71) this.f37911c;
                AnimatorSet animatorSet4 = n71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    n71Var.d = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.r71 r71Var = (org.telegram.ui.Components.r71) this.f37911c;
                AnimatorSet animatorSet5 = r71Var.f30092r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    r71Var.f30092r = null;
                    return;
                }
                return;
            case 27:
                ((hs) this.f37911c).f37978w = null;
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
        switch (this.f37909a) {
            case 0:
                ko koVar = (ko) this.f37911c;
                if (koVar.h != null && (radialProgressView = koVar.f38967n) != null) {
                    if (!this.f37910b) {
                        radialProgressView.setVisibility(4);
                        koVar.f38959f.setVisibility(4);
                    }
                    koVar.h = null;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.ba baVar = (org.telegram.ui.Components.ba) this.f37911c;
                AnimatorSet animatorSet = baVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f37910b) {
                        baVar.f24944c.setVisibility(4);
                        return;
                    } else {
                        baVar.f24943b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 2:
                org.telegram.ui.Components.wc wcVar = (org.telegram.ui.Components.wc) this.f37911c;
                if (animator == wcVar.f32184g) {
                    wcVar.f32184g = null;
                    if (this.f37910b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    wcVar.f32186j = f7;
                    wcVar.b();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.ri riVar = (org.telegram.ui.Components.ri) this.f37911c;
                if (riVar.f30133b1 != null) {
                    if (this.f37910b) {
                        if (riVar.V0) {
                            org.telegram.ui.Components.ji jiVar = riVar.B0;
                            if (jiVar == null || jiVar.L()) {
                                riVar.A1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.u0 u0Var = riVar.f30153h1;
                    if (u0Var != null) {
                        u0Var.setVisibility(4);
                    }
                    if (riVar.T0 != 0 || !riVar.f30190t1) {
                        riVar.f30140d1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.ro roVar = (org.telegram.ui.Components.ro) this.f37911c;
                if (!this.f37910b) {
                    org.telegram.ui.Components.u9 u9Var = roVar.h;
                    roVar.h = roVar.f30247n;
                    roVar.f30247n = u9Var;
                    u9Var.setVisibility(8);
                    roVar.f30247n.setAlpha(0.0f);
                    roVar.h.setVisibility(0);
                    roVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 5:
                boolean z10 = this.f37910b;
                org.telegram.ui.Components.bp bpVar = (org.telegram.ui.Components.bp) this.f37911c;
                if (animator == bpVar.e) {
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    bpVar.d = f10;
                    bpVar.setShown(f10);
                    if (!z10) {
                        bpVar.setVisibility(8);
                    }
                    bpVar.a(true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.up upVar = (org.telegram.ui.Components.up) this.f37911c;
                if (this.f37910b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                upVar.f31182f0 = f11;
                upVar.I.setTranslationY((-AndroidUtilities.dp(7.0f)) * upVar.f31182f0);
                return;
            case 7:
                if (!this.f37910b) {
                    ((org.telegram.ui.Components.uq) this.f37911c).H.setVisibility(8);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.ew ewVar = (org.telegram.ui.Components.ew) this.f37911c;
                org.telegram.ui.Components.iw iwVar = ewVar.N;
                if (iwVar.U && !ewVar.h) {
                    if (!this.f37910b && !ewVar.f26126n) {
                        ewVar.setBackground(null);
                        return;
                    } else if (ewVar.getBackground() == null) {
                        ewVar.setBackground(org.telegram.ui.ActionBar.k6.Z(iwVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 9:
                org.telegram.ui.Components.t00 t00Var = (org.telegram.ui.Components.t00) this.f37911c;
                AnimatorSet animatorSet2 = t00Var.f30674f;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f37910b) {
                        t00Var.h.setVisibility(4);
                    }
                    t00Var.f30674f = null;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.e10 e10Var = (org.telegram.ui.Components.e10) this.f37911c;
                if (this.f37910b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                e10Var.f25915n = f12;
                e10Var.invalidate();
                return;
            case 11:
                org.telegram.ui.Components.g30 g30Var = (org.telegram.ui.Components.g30) this.f37911c;
                org.telegram.ui.Components.d30 d30Var = g30Var.f26537a;
                if (!g30Var.F) {
                    if (this.f37910b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    g30Var.f26540b0 = f13;
                    g30Var.U.setPinnedProgress(f13);
                    d30Var.setScaleX(1.0f - (g30Var.f26540b0 * 0.6f));
                    d30Var.setScaleY(1.0f - (g30Var.f26540b0 * 0.6f));
                    if (g30Var.W) {
                        g30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                View view = (View) this.f37911c;
                if (this.f37910b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 13:
                org.telegram.ui.Components.k70 k70Var = (org.telegram.ui.Components.k70) this.f37911c;
                AnimatorSet animatorSet3 = k70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f37910b) {
                        k70Var.Y.setVisibility(4);
                    }
                    k70Var.X = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.v70 v70Var = (org.telegram.ui.Components.v70) this.f37911c;
                boolean z11 = this.f37910b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                v70Var.f31353h0 = f14;
                org.telegram.ui.Components.v70.W(v70Var).invalidate();
                if (!z11) {
                    v70Var.V.setVisibility(8);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.pc0 pc0Var = (org.telegram.ui.Components.pc0) this.f37911c;
                if (pc0Var.getParent() != null) {
                    ((ViewGroup) pc0Var.getParent()).removeView(pc0Var);
                }
                boolean z12 = this.f37910b;
                bl blVar = (bl) pc0Var;
                MessagePreviewParams messagePreviewParams = blVar.H.f41660r5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new al(blVar, 0), 15L);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.jc0 jc0Var = (org.telegram.ui.Components.jc0) this.f37911c;
                jc0Var.P = null;
                jc0Var.h(this.f37910b, false);
                return;
            case 17:
                org.telegram.ui.Components.ne0 ne0Var = (org.telegram.ui.Components.ne0) this.f37911c;
                TextView textView = ne0Var.f28896w;
                ci.h4 h4Var = ne0Var.e;
                if (this.f37910b) {
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
                ne0Var.f28895s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f37911c;
                if (animator.equals(pipRoundVideoView.f24409r)) {
                    if (!this.f37910b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f24409r = null;
                    return;
                }
                return;
            case 19:
                boolean z13 = this.f37910b;
                org.telegram.ui.Components.io0 io0Var = (org.telegram.ui.Components.io0) this.f37911c;
                if (animator == io0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    io0Var.F = f16;
                    io0Var.setShown(f16);
                    if (!z13) {
                        io0Var.setVisibility(8);
                    }
                    io0Var.b(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.wv0 wv0Var = (org.telegram.ui.Components.wv0) this.f37911c;
                if (wv0Var.O1 != null) {
                    wv0Var.O1 = null;
                    if (!this.f37910b) {
                        wv0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.u21 u21Var = (org.telegram.ui.Components.u21) this.f37911c;
                if (this.f37910b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                u21Var.M = f17;
                u21Var.invalidate();
                return;
            case 22:
                org.telegram.ui.Components.q31 q31Var = (org.telegram.ui.Components.q31) this.f37911c;
                if (this.f37910b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                q31Var.F = f18;
                q31Var.h();
                return;
            case 23:
                org.telegram.ui.Components.u31 u31Var = (org.telegram.ui.Components.u31) this.f37911c;
                if (this.f37910b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                u31Var.U = f19;
                u31Var.h();
                u31Var.g();
                return;
            case 24:
                org.telegram.ui.Components.n71 n71Var = (org.telegram.ui.Components.n71) this.f37911c;
                AnimatorSet animatorSet4 = n71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f37910b) {
                        n71Var.e.setVisibility(4);
                    }
                    n71Var.d = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.r71 r71Var = (org.telegram.ui.Components.r71) this.f37911c;
                AnimatorSet animatorSet5 = r71Var.f30092r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f37910b) {
                        r71Var.f30091n.setVisibility(4);
                    }
                    r71Var.f30092r = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f37911c;
                t2Var.v = null;
                if (this.f37910b) {
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
                    t2Var.f31912n = t2Var.f31913r;
                }
                t2Var.f31914s = 0.0f;
                t2Var.invalidate();
                return;
            case 27:
                hs hsVar = (hs) this.f37911c;
                if (hsVar.f37978w != null && (radialProgressView2 = hsVar.f37977s) != null) {
                    if (!this.f37910b) {
                        radialProgressView2.setVisibility(4);
                        hsVar.v.setVisibility(4);
                    }
                    hsVar.f37978w = null;
                    return;
                }
                return;
            case 28:
                vy vyVar = (vy) this.f37911c;
                if (this.f37910b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                vyVar.f42843r = f20;
                org.telegram.ui.Components.u9 u9Var2 = vyVar.f42840c;
                int i11 = org.telegram.ui.ActionBar.k6.C6;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i11, vyVar.f42838a);
                int i12 = org.telegram.ui.ActionBar.k6.Oh;
                int f22 = i0.a.f(vyVar.f42843r, w02, org.telegram.ui.ActionBar.k6.w0(i12, vyVar.f42838a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                u9Var2.setColorFilter(new PorterDuffColorFilter(f22, mode));
                vyVar.f42840c.invalidate();
                vyVar.f42841f.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - vyVar.f42843r, org.telegram.ui.ActionBar.k6.w0(i11, vyVar.f42838a), org.telegram.ui.ActionBar.k6.w0(i12, vyVar.f42838a)), mode));
                vyVar.f42841f.invalidate();
                return;
            default:
                j00 j00Var = (j00) this.f37911c;
                if (this.f37910b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                j00Var.f38420s = f21;
                j00Var.invalidate();
                return;
        }
    }

    public ho(View view) {
        this.f37909a = 12;
        this.f37911c = view;
        this.f37910b = true;
    }

    public ho(View view, boolean z10) {
        this.f37909a = 12;
        this.f37911c = view;
        this.f37910b = z10;
    }

    public ho(org.telegram.ui.Components.ro roVar) {
        this.f37909a = 4;
        this.f37911c = roVar;
    }
}
