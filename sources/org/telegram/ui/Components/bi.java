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
public final class bi implements org.telegram.ui.web.h0 {
    public ValueAnimator f23027a;
    public final ei.q4 f23028b;
    public final String f23029c;
    public final long d;
    public final wi e;

    public bi(wi wiVar, ei.q4 q4Var, String str, long j3) {
        this.e = wiVar;
        this.f23028b = q4Var;
        this.f23029c = str;
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
        wi wiVar = this.e;
        MediaDataController mediaDataController = MediaDataController.getInstance(wiVar.J1);
        long j3 = this.d;
        if (!mediaDataController.botInAttachMenu(j3) && !MessagesController.getInstance(wiVar.J1).whitelistedBots.contains(Long.valueOf(j3))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z10) {
        int i10;
        ImageView backButton = this.e.X0.getBackButton();
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
        this.f23028b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i10) {
        this.f23028b.setCustomBackground(i10);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.e6 e6Var;
        wi wiVar = this.e;
        int i10 = wiVar.J1;
        org.telegram.ui.ActionBar.o2 o2Var = wiVar.f29962f0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ei.q4 q4Var = this.f23028b;
        org.telegram.ui.ro0 ro0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(wiVar.getContext(), 3, null);
            c2Var.q(150L);
            yh.s5.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new c2(c2Var, 1), new org.telegram.ui.qc(18, q4Var, str));
            AndroidUtilities.hideKeyboard(q4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            ro0Var = new org.telegram.ui.ro0(paymentForm, null, str, o2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            ro0Var = new org.telegram.ui.ro0((TLRPC.PaymentReceipt) tLObject);
        }
        if (ro0Var != null) {
            q4Var.G();
            AndroidUtilities.hideKeyboard(q4Var);
            Activity parentActivity = o2Var.getParentActivity();
            int i11 = wi.H2;
            kd0 kd0Var = new kd0(parentActivity);
            kd0Var.show();
            ro0Var.Z0 = new ai.q5(kd0Var, q4Var, str, 24);
            e6Var = ((org.telegram.ui.ActionBar.g3) wiVar).resourcesProvider;
            ro0Var.Y0 = e6Var;
            kd0Var.c(ro0Var);
        }
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13) {
        int i12;
        float f7;
        float f10;
        float f11;
        wi wiVar = this.e;
        RadialProgressView radialProgressView = wiVar.C1;
        p6 p6Var = wiVar.E1;
        oi oiVar = wiVar.f30023y0;
        ei.q4 q4Var = this.f23028b;
        if (oiVar == q4Var) {
            if (q4Var.P || this.f23029c != null) {
                p6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j3 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new z5(j3, 1.4f, p6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    p6Var.setText(spannableStringBuilder);
                } else {
                    p6Var.setText(str);
                }
                p6Var.setTextColor(i11);
                p6Var.setEmojiColor(i11);
                boolean z14 = org.telegram.ui.web.c1.P0;
                if (i0.a.f(i10) >= 0.30000001192092896d) {
                    i12 = 301989888;
                } else {
                    i12 = 385875967;
                }
                p6Var.setBackground(org.telegram.ui.ActionBar.i6.g0(i10, i12));
                float f12 = 0.0f;
                float f13 = 1.0f;
                if (wiVar.D1 != z10) {
                    wiVar.D1 = z10;
                    ValueAnimator valueAnimator = this.f23027a;
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
                    this.f23027a = duration;
                    duration.addUpdateListener(new k6(this, 9));
                    this.f23027a.addListener(new uh(this, z10, 0));
                    this.f23027a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (wiVar.B1 != z12) {
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
                    scaleX.scaleY(f13).setDuration(250L).setListener(new uh(this, z12, 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        oi oiVar = this.e.f30023y0;
        ei.q4 q4Var = this.f23028b;
        if (oiVar == q4Var && !q4Var.J.f8535c) {
            q4Var.G();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.g1 g1Var = this.f23028b.L;
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
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        wi wiVar = this.e;
        final int color = wiVar.D2.f9058a.getColor();
        final ei.c2 c2Var = new ei.c2();
        int i13 = 0;
        if (wiVar.f29945a0) {
            i12 = color;
        } else {
            i12 = 0;
        }
        e6Var = ((org.telegram.ui.ActionBar.g3) wiVar).resourcesProvider;
        c2Var.c(c2Var.f8266a, i12, e6Var);
        wiVar.f29945a0 = z10;
        if (z10) {
            i13 = i11;
        }
        e6Var2 = ((org.telegram.ui.ActionBar.g3) wiVar).resourcesProvider;
        c2Var.c(c2Var.f8267b, i13, e6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(sr.f28359f);
        final ei.q4 q4Var = this.f23028b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i11);
                wi wiVar2 = bi.this.e;
                wiVar2.f29987n2 = d;
                wiVar2.f29983m2 = true;
                y7 y7Var = wiVar2.X0;
                if (y7Var != null) {
                    y7Var.e();
                    y7Var.invalidate();
                }
                wiVar2.D2.a(d);
                jh.f fVar = wiVar2.f30012v1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                q4Var.setCustomActionBarBackground(d);
                wiVar2.f30023y0.invalidate();
                wiVar2.f29999r1.invalidate();
                c2Var.b(y7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        wi wiVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.o2 o2Var = wiVar.f29962f0;
            if (o2Var instanceof org.telegram.ui.xn) {
                org.telegram.ui.lk lkVar = ((org.telegram.ui.xn) o2Var).Y;
                lkVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
            }
            wiVar.dismiss(true);
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
        org.telegram.ui.ty tyVar = new org.telegram.ui.ty(bundle);
        Context context = wiVar.getContext();
        int i10 = wi.H2;
        kd0 kd0Var = new kd0(context);
        tyVar.C2 = new a1.d(this, user, str, kd0Var, 7);
        kd0Var.show();
        kd0Var.c(tyVar);
    }

    @Override
    public final void x(boolean z10) {
        this.f23028b.setAllowSwipes(z10);
    }

    @Override
    public final void y() {
        wi wiVar = this.e;
        if (wiVar.f30023y0 != this.f23028b) {
            return;
        }
        wiVar.setFocusable(false);
        wiVar.getWindow().setSoftInputMode(48);
        wiVar.dismiss();
        AndroidUtilities.runOnUIThread(new th(0), 150L);
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
