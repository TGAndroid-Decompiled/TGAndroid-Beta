package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jh implements org.telegram.ui.web.d0 {
    public ValueAnimator f35018a;
    public final hi.c4 f35019b;
    public final String f35020c;
    public final long d;
    public final di f35021e;

    public jh(di diVar, hi.c4 c4Var, String str, long j3) {
        this.f35021e = diVar;
        this.f35019b = c4Var;
        this.f35020c = str;
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
        di diVar = this.f35021e;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(diVar.D3);
        long j3 = this.d;
        if (!b02.j(j3) && !org.telegram.messenger.qp.s1(diVar.D3).W6.contains(Long.valueOf(j3))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z9) {
        int i7;
        ImageView backButton = this.f35021e.R2.getBackButton();
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
        this.f35019b.setNeedCloseConfirmation(z9);
    }

    @Override
    public final void m(int i7) {
        this.f35019b.setCustomBackground(i7);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        di diVar = this.f35021e;
        int i7 = diVar.D3;
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        boolean z9 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        hi.c4 c4Var = this.f35019b;
        org.telegram.ui.jl0 jl0Var = null;
        if (z9) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, diVar.getContext(), null);
            u1Var.r(150L);
            bi.ea.y(i7, false).X(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new a2(u1Var, 1), new org.telegram.messenger.voip.k(25, c4Var, str));
            org.telegram.messenger.g0.v1(c4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            org.telegram.messenger.qp.s1(i7).Y3(paymentForm.users, false);
            jl0Var = new org.telegram.ui.jl0(paymentForm, null, str, f2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            jl0Var = new org.telegram.ui.jl0((TLRPC.PaymentReceipt) tLObject);
        }
        if (jl0Var != null) {
            c4Var.J();
            org.telegram.messenger.g0.v1(c4Var);
            nb0 nb0Var = new nb0(f2Var.getParentActivity());
            nb0Var.show();
            jl0Var.Z0 = new a3.h((Object) nb0Var, (Object) c4Var, str, 25);
            jl0Var.Y0 = diVar.I0;
            nb0Var.c(jl0Var);
        }
    }

    @Override
    public final void q(boolean z9, boolean z10, String str, long j3, int i7, int i10, boolean z11, boolean z12) {
        int i11;
        float f10;
        float f11;
        float f12;
        di diVar = this.f35021e;
        RadialProgressView radialProgressView = diVar.f33064w3;
        j6 j6Var = diVar.f33072y3;
        vh vhVar = diVar.f33047s2;
        hi.c4 c4Var = this.f35019b;
        if (vhVar == c4Var) {
            if (c4Var.P || this.f35020c != null) {
                j6Var.setClickable(z10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j3 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new r5(j3, 1.4f, j6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    j6Var.setText(spannableStringBuilder);
                } else {
                    j6Var.setText(str);
                }
                j6Var.setTextColor(i10);
                j6Var.setEmojiColor(i10);
                boolean z13 = org.telegram.ui.web.x0.Q0;
                if (i0.a.h(i7) >= 0.30000001192092896d) {
                    i11 = 301989888;
                } else {
                    i11 = 385875967;
                }
                j6Var.setBackground(org.telegram.ui.ActionBar.l6.i0(i7, i11));
                float f13 = 0.0f;
                float f14 = 1.0f;
                if (diVar.f33068x3 != z9) {
                    diVar.f33068x3 = z9;
                    ValueAnimator valueAnimator = this.f35018a;
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
                    this.f35018a = duration;
                    duration.addUpdateListener(new e6(this, 9));
                    this.f35018a.addListener(new ch(this, z9, 0));
                    this.f35018a.start();
                }
                radialProgressView.setProgressColor(i10);
                if (diVar.f33060v3 != z11) {
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
                    scaleX.scaleY(f14).setDuration(250L).setListener(new ch(this, z11, 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        vh vhVar = this.f35021e.f33047s2;
        hi.c4 c4Var = this.f35019b;
        if (vhVar == c4Var && !c4Var.J.f14563c) {
            c4Var.J();
        }
    }

    @Override
    public final void t(boolean z9) {
        int i7;
        org.telegram.ui.ActionBar.z0 z0Var = this.f35019b.L;
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
        di diVar = this.f35021e;
        final int i12 = diVar.A4.f54576b;
        final hi.t1 t1Var = new hi.t1();
        int i13 = 0;
        if (diVar.R1) {
            i11 = i12;
        } else {
            i11 = 0;
        }
        t1Var.c(t1Var.f14958a, i11, diVar.I0);
        diVar.R1 = z9;
        if (z9) {
            i13 = i10;
        }
        t1Var.c(t1Var.f14959b, i13, diVar.I0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(xq.f40458f);
        final hi.c4 c4Var = this.f35019b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f10 = i0.a.f(floatValue, i12, i10);
                di diVar2 = jh.this.f35021e;
                diVar2.f33009h4 = f10;
                diVar2.f33006g4 = true;
                r7 r7Var = diVar2.R2;
                if (r7Var != null) {
                    r7Var.updateColors();
                    r7Var.invalidate();
                }
                diVar2.A4.a(f10);
                lh.f fVar = diVar2.f33036p3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                c4Var.setCustomActionBarBackground(f10);
                diVar2.f33047s2.invalidate();
                diVar2.f33022l3.invalidate();
                t1Var.b(r7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        di diVar = this.f35021e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
            if (f2Var instanceof org.telegram.ui.cn) {
                org.telegram.ui.sj sjVar = ((org.telegram.ui.cn) f2Var).Z;
                sjVar.setFieldText("@" + org.telegram.messenger.t10.n(user) + " " + str);
            }
            diVar.a(true);
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
        nb0 nb0Var = new nb0(diVar.getContext());
        ywVar.D2 = new a1.d(this, user, str, nb0Var, 10);
        nb0Var.show();
        nb0Var.c(ywVar);
    }

    @Override
    public final void y(boolean z9) {
        this.f35019b.setAllowSwipes(z9);
    }

    @Override
    public final void z() {
        di diVar = this.f35021e;
        if (diVar.f33047s2 != this.f35019b) {
            return;
        }
        diVar.A0(false);
        diVar.getWindow().setSoftInputMode(48);
        diVar.dismiss();
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
