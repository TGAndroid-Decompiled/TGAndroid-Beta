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
public final class gi implements org.telegram.ui.web.g0 {
    public ValueAnimator f26436a;
    public final ei.p4 f26437b;
    public final String f26438c;
    public final long d;
    public final aj f26439e;

    public gi(aj ajVar, ei.p4 p4Var, String str, long j3) {
        this.f26439e = ajVar;
        this.f26437b = p4Var;
        this.f26438c = str;
        this.d = j3;
    }

    @Override
    public final void b() {
        y();
    }

    @Override
    public final String g(boolean z10, boolean z11) {
        return "UNSUPPORTED";
    }

    @Override
    public final boolean h() {
        aj ajVar = this.f26439e;
        MediaDataController mediaDataController = MediaDataController.getInstance(ajVar.M1);
        long j3 = this.d;
        if (!mediaDataController.botInAttachMenu(j3) && !MessagesController.getInstance(ajVar.M1).whitelistedBots.contains(Long.valueOf(j3))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z10) {
        int i10;
        ImageView backButton = this.f26439e.f24325a1.getBackButton();
        if (z10) {
            i10 = R.drawable.ic_ab_back;
        } else {
            i10 = R.drawable.ic_close_white;
        }
        AndroidUtilities.updateImageViewImageAnimated(backButton, i10);
    }

    @Override
    public final void j() {
        y();
    }

    @Override
    public final void k(boolean z10) {
        this.f26437b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i10) {
        this.f26437b.setCustomBackground(i10);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.c6 c6Var;
        aj ajVar = this.f26439e;
        int i10 = ajVar.M1;
        org.telegram.ui.ActionBar.m2 m2Var = ajVar.f24342f0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ei.p4 p4Var = this.f26437b;
        org.telegram.ui.xo0 xo0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(ajVar.getContext(), 3, null);
            a2Var.q(150L);
            yh.n5.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new c2(a2Var, 1), new org.telegram.ui.tc(18, p4Var, str));
            AndroidUtilities.hideKeyboard(p4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            xo0Var = new org.telegram.ui.xo0(paymentForm, null, str, m2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            xo0Var = new org.telegram.ui.xo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (xo0Var != null) {
            p4Var.J();
            AndroidUtilities.hideKeyboard(p4Var);
            Activity parentActivity = m2Var.getParentActivity();
            int i11 = aj.R2;
            ee0 ee0Var = new ee0(parentActivity);
            ee0Var.show();
            xo0Var.Z0 = new ai.r5(ee0Var, p4Var, str, 24);
            c6Var = ((org.telegram.ui.ActionBar.e3) ajVar).resourcesProvider;
            xo0Var.Y0 = c6Var;
            ee0Var.c(xo0Var);
        }
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13) {
        int i12;
        float f7;
        float f10;
        float f11;
        aj ajVar = this.f26439e;
        RadialProgressView radialProgressView = ajVar.F1;
        r6 r6Var = ajVar.H1;
        si siVar = ajVar.B0;
        ei.p4 p4Var = this.f26437b;
        if (siVar == p4Var) {
            if (p4Var.P || this.f26438c != null) {
                r6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j3 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new b6(j3, 1.4f, r6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    r6Var.setText(spannableStringBuilder);
                } else {
                    r6Var.setText(str);
                }
                r6Var.setTextColor(i11);
                r6Var.setEmojiColor(i11);
                boolean z14 = org.telegram.ui.web.b1.P0;
                if (i0.a.f(i10) >= 0.30000001192092896d) {
                    i12 = 301989888;
                } else {
                    i12 = 385875967;
                }
                r6Var.setBackground(org.telegram.ui.ActionBar.h6.h0(i10, i12));
                float f12 = 0.0f;
                float f13 = 1.0f;
                if (ajVar.G1 != z10) {
                    ajVar.G1 = z10;
                    ValueAnimator valueAnimator = this.f26436a;
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
                    this.f26436a = duration;
                    duration.addUpdateListener(new m6(this, 9));
                    this.f26436a.addListener(new yh(this, z10, 0));
                    this.f26436a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (ajVar.E1 != z12) {
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
                    scaleX.scaleY(f13).setDuration(250L).setListener(new yh(this, z12, 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        si siVar = this.f26439e.B0;
        ei.p4 p4Var = this.f26437b;
        if (siVar == p4Var && !p4Var.J.f9258c) {
            p4Var.J();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.e1 e1Var = this.f26437b.L;
        if (e1Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            e1Var.setVisibility(i10);
        }
    }

    @Override
    public final void u(int i10, final int i11, boolean z10) {
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        aj ajVar = this.f26439e;
        final int color = ajVar.I2.f9931a.getColor();
        final ei.c2 c2Var = new ei.c2();
        int i13 = 0;
        if (ajVar.f24324a0) {
            i12 = color;
        } else {
            i12 = 0;
        }
        c6Var = ((org.telegram.ui.ActionBar.e3) ajVar).resourcesProvider;
        c2Var.c(c2Var.f8989a, i12, c6Var);
        ajVar.f24324a0 = z10;
        if (z10) {
            i13 = i11;
        }
        c6Var2 = ((org.telegram.ui.ActionBar.e3) ajVar).resourcesProvider;
        c2Var.c(c2Var.f8990b, i13, c6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(js.f27627f);
        final ei.p4 p4Var = this.f26437b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i11);
                aj ajVar2 = gi.this.f26439e;
                ajVar2.f24376q2 = d;
                ajVar2.f24373p2 = true;
                a8 a8Var = ajVar2.f24325a1;
                if (a8Var != null) {
                    a8Var.e();
                    a8Var.invalidate();
                }
                ajVar2.I2.a(d);
                jh.f fVar = ajVar2.f24404y1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                p4Var.setCustomActionBarBackground(d);
                ajVar2.B0.invalidate();
                ajVar2.f24389u1.invalidate();
                c2Var.b(a8Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        aj ajVar = this.f26439e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.m2 m2Var = ajVar.f24342f0;
            if (m2Var instanceof org.telegram.ui.eo) {
                org.telegram.ui.sk skVar = ((org.telegram.ui.eo) m2Var).Y;
                skVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
            }
            ajVar.dismiss(true);
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
        org.telegram.ui.vy vyVar = new org.telegram.ui.vy(bundle);
        Context context = ajVar.getContext();
        int i10 = aj.R2;
        ee0 ee0Var = new ee0(context);
        vyVar.C2 = new a1.d(this, user, str, ee0Var, 7);
        ee0Var.show();
        ee0Var.c(vyVar);
    }

    @Override
    public final void x(boolean z10) {
        this.f26437b.setAllowSwipes(z10);
    }

    @Override
    public final void y() {
        aj ajVar = this.f26439e;
        if (ajVar.B0 != this.f26437b) {
            return;
        }
        ajVar.setFocusable(false);
        ajVar.getWindow().setSoftInputMode(48);
        ajVar.dismiss();
        AndroidUtilities.runOnUIThread(new xh(0), 150L);
    }

    @Override
    public final ei.a1 z() {
        return null;
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
    public final void o(int i10, boolean z10) {
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
