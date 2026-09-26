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
    public ValueAnimator f23343a;
    public final ei.q4 f23344b;
    public final String f23345c;
    public final long d;
    public final wi e;

    public ci(wi wiVar, ei.q4 q4Var, String str, long j3) {
        this.e = wiVar;
        this.f23344b = q4Var;
        this.f23345c = str;
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
        this.f23344b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i10) {
        this.f23344b.setCustomBackground(i10);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.d6 d6Var;
        wi wiVar = this.e;
        int i10 = wiVar.J1;
        org.telegram.ui.ActionBar.m2 m2Var = wiVar.f30005f0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ei.q4 q4Var = this.f23344b;
        org.telegram.ui.oo0 oo0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(wiVar.getContext(), 3, null);
            a2Var.q(150L);
            yh.s5.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new c2(a2Var, 1), new org.telegram.ui.oc(18, q4Var, str));
            AndroidUtilities.hideKeyboard(q4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            oo0Var = new org.telegram.ui.oo0(paymentForm, null, str, m2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            oo0Var = new org.telegram.ui.oo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (oo0Var != null) {
            q4Var.G();
            AndroidUtilities.hideKeyboard(q4Var);
            Activity parentActivity = m2Var.getParentActivity();
            int i11 = wi.O2;
            kd0 kd0Var = new kd0(parentActivity);
            kd0Var.show();
            oo0Var.Z0 = new ai.q5(kd0Var, q4Var, str, 24);
            d6Var = ((org.telegram.ui.ActionBar.e3) wiVar).resourcesProvider;
            oo0Var.Y0 = d6Var;
            kd0Var.c(oo0Var);
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
        oi oiVar = wiVar.f30066y0;
        ei.q4 q4Var = this.f23344b;
        if (oiVar == q4Var) {
            if (q4Var.P || this.f23345c != null) {
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
                    ValueAnimator valueAnimator = this.f23343a;
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
                    this.f23343a = duration;
                    duration.addUpdateListener(new k6(this, 9));
                    this.f23343a.addListener(new uh(this, z10, 0));
                    this.f23343a.start();
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
        oi oiVar = this.e.f30066y0;
        ei.q4 q4Var = this.f23344b;
        if (oiVar == q4Var && !q4Var.J.f8532c) {
            q4Var.G();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.e1 e1Var = this.f23344b.L;
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
        wi wiVar = this.e;
        final int color = wiVar.F2.f9055a.getColor();
        final ei.c2 c2Var = new ei.c2();
        int i13 = 0;
        if (wiVar.f29988a0) {
            i12 = color;
        } else {
            i12 = 0;
        }
        d6Var = ((org.telegram.ui.ActionBar.e3) wiVar).resourcesProvider;
        c2Var.c(c2Var.f8264a, i12, d6Var);
        wiVar.f29988a0 = z10;
        if (z10) {
            i13 = i11;
        }
        d6Var2 = ((org.telegram.ui.ActionBar.e3) wiVar).resourcesProvider;
        c2Var.c(c2Var.f8265b, i13, d6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(rr.f28030f);
        final ei.q4 q4Var = this.f23344b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i11);
                wi wiVar2 = ci.this.e;
                wiVar2.f30030n2 = d;
                wiVar2.f30026m2 = true;
                y7 y7Var = wiVar2.X0;
                if (y7Var != null) {
                    y7Var.e();
                    y7Var.invalidate();
                }
                wiVar2.F2.a(d);
                jh.f fVar = wiVar2.f30055v1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                q4Var.setCustomActionBarBackground(d);
                wiVar2.f30066y0.invalidate();
                wiVar2.f30042r1.invalidate();
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
            org.telegram.ui.ActionBar.m2 m2Var = wiVar.f30005f0;
            if (m2Var instanceof org.telegram.ui.wn) {
                org.telegram.ui.jk jkVar = ((org.telegram.ui.wn) m2Var).Y;
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
        org.telegram.ui.qy qyVar = new org.telegram.ui.qy(bundle);
        Context context = wiVar.getContext();
        int i10 = wi.O2;
        kd0 kd0Var = new kd0(context);
        qyVar.C2 = new a1.d(this, user, str, kd0Var, 7);
        kd0Var.show();
        kd0Var.c(qyVar);
    }

    @Override
    public final void x(boolean z10) {
        this.f23344b.setAllowSwipes(z10);
    }

    @Override
    public final void y() {
        wi wiVar = this.e;
        if (wiVar.f30066y0 != this.f23344b) {
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
