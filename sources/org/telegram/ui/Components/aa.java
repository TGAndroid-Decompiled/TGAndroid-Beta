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
public final class aa extends AnimatorListenerAdapter {
    public final int f22359a;
    public boolean f22360b;
    public final Object f22361c;

    public aa(int i10, Object obj, boolean z10) {
        this.f22359a = i10;
        this.f22361c = obj;
        this.f22360b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f22359a) {
            case 0:
                ba baVar = (ba) this.f22361c;
                AnimatorSet animatorSet = baVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    baVar.h = null;
                    return;
                }
                return;
            case 2:
                ((vi) this.f22361c).Y0 = null;
                return;
            case 3:
                this.f22360b = true;
                return;
            case 8:
                n00 n00Var = (n00) this.f22361c;
                AnimatorSet animatorSet2 = n00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    n00Var.e = null;
                    return;
                }
                return;
            case 12:
                r60 r60Var = (r60) this.f22361c;
                AnimatorSet animatorSet3 = r60Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    r60Var.X = null;
                    return;
                }
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f22361c;
                if (animator.equals(pipRoundVideoView.f22095r)) {
                    pipRoundVideoView.f22095r = null;
                    return;
                }
                return;
            case 19:
                ((zu0) this.f22361c).N1 = null;
                return;
            case 23:
                l61 l61Var = (l61) this.f22361c;
                AnimatorSet animatorSet4 = l61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    l61Var.d = null;
                    return;
                }
                return;
            case 24:
                p61 p61Var = (p61) this.f22361c;
                AnimatorSet animatorSet5 = p61Var.f26942r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    p61Var.f26942r = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.us) this.f22361c).f38188w = null;
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
        switch (this.f22359a) {
            case 0:
                ba baVar = (ba) this.f22361c;
                AnimatorSet animatorSet = baVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f22360b) {
                        baVar.f22672c.setVisibility(4);
                        return;
                    } else {
                        baVar.f22671b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 1:
                wc wcVar = (wc) this.f22361c;
                if (animator == wcVar.f29633g) {
                    wcVar.f29633g = null;
                    if (this.f22360b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    wcVar.f29634i = f7;
                    wcVar.b();
                    return;
                }
                return;
            case 2:
                vi viVar = (vi) this.f22361c;
                if (viVar.Y0 != null) {
                    if (this.f22360b) {
                        if (viVar.S0) {
                            ni niVar = viVar.f28803y0;
                            if (niVar == null || niVar.J()) {
                                viVar.f28800x1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.w0 w0Var = viVar.f28739e1;
                    if (w0Var != null) {
                        w0Var.setVisibility(4);
                    }
                    if (viVar.Q0 != 0 || !viVar.f28775q1) {
                        viVar.f28726a1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                jo joVar = (jo) this.f22361c;
                if (!this.f22360b) {
                    u9 u9Var = joVar.h;
                    joVar.h = joVar.f25369n;
                    joVar.f25369n = u9Var;
                    u9Var.setVisibility(8);
                    joVar.f25369n.setAlpha(0.0f);
                    joVar.h.setVisibility(0);
                    joVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 4:
                boolean z10 = this.f22360b;
                to toVar = (to) this.f22361c;
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
                mp mpVar = (mp) this.f22361c;
                if (this.f22360b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                mpVar.f26229g0 = f11;
                mpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * mpVar.f26229g0);
                return;
            case 6:
                if (!this.f22360b) {
                    ((mq) this.f22361c).H.setVisibility(8);
                    return;
                }
                return;
            case 7:
                yv yvVar = (yv) this.f22361c;
                cw cwVar = yvVar.J;
                if (cwVar.U && !yvVar.h) {
                    if (!this.f22360b && !yvVar.f30332n) {
                        yvVar.setBackground(null);
                        return;
                    } else if (yvVar.getBackground() == null) {
                        yvVar.setBackground(org.telegram.ui.ActionBar.j6.Y(cwVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                n00 n00Var = (n00) this.f22361c;
                AnimatorSet animatorSet2 = n00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f22360b) {
                        n00Var.f26294f.setVisibility(4);
                    }
                    n00Var.e = null;
                    return;
                }
                return;
            case 9:
                y00 y00Var = (y00) this.f22361c;
                if (this.f22360b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                y00Var.h = f12;
                y00Var.invalidate();
                return;
            case 10:
                z20 z20Var = (z20) this.f22361c;
                x20 x20Var = z20Var.f30375a;
                if (!z20Var.F) {
                    if (this.f22360b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    z20Var.f30378b0 = f13;
                    z20Var.U.setPinnedProgress(f13);
                    x20Var.setScaleX(1.0f - (z20Var.f30378b0 * 0.6f));
                    x20Var.setScaleY(1.0f - (z20Var.f30378b0 * 0.6f));
                    if (z20Var.W) {
                        z20Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                View view = (View) this.f22361c;
                if (this.f22360b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 12:
                r60 r60Var = (r60) this.f22361c;
                AnimatorSet animatorSet3 = r60Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f22360b) {
                        r60Var.Y.setVisibility(4);
                    }
                    r60Var.X = null;
                    return;
                }
                return;
            case 13:
                b70 b70Var = (b70) this.f22361c;
                boolean z11 = this.f22360b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                b70Var.f22629h0 = f14;
                b70.W(b70Var).invalidate();
                if (!z11) {
                    b70Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                vb0 vb0Var = (vb0) this.f22361c;
                if (vb0Var.getParent() != null) {
                    ((ViewGroup) vb0Var.getParent()).removeView(vb0Var);
                }
                boolean z12 = this.f22360b;
                org.telegram.ui.il ilVar = (org.telegram.ui.il) vb0Var;
                MessagePreviewParams messagePreviewParams = ilVar.H.f32283f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.hl(ilVar, 0), 15L);
                    return;
                }
                return;
            case 15:
                pb0 pb0Var = (pb0) this.f22361c;
                pb0Var.P = null;
                pb0Var.g(this.f22360b, false);
                return;
            case 16:
                sd0 sd0Var = (sd0) this.f22361c;
                TextView textView = sd0Var.f27843w;
                ai.x5 x5Var = sd0Var.e;
                if (this.f22360b) {
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
                sd0Var.f27842s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f22361c;
                if (animator.equals(pipRoundVideoView.f22095r)) {
                    if (!this.f22360b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f22095r = null;
                    return;
                }
                return;
            case 18:
                boolean z13 = this.f22360b;
                jn0 jn0Var = (jn0) this.f22361c;
                if (animator == jn0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    jn0Var.F = f16;
                    jn0Var.setShown(f16);
                    if (!z13) {
                        jn0Var.setVisibility(8);
                    }
                    jn0Var.b(true);
                    return;
                }
                return;
            case 19:
                zu0 zu0Var = (zu0) this.f22361c;
                if (zu0Var.N1 != null) {
                    zu0Var.N1 = null;
                    if (!this.f22360b) {
                        zu0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                v11 v11Var = (v11) this.f22361c;
                if (this.f22360b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                v11Var.M = f17;
                v11Var.invalidate();
                return;
            case 21:
                t21 t21Var = (t21) this.f22361c;
                if (this.f22360b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                t21Var.F = f18;
                t21Var.h();
                return;
            case 22:
                x21 x21Var = (x21) this.f22361c;
                if (this.f22360b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                x21Var.Q = f19;
                x21Var.h();
                x21Var.g();
                return;
            case 23:
                l61 l61Var = (l61) this.f22361c;
                AnimatorSet animatorSet4 = l61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f22360b) {
                        l61Var.e.setVisibility(4);
                    }
                    l61Var.d = null;
                    return;
                }
                return;
            case 24:
                p61 p61Var = (p61) this.f22361c;
                AnimatorSet animatorSet5 = p61Var.f26942r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f22360b) {
                        p61Var.f26941n.setVisibility(4);
                    }
                    p61Var.f26942r = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f22361c;
                v2Var.v = null;
                if (this.f22360b) {
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
                    v2Var.f29293n = v2Var.f29294r;
                }
                v2Var.f29295s = 0.0f;
                v2Var.invalidate();
                return;
            case 26:
                org.telegram.ui.us usVar = (org.telegram.ui.us) this.f22361c;
                if (usVar.f38188w != null && (radialProgressView = usVar.f38187s) != null) {
                    if (!this.f22360b) {
                        radialProgressView.setVisibility(4);
                        usVar.v.setVisibility(4);
                    }
                    usVar.f38188w = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.nz nzVar = (org.telegram.ui.nz) this.f22361c;
                if (this.f22360b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                nzVar.f36183r = f20;
                u9 u9Var2 = nzVar.f36180c;
                int i11 = org.telegram.ui.ActionBar.j6.C6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i11, nzVar.f36178a);
                int i12 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(nzVar.f36183r, v02, org.telegram.ui.ActionBar.j6.v0(i12, nzVar.f36178a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                u9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                nzVar.f36180c.invalidate();
                nzVar.f36181f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - nzVar.f36183r, org.telegram.ui.ActionBar.j6.v0(i11, nzVar.f36178a), org.telegram.ui.ActionBar.j6.v0(i12, nzVar.f36178a)), mode));
                nzVar.f36181f.invalidate();
                return;
            case 28:
                org.telegram.ui.a10 a10Var = (org.telegram.ui.a10) this.f22361c;
                if (this.f22360b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                a10Var.f31670s = f21;
                a10Var.invalidate();
                return;
            default:
                org.telegram.ui.k60 k60Var = (org.telegram.ui.k60) this.f22361c;
                k60Var.U2 = null;
                org.telegram.ui.ActionBar.k5 subtitleTextView = k60Var.O.getSubtitleTextView();
                if (this.f22360b) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(dp);
                return;
        }
    }

    public aa(View view) {
        this.f22359a = 11;
        this.f22361c = view;
        this.f22360b = true;
    }

    public aa(View view, boolean z10) {
        this.f22359a = 11;
        this.f22361c = view;
        this.f22360b = z10;
    }

    public aa(jo joVar) {
        this.f22359a = 3;
        this.f22361c = joVar;
    }
}
