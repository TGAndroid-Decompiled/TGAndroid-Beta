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
public final class ci implements org.telegram.ui.web.g0 {
    public ValueAnimator f23039a;
    public final ei.q4 f23040b;
    public final String f23041c;
    public final long d;
    public final wi e;

    public ci(wi wiVar, ei.q4 q4Var, String str, long j3) {
        this.e = wiVar;
        this.f23040b = q4Var;
        this.f23041c = str;
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
        this.f23040b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i10) {
        this.f23040b.setCustomBackground(i10);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.d6 d6Var;
        wi wiVar = this.e;
        int i10 = wiVar.J1;
        org.telegram.ui.ActionBar.n2 n2Var = wiVar.f29665f0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ei.q4 q4Var = this.f23040b;
        org.telegram.ui.qo0 qo0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(wiVar.getContext(), 3, null);
            b2Var.q(150L);
            yh.t5.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new c2(b2Var, 1), new org.telegram.ui.oc(18, q4Var, str));
            AndroidUtilities.hideKeyboard(q4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            qo0Var = new org.telegram.ui.qo0(paymentForm, null, str, n2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            qo0Var = new org.telegram.ui.qo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (qo0Var != null) {
            q4Var.G();
            AndroidUtilities.hideKeyboard(q4Var);
            Activity parentActivity = n2Var.getParentActivity();
            int i11 = wi.O2;
            zc0 zc0Var = new zc0(parentActivity);
            zc0Var.show();
            qo0Var.Z0 = new ai.q5(zc0Var, q4Var, str, 24);
            d6Var = ((org.telegram.ui.ActionBar.f3) wiVar).resourcesProvider;
            qo0Var.Y0 = d6Var;
            zc0Var.c(qo0Var);
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
        oi oiVar = wiVar.f29726y0;
        ei.q4 q4Var = this.f23040b;
        if (oiVar == q4Var) {
            if (q4Var.P || this.f23041c != null) {
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
                boolean z14 = org.telegram.ui.web.b1.P0;
                if (i0.a.f(i10) >= 0.30000001192092896d) {
                    i12 = 301989888;
                } else {
                    i12 = 385875967;
                }
                p6Var.setBackground(org.telegram.ui.ActionBar.h6.g0(i10, i12));
                float f12 = 0.0f;
                float f13 = 1.0f;
                if (wiVar.D1 != z10) {
                    wiVar.D1 = z10;
                    ValueAnimator valueAnimator = this.f23039a;
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
                    this.f23039a = duration;
                    duration.addUpdateListener(new k6(this, 9));
                    this.f23039a.addListener(new uh(this, z10, 0));
                    this.f23039a.start();
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
        oi oiVar = this.e.f29726y0;
        ei.q4 q4Var = this.f23040b;
        if (oiVar == q4Var && !q4Var.J.f8533c) {
            q4Var.G();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.f1 f1Var = this.f23040b.L;
        if (f1Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            f1Var.setVisibility(i10);
        }
    }

    @Override
    public final void u(int i10, final int i11, boolean z10) {
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        wi wiVar = this.e;
        final int color = wiVar.F2.f9056a.getColor();
        final ei.c2 c2Var = new ei.c2();
        int i13 = 0;
        if (wiVar.f29648a0) {
            i12 = color;
        } else {
            i12 = 0;
        }
        d6Var = ((org.telegram.ui.ActionBar.f3) wiVar).resourcesProvider;
        c2Var.c(c2Var.f8265a, i12, d6Var);
        wiVar.f29648a0 = z10;
        if (z10) {
            i13 = i11;
        }
        d6Var2 = ((org.telegram.ui.ActionBar.f3) wiVar).resourcesProvider;
        c2Var.c(c2Var.f8266b, i13, d6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(rr.f27701f);
        final ei.q4 q4Var = this.f23040b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i11);
                wi wiVar2 = ci.this.e;
                wiVar2.f29690n2 = d;
                wiVar2.f29686m2 = true;
                y7 y7Var = wiVar2.X0;
                if (y7Var != null) {
                    y7Var.e();
                    y7Var.invalidate();
                }
                wiVar2.F2.a(d);
                jh.f fVar = wiVar2.f29715v1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                q4Var.setCustomActionBarBackground(d);
                wiVar2.f29726y0.invalidate();
                wiVar2.f29702r1.invalidate();
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
            org.telegram.ui.ActionBar.n2 n2Var = wiVar.f29665f0;
            if (n2Var instanceof org.telegram.ui.xn) {
                org.telegram.ui.jk jkVar = ((org.telegram.ui.xn) n2Var).Y;
                jkVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
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
        org.telegram.ui.ry ryVar = new org.telegram.ui.ry(bundle);
        Context context = wiVar.getContext();
        int i10 = wi.O2;
        zc0 zc0Var = new zc0(context);
        ryVar.C2 = new a1.d(this, user, str, zc0Var, 7);
        zc0Var.show();
        zc0Var.c(ryVar);
    }

    @Override
    public final void x(boolean z10) {
        this.f23040b.setAllowSwipes(z10);
    }

    @Override
    public final void y() {
        wi wiVar = this.e;
        if (wiVar.f29726y0 != this.f23040b) {
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
