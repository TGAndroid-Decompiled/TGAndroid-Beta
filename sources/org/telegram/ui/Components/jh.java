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
    public ValueAnimator f34971a;
    public final hi.c4 f34972b;
    public final String f34973c;
    public final long d;
    public final di f34974e;

    public jh(di diVar, hi.c4 c4Var, String str, long j3) {
        this.f34974e = diVar;
        this.f34972b = c4Var;
        this.f34973c = str;
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
        di diVar = this.f34974e;
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
        ImageView backButton = this.f34974e.R2.getBackButton();
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
        this.f34972b.setNeedCloseConfirmation(z9);
    }

    @Override
    public final void m(int i7) {
        this.f34972b.setCustomBackground(i7);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        di diVar = this.f34974e;
        int i7 = diVar.D3;
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        boolean z9 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        hi.c4 c4Var = this.f34972b;
        org.telegram.ui.hl0 hl0Var = null;
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
            hl0Var = new org.telegram.ui.hl0(paymentForm, null, str, f2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            hl0Var = new org.telegram.ui.hl0((TLRPC.PaymentReceipt) tLObject);
        }
        if (hl0Var != null) {
            c4Var.J();
            org.telegram.messenger.g0.v1(c4Var);
            mb0 mb0Var = new mb0(f2Var.getParentActivity());
            mb0Var.show();
            hl0Var.Z0 = new a3.h((Object) mb0Var, (Object) c4Var, str, 25);
            hl0Var.Y0 = diVar.I0;
            mb0Var.c(hl0Var);
        }
    }

    @Override
    public final void q(boolean z9, boolean z10, String str, long j3, int i7, int i10, boolean z11, boolean z12) {
        int i11;
        float f10;
        float f11;
        float f12;
        di diVar = this.f34974e;
        RadialProgressView radialProgressView = diVar.f32959w3;
        j6 j6Var = diVar.f32967y3;
        vh vhVar = diVar.f32942s2;
        hi.c4 c4Var = this.f34972b;
        if (vhVar == c4Var) {
            if (c4Var.P || this.f34973c != null) {
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
                j6Var.setBackground(org.telegram.ui.ActionBar.k6.i0(i7, i11));
                float f13 = 0.0f;
                float f14 = 1.0f;
                if (diVar.f32963x3 != z9) {
                    diVar.f32963x3 = z9;
                    ValueAnimator valueAnimator = this.f34971a;
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
                    this.f34971a = duration;
                    duration.addUpdateListener(new e6(this, 9));
                    this.f34971a.addListener(new ch(this, z9, 0));
                    this.f34971a.start();
                }
                radialProgressView.setProgressColor(i10);
                if (diVar.f32955v3 != z11) {
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
        vh vhVar = this.f34974e.f32942s2;
        hi.c4 c4Var = this.f34972b;
        if (vhVar == c4Var && !c4Var.J.f14563c) {
            c4Var.J();
        }
    }

    @Override
    public final void t(boolean z9) {
        int i7;
        org.telegram.ui.ActionBar.z0 z0Var = this.f34972b.L;
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
        di diVar = this.f34974e;
        final int i12 = diVar.A4.f54447b;
        final hi.t1 t1Var = new hi.t1();
        int i13 = 0;
        if (diVar.R1) {
            i11 = i12;
        } else {
            i11 = 0;
        }
        t1Var.c(t1Var.f14955a, i11, diVar.I0);
        diVar.R1 = z9;
        if (z9) {
            i13 = i10;
        }
        t1Var.c(t1Var.f14956b, i13, diVar.I0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(xq.f40310f);
        final hi.c4 c4Var = this.f34972b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f10 = i0.a.f(floatValue, i12, i10);
                di diVar2 = jh.this.f34974e;
                diVar2.f32904h4 = f10;
                diVar2.f32901g4 = true;
                r7 r7Var = diVar2.R2;
                if (r7Var != null) {
                    r7Var.updateColors();
                    r7Var.invalidate();
                }
                diVar2.A4.a(f10);
                lh.f fVar = diVar2.f32931p3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                c4Var.setCustomActionBarBackground(f10);
                diVar2.f32942s2.invalidate();
                diVar2.f32917l3.invalidate();
                t1Var.b(r7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        di diVar = this.f34974e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
            if (f2Var instanceof org.telegram.ui.an) {
                org.telegram.ui.qj qjVar = ((org.telegram.ui.an) f2Var).Z;
                qjVar.setFieldText("@" + org.telegram.messenger.t10.n(user) + " " + str);
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
        org.telegram.ui.ww wwVar = new org.telegram.ui.ww(bundle);
        mb0 mb0Var = new mb0(diVar.getContext());
        wwVar.C2 = new a1.d(this, user, str, mb0Var, 10);
        mb0Var.show();
        mb0Var.c(wwVar);
    }

    @Override
    public final void y(boolean z9) {
        this.f34972b.setAllowSwipes(z9);
    }

    @Override
    public final void z() {
        di diVar = this.f34974e;
        if (diVar.f32942s2 != this.f34972b) {
            return;
        }
        diVar.A0(false);
        diVar.getWindow().setSoftInputMode(48);
        diVar.dismiss();
        org.telegram.messenger.g0.i3(new org.telegram.messenger.pd(24), 150L);
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
