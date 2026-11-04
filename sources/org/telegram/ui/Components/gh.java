package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gh implements org.telegram.ui.web.d0 {
    public ValueAnimator f34092a;
    public final ii.d4 f34093b;
    public final String f34094c;
    public final long d;
    public final bi f34095e;

    public gh(bi biVar, ii.d4 d4Var, String str, long j10) {
        this.f34095e = biVar;
        this.f34093b = d4Var;
        this.f34094c = str;
        this.d = j10;
    }

    @Override
    public final ii.w0 A() {
        return null;
    }

    @Override
    public final void b() {
        z();
    }

    @Override
    public final String g(boolean z10, boolean z11) {
        return "UNSUPPORTED";
    }

    @Override
    public final boolean h() {
        bi biVar = this.f34095e;
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(biVar.E3);
        long j10 = this.d;
        if (!b02.j(j10) && !org.telegram.messenger.hp.s1(biVar.E3).W6.contains(Long.valueOf(j10))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z10) {
        int i3;
        ImageView backButton = this.f34095e.S2.getBackButton();
        if (z10) {
            i3 = 2131231240;
        } else {
            i3 = 2131231269;
        }
        org.telegram.messenger.g0.R3(backButton, i3);
    }

    @Override
    public final void j() {
        z();
    }

    @Override
    public final void k(boolean z10) {
        this.f34093b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i3) {
        this.f34093b.setCustomBackground(i3);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        bi biVar = this.f34095e;
        int i3 = biVar.E3;
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ii.d4 d4Var = this.f34093b;
        org.telegram.ui.dl0 dl0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, biVar.getContext(), null);
            s1Var.r(150L);
            ci.e9.y(i3, false).X(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new z1(s1Var, 1), new mi.f(29, d4Var, str));
            org.telegram.messenger.g0.v1(d4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            org.telegram.messenger.hp.s1(i3).Y3(paymentForm.users, false);
            dl0Var = new org.telegram.ui.dl0(paymentForm, null, str, d2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            dl0Var = new org.telegram.ui.dl0((TLRPC.PaymentReceipt) tLObject);
        }
        if (dl0Var != null) {
            d4Var.J();
            org.telegram.messenger.g0.v1(d4Var);
            hb0 hb0Var = new hb0(d2Var.getParentActivity());
            hb0Var.show();
            dl0Var.f44738a1 = new aa.a(hb0Var, d4Var, str, 25);
            dl0Var.Z0 = biVar.J0;
            hb0Var.c(dl0Var);
        }
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j10, int i3, int i10, boolean z12, boolean z13) {
        int i11;
        float f10;
        float f11;
        float f12;
        bi biVar = this.f34095e;
        RadialProgressView radialProgressView = biVar.f32292x3;
        h6 h6Var = biVar.f32300z3;
        th thVar = biVar.f32275t2;
        ii.d4 d4Var = this.f34093b;
        if (thVar == d4Var) {
            if (d4Var.Q || this.f34094c != null) {
                h6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j10 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new p5(j10, 1.4f, h6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    h6Var.setText(spannableStringBuilder);
                } else {
                    h6Var.setText(str);
                }
                h6Var.setTextColor(i10);
                h6Var.setEmojiColor(i10);
                boolean z14 = org.telegram.ui.web.w0.R0;
                if (i0.a.h(i3) >= 0.30000001192092896d) {
                    i11 = 301989888;
                } else {
                    i11 = 385875967;
                }
                h6Var.setBackground(org.telegram.ui.ActionBar.k6.i0(i3, i11));
                float f13 = 0.0f;
                float f14 = 1.0f;
                if (biVar.f32296y3 != z10) {
                    biVar.f32296y3 = z10;
                    ValueAnimator valueAnimator = this.f34092a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (z10) {
                        f11 = 0.0f;
                    } else {
                        f11 = 1.0f;
                    }
                    if (z10) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(f11, f12).setDuration(250L);
                    this.f34092a = duration;
                    duration.addUpdateListener(new c6(this, 9));
                    this.f34092a.addListener(new zg(this, z10, 0));
                    this.f34092a.start();
                }
                radialProgressView.setProgressColor(i10);
                if (biVar.f32288w3 != z12) {
                    radialProgressView.animate().cancel();
                    if (z12) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    ViewPropertyAnimator animate = radialProgressView.animate();
                    if (z12) {
                        f13 = 1.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f13);
                    if (z12) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.1f;
                    }
                    ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                    if (!z12) {
                        f14 = 0.1f;
                    }
                    scaleX.scaleY(f14).setDuration(250L).setListener(new zg(this, z12, 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        th thVar = this.f34095e.f32275t2;
        ii.d4 d4Var = this.f34093b;
        if (thVar == d4Var && !d4Var.K.f14876c) {
            d4Var.J();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i3;
        org.telegram.ui.ActionBar.y0 y0Var = this.f34093b.M;
        if (y0Var != null) {
            if (z10) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            y0Var.setVisibility(i3);
        }
    }

    @Override
    public final void u(int i3, final int i10, boolean z10) {
        int i11;
        bi biVar = this.f34095e;
        final int i12 = biVar.B4.f54747b;
        final ii.u1 u1Var = new ii.u1();
        int i13 = 0;
        if (biVar.S1) {
            i11 = i12;
        } else {
            i11 = 0;
        }
        u1Var.c(u1Var.f15252a, i11, biVar.J0);
        biVar.S1 = z10;
        if (z10) {
            i13 = i10;
        }
        u1Var.c(u1Var.f15253b, i13, biVar.J0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(xq.f40452f);
        final ii.d4 d4Var = this.f34093b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f10 = i0.a.f(floatValue, i12, i10);
                bi biVar2 = gh.this.f34095e;
                biVar2.f32236i4 = f10;
                biVar2.f32234h4 = true;
                p7 p7Var = biVar2.S2;
                if (p7Var != null) {
                    p7Var.updateColors();
                    p7Var.invalidate();
                }
                biVar2.B4.a(f10);
                mh.f fVar = biVar2.f32264q3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                d4Var.setCustomActionBarBackground(f10);
                biVar2.f32275t2.invalidate();
                biVar2.f32249m3.invalidate();
                u1Var.b(p7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        bi biVar = this.f34095e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
            if (d2Var instanceof org.telegram.ui.wm) {
                org.telegram.ui.mj mjVar = ((org.telegram.ui.wm) d2Var).f51237a0;
                mjVar.setFieldText("@" + org.telegram.messenger.l10.n(user) + " " + str);
            }
            biVar.a(true);
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
        org.telegram.ui.uw uwVar = new org.telegram.ui.uw(bundle);
        hb0 hb0Var = new hb0(biVar.getContext());
        uwVar.D2 = new a1.d(this, user, str, hb0Var, 9);
        hb0Var.show();
        hb0Var.c(uwVar);
    }

    @Override
    public final void y(boolean z10) {
        this.f34093b.setAllowSwipes(z10);
    }

    @Override
    public final void z() {
        bi biVar = this.f34095e;
        if (biVar.f32275t2 != this.f34093b) {
            return;
        }
        biVar.A0(false);
        biVar.getWindow().setSoftInputMode(48);
        biVar.dismiss();
        org.telegram.messenger.g0.i3(new org.telegram.messenger.hc(28), 150L);
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
    public final void p(boolean z10) {
    }

    @Override
    public final void r(int i3) {
    }

    @Override
    public final void w(boolean z10) {
    }

    @Override
    public final void x(int i3) {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void o(int i3, boolean z10) {
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j10, int i3, int i10, boolean z12, boolean z13, String str2) {
    }
}
