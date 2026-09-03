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
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ProfileActivity;
public final class m00 extends AnimatorListenerAdapter {
    public final int f26901a;
    public final boolean f26902b;
    public final Object f26903c;

    public m00(int i10, Object obj, boolean z4) {
        this.f26901a = i10;
        this.f26903c = obj;
        this.f26902b = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26901a) {
            case 0:
                o00 o00Var = (o00) this.f26903c;
                AnimatorSet animatorSet = o00Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    o00Var.e = null;
                    return;
                }
                return;
            case 4:
                t60 t60Var = (t60) this.f26903c;
                AnimatorSet animatorSet2 = t60Var.U;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t60Var.U = null;
                    return;
                }
                return;
            case 9:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f26903c;
                if (animator.equals(pipRoundVideoView.f23048r)) {
                    pipRoundVideoView.f23048r = null;
                    return;
                }
                return;
            case 11:
                ((yu0) this.f26903c).K1 = null;
                return;
            case 15:
                m61 m61Var = (m61) this.f26903c;
                AnimatorSet animatorSet3 = m61Var.d;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    m61Var.d = null;
                    return;
                }
                return;
            case 16:
                q61 q61Var = (q61) this.f26903c;
                AnimatorSet animatorSet4 = q61Var.f28094r;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    q61Var.f28094r = null;
                    return;
                }
                return;
            case 18:
                ((org.telegram.ui.ps) this.f26903c).f37226w = null;
                return;
            case 22:
                ((org.telegram.ui.g70) this.f26903c).h = null;
                return;
            case 25:
                org.telegram.ui.mq0 mq0Var = (org.telegram.ui.mq0) this.f26903c;
                if (animator.equals(mq0Var.f36172h0)) {
                    mq0Var.f36172h0 = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        Drawable[] drawableArr;
        Drawable drawable;
        RadialProgressView radialProgressView;
        float f18;
        float f19;
        float dp;
        org.telegram.ui.md mdVar;
        float f20;
        float f21;
        switch (this.f26901a) {
            case 0:
                o00 o00Var = (o00) this.f26903c;
                AnimatorSet animatorSet = o00Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f26902b) {
                        o00Var.f27419f.setVisibility(4);
                    }
                    o00Var.e = null;
                    return;
                }
                return;
            case 1:
                z00 z00Var = (z00) this.f26903c;
                if (this.f26902b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                z00Var.h = f10;
                z00Var.invalidate();
                return;
            case 2:
                b30 b30Var = (b30) this.f26903c;
                z20 z20Var = b30Var.f23532a;
                if (!b30Var.C) {
                    if (this.f26902b) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    b30Var.Y = f11;
                    b30Var.R.setPinnedProgress(f11);
                    z20Var.setScaleX(1.0f - (b30Var.Y * 0.6f));
                    z20Var.setScaleY(1.0f - (b30Var.Y * 0.6f));
                    if (b30Var.T) {
                        b30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                super.onAnimationEnd(animator);
                View view = (View) this.f26903c;
                if (this.f26902b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 4:
                t60 t60Var = (t60) this.f26903c;
                AnimatorSet animatorSet2 = t60Var.U;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f26902b) {
                        t60Var.V.setVisibility(4);
                    }
                    t60Var.U = null;
                    return;
                }
                return;
            case 5:
                d70 d70Var = (d70) this.f26903c;
                boolean z4 = this.f26902b;
                if (z4) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                d70Var.f24192e0 = f12;
                d70.W(d70Var).invalidate();
                if (!z4) {
                    d70Var.S.setVisibility(8);
                    return;
                }
                return;
            case 6:
                xb0 xb0Var = (xb0) this.f26903c;
                if (xb0Var.getParent() != null) {
                    ((ViewGroup) xb0Var.getParent()).removeView(xb0Var);
                }
                org.telegram.ui.hl hlVar = (org.telegram.ui.hl) xb0Var;
                MessagePreviewParams messagePreviewParams = hlVar.E.f40542c5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (this.f26902b) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.gl(hlVar, 0), 15L);
                    return;
                }
                return;
            case 7:
                rb0 rb0Var = (rb0) this.f26903c;
                rb0Var.M = null;
                rb0Var.g(this.f26902b, false);
                return;
            case 8:
                wd0 wd0Var = (wd0) this.f26903c;
                TextView textView = wd0Var.f30230w;
                dh.d dVar = wd0Var.e;
                if (this.f26902b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                dVar.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f13));
                dVar.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f13));
                dVar.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f13));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f13));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f13));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f13));
                wd0Var.f30229s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f13));
                return;
            case 9:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f26903c;
                if (animator.equals(pipRoundVideoView.f23048r)) {
                    if (!this.f26902b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f23048r = null;
                    return;
                }
                return;
            case 10:
                nn0 nn0Var = (nn0) this.f26903c;
                if (animator == nn0Var.D) {
                    boolean z10 = this.f26902b;
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    nn0Var.C = f14;
                    nn0Var.setShown(f14);
                    if (!z10) {
                        nn0Var.setVisibility(8);
                    }
                    nn0Var.b(true);
                    return;
                }
                return;
            case 11:
                yu0 yu0Var = (yu0) this.f26903c;
                if (yu0Var.K1 != null) {
                    yu0Var.K1 = null;
                    if (!this.f26902b) {
                        yu0Var.f31169y0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                w11 w11Var = (w11) this.f26903c;
                if (this.f26902b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                w11Var.J = f15;
                w11Var.invalidate();
                return;
            case 13:
                r21 r21Var = (r21) this.f26903c;
                if (this.f26902b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                r21Var.C = f16;
                r21Var.h();
                return;
            case 14:
                v21 v21Var = (v21) this.f26903c;
                if (this.f26902b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                v21Var.N = f17;
                v21Var.h();
                v21Var.g();
                return;
            case 15:
                m61 m61Var = (m61) this.f26903c;
                AnimatorSet animatorSet3 = m61Var.d;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f26902b) {
                        m61Var.e.setVisibility(4);
                    }
                    m61Var.d = null;
                    return;
                }
                return;
            case 16:
                q61 q61Var = (q61) this.f26903c;
                AnimatorSet animatorSet4 = q61Var.f28094r;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f26902b) {
                        q61Var.f28093n.setVisibility(4);
                    }
                    q61Var.f28094r = null;
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f26903c;
                v2Var.v = null;
                if (this.f26902b) {
                    TextView[] textViewArr = v2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!v2Var.D && (drawable = (drawableArr = v2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                v2Var.D = false;
                if (!v2Var.L) {
                    v2Var.f29973n = v2Var.f29974r;
                }
                v2Var.f29975s = 0.0f;
                v2Var.invalidate();
                return;
            case 18:
                org.telegram.ui.ps psVar = (org.telegram.ui.ps) this.f26903c;
                if (psVar.f37226w != null && (radialProgressView = psVar.f37225s) != null) {
                    if (!this.f26902b) {
                        radialProgressView.setVisibility(4);
                        psVar.v.setVisibility(4);
                    }
                    psVar.f37226w = null;
                    return;
                }
                return;
            case 19:
                org.telegram.ui.iz izVar = (org.telegram.ui.iz) this.f26903c;
                if (this.f26902b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                izVar.f35052r = f18;
                p9 p9Var = izVar.f35049c;
                int i11 = org.telegram.ui.ActionBar.j6.C6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i11, izVar.f35047a);
                int i12 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(izVar.f35052r, v02, org.telegram.ui.ActionBar.j6.v0(i12, izVar.f35047a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                p9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                izVar.f35049c.invalidate();
                izVar.f35050f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - izVar.f35052r, org.telegram.ui.ActionBar.j6.v0(i11, izVar.f35047a), org.telegram.ui.ActionBar.j6.v0(i12, izVar.f35047a)), mode));
                izVar.f35050f.invalidate();
                return;
            case 20:
                org.telegram.ui.v00 v00Var = (org.telegram.ui.v00) this.f26903c;
                if (this.f26902b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                v00Var.f38943s = f19;
                v00Var.invalidate();
                return;
            case 21:
                org.telegram.ui.e60 e60Var = (org.telegram.ui.e60) this.f26903c;
                e60Var.R2 = null;
                org.telegram.ui.ActionBar.k5 subtitleTextView = e60Var.L.getSubtitleTextView();
                if (this.f26902b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
            case 22:
                org.telegram.ui.g70 g70Var = (org.telegram.ui.g70) this.f26903c;
                if (g70Var.h != null && (mdVar = g70Var.f34343f) != null) {
                    if (this.f26902b) {
                        mdVar.setVisibility(4);
                    } else {
                        g70Var.f34344n.setVisibility(4);
                    }
                    g70Var.h = null;
                    return;
                }
                return;
            case 23:
                org.telegram.ui.pg0 pg0Var = (org.telegram.ui.pg0) this.f26903c;
                if (!this.f26902b) {
                    pg0Var.S.setVisibility(4);
                }
                AnimatorSet animatorSet5 = pg0Var.I;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    pg0Var.I = null;
                    return;
                }
                return;
            case 24:
                if (!this.f26902b) {
                    ((PasscodeActivity) this.f26903c).v.setVisibility(8);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.mq0 mq0Var = (org.telegram.ui.mq0) this.f26903c;
                if (animator.equals(mq0Var.f36172h0)) {
                    if (!this.f26902b) {
                        mq0Var.W.setVisibility(4);
                        mq0Var.X.setVisibility(4);
                    }
                    mq0Var.f36172h0 = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.yv0 yv0Var = (org.telegram.ui.yv0) this.f26903c;
                if (this.f26902b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                yv0Var.B = f20;
                return;
            case 27:
                org.telegram.ui.q01 q01Var = (org.telegram.ui.q01) this.f26903c;
                if (q01Var.h) {
                    org.telegram.ui.ActionBar.w0 w0Var = q01Var.f37274n.R0;
                    if (w0Var != null) {
                        w0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = q01Var.f37274n;
                    if (profileActivity.K0) {
                        profileActivity.P0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = q01Var.f37274n;
                    if (profileActivity2.I0) {
                        profileActivity2.N0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = q01Var.f37274n;
                    if (profileActivity3.J0) {
                        profileActivity3.O0.setVisibility(8);
                    }
                } else {
                    q01Var.setVisibility(8);
                }
                q01Var.f37274n.l5(false);
                return;
            case 28:
                org.telegram.ui.v11 v11Var = (org.telegram.ui.v11) this.f26903c;
                if (this.f26902b) {
                    v11Var.f38954c.setVisibility(8);
                    return;
                } else {
                    v11Var.f38955f.setVisibility(8);
                    return;
                }
            default:
                org.telegram.ui.w41 w41Var = (org.telegram.ui.w41) this.f26903c;
                if (this.f26902b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                w41Var.v = f21;
                if (w41Var.P) {
                    w41Var.K.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f26901a) {
            case 23:
                if (this.f26902b) {
                    ((org.telegram.ui.pg0) this.f26903c).S.setVisibility(0);
                    return;
                }
                return;
            case 24:
                if (this.f26902b) {
                    ((PasscodeActivity) this.f26903c).v.setVisibility(0);
                    return;
                }
                return;
            case 25:
            case 26:
            default:
                super.onAnimationStart(animator);
                return;
            case 27:
                org.telegram.ui.q01 q01Var = (org.telegram.ui.q01) this.f26903c;
                org.telegram.ui.ActionBar.w0 w0Var = q01Var.f37274n.R0;
                if (w0Var != null && !this.f26902b) {
                    w0Var.setClickable(true);
                }
                ProfileActivity profileActivity = q01Var.f37274n;
                if (profileActivity.K0) {
                    profileActivity.P0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = q01Var.f37274n;
                if (profileActivity2.I0) {
                    profileActivity2.N0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = q01Var.f37274n;
                if (profileActivity3.J0) {
                    profileActivity3.O0.setVisibility(0);
                }
                q01Var.setVisibility(0);
                q01Var.f37274n.l5(false);
                return;
            case 28:
                org.telegram.ui.v11 v11Var = (org.telegram.ui.v11) this.f26903c;
                if (this.f26902b) {
                    v11Var.f38955f.setAlpha(0.0f);
                    v11Var.f38955f.setVisibility(0);
                    return;
                }
                v11Var.f38954c.setAlpha(0.0f);
                v11Var.f38954c.setVisibility(0);
                return;
        }
    }

    public m00(View view) {
        this.f26901a = 3;
        this.f26903c = view;
        this.f26902b = true;
    }

    public m00(View view, boolean z4) {
        this.f26901a = 3;
        this.f26903c = view;
        this.f26902b = z4;
    }
}
