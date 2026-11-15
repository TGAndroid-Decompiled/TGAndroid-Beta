package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qh implements org.telegram.ui.web.c0 {
    public ValueAnimator f38652a;
    public final ki.y3 f38653b;
    public final String f38654c;
    public final long d;
    public final ki f38655e;

    public qh(ki kiVar, ki.y3 y3Var, String str, long j3) {
        this.f38655e = kiVar;
        this.f38653b = y3Var;
        this.f38654c = str;
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
        ki kiVar = this.f38655e;
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(kiVar.H3);
        long j3 = this.d;
        if (!b02.j(j3) && !org.telegram.messenger.np.s1(kiVar.H3).X6.contains(Long.valueOf(j3))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z10) {
        int i7;
        ImageView backButton = this.f38655e.V2.getBackButton();
        if (z10) {
            i7 = 2131231240;
        } else {
            i7 = 2131231269;
        }
        org.telegram.messenger.g0.Q3(backButton, i7);
    }

    @Override
    public final void j() {
        z();
    }

    @Override
    public final void k(boolean z10) {
        this.f38653b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i7) {
        this.f38653b.setCustomBackground(i7);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        ki kiVar = this.f38655e;
        int i7 = kiVar.H3;
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36436a2;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ki.y3 y3Var = this.f38653b;
        org.telegram.ui.jl0 jl0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, kiVar.getContext(), null);
            t1Var.r(150L);
            di.v8.y(i7, false).X(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new y1(t1Var, 1), new gh(0, y3Var, str));
            org.telegram.messenger.g0.v1(y3Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            org.telegram.messenger.np.s1(i7).Y3(paymentForm.users, false);
            jl0Var = new org.telegram.ui.jl0(paymentForm, null, str, e2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            jl0Var = new org.telegram.ui.jl0((TLRPC.PaymentReceipt) tLObject);
        }
        if (jl0Var != null) {
            y3Var.K();
            org.telegram.messenger.g0.v1(y3Var);
            nb0 nb0Var = new nb0(e2Var.getParentActivity());
            nb0Var.show();
            jl0Var.f48384a1 = new a3.h((Object) nb0Var, (Object) y3Var, str, 26);
            jl0Var.Z0 = kiVar.J0;
            nb0Var.c(jl0Var);
        }
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13) {
        int i11;
        float f10;
        float f11;
        float f12;
        ki kiVar = this.f38655e;
        RadialProgressView radialProgressView = kiVar.A3;
        h6 h6Var = kiVar.C3;
        ci ciVar = kiVar.f36509w2;
        ki.y3 y3Var = this.f38653b;
        if (ciVar == y3Var) {
            if (y3Var.Q || this.f38654c != null) {
                h6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j3 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new p5(j3, 1.4f, h6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    h6Var.setText(spannableStringBuilder);
                } else {
                    h6Var.setText(str);
                }
                h6Var.setTextColor(i10);
                h6Var.setEmojiColor(i10);
                boolean z14 = org.telegram.ui.web.v0.R0;
                if (i0.a.h(i7) >= 0.30000001192092896d) {
                    i11 = 301989888;
                } else {
                    i11 = 385875967;
                }
                h6Var.setBackground(org.telegram.ui.ActionBar.j6.i0(i7, i11));
                float f13 = 0.0f;
                float f14 = 1.0f;
                if (kiVar.B3 != z10) {
                    kiVar.B3 = z10;
                    ValueAnimator valueAnimator = this.f38652a;
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
                    this.f38652a = duration;
                    duration.addUpdateListener(new c6(this, 9));
                    this.f38652a.addListener(new jh(this, z10, 0));
                    this.f38652a.start();
                }
                radialProgressView.setProgressColor(i10);
                if (kiVar.f36522z3 != z12) {
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
                    scaleX.scaleY(f14).setDuration(250L).setListener(new jh(this, z12, 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        ci ciVar = this.f38655e.f36509w2;
        ki.y3 y3Var = this.f38653b;
        if (ciVar == y3Var && !y3Var.K.f18693c) {
            y3Var.K();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i7;
        org.telegram.ui.ActionBar.z0 z0Var = this.f38653b.M;
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
        ki kiVar = this.f38655e;
        final int i12 = kiVar.E4.f58431b;
        final ki.u1 u1Var = new ki.u1();
        int i13 = 0;
        if (kiVar.V1) {
            i11 = i12;
        } else {
            i11 = 0;
        }
        u1Var.c(u1Var.f18583a, i11, kiVar.J0);
        kiVar.V1 = z10;
        if (z10) {
            i13 = i10;
        }
        u1Var.c(u1Var.f18584b, i13, kiVar.J0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(er.f34420f);
        final ki.y3 y3Var = this.f38653b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f10 = i0.a.f(floatValue, i12, i10);
                ki kiVar2 = qh.this.f38655e;
                kiVar2.f36469l4 = f10;
                kiVar2.f36466k4 = true;
                o7 o7Var = kiVar2.V2;
                if (o7Var != null) {
                    o7Var.updateColors();
                    o7Var.invalidate();
                }
                kiVar2.E4.a(f10);
                lh.f fVar = kiVar2.f36498t3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                y3Var.setCustomActionBarBackground(f10);
                kiVar2.f36509w2.invalidate();
                kiVar2.f36482p3.invalidate();
                u1Var.b(o7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        ki kiVar = this.f38655e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36436a2;
            if (e2Var instanceof org.telegram.ui.an) {
                org.telegram.ui.qj qjVar = ((org.telegram.ui.an) e2Var).f45118a0;
                qjVar.setFieldText("@" + org.telegram.messenger.q10.n(user) + " " + str);
            }
            kiVar.a(true);
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
        org.telegram.ui.yw ywVar = new org.telegram.ui.yw(bundle);
        nb0 nb0Var = new nb0(kiVar.getContext());
        ywVar.E2 = new a1.d(this, user, str, nb0Var, 10);
        nb0Var.show();
        nb0Var.c(ywVar);
    }

    @Override
    public final void y(boolean z10) {
        this.f38653b.setAllowSwipes(z10);
    }

    @Override
    public final void z() {
        ki kiVar = this.f38655e;
        if (kiVar.f36509w2 != this.f38653b) {
            return;
        }
        kiVar.A0(false);
        kiVar.getWindow().setSoftInputMode(48);
        kiVar.dismiss();
        org.telegram.messenger.g0.i3(new ih(0), 150L);
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
