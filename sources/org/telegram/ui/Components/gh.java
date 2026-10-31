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
    public ValueAnimator f26368a;
    public final xh.i3 f26369b;
    public final String f26370c;
    public final long d;
    public final bi e;

    public gh(bi biVar, xh.i3 i3Var, String str, long j10) {
        this.e = biVar;
        this.f26369b = i3Var;
        this.f26370c = str;
        this.d = j10;
    }

    @Override
    public final xh.s0 A() {
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
        bi biVar = this.e;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(biVar.D3);
        long j10 = this.d;
        if (!b02.j(j10) && !org.telegram.messenger.vp.r1(biVar.D3).X6.contains(Long.valueOf(j10))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z10) {
        int i10;
        ImageView backButton = this.e.R2.getBackButton();
        if (z10) {
            i10 = 2131231241;
        } else {
            i10 = 2131231270;
        }
        org.telegram.messenger.i0.Q3(backButton, i10);
    }

    @Override
    public final void j() {
        z();
    }

    @Override
    public final void k(boolean z10) {
        this.f26369b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i10) {
        this.f26369b.setCustomBackground(i10);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        bi biVar = this.e;
        int i10 = biVar.D3;
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        xh.i3 i3Var = this.f26369b;
        org.telegram.ui.sm0 sm0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, biVar.getContext(), null);
            x1Var.r(150L);
            rh.e6.y(i10, false).X(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new a2(x1Var, 1), new vg(2, i3Var, str));
            org.telegram.messenger.i0.v1(i3Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            org.telegram.messenger.vp.r1(i10).V3(paymentForm.users, false);
            sm0Var = new org.telegram.ui.sm0(paymentForm, null, str, k2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            sm0Var = new org.telegram.ui.sm0((TLRPC.PaymentReceipt) tLObject);
        }
        if (sm0Var != null) {
            i3Var.I();
            org.telegram.messenger.i0.v1(i3Var);
            fc0 fc0Var = new fc0(k2Var.getParentActivity());
            fc0Var.show();
            sm0Var.Z0 = new androidx.car.app.utils.a(fc0Var, i3Var, str, 17);
            sm0Var.Y0 = biVar.I0;
            fc0Var.c(sm0Var);
        }
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
        int i12;
        float f7;
        float f10;
        float f11;
        bi biVar = this.e;
        RadialProgressView radialProgressView = biVar.f24738w3;
        f6 f6Var = biVar.y3;
        uh uhVar = biVar.f24721s2;
        xh.i3 i3Var = this.f26369b;
        if (uhVar == i3Var) {
            if (i3Var.P || this.f26370c != null) {
                f6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j10 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new o5(j10, 1.4f, f6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    f6Var.setText(spannableStringBuilder);
                } else {
                    f6Var.setText(str);
                }
                f6Var.setTextColor(i11);
                f6Var.setEmojiColor(i11);
                boolean z14 = org.telegram.ui.web.z0.Q0;
                if (i0.b.h(i10) >= 0.30000001192092896d) {
                    i12 = 301989888;
                } else {
                    i12 = 385875967;
                }
                f6Var.setBackground(org.telegram.ui.ActionBar.t6.i0(i10, i12));
                float f12 = 0.0f;
                float f13 = 1.0f;
                if (biVar.f24742x3 != z10) {
                    biVar.f24742x3 = z10;
                    ValueAnimator valueAnimator = this.f26368a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (z10) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(250L);
                    this.f26368a = duration;
                    duration.addUpdateListener(new a6(this, 9));
                    this.f26368a.addListener(new zg(this, z10, 0));
                    this.f26368a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (biVar.f24734v3 != z12) {
                    radialProgressView.animate().cancel();
                    if (z12) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    ViewPropertyAnimator animate = radialProgressView.animate();
                    if (z12) {
                        f12 = 1.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f12);
                    if (z12) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.1f;
                    }
                    ViewPropertyAnimator scaleX = alpha.scaleX(f7);
                    if (!z12) {
                        f13 = 0.1f;
                    }
                    scaleX.scaleY(f13).setDuration(250L).setListener(new zg(this, z12, 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        uh uhVar = this.e.f24721s2;
        xh.i3 i3Var = this.f26369b;
        if (uhVar == i3Var && !i3Var.J.f53788c) {
            i3Var.I();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.b1 b1Var = this.f26369b.L;
        if (b1Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            b1Var.setVisibility(i10);
        }
    }

    @Override
    public final void u(int i10, final int i11, boolean z10) {
        int i12;
        bi biVar = this.e;
        final int i13 = biVar.A4.f7711b;
        final xh.m1 m1Var = new xh.m1();
        int i14 = 0;
        if (biVar.R1) {
            i12 = i13;
        } else {
            i12 = 0;
        }
        m1Var.c(m1Var.f53868a, i12, biVar.I0);
        biVar.R1 = z10;
        if (z10) {
            i14 = i11;
        }
        m1Var.c(m1Var.f53869b, i14, biVar.I0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(gr.f26495f);
        final xh.i3 i3Var = this.f26369b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f7 = i0.b.f(floatValue, i13, i11);
                bi biVar2 = gh.this.e;
                biVar2.f24681h4 = f7;
                biVar2.f24678g4 = true;
                kg.g1 g1Var = biVar2.R2;
                if (g1Var != null) {
                    g1Var.updateColors();
                    g1Var.invalidate();
                }
                biVar2.A4.a(f7);
                bh.i iVar = biVar2.f24710p3;
                if (iVar != null) {
                    iVar.invalidate();
                }
                i3Var.setCustomActionBarBackground(f7);
                biVar2.f24721s2.invalidate();
                biVar2.f24695l3.invalidate();
                m1Var.b(g1Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        bi biVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
            if (k2Var instanceof org.telegram.ui.un) {
                org.telegram.ui.mk mkVar = ((org.telegram.ui.un) k2Var).Z;
                mkVar.setFieldText("@" + org.telegram.messenger.h20.n(user) + " " + str);
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
        org.telegram.ui.ay ayVar = new org.telegram.ui.ay(bundle);
        fc0 fc0Var = new fc0(biVar.getContext());
        ayVar.C2 = new a1.d(this, user, str, fc0Var, 6);
        fc0Var.show();
        fc0Var.c(ayVar);
    }

    @Override
    public final void y(boolean z10) {
        this.f26369b.setAllowSwipes(z10);
    }

    @Override
    public final void z() {
        bi biVar = this.e;
        if (biVar.f24721s2 != this.f26369b) {
            return;
        }
        biVar.A0(false);
        biVar.getWindow().setSoftInputMode(48);
        biVar.dismiss();
        org.telegram.messenger.i0.h3(new org.telegram.messenger.rz(15), 150L);
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
    public final void r(int i10) {
    }

    @Override
    public final void w(boolean z10) {
    }

    @Override
    public final void x(int i10) {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void o(int i10, boolean z10) {
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
