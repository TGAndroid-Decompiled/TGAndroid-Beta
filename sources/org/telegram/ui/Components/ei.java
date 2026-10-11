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
public final class ei implements org.telegram.ui.web.g0 {
    public ValueAnimator f26012a;
    public final ei.p4 f26013b;
    public final String f26014c;
    public final long d;
    public final yi f26015e;

    public ei(yi yiVar, ei.p4 p4Var, String str, long j3) {
        this.f26015e = yiVar;
        this.f26013b = p4Var;
        this.f26014c = str;
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
        yi yiVar = this.f26015e;
        MediaDataController mediaDataController = MediaDataController.getInstance(yiVar.M1);
        long j3 = this.d;
        if (!mediaDataController.botInAttachMenu(j3) && !MessagesController.getInstance(yiVar.M1).whitelistedBots.contains(Long.valueOf(j3))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z10) {
        int i10;
        ImageView backButton = this.f26015e.f33199a1.getBackButton();
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
        this.f26013b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i10) {
        this.f26013b.setCustomBackground(i10);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.d6 d6Var;
        yi yiVar = this.f26015e;
        int i10 = yiVar.M1;
        org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33216f0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ei.p4 p4Var = this.f26013b;
        org.telegram.ui.uo0 uo0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(yiVar.getContext(), 3, null);
            a2Var.q(150L);
            yh.n5.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new c2(a2Var, 1), new org.telegram.ui.oc(18, p4Var, str));
            AndroidUtilities.hideKeyboard(p4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            uo0Var = new org.telegram.ui.uo0(paymentForm, null, str, m2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            uo0Var = new org.telegram.ui.uo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (uo0Var != null) {
            p4Var.J();
            AndroidUtilities.hideKeyboard(p4Var);
            Activity parentActivity = m2Var.getParentActivity();
            int i11 = yi.R2;
            ce0 ce0Var = new ce0(parentActivity);
            ce0Var.show();
            uo0Var.Z0 = new ai.r5(ce0Var, p4Var, str, 24);
            d6Var = ((org.telegram.ui.ActionBar.e3) yiVar).resourcesProvider;
            uo0Var.Y0 = d6Var;
            ce0Var.c(uo0Var);
        }
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13) {
        int i12;
        float f7;
        float f10;
        float f11;
        yi yiVar = this.f26015e;
        RadialProgressView radialProgressView = yiVar.F1;
        r6 r6Var = yiVar.H1;
        qi qiVar = yiVar.B0;
        ei.p4 p4Var = this.f26013b;
        if (qiVar == p4Var) {
            if (p4Var.P || this.f26014c != null) {
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
                if (yiVar.G1 != z10) {
                    yiVar.G1 = z10;
                    ValueAnimator valueAnimator = this.f26012a;
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
                    this.f26012a = duration;
                    duration.addUpdateListener(new m6(this, 9));
                    this.f26012a.addListener(new wh(this, z10, 0));
                    this.f26012a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (yiVar.E1 != z12) {
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
                    scaleX.scaleY(f13).setDuration(250L).setListener(new wh(this, z12, 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        qi qiVar = this.f26015e.B0;
        ei.p4 p4Var = this.f26013b;
        if (qiVar == p4Var && !p4Var.J.f9260c) {
            p4Var.J();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.e1 e1Var = this.f26013b.L;
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
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        yi yiVar = this.f26015e;
        final int color = yiVar.I2.f9932a.getColor();
        final ei.c2 c2Var = new ei.c2();
        int i13 = 0;
        if (yiVar.f33198a0) {
            i12 = color;
        } else {
            i12 = 0;
        }
        d6Var = ((org.telegram.ui.ActionBar.e3) yiVar).resourcesProvider;
        c2Var.c(c2Var.f8991a, i12, d6Var);
        yiVar.f33198a0 = z10;
        if (z10) {
            i13 = i11;
        }
        d6Var2 = ((org.telegram.ui.ActionBar.e3) yiVar).resourcesProvider;
        c2Var.c(c2Var.f8992b, i13, d6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(is.f27451f);
        final ei.p4 p4Var = this.f26013b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i11);
                yi yiVar2 = ei.this.f26015e;
                yiVar2.f33250q2 = d;
                yiVar2.f33247p2 = true;
                a8 a8Var = yiVar2.f33199a1;
                if (a8Var != null) {
                    a8Var.e();
                    a8Var.invalidate();
                }
                yiVar2.I2.a(d);
                jh.f fVar = yiVar2.f33278y1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                p4Var.setCustomActionBarBackground(d);
                yiVar2.B0.invalidate();
                yiVar2.f33263u1.invalidate();
                c2Var.b(a8Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        yi yiVar = this.f26015e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33216f0;
            if (m2Var instanceof org.telegram.ui.zn) {
                org.telegram.ui.ok okVar = ((org.telegram.ui.zn) m2Var).Y;
                okVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
            }
            yiVar.dismiss(true);
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
        org.telegram.ui.sy syVar = new org.telegram.ui.sy(bundle);
        Context context = yiVar.getContext();
        int i10 = yi.R2;
        ce0 ce0Var = new ce0(context);
        syVar.C2 = new a1.d(this, user, str, ce0Var, 7);
        ce0Var.show();
        ce0Var.c(syVar);
    }

    @Override
    public final void x(boolean z10) {
        this.f26013b.setAllowSwipes(z10);
    }

    @Override
    public final void y() {
        yi yiVar = this.f26015e;
        if (yiVar.B0 != this.f26013b) {
            return;
        }
        yiVar.setFocusable(false);
        yiVar.getWindow().setSoftInputMode(48);
        yiVar.dismiss();
        AndroidUtilities.runOnUIThread(new vh(0), 150L);
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
