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
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ProfileActivity;
public final class x20 extends AnimatorListenerAdapter {
    public final int f32922a;
    public final boolean f32923b;
    public final Object f32924c;

    public x20(int i10, Object obj, boolean z4) {
        this.f32922a = i10;
        this.f32924c = obj;
        this.f32923b = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32922a) {
            case 2:
                u60 u60Var = (u60) this.f32924c;
                AnimatorSet animatorSet = u60Var.U;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    u60Var.U = null;
                    return;
                }
                return;
            case 7:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f32924c;
                if (animator.equals(pipRoundVideoView.f24927r)) {
                    pipRoundVideoView.f24927r = null;
                    return;
                }
                return;
            case 9:
                ((zu0) this.f32924c).K1 = null;
                return;
            case 13:
                o61 o61Var = (o61) this.f32924c;
                AnimatorSet animatorSet2 = o61Var.d;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    o61Var.d = null;
                    return;
                }
                return;
            case 14:
                s61 s61Var = (s61) this.f32924c;
                AnimatorSet animatorSet3 = s61Var.f30992r;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    s61Var.f30992r = null;
                    return;
                }
                return;
            case 16:
                ((org.telegram.ui.os) this.f32924c).f39833w = null;
                return;
            case 20:
                ((org.telegram.ui.f70) this.f32924c).h = null;
                return;
            case 23:
                org.telegram.ui.hq0 hq0Var = (org.telegram.ui.hq0) this.f32924c;
                if (animator.equals(hq0Var.f37583h0)) {
                    hq0Var.f37583h0 = null;
                    return;
                }
                return;
            case 29:
                ((org.telegram.ui.p81) this.f32924c).f39953r = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        Drawable[] drawableArr;
        Drawable drawable;
        RadialProgressView radialProgressView;
        float f17;
        float f18;
        float dp;
        org.telegram.ui.kd kdVar;
        float f19;
        float f20;
        float f21;
        org.telegram.ui.Cells.y3 y3Var;
        switch (this.f32922a) {
            case 0:
                c30 c30Var = (c30) this.f32924c;
                a30 a30Var = c30Var.f25771a;
                if (!c30Var.C) {
                    if (this.f32923b) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    c30Var.Y = f10;
                    c30Var.R.setPinnedProgress(f10);
                    a30Var.setScaleX(1.0f - (c30Var.Y * 0.6f));
                    a30Var.setScaleY(1.0f - (c30Var.Y * 0.6f));
                    if (c30Var.T) {
                        c30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                View view = (View) this.f32924c;
                if (this.f32923b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 2:
                u60 u60Var = (u60) this.f32924c;
                AnimatorSet animatorSet = u60Var.U;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f32923b) {
                        u60Var.V.setVisibility(4);
                    }
                    u60Var.U = null;
                    return;
                }
                return;
            case 3:
                e70 e70Var = (e70) this.f32924c;
                boolean z4 = this.f32923b;
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                e70Var.f26460e0 = f11;
                e70.W(e70Var).invalidate();
                if (!z4) {
                    e70Var.S.setVisibility(8);
                    return;
                }
                return;
            case 4:
                yb0 yb0Var = (yb0) this.f32924c;
                if (yb0Var.getParent() != null) {
                    ((ViewGroup) yb0Var.getParent()).removeView(yb0Var);
                }
                org.telegram.ui.fl flVar = (org.telegram.ui.fl) yb0Var;
                MessagePreviewParams messagePreviewParams = flVar.E.f43144c5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (this.f32923b) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.el(flVar, 0), 15L);
                    return;
                }
                return;
            case 5:
                sb0 sb0Var = (sb0) this.f32924c;
                sb0Var.M = null;
                sb0Var.g(this.f32923b, false);
                return;
            case 6:
                xd0 xd0Var = (xd0) this.f32924c;
                TextView textView = xd0Var.f33050w;
                eh.d dVar = xd0Var.f33045e;
                if (this.f32923b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                dVar.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f12));
                dVar.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f12));
                dVar.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f12));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f12));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f12));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f12));
                xd0Var.f33049s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f12));
                return;
            case 7:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f32924c;
                if (animator.equals(pipRoundVideoView.f24927r)) {
                    if (!this.f32923b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f24927r = null;
                    return;
                }
                return;
            case 8:
                pn0 pn0Var = (pn0) this.f32924c;
                if (animator == pn0Var.D) {
                    boolean z10 = this.f32923b;
                    if (z10) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    pn0Var.C = f13;
                    pn0Var.setShown(f13);
                    if (!z10) {
                        pn0Var.setVisibility(8);
                    }
                    pn0Var.b(true);
                    return;
                }
                return;
            case 9:
                zu0 zu0Var = (zu0) this.f32924c;
                if (zu0Var.K1 != null) {
                    zu0Var.K1 = null;
                    if (!this.f32923b) {
                        zu0Var.f34018y0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                super.onAnimationEnd(animator);
                x11 x11Var = (x11) this.f32924c;
                if (this.f32923b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                x11Var.J = f14;
                x11Var.invalidate();
                return;
            case 11:
                s21 s21Var = (s21) this.f32924c;
                if (this.f32923b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                s21Var.C = f15;
                s21Var.h();
                return;
            case 12:
                w21 w21Var = (w21) this.f32924c;
                if (this.f32923b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                w21Var.N = f16;
                w21Var.h();
                w21Var.g();
                return;
            case 13:
                o61 o61Var = (o61) this.f32924c;
                AnimatorSet animatorSet2 = o61Var.d;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f32923b) {
                        o61Var.f29680e.setVisibility(4);
                    }
                    o61Var.d = null;
                    return;
                }
                return;
            case 14:
                s61 s61Var = (s61) this.f32924c;
                AnimatorSet animatorSet3 = s61Var.f30992r;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f32923b) {
                        s61Var.f30991n.setVisibility(4);
                    }
                    s61Var.f30992r = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f32924c;
                w2Var.v = null;
                if (this.f32923b) {
                    TextView[] textViewArr = w2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!w2Var.D && (drawable = (drawableArr = w2Var.f32446e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                w2Var.D = false;
                if (!w2Var.L) {
                    w2Var.f32448n = w2Var.f32449r;
                }
                w2Var.f32450s = 0.0f;
                w2Var.invalidate();
                return;
            case 16:
                org.telegram.ui.os osVar = (org.telegram.ui.os) this.f32924c;
                if (osVar.f39833w != null && (radialProgressView = osVar.f39832s) != null) {
                    if (!this.f32923b) {
                        radialProgressView.setVisibility(4);
                        osVar.v.setVisibility(4);
                    }
                    osVar.f39833w = null;
                    return;
                }
                return;
            case 17:
                org.telegram.ui.hz hzVar = (org.telegram.ui.hz) this.f32924c;
                if (this.f32923b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                hzVar.f37696r = f17;
                p9 p9Var = hzVar.f37692c;
                int i11 = org.telegram.ui.ActionBar.k6.C6;
                int v02 = org.telegram.ui.ActionBar.k6.v0(i11, hzVar.f37690a);
                int i12 = org.telegram.ui.ActionBar.k6.Oh;
                int d = i0.a.d(hzVar.f37696r, v02, org.telegram.ui.ActionBar.k6.v0(i12, hzVar.f37690a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                p9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                hzVar.f37692c.invalidate();
                hzVar.f37694f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - hzVar.f37696r, org.telegram.ui.ActionBar.k6.v0(i11, hzVar.f37690a), org.telegram.ui.ActionBar.k6.v0(i12, hzVar.f37690a)), mode));
                hzVar.f37694f.invalidate();
                return;
            case 18:
                org.telegram.ui.u00 u00Var = (org.telegram.ui.u00) this.f32924c;
                if (this.f32923b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                u00Var.f41751s = f18;
                u00Var.invalidate();
                return;
            case 19:
                org.telegram.ui.d60 d60Var = (org.telegram.ui.d60) this.f32924c;
                d60Var.R2 = null;
                org.telegram.ui.ActionBar.l5 subtitleTextView = d60Var.L.getSubtitleTextView();
                if (this.f32923b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
            case 20:
                org.telegram.ui.f70 f70Var = (org.telegram.ui.f70) this.f32924c;
                if (f70Var.h != null && (kdVar = f70Var.f36775f) != null) {
                    if (this.f32923b) {
                        kdVar.setVisibility(4);
                    } else {
                        f70Var.f36776n.setVisibility(4);
                    }
                    f70Var.h = null;
                    return;
                }
                return;
            case 21:
                org.telegram.ui.og0 og0Var = (org.telegram.ui.og0) this.f32924c;
                if (!this.f32923b) {
                    og0Var.S.setVisibility(4);
                }
                AnimatorSet animatorSet4 = og0Var.I;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    og0Var.I = null;
                    return;
                }
                return;
            case 22:
                if (!this.f32923b) {
                    ((PasscodeActivity) this.f32924c).v.setVisibility(8);
                    return;
                }
                return;
            case 23:
                org.telegram.ui.hq0 hq0Var = (org.telegram.ui.hq0) this.f32924c;
                if (animator.equals(hq0Var.f37583h0)) {
                    if (!this.f32923b) {
                        hq0Var.W.setVisibility(4);
                        hq0Var.X.setVisibility(4);
                    }
                    hq0Var.f37583h0 = null;
                    return;
                }
                return;
            case 24:
                org.telegram.ui.tv0 tv0Var = (org.telegram.ui.tv0) this.f32924c;
                if (this.f32923b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                tv0Var.B = f19;
                return;
            case 25:
                org.telegram.ui.l01 l01Var = (org.telegram.ui.l01) this.f32924c;
                if (l01Var.h) {
                    org.telegram.ui.ActionBar.w0 w0Var = l01Var.f38546n.R0;
                    if (w0Var != null) {
                        w0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = l01Var.f38546n;
                    if (profileActivity.K0) {
                        profileActivity.P0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = l01Var.f38546n;
                    if (profileActivity2.I0) {
                        profileActivity2.N0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = l01Var.f38546n;
                    if (profileActivity3.J0) {
                        profileActivity3.O0.setVisibility(8);
                    }
                } else {
                    l01Var.setVisibility(8);
                }
                l01Var.f38546n.l5(false);
                return;
            case 26:
                org.telegram.ui.r11 r11Var = (org.telegram.ui.r11) this.f32924c;
                if (this.f32923b) {
                    r11Var.f40747c.setVisibility(8);
                    return;
                } else {
                    r11Var.f40749f.setVisibility(8);
                    return;
                }
            case 27:
                org.telegram.ui.r41 r41Var = (org.telegram.ui.r41) this.f32924c;
                if (this.f32923b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                r41Var.v = f20;
                if (r41Var.P) {
                    r41Var.K.invalidate();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.n61 n61Var = (org.telegram.ui.n61) this.f32924c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = n61Var.v;
                if (this.f32923b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                n61Var.I = f21;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f21);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(pr.f30184g.getInterpolation(n61Var.I));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i13 = 0; i13 < itemsCount; i13++) {
                    float cascade = AndroidUtilities.cascade(n61Var.I, i13, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i13).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i13).setAlpha(cascade);
                }
                n61Var.K = null;
                return;
            default:
                org.telegram.ui.p81 p81Var = (org.telegram.ui.p81) this.f32924c;
                if (p81Var.f39953r != null && (y3Var = p81Var.f39954s) != null) {
                    if (!this.f32923b) {
                        y3Var.setVisibility(4);
                    }
                    p81Var.f39953r = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32922a) {
            case 21:
                if (this.f32923b) {
                    ((org.telegram.ui.og0) this.f32924c).S.setVisibility(0);
                    return;
                }
                return;
            case 22:
                if (this.f32923b) {
                    ((PasscodeActivity) this.f32924c).v.setVisibility(0);
                    return;
                }
                return;
            case 23:
            case 24:
            default:
                super.onAnimationStart(animator);
                return;
            case 25:
                org.telegram.ui.l01 l01Var = (org.telegram.ui.l01) this.f32924c;
                org.telegram.ui.ActionBar.w0 w0Var = l01Var.f38546n.R0;
                if (w0Var != null && !this.f32923b) {
                    w0Var.setClickable(true);
                }
                ProfileActivity profileActivity = l01Var.f38546n;
                if (profileActivity.K0) {
                    profileActivity.P0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = l01Var.f38546n;
                if (profileActivity2.I0) {
                    profileActivity2.N0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = l01Var.f38546n;
                if (profileActivity3.J0) {
                    profileActivity3.O0.setVisibility(0);
                }
                l01Var.setVisibility(0);
                l01Var.f38546n.l5(false);
                return;
            case 26:
                org.telegram.ui.r11 r11Var = (org.telegram.ui.r11) this.f32924c;
                if (this.f32923b) {
                    r11Var.f40749f.setAlpha(0.0f);
                    r11Var.f40749f.setVisibility(0);
                    return;
                }
                r11Var.f40747c.setAlpha(0.0f);
                r11Var.f40747c.setVisibility(0);
                return;
        }
    }

    public x20(View view) {
        this.f32922a = 1;
        this.f32924c = view;
        this.f32923b = true;
    }

    public x20(View view, boolean z4) {
        this.f32922a = 1;
        this.f32924c = view;
        this.f32923b = z4;
    }
}
