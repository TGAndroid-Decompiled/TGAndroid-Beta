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
public final class ba extends AnimatorListenerAdapter {
    public final int f22937a;
    public boolean f22938b;
    public final Object f22939c;

    public ba(int i10, Object obj, boolean z10) {
        this.f22937a = i10;
        this.f22939c = obj;
        this.f22938b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f22937a) {
            case 0:
                ca caVar = (ca) this.f22939c;
                AnimatorSet animatorSet = caVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    caVar.h = null;
                    return;
                }
                return;
            case 2:
                ((vi) this.f22939c).Y0 = null;
                return;
            case 3:
                this.f22938b = true;
                return;
            case 8:
                n00 n00Var = (n00) this.f22939c;
                AnimatorSet animatorSet2 = n00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    n00Var.e = null;
                    return;
                }
                return;
            case 12:
                z60 z60Var = (z60) this.f22939c;
                AnimatorSet animatorSet3 = z60Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    z60Var.X = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f22939c;
                if (animator.equals(pipRoundVideoView.f22306r)) {
                    pipRoundVideoView.f22306r = null;
                    return;
                }
                return;
            case 19:
                ((jv0) this.f22939c).N1 = null;
                return;
            case 23:
                y61 y61Var = (y61) this.f22939c;
                AnimatorSet animatorSet4 = y61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    y61Var.d = null;
                    return;
                }
                return;
            case 24:
                c71 c71Var = (c71) this.f22939c;
                AnimatorSet animatorSet5 = c71Var.f23188r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    c71Var.f23188r = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.ss) this.f22939c).f37517w = null;
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
        switch (this.f22937a) {
            case 0:
                ca caVar = (ca) this.f22939c;
                AnimatorSet animatorSet = caVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f22938b) {
                        caVar.f23218c.setVisibility(4);
                        return;
                    } else {
                        caVar.f23217b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                yc ycVar = (yc) this.f22939c;
                if (animator == ycVar.f30500g) {
                    ycVar.f30500g = null;
                    if (this.f22938b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ycVar.f30501i = f7;
                    ycVar.b();
                    return;
                }
                return;
            case 2:
                vi viVar = (vi) this.f22939c;
                if (viVar.Y0 != null) {
                    if (this.f22938b) {
                        if (viVar.S0) {
                            ni niVar = viVar.f29159y0;
                            if (niVar == null || niVar.J()) {
                                viVar.f29156x1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.v0 v0Var = viVar.f29095e1;
                    if (v0Var != null) {
                        v0Var.setVisibility(4);
                    }
                    if (viVar.Q0 != 0 || !viVar.f29131q1) {
                        viVar.f29082a1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                jo joVar = (jo) this.f22939c;
                if (!this.f22938b) {
                    v9 v9Var = joVar.h;
                    joVar.h = joVar.f25410n;
                    joVar.f25410n = v9Var;
                    v9Var.setVisibility(8);
                    joVar.f25410n.setAlpha(0.0f);
                    joVar.h.setVisibility(0);
                    joVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z10 = this.f22938b;
                to toVar = (to) this.f22939c;
                if (animator == toVar.e) {
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    toVar.d = f10;
                    toVar.setShown(f10);
                    if (!z10) {
                        toVar.setVisibility(8);
                    }
                    toVar.a(true);
                    return;
                }
                return;
            case 5:
                mp mpVar = (mp) this.f22939c;
                if (this.f22938b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                mpVar.f26452g0 = f11;
                mpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * mpVar.f26452g0);
                return;
            case 6:
                if (!this.f22938b) {
                    ((mq) this.f22939c).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                zv zvVar = (zv) this.f22939c;
                dw dwVar = zvVar.J;
                if (dwVar.U && !zvVar.h) {
                    if (!this.f22938b && !zvVar.f30944n) {
                        zvVar.setBackground(null);
                        return;
                    } else if (zvVar.getBackground() == null) {
                        zvVar.setBackground(org.telegram.ui.ActionBar.j6.Y(dwVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                n00 n00Var = (n00) this.f22939c;
                AnimatorSet animatorSet2 = n00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f22938b) {
                        n00Var.f26523f.setVisibility(4);
                    }
                    n00Var.e = null;
                    return;
                }
                return;
            case 9:
                y00 y00Var = (y00) this.f22939c;
                if (this.f22938b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                y00Var.h = f12;
                y00Var.invalidate();
                return;
            case 10:
                z20 z20Var = (z20) this.f22939c;
                x20 x20Var = z20Var.f30675a;
                if (!z20Var.F) {
                    if (this.f22938b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    z20Var.f30678b0 = f13;
                    z20Var.U.setPinnedProgress(f13);
                    x20Var.setScaleX(1.0f - (z20Var.f30678b0 * 0.6f));
                    x20Var.setScaleY(1.0f - (z20Var.f30678b0 * 0.6f));
                    if (z20Var.W) {
                        z20Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) this.f22939c;
                if (this.f22938b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 12:
                z60 z60Var = (z60) this.f22939c;
                AnimatorSet animatorSet3 = z60Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f22938b) {
                        z60Var.Y.setVisibility(4);
                    }
                    z60Var.X = null;
                    return;
                }
                return;
            case 13:
                j70 j70Var = (j70) this.f22939c;
                boolean z11 = this.f22938b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                j70Var.f25256h0 = f14;
                j70.W(j70Var).invalidate();
                if (!z11) {
                    j70Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                dc0 dc0Var = (dc0) this.f22939c;
                if (dc0Var.getParent() != null) {
                    ((ViewGroup) dc0Var.getParent()).removeView(dc0Var);
                }
                boolean z12 = this.f22938b;
                org.telegram.ui.fl flVar = (org.telegram.ui.fl) dc0Var;
                MessagePreviewParams messagePreviewParams = flVar.H.f40311f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.el(flVar, 1), 15L);
                    return;
                }
                return;
            case 15:
                xb0 xb0Var = (xb0) this.f22939c;
                xb0Var.P = null;
                xb0Var.g(this.f22938b, false);
                return;
            case 16:
                ae0 ae0Var = (ae0) this.f22939c;
                TextView textView = ae0Var.f22663w;
                ai.x5 x5Var = ae0Var.e;
                if (this.f22938b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                x5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f15));
                x5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f15));
                x5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f15));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f15));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f15));
                ae0Var.f22662s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f22939c;
                if (animator.equals(pipRoundVideoView.f22306r)) {
                    if (!this.f22938b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f22306r = null;
                    return;
                }
                return;
            case 18:
                boolean z13 = this.f22938b;
                un0 un0Var = (un0) this.f22939c;
                if (animator == un0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    un0Var.F = f16;
                    un0Var.setShown(f16);
                    if (!z13) {
                        un0Var.setVisibility(8);
                    }
                    un0Var.b(true);
                    return;
                }
                return;
            case 19:
                jv0 jv0Var = (jv0) this.f22939c;
                if (jv0Var.N1 != null) {
                    jv0Var.N1 = null;
                    if (!this.f22938b) {
                        jv0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                i21 i21Var = (i21) this.f22939c;
                if (this.f22938b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                i21Var.M = f17;
                i21Var.invalidate();
                return;
            case 21:
                g31 g31Var = (g31) this.f22939c;
                if (this.f22938b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                g31Var.F = f18;
                g31Var.h();
                return;
            case 22:
                k31 k31Var = (k31) this.f22939c;
                if (this.f22938b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                k31Var.Q = f19;
                k31Var.h();
                k31Var.g();
                return;
            case 23:
                y61 y61Var = (y61) this.f22939c;
                AnimatorSet animatorSet4 = y61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f22938b) {
                        y61Var.e.setVisibility(4);
                    }
                    y61Var.d = null;
                    return;
                }
                return;
            case 24:
                c71 c71Var = (c71) this.f22939c;
                AnimatorSet animatorSet5 = c71Var.f23188r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f22938b) {
                        c71Var.f23187n.setVisibility(4);
                    }
                    c71Var.f23188r = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f22939c;
                v2Var.v = null;
                if (this.f22938b) {
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
                    v2Var.f29719n = v2Var.f29720r;
                }
                v2Var.f29721s = 0.0f;
                v2Var.invalidate();
                return;
            case 26:
                org.telegram.ui.ss ssVar = (org.telegram.ui.ss) this.f22939c;
                if (ssVar.f37517w != null && (radialProgressView = ssVar.f37516s) != null) {
                    if (!this.f22938b) {
                        radialProgressView.setVisibility(4);
                        ssVar.v.setVisibility(4);
                    }
                    ssVar.f37517w = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.lz lzVar = (org.telegram.ui.lz) this.f22939c;
                if (this.f22938b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                lzVar.f35548r = f20;
                v9 v9Var2 = lzVar.f35545c;
                int i11 = org.telegram.ui.ActionBar.j6.C6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i11, lzVar.f35543a);
                int i12 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(lzVar.f35548r, v02, org.telegram.ui.ActionBar.j6.v0(i12, lzVar.f35543a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                v9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                lzVar.f35545c.invalidate();
                lzVar.f35546f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - lzVar.f35548r, org.telegram.ui.ActionBar.j6.v0(i11, lzVar.f35543a), org.telegram.ui.ActionBar.j6.v0(i12, lzVar.f35543a)), mode));
                lzVar.f35546f.invalidate();
                return;
            case 28:
                org.telegram.ui.y00 y00Var2 = (org.telegram.ui.y00) this.f22939c;
                if (this.f22938b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                y00Var2.f39765s = f21;
                y00Var2.invalidate();
                return;
            default:
                org.telegram.ui.i60 i60Var = (org.telegram.ui.i60) this.f22939c;
                i60Var.U2 = null;
                org.telegram.ui.ActionBar.j5 subtitleTextView = i60Var.O.getSubtitleTextView();
                if (this.f22938b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
        }
    }

    public ba(View view) {
        this.f22937a = 11;
        this.f22939c = view;
        this.f22938b = true;
    }

    public ba(View view, boolean z10) {
        this.f22937a = 11;
        this.f22939c = view;
        this.f22938b = z10;
    }

    public ba(jo joVar) {
        this.f22937a = 3;
        this.f22939c = joVar;
    }
}
