package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ai implements org.telegram.ui.web.c0 {
    public ValueAnimator f33516a;
    public final ki.s3 f33517b;
    public final String f33518c;
    public final long d;
    public final ui f33519e;

    public ai(ui uiVar, ki.s3 s3Var, String str, long j3) {
        this.f33519e = uiVar;
        this.f33517b = s3Var;
        this.f33518c = str;
        this.d = j3;
    }

    @Override
    public final ki.v0 A() {
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
        ui uiVar = this.f33519e;
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(uiVar.H3);
        long j3 = this.d;
        if (!d02.l(j3) && !org.telegram.messenger.mp.u1(uiVar.H3).Z6.contains(Long.valueOf(j3))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z10) {
        int i7;
        ImageView backButton = this.f33519e.V2.getBackButton();
        if (z10) {
            i7 = 2131231240;
        } else {
            i7 = 2131231269;
        }
        org.telegram.messenger.g0.P3(backButton, i7);
    }

    @Override
    public final void j() {
        z();
    }

    @Override
    public final void k(boolean z10) {
        this.f33517b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i7) {
        this.f33517b.setCustomBackground(i7);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        ui uiVar = this.f33519e;
        int i7 = uiVar.H3;
        org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40375a2;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ki.s3 s3Var = this.f33517b;
        org.telegram.ui.ml0 ml0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, uiVar.getContext(), null);
            t1Var.r(150L);
            di.y8.y(i7, false).W(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new j2(t1Var, 1), new rh(0, s3Var, str));
            org.telegram.messenger.g0.v1(s3Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            org.telegram.messenger.mp.u1(i7).f4(paymentForm.users, false);
            ml0Var = new org.telegram.ui.ml0(paymentForm, null, str, g2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            ml0Var = new org.telegram.ui.ml0((TLRPC.PaymentReceipt) tLObject);
        }
        if (ml0Var != null) {
            s3Var.K();
            org.telegram.messenger.g0.v1(s3Var);
            zb0 zb0Var = new zb0(g2Var.getParentActivity());
            zb0Var.show();
            ml0Var.f49896a1 = new a3.h((Object) zb0Var, (Object) s3Var, str, 26);
            ml0Var.Z0 = uiVar.J0;
            zb0Var.d(ml0Var);
        }
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13) {
        int i11;
        float f10;
        float f11;
        float f12;
        ui uiVar = this.f33519e;
        RadialProgressView radialProgressView = uiVar.A3;
        o6 o6Var = uiVar.C3;
        mi miVar = uiVar.f40448w2;
        ki.s3 s3Var = this.f33517b;
        if (miVar == s3Var) {
            if (s3Var.Q || this.f33518c != null) {
                o6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j3 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new y5(j3, 1.4f, o6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    o6Var.setText(spannableStringBuilder);
                } else {
                    o6Var.setText(str);
                }
                o6Var.setTextColor(i10);
                o6Var.setEmojiColor(i10);
                boolean z14 = org.telegram.ui.web.v0.R0;
                if (i0.a.h(i7) >= 0.30000001192092896d) {
                    i11 = 301989888;
                } else {
                    i11 = 385875967;
                }
                o6Var.setBackground(org.telegram.ui.ActionBar.m6.i0(i7, i11));
                float f13 = 0.0f;
                float f14 = 1.0f;
                if (uiVar.B3 != z10) {
                    uiVar.B3 = z10;
                    ValueAnimator valueAnimator = this.f33516a;
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
                    this.f33516a = duration;
                    duration.addUpdateListener(new x(this, 10));
                    this.f33516a.addListener(new th(this, z10, 0));
                    this.f33516a.start();
                }
                radialProgressView.setProgressColor(i10);
                if (uiVar.f40461z3 != z12) {
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
                    scaleX.scaleY(f14).setDuration(250L).setListener(new th(this, z12, 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        mi miVar = this.f33519e.f40448w2;
        ki.s3 s3Var = this.f33517b;
        if (miVar == s3Var && !s3Var.K.f18903c) {
            s3Var.K();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i7;
        org.telegram.ui.ActionBar.y0 y0Var = this.f33517b.M;
        if (y0Var != null) {
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            y0Var.setVisibility(i7);
        }
    }

    @Override
    public final void u(int i7, final int i10, boolean z10) {
        int i11;
        ui uiVar = this.f33519e;
        final int i12 = uiVar.E4.f59037b;
        final ki.p1 p1Var = new ki.p1();
        int i13 = 0;
        if (uiVar.V1) {
            i11 = i12;
        } else {
            i11 = 0;
        }
        p1Var.c(p1Var.f18854a, i11, uiVar.J0);
        uiVar.V1 = z10;
        if (z10) {
            i13 = i10;
        }
        p1Var.c(p1Var.f18855b, i13, uiVar.J0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(nr.f37956f);
        final ki.s3 s3Var = this.f33517b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f10 = i0.a.f(floatValue, i12, i10);
                ui uiVar2 = ai.this.f33519e;
                uiVar2.f40408l4 = f10;
                uiVar2.f40405k4 = true;
                v7 v7Var = uiVar2.V2;
                if (v7Var != null) {
                    v7Var.updateColors();
                    v7Var.invalidate();
                }
                uiVar2.E4.a(f10);
                lh.f fVar = uiVar2.f40437t3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                s3Var.setCustomActionBarBackground(f10);
                uiVar2.f40448w2.invalidate();
                uiVar2.f40421p3.invalidate();
                p1Var.b(v7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        ui uiVar = this.f33519e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40375a2;
            if (g2Var instanceof org.telegram.ui.bn) {
                org.telegram.ui.rj rjVar = ((org.telegram.ui.bn) g2Var).f45946a0;
                rjVar.setFieldText("@" + org.telegram.messenger.o10.o(user) + " " + str);
            }
            uiVar.a(true);
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
        org.telegram.ui.cx cxVar = new org.telegram.ui.cx(bundle);
        zb0 zb0Var = new zb0(uiVar.getContext());
        cxVar.E2 = new a1.d(this, user, str, zb0Var, 10);
        zb0Var.show();
        zb0Var.d(cxVar);
    }

    @Override
    public final void y(boolean z10) {
        this.f33517b.setAllowSwipes(z10);
    }

    @Override
    public final void z() {
        ui uiVar = this.f33519e;
        if (uiVar.f40448w2 != this.f33517b) {
            return;
        }
        uiVar.A0(false);
        uiVar.getWindow().setSoftInputMode(48);
        uiVar.dismiss();
        org.telegram.messenger.g0.h3(new me(2), 150L);
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
    public final void r(int i7) {
    }

    @Override
    public final void w(boolean z10) {
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
    public final void o(int i7, boolean z10) {
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13, String str2) {
    }
}
