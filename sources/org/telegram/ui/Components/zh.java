package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zh implements org.telegram.ui.web.c0 {
    public ValueAnimator f42859a;
    public final ki.t3 f42860b;
    public final String f42861c;
    public final long d;
    public final ti f42862e;

    public zh(ti tiVar, ki.t3 t3Var, String str, long j3) {
        this.f42862e = tiVar;
        this.f42860b = t3Var;
        this.f42861c = str;
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
        ti tiVar = this.f42862e;
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(tiVar.H3);
        long j3 = this.d;
        if (!d02.l(j3) && !org.telegram.messenger.mp.u1(tiVar.H3).Z6.contains(Long.valueOf(j3))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z10) {
        int i7;
        ImageView backButton = this.f42862e.V2.getBackButton();
        if (z10) {
            i7 = 2131231243;
        } else {
            i7 = 2131231272;
        }
        org.telegram.messenger.g0.P3(backButton, i7);
    }

    @Override
    public final void j() {
        z();
    }

    @Override
    public final void k(boolean z10) {
        this.f42860b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i7) {
        this.f42860b.setCustomBackground(i7);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        ti tiVar = this.f42862e;
        int i7 = tiVar.H3;
        org.telegram.ui.ActionBar.g2 g2Var = tiVar.f39956a2;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ki.t3 t3Var = this.f42860b;
        org.telegram.ui.kl0 kl0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, tiVar.getContext(), null);
            t1Var.r(150L);
            di.y8.y(i7, false).W(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new i2(t1Var, 1), new ph(1, t3Var, str));
            org.telegram.messenger.g0.v1(t3Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            org.telegram.messenger.mp.u1(i7).f4(paymentForm.users, false);
            kl0Var = new org.telegram.ui.kl0(paymentForm, null, str, g2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            kl0Var = new org.telegram.ui.kl0((TLRPC.PaymentReceipt) tLObject);
        }
        if (kl0Var != null) {
            t3Var.J();
            org.telegram.messenger.g0.v1(t3Var);
            wb0 wb0Var = new wb0(g2Var.getParentActivity());
            wb0Var.show();
            kl0Var.f49455a1 = new a3.h((Object) wb0Var, (Object) t3Var, str, 26);
            kl0Var.Z0 = tiVar.J0;
            wb0Var.d(kl0Var);
        }
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13) {
        int i11;
        float f10;
        float f11;
        float f12;
        ti tiVar = this.f42862e;
        RadialProgressView radialProgressView = tiVar.A3;
        n6 n6Var = tiVar.C3;
        li liVar = tiVar.f40029w2;
        ki.t3 t3Var = this.f42860b;
        if (liVar == t3Var) {
            if (t3Var.Q || this.f42861c != null) {
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
                if (tiVar.B3 != z10) {
                    tiVar.B3 = z10;
                    ValueAnimator valueAnimator = this.f42859a;
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
                    this.f42859a = duration;
                    duration.addUpdateListener(new w(this, 10));
                    this.f42859a.addListener(new sh(this, z10, 0));
                    this.f42859a.start();
                }
                radialProgressView.setProgressColor(i10);
                if (tiVar.f40042z3 != z12) {
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
                    scaleX.scaleY(f14).setDuration(250L).setListener(new sh(this, z12, 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        li liVar = this.f42862e.f40029w2;
        ki.t3 t3Var = this.f42860b;
        if (liVar == t3Var && !t3Var.K.f18992c) {
            t3Var.J();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i7;
        org.telegram.ui.ActionBar.y0 y0Var = this.f42860b.M;
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
        ti tiVar = this.f42862e;
        final int i12 = tiVar.E4.f59123b;
        final ki.p1 p1Var = new ki.p1();
        int i13 = 0;
        if (tiVar.V1) {
            i11 = i12;
        } else {
            i11 = 0;
        }
        p1Var.c(p1Var.f18926a, i11, tiVar.J0);
        tiVar.V1 = z10;
        if (z10) {
            i13 = i10;
        }
        p1Var.c(p1Var.f18927b, i13, tiVar.J0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(kr.f36858f);
        final ki.t3 t3Var = this.f42860b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f10 = i0.a.f(floatValue, i12, i10);
                ti tiVar2 = zh.this.f42862e;
                tiVar2.f39989l4 = f10;
                tiVar2.f39986k4 = true;
                u7 u7Var = tiVar2.V2;
                if (u7Var != null) {
                    u7Var.updateColors();
                    u7Var.invalidate();
                }
                tiVar2.E4.a(f10);
                lh.f fVar = tiVar2.f40018t3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                t3Var.setCustomActionBarBackground(f10);
                tiVar2.f40029w2.invalidate();
                tiVar2.f40002p3.invalidate();
                p1Var.b(u7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        ti tiVar = this.f42862e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.g2 g2Var = tiVar.f39956a2;
            if (g2Var instanceof org.telegram.ui.bn) {
                org.telegram.ui.rj rjVar = ((org.telegram.ui.bn) g2Var).f46118a0;
                rjVar.setFieldText("@" + org.telegram.messenger.n10.o(user) + " " + str);
            }
            tiVar.a(true);
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
        org.telegram.ui.bx bxVar = new org.telegram.ui.bx(bundle);
        wb0 wb0Var = new wb0(tiVar.getContext());
        bxVar.E2 = new a1.d(this, user, str, wb0Var, 10);
        wb0Var.show();
        wb0Var.d(bxVar);
    }

    @Override
    public final void y(boolean z10) {
        this.f42860b.setAllowSwipes(z10);
    }

    @Override
    public final void z() {
        ti tiVar = this.f42862e;
        if (tiVar.f40029w2 != this.f42860b) {
            return;
        }
        tiVar.A0(false);
        tiVar.getWindow().setSoftInputMode(48);
        tiVar.dismiss();
        org.telegram.messenger.g0.h3(new ne(2), 150L);
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
