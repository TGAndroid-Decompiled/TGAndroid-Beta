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
import org.telegram.ui.rc1;
import org.telegram.ui.v91;
public final class ha0 extends AnimatorListenerAdapter {
    public final int f26739a;
    public final boolean f26740b;
    public final Object f26741c;

    public ha0(int i10, Object obj, boolean z10) {
        this.f26739a = i10;
        this.f26741c = obj;
        this.f26740b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26739a) {
            case 3:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f26741c;
                if (animator.equals(pipRoundVideoView.f24082r)) {
                    pipRoundVideoView.f24082r = null;
                    return;
                }
                return;
            case 5:
                ((au0) this.f26741c).Q1 = null;
                return;
            case 10:
                b61 b61Var = (b61) this.f26741c;
                AnimatorSet animatorSet = b61Var.f24667k1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    b61Var.f24667k1 = null;
                    return;
                }
                return;
            case 11:
                f61 f61Var = (f61) this.f26741c;
                AnimatorSet animatorSet2 = f61Var.f26092p1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    f61Var.f26092p1 = null;
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.ns) this.f26741c).f39970x = null;
                return;
            case 16:
                ((org.telegram.ui.b60) this.f26741c).h = null;
                return;
            case 19:
                org.telegram.ui.jo0 jo0Var = (org.telegram.ui.jo0) this.f26741c;
                if (animator.equals(jo0Var.f38496k0)) {
                    jo0Var.f38496k0 = null;
                    return;
                }
                return;
            case 25:
                ((org.telegram.ui.c51) this.f26741c).f36195n = null;
                return;
            case 27:
                rc1 rc1Var = (rc1) this.f26741c;
                AnimatorSet animatorSet3 = rc1Var.I;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    rc1Var.I = null;
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
        int i11 = this.f26739a;
        float f10 = 1.0f;
        float f11 = 0.0f;
        boolean z10 = this.f26740b;
        Object obj = this.f26741c;
        switch (i11) {
            case 0:
                ab0 ab0Var = (ab0) obj;
                if (ab0Var.getParent() != null) {
                    ((ViewGroup) ab0Var.getParent()).removeView(ab0Var);
                }
                org.telegram.ui.hl hlVar = (org.telegram.ui.hl) ab0Var;
                org.telegram.messenger.oj ojVar = hlVar.H.f42257v5;
                if (ojVar != null) {
                    ojVar.f17470x = null;
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
                TextView textView = zc0Var.f33118x;
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
                zc0Var.f33116s.setAlpha(org.telegram.messenger.i0.T1(0.0f, 1.0f, f7));
                return;
            case 3:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) obj;
                if (animator.equals(pipRoundVideoView.f24082r)) {
                    if (!z10) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f24082r = null;
                    return;
                }
                return;
            case 4:
                sm0 sm0Var = (sm0) obj;
                if (animator == sm0Var.G) {
                    if (!z10) {
                        f10 = 0.0f;
                    }
                    sm0Var.F = f10;
                    sm0Var.setShown(f10);
                    if (!z10) {
                        sm0Var.setVisibility(8);
                    }
                    sm0Var.b(true);
                    return;
                }
                return;
            case 5:
                au0 au0Var = (au0) obj;
                if (au0Var.Q1 != null) {
                    au0Var.Q1 = null;
                    if (!z10) {
                        au0Var.D0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                super.onAnimationEnd(animator);
                f11 f11Var = (f11) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                f11Var.M = f10;
                f11Var.invalidate();
                return;
            case 7:
                p21 p21Var = (p21) obj;
                long j10 = p21Var.f29330f;
                if (p21Var.f29328d0 == animator) {
                    if (!z10) {
                        f10 = 0.0f;
                    }
                    p21Var.U = f10;
                    p21Var.p();
                    p21Var.V = false;
                    ImageView imageView = p21Var.H;
                    int i12 = 2131231885;
                    if (p21Var.S) {
                        i10 = 2131231885;
                    } else {
                        i10 = 2131231882;
                    }
                    imageView.setImageResource(i10);
                    ImageView imageView2 = p21Var.G;
                    if (!p21Var.S) {
                        i12 = 2131231883;
                    }
                    imageView2.setImageResource(i12);
                    p21Var.f29328d0 = null;
                    org.telegram.messenger.wp.r1(p21Var.e).f7.edit().putBoolean("topicssidetabs" + j10, p21Var.T).putBoolean("topicssidetabsb" + j10, p21Var.S).apply();
                    Boolean bool = p21Var.f29327c0;
                    if (bool != null && z10 != bool.booleanValue()) {
                        boolean booleanValue = p21Var.f29327c0.booleanValue();
                        p21Var.f29327c0 = null;
                        p21Var.d(booleanValue);
                    }
                    org.telegram.messenger.i0.g3(new vo0(this, 22));
                    return;
                }
                return;
            case 8:
                k21 k21Var = (k21) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                k21Var.F = f10;
                k21Var.h();
                return;
            case 9:
                o21 o21Var = (o21) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                o21Var.U = f10;
                o21Var.h();
                o21Var.g();
                return;
            case 10:
                b61 b61Var = (b61) obj;
                AnimatorSet animatorSet = b61Var.f24667k1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!z10) {
                        b61Var.l1.setVisibility(4);
                    }
                    b61Var.f24667k1 = null;
                    return;
                }
                return;
            case 11:
                f61 f61Var = (f61) obj;
                AnimatorSet animatorSet2 = f61Var.f26092p1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z10) {
                        f61Var.f26091o1.setVisibility(4);
                    }
                    f61Var.f26092p1 = null;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.c2 c2Var = (org.telegram.ui.Components.voip.c2) obj;
                c2Var.f31429w = null;
                if (z10) {
                    TextView[] textViewArr = c2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!c2Var.G && (drawable = (drawableArr = c2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                c2Var.G = false;
                if (!c2Var.O) {
                    c2Var.f31426n = c2Var.f31427r;
                }
                c2Var.f31428s = 0.0f;
                c2Var.invalidate();
                return;
            case 13:
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) obj;
                if (nsVar.f39970x != null && (radialProgressView = nsVar.f39968s) != null) {
                    if (!z10) {
                        radialProgressView.setVisibility(4);
                        nsVar.f39969w.setVisibility(4);
                    }
                    nsVar.f39970x = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.b00 b00Var = (org.telegram.ui.b00) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                b00Var.f35881s = f10;
                b00Var.invalidate();
                return;
            case 15:
                org.telegram.ui.a50 a50Var = (org.telegram.ui.a50) obj;
                a50Var.L4 = null;
                org.telegram.ui.ActionBar.u5 subtitleTextView = a50Var.F1.getSubtitleTextView();
                if (!z10) {
                    f11 = org.telegram.messenger.i0.L(20.0f);
                }
                subtitleTextView.setTranslationY(f11);
                return;
            case 16:
                org.telegram.ui.b60 b60Var = (org.telegram.ui.b60) obj;
                if (b60Var.h != null && (hdVar = b60Var.f35956f) != null) {
                    if (z10) {
                        hdVar.setVisibility(4);
                    } else {
                        b60Var.f35957n.setVisibility(4);
                    }
                    b60Var.h = null;
                    return;
                }
                return;
            case 17:
                org.telegram.ui.gf0 gf0Var = (org.telegram.ui.gf0) obj;
                if (!z10) {
                    gf0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet3 = gf0Var.L;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    gf0Var.L = null;
                    return;
                }
                return;
            case 18:
                if (!z10) {
                    ((PasscodeActivity) obj).f33431w.setVisibility(8);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.jo0 jo0Var = (org.telegram.ui.jo0) obj;
                if (animator.equals(jo0Var.f38496k0)) {
                    if (!z10) {
                        jo0Var.Z.setVisibility(4);
                        jo0Var.f38483a0.setVisibility(4);
                    }
                    jo0Var.f38496k0 = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.jt0 jt0Var = (org.telegram.ui.jt0) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                jt0Var.E = f10;
                return;
            case 21:
                org.telegram.ui.zx0 zx0Var = (org.telegram.ui.zx0) obj;
                ProfileActivity profileActivity = zx0Var.f44251n;
                if (zx0Var.h) {
                    org.telegram.ui.ActionBar.p5 p5Var = profileActivity.T0;
                    if (p5Var != null) {
                        p5Var.setClickable(false);
                    }
                } else {
                    zx0Var.setVisibility(8);
                }
                RectF rectF = ProfileActivity.S6;
                profileActivity.L5(false);
                return;
            case 22:
                org.telegram.ui.bz0 bz0Var = (org.telegram.ui.bz0) obj;
                if (z10) {
                    bz0Var.f36137c.setVisibility(8);
                    return;
                } else {
                    bz0Var.f36138f.setVisibility(8);
                    return;
                }
            case 23:
                org.telegram.ui.h11 h11Var = (org.telegram.ui.h11) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                h11Var.f37627w = f10;
                if (h11Var.S) {
                    h11Var.N.invalidate();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.c31 c31Var = (org.telegram.ui.c31) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c31Var.f36178w;
                if (z10) {
                    f11 = 1.0f;
                }
                c31Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(gr.f26524g.getInterpolation(c31Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i13 = 0; i13 < itemsCount; i13++) {
                    float s10 = org.telegram.messenger.i0.s(c31Var.L, i13, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i13).setTranslationY((1.0f - s10) * org.telegram.messenger.i0.L(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i13).setAlpha(s10);
                }
                c31Var.N = null;
                return;
            case 25:
                org.telegram.ui.c51 c51Var = (org.telegram.ui.c51) obj;
                if (c51Var.f36195n != null && (d4Var = c51Var.f36196r) != null) {
                    if (!z10) {
                        d4Var.setVisibility(4);
                    }
                    c51Var.f36195n = null;
                    return;
                }
                return;
            case 26:
                v91 v91Var = (v91) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                v91Var.D = f10;
                return;
            case 27:
                rc1 rc1Var = (rc1) obj;
                AnimatorSet animatorSet4 = rc1Var.I;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (z10) {
                        rc1Var.e.setVisibility(4);
                        return;
                    } else {
                        rc1Var.f41039b.setVisibility(4);
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
                org.telegram.ui.zd zdVar2 = m0Var.f42897b0;
                if (!m0Var.W) {
                    zdVar2.setVisibility(8);
                }
                if (!z10) {
                    f10 = 0.0f;
                }
                m0Var.f42895a0 = f10;
                zdVar2.setAlpha(f10);
                m0Var.j(m0Var.f42895a0);
                m0Var.R.setTranslationX(org.telegram.messenger.i0.L(56.0f) * m0Var.f42895a0);
                m0Var.O.setTranslationX(org.telegram.messenger.i0.L(112.0f) * m0Var.f42895a0);
                m0Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f26739a) {
            case 17:
                if (this.f26740b) {
                    ((org.telegram.ui.gf0) this.f26741c).V.setVisibility(0);
                    return;
                }
                return;
            case 18:
                if (this.f26740b) {
                    ((PasscodeActivity) this.f26741c).f33431w.setVisibility(0);
                    return;
                }
                return;
            case 19:
            case 20:
            default:
                super.onAnimationStart(animator);
                return;
            case 21:
                org.telegram.ui.zx0 zx0Var = (org.telegram.ui.zx0) this.f26741c;
                ProfileActivity profileActivity = zx0Var.f44251n;
                org.telegram.ui.ActionBar.p5 p5Var = profileActivity.T0;
                if (p5Var != null && !this.f26740b) {
                    p5Var.setClickable(true);
                }
                profileActivity.B5(true);
                zx0Var.setVisibility(0);
                profileActivity.L5(false);
                return;
            case 22:
                org.telegram.ui.bz0 bz0Var = (org.telegram.ui.bz0) this.f26741c;
                if (this.f26740b) {
                    bz0Var.f36138f.setAlpha(0.0f);
                    bz0Var.f36138f.setVisibility(0);
                    return;
                }
                bz0Var.f36137c.setAlpha(0.0f);
                bz0Var.f36137c.setVisibility(0);
                return;
        }
    }
}
