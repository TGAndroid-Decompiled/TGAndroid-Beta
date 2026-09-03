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
    public final int f32936a;
    public final boolean f32937b;
    public final Object f32938c;

    public x20(int i10, Object obj, boolean z4) {
        this.f32936a = i10;
        this.f32938c = obj;
        this.f32937b = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32936a) {
            case 2:
                u60 u60Var = (u60) this.f32938c;
                AnimatorSet animatorSet = u60Var.U;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    u60Var.U = null;
                    return;
                }
                return;
            case 7:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f32938c;
                if (animator.equals(pipRoundVideoView.f24929r)) {
                    pipRoundVideoView.f24929r = null;
                    return;
                }
                return;
            case 9:
                ((yu0) this.f32938c).K1 = null;
                return;
            case 13:
                n61 n61Var = (n61) this.f32938c;
                AnimatorSet animatorSet2 = n61Var.d;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    n61Var.d = null;
                    return;
                }
                return;
            case 14:
                r61 r61Var = (r61) this.f32938c;
                AnimatorSet animatorSet3 = r61Var.f30669r;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    r61Var.f30669r = null;
                    return;
                }
                return;
            case 16:
                ((org.telegram.ui.os) this.f32938c).f39798w = null;
                return;
            case 20:
                ((org.telegram.ui.f70) this.f32938c).h = null;
                return;
            case 23:
                org.telegram.ui.mq0 mq0Var = (org.telegram.ui.mq0) this.f32938c;
                if (animator.equals(mq0Var.f39043h0)) {
                    mq0Var.f39043h0 = null;
                    return;
                }
                return;
            case 29:
                ((org.telegram.ui.v81) this.f32938c).f42050r = null;
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
        switch (this.f32936a) {
            case 0:
                c30 c30Var = (c30) this.f32938c;
                a30 a30Var = c30Var.f25749a;
                if (!c30Var.C) {
                    if (this.f32937b) {
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
                View view = (View) this.f32938c;
                if (this.f32937b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 2:
                u60 u60Var = (u60) this.f32938c;
                AnimatorSet animatorSet = u60Var.U;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f32937b) {
                        u60Var.V.setVisibility(4);
                    }
                    u60Var.U = null;
                    return;
                }
                return;
            case 3:
                e70 e70Var = (e70) this.f32938c;
                boolean z4 = this.f32937b;
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                e70Var.f26471e0 = f11;
                e70.W(e70Var).invalidate();
                if (!z4) {
                    e70Var.S.setVisibility(8);
                    return;
                }
                return;
            case 4:
                yb0 yb0Var = (yb0) this.f32938c;
                if (yb0Var.getParent() != null) {
                    ((ViewGroup) yb0Var.getParent()).removeView(yb0Var);
                }
                org.telegram.ui.fl flVar = (org.telegram.ui.fl) yb0Var;
                MessagePreviewParams messagePreviewParams = flVar.E.f43122c5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (this.f32937b) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.el(flVar, 0), 15L);
                    return;
                }
                return;
            case 5:
                sb0 sb0Var = (sb0) this.f32938c;
                sb0Var.M = null;
                sb0Var.g(this.f32937b, false);
                return;
            case 6:
                xd0 xd0Var = (xd0) this.f32938c;
                TextView textView = xd0Var.f33044w;
                eh.d dVar = xd0Var.f33039e;
                if (this.f32937b) {
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
                xd0Var.f33043s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f12));
                return;
            case 7:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f32938c;
                if (animator.equals(pipRoundVideoView.f24929r)) {
                    if (!this.f32937b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f24929r = null;
                    return;
                }
                return;
            case 8:
                on0 on0Var = (on0) this.f32938c;
                if (animator == on0Var.D) {
                    boolean z10 = this.f32937b;
                    if (z10) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    on0Var.C = f13;
                    on0Var.setShown(f13);
                    if (!z10) {
                        on0Var.setVisibility(8);
                    }
                    on0Var.b(true);
                    return;
                }
                return;
            case 9:
                yu0 yu0Var = (yu0) this.f32938c;
                if (yu0Var.K1 != null) {
                    yu0Var.K1 = null;
                    if (!this.f32937b) {
                        yu0Var.f33663y0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                super.onAnimationEnd(animator);
                w11 w11Var = (w11) this.f32938c;
                if (this.f32937b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                w11Var.J = f14;
                w11Var.invalidate();
                return;
            case 11:
                r21 r21Var = (r21) this.f32938c;
                if (this.f32937b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                r21Var.C = f15;
                r21Var.h();
                return;
            case 12:
                v21 v21Var = (v21) this.f32938c;
                if (this.f32937b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                v21Var.N = f16;
                v21Var.h();
                v21Var.g();
                return;
            case 13:
                n61 n61Var = (n61) this.f32938c;
                AnimatorSet animatorSet2 = n61Var.d;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f32937b) {
                        n61Var.f29403e.setVisibility(4);
                    }
                    n61Var.d = null;
                    return;
                }
                return;
            case 14:
                r61 r61Var = (r61) this.f32938c;
                AnimatorSet animatorSet3 = r61Var.f30669r;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f32937b) {
                        r61Var.f30668n.setVisibility(4);
                    }
                    r61Var.f30669r = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f32938c;
                w2Var.v = null;
                if (this.f32937b) {
                    TextView[] textViewArr = w2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!w2Var.D && (drawable = (drawableArr = w2Var.f32451e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                w2Var.D = false;
                if (!w2Var.L) {
                    w2Var.f32453n = w2Var.f32454r;
                }
                w2Var.f32455s = 0.0f;
                w2Var.invalidate();
                return;
            case 16:
                org.telegram.ui.os osVar = (org.telegram.ui.os) this.f32938c;
                if (osVar.f39798w != null && (radialProgressView = osVar.f39797s) != null) {
                    if (!this.f32937b) {
                        radialProgressView.setVisibility(4);
                        osVar.v.setVisibility(4);
                    }
                    osVar.f39798w = null;
                    return;
                }
                return;
            case 17:
                org.telegram.ui.hz hzVar = (org.telegram.ui.hz) this.f32938c;
                if (this.f32937b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                hzVar.f37507r = f17;
                p9 p9Var = hzVar.f37503c;
                int i11 = org.telegram.ui.ActionBar.k6.C6;
                int v02 = org.telegram.ui.ActionBar.k6.v0(i11, hzVar.f37501a);
                int i12 = org.telegram.ui.ActionBar.k6.Oh;
                int d = i0.a.d(hzVar.f37507r, v02, org.telegram.ui.ActionBar.k6.v0(i12, hzVar.f37501a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                p9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                hzVar.f37503c.invalidate();
                hzVar.f37505f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - hzVar.f37507r, org.telegram.ui.ActionBar.k6.v0(i11, hzVar.f37501a), org.telegram.ui.ActionBar.k6.v0(i12, hzVar.f37501a)), mode));
                hzVar.f37505f.invalidate();
                return;
            case 18:
                org.telegram.ui.u00 u00Var = (org.telegram.ui.u00) this.f32938c;
                if (this.f32937b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                u00Var.f41677s = f18;
                u00Var.invalidate();
                return;
            case 19:
                org.telegram.ui.d60 d60Var = (org.telegram.ui.d60) this.f32938c;
                d60Var.R2 = null;
                org.telegram.ui.ActionBar.l5 subtitleTextView = d60Var.L.getSubtitleTextView();
                if (this.f32937b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
            case 20:
                org.telegram.ui.f70 f70Var = (org.telegram.ui.f70) this.f32938c;
                if (f70Var.h != null && (kdVar = f70Var.f36694f) != null) {
                    if (this.f32937b) {
                        kdVar.setVisibility(4);
                    } else {
                        f70Var.f36695n.setVisibility(4);
                    }
                    f70Var.h = null;
                    return;
                }
                return;
            case 21:
                org.telegram.ui.og0 og0Var = (org.telegram.ui.og0) this.f32938c;
                if (!this.f32937b) {
                    og0Var.S.setVisibility(4);
                }
                AnimatorSet animatorSet4 = og0Var.I;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    og0Var.I = null;
                    return;
                }
                return;
            case 22:
                if (!this.f32937b) {
                    ((PasscodeActivity) this.f32938c).v.setVisibility(8);
                    return;
                }
                return;
            case 23:
                org.telegram.ui.mq0 mq0Var = (org.telegram.ui.mq0) this.f32938c;
                if (animator.equals(mq0Var.f39043h0)) {
                    if (!this.f32937b) {
                        mq0Var.W.setVisibility(4);
                        mq0Var.X.setVisibility(4);
                    }
                    mq0Var.f39043h0 = null;
                    return;
                }
                return;
            case 24:
                org.telegram.ui.yv0 yv0Var = (org.telegram.ui.yv0) this.f32938c;
                if (this.f32937b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                yv0Var.B = f19;
                return;
            case 25:
                org.telegram.ui.q01 q01Var = (org.telegram.ui.q01) this.f32938c;
                if (q01Var.h) {
                    org.telegram.ui.ActionBar.w0 w0Var = q01Var.f40292n.R0;
                    if (w0Var != null) {
                        w0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = q01Var.f40292n;
                    if (profileActivity.K0) {
                        profileActivity.P0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = q01Var.f40292n;
                    if (profileActivity2.I0) {
                        profileActivity2.N0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = q01Var.f40292n;
                    if (profileActivity3.J0) {
                        profileActivity3.O0.setVisibility(8);
                    }
                } else {
                    q01Var.setVisibility(8);
                }
                q01Var.f40292n.l5(false);
                return;
            case 26:
                org.telegram.ui.v11 v11Var = (org.telegram.ui.v11) this.f32938c;
                if (this.f32937b) {
                    v11Var.f41990c.setVisibility(8);
                    return;
                } else {
                    v11Var.f41992f.setVisibility(8);
                    return;
                }
            case 27:
                org.telegram.ui.w41 w41Var = (org.telegram.ui.w41) this.f32938c;
                if (this.f32937b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                w41Var.v = f20;
                if (w41Var.P) {
                    w41Var.K.invalidate();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.s61 s61Var = (org.telegram.ui.s61) this.f32938c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = s61Var.v;
                if (this.f32937b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                s61Var.I = f21;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f21);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(pr.f30169g.getInterpolation(s61Var.I));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i13 = 0; i13 < itemsCount; i13++) {
                    float cascade = AndroidUtilities.cascade(s61Var.I, i13, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i13).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i13).setAlpha(cascade);
                }
                s61Var.K = null;
                return;
            default:
                org.telegram.ui.v81 v81Var = (org.telegram.ui.v81) this.f32938c;
                if (v81Var.f42050r != null && (y3Var = v81Var.f42051s) != null) {
                    if (!this.f32937b) {
                        y3Var.setVisibility(4);
                    }
                    v81Var.f42050r = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32936a) {
            case 21:
                if (this.f32937b) {
                    ((org.telegram.ui.og0) this.f32938c).S.setVisibility(0);
                    return;
                }
                return;
            case 22:
                if (this.f32937b) {
                    ((PasscodeActivity) this.f32938c).v.setVisibility(0);
                    return;
                }
                return;
            case 23:
            case 24:
            default:
                super.onAnimationStart(animator);
                return;
            case 25:
                org.telegram.ui.q01 q01Var = (org.telegram.ui.q01) this.f32938c;
                org.telegram.ui.ActionBar.w0 w0Var = q01Var.f40292n.R0;
                if (w0Var != null && !this.f32937b) {
                    w0Var.setClickable(true);
                }
                ProfileActivity profileActivity = q01Var.f40292n;
                if (profileActivity.K0) {
                    profileActivity.P0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = q01Var.f40292n;
                if (profileActivity2.I0) {
                    profileActivity2.N0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = q01Var.f40292n;
                if (profileActivity3.J0) {
                    profileActivity3.O0.setVisibility(0);
                }
                q01Var.setVisibility(0);
                q01Var.f40292n.l5(false);
                return;
            case 26:
                org.telegram.ui.v11 v11Var = (org.telegram.ui.v11) this.f32938c;
                if (this.f32937b) {
                    v11Var.f41992f.setAlpha(0.0f);
                    v11Var.f41992f.setVisibility(0);
                    return;
                }
                v11Var.f41990c.setAlpha(0.0f);
                v11Var.f41990c.setVisibility(0);
                return;
        }
    }

    public x20(View view) {
        this.f32936a = 1;
        this.f32938c = view;
        this.f32937b = true;
    }

    public x20(View view, boolean z4) {
        this.f32936a = 1;
        this.f32938c = view;
        this.f32937b = z4;
    }
}
