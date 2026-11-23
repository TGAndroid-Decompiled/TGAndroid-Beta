package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
public final class on extends AnimatorListenerAdapter {
    public final int f50728a;
    public boolean f50729b;
    public final Object f50730c;

    public on(int i7, Object obj, boolean z10) {
        this.f50728a = i7;
        this.f50730c = obj;
        this.f50729b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f50728a) {
            case 0:
                ((rn) this.f50730c).h = null;
                return;
            case 1:
                org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) this.f50730c;
                AnimatorSet animatorSet = x9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    x9Var.h = null;
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.Components.ti) this.f50730c).W2 = null;
                return;
            case 4:
                this.f50729b = true;
                return;
            case 9:
                org.telegram.ui.Components.pz pzVar = (org.telegram.ui.Components.pz) this.f50730c;
                AnimatorSet animatorSet2 = pzVar.f38624q1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    pzVar.f38624q1 = null;
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.x50 x50Var = (org.telegram.ui.Components.x50) this.f50730c;
                AnimatorSet animatorSet3 = x50Var.S1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    x50Var.S1 = null;
                    return;
                }
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f50730c;
                if (animator.equals(pipRoundVideoView.f33107r)) {
                    pipRoundVideoView.f33107r = null;
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.it0) this.f50730c).R1 = null;
                return;
            case 25:
                org.telegram.ui.Components.m51 m51Var = (org.telegram.ui.Components.m51) this.f50730c;
                AnimatorSet animatorSet4 = m51Var.f37386o1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    m51Var.f37386o1 = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.q51 q51Var = (org.telegram.ui.Components.q51) this.f50730c;
                AnimatorSet animatorSet5 = q51Var.f38703t1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    q51Var.f38703t1 = null;
                    return;
                }
                return;
            case 28:
                ((qr) this.f50730c).f51527x = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        RadialProgressView radialProgressView;
        float f10;
        int i7;
        Drawable[] drawableArr;
        Drawable drawable;
        RadialProgressView radialProgressView2;
        int i10 = this.f50728a;
        int i11 = 8;
        float f11 = 1.0f;
        float f12 = 0.0f;
        Object obj = this.f50730c;
        switch (i10) {
            case 0:
                rn rnVar = (rn) obj;
                if (rnVar.h != null && (radialProgressView = rnVar.f51781n) != null) {
                    if (!this.f50729b) {
                        radialProgressView.setVisibility(4);
                        rnVar.f51773f.setVisibility(4);
                    }
                    rnVar.h = null;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) obj;
                AnimatorSet animatorSet = x9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f50729b) {
                        x9Var.f41937c.setVisibility(4);
                        return;
                    } else {
                        x9Var.f41936b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 2:
                org.telegram.ui.Components.lc lcVar = (org.telegram.ui.Components.lc) obj;
                if (animator == lcVar.f37108g) {
                    lcVar.f37108g = null;
                    if (!this.f50729b) {
                        f11 = 0.0f;
                    }
                    lcVar.f37110j = f11;
                    lcVar.b();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) obj;
                if (tiVar.W2 != null) {
                    if (this.f50729b) {
                        if (tiVar.Q2) {
                            org.telegram.ui.Components.li liVar = tiVar.f40029w2;
                            if (liVar == null || liVar.N()) {
                                tiVar.f40026v3.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.q0 q0Var = tiVar.f39963c3;
                    if (q0Var != null) {
                        q0Var.setVisibility(4);
                    }
                    if (tiVar.O2 != 0 || !tiVar.f39999o3) {
                        tiVar.Y2.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.fo foVar = (org.telegram.ui.Components.fo) obj;
                if (!this.f50729b) {
                    org.telegram.ui.Components.p9 p9Var = foVar.h;
                    foVar.h = foVar.f35172n;
                    foVar.f35172n = p9Var;
                    p9Var.setVisibility(8);
                    foVar.f35172n.setAlpha(0.0f);
                    foVar.h.setVisibility(0);
                    foVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 5:
                boolean z10 = this.f50729b;
                org.telegram.ui.Components.so soVar = (org.telegram.ui.Components.so) obj;
                if (animator == soVar.f39663e) {
                    if (!z10) {
                        f11 = 0.0f;
                    }
                    soVar.d = f11;
                    soVar.setShown(f11);
                    if (!z10) {
                        soVar.setVisibility(8);
                    }
                    soVar.a(true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.kp kpVar = (org.telegram.ui.Components.kp) obj;
                if (!this.f50729b) {
                    f11 = 0.0f;
                }
                kpVar.f36825a2 = f11;
                kpVar.D1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * kpVar.f36825a2);
                return;
            case 7:
                if (!this.f50729b) {
                    ((org.telegram.ui.Components.jq) obj).I.setVisibility(8);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.hv hvVar = (org.telegram.ui.Components.hv) obj;
                org.telegram.ui.Components.lv lvVar = hvVar.O;
                if (lvVar.V && !hvVar.h) {
                    if (!this.f50729b && !hvVar.f35836n) {
                        hvVar.setBackground(null);
                        return;
                    } else if (hvVar.getBackground() == null) {
                        hvVar.setBackground(org.telegram.ui.ActionBar.n6.a0(lvVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 9:
                org.telegram.ui.Components.pz pzVar = (org.telegram.ui.Components.pz) obj;
                AnimatorSet animatorSet2 = pzVar.f38624q1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f50729b) {
                        pzVar.f38625r1.setVisibility(4);
                    }
                    pzVar.f38624q1 = null;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.c00 c00Var = (org.telegram.ui.Components.c00) obj;
                if (!this.f50729b) {
                    f11 = 0.0f;
                }
                c00Var.f33869n = f11;
                c00Var.invalidate();
                return;
            case 11:
                org.telegram.ui.Components.a20 a20Var = (org.telegram.ui.Components.a20) obj;
                org.telegram.ui.Components.y10 y10Var = a20Var.f33325a;
                if (!a20Var.H) {
                    if (this.f50729b) {
                        f12 = 1.0f;
                    }
                    a20Var.f33331d0 = f12;
                    a20Var.W.setPinnedProgress(f12);
                    y10Var.setScaleX(1.0f - (a20Var.f33331d0 * 0.6f));
                    y10Var.setScaleY(1.0f - (a20Var.f33331d0 * 0.6f));
                    if (a20Var.Y) {
                        a20Var.j();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                View view = (View) obj;
                if (!this.f50729b) {
                    i11 = 4;
                }
                view.setVisibility(i11);
                return;
            case 13:
                org.telegram.ui.Components.x50 x50Var = (org.telegram.ui.Components.x50) obj;
                AnimatorSet animatorSet3 = x50Var.S1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f50729b) {
                        x50Var.T1.setVisibility(4);
                    }
                    x50Var.S1 = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.i60 i60Var = (org.telegram.ui.Components.i60) obj;
                boolean z11 = this.f50729b;
                if (!z11) {
                    f11 = 0.0f;
                }
                i60Var.f35939c2 = f11;
                i60Var.f30226b.invalidate();
                if (!z11) {
                    i60Var.Q1.setVisibility(8);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.ta0 ta0Var = (org.telegram.ui.Components.ta0) obj;
                if (ta0Var.getParent() != null) {
                    ((ViewGroup) ta0Var.getParent()).removeView(ta0Var);
                }
                boolean z12 = this.f50729b;
                mk mkVar = (mk) ta0Var;
                org.telegram.messenger.jj jjVar = mkVar.I.f46423x5;
                if (jjVar != null) {
                    jjVar.f24994x = null;
                }
                if (z12) {
                    org.telegram.messenger.g0.h3(new lk(mkVar, 1), 15L);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.na0 na0Var = (org.telegram.ui.Components.na0) obj;
                na0Var.Q = null;
                na0Var.h(this.f50729b, false);
                return;
            case 17:
                org.telegram.ui.Components.oc0 oc0Var = (org.telegram.ui.Components.oc0) obj;
                TextView textView = oc0Var.f38125x;
                bi.v2 v2Var = oc0Var.f38114e;
                if (this.f50729b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                v2Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                v2Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                v2Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, f10));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, f10));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, f10));
                oc0Var.f38123s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) obj;
                if (animator.equals(pipRoundVideoView.f33107r)) {
                    if (!this.f50729b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f33107r = null;
                    return;
                }
                return;
            case 19:
                boolean z13 = this.f50729b;
                org.telegram.ui.Components.em0 em0Var = (org.telegram.ui.Components.em0) obj;
                if (animator == em0Var.H) {
                    if (!z13) {
                        f11 = 0.0f;
                    }
                    em0Var.G = f11;
                    em0Var.setShown(f11);
                    if (!z13) {
                        em0Var.setVisibility(8);
                    }
                    em0Var.b(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.it0 it0Var = (org.telegram.ui.Components.it0) obj;
                if (it0Var.R1 != null) {
                    it0Var.R1 = null;
                    if (!this.f50729b) {
                        it0Var.E0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.j01 j01Var = (org.telegram.ui.Components.j01) obj;
                if (!this.f50729b) {
                    f11 = 0.0f;
                }
                j01Var.N = f11;
                j01Var.invalidate();
                return;
            case 22:
                boolean z14 = this.f50729b;
                org.telegram.ui.Components.z11 z11Var = (org.telegram.ui.Components.z11) obj;
                long j3 = z11Var.f42632f;
                if (z11Var.f42631e0 == animator) {
                    if (!z14) {
                        f11 = 0.0f;
                    }
                    z11Var.V = f11;
                    z11Var.p();
                    z11Var.W = false;
                    ImageView imageView = z11Var.I;
                    int i12 = 2131231890;
                    if (z11Var.T) {
                        i7 = 2131231890;
                    } else {
                        i7 = 2131231887;
                    }
                    imageView.setImageResource(i7);
                    ImageView imageView2 = z11Var.H;
                    if (!z11Var.T) {
                        i12 = 2131231888;
                    }
                    imageView2.setImageResource(i12);
                    z11Var.f42631e0 = null;
                    org.telegram.messenger.mp.u1(z11Var.f42630e).h7.edit().putBoolean("topicssidetabs" + j3, z11Var.U).putBoolean("topicssidetabsb" + j3, z11Var.T).apply();
                    Boolean bool = z11Var.f42629d0;
                    if (bool != null && z14 != bool.booleanValue()) {
                        boolean booleanValue = z11Var.f42629d0.booleanValue();
                        z11Var.f42629d0 = null;
                        z11Var.d(booleanValue);
                    }
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Components.bp0(this, 20));
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Components.u11 u11Var = (org.telegram.ui.Components.u11) obj;
                if (!this.f50729b) {
                    f11 = 0.0f;
                }
                u11Var.G = f11;
                u11Var.h();
                return;
            case 24:
                org.telegram.ui.Components.y11 y11Var = (org.telegram.ui.Components.y11) obj;
                if (!this.f50729b) {
                    f11 = 0.0f;
                }
                y11Var.V = f11;
                y11Var.h();
                y11Var.g();
                return;
            case 25:
                org.telegram.ui.Components.m51 m51Var = (org.telegram.ui.Components.m51) obj;
                AnimatorSet animatorSet4 = m51Var.f37386o1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f50729b) {
                        m51Var.f37387p1.setVisibility(4);
                    }
                    m51Var.f37386o1 = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.q51 q51Var = (org.telegram.ui.Components.q51) obj;
                AnimatorSet animatorSet5 = q51Var.f38703t1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f50729b) {
                        q51Var.f38702s1.setVisibility(4);
                    }
                    q51Var.f38703t1 = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.voip.r2 r2Var = (org.telegram.ui.Components.voip.r2) obj;
                r2Var.f41202w = null;
                if (this.f50729b) {
                    TextView[] textViewArr = r2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!r2Var.H && (drawable = (drawableArr = r2Var.f41197e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                r2Var.H = false;
                if (!r2Var.P) {
                    r2Var.f41199n = r2Var.f41200r;
                }
                r2Var.f41201s = 0.0f;
                r2Var.invalidate();
                return;
            case 28:
                qr qrVar = (qr) obj;
                if (qrVar.f51527x != null && (radialProgressView2 = qrVar.f51525s) != null) {
                    if (!this.f50729b) {
                        radialProgressView2.setVisibility(4);
                        qrVar.f51526w.setVisibility(4);
                    }
                    qrVar.f51527x = null;
                    return;
                }
                return;
            default:
                dz dzVar = (dz) obj;
                if (!this.f50729b) {
                    f11 = 0.0f;
                }
                dzVar.f47267s = f11;
                dzVar.invalidate();
                return;
        }
    }

    public on(View view) {
        this.f50728a = 12;
        this.f50730c = view;
        this.f50729b = true;
    }

    public on(View view, boolean z10) {
        this.f50728a = 12;
        this.f50730c = view;
        this.f50729b = z10;
    }

    public on(org.telegram.ui.Components.fo foVar) {
        this.f50728a = 4;
        this.f50730c = foVar;
    }
}
