package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yh implements org.telegram.ui.web.c0 {
    public ValueAnimator f42497a;
    public final ki.t3 f42498b;
    public final String f42499c;
    public final long d;
    public final si f42500e;

    public yh(si siVar, ki.t3 t3Var, String str, long j3) {
        this.f42500e = siVar;
        this.f42498b = t3Var;
        this.f42499c = str;
        this.d = j3;
    }

    @Override
    public final ki.w0 A() {
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
        si siVar = this.f42500e;
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(siVar.H3);
        long j3 = this.d;
        if (!d02.l(j3) && !org.telegram.messenger.mp.u1(siVar.H3).Z6.contains(Long.valueOf(j3))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z10) {
        int i7;
        ImageView backButton = this.f42500e.V2.getBackButton();
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
        this.f42498b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i7) {
        this.f42498b.setCustomBackground(i7);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        si siVar = this.f42500e;
        int i7 = siVar.H3;
        org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ki.t3 t3Var = this.f42498b;
        org.telegram.ui.ml0 ml0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, siVar.getContext(), null);
            u1Var.r(150L);
            di.x8.y(i7, false).W(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new i2(u1Var, 1), new ph(0, t3Var, str));
            org.telegram.messenger.g0.v1(t3Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            org.telegram.messenger.mp.u1(i7).f4(paymentForm.users, false);
            ml0Var = new org.telegram.ui.ml0(paymentForm, null, str, h2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            ml0Var = new org.telegram.ui.ml0((TLRPC.PaymentReceipt) tLObject);
        }
        if (ml0Var != null) {
            t3Var.K();
            org.telegram.messenger.g0.v1(t3Var);
            yb0 yb0Var = new yb0(h2Var.getParentActivity());
            yb0Var.show();
            ml0Var.f49855a1 = new a3.h((Object) yb0Var, (Object) t3Var, str, 26);
            ml0Var.Z0 = siVar.J0;
            yb0Var.d(ml0Var);
        }
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13) {
        int i11;
        float f10;
        float f11;
        float f12;
        si siVar = this.f42500e;
        RadialProgressView radialProgressView = siVar.A3;
        n6 n6Var = siVar.C3;
        ki kiVar = siVar.f39732w2;
        ki.t3 t3Var = this.f42498b;
        if (kiVar == t3Var) {
            if (t3Var.Q || this.f42499c != null) {
                n6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j3 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new x5(j3, 1.4f, n6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    n6Var.setText(spannableStringBuilder);
                } else {
                    n6Var.setText(str);
                }
                n6Var.setTextColor(i10);
                n6Var.setEmojiColor(i10);
                boolean z14 = org.telegram.ui.web.v0.R0;
                if (i0.a.h(i7) >= 0.30000001192092896d) {
                    i11 = 301989888;
                } else {
                    i11 = 385875967;
                }
                n6Var.setBackground(org.telegram.ui.ActionBar.n6.i0(i7, i11));
                float f13 = 0.0f;
                float f14 = 1.0f;
                if (siVar.B3 != z10) {
                    siVar.B3 = z10;
                    ValueAnimator valueAnimator = this.f42497a;
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
                    this.f42497a = duration;
                    duration.addUpdateListener(new w(this, 10));
                    this.f42497a.addListener(new rh(this, z10, 0));
                    this.f42497a.start();
                }
                radialProgressView.setProgressColor(i10);
                if (siVar.f39745z3 != z12) {
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
                    scaleX.scaleY(f14).setDuration(250L).setListener(new rh(this, z12, 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        ki kiVar = this.f42500e.f39732w2;
        ki.t3 t3Var = this.f42498b;
        if (kiVar == t3Var && !t3Var.K.f18893c) {
            t3Var.K();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i7;
        org.telegram.ui.ActionBar.z0 z0Var = this.f42498b.M;
        if (z0Var != null) {
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            z0Var.setVisibility(i7);
        }
    }

    @Override
    public final void u(int i7, final int i10, boolean z10) {
        int i11;
        si siVar = this.f42500e;
        final int i12 = siVar.E4.f58999b;
        final ki.q1 q1Var = new ki.q1();
        int i13 = 0;
        if (siVar.V1) {
            i11 = i12;
        } else {
            i11 = 0;
        }
        q1Var.c(q1Var.f18844a, i11, siVar.J0);
        siVar.V1 = z10;
        if (z10) {
            i13 = i10;
        }
        q1Var.c(q1Var.f18845b, i13, siVar.J0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(lr.f37208f);
        final ki.t3 t3Var = this.f42498b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f10 = i0.a.f(floatValue, i12, i10);
                si siVar2 = yh.this.f42500e;
                siVar2.f39692l4 = f10;
                siVar2.f39689k4 = true;
                v7 v7Var = siVar2.V2;
                if (v7Var != null) {
                    v7Var.updateColors();
                    v7Var.invalidate();
                }
                siVar2.E4.a(f10);
                lh.f fVar = siVar2.f39721t3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                t3Var.setCustomActionBarBackground(f10);
                siVar2.f39732w2.invalidate();
                siVar2.f39705p3.invalidate();
                q1Var.b(v7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        si siVar = this.f42500e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
            if (h2Var instanceof org.telegram.ui.bn) {
                org.telegram.ui.rj rjVar = ((org.telegram.ui.bn) h2Var).f45923a0;
                rjVar.setFieldText("@" + org.telegram.messenger.o10.o(user) + " " + str);
            }
            siVar.a(true);
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
        yb0 yb0Var = new yb0(siVar.getContext());
        cxVar.E2 = new a1.d(this, user, str, yb0Var, 10);
        yb0Var.show();
        yb0Var.d(cxVar);
    }

    @Override
    public final void y(boolean z10) {
        this.f42498b.setAllowSwipes(z10);
    }

    @Override
    public final void z() {
        si siVar = this.f42500e;
        if (siVar.f39732w2 != this.f42498b) {
            return;
        }
        siVar.A0(false);
        siVar.getWindow().setSoftInputMode(48);
        siVar.dismiss();
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
