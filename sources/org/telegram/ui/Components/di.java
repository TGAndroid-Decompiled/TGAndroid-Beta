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
public final class di implements org.telegram.ui.web.g0 {
    public ValueAnimator f23648a;
    public final ei.q4 f23649b;
    public final String f23650c;
    public final long d;
    public final xi e;

    public di(xi xiVar, ei.q4 q4Var, String str, long j3) {
        this.e = xiVar;
        this.f23649b = q4Var;
        this.f23650c = str;
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
        xi xiVar = this.e;
        MediaDataController mediaDataController = MediaDataController.getInstance(xiVar.J1);
        long j3 = this.d;
        if (!mediaDataController.botInAttachMenu(j3) && !MessagesController.getInstance(xiVar.J1).whitelistedBots.contains(Long.valueOf(j3))) {
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
        this.f23649b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i10) {
        this.f23649b.setCustomBackground(i10);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.d6 d6Var;
        xi xiVar = this.e;
        int i10 = xiVar.J1;
        org.telegram.ui.ActionBar.m2 m2Var = xiVar.f30270f0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ei.q4 q4Var = this.f23649b;
        org.telegram.ui.no0 no0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(xiVar.getContext(), 3, null);
            a2Var.q(150L);
            yh.s5.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new c2(a2Var, 1), new org.telegram.ui.oc(18, q4Var, str));
            AndroidUtilities.hideKeyboard(q4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            no0Var = new org.telegram.ui.no0(paymentForm, null, str, m2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            no0Var = new org.telegram.ui.no0((TLRPC.PaymentReceipt) tLObject);
        }
        if (no0Var != null) {
            q4Var.G();
            AndroidUtilities.hideKeyboard(q4Var);
            Activity parentActivity = m2Var.getParentActivity();
            int i11 = xi.O2;
            nd0 nd0Var = new nd0(parentActivity);
            nd0Var.show();
            no0Var.Z0 = new ai.q5(nd0Var, q4Var, str, 24);
            d6Var = ((org.telegram.ui.ActionBar.e3) xiVar).resourcesProvider;
            no0Var.Y0 = d6Var;
            nd0Var.c(no0Var);
        }
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13) {
        int i12;
        float f7;
        float f10;
        float f11;
        xi xiVar = this.e;
        RadialProgressView radialProgressView = xiVar.C1;
        p6 p6Var = xiVar.E1;
        pi piVar = xiVar.f30331y0;
        ei.q4 q4Var = this.f23649b;
        if (piVar == q4Var) {
            if (q4Var.P || this.f23650c != null) {
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
                if (xiVar.D1 != z10) {
                    xiVar.D1 = z10;
                    ValueAnimator valueAnimator = this.f23648a;
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
                    this.f23648a = duration;
                    duration.addUpdateListener(new k6(this, 9));
                    this.f23648a.addListener(new vh(this, z10, 0));
                    this.f23648a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (xiVar.B1 != z12) {
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
                    scaleX.scaleY(f13).setDuration(250L).setListener(new vh(this, z12, 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        pi piVar = this.e.f30331y0;
        ei.q4 q4Var = this.f23649b;
        if (piVar == q4Var && !q4Var.J.f8544c) {
            q4Var.G();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.e1 e1Var = this.f23649b.L;
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
        xi xiVar = this.e;
        final int color = xiVar.F2.f9067a.getColor();
        final ei.c2 c2Var = new ei.c2();
        int i13 = 0;
        if (xiVar.f30253a0) {
            i12 = color;
        } else {
            i12 = 0;
        }
        d6Var = ((org.telegram.ui.ActionBar.e3) xiVar).resourcesProvider;
        c2Var.c(c2Var.f8276a, i12, d6Var);
        xiVar.f30253a0 = z10;
        if (z10) {
            i13 = i11;
        }
        d6Var2 = ((org.telegram.ui.ActionBar.e3) xiVar).resourcesProvider;
        c2Var.c(c2Var.f8277b, i13, d6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(tr.f28636f);
        final ei.q4 q4Var = this.f23649b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i11);
                xi xiVar2 = di.this.e;
                xiVar2.f30295n2 = d;
                xiVar2.f30291m2 = true;
                y7 y7Var = xiVar2.X0;
                if (y7Var != null) {
                    y7Var.e();
                    y7Var.invalidate();
                }
                xiVar2.F2.a(d);
                jh.f fVar = xiVar2.f30320v1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                q4Var.setCustomActionBarBackground(d);
                xiVar2.f30331y0.invalidate();
                xiVar2.f30307r1.invalidate();
                c2Var.b(y7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        xi xiVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.m2 m2Var = xiVar.f30270f0;
            if (m2Var instanceof org.telegram.ui.wn) {
                org.telegram.ui.jk jkVar = ((org.telegram.ui.wn) m2Var).Y;
                jkVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
            }
            xiVar.dismiss(true);
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
        Context context = xiVar.getContext();
        int i10 = xi.O2;
        nd0 nd0Var = new nd0(context);
        qyVar.C2 = new a1.d(this, user, str, nd0Var, 7);
        nd0Var.show();
        nd0Var.c(qyVar);
    }

    @Override
    public final void x(boolean z10) {
        this.f23649b.setAllowSwipes(z10);
    }

    @Override
    public final void y() {
        xi xiVar = this.e;
        if (xiVar.f30331y0 != this.f23649b) {
            return;
        }
        xiVar.setFocusable(false);
        xiVar.getWindow().setSoftInputMode(48);
        xiVar.dismiss();
        AndroidUtilities.runOnUIThread(new uh(0), 150L);
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
