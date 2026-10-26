package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zh implements org.telegram.ui.web.g0 {
    public ValueAnimator f35329a;
    public final hi.o4 f35330b;
    public final String f35331c;
    public final long d;
    public final ti e;

    public zh(ti tiVar, hi.o4 o4Var, String str, long j10) {
        this.e = tiVar;
        this.f35330b = o4Var;
        this.f35331c = str;
        this.d = j10;
    }

    @Override
    public final hi.f1 A() {
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
        ti tiVar = this.e;
        MediaDataController mediaDataController = MediaDataController.getInstance(tiVar.M1);
        long j10 = this.d;
        if (!mediaDataController.botInAttachMenu(j10) && !MessagesController.getInstance(tiVar.M1).whitelistedBots.contains(Long.valueOf(j10))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z10) {
        int i10;
        ImageView backButton = this.e.f33005a1.getBackButton();
        if (z10) {
            i10 = R.drawable.ic_ab_back;
        } else {
            i10 = R.drawable.ic_close_white;
        }
        AndroidUtilities.updateImageViewImageAnimated(backButton, i10);
    }

    @Override
    public final void j() {
        z();
    }

    @Override
    public final void k(boolean z10) {
        this.f35330b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i10) {
        this.f35330b.setCustomBackground(i10);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.u6 u6Var;
        ti tiVar = this.e;
        int i10 = tiVar.M1;
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f33021f0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        hi.o4 o4Var = this.f35330b;
        org.telegram.ui.po0 po0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(tiVar.getContext(), 3, null);
            e2Var.r(150L);
            bi.ca.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new e2(e2Var, 1), new li.s2(26, o4Var, str));
            AndroidUtilities.hideKeyboard(o4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            po0Var = new org.telegram.ui.po0(paymentForm, null, str, r2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            po0Var = new org.telegram.ui.po0((TLRPC.PaymentReceipt) tLObject);
        }
        if (po0Var != null) {
            o4Var.J();
            AndroidUtilities.hideKeyboard(o4Var);
            Activity parentActivity = r2Var.getParentActivity();
            int i11 = ti.N2;
            sd0 sd0Var = new sd0(parentActivity);
            sd0Var.show();
            po0Var.Z0 = new androidx.car.app.utils.a(sd0Var, o4Var, str, 25);
            u6Var = ((org.telegram.ui.ActionBar.k3) tiVar).resourcesProvider;
            po0Var.Y0 = u6Var;
            sd0Var.c(po0Var);
        }
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
        int i12;
        float f7;
        float f10;
        float f11;
        ti tiVar = this.e;
        RadialProgressView radialProgressView = tiVar.F1;
        s6 s6Var = tiVar.H1;
        li liVar = tiVar.B0;
        hi.o4 o4Var = this.f35330b;
        if (liVar == o4Var) {
            if (o4Var.P || this.f35331c != null) {
                s6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j10 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new c6(j10, 1.4f, s6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    s6Var.setText(spannableStringBuilder);
                } else {
                    s6Var.setText(str);
                }
                s6Var.setTextColor(i11);
                s6Var.setEmojiColor(i11);
                boolean z14 = org.telegram.ui.web.a1.Q0;
                if (i0.a.h(i10) >= 0.30000001192092896d) {
                    i12 = 301989888;
                } else {
                    i12 = 385875967;
                }
                s6Var.setBackground(org.telegram.ui.ActionBar.y6.h0(i10, i12));
                float f12 = 0.0f;
                float f13 = 1.0f;
                if (tiVar.G1 != z10) {
                    tiVar.G1 = z10;
                    ValueAnimator valueAnimator = this.f35329a;
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
                    this.f35329a = duration;
                    duration.addUpdateListener(new n6(this, 10));
                    this.f35329a.addListener(new sh(this, z10, 0));
                    this.f35329a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (tiVar.E1 != z12) {
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
                    scaleX.scaleY(f13).setDuration(250L).setListener(new sh(this, z12, 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        li liVar = this.e.B0;
        hi.o4 o4Var = this.f35330b;
        if (liVar == o4Var && !o4Var.J.f13157c) {
            o4Var.J();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.g1 g1Var = this.f35330b.L;
        if (g1Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            g1Var.setVisibility(i10);
        }
    }

    @Override
    public final void u(int i10, final int i11, boolean z10) {
        int i12;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        ti tiVar = this.e;
        final int i13 = tiVar.J2.f12837b;
        final hi.d2 d2Var = new hi.d2();
        int i14 = 0;
        if (tiVar.f33004a0) {
            i12 = i13;
        } else {
            i12 = 0;
        }
        u6Var = ((org.telegram.ui.ActionBar.k3) tiVar).resourcesProvider;
        d2Var.c(d2Var.f12941a, i12, u6Var);
        tiVar.f33004a0 = z10;
        if (z10) {
            i14 = i11;
        }
        u6Var2 = ((org.telegram.ui.ActionBar.k3) tiVar).resourcesProvider;
        d2Var.c(d2Var.f12942b, i14, u6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(ds.f27586f);
        final hi.o4 o4Var = this.f35330b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f7 = i0.a.f(floatValue, i13, i11);
                ti tiVar2 = zh.this.e;
                tiVar2.f33055q2 = f7;
                tiVar2.f33052p2 = true;
                b8 b8Var = tiVar2.f33005a1;
                if (b8Var != null) {
                    b8Var.updateColors();
                    b8Var.invalidate();
                }
                tiVar2.J2.a(f7);
                lh.f fVar = tiVar2.f33083y1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                o4Var.setCustomActionBarBackground(f7);
                tiVar2.B0.invalidate();
                tiVar2.f33068u1.invalidate();
                d2Var.b(b8Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        ti tiVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.r2 r2Var = tiVar.f33021f0;
            if (r2Var instanceof org.telegram.ui.un) {
                org.telegram.ui.hk hkVar = ((org.telegram.ui.un) r2Var).Y;
                hkVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
            }
            tiVar.dismiss(true);
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
        org.telegram.ui.cy cyVar = new org.telegram.ui.cy(bundle);
        Context context = tiVar.getContext();
        int i10 = ti.N2;
        sd0 sd0Var = new sd0(context);
        cyVar.C2 = new a1.d(this, user, str, sd0Var, 9);
        sd0Var.show();
        sd0Var.c(cyVar);
    }

    @Override
    public final void y(boolean z10) {
        this.f35330b.setAllowSwipes(z10);
    }

    @Override
    public final void z() {
        ti tiVar = this.e;
        if (tiVar.B0 != this.f35330b) {
            return;
        }
        tiVar.setFocusable(false);
        tiVar.getWindow().setSoftInputMode(48);
        tiVar.dismiss();
        AndroidUtilities.runOnUIThread(new k5(7), 150L);
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c() {
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
    public final void o(int i10, boolean z10) {
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
