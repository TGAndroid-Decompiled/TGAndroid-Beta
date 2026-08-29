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
public final class uh implements org.telegram.ui.web.f0 {
    public ValueAnimator f33233a;
    public final ph.n3 f33234b;
    public final String f33235c;
    public final long d;
    public final ni f33236e;

    public uh(ni niVar, ph.n3 n3Var, String str, long j10) {
        this.f33236e = niVar;
        this.f33234b = n3Var;
        this.f33235c = str;
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
        ni niVar = this.f33236e;
        MediaDataController mediaDataController = MediaDataController.getInstance(niVar.F1);
        long j10 = this.d;
        if (!mediaDataController.botInAttachMenu(j10) && !MessagesController.getInstance(niVar.F1).whitelistedBots.contains(Long.valueOf(j10))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z10) {
        int i10;
        ImageView backButton = this.f33236e.T0.getBackButton();
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
        this.f33234b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i10) {
        this.f33234b.setCustomBackground(i10);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.c6 c6Var;
        ni niVar = this.f33236e;
        int i10 = niVar.F1;
        org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ph.n3 n3Var = this.f33234b;
        org.telegram.ui.bo0 bo0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(niVar.getContext(), 3, null);
            c2Var.q(150L);
            jh.s7.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new e2(c2Var, 1), new org.telegram.ui.tm(7, n3Var, str));
            AndroidUtilities.hideKeyboard(n3Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            bo0Var = new org.telegram.ui.bo0(paymentForm, null, str, o2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            bo0Var = new org.telegram.ui.bo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (bo0Var != null) {
            n3Var.F();
            AndroidUtilities.hideKeyboard(n3Var);
            Activity parentActivity = o2Var.getParentActivity();
            int i11 = ni.K2;
            vc0 vc0Var = new vc0(parentActivity);
            vc0Var.show();
            bo0Var.V0 = new androidx.car.app.utils.a(vc0Var, n3Var, str, 21);
            c6Var = ((org.telegram.ui.ActionBar.f3) niVar).resourcesProvider;
            bo0Var.U0 = c6Var;
            vc0Var.c(bo0Var);
        }
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
        int i12;
        float f9;
        float f10;
        float f11;
        ni niVar = this.f33236e;
        RadialProgressView radialProgressView = niVar.f31067y1;
        o6 o6Var = niVar.A1;
        fi fiVar = niVar.f31051u0;
        ph.n3 n3Var = this.f33234b;
        if (fiVar == n3Var) {
            if (n3Var.L || this.f33235c != null) {
                o6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j10 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new y5(j10, 1.4f, o6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    o6Var.setText(spannableStringBuilder);
                } else {
                    o6Var.setText(str);
                }
                o6Var.setTextColor(i11);
                o6Var.setEmojiColor(i11);
                boolean z14 = org.telegram.ui.web.z0.I0;
                if (i0.a.f(i10) >= 0.30000001192092896d) {
                    i12 = 301989888;
                } else {
                    i12 = 385875967;
                }
                o6Var.setBackground(org.telegram.ui.ActionBar.g6.g0(i10, i12));
                float f12 = 0.0f;
                float f13 = 1.0f;
                if (niVar.f31070z1 != z10) {
                    niVar.f31070z1 = z10;
                    ValueAnimator valueAnimator = this.f33233a;
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
                    this.f33233a = duration;
                    duration.addUpdateListener(new j6(this, 9));
                    this.f33233a.addListener(new lh(this, z10, 0));
                    this.f33233a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (niVar.f31063x1 != z12) {
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
                        f9 = 1.0f;
                    } else {
                        f9 = 0.1f;
                    }
                    ViewPropertyAnimator scaleX = alpha.scaleX(f9);
                    if (!z12) {
                        f13 = 0.1f;
                    }
                    scaleX.scaleY(f13).setDuration(250L).setListener(new lh(this, z12, 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        fi fiVar = this.f33236e.f31051u0;
        ph.n3 n3Var = this.f33234b;
        if (fiVar == n3Var && !n3Var.F.f45904c) {
            n3Var.F();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.g1 g1Var = this.f33234b.H;
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
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        ni niVar = this.f33236e;
        final int color = niVar.B2.f46667a.getColor();
        final ph.o1 o1Var = new ph.o1();
        int i13 = 0;
        if (niVar.W) {
            i12 = color;
        } else {
            i12 = 0;
        }
        c6Var = ((org.telegram.ui.ActionBar.f3) niVar).resourcesProvider;
        o1Var.c(o1Var.f45928a, i12, c6Var);
        niVar.W = z10;
        if (z10) {
            i13 = i11;
        }
        c6Var2 = ((org.telegram.ui.ActionBar.f3) niVar).resourcesProvider;
        o1Var.c(o1Var.f45929b, i13, c6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(jr.f29800f);
        final ph.n3 n3Var = this.f33234b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i11);
                ni niVar2 = uh.this.f33236e;
                niVar2.f31019j2 = d;
                niVar2.f31016i2 = true;
                cg.m1 m1Var = niVar2.T0;
                if (m1Var != null) {
                    m1Var.e();
                    m1Var.invalidate();
                }
                niVar2.B2.a(d);
                ug.f fVar = niVar2.f31042r1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                n3Var.setCustomActionBarBackground(d);
                niVar2.f31051u0.invalidate();
                niVar2.f31029n1.invalidate();
                o1Var.b(m1Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        ni niVar = this.f33236e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
            if (o2Var instanceof org.telegram.ui.tn) {
                org.telegram.ui.dk dkVar = ((org.telegram.ui.tn) o2Var).U;
                dkVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
            }
            niVar.dismiss(true);
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
        org.telegram.ui.fy fyVar = new org.telegram.ui.fy(bundle);
        Context context = niVar.getContext();
        int i10 = ni.K2;
        vc0 vc0Var = new vc0(context);
        fyVar.f38379y2 = new a1.d(this, user, str, vc0Var, 8);
        vc0Var.show();
        vc0Var.c(fyVar);
    }

    @Override
    public final void x(boolean z10) {
        this.f33234b.setAllowSwipes(z10);
    }

    @Override
    public final void y() {
        ni niVar = this.f33236e;
        if (niVar.f31051u0 != this.f33234b) {
            return;
        }
        niVar.setFocusable(false);
        niVar.getWindow().setSoftInputMode(48);
        niVar.dismiss();
        AndroidUtilities.runOnUIThread(new g5(7), 150L);
    }

    @Override
    public final ph.u0 z() {
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
