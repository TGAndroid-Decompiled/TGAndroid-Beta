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
public final class ai implements org.telegram.ui.web.h0 {
    public ValueAnimator f24721a;
    public final gi.f4 f24722b;
    public final String f24723c;
    public final long d;
    public final ti e;

    public ai(ti tiVar, gi.f4 f4Var, String str, long j10) {
        this.e = tiVar;
        this.f24722b = f4Var;
        this.f24723c = str;
        this.d = j10;
    }

    @Override
    public final gi.y0 A() {
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
        ImageView backButton = this.e.f30714a1.getBackButton();
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
        this.f24722b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i10) {
        this.f24722b.setCustomBackground(i10);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.g6 g6Var;
        ti tiVar = this.e;
        int i10 = tiVar.M1;
        org.telegram.ui.ActionBar.o2 o2Var = tiVar.f30730f0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        gi.f4 f4Var = this.f24722b;
        org.telegram.ui.io0 io0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(tiVar.getContext(), 3, null);
            c2Var.r(150L);
            ai.ha.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new b2(c2Var, 1), new org.telegram.ui.ActionBar.m3(24, f4Var, str));
            AndroidUtilities.hideKeyboard(f4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            io0Var = new org.telegram.ui.io0(paymentForm, null, str, o2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            io0Var = new org.telegram.ui.io0((TLRPC.PaymentReceipt) tLObject);
        }
        if (io0Var != null) {
            f4Var.J();
            AndroidUtilities.hideKeyboard(f4Var);
            Activity parentActivity = o2Var.getParentActivity();
            int i11 = ti.U2;
            wd0 wd0Var = new wd0(parentActivity);
            wd0Var.show();
            io0Var.Z0 = new ai.u2(wd0Var, f4Var, str, 25);
            g6Var = ((org.telegram.ui.ActionBar.h3) tiVar).resourcesProvider;
            io0Var.Y0 = g6Var;
            wd0Var.c(io0Var);
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
        q6 q6Var = tiVar.H1;
        li liVar = tiVar.B0;
        gi.f4 f4Var = this.f24722b;
        if (liVar == f4Var) {
            if (f4Var.P || this.f24723c != null) {
                q6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j10 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new a6(j10, 1.4f, q6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    q6Var.setText(spannableStringBuilder);
                } else {
                    q6Var.setText(str);
                }
                q6Var.setTextColor(i11);
                q6Var.setEmojiColor(i11);
                boolean z14 = org.telegram.ui.web.b1.Q0;
                if (i0.a.h(i10) >= 0.30000001192092896d) {
                    i12 = 301989888;
                } else {
                    i12 = 385875967;
                }
                q6Var.setBackground(org.telegram.ui.ActionBar.k6.h0(i10, i12));
                float f12 = 0.0f;
                float f13 = 1.0f;
                if (tiVar.G1 != z10) {
                    tiVar.G1 = z10;
                    ValueAnimator valueAnimator = this.f24721a;
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
                    this.f24721a = duration;
                    duration.addUpdateListener(new l6(this, 9));
                    this.f24721a.addListener(new sh(this, z10, 0));
                    this.f24721a.start();
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
        gi.f4 f4Var = this.f24722b;
        if (liVar == f4Var && !f4Var.J.f11206c) {
            f4Var.J();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.e1 e1Var = this.f24722b.L;
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
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        ti tiVar = this.e;
        final int color = tiVar.L2.f11074a.getColor();
        final gi.w1 w1Var = new gi.w1();
        int i13 = 0;
        if (tiVar.f30713a0) {
            i12 = color;
        } else {
            i12 = 0;
        }
        g6Var = ((org.telegram.ui.ActionBar.h3) tiVar).resourcesProvider;
        w1Var.c(w1Var.f11552a, i12, g6Var);
        tiVar.f30713a0 = z10;
        if (z10) {
            i13 = i11;
        }
        g6Var2 = ((org.telegram.ui.ActionBar.h3) tiVar).resourcesProvider;
        w1Var.c(w1Var.f11553b, i13, g6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(bs.f25133f);
        final gi.f4 f4Var = this.f24722b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f7 = i0.a.f(floatValue, color, i11);
                ti tiVar2 = ai.this.e;
                tiVar2.f30764q2 = f7;
                tiVar2.f30761p2 = true;
                z7 z7Var = tiVar2.f30714a1;
                if (z7Var != null) {
                    z7Var.updateColors();
                    z7Var.invalidate();
                }
                tiVar2.L2.a(f7);
                kh.f fVar = tiVar2.f30792y1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                f4Var.setCustomActionBarBackground(f7);
                tiVar2.B0.invalidate();
                tiVar2.f30777u1.invalidate();
                w1Var.b(z7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        ti tiVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.o2 o2Var = tiVar.f30730f0;
            if (o2Var instanceof org.telegram.ui.sn) {
                org.telegram.ui.gk gkVar = ((org.telegram.ui.sn) o2Var).Y;
                gkVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
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
        org.telegram.ui.ey eyVar = new org.telegram.ui.ey(bundle);
        Context context = tiVar.getContext();
        int i10 = ti.U2;
        wd0 wd0Var = new wd0(context);
        eyVar.C2 = new a1.d(this, user, str, wd0Var, 9);
        wd0Var.show();
        wd0Var.c(eyVar);
    }

    @Override
    public final void y(boolean z10) {
        this.f24722b.setAllowSwipes(z10);
    }

    @Override
    public final void z() {
        ti tiVar = this.e;
        if (tiVar.B0 != this.f24722b) {
            return;
        }
        tiVar.setFocusable(false);
        tiVar.getWindow().setSoftInputMode(48);
        tiVar.dismiss();
        AndroidUtilities.runOnUIThread(new rc(5), 150L);
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
