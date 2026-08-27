package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class nh implements org.telegram.ui.web.f0 {

    public ValueAnimator f30969a;

    public final nh.e4 f30970b;

    public final String f30971c;
    public final long d;

    public final gi f30972e;

    public nh(gi giVar, nh.e4 e4Var, String str, long j10) {
        this.f30972e = giVar;
        this.f30970b = e4Var;
        this.f30971c = str;
        this.d = j10;
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
        gi giVar = this.f30972e;
        MediaDataController mediaDataController = MediaDataController.getInstance(giVar.F1);
        long j10 = this.d;
        return mediaDataController.botInAttachMenu(j10) || MessagesController.getInstance(giVar.F1).whitelistedBots.contains(Long.valueOf(j10));
    }

    @Override
    public final void i(boolean z10) {
        AndroidUtilities.updateImageViewImageAnimated(this.f30972e.T0.getBackButton(), z10 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
    }

    @Override
    public final void j() {
        y();
    }

    @Override
    public final void k(boolean z10) {
        this.f30970b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i10) {
        this.f30970b.setCustomBackground(i10);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        gi giVar = this.f30972e;
        int i10 = giVar.F1;
        org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        nh.e4 e4Var = this.f30970b;
        org.telegram.ui.do0 do0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(giVar.getContext(), 3, null);
            b2Var.q(150L);
            hh.u7.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new a2(b2Var, 1), new org.telegram.ui.df(14, e4Var, str));
            AndroidUtilities.hideKeyboard(e4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            do0Var = new org.telegram.ui.do0(paymentForm, null, str, n2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            do0Var = new org.telegram.ui.do0((TLRPC.PaymentReceipt) tLObject);
        }
        if (do0Var != null) {
            e4Var.G();
            AndroidUtilities.hideKeyboard(e4Var);
            Activity parentActivity = n2Var.getParentActivity();
            int i11 = gi.K2;
            kc0 kc0Var = new kc0(parentActivity);
            kc0Var.show();
            do0Var.V0 = new ag.l0(kc0Var, e4Var, str, 23);
            do0Var.U0 = ((org.telegram.ui.ActionBar.e3) giVar).resourcesProvider;
            kc0Var.c(do0Var);
        }
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
        gi giVar = this.f30972e;
        RadialProgressView radialProgressView = giVar.f28712y1;
        j6 j6Var = giVar.A1;
        yh yhVar = giVar.f28696u0;
        nh.e4 e4Var = this.f30970b;
        if (yhVar == e4Var) {
            if (e4Var.L || this.f30971c != null) {
                j6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j10 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new t5(j10, 1.4f, j6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    j6Var.setText(spannableStringBuilder);
                } else {
                    j6Var.setText(str);
                }
                j6Var.setTextColor(i11);
                j6Var.setEmojiColor(i11);
                boolean z14 = org.telegram.ui.web.z0.I0;
                j6Var.setBackground(org.telegram.ui.ActionBar.g6.g0(i10, i0.b.f(i10) >= 0.30000001192092896d ? 301989888 : 385875967));
                if (giVar.f28715z1 != z10) {
                    giVar.f28715z1 = z10;
                    ValueAnimator valueAnimator = this.f30969a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(250L);
                    this.f30969a = duration;
                    duration.addUpdateListener(new e6(this, 9));
                    this.f30969a.addListener(new eh(this, z10, 0));
                    this.f30969a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (giVar.f28708x1 != z12) {
                    radialProgressView.animate().cancel();
                    if (z12) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    radialProgressView.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.1f).scaleY(z12 ? 1.0f : 0.1f).setDuration(250L).setListener(new eh(this, z12, 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        yh yhVar = this.f30972e.f28696u0;
        nh.e4 e4Var = this.f30970b;
        if (yhVar == e4Var && !e4Var.F.f18646c) {
            e4Var.G();
        }
    }

    @Override
    public final void t(boolean z10) {
        org.telegram.ui.ActionBar.f1 f1Var = this.f30970b.H;
        if (f1Var != null) {
            f1Var.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override
    public final void u(int i10, final int i11, boolean z10) {
        gi giVar = this.f30972e;
        final int color = giVar.B2.f19449a.getColor();
        final nh.v1 v1Var = new nh.v1();
        v1Var.c(v1Var.f19001a, giVar.W ? color : 0, ((org.telegram.ui.ActionBar.e3) giVar).resourcesProvider);
        giVar.W = z10;
        v1Var.c(v1Var.f19002b, z10 ? i11 : 0, ((org.telegram.ui.ActionBar.e3) giVar).resourcesProvider);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(er.f28122f);
        final nh.e4 e4Var = this.f30970b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int iD = i0.b.d(fFloatValue, color, i11);
                gi giVar2 = this.f27756a.f30972e;
                giVar2.f28664j2 = iD;
                giVar2.f28661i2 = true;
                ag.d2 d2Var = giVar2.T0;
                if (d2Var != null) {
                    d2Var.d();
                    d2Var.invalidate();
                }
                giVar2.B2.a(iD);
                sg.f fVar = giVar2.f28687r1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                e4Var.setCustomActionBarBackground(iD);
                giVar2.f28696u0.invalidate();
                giVar2.f28674n1.invalidate();
                v1Var.b(d2Var, fFloatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean zIsEmpty = arrayList.isEmpty();
        gi giVar = this.f30972e;
        if (zIsEmpty) {
            org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
            if (n2Var instanceof org.telegram.ui.rn) {
                ((org.telegram.ui.rn) n2Var).U.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
            }
            giVar.dismiss(true);
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
        org.telegram.ui.gy gyVar = new org.telegram.ui.gy(bundle);
        Context context = giVar.getContext();
        int i10 = gi.K2;
        kc0 kc0Var = new kc0(context);
        gyVar.f38621y2 = new a1.d(this, user, str, kc0Var, 9);
        kc0Var.show();
        kc0Var.c(gyVar);
    }

    @Override
    public final void x(boolean z10) {
        this.f30970b.setAllowSwipes(z10);
    }

    @Override
    public final void y() {
        gi giVar = this.f30972e;
        if (giVar.f28696u0 != this.f30970b) {
            return;
        }
        giVar.setFocusable(false);
        giVar.getWindow().setSoftInputMode(48);
        giVar.dismiss();
        AndroidUtilities.runOnUIThread(new gc(4), 150L);
    }

    @Override
    public final nh.x0 z() {
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
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
