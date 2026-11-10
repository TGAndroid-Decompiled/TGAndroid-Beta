package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ih implements org.telegram.ui.web.d0 {
    public ValueAnimator f34627a;
    public final hi.c4 f34628b;
    public final String f34629c;
    public final long d;
    public final ci f34630e;

    public ih(ci ciVar, hi.c4 c4Var, String str, long j3) {
        this.f34630e = ciVar;
        this.f34628b = c4Var;
        this.f34629c = str;
        this.d = j3;
    }

    @Override
    public final hi.v0 A() {
        return null;
    }

    @Override
    public final void b() {
        z();
    }

    @Override
    public final String g(boolean z9, boolean z10) {
        return "UNSUPPORTED";
    }

    @Override
    public final boolean h() {
        ci ciVar = this.f34630e;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(ciVar.G3);
        long j3 = this.d;
        if (!b02.j(j3) && !org.telegram.messenger.qp.s1(ciVar.G3).W6.contains(Long.valueOf(j3))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z9) {
        int i7;
        ImageView backButton = this.f34630e.U2.getBackButton();
        if (z9) {
            i7 = 2131231240;
        } else {
            i7 = 2131231269;
        }
        org.telegram.messenger.g0.R3(backButton, i7);
    }

    @Override
    public final void j() {
        z();
    }

    @Override
    public final void k(boolean z9) {
        this.f34628b.setNeedCloseConfirmation(z9);
    }

    @Override
    public final void m(int i7) {
        this.f34628b.setCustomBackground(i7);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        ci ciVar = this.f34630e;
        int i7 = ciVar.G3;
        org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
        boolean z9 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        hi.c4 c4Var = this.f34628b;
        org.telegram.ui.kl0 kl0Var = null;
        if (z9) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, ciVar.getContext(), null);
            u1Var.r(150L);
            bi.ea.y(i7, false).X(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new z1(u1Var, 1), new org.telegram.messenger.voip.k(25, c4Var, str));
            org.telegram.messenger.g0.v1(c4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            org.telegram.messenger.qp.s1(i7).Y3(paymentForm.users, false);
            kl0Var = new org.telegram.ui.kl0(paymentForm, null, str, f2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            kl0Var = new org.telegram.ui.kl0((TLRPC.PaymentReceipt) tLObject);
        }
        if (kl0Var != null) {
            c4Var.J();
            org.telegram.messenger.g0.v1(c4Var);
            mb0 mb0Var = new mb0(f2Var.getParentActivity());
            mb0Var.show();
            kl0Var.Z0 = new a3.h((Object) mb0Var, (Object) c4Var, str, 25);
            kl0Var.Y0 = ciVar.I0;
            mb0Var.c(kl0Var);
        }
    }

    @Override
    public final void q(boolean z9, boolean z10, String str, long j3, int i7, int i10, boolean z11, boolean z12) {
        int i11;
        float f10;
        float f11;
        float f12;
        ci ciVar = this.f34630e;
        RadialProgressView radialProgressView = ciVar.f32677z3;
        i6 i6Var = ciVar.B3;
        uh uhVar = ciVar.f32660v2;
        hi.c4 c4Var = this.f34628b;
        if (uhVar == c4Var) {
            if (c4Var.P || this.f34629c != null) {
                i6Var.setClickable(z10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j3 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new q5(j3, 1.4f, i6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    i6Var.setText(spannableStringBuilder);
                } else {
                    i6Var.setText(str);
                }
                i6Var.setTextColor(i10);
                i6Var.setEmojiColor(i10);
                boolean z13 = org.telegram.ui.web.x0.Q0;
                if (i0.a.h(i7) >= 0.30000001192092896d) {
                    i11 = 301989888;
                } else {
                    i11 = 385875967;
                }
                i6Var.setBackground(org.telegram.ui.ActionBar.m6.i0(i7, i11));
                float f13 = 0.0f;
                float f14 = 1.0f;
                if (ciVar.A3 != z9) {
                    ciVar.A3 = z9;
                    ValueAnimator valueAnimator = this.f34627a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (z9) {
                        f11 = 0.0f;
                    } else {
                        f11 = 1.0f;
                    }
                    if (z9) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(f11, f12).setDuration(250L);
                    this.f34627a = duration;
                    duration.addUpdateListener(new d6(this, 9));
                    this.f34627a.addListener(new bh(this, z9, 0));
                    this.f34627a.start();
                }
                radialProgressView.setProgressColor(i10);
                if (ciVar.f32673y3 != z11) {
                    radialProgressView.animate().cancel();
                    if (z11) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    ViewPropertyAnimator animate = radialProgressView.animate();
                    if (z11) {
                        f13 = 1.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f13);
                    if (z11) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.1f;
                    }
                    ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                    if (!z11) {
                        f14 = 0.1f;
                    }
                    scaleX.scaleY(f14).setDuration(250L).setListener(new bh(this, z11, 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        uh uhVar = this.f34630e.f32660v2;
        hi.c4 c4Var = this.f34628b;
        if (uhVar == c4Var && !c4Var.J.f14565c) {
            c4Var.J();
        }
    }

    @Override
    public final void t(boolean z9) {
        int i7;
        org.telegram.ui.ActionBar.z0 z0Var = this.f34628b.L;
        if (z0Var != null) {
            if (z9) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            z0Var.setVisibility(i7);
        }
    }

    @Override
    public final void u(int i7, final int i10, boolean z9) {
        int i11;
        ci ciVar = this.f34630e;
        final int i12 = ciVar.D4.f54575b;
        final hi.t1 t1Var = new hi.t1();
        int i13 = 0;
        if (ciVar.U1) {
            i11 = i12;
        } else {
            i11 = 0;
        }
        t1Var.c(t1Var.f14960a, i11, ciVar.I0);
        ciVar.U1 = z9;
        if (z9) {
            i13 = i10;
        }
        t1Var.c(t1Var.f14961b, i13, ciVar.I0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(wq.f40046f);
        final hi.c4 c4Var = this.f34628b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f10 = i0.a.f(floatValue, i12, i10);
                ci ciVar2 = ih.this.f34630e;
                ciVar2.f32621k4 = f10;
                ciVar2.f32618j4 = true;
                q7 q7Var = ciVar2.U2;
                if (q7Var != null) {
                    q7Var.updateColors();
                    q7Var.invalidate();
                }
                ciVar2.D4.a(f10);
                lh.f fVar = ciVar2.f32649s3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                c4Var.setCustomActionBarBackground(f10);
                ciVar2.f32660v2.invalidate();
                ciVar2.f32634o3.invalidate();
                t1Var.b(q7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        ci ciVar = this.f34630e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
            if (f2Var instanceof org.telegram.ui.cn) {
                org.telegram.ui.sj sjVar = ((org.telegram.ui.cn) f2Var).Z;
                sjVar.setFieldText("@" + org.telegram.messenger.t10.n(user) + " " + str);
            }
            ciVar.a(true);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("dialogsType", 14);
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("allowGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowLegacyGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowMegagroups", arrayList.contains("groups"));
        bundle.putBoolean("allowUsers", arrayList.contains("users"));
        bundle.putBoolean("allowChannels", arrayList.contains("channels"));
        bundle.putBoolean("allowBots", arrayList.contains("bots"));
        org.telegram.ui.zw zwVar = new org.telegram.ui.zw(bundle);
        mb0 mb0Var = new mb0(ciVar.getContext());
        zwVar.D2 = new a1.d(this, user, str, mb0Var, 10);
        mb0Var.show();
        mb0Var.c(zwVar);
    }

    @Override
    public final void y(boolean z9) {
        this.f34628b.setAllowSwipes(z9);
    }

    @Override
    public final void z() {
        ci ciVar = this.f34630e;
        if (ciVar.f32660v2 != this.f34628b) {
            return;
        }
        ciVar.A0(false);
        ciVar.getWindow().setSoftInputMode(48);
        ciVar.dismiss();
        org.telegram.messenger.g0.i3(new org.telegram.messenger.rc(26), 150L);
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(String str) {
    }

    @Override
    public final void f(ArrayList arrayList) {
    }

    @Override
    public final void p(boolean z9) {
    }

    @Override
    public final void r(int i7) {
    }

    @Override
    public final void w(boolean z9) {
    }

    @Override
    public final void x(int i7) {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void o(int i7, boolean z9) {
    }

    @Override
    public final void l(boolean z9, boolean z10, String str, long j3, int i7, int i10, boolean z11, boolean z12, String str2) {
    }
}
