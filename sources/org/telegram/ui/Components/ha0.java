package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.tc1;
import org.telegram.ui.x91;
public final class ha0 extends AnimatorListenerAdapter {
    public final int f26681a;
    public final boolean f26682b;
    public final Object f26683c;

    public ha0(int i10, Object obj, boolean z10) {
        this.f26681a = i10;
        this.f26683c = obj;
        this.f26682b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26681a) {
            case 3:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f26683c;
                if (animator.equals(pipRoundVideoView.f24081r)) {
                    pipRoundVideoView.f24081r = null;
                    return;
                }
                return;
            case 5:
                ((zt0) this.f26683c).Q1 = null;
                return;
            case 10:
                a61 a61Var = (a61) this.f26683c;
                AnimatorSet animatorSet = a61Var.f24312k1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    a61Var.f24312k1 = null;
                    return;
                }
                return;
            case 11:
                e61 e61Var = (e61) this.f26683c;
                AnimatorSet animatorSet2 = e61Var.f25723p1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    e61Var.f25723p1 = null;
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.ns) this.f26683c).f40043x = null;
                return;
            case 16:
                ((org.telegram.ui.c60) this.f26683c).h = null;
                return;
            case 19:
                org.telegram.ui.lo0 lo0Var = (org.telegram.ui.lo0) this.f26683c;
                if (animator.equals(lo0Var.f39341k0)) {
                    lo0Var.f39341k0 = null;
                    return;
                }
                return;
            case 25:
                ((org.telegram.ui.e51) this.f26683c).f36941n = null;
                return;
            case 27:
                tc1 tc1Var = (tc1) this.f26683c;
                AnimatorSet animatorSet3 = tc1Var.I;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    tc1Var.I = null;
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
        float f7;
        int i10;
        Drawable[] drawableArr;
        Drawable drawable;
        RadialProgressView radialProgressView;
        org.telegram.ui.hd hdVar;
        org.telegram.ui.Cells.d4 d4Var;
        int i11 = this.f26681a;
        float f10 = 1.0f;
        float f11 = 0.0f;
        boolean z10 = this.f26682b;
        Object obj = this.f26683c;
        switch (i11) {
            case 0:
                ab0 ab0Var = (ab0) obj;
                if (ab0Var.getParent() != null) {
                    ((ViewGroup) ab0Var.getParent()).removeView(ab0Var);
                }
                org.telegram.ui.hl hlVar = (org.telegram.ui.hl) ab0Var;
                org.telegram.messenger.nj njVar = hlVar.H.f42446v5;
                if (njVar != null) {
                    njVar.f17133x = null;
                }
                if (z10) {
                    org.telegram.messenger.i0.h3(new org.telegram.ui.gl(hlVar, 0), 15L);
                    return;
                }
                return;
            case 1:
                ua0 ua0Var = (ua0) obj;
                ua0Var.P = null;
                ua0Var.h(z10, false);
                return;
            case 2:
                zc0 zc0Var = (zc0) obj;
                TextView textView = zc0Var.f33022x;
                org.telegram.ui.Cells.a5 a5Var = zc0Var.e;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                a5Var.setScaleX(org.telegram.messenger.i0.T1(0.8f, 1.0f, f7));
                a5Var.setScaleY(org.telegram.messenger.i0.T1(0.8f, 1.0f, f7));
                a5Var.setAlpha(org.telegram.messenger.i0.T1(0.0f, 1.0f, f7));
                textView.setScaleX(org.telegram.messenger.i0.T1(1.0f, 0.9f, f7));
                textView.setScaleY(org.telegram.messenger.i0.T1(1.0f, 0.9f, f7));
                textView.setAlpha(org.telegram.messenger.i0.T1(1.0f, 0.0f, f7));
                zc0Var.f33020s.setAlpha(org.telegram.messenger.i0.T1(0.0f, 1.0f, f7));
                return;
            case 3:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) obj;
                if (animator.equals(pipRoundVideoView.f24081r)) {
                    if (!z10) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f24081r = null;
                    return;
                }
                return;
            case 4:
                rm0 rm0Var = (rm0) obj;
                if (animator == rm0Var.G) {
                    if (!z10) {
                        f10 = 0.0f;
                    }
                    rm0Var.F = f10;
                    rm0Var.setShown(f10);
                    if (!z10) {
                        rm0Var.setVisibility(8);
                    }
                    rm0Var.b(true);
                    return;
                }
                return;
            case 5:
                zt0 zt0Var = (zt0) obj;
                if (zt0Var.Q1 != null) {
                    zt0Var.Q1 = null;
                    if (!z10) {
                        zt0Var.D0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                super.onAnimationEnd(animator);
                e11 e11Var = (e11) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                e11Var.M = f10;
                e11Var.invalidate();
                return;
            case 7:
                o21 o21Var = (o21) obj;
                long j10 = o21Var.f28959r;
                if (o21Var.f28951g0 == animator) {
                    if (!z10) {
                        f10 = 0.0f;
                    }
                    o21Var.f28942a0 = f10;
                    o21Var.p();
                    o21Var.f28944b0 = false;
                    ImageView imageView = o21Var.K;
                    if (o21Var.V) {
                        i10 = 2131231885;
                    } else {
                        i10 = 2131231882;
                    }
                    imageView.setImageResource(i10);
                    o21Var.s();
                    o21Var.f28951g0 = null;
                    org.telegram.messenger.vp.r1(o21Var.f28957n).f7.edit().putBoolean("topicssidetabs" + j10, o21Var.W).putBoolean("topicssidetabsb" + j10, o21Var.V).apply();
                    Boolean bool = o21Var.f28950f0;
                    if (bool != null && z10 != bool.booleanValue()) {
                        boolean booleanValue = o21Var.f28950f0.booleanValue();
                        o21Var.f28950f0 = null;
                        o21Var.d(booleanValue);
                    }
                    org.telegram.messenger.i0.g3(new uo0(this, 22));
                    return;
                }
                return;
            case 8:
                j21 j21Var = (j21) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                j21Var.F = f10;
                j21Var.h();
                return;
            case 9:
                n21 n21Var = (n21) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                n21Var.U = f10;
                n21Var.h();
                n21Var.g();
                return;
            case 10:
                a61 a61Var = (a61) obj;
                AnimatorSet animatorSet = a61Var.f24312k1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!z10) {
                        a61Var.l1.setVisibility(4);
                    }
                    a61Var.f24312k1 = null;
                    return;
                }
                return;
            case 11:
                e61 e61Var = (e61) obj;
                AnimatorSet animatorSet2 = e61Var.f25723p1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z10) {
                        e61Var.f25722o1.setVisibility(4);
                    }
                    e61Var.f25723p1 = null;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.b2 b2Var = (org.telegram.ui.Components.voip.b2) obj;
                b2Var.f31349w = null;
                if (z10) {
                    TextView[] textViewArr = b2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!b2Var.G && (drawable = (drawableArr = b2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                b2Var.G = false;
                if (!b2Var.O) {
                    b2Var.f31346n = b2Var.f31347r;
                }
                b2Var.f31348s = 0.0f;
                b2Var.invalidate();
                return;
            case 13:
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) obj;
                if (nsVar.f40043x != null && (radialProgressView = nsVar.f40041s) != null) {
                    if (!z10) {
                        radialProgressView.setVisibility(4);
                        nsVar.f40042w.setVisibility(4);
                    }
                    nsVar.f40043x = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.c00 c00Var = (org.telegram.ui.c00) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                c00Var.f36346s = f10;
                c00Var.invalidate();
                return;
            case 15:
                org.telegram.ui.b50 b50Var = (org.telegram.ui.b50) obj;
                b50Var.L4 = null;
                org.telegram.ui.ActionBar.u5 subtitleTextView = b50Var.F1.getSubtitleTextView();
                if (!z10) {
                    f11 = org.telegram.messenger.i0.L(20.0f);
                }
                subtitleTextView.setTranslationY(f11);
                return;
            case 16:
                org.telegram.ui.c60 c60Var = (org.telegram.ui.c60) obj;
                if (c60Var.h != null && (hdVar = c60Var.f36394f) != null) {
                    if (z10) {
                        hdVar.setVisibility(4);
                    } else {
                        c60Var.f36395n.setVisibility(4);
                    }
                    c60Var.h = null;
                    return;
                }
                return;
            case 17:
                org.telegram.ui.hf0 hf0Var = (org.telegram.ui.hf0) obj;
                if (!z10) {
                    hf0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet3 = hf0Var.L;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    hf0Var.L = null;
                    return;
                }
                return;
            case 18:
                if (!z10) {
                    ((PasscodeActivity) obj).f33424w.setVisibility(8);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.lo0 lo0Var = (org.telegram.ui.lo0) obj;
                if (animator.equals(lo0Var.f39341k0)) {
                    if (!z10) {
                        lo0Var.Z.setVisibility(4);
                        lo0Var.f39328a0.setVisibility(4);
                    }
                    lo0Var.f39341k0 = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.kt0 kt0Var = (org.telegram.ui.kt0) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                kt0Var.E = f10;
                return;
            case 21:
                org.telegram.ui.ay0 ay0Var = (org.telegram.ui.ay0) obj;
                ProfileActivity profileActivity = ay0Var.f35908n;
                if (ay0Var.h) {
                    org.telegram.ui.ActionBar.p5 p5Var = profileActivity.T0;
                    if (p5Var != null) {
                        p5Var.setClickable(false);
                    }
                } else {
                    ay0Var.setVisibility(8);
                }
                RectF rectF = ProfileActivity.R6;
                profileActivity.K5(false);
                return;
            case 22:
                org.telegram.ui.cz0 cz0Var = (org.telegram.ui.cz0) obj;
                if (z10) {
                    cz0Var.f36576c.setVisibility(8);
                    return;
                } else {
                    cz0Var.f36577f.setVisibility(8);
                    return;
                }
            case 23:
                org.telegram.ui.i11 i11Var = (org.telegram.ui.i11) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                i11Var.f38094w = f10;
                if (i11Var.S) {
                    i11Var.N.invalidate();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.e31 e31Var = (org.telegram.ui.e31) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e31Var.f36910w;
                if (z10) {
                    f11 = 1.0f;
                }
                e31Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(gr.f26496g.getInterpolation(e31Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i12 = 0; i12 < itemsCount; i12++) {
                    float s10 = org.telegram.messenger.i0.s(e31Var.L, i12, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12).setTranslationY((1.0f - s10) * org.telegram.messenger.i0.L(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12).setAlpha(s10);
                }
                e31Var.N = null;
                return;
            case 25:
                org.telegram.ui.e51 e51Var = (org.telegram.ui.e51) obj;
                if (e51Var.f36941n != null && (d4Var = e51Var.f36942r) != null) {
                    if (!z10) {
                        d4Var.setVisibility(4);
                    }
                    e51Var.f36941n = null;
                    return;
                }
                return;
            case 26:
                x91 x91Var = (x91) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                x91Var.D = f10;
                return;
            case 27:
                tc1 tc1Var = (tc1) obj;
                AnimatorSet animatorSet4 = tc1Var.I;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (z10) {
                        tc1Var.e.setVisibility(4);
                        return;
                    } else {
                        tc1Var.f41796b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 28:
                org.telegram.ui.web.l1 l1Var = (org.telegram.ui.web.l1) obj;
                org.telegram.ui.zd zdVar = l1Var.V;
                if (!l1Var.T) {
                    zdVar.setVisibility(8);
                    zdVar.setText("");
                }
                if (!z10) {
                    f10 = 0.0f;
                }
                l1Var.U = f10;
                zdVar.setAlpha(f10);
                l1Var.invalidate();
                if (l1Var.T) {
                    zdVar.requestFocus();
                    org.telegram.messenger.i0.J3(zdVar);
                    return;
                }
                zdVar.clearFocus();
                org.telegram.messenger.i0.v1(zdVar);
                return;
            default:
                org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) obj;
                org.telegram.ui.zd zdVar2 = m0Var.f43095b0;
                if (!m0Var.W) {
                    zdVar2.setVisibility(8);
                }
                if (!z10) {
                    f10 = 0.0f;
                }
                m0Var.f43093a0 = f10;
                zdVar2.setAlpha(f10);
                m0Var.j(m0Var.f43093a0);
                m0Var.R.setTranslationX(org.telegram.messenger.i0.L(56.0f) * m0Var.f43093a0);
                m0Var.O.setTranslationX(org.telegram.messenger.i0.L(112.0f) * m0Var.f43093a0);
                m0Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f26681a) {
            case 17:
                if (this.f26682b) {
                    ((org.telegram.ui.hf0) this.f26683c).V.setVisibility(0);
                    return;
                }
                return;
            case 18:
                if (this.f26682b) {
                    ((PasscodeActivity) this.f26683c).f33424w.setVisibility(0);
                    return;
                }
                return;
            case 19:
            case 20:
            default:
                super.onAnimationStart(animator);
                return;
            case 21:
                org.telegram.ui.ay0 ay0Var = (org.telegram.ui.ay0) this.f26683c;
                ProfileActivity profileActivity = ay0Var.f35908n;
                org.telegram.ui.ActionBar.p5 p5Var = profileActivity.T0;
                if (p5Var != null && !this.f26682b) {
                    p5Var.setClickable(true);
                }
                profileActivity.A5(true);
                ay0Var.setVisibility(0);
                profileActivity.K5(false);
                return;
            case 22:
                org.telegram.ui.cz0 cz0Var = (org.telegram.ui.cz0) this.f26683c;
                if (this.f26682b) {
                    cz0Var.f36577f.setAlpha(0.0f);
                    cz0Var.f36577f.setVisibility(0);
                    return;
                }
                cz0Var.f36576c.setAlpha(0.0f);
                cz0Var.f36576c.setVisibility(0);
                return;
        }
    }
}
