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
public final class ci implements org.telegram.ui.web.h0 {
    public ValueAnimator f25430a;
    public final ei.r4 f25431b;
    public final String f25432c;
    public final long d;
    public final xi f25433e;

    public ci(xi xiVar, ei.r4 r4Var, String str, long j3) {
        this.f25433e = xiVar;
        this.f25431b = r4Var;
        this.f25432c = str;
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
        xi xiVar = this.f25433e;
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
        ImageView backButton = this.f25433e.X0.getBackButton();
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
        this.f25431b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i10) {
        this.f25431b.setCustomBackground(i10);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.d6 d6Var;
        xi xiVar = this.f25433e;
        int i10 = xiVar.J1;
        org.telegram.ui.ActionBar.n2 n2Var = xiVar.f32910f0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ei.r4 r4Var = this.f25431b;
        org.telegram.ui.so0 so0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(xiVar.getContext(), 3, null);
            b2Var.q(150L);
            yh.u5.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new c2(b2Var, 1), new org.telegram.ui.qc(18, r4Var, str));
            AndroidUtilities.hideKeyboard(r4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            so0Var = new org.telegram.ui.so0(paymentForm, null, str, n2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            so0Var = new org.telegram.ui.so0((TLRPC.PaymentReceipt) tLObject);
        }
        if (so0Var != null) {
            r4Var.E();
            AndroidUtilities.hideKeyboard(r4Var);
            Activity parentActivity = n2Var.getParentActivity();
            int i11 = xi.H2;
            md0 md0Var = new md0(parentActivity);
            md0Var.show();
            so0Var.Z0 = new ai.q5(md0Var, r4Var, str, 24);
            d6Var = ((org.telegram.ui.ActionBar.f3) xiVar).resourcesProvider;
            so0Var.Y0 = d6Var;
            md0Var.c(so0Var);
        }
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13) {
        int i12;
        float f7;
        float f10;
        float f11;
        xi xiVar = this.f25433e;
        RadialProgressView radialProgressView = xiVar.C1;
        p6 p6Var = xiVar.E1;
        pi piVar = xiVar.f32971y0;
        ei.r4 r4Var = this.f25431b;
        if (piVar == r4Var) {
            if (r4Var.P || this.f25432c != null) {
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
                if (xiVar.D1 != z10) {
                    xiVar.D1 = z10;
                    ValueAnimator valueAnimator = this.f25430a;
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
                    this.f25430a = duration;
                    duration.addUpdateListener(new k6(this, 9));
                    this.f25430a.addListener(new vh(this, z10, 0));
                    this.f25430a.start();
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
        pi piVar = this.f25433e.f32971y0;
        ei.r4 r4Var = this.f25431b;
        if (piVar == r4Var && !r4Var.J.f9285c) {
            r4Var.E();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.f1 f1Var = this.f25431b.L;
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
        xi xiVar = this.f25433e;
        final int i13 = xiVar.D2.f9858b;
        final ei.d2 d2Var = new ei.d2();
        int i14 = 0;
        if (xiVar.f32892a0) {
            i12 = i13;
        } else {
            i12 = 0;
        }
        d6Var = ((org.telegram.ui.ActionBar.f3) xiVar).resourcesProvider;
        d2Var.c(d2Var.f8997a, i12, d6Var);
        xiVar.f32892a0 = z10;
        if (z10) {
            i14 = i11;
        }
        d6Var2 = ((org.telegram.ui.ActionBar.f3) xiVar).resourcesProvider;
        d2Var.c(d2Var.f8998b, i14, d6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(tr.f31215f);
        final ei.r4 r4Var = this.f25431b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, i13, i11);
                xi xiVar2 = ci.this.f25433e;
                xiVar2.f32935n2 = d;
                xiVar2.f32931m2 = true;
                y7 y7Var = xiVar2.X0;
                if (y7Var != null) {
                    y7Var.e();
                    y7Var.invalidate();
                }
                xiVar2.D2.a(d);
                jh.f fVar = xiVar2.f32960v1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                r4Var.setCustomActionBarBackground(d);
                xiVar2.f32971y0.invalidate();
                xiVar2.f32947r1.invalidate();
                d2Var.b(y7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        xi xiVar = this.f25433e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.n2 n2Var = xiVar.f32910f0;
            if (n2Var instanceof org.telegram.ui.yn) {
                org.telegram.ui.jk jkVar = ((org.telegram.ui.yn) n2Var).W;
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
        org.telegram.ui.uy uyVar = new org.telegram.ui.uy(bundle);
        Context context = xiVar.getContext();
        int i10 = xi.H2;
        md0 md0Var = new md0(context);
        uyVar.C2 = new a1.d(this, user, str, md0Var, 7);
        md0Var.show();
        md0Var.c(uyVar);
    }

    @Override
    public final void x(boolean z10) {
        this.f25431b.setAllowSwipes(z10);
    }

    @Override
    public final void y() {
        xi xiVar = this.f25433e;
        if (xiVar.f32971y0 != this.f25431b) {
            return;
        }
        xiVar.setFocusable(false);
        xiVar.getWindow().setSoftInputMode(48);
        xiVar.dismiss();
        AndroidUtilities.runOnUIThread(new uh(0), 150L);
    }

    @Override
    public final ei.b1 z() {
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
