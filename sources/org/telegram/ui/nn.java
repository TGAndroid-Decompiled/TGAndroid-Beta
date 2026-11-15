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
public final class nn extends AnimatorListenerAdapter {
    public final int f49584a;
    public boolean f49585b;
    public final Object f49586c;

    public nn(int i7, Object obj, boolean z10) {
        this.f49584a = i7;
        this.f49586c = obj;
        this.f49585b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f49584a) {
            case 0:
                ((qn) this.f49586c).h = null;
                return;
            case 1:
                org.telegram.ui.Components.q9 q9Var = (org.telegram.ui.Components.q9) this.f49586c;
                AnimatorSet animatorSet = q9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q9Var.h = null;
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.Components.ki) this.f49586c).W2 = null;
                return;
            case 4:
                this.f49585b = true;
                return;
            case 9:
                org.telegram.ui.Components.jz jzVar = (org.telegram.ui.Components.jz) this.f49586c;
                AnimatorSet animatorSet2 = jzVar.f36198q1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    jzVar.f36198q1 = null;
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.p50 p50Var = (org.telegram.ui.Components.p50) this.f49586c;
                AnimatorSet animatorSet3 = p50Var.S1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    p50Var.S1 = null;
                    return;
                }
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f49586c;
                if (animator.equals(pipRoundVideoView.f32610r)) {
                    pipRoundVideoView.f32610r = null;
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.ys0) this.f49586c).R1 = null;
                return;
            case 25:
                org.telegram.ui.Components.a51 a51Var = (org.telegram.ui.Components.a51) this.f49586c;
                AnimatorSet animatorSet4 = a51Var.f32860o1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    a51Var.f32860o1 = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.e51 e51Var = (org.telegram.ui.Components.e51) this.f49586c;
                AnimatorSet animatorSet5 = e51Var.f34196t1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    e51Var.f34196t1 = null;
                    return;
                }
                return;
            case 28:
                ((pr) this.f49586c).f50345x = null;
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
        int i10 = this.f49584a;
        int i11 = 8;
        float f11 = 1.0f;
        float f12 = 0.0f;
        Object obj = this.f49586c;
        switch (i10) {
            case 0:
                qn qnVar = (qn) obj;
                if (qnVar.h != null && (radialProgressView = qnVar.f50677n) != null) {
                    if (!this.f49585b) {
                        radialProgressView.setVisibility(4);
                        qnVar.f50669f.setVisibility(4);
                    }
                    qnVar.h = null;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.q9 q9Var = (org.telegram.ui.Components.q9) obj;
                AnimatorSet animatorSet = q9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f49585b) {
                        q9Var.f38581c.setVisibility(4);
                        return;
                    } else {
                        q9Var.f38580b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 2:
                org.telegram.ui.Components.dc dcVar = (org.telegram.ui.Components.dc) obj;
                if (animator == dcVar.f33903g) {
                    dcVar.f33903g = null;
                    if (!this.f49585b) {
                        f11 = 0.0f;
                    }
                    dcVar.f33905j = f11;
                    dcVar.b();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.ki kiVar = (org.telegram.ui.Components.ki) obj;
                if (kiVar.W2 != null) {
                    if (this.f49585b) {
                        if (kiVar.Q2) {
                            org.telegram.ui.Components.ci ciVar = kiVar.f36497w2;
                            if (ciVar == null || ciVar.N()) {
                                kiVar.f36494v3.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.q0 q0Var = kiVar.f36431c3;
                    if (q0Var != null) {
                        q0Var.setVisibility(4);
                    }
                    if (kiVar.O2 != 0 || !kiVar.f36467o3) {
                        kiVar.Y2.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.xn xnVar = (org.telegram.ui.Components.xn) obj;
                if (!this.f49585b) {
                    org.telegram.ui.Components.i9 i9Var = xnVar.h;
                    xnVar.h = xnVar.f41728n;
                    xnVar.f41728n = i9Var;
                    i9Var.setVisibility(8);
                    xnVar.f41728n.setAlpha(0.0f);
                    xnVar.h.setVisibility(0);
                    xnVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 5:
                boolean z10 = this.f49585b;
                org.telegram.ui.Components.mo moVar = (org.telegram.ui.Components.mo) obj;
                if (animator == moVar.f37331e) {
                    if (!z10) {
                        f11 = 0.0f;
                    }
                    moVar.d = f11;
                    moVar.setShown(f11);
                    if (!z10) {
                        moVar.setVisibility(8);
                    }
                    moVar.a(true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.ep epVar = (org.telegram.ui.Components.ep) obj;
                if (!this.f49585b) {
                    f11 = 0.0f;
                }
                epVar.f34387a2 = f11;
                epVar.D1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * epVar.f34387a2);
                return;
            case 7:
                if (!this.f49585b) {
                    ((org.telegram.ui.Components.dq) obj).I.setVisibility(8);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.cv cvVar = (org.telegram.ui.Components.cv) obj;
                org.telegram.ui.Components.gv gvVar = cvVar.O;
                if (gvVar.V && !cvVar.h) {
                    if (!this.f49585b && !cvVar.f33700n) {
                        cvVar.setBackground(null);
                        return;
                    } else if (cvVar.getBackground() == null) {
                        cvVar.setBackground(org.telegram.ui.ActionBar.j6.a0(gvVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 9:
                org.telegram.ui.Components.jz jzVar = (org.telegram.ui.Components.jz) obj;
                AnimatorSet animatorSet2 = jzVar.f36198q1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f49585b) {
                        jzVar.f36199r1.setVisibility(4);
                    }
                    jzVar.f36198q1 = null;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.vz vzVar = (org.telegram.ui.Components.vz) obj;
                if (!this.f49585b) {
                    f11 = 0.0f;
                }
                vzVar.f41202n = f11;
                vzVar.invalidate();
                return;
            case 11:
                org.telegram.ui.Components.s10 s10Var = (org.telegram.ui.Components.s10) obj;
                org.telegram.ui.Components.q10 q10Var = s10Var.f39141a;
                if (!s10Var.H) {
                    if (this.f49585b) {
                        f12 = 1.0f;
                    }
                    s10Var.f39147d0 = f12;
                    s10Var.W.setPinnedProgress(f12);
                    q10Var.setScaleX(1.0f - (s10Var.f39147d0 * 0.6f));
                    q10Var.setScaleY(1.0f - (s10Var.f39147d0 * 0.6f));
                    if (s10Var.Y) {
                        s10Var.j();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                View view = (View) obj;
                if (!this.f49585b) {
                    i11 = 4;
                }
                view.setVisibility(i11);
                return;
            case 13:
                org.telegram.ui.Components.p50 p50Var = (org.telegram.ui.Components.p50) obj;
                AnimatorSet animatorSet3 = p50Var.S1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f49585b) {
                        p50Var.T1.setVisibility(4);
                    }
                    p50Var.S1 = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.a60 a60Var = (org.telegram.ui.Components.a60) obj;
                boolean z11 = this.f49585b;
                if (!z11) {
                    f11 = 0.0f;
                }
                a60Var.f32869c2 = f11;
                a60Var.f29682b.invalidate();
                if (!z11) {
                    a60Var.Q1.setVisibility(8);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.ka0 ka0Var = (org.telegram.ui.Components.ka0) obj;
                if (ka0Var.getParent() != null) {
                    ((ViewGroup) ka0Var.getParent()).removeView(ka0Var);
                }
                boolean z12 = this.f49585b;
                lk lkVar = (lk) ka0Var;
                org.telegram.messenger.kj kjVar = lkVar.I.f45408w5;
                if (kjVar != null) {
                    kjVar.f24726x = null;
                }
                if (z12) {
                    org.telegram.messenger.g0.i3(new kk(lkVar, 1), 15L);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.ea0 ea0Var = (org.telegram.ui.Components.ea0) obj;
                ea0Var.Q = null;
                ea0Var.h(this.f49585b, false);
                return;
            case 17:
                org.telegram.ui.Components.fc0 fc0Var = (org.telegram.ui.Components.fc0) obj;
                TextView textView = fc0Var.f34582x;
                bi.v1 v1Var = fc0Var.f34571e;
                if (this.f49585b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                v1Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                v1Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                v1Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, f10));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, f10));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, f10));
                fc0Var.f34580s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) obj;
                if (animator.equals(pipRoundVideoView.f32610r)) {
                    if (!this.f49585b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f32610r = null;
                    return;
                }
                return;
            case 19:
                boolean z13 = this.f49585b;
                org.telegram.ui.Components.ul0 ul0Var = (org.telegram.ui.Components.ul0) obj;
                if (animator == ul0Var.H) {
                    if (!z13) {
                        f11 = 0.0f;
                    }
                    ul0Var.G = f11;
                    ul0Var.setShown(f11);
                    if (!z13) {
                        ul0Var.setVisibility(8);
                    }
                    ul0Var.b(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.ys0 ys0Var = (org.telegram.ui.Components.ys0) obj;
                if (ys0Var.R1 != null) {
                    ys0Var.R1 = null;
                    if (!this.f49585b) {
                        ys0Var.E0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.b01 b01Var = (org.telegram.ui.Components.b01) obj;
                if (!this.f49585b) {
                    f11 = 0.0f;
                }
                b01Var.N = f11;
                b01Var.invalidate();
                return;
            case 22:
                boolean z14 = this.f49585b;
                org.telegram.ui.Components.p11 p11Var = (org.telegram.ui.Components.p11) obj;
                long j3 = p11Var.f38152f;
                if (p11Var.f38151e0 == animator) {
                    if (!z14) {
                        f11 = 0.0f;
                    }
                    p11Var.V = f11;
                    p11Var.p();
                    p11Var.W = false;
                    ImageView imageView = p11Var.I;
                    int i12 = 2131231886;
                    if (p11Var.T) {
                        i7 = 2131231886;
                    } else {
                        i7 = 2131231883;
                    }
                    imageView.setImageResource(i7);
                    ImageView imageView2 = p11Var.H;
                    if (!p11Var.T) {
                        i12 = 2131231884;
                    }
                    imageView2.setImageResource(i12);
                    p11Var.f38151e0 = null;
                    org.telegram.messenger.np.s1(p11Var.f38150e).f25283f7.edit().putBoolean("topicssidetabs" + j3, p11Var.U).putBoolean("topicssidetabsb" + j3, p11Var.T).apply();
                    Boolean bool = p11Var.f38149d0;
                    if (bool != null && z14 != bool.booleanValue()) {
                        boolean booleanValue = p11Var.f38149d0.booleanValue();
                        p11Var.f38149d0 = null;
                        p11Var.d(booleanValue);
                    }
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ro0(this, 21));
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Components.k11 k11Var = (org.telegram.ui.Components.k11) obj;
                if (!this.f49585b) {
                    f11 = 0.0f;
                }
                k11Var.G = f11;
                k11Var.h();
                return;
            case 24:
                org.telegram.ui.Components.o11 o11Var = (org.telegram.ui.Components.o11) obj;
                if (!this.f49585b) {
                    f11 = 0.0f;
                }
                o11Var.V = f11;
                o11Var.h();
                o11Var.g();
                return;
            case 25:
                org.telegram.ui.Components.a51 a51Var = (org.telegram.ui.Components.a51) obj;
                AnimatorSet animatorSet4 = a51Var.f32860o1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f49585b) {
                        a51Var.f32861p1.setVisibility(4);
                    }
                    a51Var.f32860o1 = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.e51 e51Var = (org.telegram.ui.Components.e51) obj;
                AnimatorSet animatorSet5 = e51Var.f34196t1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f49585b) {
                        e51Var.f34195s1.setVisibility(4);
                    }
                    e51Var.f34196t1 = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.voip.r2 r2Var = (org.telegram.ui.Components.voip.r2) obj;
                r2Var.f40928w = null;
                if (this.f49585b) {
                    TextView[] textViewArr = r2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!r2Var.H && (drawable = (drawableArr = r2Var.f40923e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                r2Var.H = false;
                if (!r2Var.P) {
                    r2Var.f40925n = r2Var.f40926r;
                }
                r2Var.f40927s = 0.0f;
                r2Var.invalidate();
                return;
            case 28:
                pr prVar = (pr) obj;
                if (prVar.f50345x != null && (radialProgressView2 = prVar.f50343s) != null) {
                    if (!this.f49585b) {
                        radialProgressView2.setVisibility(4);
                        prVar.f50344w.setVisibility(4);
                    }
                    prVar.f50345x = null;
                    return;
                }
                return;
            default:
                bz bzVar = (bz) obj;
                if (!this.f49585b) {
                    f11 = 0.0f;
                }
                bzVar.f45849s = f11;
                bzVar.invalidate();
                return;
        }
    }

    public nn(View view) {
        this.f49584a = 12;
        this.f49586c = view;
        this.f49585b = true;
    }

    public nn(View view, boolean z10) {
        this.f49584a = 12;
        this.f49586c = view;
        this.f49585b = z10;
    }

    public nn(org.telegram.ui.Components.xn xnVar) {
        this.f49584a = 4;
        this.f49586c = xnVar;
    }
}
